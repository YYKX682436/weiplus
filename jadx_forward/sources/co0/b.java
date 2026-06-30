package co0;

/* loaded from: classes3.dex */
public final class b extends co0.s {

    /* renamed from: e2, reason: collision with root package name */
    public static final co0.a f125242e2 = new co0.a(null);

    /* renamed from: f2, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f125243f2 = new java.util.concurrent.ConcurrentHashMap(2);

    /* renamed from: d2, reason: collision with root package name */
    public long f125244d2;

    public b() {
        super(false, 1, null);
    }

    @Override // co0.s
    public void S0(int i17, com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, yz5.l lVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorPlayCore", "cdnStartPlay liveId:" + this.f125244d2 + '(' + this + ")!");
        super.S0(i17, scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, lVar);
    }

    @Override // co0.s
    public void T0(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorPlayCore", "cdnStopPlay liveId:" + this.f125244d2 + '(' + this + ")!");
        super.T0(z17);
    }

    @Override // co0.s
    public boolean Z0() {
        boolean z17 = (c01.z1.i() & 1073741824) == 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreVisitor", "getPlayDesktopSwitch " + z17);
        return (z17 || X()) ? false : true;
    }

    @Override // co0.s
    public void e1(boolean z17) {
        mn0.b0 b0Var = this.R1.f363942a;
        if (b0Var != null) {
            ((mn0.y) b0Var).G(z17);
        }
    }

    @Override // co0.s
    public boolean g1() {
        return false;
    }

    @Override // co0.s, tn0.w0
    public void m0() {
        super.m0();
    }

    @Override // co0.s, com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onPlayEvent */
    public void mo15376x8cd414a7(int i17, android.os.Bundle bundle) {
        java.lang.String str;
        kn0.g gVar;
        if ((i17 == -2304 && this.R1.f363953l > 0) || i17 != -2304) {
            ml2.t5 t5Var = ml2.t5.f409553a;
            long j17 = this.f125244d2;
            kn0.i iVar = this.C;
            if (iVar == null || (gVar = iVar.f391091b) == null || (str = gVar.f391082p) == null) {
                str = "";
            }
            t5Var.f(i17, bundle, j17, str, 1);
        }
        super.mo15376x8cd414a7(i17, bundle);
    }

    /* renamed from: toString */
    public java.lang.String m15377x9616526c() {
        return super.toString() + ",Core liveId:" + this.f125244d2;
    }

    @Override // tn0.w0
    public android.graphics.Point z(android.content.Context context, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        boolean X = X();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorPlayCore", "calcMiniWindowSize isInLinkMic:" + X + ", videoWidth:" + this.U1 + ", videoHeight:" + this.V1);
        if (!X && !Z()) {
            gk2.e eVar = gk2.e.f354004n;
            if (eVar != null) {
                mm2.c1 c1Var = (mm2.c1) eVar.a(mm2.c1.class);
                if (c1Var.f8() && c1Var.M4 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorPlayCore", "calcMiniWindowSize is audio only now. Use mini window size " + c1Var.M4);
                    android.graphics.Point point = c1Var.M4;
                    return point == null ? new android.graphics.Point() : point;
                }
            }
            return ko0.t.f391436a.a(this.U1, this.V1);
        }
        return super.z(context, z17);
    }
}

package mm2;

/* loaded from: classes3.dex */
public final class w6 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f411051f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f411052g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f411051f = new java.util.LinkedList();
    }

    public final java.lang.Object N6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object f17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveToastManagerSlice", "runState isStateDoing: " + this.f411052g);
        boolean z17 = this.f411052g;
        jz5.f0 f0Var = jz5.f0.f384359a;
        return (!z17 && (f17 = p3325xe03a0797.p3326xc267989b.z0.f(new mm2.v6(this, null), interfaceC29045xdcb5ca57)) == pz5.a.f440719d) ? f17 : f0Var;
    }
}

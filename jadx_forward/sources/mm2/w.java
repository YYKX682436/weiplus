package mm2;

/* loaded from: classes3.dex */
public final class w extends mm2.e {

    /* renamed from: u, reason: collision with root package name */
    public static final mm2.g f411028u = new mm2.g(null);

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f411029v = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 f411030f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f411031g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 f411032h;

    /* renamed from: i, reason: collision with root package name */
    public mm2.i f411033i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 f411034m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f411035n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 f411036o;

    /* renamed from: p, reason: collision with root package name */
    public mm2.h f411037p;

    /* renamed from: q, reason: collision with root package name */
    public int f411038q;

    /* renamed from: r, reason: collision with root package name */
    public int f411039r;

    /* renamed from: s, reason: collision with root package name */
    public final mn0.c0 f411040s;

    /* renamed from: t, reason: collision with root package name */
    public final yz5.p f411041t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f411030f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
        this.f411031g = new java.util.concurrent.CopyOnWriteArrayList();
        this.f411032h = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
        this.f411033i = mm2.i.f410659d;
        this.f411034m = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
        this.f411035n = "";
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
        c14227x4262fb44.mo523x53d8522f(mm2.f.f410546d);
        this.f411036o = c14227x4262fb44;
        this.f411040s = new mm2.p(this);
        this.f411041t = new mm2.v(this);
    }

    public static final void N6(mm2.w wVar, java.lang.String str) {
        wVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveAdVideoSlice", "handleOnMiniVideoViewStop liveAdId:" + str);
        ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
        tn0.w0 w0Var = dk2.ef.f314911d;
        co0.s sVar = w0Var instanceof co0.s ? (co0.s) w0Var : null;
        if (sVar != null) {
            sVar.f1(false);
        }
        wVar.f411036o.mo523x53d8522f(mm2.f.f410549g);
        mm2.h hVar = wVar.f411037p;
        java.lang.Object parent = hVar != null ? hVar.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(wVar.f411037p);
        }
        wVar.R6();
    }

    public final boolean O6() {
        if (P6()) {
            return true;
        }
        return ((mm2.f) this.f411036o.mo3195x754a37bb()) == mm2.f.f410549g;
    }

    public final boolean P6() {
        mm2.f fVar = (mm2.f) this.f411036o.mo3195x754a37bb();
        return fVar == mm2.f.f410547e || fVar == mm2.f.f410551i;
    }

    public final void Q6(long j17) {
        this.f411030f.mo7808x76db6cb1(java.lang.Long.valueOf(j17));
        pm0.v.X(new mm2.u(this, j17));
    }

    public final void R6() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopPlayer state:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44 = this.f411036o;
        sb6.append(c14227x4262fb44.mo3195x754a37bb());
        sb6.append(" videoView:");
        sb6.append(this.f411037p);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveAdVideoSlice", sb6.toString());
        if (this.f411037p != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveAdVideoSlice", "stopPlayer videoView release.");
            mm2.h hVar = this.f411037p;
            if (hVar != null) {
                hVar.t();
            }
        }
        c14227x4262fb44.mo523x53d8522f(mm2.f.f410546d);
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        mn0.b0 b0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveAdVideoSlice", "stopPolling");
        ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
        dk2.ef.f314925k.f(16);
        R6();
        ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
        tn0.w0 w0Var = dk2.ef.f314911d;
        co0.s sVar = w0Var instanceof co0.s ? (co0.s) w0Var : null;
        if (sVar != null && (b0Var = sVar.R1.f363942a) != null) {
            ((mn0.y) b0Var).x(this.f411040s);
        }
        mm2.h hVar = this.f411037p;
        if (hVar != null) {
            hVar.t();
            hVar.m66744x2a55bdd7().mo162427x41012807();
        }
        this.f411037p = null;
    }
}

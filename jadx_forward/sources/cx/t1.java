package cx;

@j95.b
/* loaded from: classes7.dex */
public final class t1 extends cx.j1 implements bx.v {

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f306001q = "MagicBrandService";

    @Override // cx.j1, bx.t
    public synchronized void K6(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrandServiceFeatureService", "destroyBrandServiceBiz");
        super.K6(i17);
    }

    @Override // cx.j1
    public synchronized cx.w0 Ni(int i17) {
        cx.p1 p1Var;
        ax.b Bi = ((cx.a2) ((bx.w) i95.n0.c(bx.w.class))).Bi();
        p1Var = new cx.p1(Bi);
        p1Var.B = new cx.r1(this);
        p1Var.f364535q = Bi;
        p1Var.X0();
        ((ku5.t0) ku5.t0.f394148d).q(new cx.h1(i17));
        return p1Var;
    }

    @Override // cx.j1
    public java.lang.String Ri() {
        return "MagicBrandServiceFeatureService";
    }

    @Override // cx.j1
    public java.lang.String Vi() {
        return this.f306001q;
    }

    @Override // cx.j1
    public dq0.a0 Zi() {
        return ((cx.a2) ((bx.w) i95.n0.c(bx.w.class))).Bi();
    }

    @Override // cx.j1
    public int aj() {
        return 2;
    }

    @Override // cx.j1
    public boolean fj() {
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_magic_brandservice, 1) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrandServiceFeatureService", "openBrandServiceCard " + z17);
        return z17;
    }

    @Override // cx.j1
    public void hj(long j17, java.lang.String frameSetName, java.lang.String frameSetData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetData, "frameSetData");
        if (!bj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicAdBrandServiceFeatureService", "notifyFrameSetInfo not open!");
            return;
        }
        if (frameSetName.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrandServiceFeatureService", "notifyFrameSetInfo frameSetName null");
            ((je3.i) i95.n0.c(je3.i.class)).Sc("MagicBrandServiceFrameSetNameEmpty", 1, null, 1.0f);
            return;
        }
        if (frameSetData.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrandServiceFeatureService", "notifyFrameSetInfo frameSetData null");
            ((je3.i) i95.n0.c(je3.i.class)).Sc("MagicBrandServiceFrameSetDataEmpty", 1, null, 1.0f);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrandServiceFeatureService", "notifyFrameSetInfo frameSetName:" + frameSetName + " frameSetData len:" + frameSetData.length());
        pm0.v.X(new cx.s1(this));
        super.hj(j17, frameSetName, frameSetData);
    }

    @Override // cx.j1
    public void ij(java.lang.String eventName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventName, "eventName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrandServiceFeatureService", "notifyStateChange eventName:".concat(eventName));
        super.ij(eventName);
    }

    @Override // cx.j1
    public void mj() {
        synchronized (this) {
        }
        ((cx.a2) ((bx.w) i95.n0.c(bx.w.class))).Bi().n("notifyBizRecreate", null, dq0.u.f323871d);
    }

    @Override // cx.j1
    public boolean oj() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_magic_brandservice_preinit_num, 1) == 1;
    }

    @Override // cx.j1, i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrandServiceFeatureService", "onAccountReleased");
        super.mo836xb8969aab(context);
    }
}

package cx;

@j95.b
/* loaded from: classes7.dex */
public final class f0 extends cx.j1 implements bx.r {

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f305933q = "MagicAdBrandService";

    @Override // cx.j1, bx.t
    public synchronized void K6(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdBrandServiceFeatureService", "destroyAdBrandServiceBiz");
        super.K6(i17);
    }

    @Override // cx.j1
    public synchronized cx.w0 Ni(int i17) {
        cx.x xVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdBrandServiceFeatureService", "createAdBrandServiceBiz");
        ax.a Ai = ((cx.a2) ((bx.w) i95.n0.c(bx.w.class))).Ai();
        xVar = new cx.x(Ai);
        xVar.B = new cx.z(this);
        xVar.f364535q = Ai;
        xVar.X0();
        ((ku5.t0) ku5.t0.f394148d).q(new cx.h1(i17));
        return xVar;
    }

    @Override // cx.j1
    public java.lang.String Ri() {
        return "MagicAdBrandServiceFeatureService";
    }

    @Override // cx.j1
    public java.lang.String Vi() {
        return this.f305933q;
    }

    @Override // cx.j1
    public dq0.a0 Zi() {
        return ((cx.a2) ((bx.w) i95.n0.c(bx.w.class))).Ai();
    }

    @Override // cx.j1
    public int aj() {
        return 1;
    }

    @Override // cx.j1
    public boolean fj() {
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_magic_adbrandservice, 1) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdBrandServiceFeatureService", "openAdBrandServiceCard " + z17);
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
            ((je3.i) i95.n0.c(je3.i.class)).Sc("MagicAdBrandServiceFrameSetNameEmpty", 1, null, 1.0f);
            return;
        }
        if (frameSetData.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrandServiceFeatureService", "notifyFrameSetInfo frameSetData null");
            ((je3.i) i95.n0.c(je3.i.class)).Sc("MagicAdBrandServiceFrameSetDataEmpty", 1, null, 1.0f);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdBrandServiceFeatureService", "notifyFrameSetInfo frameSetName:" + frameSetName + " frameSetDataLen:" + frameSetData.length() + " inBox:" + com.p314xaae8f345.mm.p2621x8fb0427b.c2.f275338c);
        if (!bj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicAdBrandServiceFeatureService", "notifyFrameSetInfo not open!");
            return;
        }
        pm0.v.X(new cx.b0(this, frameSetName));
        mq0.d1 d1Var = mq0.d1.f412079a;
        boolean z17 = com.p314xaae8f345.mm.p2621x8fb0427b.c2.f275338c;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBrandReporter", "markCardReceive " + frameSetName + ' ' + currentTimeMillis + ' ' + z17);
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) mq0.d1.f412082d).mo141623x754a37bb()).putLong(frameSetName, currentTimeMillis);
        if (z17) {
            mq0.d1.f412083e.add(frameSetName);
        }
        super.hj(j17, frameSetName, frameSetData);
    }

    @Override // cx.j1
    public void ij(java.lang.String eventName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventName, "eventName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdBrandServiceFeatureService", "notifyStateChange eventName:".concat(eventName));
        super.ij(eventName);
        ((ku5.t0) ku5.t0.f394148d).q(new cx.d0(eventName, this));
    }

    @Override // cx.j1
    public void mj() {
        synchronized (this) {
        }
        ((cx.a2) ((bx.w) i95.n0.c(bx.w.class))).Ai().n("notifyBizRecreate", null, dq0.u.f323871d);
    }

    @Override // cx.j1
    public boolean oj() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_magicad_brandservice_preinit_num, 1) == 1;
    }

    @Override // cx.j1, i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdBrandServiceFeatureService", "onAccountReleased");
        super.mo836xb8969aab(context);
    }

    public void qj(int i17, java.lang.String adInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adInfo, "adInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdBrandServiceFeatureService", "notifyAdServerInfoEvent feedsType:" + i17 + " adInfo:" + adInfo);
        if (bj()) {
            pm0.v.X(new cx.a0(this, i17, adInfo));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicAdBrandServiceFeatureService", "notifyAdServerInfoEvent not open!");
        }
    }

    public void rj(long j17, int i17, bx.x event, yw.s2 resortStartInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resortStartInfo, "resortStartInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdBrandServiceFeatureService", "notifyResortStatus taskId: " + j17 + ", event: " + event);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_open_udr_ad_onnx, 0) == 1) {
            pm0.v.X(new cx.c0(event, this, resortStartInfo, i17));
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).q(new cx.e0(event, this));
    }
}

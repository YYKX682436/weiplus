package tl4;

/* loaded from: classes11.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl4.l f501849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.jq0 f501850e;

    public j(tl4.l lVar, bw5.jq0 jq0Var) {
        this.f501849d = lVar;
        this.f501850e = jq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qk.b9 b9Var = (qk.b9) i95.n0.c(qk.b9.class);
        tl4.l lVar = this.f501849d;
        com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 c26845xac206036 = lVar.f501854e;
        bw5.eq0 appId = lVar.f501853d;
        ef0.q3 q3Var = (ef0.q3) b9Var;
        q3Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        bw5.jq0 playingInfo = this.f501850e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playingInfo, "playingInfo");
        java.util.Iterator it = q3Var.f333839d.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4.ServiceC18717xf3b2cd83) ((rl4.b) it.next())).i(c26845xac206036, appId, playingInfo);
        }
    }
}

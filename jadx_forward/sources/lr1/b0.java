package lr1;

/* loaded from: classes8.dex */
public final class b0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.fj f402174a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f402175b;

    public b0(r45.fj fjVar, int i17) {
        this.f402174a = fjVar;
        this.f402175b = i17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        lr1.c0 c0Var = lr1.c0.f402176a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPDataLogic", "getAppMsgRelatedInfo errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
        java.util.LinkedList UrlInfo = this.f402174a.f455924d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UrlInfo, "UrlInfo");
        java.util.Iterator it = UrlInfo.iterator();
        while (it.hasNext()) {
            lr1.c0.f402177b.remove(((r45.u9) it.next()).f468679d);
        }
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizAppMsgRelatedInfoResp");
            r45.gj gjVar = (r45.gj) fVar;
            lr1.c0 c0Var2 = lr1.c0.f402176a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MicroMsg.MPDataLogic");
            M.A("BizAppMsgRelatedInfoRefreshIntervalSec", gjVar.f456824e);
            int i19 = qs1.n.f447788b;
            M.A("BizAppMsgRelatedInfoMaxUrlCount", gjVar.f456825f);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(gjVar.f456823d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MPDataLogic", "getAppMsgRelatedInfo RelatedInfo is empty");
                return;
            }
            ((ku5.t0) ku5.t0.f394148d).h(new lr1.a0(gjVar, this.f402174a, this.f402175b), "getAppMsgRelatedInfo");
        }
    }
}

package vv1;

/* loaded from: classes9.dex */
public class g implements lo.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vv1.h f521946a;

    public g(vv1.h hVar) {
        this.f521946a = hVar;
    }

    public void a(int i17, java.lang.String str) {
        qb5.d dVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgFileWorker_File", "InitAttachInfoCallback errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), str);
        vv1.h hVar = this.f521946a;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgFileWorker_File", "init %s fail", hVar.f521938d);
            hVar.a();
            return;
        }
        lo.o oVar = (lo.o) i95.n0.c(lo.o.class);
        java.lang.String str2 = hVar.f521949o;
        long j17 = hVar.f521948n;
        java.lang.String Q0 = hVar.f521947m.Q0();
        ((qb5.g) oVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d g17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.g(str2, j17, Q0);
        ((qb5.g) ((lo.o) i95.n0.c(lo.o.class))).getClass();
        if (g17 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFileSendStatus: isSend = false, stack = ");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilePreviewUtil", sb6.toString());
            g17.f68112x10a0fed7 = 101;
            g17.f68103x4a777c2 = c01.id.e();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9952xce0038c9(g17, new java.lang.String[0]);
        }
        lo.o oVar2 = (lo.o) i95.n0.c(lo.o.class);
        long j18 = hVar.f521948n;
        java.lang.String Q02 = hVar.f521947m.Q0();
        java.lang.String str3 = hVar.f521949o;
        vv1.f fVar = new vv1.f(this, g17);
        qb5.g gVar = (qb5.g) oVar2;
        gVar.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChooseMsgFileCompat", "downloadAppAttachDirect() mediaId is null, return");
            dVar = null;
        } else {
            c01.d9.e().a(com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50628x98affc23, new qb5.b(gVar, str3, fVar, j18, Q02));
            bt3.l0 l0Var = new bt3.l0(j18, Q02, str3, new qb5.c(gVar, fVar));
            c01.d9.e().g(l0Var);
            dVar = new qb5.d(gVar, l0Var);
        }
        hVar.f521950p = dVar;
    }
}

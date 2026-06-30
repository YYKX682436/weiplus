package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class qp implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.sp f286920d;

    public qp(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.sp spVar) {
        this.f286920d = spVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        m1Var.mo808xfb85f7b0();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.sp spVar = this.f286920d;
        if (i17 == 0 && i18 == 0) {
            java.lang.String j17 = spVar.f287070d.f287159d.j();
            if ((j17 != null ? ot0.q.v(j17) : null) != null) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d J0 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().J0(spVar.f287070d.f287159d.m124847x74d37ac6(), spVar.f287070d.f287159d.Q0());
                if (J0 != null) {
                    boolean h17 = com.p314xaae8f345.mm.vfs.w6.h(J0.f68099xfeae815);
                    boolean mo9951xb06685ab = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9951xb06685ab(J0, "msgInfoId");
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(h17);
                    java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(mo9951xb06685ab);
                    java.lang.Long valueOf3 = java.lang.Long.valueOf(J0.f68106x315a5445);
                    java.lang.String str2 = J0.f68105x2c1f0acb;
                    java.lang.String str3 = J0.f68099xfeae815;
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgLogic", "summerapp deleteAttachInfoAndFile deleteFile[%b] deleteInfo[%b] msgInfoId[%d] mediaSvrId[%s] path[%s] stack[%s]", valueOf, valueOf2, valueOf3, str2, str3, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
                }
            }
            c01.w9.f(spVar.f287070d.f287159d.m124847x74d37ac6(), spVar.f287070d.f287159d.Q0());
            dp.a.m125854x26a183b(spVar.f287070d.f287161f.f287256s.g(), spVar.f287070d.f287161f.f287256s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3f), 0).show();
        }
        c01.d9.e().q(331, spVar.f287070d.f287161f.f287257t);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.up upVar = spVar.f287070d.f287161f;
        upVar.f287257t = null;
        android.app.ProgressDialog progressDialog = upVar.f287258u;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}

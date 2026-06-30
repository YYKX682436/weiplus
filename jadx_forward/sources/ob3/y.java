package ob3;

/* loaded from: classes9.dex */
public class y implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ob3.a0 f425625a;

    public y(ob3.a0 a0Var) {
        this.f425625a = a0Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        ob3.a0 a0Var = this.f425625a;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.qr5 qr5Var = (r45.qr5) fVar.f152151d;
            a0Var.f425578f = qr5Var;
            if (qr5Var != null) {
                if (qr5Var.f465762h != 0 || qr5Var.f465758d.equalsIgnoreCase("")) {
                    r45.qr5 qr5Var2 = a0Var.f425578f;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "CgiRequestWxaHB fail.  sendid = [%s] reqkey = [%s] wxahb_status = [%d]", qr5Var2.f465759e, qr5Var2.f465758d, java.lang.Integer.valueOf(qr5Var2.f465762h));
                    a0Var.a(new android.content.Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{service error Request errStatus = " + a0Var.f425578f.f465762h + ",errMsg" + a0Var.f425578f.f465763i + "}}"));
                    return null;
                }
                r45.qr5 qr5Var3 = (r45.qr5) fVar.f152151d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "CgiRequestWxaHB succeed sendid = [%s] reqkey = [%s]", qr5Var3.f465759e, qr5Var3.f465758d);
                java.lang.String str = a0Var.f425578f.f465758d;
                ob3.c cVar = a0Var.f425576d;
                if (cVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "doWalletPay() called with: ui == null");
                    return null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1823xed060d07.ActivityC16326x540b7c63 activityC16326x540b7c63 = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1823xed060d07.ActivityC16326x540b7c63) cVar;
                activityC16326x540b7c63.m78545xde66c1f2(a0Var);
                com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56();
                c19760x34448d56.f273647m = str;
                c19760x34448d56.f273642e = 37;
                c19760x34448d56.f273644g = 50;
                h45.a0.f(activityC16326x540b7c63, c19760x34448d56, a0Var.f425580h);
                return null;
            }
            a0Var.a(new android.content.Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{service error Request resp is nil}}"));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "CgiRequestWxaHB fail. [%d, %d, %s]", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b), fVar.f152150c);
        a0Var.a(new android.content.Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{service error Request errType = " + fVar.f152148a + ",errCode" + fVar.f152149b + "}}"));
        return null;
    }
}

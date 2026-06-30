package pb3;

/* loaded from: classes9.dex */
public class h implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pb3.k f434710a;

    public h(pb3.k kVar) {
        this.f434710a = kVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        pb3.k kVar = this.f434710a;
        if (i17 == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "CgiOpenWxaHB success");
            r45.b25 b25Var = (r45.b25) fVar.f152151d;
            int i18 = b25Var.f451998d;
            if (i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaReceiveLuckyMoneyLogic", "CgiOpenWxaHB error wxahb_status = [%d] errorwording = [%s]", java.lang.Integer.valueOf(i18), ((r45.b25) fVar.f152151d).f452017z);
                int i19 = ((r45.b25) fVar.f152151d).f451998d;
                kVar.getClass();
                if (i19 == 1) {
                    kVar.a(new android.content.Intent().putExtra("result_error_code", 20001).putExtra("result_error_msg", "fail:the red packet is expired"));
                } else if (i19 == 2) {
                    kVar.a(new android.content.Intent().putExtra("result_error_code", 20002).putExtra("result_error_msg", "fail:the red packet has been received completly"));
                } else if (i19 != 3) {
                    kVar.a(new android.content.Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{unknow open retun errCode:" + i19 + "}"));
                } else {
                    kVar.a(new android.content.Intent().putExtra("result_error_code", 20003).putExtra("result_error_msg", "fail:risk control"));
                }
            } else {
                pb3.b bVar = kVar.f434713a;
                if (bVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "WxaGetLuckyMoneyLogic.CgiOpenWxaHB end. ui == null");
                } else {
                    kVar.f434717e = b25Var;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1824x408272e3.ActivityC16327xba05db3f activityC16327xba05db3f = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1824x408272e3.ActivityC16327xba05db3f) bVar;
                    activityC16327xba05db3f.f226587r.setVisibility(0);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.H(activityC16327xba05db3f.f226588s);
                    r45.lj5 lj5Var = kVar.f434717e.f452016y;
                    if (lj5Var != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c1 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1();
                        kVar.f434718f = c19088xa4b300c1;
                        java.lang.String valueOf = java.lang.String.valueOf(lj5Var.f461056d);
                        r45.lj5 lj5Var2 = kVar.f434717e.f452016y;
                        c19088xa4b300c1.d(valueOf, lj5Var2.f461057e, lj5Var2.f461058f, lj5Var2.f461059g, lj5Var2.f461060h, 1003);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c12 = kVar.f434718f;
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putString("realname_verify_process_jump_activity", ".appbrand.ui.receive.WxaLuckyMoneyReceiveUI");
                        bundle.putString("realname_verify_process_jump_plugin", "luckymoney");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1824x408272e3.ActivityC16327xba05db3f activityC16327xba05db3f2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1824x408272e3.ActivityC16327xba05db3f) kVar.f434713a;
                        activityC16327xba05db3f2.getClass();
                        if (!c19088xa4b300c12.a(activityC16327xba05db3f2, bundle, new pb3.j(kVar), null)) {
                            kVar.a(new android.content.Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{launch realname fail}}"));
                        }
                    } else {
                        kVar.b();
                    }
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaReceiveLuckyMoneyLogic", "CgiOpenWxaHB failed [%d, %d, %s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(fVar.f152149b), fVar.f152150c);
            kVar.a(new android.content.Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{service error open errType = " + fVar.f152148a + ",errCode" + fVar.f152149b + "}}"));
        }
        return null;
    }
}

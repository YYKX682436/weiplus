package pb3;

/* loaded from: classes9.dex */
public class g implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pb3.k f434709a;

    public g(pb3.k kVar) {
        this.f434709a = kVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        pb3.k kVar = this.f434709a;
        if (i17 == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "CgiReceiveWxaHB succeed, wxahb_status = [%d],receive_status = [%d],sendId = [%s]", java.lang.Integer.valueOf(((r45.kk5) fVar.f152151d).f460314d), java.lang.Integer.valueOf(((r45.kk5) fVar.f152151d).f460320m), kVar.f434715c);
            r45.kk5 kk5Var = (r45.kk5) fVar.f152151d;
            if (kk5Var.f460314d != 1 && (gVar = kk5Var.f460318h) != null) {
                kVar.f434716d = gVar.g();
            }
            r45.kk5 kk5Var2 = (r45.kk5) fVar.f152151d;
            int i18 = kk5Var2.f460314d;
            kVar.f434719g = i18;
            pb3.b bVar = kVar.f434713a;
            if (bVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "CgiReceiveWxaHB succeed but ui == null");
            } else {
                int i19 = kk5Var2.f460321n;
                if ((i19 == 1 && kk5Var2.f460322o == 0) || kk5Var2.f460320m == 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "onLuckyMoneyReceived shouldSkipToDetailUI");
                    kVar.b();
                } else if (i18 == 1) {
                    java.lang.String str = kk5Var2.f460316f;
                    java.lang.String str2 = kk5Var2.f460317g;
                    java.lang.String str3 = kk5Var2.f460324q;
                    boolean z17 = i19 == 1;
                    boolean z18 = kk5Var2.f460322o == 1;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1824x408272e3.ActivityC16327xba05db3f activityC16327xba05db3f = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1824x408272e3.ActivityC16327xba05db3f) bVar;
                    activityC16327xba05db3f.f226580h = i18;
                    activityC16327xba05db3f.f226581i = 1;
                    activityC16327xba05db3f.a7();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.b(activityC16327xba05db3f.f226583n, str2, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(activityC16327xba05db3f.mo55332x76847179(), activityC16327xba05db3f.f226584o, str);
                    activityC16327xba05db3f.Z6(null, str3);
                    activityC16327xba05db3f.f226587r.setOnClickListener(null);
                    activityC16327xba05db3f.f226587r.setVisibility(8);
                    activityC16327xba05db3f.f226588s.setVisibility(8);
                    activityC16327xba05db3f.X6(z17, z18);
                    activityC16327xba05db3f.Y6();
                } else if (i18 == 0) {
                    java.lang.String str4 = kk5Var2.f460316f;
                    java.lang.String str5 = kk5Var2.f460317g;
                    java.lang.String str6 = kk5Var2.f460323p;
                    java.lang.String str7 = kk5Var2.f460315e;
                    boolean z19 = i19 == 1;
                    boolean z27 = kk5Var2.f460322o == 1;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1824x408272e3.ActivityC16327xba05db3f activityC16327xba05db3f2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1824x408272e3.ActivityC16327xba05db3f) bVar;
                    activityC16327xba05db3f2.a7();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.b(activityC16327xba05db3f2.f226583n, str5, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(activityC16327xba05db3f2.mo55332x76847179(), activityC16327xba05db3f2.f226584o, str4);
                    activityC16327xba05db3f2.Z6(str6, str7);
                    activityC16327xba05db3f2.f226587r.setOnClickListener(new pb3.c(activityC16327xba05db3f2));
                    activityC16327xba05db3f2.f226587r.setVisibility(0);
                    activityC16327xba05db3f2.X6(z19, z27);
                    activityC16327xba05db3f2.Y6();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "back.resp.wxahb_status is invalid.resp. wxahb_status = [%d] receive_status = [%d] hb_type = [%d]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(kk5Var2.f460320m), java.lang.Integer.valueOf(kk5Var2.f460322o));
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaReceiveLuckyMoneyLogic", "CgiReceiveWxaHB failed [%d, %d, %s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(fVar.f152149b), fVar.f152150c);
            kVar.a(new android.content.Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{service error Receive errType = " + fVar.f152148a + ",errCode" + fVar.f152149b + "}}"));
        }
        return null;
    }
}

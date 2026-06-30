package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class vf implements zs4.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.l6 f229079a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16380x9ede44e f229080b;

    public vf(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16380x9ede44e activityC16380x9ede44e, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.l6 l6Var) {
        this.f229080b = activityC16380x9ede44e;
        this.f229079a = l6Var;
    }

    @Override // zs4.p
    public boolean run(int i17, int i18, java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "showDisclaimerDialog resultCode=" + i17 + ";errCode=" + i18 + ";errMsg=" + str + ";hadAgree = " + z17);
        if (i17 == 1) {
            this.f229080b.finish();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.l6 l6Var = this.f229079a;
            if (i17 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16380x9ede44e activityC16380x9ede44e = this.f229080b;
                int i19 = l6Var.f226951h;
                int i27 = l6Var.f226952i;
                java.lang.String str2 = l6Var.f226953m;
                java.lang.String str3 = l6Var.f226954n;
                java.lang.String str4 = l6Var.P;
                int i28 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16380x9ede44e.Y1;
                activityC16380x9ede44e.Y6(i19, i27, str2, str3, str4);
            } else if (i17 == 0 && z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16380x9ede44e activityC16380x9ede44e2 = this.f229080b;
                int i29 = l6Var.f226951h;
                int i37 = l6Var.f226952i;
                java.lang.String str5 = l6Var.f226953m;
                java.lang.String str6 = l6Var.f226954n;
                java.lang.String str7 = l6Var.P;
                int i38 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16380x9ede44e.Y1;
                activityC16380x9ede44e2.Y6(i29, i37, str5, str6, str7);
            }
        }
        return true;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class o6 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f228795a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p6 f228796b;

    public o6(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p6 p6Var, int i17) {
        this.f228796b = p6Var;
        this.f228795a = i17;
    }

    @Override // db5.c1
    public void e(int i17) {
        if (i17 != 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p6 p6Var = this.f228796b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o4 item = p6Var.f228840d.f227699v.getItem(this.f228795a);
        if (item != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16370x5a91dd69 activityC16370x5a91dd69 = p6Var.f228840d;
            int i18 = this.f228795a;
            activityC16370x5a91dd69.D = i18;
            activityC16370x5a91dd69.getClass();
            if (i18 < 0 || i18 > activityC16370x5a91dd69.f227699v.getCount()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyMyRecordUI", "param is illegal");
            } else {
                activityC16370x5a91dd69.m66164x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.b6(item.f227042t, item.f227041s, activityC16370x5a91dd69.f227687g, i18, "v1.0"));
            }
        }
    }
}

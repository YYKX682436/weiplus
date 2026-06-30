package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class t extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 f228969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f228970e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16359x81eae2a6 f228971f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16359x81eae2a6 activityC16359x81eae2a6, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 e1Var, android.content.Context context) {
        super(false);
        this.f228971f = activityC16359x81eae2a6;
        this.f228969d = e1Var;
        this.f228970e = context;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 e1Var = this.f228969d;
        boolean isEmpty = android.text.TextUtils.isEmpty(e1Var.N);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16359x81eae2a6 activityC16359x81eae2a6 = this.f228971f;
        if (isEmpty) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(12, 1);
            h45.a0.b(activityC16359x81eae2a6.mo55332x76847179(), 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyBusiDetailUI", "detail.changeUrl is empty");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiDetailUI", "detail.changeUrl:" + e1Var.N);
        if (e1Var.N.startsWith("weixin://wxpay")) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(12, 1);
            h45.a0.b(activityC16359x81eae2a6.mo55332x76847179(), 1);
        } else {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(7, 1);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(this.f228970e, e1Var.N, true);
        }
    }
}

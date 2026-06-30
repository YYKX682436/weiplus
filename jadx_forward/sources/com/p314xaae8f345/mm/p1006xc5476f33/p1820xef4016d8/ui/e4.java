package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class e4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.f4 f228394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228395e;

    public e4(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.f4 f4Var, java.lang.String str) {
        this.f228394d = f4Var;
        this.f228395e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUINewYearUIC$renderSendButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.f4 f4Var = this.f228394d;
        f4Var.getClass();
        java.lang.String str = this.f228395e;
        if (!(str == null || str.length() == 0)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_session_id", java.util.UUID.randomUUID().toString());
            intent.putExtra("key_username", str);
            intent.putExtra("key_chatroom_num", ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str));
            intent.putExtra("key_way", 1);
            intent.putExtra("key_type", 1);
            intent.putExtra("key_from", 1);
            intent.putExtra("pay_channel", 14);
            ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).bj();
            j45.l.j(f4Var.m80379x76847179(), "luckymoney", ".ui.LuckyMoneyNewPrepareUI", intent, null);
        }
        gb3.o.f351568a.a(9);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUINewYearUIC$renderSendButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

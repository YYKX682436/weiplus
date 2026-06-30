package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class ga implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ha f228470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228471e;

    public ga(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ha haVar, java.lang.String str) {
        this.f228470d = haVar;
        this.f228471e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUINewYearUIC$renderSendButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ha haVar = this.f228470d;
        haVar.getClass();
        java.lang.String str = this.f228471e;
        if (!(str == null || str.length() == 0)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_session_id", java.util.UUID.randomUUID().toString());
            intent.putExtra("key_username", str);
            intent.putExtra("key_chatroom_num", ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str));
            intent.putExtra("key_way", 1);
            intent.putExtra("key_type", 1);
            intent.putExtra("key_from", 1);
            intent.putExtra("pay_channel", 14);
            j45.l.j(haVar.m80379x76847179(), "luckymoney", ".ui.LuckyMoneyNewPrepareUI", intent, null);
        }
        gb3.o.f351568a.a(9);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUINewYearUIC$renderSendButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

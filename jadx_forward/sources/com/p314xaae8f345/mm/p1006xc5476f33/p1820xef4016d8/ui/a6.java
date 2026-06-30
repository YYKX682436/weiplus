package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes.dex */
public class a6 implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.b6 f228227a;

    public a6(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.b6 b6Var) {
        this.f228227a = b6Var;
    }

    @Override // db5.d1
    public void a(int i17, int i18) {
        int i19 = 1;
        if (i18 != 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11701, 3, 0, 0, 0, 5);
            i19 = 2;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11701, 3, 0, 0, 0, 6);
        }
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.b6 b6Var = this.f228227a;
        intent.setClass(b6Var.f228272d.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16370x5a91dd69.class);
        intent.putExtra("key_username", b6Var.f228272d.getIntent().getStringExtra("key_username"));
        intent.putExtra("key_type", i19);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16368x343578ee activityC16368x343578ee = b6Var.f228272d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC16368x343578ee, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyIndexUI$4$1", "onClick", "(II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16368x343578ee.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC16368x343578ee, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyIndexUI$4$1", "onClick", "(II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}

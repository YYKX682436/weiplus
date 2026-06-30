package com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b;

/* loaded from: classes.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.r0 f290862d;

    public h0(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.r0 r0Var, wi5.n0 n0Var) {
        this.f290862d = r0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/mvvm/uic/conversation/recent/RecentConversationMultiSelectTopMenuUIC$onCreate$1$10$1$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.r0 r0Var = this.f290862d;
        r0Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KSelectUserList", "notify@all");
        r0Var.m158354x19263085().setResult(-1, intent);
        r0Var.m158354x19263085().finish();
        yj0.a.h(this, "com/tencent/mm/ui/mvvm/uic/conversation/recent/RecentConversationMultiSelectTopMenuUIC$onCreate$1$10$1$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

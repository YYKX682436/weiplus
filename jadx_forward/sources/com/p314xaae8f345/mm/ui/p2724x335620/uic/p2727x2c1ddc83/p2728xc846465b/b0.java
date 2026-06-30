package com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b;

/* loaded from: classes.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e0 f290800d;

    public b0(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e0 e0Var) {
        this.f290800d = e0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/mvvm/uic/conversation/recent/RecentConversationHeaderUIC$updateView$1$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e0 e0Var = this.f290800d;
        switch (e0Var.f290840m) {
            case 1:
                j75.f Q6 = e0Var.Q6();
                if (Q6 != null) {
                    Q6.B3(new xi5.e(1));
                    break;
                }
                break;
            case 2:
                j75.f Q62 = e0Var.Q6();
                if (Q62 != null) {
                    Q62.B3(new xi5.e(2));
                    break;
                }
                break;
            case 3:
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) e0Var.m80379x76847179(), 1, false);
                k0Var.f293405n = new com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.x(e0Var);
                k0Var.f293414s = new com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.y(e0Var);
                k0Var.v();
                break;
            case 4:
                j75.f Q63 = e0Var.Q6();
                if (Q63 != null) {
                    Q63.B3(new xi5.f());
                    break;
                }
                break;
            case 5:
                j75.f Q64 = e0Var.Q6();
                if (Q64 != null) {
                    Q64.B3(new xi5.d());
                    break;
                }
                break;
            case 6:
                j75.f Q65 = e0Var.Q6();
                if (Q65 != null) {
                    Q65.B3(new xi5.c());
                    break;
                }
                break;
        }
        yj0.a.h(this, "com/tencent/mm/ui/mvvm/uic/conversation/recent/RecentConversationHeaderUIC$updateView$1$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

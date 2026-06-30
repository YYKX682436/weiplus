package vc5;

/* loaded from: classes10.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ em.d2 f516872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21818x708ac6f1 f516873e;

    public q(em.d2 d2Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21818x708ac6f1 c21818x708ac6f1) {
        this.f516872d = d2Var;
        this.f516873e = c21818x708ac6f1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGallerySearchBarView$initSearchBar$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        em.d2 d2Var = this.f516872d;
        android.text.Editable text = d2Var.d().getText();
        if (text != null) {
            text.clear();
        }
        d2Var.d().clearFocus();
        int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21818x708ac6f1.f283264n;
        this.f516873e.b();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21818x708ac6f1.e(this.f516873e, false, false, false, 4, null);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGallerySearchBarView$initSearchBar$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

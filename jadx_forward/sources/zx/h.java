package zx;

/* loaded from: classes.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.p715x373aa5.C10501xa4ff92d f558486d;

    public h(com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.p715x373aa5.C10501xa4ff92d c10501xa4ff92d) {
        this.f558486d = c10501xa4ff92d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/chatbot/brand/ui/view/CBTBrandLiveQueryListView$setView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f558486d.f146821f;
        if (c1163xf1deaba4 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c1163xf1deaba4, arrayList2.toArray(), "com/tencent/mm/feature/chatbot/brand/ui/view/CBTBrandLiveQueryListView$setView$6", "onClick", "(Landroid/view/View;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            c1163xf1deaba4.c1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(c1163xf1deaba4, "com/tencent/mm/feature/chatbot/brand/ui/view/CBTBrandLiveQueryListView$setView$6", "onClick", "(Landroid/view/View;)V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
        yj0.a.h(this, "com/tencent/mm/feature/chatbot/brand/ui/view/CBTBrandLiveQueryListView$setView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

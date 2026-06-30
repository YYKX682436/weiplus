package qt2;

/* loaded from: classes2.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt2.e f448078d;

    public a(qt2.e eVar) {
        this.f448078d = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/share/FinderFirstFeedRecommendTipUIC$initContent$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qt2.e eVar = this.f448078d;
        eVar.Z6();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = eVar.f448123g;
        if (c1163xf1deaba4 != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
            if (c1162x665295de != null) {
                int w17 = c1162x665295de.w() + 1;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(java.lang.Integer.valueOf(w17));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(c1163xf1deaba4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/share/FinderFirstFeedRecommendTipUIC", "onClickGuide", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                c1163xf1deaba4.c1(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/share/FinderFirstFeedRecommendTipUIC", "onClickGuide", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/share/FinderFirstFeedRecommendTipUIC$initContent$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

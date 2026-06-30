package sc2;

/* loaded from: classes2.dex */
public final class s7 extends sc2.u7 {
    public s7() {
        super(7);
    }

    @Override // sc2.u7, ad2.j
    public android.view.ViewGroup a(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) super.a(view);
        int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn);
        int dimensionPixelSize2 = view.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561206ca);
        if (linearLayout != null) {
            linearLayout.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize2);
        }
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.eak);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FinderFeedJumperUIC$CommentBottomObserver", "getContainLayout", "(Landroid/view/View;)Landroid/widget/LinearLayout;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/component/FinderFeedJumperUIC$CommentBottomObserver", "getContainLayout", "(Landroid/view/View;)Landroid/widget/LinearLayout;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return linearLayout;
    }
}

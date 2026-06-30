package xj1;

/* loaded from: classes7.dex */
public final class a0 extends xj1.h0 {

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f536309n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f536310o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f536311p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(android.view.View root) {
        super(root, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        this.f536309n = root.findViewById(com.p314xaae8f345.mm.R.id.f564627wf);
        this.f536310o = root.findViewById(com.p314xaae8f345.mm.R.id.f564628wg);
        this.f536311p = root.findViewById(com.p314xaae8f345.mm.R.id.dlm);
        android.view.ViewGroup.LayoutParams layoutParams = this.f536329f.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = 0;
        }
        this.f536329f.requestLayout();
        android.view.View view = this.f536330g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/collection/CollectionSortViewHolder", "<init>", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/ui/collection/CollectionSortViewHolder", "<init>", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // xj1.h0
    public boolean k() {
        return false;
    }
}

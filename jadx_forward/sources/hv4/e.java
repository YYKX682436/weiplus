package hv4;

/* loaded from: classes8.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f366823d;

    public e(android.view.View view) {
        this.f366823d = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/tagsearch/ui/TagSearchDialog$initContentView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f366823d;
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381 = (com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381) view2.findViewById(com.p314xaae8f345.mm.R.id.gfl);
        if (c22479x68a26381 != null) {
            c22479x68a26381.m();
        }
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a263812 = (com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381) view2.findViewById(com.p314xaae8f345.mm.R.id.gfl);
        if (c22479x68a263812 != null) {
            c22479x68a263812.s();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/tagsearch/ui/TagSearchDialog$initContentView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

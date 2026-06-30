package al5;

/* loaded from: classes4.dex */
public final class h1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMCollapsibleTextView f5921d;

    public h1(com.tencent.mm.ui.widget.MMCollapsibleTextView mMCollapsibleTextView) {
        this.f5921d = mMCollapsibleTextView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/MMCollapsibleTextView$setupCollapseButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.MMCollapsibleTextView.B(this.f5921d);
        yj0.a.h(this, "com/tencent/mm/ui/widget/MMCollapsibleTextView$setupCollapseButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

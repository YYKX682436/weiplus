package pk2;

/* loaded from: classes.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f437126d;

    public c0(android.view.View view) {
        this.f437126d = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/AnchorCommentOption$addItem$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f437126d;
        android.content.Context context = view2.getContext();
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
        e4Var.f293309c = view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.npe);
        e4Var.c();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorCommentOption$addItem$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package uy3;

/* loaded from: classes3.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.AbstractC17267x816864c7 f513480d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.AbstractC17267x816864c7 abstractC17267x816864c7) {
        this.f513480d = abstractC17267x816864c7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/box/BaseBoxDialogView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f513480d.c(4);
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/box/BaseBoxDialogView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

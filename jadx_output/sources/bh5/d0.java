package bh5;

/* loaded from: classes8.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment f20928d;

    public d0(com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment mMHalfScreenDialogFragment) {
        this.f20928d = mMHalfScreenDialogFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment$onCreateView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tk5.c u07 = this.f20928d.u0();
        tk5.a b17 = u07.b();
        if (b17 != null && !b17.Z()) {
            u07.a();
        }
        yj0.a.h(this, "com/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment$onCreateView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

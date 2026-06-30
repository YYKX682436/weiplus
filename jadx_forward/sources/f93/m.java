package f93;

/* loaded from: classes3.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.DialogC16164x43fb9455 f341916d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.DialogC16164x43fb9455 dialogC16164x43fb9455) {
        this.f341916d = dialogC16164x43fb9455;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/AbsLabelUserDialog$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f341916d.cancel();
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/AbsLabelUserDialog$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package x41;

/* loaded from: classes15.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p986x373aa5.AbstractC11221xf21fe5de f533310d;

    public i(com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p986x373aa5.AbstractC11221xf21fe5de abstractC11221xf21fe5de) {
        this.f533310d = abstractC11221xf21fe5de;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/openim/ui/view/BaseDialogView$initDialogBg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p986x373aa5.AbstractC11221xf21fe5de abstractC11221xf21fe5de = this.f533310d;
        if (!abstractC11221xf21fe5de.f153847p0) {
            yj0.a.h(this, "com/tencent/mm/openim/ui/view/BaseDialogView$initDialogBg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        x41.a aVar = abstractC11221xf21fe5de.f153849r;
        if (aVar != null) {
            aVar.a(3);
        }
        yj0.a.h(this, "com/tencent/mm/openim/ui/view/BaseDialogView$initDialogBg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

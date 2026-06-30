package rp1;

/* loaded from: classes7.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12915xed9c02f9 f479890d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12915xed9c02f9 c12915xed9c02f9) {
        this.f479890d = c12915xed9c02f9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/view/ContentFloatBallEduView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12915xed9c02f9 c12915xed9c02f9 = this.f479890d;
        c12915xed9c02f9.setVisibility(8);
        android.widget.PopupWindow.OnDismissListener onDismissListener = c12915xed9c02f9.f174936i;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ball/view/ContentFloatBallEduView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

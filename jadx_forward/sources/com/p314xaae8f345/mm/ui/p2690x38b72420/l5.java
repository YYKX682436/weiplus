package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes8.dex */
public class l5 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01 f288540d;

    public l5(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01 activityC22313x70d15e01) {
        this.f288540d = activityC22313x70d15e01;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/ModRemarkNameUI$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        rl5.r rVar = new rl5.r(this.f288540d.mo55332x76847179(), view);
        rVar.f478884u = new com.p314xaae8f345.mm.ui.p2690x38b72420.j5(this);
        rVar.f478887x = new com.p314xaae8f345.mm.ui.p2690x38b72420.k5(this);
        rVar.m();
        yj0.a.i(false, this, "com/tencent/mm/ui/contact/ModRemarkNameUI$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}

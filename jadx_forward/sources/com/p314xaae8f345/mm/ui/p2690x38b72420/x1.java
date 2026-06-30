package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes8.dex */
public class x1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22295xcc682948 f288776d;

    public x1(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22295xcc682948 activityC22295xcc682948) {
        this.f288776d = activityC22295xcc682948;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/ContactRemarkInfoModUI$11", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        rl5.r rVar = new rl5.r(this.f288776d.mo55332x76847179(), view);
        rVar.f478884u = new com.p314xaae8f345.mm.ui.p2690x38b72420.v1(this);
        rVar.f478887x = new com.p314xaae8f345.mm.ui.p2690x38b72420.w1(this);
        rVar.m();
        yj0.a.i(false, this, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI$11", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}

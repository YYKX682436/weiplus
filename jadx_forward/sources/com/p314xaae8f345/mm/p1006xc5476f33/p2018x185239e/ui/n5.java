package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes5.dex */
public class n5 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f239381d;

    public n5(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 activityC17133x39d21883, android.widget.TextView textView) {
        this.f239381d = textView;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI$47", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        android.widget.TextView textView = this.f239381d;
        rl5.r rVar = new rl5.r(textView.getContext(), textView);
        rVar.f478884u = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.k5(this);
        rVar.f478887x = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.l5(this);
        rVar.L = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.m5(this);
        rVar.n(0, 0);
        yj0.a.i(false, this, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI$47", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}

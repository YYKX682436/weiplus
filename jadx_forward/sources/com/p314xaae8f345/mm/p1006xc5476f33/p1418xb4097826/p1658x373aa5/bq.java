package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class bq implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f213271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gq f213272e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f213273f;

    public bq(android.widget.TextView textView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gq gqVar, android.widget.EditText editText) {
        this.f213271d = textView;
        this.f213272e = gqVar;
        this.f213273f = editText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/LiveChargeInputCoinValueBottomPage$getView$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f213271d.isEnabled()) {
            android.widget.EditText editText = this.f213273f;
            java.lang.String obj = editText.getText().toString();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gq gqVar = this.f213272e;
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gq.i(gqVar, obj)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.sp spVar = gqVar.f213718e;
                int parseInt = java.lang.Integer.parseInt(editText.getText().toString());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zp zpVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yp) spVar).f214947a;
                zpVar.f215018b.mo146xb9724478(java.lang.Integer.valueOf(parseInt));
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = zpVar.f215019c;
                if (y1Var != null) {
                    y1Var.q();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/LiveChargeInputCoinValueBottomPage$getView$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

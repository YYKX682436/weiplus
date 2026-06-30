package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui;

/* loaded from: classes14.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.v f258514d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.v vVar) {
        this.f258514d = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voip/ui/QosParamDialog$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.v vVar = this.f258514d;
        java.lang.Object mo141623x754a37bb = ((jz5.n) vVar.f258536g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        int intValue = ((java.lang.Number) vVar.f258543q.get(((android.widget.Spinner) mo141623x754a37bb).getSelectedItemPosition())).intValue();
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) vVar.f258537h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        int intValue2 = ((java.lang.Number) vVar.f258544r.get(((android.widget.Spinner) mo141623x754a37bb2).getSelectedItemPosition())).intValue();
        java.lang.Object mo141623x754a37bb3 = ((jz5.n) vVar.f258538i).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((android.widget.EditText) mo141623x754a37bb3).getText().toString(), 15);
        java.lang.Object mo141623x754a37bb4 = ((jz5.n) vVar.f258539m).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb4, "getValue(...)");
        int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((android.widget.EditText) mo141623x754a37bb4).getText().toString(), 10);
        java.lang.Object mo141623x754a37bb5 = ((jz5.n) vVar.f258541o).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb5, "getValue(...)");
        int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((android.widget.EditText) mo141623x754a37bb5).getText().toString(), 15);
        java.lang.Object mo141623x754a37bb6 = ((jz5.n) vVar.f258542p).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb6, "getValue(...)");
        java.lang.Object selectedItem = ((android.widget.Spinner) mo141623x754a37bb6).getSelectedItem();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(selectedItem, "null cannot be cast to non-null type kotlin.String");
        int P4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) selectedItem, 2);
        java.lang.Object mo141623x754a37bb7 = ((jz5.n) vVar.f258540n).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb7, "getValue(...)");
        vVar.f258533d.mo146xb9724478(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.w(intValue, intValue2, P, P3, P2, P4, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((android.widget.EditText) mo141623x754a37bb7).getText().toString(), 600)));
        vVar.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/voip/ui/QosParamDialog$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

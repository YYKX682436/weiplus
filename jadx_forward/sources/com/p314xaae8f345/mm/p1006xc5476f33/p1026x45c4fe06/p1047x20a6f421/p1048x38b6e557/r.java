package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557;

/* loaded from: classes8.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.v f159240d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.v vVar) {
        this.f159240d = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/debugger/console/ConsolePrintPanel$3$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ConsolePrintPanel", "onClick#clearTv");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.f0 m50185x2b0b03e4 = this.f159240d.m50185x2b0b03e4();
        m50185x2b0b03e4.setText("");
        m50185x2b0b03e4.f159198g.clear();
        m50185x2b0b03e4.f159199h = new android.text.SpannableStringBuilder();
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/debugger/console/ConsolePrintPanel$3$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

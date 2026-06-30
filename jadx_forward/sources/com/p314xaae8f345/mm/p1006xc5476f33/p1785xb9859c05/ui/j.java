package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o f224408d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o oVar) {
        this.f224408d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/DialPadController$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12061, 0, 0, 0, 1, 0, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o oVar = this.f224408d;
        java.lang.String replace = oVar.f224483b.getText().toString().replace("+", "");
        android.content.Intent intent = new android.content.Intent(oVar.f224490i, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16133x8935f7ee.class);
        intent.putExtra("couttry_code", replace);
        intent.putExtra("CountryCodeUI_isShowCountryCode", true);
        oVar.f224490i.startActivityForResult(intent, 100);
        oVar.f224490i.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, -1);
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/DialPadController$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

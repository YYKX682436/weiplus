package com.tencent.mm.plugin.appbrand.keylogger;

/* loaded from: classes7.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserActivity f84147d;

    public e(com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserActivity keyStepAnalyserActivity) {
        this.f84147d = keyStepAnalyserActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserActivity$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserActivity.f84096p;
        com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserActivity keyStepAnalyserActivity = this.f84147d;
        keyStepAnalyserActivity.getClass();
        new android.app.DatePickerDialog(keyStepAnalyserActivity, new com.tencent.mm.plugin.appbrand.keylogger.h(keyStepAnalyserActivity), keyStepAnalyserActivity.f84102m, keyStepAnalyserActivity.f84103n, keyStepAnalyserActivity.f84104o).show();
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserActivity$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.mm.plugin.appbrand.keylogger;

/* loaded from: classes7.dex */
public class i implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.keylogger.j f84155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserActivity f84156e;

    public i(com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserActivity keyStepAnalyserActivity, com.tencent.mm.plugin.appbrand.keylogger.j jVar) {
        this.f84156e = keyStepAnalyserActivity;
        this.f84155d = jVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserActivity$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        kg1.c cVar = (kg1.c) this.f84155d.f84159e.get(i17);
        int i18 = com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserActivity.f84096p;
        com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserActivity keyStepAnalyserActivity = this.f84156e;
        keyStepAnalyserActivity.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(keyStepAnalyserActivity, com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserDetailActivity.class);
        intent.putExtra("steps", cVar.f307691a);
        intent.putExtra("key_info", cVar.f307692b.toString());
        intent.putExtra("key_process_class", keyStepAnalyserActivity.f84100h);
        intent.putExtra("key_process_category", keyStepAnalyserActivity.f84101i);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(keyStepAnalyserActivity, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserActivity", "goToDetail", "(Lcom/tencent/mm/plugin/appbrand/keylogger/base/IKeyStepAnalyser$ProcessLogInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        keyStepAnalyserActivity.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(keyStepAnalyserActivity, "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserActivity", "goToDetail", "(Lcom/tencent/mm/plugin/appbrand/keylogger/base/IKeyStepAnalyser$ProcessLogInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserActivity$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af;

/* loaded from: classes7.dex */
public class i implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.j f165688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.ActivityC12308x8b10b259 f165689e;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.ActivityC12308x8b10b259 activityC12308x8b10b259, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.j jVar) {
        this.f165689e = activityC12308x8b10b259;
        this.f165688d = jVar;
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
        kg1.c cVar = (kg1.c) this.f165688d.f165692e.get(i17);
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.ActivityC12308x8b10b259.f165629p;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.ActivityC12308x8b10b259 activityC12308x8b10b259 = this.f165689e;
        activityC12308x8b10b259.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(activityC12308x8b10b259, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.ActivityC12309x37262e4a.class);
        intent.putExtra("steps", cVar.f389224a);
        intent.putExtra("key_info", cVar.f389225b.toString());
        intent.putExtra("key_process_class", activityC12308x8b10b259.f165633h);
        intent.putExtra("key_process_category", activityC12308x8b10b259.f165634i);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC12308x8b10b259, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserActivity", "goToDetail", "(Lcom/tencent/mm/plugin/appbrand/keylogger/base/IKeyStepAnalyser$ProcessLogInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC12308x8b10b259.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC12308x8b10b259, "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserActivity", "goToDetail", "(Lcom/tencent/mm/plugin/appbrand/keylogger/base/IKeyStepAnalyser$ProcessLogInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserActivity$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}

package com.tencent.mm.plugin.appbrand.keylogger;

/* loaded from: classes7.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f84148d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.keylogger.g f84149e;

    public f(com.tencent.mm.plugin.appbrand.keylogger.g gVar, java.util.List list) {
        this.f84149e = gVar;
        this.f84148d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserActivity keyStepAnalyserActivity = this.f84149e.f84153a;
        int i17 = com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserActivity.f84096p;
        android.widget.ListView listView = (android.widget.ListView) keyStepAnalyserActivity.findViewById(com.tencent.mm.R.id.i38);
        if (listView == null) {
            keyStepAnalyserActivity.finish();
            return;
        }
        com.tencent.mm.plugin.appbrand.keylogger.j jVar = new com.tencent.mm.plugin.appbrand.keylogger.j(keyStepAnalyserActivity);
        listView.setAdapter((android.widget.ListAdapter) jVar);
        listView.setOnItemClickListener(new com.tencent.mm.plugin.appbrand.keylogger.i(keyStepAnalyserActivity, jVar));
        jVar.f84159e = this.f84148d;
        jVar.notifyDataSetChanged();
    }
}

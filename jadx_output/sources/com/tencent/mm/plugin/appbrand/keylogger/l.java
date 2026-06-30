package com.tencent.mm.plugin.appbrand.keylogger;

/* loaded from: classes7.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserDetailActivity f84161d;

    public l(com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserDetailActivity keyStepAnalyserDetailActivity) {
        this.f84161d = keyStepAnalyserDetailActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserDetailActivity$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserDetailActivity keyStepAnalyserDetailActivity = this.f84161d;
        if (keyStepAnalyserDetailActivity.f84106e.getVisibility() == 0) {
            android.view.View view2 = keyStepAnalyserDetailActivity.f84106e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserDetailActivity", "toggleDiagram", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserDetailActivity", "toggleDiagram", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = keyStepAnalyserDetailActivity.f84107f;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserDetailActivity", "toggleDiagram", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserDetailActivity", "toggleDiagram", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            if (!keyStepAnalyserDetailActivity.f84118t) {
                keyStepAnalyserDetailActivity.f84108g = (android.widget.LinearLayout) keyStepAnalyserDetailActivity.findViewById(com.tencent.mm.R.id.cya);
                keyStepAnalyserDetailActivity.f84109h = new android.view.ScaleGestureDetector(keyStepAnalyserDetailActivity, keyStepAnalyserDetailActivity.f84121w);
                java.util.HashMap hashMap = new java.util.HashMap();
                lg1.a aVar = new lg1.a(keyStepAnalyserDetailActivity, false);
                aVar.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.appbrand.keylogger.n(keyStepAnalyserDetailActivity, aVar, keyStepAnalyserDetailActivity));
                java.lang.Class cls = keyStepAnalyserDetailActivity.f84116r;
                kg1.m.e(com.tencent.mm.plugin.appbrand.keylogger.b0.c(cls, keyStepAnalyserDetailActivity.f84117s), new com.tencent.mm.plugin.appbrand.keylogger.o(keyStepAnalyserDetailActivity, hashMap, aVar, keyStepAnalyserDetailActivity));
                keyStepAnalyserDetailActivity.f84108g.addView(aVar);
                keyStepAnalyserDetailActivity.f84118t = true;
            }
            android.view.View view4 = keyStepAnalyserDetailActivity.f84106e;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserDetailActivity", "toggleDiagram", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserDetailActivity", "toggleDiagram", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = keyStepAnalyserDetailActivity.f84107f;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserDetailActivity", "toggleDiagram", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserDetailActivity", "toggleDiagram", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserDetailActivity$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

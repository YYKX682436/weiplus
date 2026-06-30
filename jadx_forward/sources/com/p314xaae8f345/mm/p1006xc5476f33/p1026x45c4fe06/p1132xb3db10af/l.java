package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af;

/* loaded from: classes7.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.ActivityC12309x37262e4a f165694d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.ActivityC12309x37262e4a activityC12309x37262e4a) {
        this.f165694d = activityC12309x37262e4a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserDetailActivity$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.ActivityC12309x37262e4a activityC12309x37262e4a = this.f165694d;
        if (activityC12309x37262e4a.f165639e.getVisibility() == 0) {
            android.view.View view2 = activityC12309x37262e4a.f165639e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserDetailActivity", "toggleDiagram", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserDetailActivity", "toggleDiagram", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = activityC12309x37262e4a.f165640f;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserDetailActivity", "toggleDiagram", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserDetailActivity", "toggleDiagram", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            if (!activityC12309x37262e4a.f165651t) {
                activityC12309x37262e4a.f165641g = (android.widget.LinearLayout) activityC12309x37262e4a.findViewById(com.p314xaae8f345.mm.R.id.cya);
                activityC12309x37262e4a.f165642h = new android.view.ScaleGestureDetector(activityC12309x37262e4a, activityC12309x37262e4a.f165654w);
                java.util.HashMap hashMap = new java.util.HashMap();
                lg1.a aVar = new lg1.a(activityC12309x37262e4a, false);
                aVar.getViewTreeObserver().addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.n(activityC12309x37262e4a, aVar, activityC12309x37262e4a));
                java.lang.Class cls = activityC12309x37262e4a.f165649r;
                kg1.m.e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.b0.c(cls, activityC12309x37262e4a.f165650s), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.o(activityC12309x37262e4a, hashMap, aVar, activityC12309x37262e4a));
                activityC12309x37262e4a.f165641g.addView(aVar);
                activityC12309x37262e4a.f165651t = true;
            }
            android.view.View view4 = activityC12309x37262e4a.f165639e;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserDetailActivity", "toggleDiagram", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserDetailActivity", "toggleDiagram", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = activityC12309x37262e4a.f165640f;
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

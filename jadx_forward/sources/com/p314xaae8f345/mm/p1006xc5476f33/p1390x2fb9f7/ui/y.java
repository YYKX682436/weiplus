package com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.ui;

/* loaded from: classes11.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.ui.z f181385d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.ui.z zVar) {
        this.f181385d = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptReportBanner", "expt report banner close");
        com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.ui.z zVar = this.f181385d;
        if (zVar.f484377i) {
            android.view.View view = zVar.f181386m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/expt/ui/ExptReportBanner$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/expt/ui/ExptReportBanner$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = zVar.f181387n;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/expt/ui/ExptReportBanner$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/expt/ui/ExptReportBanner$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}

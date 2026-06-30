package com.tencent.mm.plugin.expt.ui;

/* loaded from: classes11.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expt.ui.z f99852d;

    public y(com.tencent.mm.plugin.expt.ui.z zVar) {
        this.f99852d = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ExptReportBanner", "expt report banner close");
        com.tencent.mm.plugin.expt.ui.z zVar = this.f99852d;
        if (zVar.f402844i) {
            android.view.View view = zVar.f99853m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/expt/ui/ExptReportBanner$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/expt/ui/ExptReportBanner$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = zVar.f99854n;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/expt/ui/ExptReportBanner$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/expt/ui/ExptReportBanner$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}

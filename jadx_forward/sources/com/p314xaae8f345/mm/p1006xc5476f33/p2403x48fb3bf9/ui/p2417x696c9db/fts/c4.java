package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class c4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19396xdd9ccea5 f265904d;

    public c4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19396xdd9ccea5 activityC19396xdd9ccea5) {
        this.f265904d = activityC19396xdd9ccea5;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19396xdd9ccea5 activityC19396xdd9ccea5 = this.f265904d;
        if (activityC19396xdd9ccea5.isDestroyed()) {
            return;
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19396xdd9ccea5.f265857h5;
        if (activityC19396xdd9ccea5.f265348f == null) {
            return;
        }
        if (activityC19396xdd9ccea5.P9().length() > 0) {
            android.view.View view = activityC19396xdd9ccea5.f265860f5;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/MMFTSSearchTabWebViewUI$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/MMFTSSearchTabWebViewUI$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = activityC19396xdd9ccea5.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((rx4.h2) pf5.z.f435481a.a(activity).a(rx4.h2.class)).w7(8);
            return;
        }
        android.view.View view2 = activityC19396xdd9ccea5.f265860f5;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/MMFTSSearchTabWebViewUI$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/fts/MMFTSSearchTabWebViewUI$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = activityC19396xdd9ccea5.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        pf5.z zVar = pf5.z.f435481a;
        ((rx4.h2) zVar.a(activity2).a(rx4.h2.class)).w7(0);
        if (activityC19396xdd9ccea5.P4.isEmpty()) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = activityC19396xdd9ccea5.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
            ((rx4.h2) zVar.a(activity3).a(rx4.h2.class)).f482701g = activityC19396xdd9ccea5.I4;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity4 = activityC19396xdd9ccea5.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity4, "activity");
        ((rx4.h2) zVar.a(activity4).a(rx4.h2.class)).c7(java.lang.System.currentTimeMillis() + "_native", false);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity5 = activityC19396xdd9ccea5.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity5, "activity");
        ((rx4.h2) zVar.a(activity5).a(rx4.h2.class)).b7();
    }
}

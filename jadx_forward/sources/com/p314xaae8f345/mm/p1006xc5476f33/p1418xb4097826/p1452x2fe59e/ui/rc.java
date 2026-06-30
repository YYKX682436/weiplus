package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes10.dex */
public final class rc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14033xa41f223 f192025d;

    public rc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14033xa41f223 activityC14033xa41f223) {
        this.f192025d = activityC14033xa41f223;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.ga gaVar;
        android.widget.Button button;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14033xa41f223 activityC14033xa41f223 = this.f192025d;
        gaVar = ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activityC14033xa41f223).f39322x2305be9;
        com.p314xaae8f345.mm.ui.eb E = gaVar.E(1);
        if (E != null) {
            android.view.View view = E.f289918k;
            if (view == null && (view = E.f289917j) == null) {
                view = null;
            }
            if (view == null || (button = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.f564014fp)) == null) {
                return;
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC14033xa41f223.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            java.lang.Object systemService = mo55332x76847179.getSystemService("window");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            button.setTextSize(1, (displayMetrics.density * 16.0f) / mo55332x76847179.getResources().getDisplayMetrics().density);
        }
    }
}

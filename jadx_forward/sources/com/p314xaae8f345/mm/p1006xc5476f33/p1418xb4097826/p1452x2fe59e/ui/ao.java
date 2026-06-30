package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class ao implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14109x83bd09 f191219d;

    public ao(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14109x83bd09 activityC14109x83bd09) {
        this.f191219d = activityC14109x83bd09;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14109x83bd09 activityC14109x83bd09 = this.f191219d;
        if (activityC14109x83bd09.f191118m != 0 || activityC14109x83bd09.isFinishing()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ViewFluentTransparentActivity", "OccupyFinderUI2 self-destruct: no target VisitorUI after 2000ms");
        android.view.View decorView = activityC14109x83bd09.getWindow().getDecorView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(decorView, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI2$selfDestructRunnable$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        decorView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(decorView, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI2$selfDestructRunnable$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        activityC14109x83bd09.finish();
    }
}

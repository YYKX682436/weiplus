package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class ao implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2 f109686d;

    public ao(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2 occupyFinderUI2) {
        this.f109686d = occupyFinderUI2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2 occupyFinderUI2 = this.f109686d;
        if (occupyFinderUI2.f109585m != 0 || occupyFinderUI2.isFinishing()) {
            return;
        }
        com.tencent.mars.xlog.Log.w("ViewFluentTransparentActivity", "OccupyFinderUI2 self-destruct: no target VisitorUI after 2000ms");
        android.view.View decorView = occupyFinderUI2.getWindow().getDecorView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(decorView, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI2$selfDestructRunnable$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        decorView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(decorView, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI2$selfDestructRunnable$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        occupyFinderUI2.finish();
    }
}

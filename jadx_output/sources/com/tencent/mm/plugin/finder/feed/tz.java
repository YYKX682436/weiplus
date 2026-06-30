package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class tz implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f109118d;

    public tz(java.lang.ref.WeakReference rHelper) {
        kotlin.jvm.internal.o.g(rHelper, "rHelper");
        this.f109118d = rHelper;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("FinderTimelinePresenterHelper", "PoiUpdateTask run!");
        com.tencent.mm.plugin.finder.feed.g00 g00Var = (com.tencent.mm.plugin.finder.feed.g00) this.f109118d.get();
        if (g00Var == null) {
            com.tencent.mars.xlog.Log.e("FinderTimelinePresenterHelper", "PoiUpdateTask run but Helper is null!");
            return;
        }
        g00Var.m();
        com.tencent.mm.plugin.finder.feed.tz tzVar = g00Var.f106808m;
        if (tzVar != null) {
            g00Var.e().removeCallbacks(tzVar);
        }
        com.tencent.mm.sdk.platformtools.n3 e17 = g00Var.e();
        com.tencent.mm.plugin.finder.feed.tz tzVar2 = g00Var.f106808m;
        int i17 = com.tencent.mm.plugin.finder.feed.g00.f106795p;
        e17.postDelayed(tzVar2, com.tencent.mm.plugin.finder.feed.g00.f106794o);
    }
}

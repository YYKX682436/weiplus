package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class m5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f105705d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f105706e;

    public m5(java.lang.ref.WeakReference rHelper, java.lang.String key) {
        kotlin.jvm.internal.o.g(rHelper, "rHelper");
        kotlin.jvm.internal.o.g(key, "key");
        this.f105705d = rHelper;
        this.f105706e = key;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.finder.extension.reddot.o5 o5Var = (com.tencent.mm.plugin.finder.extension.reddot.o5) this.f105705d.get();
        jz5.f0 f0Var = null;
        if (o5Var != null) {
            o5Var.f105741c.invoke(this.f105706e, o5Var.f105744f, o5Var.f105746h);
            o5Var.f105743e = "";
            o5Var.f105744f = "";
            o5Var.f105746h = null;
            com.tencent.mm.plugin.finder.extension.reddot.m5 m5Var = o5Var.f105745g;
            if (m5Var != null) {
                ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) o5Var.f105747i).getValue()).removeCallbacks(m5Var);
            }
            o5Var.f105745g = null;
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("RedDotFreqCtrlClickHelper", "ClickWatchTask run but Helper is null!");
        }
    }
}

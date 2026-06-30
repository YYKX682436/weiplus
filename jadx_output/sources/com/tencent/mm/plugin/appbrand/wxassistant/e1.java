package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f92196d;

    public e1(java.lang.String str) {
        this.f92196d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Activity r07;
        com.tencent.mm.plugin.appbrand.o6 b17 = com.tencent.mm.plugin.appbrand.l.b(this.f92196d);
        if (b17 == null || (r07 = b17.r0()) == null) {
            return;
        }
        r07.finish();
    }
}

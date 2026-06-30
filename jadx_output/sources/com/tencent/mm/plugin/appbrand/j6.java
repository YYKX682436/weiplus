package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public abstract class j6 implements android.content.ComponentCallbacks2 {
    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        if (i17 == 5 || i17 == 10 || i17 == 15 || i17 == 80) {
            ((com.tencent.mm.plugin.appbrand.l6) this).onLowMemory();
        }
    }
}

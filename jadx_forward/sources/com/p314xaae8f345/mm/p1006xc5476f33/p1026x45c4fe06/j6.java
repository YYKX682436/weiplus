package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public abstract class j6 implements android.content.ComponentCallbacks2 {
    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        if (i17 == 5 || i17 == 10 || i17 == 15 || i17 == 80) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l6) this).onLowMemory();
        }
    }
}

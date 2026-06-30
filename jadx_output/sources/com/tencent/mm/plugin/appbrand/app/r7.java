package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public final class r7 extends com.tencent.mm.app.w6 implements hm0.q {
    public static void b() {
        java.util.Locale locale = java.util.Locale.getDefault(java.util.Locale.Category.FORMAT);
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        if (locale == locale2) {
            return;
        }
        java.util.Locale.setDefault(java.util.Locale.Category.FORMAT, locale2);
    }

    @Override // com.tencent.mm.app.w6, com.tencent.mm.app.v6
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        b();
    }

    @Override // com.tencent.mm.app.w6, com.tencent.mm.app.v6
    public void onActivityStarted(android.app.Activity activity) {
        b();
    }

    @Override // hm0.q
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        b();
    }

    @Override // hm0.q
    public void onLowMemory() {
    }

    @Override // hm0.q
    public void onTerminate() {
    }

    @Override // hm0.q
    public void onTrimMemory(int i17) {
    }
}

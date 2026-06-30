package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes7.dex */
public final class r7 extends com.p314xaae8f345.mm.app.w6 implements hm0.q {
    public static void b() {
        java.util.Locale locale = java.util.Locale.getDefault(java.util.Locale.Category.FORMAT);
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        if (locale == locale2) {
            return;
        }
        java.util.Locale.setDefault(java.util.Locale.Category.FORMAT, locale2);
    }

    @Override // com.p314xaae8f345.mm.app.w6, com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityCreated */
    public void mo9958x78cb4fa(android.app.Activity activity, android.os.Bundle bundle) {
        b();
    }

    @Override // com.p314xaae8f345.mm.app.w6, com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityStarted */
    public void mo27341x59297693(android.app.Activity activity) {
        b();
    }

    @Override // hm0.q
    /* renamed from: onConfigurationChanged */
    public void mo43788x50e1c15d(android.content.res.Configuration configuration) {
        b();
    }

    @Override // hm0.q
    /* renamed from: onLowMemory */
    public void mo43789xb5d8ba56() {
    }

    @Override // hm0.q
    /* renamed from: onTerminate */
    public void mo43790x7784fb42() {
    }

    @Override // hm0.q
    /* renamed from: onTrimMemory */
    public void mo43791x29685b02(int i17) {
    }
}

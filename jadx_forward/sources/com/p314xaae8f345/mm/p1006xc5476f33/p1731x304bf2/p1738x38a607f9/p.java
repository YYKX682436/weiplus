package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9;

@j95.b
/* loaded from: classes8.dex */
public class p extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.s2 f220926d = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.o(this);

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        this.f220926d.m43071x58998cd();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.c.f220934b == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.c.f220934b = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.b(null);
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.c.f220934b, intentFilter);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.f220942a != null) {
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.f220943b) {
                try {
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.f220942a != null) {
                        ((java.util.concurrent.ConcurrentHashMap) lm5.i.f401142a).remove("GameCommLib#WorkThread".toUpperCase(java.util.Locale.ENGLISH));
                        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.f220942a.mo50299x35224f();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.f220942a = null;
                    }
                } catch (java.lang.Throwable th6) {
                    throw th6;
                }
            }
        }
        this.f220926d.m43072x2efc64();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.b bVar = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.c.f220934b;
        if (bVar != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(bVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.c.f220934b = null;
    }
}

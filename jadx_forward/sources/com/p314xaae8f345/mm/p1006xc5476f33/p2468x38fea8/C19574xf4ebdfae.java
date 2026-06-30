package com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.C19572x61478ba6.class, com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.r0.class})
/* renamed from: com.tencent.mm.plugin.zero.LoadProtocolJNIService */
/* loaded from: classes12.dex */
public class C19574xf4ebdfae extends i95.w {
    /* renamed from: retryOnce */
    private void m75044xc3fa2149(java.lang.Runnable runnable) {
        try {
            runnable.run();
        } catch (java.lang.Throwable unused) {
            runnable.run();
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        fp.d0.o("MMProtocalJni");
        m75044xc3fa2149(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.zero.LoadProtocolJNIService.1
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.mm.p2496xc50a8ce6.C19776x5804ff1f.m75994xcb5dff72(o45.wf.f424562g);
            }
        });
        m75044xc3fa2149(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.zero.LoadProtocolJNIService.2
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.mm.p2496xc50a8ce6.C19776x5804ff1f.m75997x93bfc8dd(com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016());
            }
        });
        m75044xc3fa2149(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.zero.LoadProtocolJNIService.3
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.mm.p2496xc50a8ce6.C19776x5804ff1f.m75996x11f1e3fa(false);
            }
        });
    }
}

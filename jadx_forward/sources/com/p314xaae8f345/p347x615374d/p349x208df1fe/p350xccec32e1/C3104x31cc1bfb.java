package com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1;

/* renamed from: com.tencent.kinda.framework.animate.KindaAnimatorWatch */
/* loaded from: classes9.dex */
public class C3104x31cc1bfb {
    private static final java.lang.String TAG = "MicroMsg.KindaAnimatorWatch";

    /* renamed from: pendingActions */
    private static java.util.List<java.lang.Runnable> f11839x337daf66 = new java.util.ArrayList();

    /* renamed from: pendingObj */
    private static int f11840x653cafe0 = 0;

    /* renamed from: didObjCreated */
    public static void m24893x450143d0(final int i17) {
        f11840x653cafe0 = i17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.animate.KindaAnimatorWatch.2
            @Override // java.lang.Runnable
            public void run() {
                if (i17 == com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3104x31cc1bfb.f11840x653cafe0) {
                    return;
                }
                java.util.Iterator it = com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3104x31cc1bfb.f11839x337daf66.iterator();
                while (it.hasNext()) {
                    ((java.lang.Runnable) it.next()).run();
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3104x31cc1bfb.f11839x337daf66.clear();
                int unused = com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3104x31cc1bfb.f11840x653cafe0 = 0;
            }
        }, 5000L);
    }

    /* renamed from: didViewCreated */
    public static void m24894xafeb3684(int i17) {
        if (i17 != f11840x653cafe0) {
            return;
        }
        final int i18 = 0;
        f11840x653cafe0 = 0;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.animate.KindaAnimatorWatch.3
            @Override // java.lang.Runnable
            public void run() {
                java.util.Iterator it = com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3104x31cc1bfb.f11839x337daf66.iterator();
                while (it.hasNext()) {
                    ((java.lang.Runnable) it.next()).run();
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3104x31cc1bfb.f11839x337daf66.clear();
            }
        });
    }

    /* renamed from: post */
    public static void m24895x3498a0(final java.lang.Runnable runnable) {
        if (f11840x653cafe0 != 0) {
            f11839x337daf66.add(runnable);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.animate.KindaAnimatorWatch.1
                @Override // java.lang.Runnable
                public void run() {
                    runnable.run();
                }
            });
        }
    }
}

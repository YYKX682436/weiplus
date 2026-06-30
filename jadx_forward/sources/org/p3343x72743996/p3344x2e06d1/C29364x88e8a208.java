package org.p3343x72743996.p3344x2e06d1;

/* renamed from: org.chromium.base.ResettersForTesting */
/* loaded from: classes13.dex */
public class C29364x88e8a208 {

    /* renamed from: sClassResetters */
    private static final java.util.LinkedHashSet<java.lang.Runnable> f73422x940e46fc;

    /* renamed from: sMethodMode */
    private static boolean f73423x2e734ef7;

    /* renamed from: sMethodResetters */
    private static final java.util.LinkedHashSet<java.lang.Runnable> f73424x978b416d;

    static {
        f73422x940e46fc = org.p3343x72743996.p3353x59bc66e.C29454xce2ad330.f73672xfa59bddd ? new java.util.LinkedHashSet<>() : null;
        f73424x978b416d = org.p3343x72743996.p3353x59bc66e.C29454xce2ad330.f73672xfa59bddd ? new java.util.LinkedHashSet<>() : null;
    }

    /* renamed from: flushResetters */
    private static void m152636x32892b9d(java.util.LinkedHashSet linkedHashSet) {
        java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashSet);
        linkedHashSet.clear();
        java.util.Collections.reverse(arrayList);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
    }

    /* renamed from: onAfterClass */
    public static void m152637x217e5c3b() {
        m152636x32892b9d(f73422x940e46fc);
        f73423x2e734ef7 = false;
    }

    /* renamed from: onAfterMethod */
    public static void m152638x1f03767e() {
        m152636x32892b9d(f73424x978b416d);
    }

    /* renamed from: register */
    public static void m152639xd6dc2ea3(java.lang.Runnable runnable) {
        if (org.p3343x72743996.p3353x59bc66e.C29454xce2ad330.f73672xfa59bddd) {
            if (f73423x2e734ef7) {
                f73424x978b416d.add(runnable);
            } else {
                f73422x940e46fc.add(runnable);
            }
        }
    }

    /* renamed from: setMethodMode */
    public static void m152640xf14a2c26() {
        f73423x2e734ef7 = true;
    }
}

package com.tencent.kinda.framework.animate;

/* loaded from: classes9.dex */
public class KindaAnimatorWatch {
    private static final java.lang.String TAG = "MicroMsg.KindaAnimatorWatch";
    private static java.util.List<java.lang.Runnable> pendingActions = new java.util.ArrayList();
    private static int pendingObj = 0;

    public static void didObjCreated(final int i17) {
        pendingObj = i17;
        com.tencent.mm.sdk.platformtools.u3.i(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.animate.KindaAnimatorWatch.2
            @Override // java.lang.Runnable
            public void run() {
                if (i17 == com.tencent.kinda.framework.animate.KindaAnimatorWatch.pendingObj) {
                    return;
                }
                java.util.Iterator it = com.tencent.kinda.framework.animate.KindaAnimatorWatch.pendingActions.iterator();
                while (it.hasNext()) {
                    ((java.lang.Runnable) it.next()).run();
                }
                com.tencent.kinda.framework.animate.KindaAnimatorWatch.pendingActions.clear();
                int unused = com.tencent.kinda.framework.animate.KindaAnimatorWatch.pendingObj = 0;
            }
        }, 5000L);
    }

    public static void didViewCreated(int i17) {
        if (i17 != pendingObj) {
            return;
        }
        final int i18 = 0;
        pendingObj = 0;
        com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.animate.KindaAnimatorWatch.3
            @Override // java.lang.Runnable
            public void run() {
                java.util.Iterator it = com.tencent.kinda.framework.animate.KindaAnimatorWatch.pendingActions.iterator();
                while (it.hasNext()) {
                    ((java.lang.Runnable) it.next()).run();
                }
                com.tencent.kinda.framework.animate.KindaAnimatorWatch.pendingActions.clear();
            }
        });
    }

    public static void post(final java.lang.Runnable runnable) {
        if (pendingObj != 0) {
            pendingActions.add(runnable);
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.animate.KindaAnimatorWatch.1
                @Override // java.lang.Runnable
                public void run() {
                    runnable.run();
                }
            });
        }
    }
}

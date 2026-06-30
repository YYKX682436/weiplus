package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1;

/* renamed from: com.tencent.thumbplayer.core.downloadproxy.utils.TVKThreadUtil */
/* loaded from: classes13.dex */
public class C26384xa7dd4815 {

    /* renamed from: mScheduler */
    private static volatile java.util.concurrent.ScheduledExecutorService f53060x71230ace;

    /* renamed from: getScheduledExecutorServiceInstance */
    public static java.util.concurrent.ScheduledExecutorService m102505x3e763920() {
        if (f53060x71230ace == null) {
            synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26384xa7dd4815.class) {
                if (f53060x71230ace == null) {
                    f53060x71230ace = java.util.concurrent.Executors.newScheduledThreadPool(4);
                }
            }
        }
        return f53060x71230ace;
    }
}

package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb;

/* renamed from: com.tencent.thumbplayer.core.common.TPThreadUtil */
/* loaded from: classes12.dex */
public class C26330x3df358c8 {
    private static final java.lang.String TAG = "PlayerCore.TPThreadUtil";

    /* renamed from: setThreadName */
    public static void m101968xd5c0edb7(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        java.lang.Thread.currentThread().setName(str);
    }

    /* renamed from: setThreadPriority */
    public static void m101969x589076d0(int i17) {
        if (i17 < -19 || i17 > 19) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, "setThreadPriority error, priority range:[-19,20], priority:" + i17);
            return;
        }
        try {
            if (android.os.Process.getThreadPriority(0) != i17) {
                android.os.Process.setThreadPriority(i17);
            }
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "setThreadPriority, priority:" + i17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, e17.toString());
        }
    }
}

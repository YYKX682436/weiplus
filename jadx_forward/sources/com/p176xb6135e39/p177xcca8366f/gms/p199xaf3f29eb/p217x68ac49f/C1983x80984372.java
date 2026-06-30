package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f;

@java.lang.Deprecated
/* renamed from: com.google.android.gms.common.stats.StatsUtils */
/* loaded from: classes12.dex */
public class C1983x80984372 {
    /* renamed from: getEventKey */
    public static java.lang.String m18499x8c6db2db(android.os.PowerManager.WakeLock wakeLock, java.lang.String str) {
        java.lang.String valueOf = java.lang.String.valueOf((android.os.Process.myPid() << 32) | java.lang.System.identityHashCode(wakeLock));
        if (true == android.text.TextUtils.isEmpty(str)) {
            str = "";
        }
        return java.lang.String.valueOf(valueOf).concat(java.lang.String.valueOf(str));
    }
}

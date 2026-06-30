package com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002;

/* renamed from: com.tencent.cloud.aicamare.util.CameraLogger */
/* loaded from: classes14.dex */
public class C2893xc5ea4935 {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.LOG_LEVEL f127398a = com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.LOG_LEVEL.LEVEL_VERBOSE;

    /* renamed from: com.tencent.cloud.aicamare.util.CameraLogger$LOG_LEVEL */
    /* loaded from: classes14.dex */
    public enum LOG_LEVEL {
        LEVEL_VERBOSE,
        LEVEL_DEBUG,
        LEVEL_INFO,
        LEVEL_WARN,
        LEVEL_ERROR,
        LEVEL_NONE
    }

    public static void a(java.lang.String str, java.lang.String str2, com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p320xf5bc2045.InterfaceC2890x6b443cba interfaceC2890x6b443cba) {
        if (com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.LOG_LEVEL.LEVEL_DEBUG.compareTo(f127398a) >= 0) {
            a(true, str, str2, interfaceC2890x6b443cba);
        }
    }

    public static void b(java.lang.String str, java.lang.String str2, com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p320xf5bc2045.InterfaceC2890x6b443cba interfaceC2890x6b443cba) {
        if (com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.LOG_LEVEL.LEVEL_ERROR.compareTo(f127398a) >= 0) {
            a(false, str, str2, interfaceC2890x6b443cba);
        }
    }

    public static void a(boolean z17, java.lang.String str, java.lang.String str2, com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p320xf5bc2045.InterfaceC2890x6b443cba interfaceC2890x6b443cba) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (z17) {
            sb6.append("[ai-camera-debug]");
        } else {
            sb6.append("[ai-camera-error]");
        }
        sb6.append(str2);
        if (interfaceC2890x6b443cba != null) {
            interfaceC2890x6b443cba.mo21576xbe97f590(str, sb6.toString());
        }
    }
}

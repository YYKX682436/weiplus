package org.p3343x72743996.p3344x2e06d1.p3348xbfc2bd01;

/* renamed from: org.chromium.base.memory.MemoryInfoBridge */
/* loaded from: classes7.dex */
public class C29401xd8df89d8 {
    /* renamed from: getActivityManagerMemoryInfoForSelf */
    public static android.os.Debug.MemoryInfo m152877xb0ac1cde() {
        try {
            android.os.Debug.MemoryInfo[] processMemoryInfo = ((android.app.ActivityManager) org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getProcessMemoryInfo(new int[]{android.os.Process.myPid()});
            if (processMemoryInfo == null) {
                return null;
            }
            return processMemoryInfo[0];
        } catch (java.lang.SecurityException unused) {
            return null;
        }
    }
}

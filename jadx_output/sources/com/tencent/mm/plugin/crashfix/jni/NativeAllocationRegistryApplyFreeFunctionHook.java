package com.tencent.mm.plugin.crashfix.jni;

/* loaded from: classes3.dex */
public class NativeAllocationRegistryApplyFreeFunctionHook {

    /* renamed from: a, reason: collision with root package name */
    public static long f96666a;

    /* renamed from: b, reason: collision with root package name */
    public static long f96667b;

    public static native long getTestMethodAddr();

    public static native void hook(java.lang.reflect.Method method, java.lang.reflect.Method method2);

    public static boolean isNeedRelease(long j17, long j18) {
        if (j17 == 0 && j18 == 0) {
            return true;
        }
        if (f96666a == j17 && f96667b == j18) {
            com.tencent.mars.xlog.Log.e("NativeAllocationRegistryApplyFreeFunctionHook", "protect succ");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1113L, 7L, 1L, false);
            return false;
        }
        f96666a = j17;
        f96667b = j18;
        return true;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1345x66a6330e.jni;

/* renamed from: com.tencent.mm.plugin.crashfix.jni.NativeAllocationRegistryApplyFreeFunctionHook */
/* loaded from: classes3.dex */
public class C13167xc1b383c1 {

    /* renamed from: a, reason: collision with root package name */
    public static long f178199a;

    /* renamed from: b, reason: collision with root package name */
    public static long f178200b;

    /* renamed from: getTestMethodAddr */
    public static native long m54627x98e8679a();

    /* renamed from: hook */
    public static native void m54628x30f523(java.lang.reflect.Method method, java.lang.reflect.Method method2);

    /* renamed from: isNeedRelease */
    public static boolean m54629xbe621f07(long j17, long j18) {
        if (j17 == 0 && j18 == 0) {
            return true;
        }
        if (f178199a == j17 && f178200b == j18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NativeAllocationRegistryApplyFreeFunctionHook", "protect succ");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1113L, 7L, 1L, false);
            return false;
        }
        f178199a = j17;
        f178200b = j18;
        return true;
    }
}

package com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p564xbfc2bd01;

/* renamed from: com.tencent.matrix.hook.memory.WVPreAllocHook */
/* loaded from: classes12.dex */
public class C4656x85382714 extends xh.b {

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p564xbfc2bd01.C4656x85382714 f134209b = new com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p564xbfc2bd01.C4656x85382714();

    /* renamed from: installHooksNative */
    private native boolean m40938x970feb4c(int i17, java.lang.ClassLoader classLoader, boolean z17);

    @Override // xh.b
    public java.lang.String a() {
        return "matrix-memoryhook";
    }

    @Override // xh.b
    public boolean b() {
        return true;
    }

    @Override // xh.b
    public boolean c(boolean z17) {
        oj.j.c("Matrix.WVPreAllocHook", "#onHook, installHooksNative: debug=" + z17, new java.lang.Object[0]);
        return m40938x970feb4c(android.os.Build.VERSION.SDK_INT, getClass().getClassLoader(), z17);
    }
}

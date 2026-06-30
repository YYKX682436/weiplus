package com.tencent.matrix.hook.memory;

/* loaded from: classes12.dex */
public class WVPreAllocHook extends xh.b {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.matrix.hook.memory.WVPreAllocHook f52676b = new com.tencent.matrix.hook.memory.WVPreAllocHook();

    private native boolean installHooksNative(int i17, java.lang.ClassLoader classLoader, boolean z17);

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
        return installHooksNative(android.os.Build.VERSION.SDK_INT, getClass().getClassLoader(), z17);
    }
}

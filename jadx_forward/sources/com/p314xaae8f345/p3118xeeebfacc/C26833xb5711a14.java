package com.p314xaae8f345.p3118xeeebfacc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/tencent/unit_rc/DefaultExecutor;", "Lcom/tencent/unit_rc/Executor;", "Ljava/lang/Runnable;", "runnable", "Ljz5/f0;", "execute", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "executor", "Ljava/util/concurrent/ExecutorService;", "<init>", "()V", "unit_rc_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.tencent.unit_rc.DefaultExecutor */
/* loaded from: classes13.dex */
public final class C26833xb5711a14 implements com.p314xaae8f345.p3118xeeebfacc.InterfaceC26835x7da05cf3 {
    private final java.util.concurrent.ExecutorService executor = java.util.concurrent.Executors.newCachedThreadPool();

    @Override // com.p314xaae8f345.p3118xeeebfacc.InterfaceC26835x7da05cf3
    /* renamed from: execute */
    public void mo106002xb158f775(java.lang.Runnable runnable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runnable, "runnable");
        java.lang.String arrays = java.util.Arrays.toString(java.lang.Thread.currentThread().getStackTrace());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(this)");
        com.p314xaae8f345.p3118xeeebfacc.C26844x5a7dc02f.m106048x3164ae("DefaultExecutor execute, stack: ".concat(arrays));
        this.executor.execute(runnable);
    }
}

package com.tencent.matrix.lifecycle;

/* loaded from: classes12.dex */
public final class m0 implements java.util.concurrent.RejectedExecutionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.lifecycle.h0 f52703a;

    public m0(com.tencent.matrix.lifecycle.h0 h0Var) {
        this.f52703a = h0Var;
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(java.lang.Runnable r17, java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
        kotlin.jvm.internal.o.f(r17, "r");
        com.tencent.matrix.lifecycle.h0 h0Var = this.f52703a;
        h0Var.getClass();
        for (java.util.Map.Entry entry : com.tencent.matrix.lifecycle.q0.f52784e.entrySet()) {
            if (!(((com.tencent.matrix.lifecycle.i0) entry.getValue()).f52699a.length() == 0)) {
                long currentTimeMillis = java.lang.System.currentTimeMillis() - ((com.tencent.matrix.lifecycle.i0) entry.getValue()).f52700b;
                if (currentTimeMillis > java.util.concurrent.TimeUnit.SECONDS.toMillis(30L)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Dispatcher Thread Not Responding:\n");
                    java.lang.StackTraceElement[] stackTrace = ((java.lang.Thread) entry.getKey()).getStackTrace();
                    kotlin.jvm.internal.o.f(stackTrace, "it.key.stackTrace");
                    for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                        sb6.append("\tat " + stackTraceElement + '\n');
                    }
                    java.lang.String sb7 = sb6.toString();
                    kotlin.jvm.internal.o.f(sb7, "StringBuilder().apply(builderAction).toString()");
                    yz5.q qVar = com.tencent.matrix.lifecycle.q0.f52780a.f52773e;
                    java.lang.String name = ((java.lang.Thread) entry.getKey()).getName();
                    kotlin.jvm.internal.o.f(name, "it.key.name");
                    qVar.invoke(name, sb7, java.lang.Long.valueOf(currentTimeMillis));
                }
            }
        }
        h0Var.f52698d.offer(r17);
    }
}

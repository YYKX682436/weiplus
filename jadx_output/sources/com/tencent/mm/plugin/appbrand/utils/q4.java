package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class q4 implements com.tencent.mm.plugin.appbrand.utils.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f90536d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.utils.p4 f90537e;

    /* renamed from: f, reason: collision with root package name */
    public final long f90538f;

    public q4(java.lang.String taskTag, com.tencent.mm.plugin.appbrand.utils.p4 task) {
        kotlin.jvm.internal.o.g(taskTag, "taskTag");
        kotlin.jvm.internal.o.g(task, "task");
        this.f90536d = taskTag;
        this.f90537e = task;
        com.tencent.mars.xlog.Log.i("MicroMsg.SimpleAsyncTaskConcurrentExecutor", "MicroMsg.SimpleAsyncTaskConcurrentExecutor|" + hashCode() + "|create|" + taskTag);
        this.f90538f = android.os.SystemClock.uptimeMillis();
    }
}

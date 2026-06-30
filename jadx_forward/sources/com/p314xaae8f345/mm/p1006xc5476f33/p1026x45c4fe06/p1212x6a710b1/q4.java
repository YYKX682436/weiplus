package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public final class q4 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f172069d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p4 f172070e;

    /* renamed from: f, reason: collision with root package name */
    public final long f172071f;

    public q4(java.lang.String taskTag, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p4 task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskTag, "taskTag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        this.f172069d = taskTag;
        this.f172070e = task;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SimpleAsyncTaskConcurrentExecutor", "MicroMsg.SimpleAsyncTaskConcurrentExecutor|" + hashCode() + "|create|" + taskTag);
        this.f172071f = android.os.SystemClock.uptimeMillis();
    }
}

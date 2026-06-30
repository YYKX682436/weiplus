package com.tencent.mm.feature.performance.scheduler;

/* loaded from: classes9.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f67726a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f67727b;

    /* renamed from: c, reason: collision with root package name */
    public volatile com.tencent.mm.feature.performance.scheduler.u f67728c;

    public z(java.lang.String jobTag) {
        kotlin.jvm.internal.o.g(jobTag, "jobTag");
        this.f67726a = jobTag;
        this.f67727b = new java.util.LinkedList();
    }

    public final void a(long j17) {
        if (!(j17 >= 24)) {
            throw new java.lang.IllegalArgumentException("schedule interval should be greater than 24 hours".toString());
        }
        this.f67728c = new com.tencent.mm.feature.performance.scheduler.u(j17, this.f67726a);
    }
}

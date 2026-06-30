package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.h32 f107846a;

    /* renamed from: b, reason: collision with root package name */
    public final long f107847b;

    public f1(r45.h32 info, long j17, int i17, kotlin.jvm.internal.i iVar) {
        j17 = (i17 & 2) != 0 ? java.lang.System.currentTimeMillis() : j17;
        kotlin.jvm.internal.o.g(info, "info");
        this.f107846a = info;
        this.f107847b = j17;
    }

    public final boolean a() {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f107847b;
        com.tencent.mm.plugin.finder.feed.model.i1 i1Var = com.tencent.mm.plugin.finder.feed.model.i1.f107930a;
        return currentTimeMillis < ((long) 600000);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.feed.model.f1)) {
            return false;
        }
        com.tencent.mm.plugin.finder.feed.model.f1 f1Var = (com.tencent.mm.plugin.finder.feed.model.f1) obj;
        return kotlin.jvm.internal.o.b(this.f107846a, f1Var.f107846a) && this.f107847b == f1Var.f107847b;
    }

    public int hashCode() {
        return (this.f107846a.hashCode() * 31) + java.lang.Long.hashCode(this.f107847b);
    }

    public java.lang.String toString() {
        return "NoticeInfoCacheItem(info=" + this.f107846a + ", timeStamp=" + this.f107847b + ')';
    }
}

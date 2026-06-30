package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes5.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f94188a;

    /* renamed from: b, reason: collision with root package name */
    public final int f94189b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f94190c;

    public b1(java.lang.String url, int i17, java.lang.String userName) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f94188a = url;
        this.f94189b = i17;
        this.f94190c = userName;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.brandservice.ui.timeline.preload.b1)) {
            return false;
        }
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.b1 b1Var = (com.tencent.mm.plugin.brandservice.ui.timeline.preload.b1) obj;
        return kotlin.jvm.internal.o.b(this.f94188a, b1Var.f94188a) && this.f94189b == b1Var.f94189b && kotlin.jvm.internal.o.b(this.f94190c, b1Var.f94190c);
    }

    public int hashCode() {
        return (((this.f94188a.hashCode() * 31) + java.lang.Integer.hashCode(this.f94189b)) * 31) + this.f94190c.hashCode();
    }

    public java.lang.String toString() {
        return "ReaderItem(url=" + this.f94188a + ", type=" + this.f94189b + ", userName=" + this.f94190c + ')';
    }
}

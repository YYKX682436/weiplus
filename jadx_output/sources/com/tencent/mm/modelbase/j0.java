package com.tencent.mm.modelbase;

/* loaded from: classes9.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.HandlerThread f70655a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f70656b;

    public j0(android.os.HandlerThread thread, com.tencent.mm.sdk.platformtools.n3 handler) {
        kotlin.jvm.internal.o.g(thread, "thread");
        kotlin.jvm.internal.o.g(handler, "handler");
        this.f70655a = thread;
        this.f70656b = handler;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.modelbase.j0)) {
            return false;
        }
        com.tencent.mm.modelbase.j0 j0Var = (com.tencent.mm.modelbase.j0) obj;
        return kotlin.jvm.internal.o.b(this.f70655a, j0Var.f70655a) && kotlin.jvm.internal.o.b(this.f70656b, j0Var.f70656b);
    }

    public int hashCode() {
        return (this.f70655a.hashCode() * 31) + this.f70656b.hashCode();
    }

    public java.lang.String toString() {
        return "HandlerData(thread=" + this.f70655a + ", handler=" + this.f70656b + ')';
    }
}

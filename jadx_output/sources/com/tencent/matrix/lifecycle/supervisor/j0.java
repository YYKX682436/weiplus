package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f52844a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f52845b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f52846c;

    public j0(boolean z17, boolean z18, java.util.List lruKillerWhiteList) {
        kotlin.jvm.internal.o.g(lruKillerWhiteList, "lruKillerWhiteList");
        this.f52844a = z17;
        this.f52845b = z18;
        this.f52846c = lruKillerWhiteList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.matrix.lifecycle.supervisor.j0)) {
            return false;
        }
        com.tencent.matrix.lifecycle.supervisor.j0 j0Var = (com.tencent.matrix.lifecycle.supervisor.j0) obj;
        return this.f52844a == j0Var.f52844a && this.f52845b == j0Var.f52845b && kotlin.jvm.internal.o.b(this.f52846c, j0Var.f52846c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        boolean z17 = this.f52844a;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        int i18 = i17 * 31;
        boolean z18 = this.f52845b;
        int i19 = (i18 + (z18 ? 1 : z18 ? 1 : 0)) * 31;
        java.util.List list = this.f52846c;
        return i19 + (list != null ? list.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "SupervisorConfig(enable=" + this.f52844a + ", autoCreate=" + this.f52845b + ", lruKillerWhiteList=" + this.f52846c + ")";
    }
}

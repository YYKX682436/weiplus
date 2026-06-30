package com.tencent.matrix.lifecycle;

/* loaded from: classes12.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.matrix.lifecycle.supervisor.j0 f52775a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f52776b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f52777c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.matrix.lifecycle.p f52778d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f52779e;

    public q(com.tencent.matrix.lifecycle.supervisor.j0 supervisorConfig, boolean z17, boolean z18, com.tencent.matrix.lifecycle.p lifecycleThreadConfig, boolean z19) {
        kotlin.jvm.internal.o.g(supervisorConfig, "supervisorConfig");
        kotlin.jvm.internal.o.g(lifecycleThreadConfig, "lifecycleThreadConfig");
        this.f52775a = supervisorConfig;
        this.f52776b = z17;
        this.f52777c = z18;
        this.f52778d = lifecycleThreadConfig;
        this.f52779e = z19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.matrix.lifecycle.q)) {
            return false;
        }
        com.tencent.matrix.lifecycle.q qVar = (com.tencent.matrix.lifecycle.q) obj;
        return kotlin.jvm.internal.o.b(this.f52775a, qVar.f52775a) && this.f52776b == qVar.f52776b && this.f52777c == qVar.f52777c && kotlin.jvm.internal.o.b(this.f52778d, qVar.f52778d) && this.f52779e == qVar.f52779e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        com.tencent.matrix.lifecycle.supervisor.j0 j0Var = this.f52775a;
        int hashCode = (j0Var != null ? j0Var.hashCode() : 0) * 31;
        boolean z17 = this.f52776b;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        int i18 = (hashCode + i17) * 31;
        boolean z18 = this.f52777c;
        int i19 = z18;
        if (z18 != 0) {
            i19 = 1;
        }
        int i27 = (i18 + i19) * 31;
        com.tencent.matrix.lifecycle.p pVar = this.f52778d;
        int hashCode2 = (i27 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        boolean z19 = this.f52779e;
        return hashCode2 + (z19 ? 1 : z19 ? 1 : 0);
    }

    public java.lang.String toString() {
        return "MatrixLifecycleConfig(supervisorConfig=" + this.f52775a + ", enableFgServiceMonitor=" + this.f52776b + ", enableOverlayWindowMonitor=" + this.f52777c + ", lifecycleThreadConfig=" + this.f52778d + ", enableLifecycleLogger=" + this.f52779e + ")";
    }
}

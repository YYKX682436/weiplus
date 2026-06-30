package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class w5 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.vs2 f105962a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f105963b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f105964c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Boolean f105965d;

    /* renamed from: e, reason: collision with root package name */
    public final long f105966e;

    public w5(r45.vs2 vs2Var, java.lang.String entrancePath, java.lang.String reportExtInfo, java.lang.Boolean bool, long j17) {
        kotlin.jvm.internal.o.g(entrancePath, "entrancePath");
        kotlin.jvm.internal.o.g(reportExtInfo, "reportExtInfo");
        this.f105962a = vs2Var;
        this.f105963b = entrancePath;
        this.f105964c = reportExtInfo;
        this.f105965d = bool;
        this.f105966e = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.extension.reddot.w5)) {
            return false;
        }
        com.tencent.mm.plugin.finder.extension.reddot.w5 w5Var = (com.tencent.mm.plugin.finder.extension.reddot.w5) obj;
        return kotlin.jvm.internal.o.b(this.f105962a, w5Var.f105962a) && kotlin.jvm.internal.o.b(this.f105963b, w5Var.f105963b) && kotlin.jvm.internal.o.b(this.f105964c, w5Var.f105964c) && kotlin.jvm.internal.o.b(this.f105965d, w5Var.f105965d) && this.f105966e == w5Var.f105966e;
    }

    public int hashCode() {
        r45.vs2 vs2Var = this.f105962a;
        int hashCode = (((((vs2Var == null ? 0 : vs2Var.hashCode()) * 31) + this.f105963b.hashCode()) * 31) + this.f105964c.hashCode()) * 31;
        java.lang.Boolean bool = this.f105965d;
        return ((hashCode + (bool != null ? bool.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.f105966e);
    }

    public java.lang.String toString() {
        return "ReportInfo(ctrlInfo=" + this.f105962a + ", entrancePath=" + this.f105963b + ", reportExtInfo=" + this.f105964c + ", is_exempt_nm_control=" + this.f105965d + ", feedId=" + this.f105966e + ')';
    }
}

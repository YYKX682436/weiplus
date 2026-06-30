package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class l6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f84753a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f84754b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f84755c;

    public l6(int i17, java.lang.String str, java.lang.String str2) {
        this.f84753a = i17;
        this.f84754b = str;
        this.f84755c = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.launching.l6)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.launching.l6 l6Var = (com.tencent.mm.plugin.appbrand.launching.l6) obj;
        return this.f84753a == l6Var.f84753a && kotlin.jvm.internal.o.b(this.f84754b, l6Var.f84754b) && kotlin.jvm.internal.o.b(this.f84755c, l6Var.f84755c);
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f84753a) * 31;
        java.lang.String str = this.f84754b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f84755c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "PreDownloadStat(scene=" + this.f84753a + ", preDownloadRequestUsername=" + this.f84754b + ", preDownloadRequestAppId=" + this.f84755c + ')';
    }
}

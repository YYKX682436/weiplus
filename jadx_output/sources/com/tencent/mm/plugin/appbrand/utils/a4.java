package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class a4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f90384a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f90385b;

    /* renamed from: c, reason: collision with root package name */
    public final int f90386c;

    public a4(java.lang.String path, java.lang.String fileName, int i17) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(fileName, "fileName");
        this.f90384a = path;
        this.f90385b = fileName;
        this.f90386c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.utils.a4)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.utils.a4 a4Var = (com.tencent.mm.plugin.appbrand.utils.a4) obj;
        return kotlin.jvm.internal.o.b(this.f90384a, a4Var.f90384a) && kotlin.jvm.internal.o.b(this.f90385b, a4Var.f90385b) && this.f90386c == a4Var.f90386c;
    }

    public int hashCode() {
        return (((this.f90384a.hashCode() * 31) + this.f90385b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f90386c);
    }

    public java.lang.String toString() {
        return "PathConversionResult(path=" + this.f90384a + ", fileName=" + this.f90385b + ", fileSize=" + this.f90386c + ')';
    }
}

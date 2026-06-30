package com.tencent.mm.plugin.appbrand;

/* loaded from: classes.dex */
public final class bd {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f77007a;

    /* renamed from: b, reason: collision with root package name */
    public int f77008b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f77009c;

    public bd(java.lang.String appId, int i17, java.util.ArrayList files) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(files, "files");
        this.f77007a = appId;
        this.f77008b = i17;
        this.f77009c = files;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.bd)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.bd bdVar = (com.tencent.mm.plugin.appbrand.bd) obj;
        return kotlin.jvm.internal.o.b(this.f77007a, bdVar.f77007a) && this.f77008b == bdVar.f77008b && kotlin.jvm.internal.o.b(this.f77009c, bdVar.f77009c);
    }

    public int hashCode() {
        return (((this.f77007a.hashCode() * 31) + java.lang.Integer.hashCode(this.f77008b)) * 31) + this.f77009c.hashCode();
    }

    public java.lang.String toString() {
        return "PkgStorageInfo(appId=" + this.f77007a + ", storageUsage=" + this.f77008b + ", files=" + this.f77009c + ')';
    }
}

package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes4.dex */
public class j3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f75604a;

    /* renamed from: b, reason: collision with root package name */
    public final int f75605b;

    public j3(java.lang.String str, int i17) {
        this.f75604a = str;
        this.f75605b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.tencent.mm.plugin.appbrand.appcache.j3.class != obj.getClass()) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.appcache.j3 j3Var = (com.tencent.mm.plugin.appbrand.appcache.j3) obj;
        return this.f75605b == j3Var.f75605b && this.f75604a.equals(j3Var.f75604a);
    }

    public int hashCode() {
        return java.util.Objects.hash(this.f75604a, java.lang.Integer.valueOf(this.f75605b));
    }

    public java.lang.String toString() {
        return "AppPkg{appId='" + this.f75604a + "', versionType=" + this.f75605b + '}';
    }
}

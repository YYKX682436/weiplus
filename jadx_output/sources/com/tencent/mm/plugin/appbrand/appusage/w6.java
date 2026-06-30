package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes3.dex */
public final class w6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f76623a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f76624b;

    /* renamed from: c, reason: collision with root package name */
    public final int f76625c;

    public w6(java.lang.String userName, java.lang.String appId, int i17) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f76623a = userName;
        this.f76624b = appId;
        this.f76625c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.appusage.w6)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.appusage.w6 w6Var = (com.tencent.mm.plugin.appbrand.appusage.w6) obj;
        return kotlin.jvm.internal.o.b(this.f76623a, w6Var.f76623a) && kotlin.jvm.internal.o.b(this.f76624b, w6Var.f76624b) && this.f76625c == w6Var.f76625c;
    }

    public int hashCode() {
        return (((this.f76623a.hashCode() * 31) + this.f76624b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f76625c);
    }

    public java.lang.String toString() {
        return "WxaInfo(userName=" + this.f76623a + ", appId=" + this.f76624b + ", versionType=" + this.f76625c + ')';
    }
}

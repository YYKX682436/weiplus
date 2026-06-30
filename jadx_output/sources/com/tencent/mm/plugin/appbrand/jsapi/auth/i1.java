package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f79583a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f79584b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f79585c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f79586d;

    public i1(int i17, java.lang.String str, java.util.List list, boolean z17, int i18, kotlin.jvm.internal.i iVar) {
        str = (i18 & 2) != 0 ? null : str;
        list = (i18 & 4) != 0 ? null : list;
        z17 = (i18 & 8) != 0 ? false : z17;
        this.f79583a = i17;
        this.f79584b = str;
        this.f79585c = list;
        this.f79586d = z17;
    }

    public final java.lang.String a() {
        return this.f79584b;
    }

    public final int b() {
        return this.f79583a;
    }

    public final java.util.List c() {
        return this.f79585c;
    }

    public final boolean d() {
        return this.f79586d;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.auth.i1)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.auth.i1 i1Var = (com.tencent.mm.plugin.appbrand.jsapi.auth.i1) obj;
        return this.f79583a == i1Var.f79583a && kotlin.jvm.internal.o.b(this.f79584b, i1Var.f79584b) && kotlin.jvm.internal.o.b(this.f79585c, i1Var.f79585c) && this.f79586d == i1Var.f79586d;
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f79583a) * 31;
        java.lang.String str = this.f79584b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.util.List list = this.f79585c;
        return ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f79586d);
    }

    public java.lang.String toString() {
        return "UserPromptResult(resultCode=" + this.f79583a + ", errMsg=" + this.f79584b + ", selectedScopes=" + this.f79585c + ", userAgreementChecked=" + this.f79586d + ')';
    }
}

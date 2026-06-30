package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes8.dex */
public final class g9 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f183738a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f183739b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f183740c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f183741d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f183742e;

    public g9(java.lang.String description, byte[] bArr, java.lang.String str, boolean z17, boolean z18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        bArr = (i17 & 2) != 0 ? null : bArr;
        str = (i17 & 4) != 0 ? null : str;
        z17 = (i17 & 8) != 0 ? true : z17;
        z18 = (i17 & 16) != 0 ? false : z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(description, "description");
        this.f183738a = description;
        this.f183739b = bArr;
        this.f183740c = str;
        this.f183741d = z17;
        this.f183742e = z18;
    }

    /* renamed from: equals */
    public boolean m55481xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g9)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g9 g9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g9) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f183738a, g9Var.f183738a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f183739b, g9Var.f183739b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f183740c, g9Var.f183740c) && this.f183741d == g9Var.f183741d && this.f183742e == g9Var.f183742e;
    }

    /* renamed from: hashCode */
    public int m55482x8cdac1b() {
        int hashCode = this.f183738a.hashCode() * 31;
        byte[] bArr = this.f183739b;
        int hashCode2 = (hashCode + (bArr == null ? 0 : java.util.Arrays.hashCode(bArr))) * 31;
        java.lang.String str = this.f183740c;
        return ((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f183741d)) * 31) + java.lang.Boolean.hashCode(this.f183742e);
    }

    /* renamed from: toString */
    public java.lang.String m55483x9616526c() {
        return "PreCheckInfo(description=" + this.f183738a + ", mediaSdkInfo=" + java.util.Arrays.toString(this.f183739b) + ", shortTitle=" + this.f183740c + ", handleErr=" + this.f183741d + ", ignoreErr=" + this.f183742e + ')';
    }
}

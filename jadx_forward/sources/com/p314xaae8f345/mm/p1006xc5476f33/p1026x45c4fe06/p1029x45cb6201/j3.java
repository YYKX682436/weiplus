package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes4.dex */
public class j3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f157137a;

    /* renamed from: b, reason: collision with root package name */
    public final int f157138b;

    public j3(java.lang.String str, int i17) {
        this.f157137a = str;
        this.f157138b = i17;
    }

    /* renamed from: equals */
    public boolean m49348xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.j3.class != obj.getClass()) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.j3 j3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.j3) obj;
        return this.f157138b == j3Var.f157138b && this.f157137a.equals(j3Var.f157137a);
    }

    /* renamed from: hashCode */
    public int m49349x8cdac1b() {
        return java.util.Objects.hash(this.f157137a, java.lang.Integer.valueOf(this.f157138b));
    }

    /* renamed from: toString */
    public java.lang.String m49350x9616526c() {
        return "AppPkg{appId='" + this.f157137a + "', versionType=" + this.f157138b + '}';
    }
}

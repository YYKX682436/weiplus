package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.q2 f294799a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f294800b;

    /* renamed from: c, reason: collision with root package name */
    public final int f294801c;

    public z2(com.p314xaae8f345.mm.vfs.q2 q2Var, java.lang.String str, int i17, com.p314xaae8f345.mm.vfs.r2 r2Var) {
        this.f294799a = q2Var;
        this.f294800b = str;
        this.f294801c = i17;
    }

    public boolean a() {
        return this.f294799a != null;
    }

    /* renamed from: equals */
    public boolean m82493xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.vfs.z2)) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.z2 z2Var = (com.p314xaae8f345.mm.vfs.z2) obj;
        if (a() != z2Var.a()) {
            return false;
        }
        return com.p314xaae8f345.mm.vfs.e8.f(this.f294799a, z2Var.f294799a) && com.p314xaae8f345.mm.vfs.e8.f(this.f294800b, z2Var.f294800b);
    }

    /* renamed from: hashCode */
    public int m82494x8cdac1b() {
        if (!a()) {
            return 0;
        }
        java.lang.Object[] objArr = {this.f294799a, this.f294800b};
        java.util.regex.Pattern pattern = com.p314xaae8f345.mm.vfs.e8.f294450a;
        return java.util.Arrays.deepHashCode(objArr);
    }

    /* renamed from: toString */
    public java.lang.String m82495x9616526c() {
        if (!a()) {
            return "[INVALID]";
        }
        return this.f294800b + " -> " + this.f294799a;
    }
}

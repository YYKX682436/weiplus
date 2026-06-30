package com.p176xb6135e39.p280x308fcb.p281x21ffc6bd;

/* loaded from: classes16.dex */
public final class b0 implements java.util.Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 f126235d;

    /* renamed from: e, reason: collision with root package name */
    public com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 f126236e;

    /* renamed from: f, reason: collision with root package name */
    public com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 f126237f;

    /* renamed from: g, reason: collision with root package name */
    public com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 f126238g;

    /* renamed from: h, reason: collision with root package name */
    public com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 f126239h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object f126240i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f126241m;

    /* renamed from: n, reason: collision with root package name */
    public int f126242n;

    public b0() {
        this.f126240i = null;
        this.f126239h = this;
        this.f126238g = this;
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object obj2 = this.f126240i;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        java.lang.Object obj3 = this.f126241m;
        if (obj3 == null) {
            if (entry.getValue() != null) {
                return false;
            }
        } else if (!obj3.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getKey() {
        return this.f126240i;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        return this.f126241m;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        java.lang.Object obj = this.f126240i;
        int hashCode = obj == null ? 0 : obj.hashCode();
        java.lang.Object obj2 = this.f126241m;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        java.lang.Object obj2 = this.f126241m;
        this.f126241m = obj;
        return obj2;
    }

    /* renamed from: toString */
    public java.lang.String m20479x9616526c() {
        return this.f126240i + "=" + this.f126241m;
    }

    public b0(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var, java.lang.Object obj, com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var2, com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var3) {
        this.f126235d = b0Var;
        this.f126240i = obj;
        this.f126242n = 1;
        this.f126238g = b0Var2;
        this.f126239h = b0Var3;
        b0Var3.f126238g = this;
        b0Var2.f126239h = this;
    }
}

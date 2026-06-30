package com.google.gson.internal;

/* loaded from: classes16.dex */
public final class b0 implements java.util.Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public com.google.gson.internal.b0 f44702d;

    /* renamed from: e, reason: collision with root package name */
    public com.google.gson.internal.b0 f44703e;

    /* renamed from: f, reason: collision with root package name */
    public com.google.gson.internal.b0 f44704f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.gson.internal.b0 f44705g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.gson.internal.b0 f44706h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object f44707i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f44708m;

    /* renamed from: n, reason: collision with root package name */
    public int f44709n;

    public b0() {
        this.f44707i = null;
        this.f44706h = this;
        this.f44705g = this;
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object obj2 = this.f44707i;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        java.lang.Object obj3 = this.f44708m;
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
        return this.f44707i;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        return this.f44708m;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        java.lang.Object obj = this.f44707i;
        int hashCode = obj == null ? 0 : obj.hashCode();
        java.lang.Object obj2 = this.f44708m;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        java.lang.Object obj2 = this.f44708m;
        this.f44708m = obj;
        return obj2;
    }

    public java.lang.String toString() {
        return this.f44707i + "=" + this.f44708m;
    }

    public b0(com.google.gson.internal.b0 b0Var, java.lang.Object obj, com.google.gson.internal.b0 b0Var2, com.google.gson.internal.b0 b0Var3) {
        this.f44702d = b0Var;
        this.f44707i = obj;
        this.f44709n = 1;
        this.f44705g = b0Var2;
        this.f44706h = b0Var3;
        b0Var3.f44705g = this;
        b0Var2.f44706h = this;
    }
}

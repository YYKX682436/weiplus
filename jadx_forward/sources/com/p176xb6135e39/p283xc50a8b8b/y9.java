package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class y9 implements java.util.Map.Entry, java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Comparable f127279d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f127280e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.ba f127281f;

    public y9(com.p176xb6135e39.p283xc50a8b8b.ba baVar, java.lang.Comparable comparable, java.lang.Object obj) {
        this.f127281f = baVar;
        this.f127279d = comparable;
        this.f127280e = obj;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return this.f127279d.compareTo(((com.p176xb6135e39.p283xc50a8b8b.y9) obj).f127279d);
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object key = entry.getKey();
        java.lang.Comparable comparable = this.f127279d;
        if (comparable == null ? key == null : comparable.equals(key)) {
            java.lang.Object obj2 = this.f127280e;
            java.lang.Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getKey() {
        return this.f127279d;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        return this.f127280e;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        java.lang.Comparable comparable = this.f127279d;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        java.lang.Object obj = this.f127280e;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        this.f127281f.b();
        java.lang.Object obj2 = this.f127280e;
        this.f127280e = obj;
        return obj2;
    }

    /* renamed from: toString */
    public java.lang.String m20966x9616526c() {
        java.lang.String valueOf = java.lang.String.valueOf(this.f127279d);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.f127280e);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb6.append(valueOf);
        sb6.append("=");
        sb6.append(valueOf2);
        return sb6.toString();
    }
}

package com.google.protobuf;

/* loaded from: classes16.dex */
public class y9 implements java.util.Map.Entry, java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Comparable f45746d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f45747e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.google.protobuf.ba f45748f;

    public y9(com.google.protobuf.ba baVar, java.lang.Comparable comparable, java.lang.Object obj) {
        this.f45748f = baVar;
        this.f45746d = comparable;
        this.f45747e = obj;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return this.f45746d.compareTo(((com.google.protobuf.y9) obj).f45746d);
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
        java.lang.Comparable comparable = this.f45746d;
        if (comparable == null ? key == null : comparable.equals(key)) {
            java.lang.Object obj2 = this.f45747e;
            java.lang.Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getKey() {
        return this.f45746d;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        return this.f45747e;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        java.lang.Comparable comparable = this.f45746d;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        java.lang.Object obj = this.f45747e;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        this.f45748f.b();
        java.lang.Object obj2 = this.f45747e;
        this.f45747e = obj;
        return obj2;
    }

    public java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.f45746d);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.f45747e);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb6.append(valueOf);
        sb6.append("=");
        sb6.append(valueOf2);
        return sb6.toString();
    }
}

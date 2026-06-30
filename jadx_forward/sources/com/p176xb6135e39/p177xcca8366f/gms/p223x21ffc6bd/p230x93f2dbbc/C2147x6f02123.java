package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzabd */
/* loaded from: classes13.dex */
public final class C2147x6f02123 implements java.lang.Comparable, java.util.Map.Entry {

    /* renamed from: value */
    private java.lang.Object f6301x6ac9171;

    /* renamed from: zzbue */
    private final java.lang.Comparable f6302x6f02732;

    /* renamed from: zzbuf */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2142x6f02119 f6303x6f02733;

    public C2147x6f02123(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2142x6f02119 c2142x6f02119, java.lang.Comparable comparable, java.lang.Object obj) {
        this.f6303x6f02733 = c2142x6f02119;
        this.f6302x6f02732 = comparable;
        this.f6301x6ac9171 = obj;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        return ((java.lang.Comparable) getKey()).compareTo((java.lang.Comparable) ((com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2147x6f02123) obj).getKey());
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return m18875xb2c87fbf(this.f6302x6f02732, entry.getKey()) && m18875xb2c87fbf(this.f6301x6ac9171, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ java.lang.Object getKey() {
        return this.f6302x6f02732;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.f6301x6ac9171;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        java.lang.Comparable comparable = this.f6302x6f02732;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        java.lang.Object obj = this.f6301x6ac9171;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        this.f6303x6f02733.m18865x394dd7();
        java.lang.Object obj2 = this.f6301x6ac9171;
        this.f6301x6ac9171 = obj;
        return obj2;
    }

    /* renamed from: toString */
    public final java.lang.String m18876x9616526c() {
        java.lang.String valueOf = java.lang.String.valueOf(this.f6302x6f02732);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.f6301x6ac9171);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb6.append(valueOf);
        sb6.append("=");
        sb6.append(valueOf2);
        return sb6.toString();
    }

    public C2147x6f02123(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2142x6f02119 c2142x6f02119, java.util.Map.Entry entry) {
        this(c2142x6f02119, (java.lang.Comparable) entry.getKey(), entry.getValue());
    }

    /* renamed from: equals */
    private static boolean m18875xb2c87fbf(java.lang.Object obj, java.lang.Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }
}

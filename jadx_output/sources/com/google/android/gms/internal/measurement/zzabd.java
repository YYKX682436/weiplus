package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzabd implements java.lang.Comparable, java.util.Map.Entry {
    private java.lang.Object value;
    private final java.lang.Comparable zzbue;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzaay zzbuf;

    public zzabd(com.google.android.gms.internal.measurement.zzaay zzaayVar, java.lang.Comparable comparable, java.lang.Object obj) {
        this.zzbuf = zzaayVar;
        this.zzbue = comparable;
        this.value = obj;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        return ((java.lang.Comparable) getKey()).compareTo((java.lang.Comparable) ((com.google.android.gms.internal.measurement.zzabd) obj).getKey());
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
        return equals(this.zzbue, entry.getKey()) && equals(this.value, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ java.lang.Object getKey() {
        return this.zzbue;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        java.lang.Comparable comparable = this.zzbue;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        java.lang.Object obj = this.value;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        this.zzbuf.zzul();
        java.lang.Object obj2 = this.value;
        this.value = obj;
        return obj2;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zzbue);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.value);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb6.append(valueOf);
        sb6.append("=");
        sb6.append(valueOf2);
        return sb6.toString();
    }

    public zzabd(com.google.android.gms.internal.measurement.zzaay zzaayVar, java.util.Map.Entry entry) {
        this(zzaayVar, (java.lang.Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean equals(java.lang.Object obj, java.lang.Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }
}

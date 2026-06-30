package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public final class zzwz extends com.google.android.gms.internal.measurement.zzws<java.lang.Double> {
    public zzwz(com.google.android.gms.internal.measurement.zzxc zzxcVar, java.lang.String str, java.lang.Double d17) {
        super(zzxcVar, str, d17, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.zzws
    /* renamed from: zzfb, reason: merged with bridge method [inline-methods] */
    public final java.lang.Double zzey(java.lang.String str) {
        try {
            return java.lang.Double.valueOf(java.lang.Double.parseDouble(str));
        } catch (java.lang.NumberFormatException unused) {
            new java.lang.StringBuilder(java.lang.String.valueOf(this.zzbnh).length() + 27 + java.lang.String.valueOf(str).length());
            return null;
        }
    }
}

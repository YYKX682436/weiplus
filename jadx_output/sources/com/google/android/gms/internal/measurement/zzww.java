package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public final class zzww extends com.google.android.gms.internal.measurement.zzws<java.lang.Long> {
    public zzww(com.google.android.gms.internal.measurement.zzxc zzxcVar, java.lang.String str, java.lang.Long l17) {
        super(zzxcVar, str, l17, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.zzws
    /* renamed from: zzez, reason: merged with bridge method [inline-methods] */
    public final java.lang.Long zzey(java.lang.String str) {
        try {
            return java.lang.Long.valueOf(java.lang.Long.parseLong(str));
        } catch (java.lang.NumberFormatException unused) {
            new java.lang.StringBuilder(java.lang.String.valueOf(this.zzbnh).length() + 25 + java.lang.String.valueOf(str).length());
            return null;
        }
    }
}

package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public final class zzwx extends com.google.android.gms.internal.measurement.zzws<java.lang.Integer> {
    public zzwx(com.google.android.gms.internal.measurement.zzxc zzxcVar, java.lang.String str, java.lang.Integer num) {
        super(zzxcVar, str, num, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.zzws
    /* renamed from: zzfa, reason: merged with bridge method [inline-methods] */
    public final java.lang.Integer zzey(java.lang.String str) {
        try {
            return java.lang.Integer.valueOf(java.lang.Integer.parseInt(str));
        } catch (java.lang.NumberFormatException unused) {
            new java.lang.StringBuilder(java.lang.String.valueOf(this.zzbnh).length() + 28 + java.lang.String.valueOf(str).length());
            return null;
        }
    }
}

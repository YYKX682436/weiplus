package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public final class zzwy extends com.google.android.gms.internal.measurement.zzws<java.lang.Boolean> {
    public zzwy(com.google.android.gms.internal.measurement.zzxc zzxcVar, java.lang.String str, java.lang.Boolean bool) {
        super(zzxcVar, str, bool, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final /* synthetic */ java.lang.Boolean zzey(java.lang.String str) {
        if (com.google.android.gms.internal.measurement.zzwn.zzbmi.matcher(str).matches()) {
            return java.lang.Boolean.TRUE;
        }
        if (com.google.android.gms.internal.measurement.zzwn.zzbmj.matcher(str).matches()) {
            return java.lang.Boolean.FALSE;
        }
        new java.lang.StringBuilder(java.lang.String.valueOf(this.zzbnh).length() + 28 + java.lang.String.valueOf(str).length());
        return null;
    }
}

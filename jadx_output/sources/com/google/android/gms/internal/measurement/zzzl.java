package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
final class zzzl {
    private static final com.google.android.gms.internal.measurement.zzzj<?> zzbrq = new com.google.android.gms.internal.measurement.zzzk();
    private static final com.google.android.gms.internal.measurement.zzzj<?> zzbrr = zztf();

    private static com.google.android.gms.internal.measurement.zzzj<?> zztf() {
        try {
            int i17 = com.google.protobuf.v4.f45611b;
            return (com.google.android.gms.internal.measurement.zzzj) com.google.protobuf.v4.class.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static com.google.android.gms.internal.measurement.zzzj<?> zztg() {
        return zzbrq;
    }

    public static com.google.android.gms.internal.measurement.zzzj<?> zzth() {
        com.google.android.gms.internal.measurement.zzzj<?> zzzjVar = zzbrr;
        if (zzzjVar != null) {
            return zzzjVar;
        }
        throw new java.lang.IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}

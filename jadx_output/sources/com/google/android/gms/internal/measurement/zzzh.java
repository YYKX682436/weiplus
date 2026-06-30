package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
final class zzzh {
    private static final java.lang.Class<?> zzbrl = zztb();

    private static final com.google.android.gms.internal.measurement.zzzi zzfj(java.lang.String str) {
        return (com.google.android.gms.internal.measurement.zzzi) zzbrl.getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
    }

    private static java.lang.Class<?> zztb() {
        try {
            com.google.protobuf.q4 q4Var = com.google.protobuf.q4.f45446e;
            return com.google.protobuf.q4.class;
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }

    public static com.google.android.gms.internal.measurement.zzzi zztc() {
        if (zzbrl != null) {
            try {
                return zzfj("getEmptyRegistry");
            } catch (java.lang.Exception unused) {
            }
        }
        return com.google.android.gms.internal.measurement.zzzi.zzbro;
    }
}

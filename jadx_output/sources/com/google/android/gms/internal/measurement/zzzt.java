package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
public final class zzzt extends java.io.IOException {
    private com.google.android.gms.internal.measurement.zzaal zzbst;

    public zzzt(java.lang.String str) {
        super(str);
        this.zzbst = null;
    }

    public static com.google.android.gms.internal.measurement.zzzt zztm() {
        return new com.google.android.gms.internal.measurement.zzzt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static com.google.android.gms.internal.measurement.zzzt zztn() {
        return new com.google.android.gms.internal.measurement.zzzt("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
}

package com.google.android.gms.internal.wearable;

/* loaded from: classes16.dex */
public final class zzs extends java.io.IOException {
    public zzs(java.lang.String str) {
        super(str);
    }

    public static com.google.android.gms.internal.wearable.zzs zzu() {
        return new com.google.android.gms.internal.wearable.zzs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public static com.google.android.gms.internal.wearable.zzs zzv() {
        return new com.google.android.gms.internal.wearable.zzs("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static com.google.android.gms.internal.wearable.zzs zzw() {
        return new com.google.android.gms.internal.wearable.zzs("CodedInputStream encountered a malformed varint.");
    }
}

package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzacd extends java.io.IOException {
    public zzacd(java.lang.String str) {
        super(str);
    }

    public static com.google.android.gms.internal.measurement.zzacd zzvh() {
        return new com.google.android.gms.internal.measurement.zzacd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public static com.google.android.gms.internal.measurement.zzacd zzvi() {
        return new com.google.android.gms.internal.measurement.zzacd("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static com.google.android.gms.internal.measurement.zzacd zzvj() {
        return new com.google.android.gms.internal.measurement.zzacd("CodedInputStream encountered a malformed varint.");
    }

    public static com.google.android.gms.internal.measurement.zzacd zzvk() {
        return new com.google.android.gms.internal.measurement.zzacd("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}

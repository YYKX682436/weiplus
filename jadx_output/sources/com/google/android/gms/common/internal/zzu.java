package com.google.android.gms.common.internal;

/* loaded from: classes8.dex */
public final class zzu {
    private static final android.net.Uri zza;
    private static final android.net.Uri zzb;

    static {
        android.net.Uri parse = android.net.Uri.parse("https://plus.google.com/");
        zza = parse;
        zzb = parse.buildUpon().appendPath("circles").appendPath("find").build();
    }
}

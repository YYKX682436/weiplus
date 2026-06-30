package com.google.android.gms.common.util;

/* loaded from: classes13.dex */
public final class CrashUtils {
    private static final java.lang.String[] zza = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static boolean addDynamiteErrorToDropBox(android.content.Context context, java.lang.Throwable th6) {
        try {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(th6);
            return false;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}

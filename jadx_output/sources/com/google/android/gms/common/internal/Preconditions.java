package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
public final class Preconditions {
    private Preconditions() {
        throw new java.lang.AssertionError("Uninstantiable");
    }

    public static void checkArgument(boolean z17) {
        if (!z17) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public static double checkArgumentInRange(double d17, double d18, double d19, java.lang.String str) {
        if (d17 < d18) {
            throw new java.lang.IllegalArgumentException(zza("%s is out of range of [%f, %f] (too low)", str, java.lang.Double.valueOf(d18), java.lang.Double.valueOf(d19)));
        }
        if (d17 <= d19) {
            return d17;
        }
        throw new java.lang.IllegalArgumentException(zza("%s is out of range of [%f, %f] (too high)", str, java.lang.Double.valueOf(d18), java.lang.Double.valueOf(d19)));
    }

    public static void checkHandlerThread(android.os.Handler handler) {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            java.lang.String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            throw new java.lang.IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static void checkMainThread() {
        checkMainThread("Must be called on the main application thread");
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    public static java.lang.String checkNotEmpty(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    public static void checkNotGoogleApiHandlerThread() {
        checkNotGoogleApiHandlerThread("Must not be called on GoogleApiHandler thread.");
    }

    public static void checkNotMainThread() {
        checkNotMainThread("Must not be called on the main application thread");
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    public static <T> T checkNotNull(T t17) {
        if (t17 != null) {
            return t17;
        }
        throw new java.lang.NullPointerException("null reference");
    }

    public static int checkNotZero(int i17) {
        if (i17 != 0) {
            return i17;
        }
        throw new java.lang.IllegalArgumentException("Given Integer is zero");
    }

    public static void checkState(boolean z17) {
        if (!z17) {
            throw new java.lang.IllegalStateException();
        }
    }

    public static java.lang.String zza(java.lang.String str, java.lang.Object... objArr) {
        int indexOf;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str.length() + 48);
        int i17 = 0;
        int i18 = 0;
        while (i17 < 3 && (indexOf = str.indexOf("%s", i18)) != -1) {
            sb6.append(str.substring(i18, indexOf));
            sb6.append(objArr[i17]);
            i18 = indexOf + 2;
            i17++;
        }
        sb6.append(str.substring(i18));
        if (i17 < 3) {
            sb6.append(" [");
            sb6.append(objArr[i17]);
            for (int i19 = i17 + 1; i19 < 3; i19++) {
                sb6.append(", ");
                sb6.append(objArr[i19]);
            }
            sb6.append("]");
        }
        return sb6.toString();
    }

    public static void checkArgument(boolean z17, java.lang.Object obj) {
        if (!z17) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
        }
    }

    public static void checkMainThread(java.lang.String str) {
        if (!com.google.android.gms.common.util.zzb.zza()) {
            throw new java.lang.IllegalStateException(str);
        }
    }

    public static void checkNotGoogleApiHandlerThread(java.lang.String str) {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper != null) {
            java.lang.String name = myLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                throw new java.lang.IllegalStateException(str);
            }
        }
    }

    public static void checkNotMainThread(java.lang.String str) {
        if (com.google.android.gms.common.util.zzb.zza()) {
            throw new java.lang.IllegalStateException(str);
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    public static <T> T checkNotNull(T t17, java.lang.Object obj) {
        if (t17 != null) {
            return t17;
        }
        throw new java.lang.NullPointerException(java.lang.String.valueOf(obj));
    }

    public static int checkNotZero(int i17, java.lang.Object obj) {
        if (i17 != 0) {
            return i17;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
    }

    public static void checkState(boolean z17, java.lang.Object obj) {
        if (!z17) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(obj));
        }
    }

    public static void checkArgument(boolean z17, java.lang.String str, java.lang.Object... objArr) {
        if (!z17) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(str, objArr));
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    public static java.lang.String checkNotEmpty(java.lang.String str, java.lang.Object obj) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
        }
        return str;
    }

    public static long checkNotZero(long j17) {
        if (j17 != 0) {
            return j17;
        }
        throw new java.lang.IllegalArgumentException("Given Long is zero");
    }

    public static void checkState(boolean z17, java.lang.String str, java.lang.Object... objArr) {
        if (!z17) {
            throw new java.lang.IllegalStateException(java.lang.String.format(str, objArr));
        }
    }

    public static float checkArgumentInRange(float f17, float f18, float f19, java.lang.String str) {
        if (f17 < f18) {
            throw new java.lang.IllegalArgumentException(zza("%s is out of range of [%f, %f] (too low)", str, java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f19)));
        }
        if (f17 <= f19) {
            return f17;
        }
        throw new java.lang.IllegalArgumentException(zza("%s is out of range of [%f, %f] (too high)", str, java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f19)));
    }

    public static long checkNotZero(long j17, java.lang.Object obj) {
        if (j17 != 0) {
            return j17;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
    }

    public static void checkHandlerThread(android.os.Handler handler, java.lang.String str) {
        if (android.os.Looper.myLooper() != handler.getLooper()) {
            throw new java.lang.IllegalStateException(str);
        }
    }

    public static int checkArgumentInRange(int i17, int i18, int i19, java.lang.String str) {
        if (i17 < i18) {
            throw new java.lang.IllegalArgumentException(zza("%s is out of range of [%d, %d] (too low)", str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)));
        }
        if (i17 <= i19) {
            return i17;
        }
        throw new java.lang.IllegalArgumentException(zza("%s is out of range of [%d, %d] (too high)", str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)));
    }

    public static long checkArgumentInRange(long j17, long j18, long j19, java.lang.String str) {
        if (j17 < j18) {
            throw new java.lang.IllegalArgumentException(zza("%s is out of range of [%d, %d] (too low)", str, java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19)));
        }
        if (j17 <= j19) {
            return j17;
        }
        throw new java.lang.IllegalArgumentException(zza("%s is out of range of [%d, %d] (too high)", str, java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19)));
    }
}

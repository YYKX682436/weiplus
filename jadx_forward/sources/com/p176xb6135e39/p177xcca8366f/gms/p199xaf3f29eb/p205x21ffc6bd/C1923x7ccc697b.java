package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* renamed from: com.google.android.gms.common.internal.Preconditions */
/* loaded from: classes13.dex */
public final class C1923x7ccc697b {
    private C1923x7ccc697b() {
        throw new java.lang.AssertionError("Uninstantiable");
    }

    /* renamed from: checkArgument */
    public static void m18197x312c1fe5(boolean z17) {
        if (!z17) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    /* renamed from: checkArgumentInRange */
    public static double m18200x6c3d6773(double d17, double d18, double d19, java.lang.String str) {
        if (d17 < d18) {
            throw new java.lang.IllegalArgumentException(zza("%s is out of range of [%f, %f] (too low)", str, java.lang.Double.valueOf(d18), java.lang.Double.valueOf(d19)));
        }
        if (d17 <= d19) {
            return d17;
        }
        throw new java.lang.IllegalArgumentException(zza("%s is out of range of [%f, %f] (too high)", str, java.lang.Double.valueOf(d18), java.lang.Double.valueOf(d19)));
    }

    /* renamed from: checkHandlerThread */
    public static void m18204x226e9cc(android.os.Handler handler) {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            java.lang.String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            throw new java.lang.IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    /* renamed from: checkMainThread */
    public static void m18206x6483284b() {
        m18207x6483284b("Must be called on the main application thread");
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    /* renamed from: checkNotEmpty */
    public static java.lang.String m18208xec737762(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    /* renamed from: checkNotGoogleApiHandlerThread */
    public static void m18210x29128cde() {
        m18211x29128cde("Must not be called on GoogleApiHandler thread.");
    }

    /* renamed from: checkNotMainThread */
    public static void m18212xfcae242e() {
        m18213xfcae242e("Must not be called on the main application thread");
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    /* renamed from: checkNotNull */
    public static <T> T m18214x7b41bcd2(T t17) {
        if (t17 != null) {
            return t17;
        }
        throw new java.lang.NullPointerException("null reference");
    }

    /* renamed from: checkNotZero */
    public static int m18216x7b46f5f3(int i17) {
        if (i17 != 0) {
            return i17;
        }
        throw new java.lang.IllegalArgumentException("Given Integer is zero");
    }

    /* renamed from: checkState */
    public static void m18220xe071d469(boolean z17) {
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

    /* renamed from: checkArgument */
    public static void m18198x312c1fe5(boolean z17, java.lang.Object obj) {
        if (!z17) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
        }
    }

    /* renamed from: checkMainThread */
    public static void m18207x6483284b(java.lang.String str) {
        if (!com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.zzb.zza()) {
            throw new java.lang.IllegalStateException(str);
        }
    }

    /* renamed from: checkNotGoogleApiHandlerThread */
    public static void m18211x29128cde(java.lang.String str) {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper != null) {
            java.lang.String name = myLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                throw new java.lang.IllegalStateException(str);
            }
        }
    }

    /* renamed from: checkNotMainThread */
    public static void m18213xfcae242e(java.lang.String str) {
        if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.zzb.zza()) {
            throw new java.lang.IllegalStateException(str);
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    /* renamed from: checkNotNull */
    public static <T> T m18215x7b41bcd2(T t17, java.lang.Object obj) {
        if (t17 != null) {
            return t17;
        }
        throw new java.lang.NullPointerException(java.lang.String.valueOf(obj));
    }

    /* renamed from: checkNotZero */
    public static int m18217x7b46f5f3(int i17, java.lang.Object obj) {
        if (i17 != 0) {
            return i17;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
    }

    /* renamed from: checkState */
    public static void m18221xe071d469(boolean z17, java.lang.Object obj) {
        if (!z17) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(obj));
        }
    }

    /* renamed from: checkArgument */
    public static void m18199x312c1fe5(boolean z17, java.lang.String str, java.lang.Object... objArr) {
        if (!z17) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(str, objArr));
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    /* renamed from: checkNotEmpty */
    public static java.lang.String m18209xec737762(java.lang.String str, java.lang.Object obj) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
        }
        return str;
    }

    /* renamed from: checkNotZero */
    public static long m18218x7b46f5f3(long j17) {
        if (j17 != 0) {
            return j17;
        }
        throw new java.lang.IllegalArgumentException("Given Long is zero");
    }

    /* renamed from: checkState */
    public static void m18222xe071d469(boolean z17, java.lang.String str, java.lang.Object... objArr) {
        if (!z17) {
            throw new java.lang.IllegalStateException(java.lang.String.format(str, objArr));
        }
    }

    /* renamed from: checkArgumentInRange */
    public static float m18201x6c3d6773(float f17, float f18, float f19, java.lang.String str) {
        if (f17 < f18) {
            throw new java.lang.IllegalArgumentException(zza("%s is out of range of [%f, %f] (too low)", str, java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f19)));
        }
        if (f17 <= f19) {
            return f17;
        }
        throw new java.lang.IllegalArgumentException(zza("%s is out of range of [%f, %f] (too high)", str, java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f19)));
    }

    /* renamed from: checkNotZero */
    public static long m18219x7b46f5f3(long j17, java.lang.Object obj) {
        if (j17 != 0) {
            return j17;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
    }

    /* renamed from: checkHandlerThread */
    public static void m18205x226e9cc(android.os.Handler handler, java.lang.String str) {
        if (android.os.Looper.myLooper() != handler.getLooper()) {
            throw new java.lang.IllegalStateException(str);
        }
    }

    /* renamed from: checkArgumentInRange */
    public static int m18202x6c3d6773(int i17, int i18, int i19, java.lang.String str) {
        if (i17 < i18) {
            throw new java.lang.IllegalArgumentException(zza("%s is out of range of [%d, %d] (too low)", str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)));
        }
        if (i17 <= i19) {
            return i17;
        }
        throw new java.lang.IllegalArgumentException(zza("%s is out of range of [%d, %d] (too high)", str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)));
    }

    /* renamed from: checkArgumentInRange */
    public static long m18203x6c3d6773(long j17, long j18, long j19, java.lang.String str) {
        if (j17 < j18) {
            throw new java.lang.IllegalArgumentException(zza("%s is out of range of [%d, %d] (too low)", str, java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19)));
        }
        if (j17 <= j19) {
            return j17;
        }
        throw new java.lang.IllegalArgumentException(zza("%s is out of range of [%d, %d] (too high)", str, java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19)));
    }
}

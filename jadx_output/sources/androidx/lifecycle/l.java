package androidx.lifecycle;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f11634a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f11635b;

    static {
        int[] iArr = new int[androidx.lifecycle.m.values().length];
        f11635b = iArr;
        try {
            iArr[androidx.lifecycle.m.ON_CREATE.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f11635b[androidx.lifecycle.m.ON_STOP.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            f11635b[androidx.lifecycle.m.ON_START.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            f11635b[androidx.lifecycle.m.ON_PAUSE.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            f11635b[androidx.lifecycle.m.ON_RESUME.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            f11635b[androidx.lifecycle.m.ON_DESTROY.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            f11635b[androidx.lifecycle.m.ON_ANY.ordinal()] = 7;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        int[] iArr2 = new int[androidx.lifecycle.n.values().length];
        f11634a = iArr2;
        try {
            iArr2[androidx.lifecycle.n.CREATED.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused8) {
        }
        try {
            f11634a[androidx.lifecycle.n.STARTED.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused9) {
        }
        try {
            f11634a[androidx.lifecycle.n.RESUMED.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused10) {
        }
        try {
            f11634a[androidx.lifecycle.n.DESTROYED.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused11) {
        }
        try {
            f11634a[androidx.lifecycle.n.INITIALIZED.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused12) {
        }
    }
}

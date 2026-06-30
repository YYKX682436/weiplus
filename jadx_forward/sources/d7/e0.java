package d7;

/* loaded from: classes13.dex */
public final class e0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.io.File f308329d = new java.io.File("/proc/self/fd");

    /* renamed from: e, reason: collision with root package name */
    public static volatile int f308330e = 700;

    /* renamed from: f, reason: collision with root package name */
    public static volatile int f308331f = 128;

    /* renamed from: g, reason: collision with root package name */
    public static volatile d7.e0 f308332g;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f308333a;

    /* renamed from: b, reason: collision with root package name */
    public int f308334b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f308335c = true;

    public e0() {
        boolean z17 = true;
        java.lang.String str = android.os.Build.MODEL;
        if (str != null && str.length() >= 7) {
            java.lang.String substring = str.substring(0, 7);
            substring.getClass();
            char c17 = 65535;
            switch (substring.hashCode()) {
                case -1398613787:
                    if (substring.equals("SM-A520")) {
                        c17 = 0;
                        break;
                    }
                    break;
                case -1398431166:
                    if (substring.equals("SM-G930")) {
                        c17 = 1;
                        break;
                    }
                    break;
                case -1398431161:
                    if (substring.equals("SM-G935")) {
                        c17 = 2;
                        break;
                    }
                    break;
                case -1398431073:
                    if (substring.equals("SM-G960")) {
                        c17 = 3;
                        break;
                    }
                    break;
                case -1398431068:
                    if (substring.equals("SM-G965")) {
                        c17 = 4;
                        break;
                    }
                    break;
                case -1398343746:
                    if (substring.equals("SM-J720")) {
                        c17 = 5;
                        break;
                    }
                    break;
                case -1398222624:
                    if (substring.equals("SM-N935")) {
                        c17 = 6;
                        break;
                    }
                    break;
            }
            switch (c17) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    if (android.os.Build.VERSION.SDK_INT == 26) {
                        z17 = false;
                        break;
                    }
                    break;
            }
        }
        this.f308333a = z17;
    }

    public boolean a(int i17, int i18, boolean z17, boolean z18) {
        boolean z19;
        if (!z17 || !this.f308333a || android.os.Build.VERSION.SDK_INT < 26 || z18 || i17 < f308331f || i18 < f308331f) {
            return false;
        }
        synchronized (this) {
            int i19 = this.f308334b + 1;
            this.f308334b = i19;
            if (i19 >= 50) {
                this.f308334b = 0;
                boolean z27 = f308329d.list().length < f308330e;
                this.f308335c = z27;
                if (!z27) {
                    android.util.Log.isLoggable("Downsampler", 5);
                }
            }
            z19 = this.f308335c;
        }
        return z19;
    }
}

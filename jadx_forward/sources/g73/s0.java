package g73;

/* loaded from: classes7.dex */
public enum s0 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f350863d = null;

    s0() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f350863d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f350863d;
                if (obj == null) {
                    obj = g73.o0.f350844d;
                    this.f350863d = obj;
                }
            }
        }
        return (g73.o0) obj;
    }

    @Override // fs.q
    /* renamed from: getQualifierAttribute */
    public java.lang.Object mo209xe96b5b08(java.lang.String str) {
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case 503774505:
                if (str.equals("dependencies")) {
                    c17 = 0;
                    break;
                }
                break;
            case 1026760592:
                if (str.equals("onProcess")) {
                    c17 = 1;
                    break;
                }
                break;
            case 1028554796:
                if (str.equals("creator")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                return g73.q0.f350858a;
            case 1:
                return g73.r0.f350859a;
            case 2:
                return g73.p0.class;
            default:
                return null;
        }
    }

    @Override // fs.q
    /* renamed from: hasKey */
    public boolean mo210xb7045565(java.lang.Object obj) {
        return false;
    }

    @Override // fs.q
    /* renamed from: hasNoKeys */
    public boolean mo211xe6e58a8f() {
        return true;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(g73.o0.class.getName());
    }
}

package bt;

/* loaded from: classes6.dex */
public enum p1 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f24105d = null;

    p1() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f24105d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f24105d;
                if (obj == null) {
                    obj = new bt.m1();
                    this.f24105d = obj;
                }
            }
        }
        return (bt.m1) obj;
    }

    @Override // fs.q
    public java.lang.Object getQualifierAttribute(java.lang.String str) {
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
                return bt.n1.f24098a;
            case 1:
                return bt.o1.f24102a;
            case 2:
                return java.lang.Void.class;
            default:
                return null;
        }
    }

    @Override // fs.q
    public boolean hasKey(java.lang.Object obj) {
        return java.util.Objects.equals(obj, j95.a.ON_SPLASH);
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(bt.m1.class.getName());
    }
}

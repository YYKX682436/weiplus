package e10;

/* loaded from: classes6.dex */
public enum q implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f327878d = null;

    q() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f327878d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f327878d;
                if (obj == null) {
                    obj = new e10.n();
                    this.f327878d = obj;
                }
            }
        }
        return (e10.n) obj;
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
                return e10.o.f327874a;
            case 1:
                return e10.p.f327875a;
            case 2:
                return java.lang.Void.class;
            default:
                return null;
        }
    }

    @Override // fs.q
    /* renamed from: hasKey */
    public boolean mo210xb7045565(java.lang.Object obj) {
        return java.util.Objects.equals(obj, j95.a.ON_SPLASH);
    }

    @Override // fs.q
    /* renamed from: hasNoKeys */
    public boolean mo211xe6e58a8f() {
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(e10.n.class.getName());
    }
}

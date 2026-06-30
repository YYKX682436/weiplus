package ty4;

/* loaded from: classes6.dex */
public enum p implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f504680d = null;

    p() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f504680d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f504680d;
                if (obj == null) {
                    obj = new ty4.n(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                    this.f504680d = obj;
                }
            }
        }
        return (ty4.n) obj;
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
                return java.util.Collections.EMPTY_LIST;
            case 1:
                return ty4.o.f504677a;
            case 2:
                return ty4.n.class;
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
        return "provider ".concat(ty4.n.class.getName());
    }
}

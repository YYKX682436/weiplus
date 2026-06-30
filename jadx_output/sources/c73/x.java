package c73;

/* loaded from: classes6.dex */
public enum x implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f39632d = null;

    x() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f39632d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f39632d;
                if (obj == null) {
                    obj = new c73.u();
                    this.f39632d = obj;
                }
            }
        }
        return (c73.u) obj;
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
                return c73.v.f39628a;
            case 1:
                return c73.w.f39629a;
            case 2:
                return java.lang.Void.class;
            default:
                return null;
        }
    }

    @Override // fs.q
    public boolean hasKey(java.lang.Object obj) {
        return false;
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        return true;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(c73.u.class.getName());
    }
}

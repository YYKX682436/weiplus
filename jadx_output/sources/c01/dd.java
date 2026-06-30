package c01;

/* loaded from: classes.dex */
public enum dd implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f37112d = null;

    dd() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f37112d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f37112d;
                if (obj == null) {
                    obj = c01.ad.f37061a;
                    this.f37112d = obj;
                }
            }
        }
        return (c01.bd) obj;
    }

    @Override // fs.q
    public java.lang.Object getQualifierAttribute(java.lang.String str) {
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case 1026760592:
                if (str.equals("onProcess")) {
                    c17 = 0;
                    break;
                }
                break;
            case 1028554796:
                if (str.equals("creator")) {
                    c17 = 1;
                    break;
                }
                break;
            case 1063801905:
                if (str.equals("accountAware")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                return c01.cd.f37093a;
            case 1:
                return c01.bd.class;
            case 2:
                return java.lang.Boolean.TRUE;
            default:
                return null;
        }
    }

    @Override // fs.q
    public boolean hasKey(java.lang.Object obj) {
        return java.util.Objects.equals(obj, 10001) || java.util.Objects.equals(obj, 10002);
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(c01.bd.class.getName());
    }
}

package oh1;

/* loaded from: classes6.dex */
public enum f1 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f426749d = null;

    f1() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f426749d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f426749d;
                if (obj == null) {
                    obj = oh1.d1.INSTANCE;
                    this.f426749d = obj;
                }
            }
        }
        return (oh1.d1) obj;
    }

    @Override // fs.q
    /* renamed from: getQualifierAttribute */
    public java.lang.Object mo209xe96b5b08(java.lang.String str) {
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
                return oh1.e1.f426736a;
            case 1:
                return oh1.d1.class;
            case 2:
                return java.lang.Boolean.FALSE;
            default:
                return null;
        }
    }

    @Override // fs.q
    /* renamed from: hasKey */
    public boolean mo210xb7045565(java.lang.Object obj) {
        return java.util.Objects.equals(obj, "weapp_pushmsg");
    }

    @Override // fs.q
    /* renamed from: hasNoKeys */
    public boolean mo211xe6e58a8f() {
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(oh1.d1.class.getName());
    }
}

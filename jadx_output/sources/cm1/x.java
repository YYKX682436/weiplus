package cm1;

/* loaded from: classes6.dex */
public enum x implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f43327d = null;

    x() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f43327d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f43327d;
                if (obj == null) {
                    obj = cm1.u.f43323d;
                    this.f43327d = obj;
                }
            }
        }
        return (cm1.u) obj;
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
                return cm1.w.f43324a;
            case 1:
                return cm1.v.class;
            case 2:
                return java.lang.Boolean.FALSE;
            default:
                return null;
        }
    }

    @Override // fs.q
    public boolean hasKey(java.lang.Object obj) {
        return java.util.Objects.equals(obj, "WxaNativeVoipNotify");
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(cm1.u.class.getName());
    }
}

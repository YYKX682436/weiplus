package gc0;

/* loaded from: classes.dex */
public enum v implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f351848d = null;

    v() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f351848d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f351848d;
                if (obj == null) {
                    obj = new gc0.t();
                    this.f351848d = obj;
                }
            }
        }
        return (gc0.t) obj;
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
                return gc0.u.f351826a;
            case 1:
                return java.lang.Void.class;
            case 2:
                return java.lang.Boolean.TRUE;
            default:
                return null;
        }
    }

    @Override // fs.q
    /* renamed from: hasKey */
    public boolean mo210xb7045565(java.lang.Object obj) {
        return java.util.Objects.equals(obj, "link_recommend_remark_open_image");
    }

    @Override // fs.q
    /* renamed from: hasNoKeys */
    public boolean mo211xe6e58a8f() {
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(gc0.t.class.getName());
    }
}

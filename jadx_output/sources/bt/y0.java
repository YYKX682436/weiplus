package bt;

/* loaded from: classes6.dex */
public enum y0 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f24137d = null;

    y0() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f24137d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f24137d;
                if (obj == null) {
                    obj = new bt.w0();
                    this.f24137d = obj;
                }
            }
        }
        return (bt.w0) obj;
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
                return java.util.Collections.EMPTY_LIST;
            case 1:
                return bt.x0.f24132a;
            case 2:
                return java.lang.Void.class;
            default:
                return null;
        }
    }

    @Override // fs.q
    public boolean hasKey(java.lang.Object obj) {
        return java.util.Objects.equals(obj, j95.a.ASYNC);
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(bt.w0.class.getName());
    }
}

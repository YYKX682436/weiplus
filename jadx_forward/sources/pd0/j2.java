package pd0;

/* loaded from: classes6.dex */
public enum j2 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f435012d = null;

    j2() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f435012d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f435012d;
                if (obj == null) {
                    obj = new pd0.h2();
                    this.f435012d = obj;
                }
            }
        }
        return (pd0.h2) obj;
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
                return pd0.i2.f435006a;
            case 1:
                return java.lang.Void.class;
            case 2:
                return java.lang.Boolean.FALSE;
            default:
                return null;
        }
    }

    @Override // fs.q
    /* renamed from: hasKey */
    public boolean mo210xb7045565(java.lang.Object obj) {
        return java.util.Objects.equals(obj, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5920xab594e82.class);
    }

    @Override // fs.q
    /* renamed from: hasNoKeys */
    public boolean mo211xe6e58a8f() {
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(pd0.h2.class.getName());
    }
}

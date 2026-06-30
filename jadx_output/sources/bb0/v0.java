package bb0;

/* loaded from: classes4.dex */
public enum v0 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f18763d = null;

    v0() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f18763d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f18763d;
                if (obj == null) {
                    obj = new bb0.t0();
                    this.f18763d = obj;
                }
            }
        }
        return (bb0.t0) obj;
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
                return bb0.u0.f18758a;
            case 1:
                return java.lang.Void.class;
            case 2:
                return java.lang.Boolean.TRUE;
            default:
                return null;
        }
    }

    @Override // fs.q
    public boolean hasKey(java.lang.Object obj) {
        return java.util.Objects.equals(obj, com.tencent.mm.autogen.events.OpenIMSyncEvent.class);
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(bb0.t0.class.getName());
    }
}

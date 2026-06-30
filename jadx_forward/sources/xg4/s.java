package xg4;

/* loaded from: classes6.dex */
public enum s implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f535992d = null;

    s() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f535992d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f535992d;
                if (obj == null) {
                    obj = new xg4.r();
                    this.f535992d = obj;
                }
            }
        }
        return (xg4.r) obj;
    }

    @Override // fs.q
    /* renamed from: getQualifierAttribute */
    public java.lang.Object mo209xe96b5b08(java.lang.String str) {
        str.getClass();
        if (str.equals("creator")) {
            return java.lang.Void.class;
        }
        return null;
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
        return "provider ".concat(xg4.r.class.getName());
    }
}

package kx;

/* loaded from: classes6.dex */
public enum u implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f394770d = null;

    u() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f394770d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f394770d;
                if (obj == null) {
                    obj = new kx.t();
                    this.f394770d = obj;
                }
            }
        }
        return (kx.t) obj;
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
        return "provider ".concat(kx.t.class.getName());
    }
}

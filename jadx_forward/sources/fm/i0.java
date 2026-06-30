package fm;

/* loaded from: classes6.dex */
public enum i0 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f345531d = null;

    i0() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f345531d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f345531d;
                if (obj == null) {
                    obj = new fm.h0();
                    this.f345531d = obj;
                }
            }
        }
        return (fm.h0) obj;
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
        return "provider ".concat(fm.h0.class.getName());
    }
}

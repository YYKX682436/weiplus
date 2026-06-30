package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad;

/* loaded from: classes6.dex */
public enum x7 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f229743d = null;

    x7() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f229743d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f229743d;
                if (obj == null) {
                    obj = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.w7();
                    this.f229743d = obj;
                }
            }
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.w7) obj;
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
        return "provider ".concat(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.w7.class.getName());
    }
}

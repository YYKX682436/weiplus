package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes6.dex */
public enum n9 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f156732d = null;

    n9() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f156732d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f156732d;
                if (obj == null) {
                    obj = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.l8();
                    this.f156732d = obj;
                }
            }
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.l8) obj;
    }

    @Override // fs.q
    /* renamed from: getQualifierAttribute */
    public java.lang.Object mo209xe96b5b08(java.lang.String str) {
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
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.l9.f156709a;
            case 1:
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.m9.f156721a;
            case 2:
                return java.lang.Void.class;
            default:
                return null;
        }
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
        return "provider ".concat(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.l8.class.getName());
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic;

/* loaded from: classes.dex */
public enum k implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f256305d = null;

    k() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f256305d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f256305d;
                if (obj == null) {
                    obj = new com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.j();
                    this.f256305d = obj;
                }
            }
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.j) obj;
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
                return java.util.Collections.EMPTY_LIST;
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
        return java.util.Objects.equals(obj, 24);
    }

    @Override // fs.q
    /* renamed from: hasNoKeys */
    public boolean mo211xe6e58a8f() {
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.j.class.getName());
    }
}

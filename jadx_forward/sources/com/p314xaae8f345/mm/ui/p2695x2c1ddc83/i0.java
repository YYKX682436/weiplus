package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes6.dex */
public enum i0 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f289269d = null;

    i0() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f289269d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f289269d;
                if (obj == null) {
                    obj = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.g0();
                    this.f289269d = obj;
                }
            }
        }
        return (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.g0) obj;
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
                return com.p314xaae8f345.mm.ui.p2695x2c1ddc83.h0.f289244a;
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
        return false;
    }

    @Override // fs.q
    /* renamed from: hasNoKeys */
    public boolean mo211xe6e58a8f() {
        return true;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.g0.class.getName());
    }
}

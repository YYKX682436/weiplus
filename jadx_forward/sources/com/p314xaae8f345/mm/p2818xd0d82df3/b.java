package com.p314xaae8f345.mm.p2818xd0d82df3;

/* loaded from: classes6.dex */
public enum b implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f295888d = null;

    b() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f295888d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f295888d;
                if (obj == null) {
                    obj = new com.p314xaae8f345.mm.p2818xd0d82df3.a();
                    this.f295888d = obj;
                }
            }
        }
        return (com.p314xaae8f345.mm.p2818xd0d82df3.a) obj;
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
                return java.util.Collections.EMPTY_LIST;
            case 1:
                return java.util.Collections.EMPTY_LIST;
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
        return "provider ".concat(com.p314xaae8f345.mm.p2818xd0d82df3.a.class.getName());
    }
}

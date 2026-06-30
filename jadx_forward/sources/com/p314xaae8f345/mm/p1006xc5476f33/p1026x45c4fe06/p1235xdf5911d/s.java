package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d;

/* loaded from: classes4.dex */
public enum s implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f173838d = null;

    s() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f173838d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f173838d;
                if (obj == null) {
                    obj = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p();
                    this.f173838d = obj;
                }
            }
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p) obj;
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
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q.f173829a;
            case 1:
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.r.f173832a;
            case 2:
                return java.lang.Void.class;
            default:
                return null;
        }
    }

    @Override // fs.q
    /* renamed from: hasKey */
    public boolean mo210xb7045565(java.lang.Object obj) {
        return java.util.Objects.equals(obj, j95.a.ASYNC);
    }

    @Override // fs.q
    /* renamed from: hasNoKeys */
    public boolean mo211xe6e58a8f() {
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p.class.getName());
    }
}

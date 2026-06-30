package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2;

/* loaded from: classes8.dex */
public enum o0 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f222133d = null;

    o0() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f222133d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f222133d;
                if (obj == null) {
                    obj = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n0();
                    this.f222133d = obj;
                }
            }
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n0) obj;
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
        return java.util.Objects.equals(obj, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5756xf590b991.class) || java.util.Objects.equals(obj, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5573x98edee87.class) || java.util.Objects.equals(obj, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5863x4343d0ad.class) || java.util.Objects.equals(obj, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6145xda761019.class) || java.util.Objects.equals(obj, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5570x77700c5a.class) || java.util.Objects.equals(obj, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5574xf9eca6ce.class) || java.util.Objects.equals(obj, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5821x1482b029.class) || java.util.Objects.equals(obj, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5916xa0cb17ff.class) || java.util.Objects.equals(obj, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5917x44367f5f.class) || java.util.Objects.equals(obj, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5572x8bc3522b.class) || java.util.Objects.equals(obj, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5603x81308ae0.class) || java.util.Objects.equals(obj, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5571xfff98751.class) || java.util.Objects.equals(obj, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5583x6de909a9.class) || java.util.Objects.equals(obj, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5846xa44f96da.class) || java.util.Objects.equals(obj, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5701xe3413c8c.class) || java.util.Objects.equals(obj, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5578x677d556e.class) || java.util.Objects.equals(obj, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5862x6c491c8f.class) || java.util.Objects.equals(obj, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6023x2e452a00.class) || java.util.Objects.equals(obj, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5580x225208dc.class) || java.util.Objects.equals(obj, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6003xee05790a.class);
    }

    @Override // fs.q
    /* renamed from: hasNoKeys */
    public boolean mo211xe6e58a8f() {
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n0.class.getName());
    }
}

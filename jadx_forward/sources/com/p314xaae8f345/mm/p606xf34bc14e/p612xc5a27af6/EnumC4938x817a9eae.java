package com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6;

/* renamed from: com.tencent.mm.accessibility.feature.AccExptServiceProvider */
/* loaded from: classes6.dex */
public enum EnumC4938x817a9eae implements fs.q {
    INSTANCE;


    /* renamed from: mInstance */
    private volatile java.lang.Object f21262x46143c22 = null;

    /* renamed from: com.tencent.mm.accessibility.feature.AccExptServiceProvider$LazyCache_onProcess */
    /* loaded from: classes6.dex */
    public static final class LazyCache_onProcess {

        /* renamed from: value */
        static final java.util.List<java.lang.Object> f21263x6ac9171 = java.util.Arrays.asList(com.p314xaae8f345.mm.app.c6.f21432x4058ee7a, com.p314xaae8f345.mm.app.c6.f21447x2d7486a1, com.p314xaae8f345.mm.app.c6.f21417x2b974760, com.p314xaae8f345.mm.app.c6.f21444x77d41f15, com.p314xaae8f345.mm.app.c6.f21445x7fd5930e, com.p314xaae8f345.mm.app.c6.f21433x6541f32b);

        private LazyCache_onProcess() {
        }
    }

    EnumC4938x817a9eae() {
    }

    /* renamed from: create */
    private com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4935xfd35219d m42710xaf65a0fc() {
        return new com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4935xfd35219d();
    }

    /* renamed from: getExtensionQualifierClassName */
    public java.lang.String m42713xdee3c402() {
        return j95.b.class.getName();
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
                return com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.EnumC4938x817a9eae.LazyCache_onProcess.f21263x6ac9171;
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

    /* renamed from: reset */
    public void m42714x6761d4f() {
        if (this.f21262x46143c22 != null) {
            synchronized (this) {
                if (this.f21262x46143c22 != null) {
                    this.f21262x46143c22 = null;
                }
            }
        }
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4935xfd35219d.class.getName());
    }

    @Override // fs.q
    public com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4935xfd35219d get() {
        java.lang.Object obj = this.f21262x46143c22;
        if (obj == null) {
            synchronized (this) {
                obj = this.f21262x46143c22;
                if (obj == null) {
                    obj = m42710xaf65a0fc();
                    this.f21262x46143c22 = obj;
                }
            }
        }
        return (com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4935xfd35219d) obj;
    }
}

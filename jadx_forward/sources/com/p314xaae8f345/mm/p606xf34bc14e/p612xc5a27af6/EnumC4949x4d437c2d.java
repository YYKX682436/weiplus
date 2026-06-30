package com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6;

/* renamed from: com.tencent.mm.accessibility.feature.ActivityAccCallbacksProvider */
/* loaded from: classes6.dex */
public enum EnumC4949x4d437c2d implements fs.q {
    INSTANCE;


    /* renamed from: mInstance */
    private volatile java.lang.Object f21285x46143c22 = null;

    EnumC4949x4d437c2d() {
    }

    /* renamed from: create */
    private com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4948xa396ee1c m42762xaf65a0fc() {
        return new com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4948xa396ee1c();
    }

    /* renamed from: getExtensionQualifierClassName */
    public java.lang.String m42765xdee3c402() {
        return h95.a.class.getName();
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
        return false;
    }

    @Override // fs.q
    /* renamed from: hasNoKeys */
    public boolean mo211xe6e58a8f() {
        return true;
    }

    /* renamed from: reset */
    public void m42766x6761d4f() {
        if (this.f21285x46143c22 != null) {
            synchronized (this) {
                if (this.f21285x46143c22 != null) {
                    this.f21285x46143c22 = null;
                }
            }
        }
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4948xa396ee1c.class.getName());
    }

    @Override // fs.q
    public com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4948xa396ee1c get() {
        java.lang.Object obj = this.f21285x46143c22;
        if (obj == null) {
            synchronized (this) {
                obj = this.f21285x46143c22;
                if (obj == null) {
                    obj = m42762xaf65a0fc();
                    this.f21285x46143c22 = obj;
                }
            }
        }
        return (com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4948xa396ee1c) obj;
    }
}

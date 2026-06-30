package com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6;

/* renamed from: com.tencent.mm.accessibility.feature.ScreenRecordStaticForegroundListenerProvider */
/* loaded from: classes6.dex */
public enum EnumC4962xc7865b53 implements fs.q {
    INSTANCE;


    /* renamed from: mInstance */
    private volatile java.lang.Object f21336x46143c22 = null;

    /* renamed from: com.tencent.mm.accessibility.feature.ScreenRecordStaticForegroundListenerProvider$LazyCache_onProcess */
    /* loaded from: classes6.dex */
    public static final class LazyCache_onProcess {

        /* renamed from: value */
        static final java.util.List<java.lang.Object> f21337x6ac9171 = java.util.Arrays.asList(com.p314xaae8f345.mm.app.c6.f21432x4058ee7a);

        private LazyCache_onProcess() {
        }
    }

    EnumC4962xc7865b53() {
    }

    /* renamed from: create */
    private com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4961xdae65342 m42814xaf65a0fc() {
        return new com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4961xdae65342();
    }

    /* renamed from: getExtensionQualifierClassName */
    public java.lang.String m42817xdee3c402() {
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
                return com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.EnumC4962xc7865b53.LazyCache_onProcess.f21337x6ac9171;
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
    public void m42818x6761d4f() {
        if (this.f21336x46143c22 != null) {
            synchronized (this) {
                if (this.f21336x46143c22 != null) {
                    this.f21336x46143c22 = null;
                }
            }
        }
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4961xdae65342.class.getName());
    }

    @Override // fs.q
    public com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4961xdae65342 get() {
        java.lang.Object obj = this.f21336x46143c22;
        if (obj == null) {
            synchronized (this) {
                obj = this.f21336x46143c22;
                if (obj == null) {
                    obj = m42814xaf65a0fc();
                    this.f21336x46143c22 = obj;
                }
            }
        }
        return (com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4961xdae65342) obj;
    }
}

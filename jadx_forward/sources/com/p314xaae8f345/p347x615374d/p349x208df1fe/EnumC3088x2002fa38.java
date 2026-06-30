package com.p314xaae8f345.p347x615374d.p349x208df1fe;

/* renamed from: com.tencent.kinda.framework.OfflinePayTsmServicesProvider */
/* loaded from: classes6.dex */
public enum EnumC3088x2002fa38 implements fs.q {
    INSTANCE;


    /* renamed from: mInstance */
    private volatile java.lang.Object f11472x46143c22 = null;

    /* renamed from: com.tencent.kinda.framework.OfflinePayTsmServicesProvider$LazyCache_onProcess */
    /* loaded from: classes6.dex */
    public static final class LazyCache_onProcess {

        /* renamed from: value */
        static final java.util.List<java.lang.Object> f11473x6ac9171 = java.util.Arrays.asList(com.p314xaae8f345.mm.app.c6.f21432x4058ee7a);

        private LazyCache_onProcess() {
        }
    }

    EnumC3088x2002fa38() {
    }

    /* renamed from: create */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.C3087x2a2ea727 m24693xaf65a0fc() {
        return new com.p314xaae8f345.p347x615374d.p349x208df1fe.C3087x2a2ea727();
    }

    /* renamed from: getExtensionQualifierClassName */
    public java.lang.String m24696xdee3c402() {
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
                return com.p314xaae8f345.p347x615374d.p349x208df1fe.EnumC3088x2002fa38.LazyCache_onProcess.f11473x6ac9171;
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

    /* renamed from: reset */
    public void m24697x6761d4f() {
        if (this.f11472x46143c22 != null) {
            synchronized (this) {
                if (this.f11472x46143c22 != null) {
                    this.f11472x46143c22 = null;
                }
            }
        }
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3087x2a2ea727.class.getName());
    }

    @Override // fs.q
    public com.p314xaae8f345.p347x615374d.p349x208df1fe.C3087x2a2ea727 get() {
        java.lang.Object obj = this.f11472x46143c22;
        if (obj == null) {
            synchronized (this) {
                obj = this.f11472x46143c22;
                if (obj == null) {
                    obj = m24693xaf65a0fc();
                    this.f11472x46143c22 = obj;
                }
            }
        }
        return (com.p314xaae8f345.p347x615374d.p349x208df1fe.C3087x2a2ea727) obj;
    }
}

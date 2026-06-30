package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db;

/* renamed from: com.tencent.kinda.framework.widget.tools.KindaStaticActivityLifeCycleCallbacksProvider */
/* loaded from: classes6.dex */
public enum EnumC3372xe8de7f implements fs.q {
    INSTANCE;


    /* renamed from: mInstance */
    private volatile java.lang.Object f13387x46143c22 = null;

    /* renamed from: com.tencent.kinda.framework.widget.tools.KindaStaticActivityLifeCycleCallbacksProvider$LazyCache_onProcess */
    /* loaded from: classes6.dex */
    public static final class LazyCache_onProcess {

        /* renamed from: value */
        static final java.util.List<java.lang.Object> f13388x6ac9171 = java.util.Arrays.asList(com.p314xaae8f345.mm.app.c6.f21432x4058ee7a);

        private LazyCache_onProcess() {
        }
    }

    EnumC3372xe8de7f() {
    }

    /* renamed from: create */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3371x4a64c26e m27345xaf65a0fc() {
        return new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3371x4a64c26e();
    }

    /* renamed from: getExtensionQualifierClassName */
    public java.lang.String m27348xdee3c402() {
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
                return com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.EnumC3372xe8de7f.LazyCache_onProcess.f13388x6ac9171;
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
    public void m27349x6761d4f() {
        if (this.f13387x46143c22 != null) {
            synchronized (this) {
                if (this.f13387x46143c22 != null) {
                    this.f13387x46143c22 = null;
                }
            }
        }
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3371x4a64c26e.class.getName());
    }

    @Override // fs.q
    public com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3371x4a64c26e get() {
        java.lang.Object obj = this.f13387x46143c22;
        if (obj == null) {
            synchronized (this) {
                obj = this.f13387x46143c22;
                if (obj == null) {
                    obj = m27345xaf65a0fc();
                    this.f13387x46143c22 = obj;
                }
            }
        }
        return (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3371x4a64c26e) obj;
    }
}

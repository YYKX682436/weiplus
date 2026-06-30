package com.p314xaae8f345.p542x3306d5.smc;

/* renamed from: com.tencent.mars.smc.UDRKVCommReportFeatureServiceProvider */
/* loaded from: classes6.dex */
public enum EnumC4590x1f5279de implements fs.q {
    INSTANCE;


    /* renamed from: mInstance */
    private volatile java.lang.Object f19551x46143c22 = null;

    EnumC4590x1f5279de() {
    }

    /* renamed from: create */
    private com.p314xaae8f345.p542x3306d5.smc.C4588xfb732ccd m40422xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.smc.C4588xfb732ccd();
    }

    /* renamed from: getExtensionQualifierClassName */
    public java.lang.String m40425xdee3c402() {
        return ea5.m.class.getName();
    }

    @Override // fs.q
    /* renamed from: getQualifierAttribute */
    public java.lang.Object mo209xe96b5b08(java.lang.String str) {
        str.getClass();
        if (str.equals("creator")) {
            return java.lang.Void.class;
        }
        return null;
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
    public void m40426x6761d4f() {
        if (this.f19551x46143c22 != null) {
            synchronized (this) {
                if (this.f19551x46143c22 != null) {
                    this.f19551x46143c22 = null;
                }
            }
        }
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(com.p314xaae8f345.p542x3306d5.smc.C4588xfb732ccd.class.getName());
    }

    @Override // fs.q
    public com.p314xaae8f345.p542x3306d5.smc.C4588xfb732ccd get() {
        java.lang.Object obj = this.f19551x46143c22;
        if (obj == null) {
            synchronized (this) {
                obj = this.f19551x46143c22;
                if (obj == null) {
                    obj = m40422xaf65a0fc();
                    this.f19551x46143c22 = obj;
                }
            }
        }
        return (com.p314xaae8f345.p542x3306d5.smc.C4588xfb732ccd) obj;
    }
}

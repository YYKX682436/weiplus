package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* renamed from: com.tencent.mm.feature.emoji.GIFJNIFactoryFeatureServiceProvider */
/* loaded from: classes6.dex */
public enum EnumC10579xbc9955b9 implements fs.q {
    INSTANCE;


    /* renamed from: mInstance */
    private volatile java.lang.Object f28852x46143c22 = null;

    EnumC10579xbc9955b9() {
    }

    /* renamed from: create */
    private com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.C10578xd77513a8 m44454xaf65a0fc() {
        return new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.C10578xd77513a8();
    }

    /* renamed from: getExtensionQualifierClassName */
    public java.lang.String m44457xdee3c402() {
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

    /* renamed from: reset */
    public void m44458x6761d4f() {
        if (this.f28852x46143c22 != null) {
            synchronized (this) {
                if (this.f28852x46143c22 != null) {
                    this.f28852x46143c22 = null;
                }
            }
        }
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.C10578xd77513a8.class.getName());
    }

    @Override // fs.q
    public com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.C10578xd77513a8 get() {
        java.lang.Object obj = this.f28852x46143c22;
        if (obj == null) {
            synchronized (this) {
                obj = this.f28852x46143c22;
                if (obj == null) {
                    obj = m44454xaf65a0fc();
                    this.f28852x46143c22 = obj;
                }
            }
        }
        return (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.C10578xd77513a8) obj;
    }
}

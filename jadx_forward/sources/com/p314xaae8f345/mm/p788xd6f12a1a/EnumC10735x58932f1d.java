package com.p314xaae8f345.mm.p788xd6f12a1a;

/* renamed from: com.tencent.mm.hardcoder.WXHardCoderJNIImplProvider */
/* loaded from: classes6.dex */
public enum EnumC10735x58932f1d implements fs.q {
    INSTANCE;


    /* renamed from: mInstance */
    private volatile java.lang.Object f29246x46143c22 = null;

    /* renamed from: com.tencent.mm.hardcoder.WXHardCoderJNIImplProvider$LazyCache_dependencies */
    /* loaded from: classes6.dex */
    public static final class LazyCache_dependencies {

        /* renamed from: value */
        static final java.util.List<java.lang.Object> f29247x6ac9171 = java.util.Arrays.asList(a25.v.class);

        private LazyCache_dependencies() {
        }
    }

    /* renamed from: com.tencent.mm.hardcoder.WXHardCoderJNIImplProvider$LazyCache_onProcess */
    /* loaded from: classes6.dex */
    public static final class LazyCache_onProcess {

        /* renamed from: value */
        static final java.util.List<java.lang.Object> f29248x6ac9171 = java.util.Arrays.asList(com.p314xaae8f345.mm.app.c6.f21435x992f93c2);

        private LazyCache_onProcess() {
        }
    }

    EnumC10735x58932f1d() {
    }

    /* renamed from: create */
    private com.p314xaae8f345.mm.p788xd6f12a1a.C10733x5980910c m46154xaf65a0fc() {
        return new com.p314xaae8f345.mm.p788xd6f12a1a.C10733x5980910c();
    }

    /* renamed from: getExtensionQualifierClassName */
    public java.lang.String m46157xdee3c402() {
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
                return com.p314xaae8f345.mm.p788xd6f12a1a.EnumC10735x58932f1d.LazyCache_dependencies.f29247x6ac9171;
            case 1:
                return com.p314xaae8f345.mm.p788xd6f12a1a.EnumC10735x58932f1d.LazyCache_onProcess.f29248x6ac9171;
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
    public void m46158x6761d4f() {
        if (this.f29246x46143c22 != null) {
            synchronized (this) {
                if (this.f29246x46143c22 != null) {
                    this.f29246x46143c22 = null;
                }
            }
        }
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(com.p314xaae8f345.mm.p788xd6f12a1a.C10733x5980910c.class.getName());
    }

    @Override // fs.q
    public com.p314xaae8f345.mm.p788xd6f12a1a.C10733x5980910c get() {
        java.lang.Object obj = this.f29246x46143c22;
        if (obj == null) {
            synchronized (this) {
                obj = this.f29246x46143c22;
                if (obj == null) {
                    obj = m46154xaf65a0fc();
                    this.f29246x46143c22 = obj;
                }
            }
        }
        return (com.p314xaae8f345.mm.p788xd6f12a1a.C10733x5980910c) obj;
    }
}

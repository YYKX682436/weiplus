package com.tencent.mm.hardcoder;

/* loaded from: classes6.dex */
public enum WXHardCoderJNIImplProvider implements fs.q {
    INSTANCE;

    private volatile java.lang.Object mInstance = null;

    /* loaded from: classes6.dex */
    public static final class LazyCache_dependencies {
        static final java.util.List<java.lang.Object> value = java.util.Arrays.asList(a25.v.class);

        private LazyCache_dependencies() {
        }
    }

    /* loaded from: classes6.dex */
    public static final class LazyCache_onProcess {
        static final java.util.List<java.lang.Object> value = java.util.Arrays.asList(com.tencent.mm.app.c6.MATCH_NOT_PLAIN_PROCESSES);

        private LazyCache_onProcess() {
        }
    }

    WXHardCoderJNIImplProvider() {
    }

    private com.tencent.mm.hardcoder.WXHardCoderJNIImpl create() {
        return new com.tencent.mm.hardcoder.WXHardCoderJNIImpl();
    }

    public java.lang.String getExtensionQualifierClassName() {
        return j95.b.class.getName();
    }

    @Override // fs.q
    public java.lang.Object getQualifierAttribute(java.lang.String str) {
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
                return com.tencent.mm.hardcoder.WXHardCoderJNIImplProvider.LazyCache_dependencies.value;
            case 1:
                return com.tencent.mm.hardcoder.WXHardCoderJNIImplProvider.LazyCache_onProcess.value;
            case 2:
                return java.lang.Void.class;
            default:
                return null;
        }
    }

    @Override // fs.q
    public boolean hasKey(java.lang.Object obj) {
        return java.util.Objects.equals(obj, j95.a.ASYNC);
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        return false;
    }

    public void reset() {
        if (this.mInstance != null) {
            synchronized (this) {
                if (this.mInstance != null) {
                    this.mInstance = null;
                }
            }
        }
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(com.tencent.mm.hardcoder.WXHardCoderJNIImpl.class.getName());
    }

    @Override // fs.q
    public com.tencent.mm.hardcoder.WXHardCoderJNIImpl get() {
        java.lang.Object obj = this.mInstance;
        if (obj == null) {
            synchronized (this) {
                obj = this.mInstance;
                if (obj == null) {
                    obj = create();
                    this.mInstance = obj;
                }
            }
        }
        return (com.tencent.mm.hardcoder.WXHardCoderJNIImpl) obj;
    }
}

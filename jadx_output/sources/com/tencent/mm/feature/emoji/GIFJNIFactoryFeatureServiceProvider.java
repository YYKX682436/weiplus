package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public enum GIFJNIFactoryFeatureServiceProvider implements fs.q {
    INSTANCE;

    private volatile java.lang.Object mInstance = null;

    GIFJNIFactoryFeatureServiceProvider() {
    }

    private com.tencent.mm.feature.emoji.GIFJNIFactoryFeatureService create() {
        return new com.tencent.mm.feature.emoji.GIFJNIFactoryFeatureService();
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
    public boolean hasKey(java.lang.Object obj) {
        return false;
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        return true;
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
        return "provider ".concat(com.tencent.mm.feature.emoji.GIFJNIFactoryFeatureService.class.getName());
    }

    @Override // fs.q
    public com.tencent.mm.feature.emoji.GIFJNIFactoryFeatureService get() {
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
        return (com.tencent.mm.feature.emoji.GIFJNIFactoryFeatureService) obj;
    }
}

package com.tencent.mars.smc;

/* loaded from: classes6.dex */
public enum UDRKVCommReportFeatureServiceProvider implements fs.q {
    INSTANCE;

    private volatile java.lang.Object mInstance = null;

    UDRKVCommReportFeatureServiceProvider() {
    }

    private com.tencent.mars.smc.UDRKVCommReportFeatureService create() {
        return new com.tencent.mars.smc.UDRKVCommReportFeatureService();
    }

    public java.lang.String getExtensionQualifierClassName() {
        return ea5.m.class.getName();
    }

    @Override // fs.q
    public java.lang.Object getQualifierAttribute(java.lang.String str) {
        str.getClass();
        if (str.equals("creator")) {
            return java.lang.Void.class;
        }
        return null;
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
        return "provider ".concat(com.tencent.mars.smc.UDRKVCommReportFeatureService.class.getName());
    }

    @Override // fs.q
    public com.tencent.mars.smc.UDRKVCommReportFeatureService get() {
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
        return (com.tencent.mars.smc.UDRKVCommReportFeatureService) obj;
    }
}

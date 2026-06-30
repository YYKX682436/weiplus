package com.tencent.mm.accessibility.feature;

/* loaded from: classes6.dex */
public enum ScreenRecordStaticForegroundListenerProvider implements fs.q {
    INSTANCE;

    private volatile java.lang.Object mInstance = null;

    /* loaded from: classes6.dex */
    public static final class LazyCache_onProcess {
        static final java.util.List<java.lang.Object> value = java.util.Arrays.asList(com.tencent.mm.app.c6.MATCH_MM);

        private LazyCache_onProcess() {
        }
    }

    ScreenRecordStaticForegroundListenerProvider() {
    }

    private com.tencent.mm.accessibility.feature.ScreenRecordStaticForegroundListener create() {
        return new com.tencent.mm.accessibility.feature.ScreenRecordStaticForegroundListener();
    }

    public java.lang.String getExtensionQualifierClassName() {
        return h95.a.class.getName();
    }

    @Override // fs.q
    public java.lang.Object getQualifierAttribute(java.lang.String str) {
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
                return com.tencent.mm.accessibility.feature.ScreenRecordStaticForegroundListenerProvider.LazyCache_onProcess.value;
            case 1:
                return java.lang.Void.class;
            case 2:
                return java.lang.Boolean.FALSE;
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
        return "provider ".concat(com.tencent.mm.accessibility.feature.ScreenRecordStaticForegroundListener.class.getName());
    }

    @Override // fs.q
    public com.tencent.mm.accessibility.feature.ScreenRecordStaticForegroundListener get() {
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
        return (com.tencent.mm.accessibility.feature.ScreenRecordStaticForegroundListener) obj;
    }
}

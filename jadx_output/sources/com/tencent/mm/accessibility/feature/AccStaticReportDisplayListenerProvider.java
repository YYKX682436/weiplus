package com.tencent.mm.accessibility.feature;

/* loaded from: classes6.dex */
public enum AccStaticReportDisplayListenerProvider implements fs.q {
    INSTANCE;

    private volatile java.lang.Object mInstance = null;

    /* loaded from: classes6.dex */
    public static final class LazyCache_onProcess {
        static final java.util.List<java.lang.Object> value = java.util.Arrays.asList(com.tencent.mm.app.c6.MATCH_PUSH);

        private LazyCache_onProcess() {
        }
    }

    AccStaticReportDisplayListenerProvider() {
    }

    private com.tencent.mm.accessibility.feature.AccStaticReportDisplayListener create() {
        return new com.tencent.mm.accessibility.feature.AccStaticReportDisplayListener();
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
                return com.tencent.mm.accessibility.feature.AccStaticReportDisplayListenerProvider.LazyCache_onProcess.value;
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
        return java.util.Objects.equals(obj, com.tencent.mm.autogen.events.ReportScreenRecordInfoEvent.class);
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
        return "provider ".concat(com.tencent.mm.accessibility.feature.AccStaticReportDisplayListener.class.getName());
    }

    @Override // fs.q
    public com.tencent.mm.accessibility.feature.AccStaticReportDisplayListener get() {
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
        return (com.tencent.mm.accessibility.feature.AccStaticReportDisplayListener) obj;
    }
}

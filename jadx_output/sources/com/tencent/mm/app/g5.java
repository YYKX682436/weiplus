package com.tencent.mm.app;

/* loaded from: classes5.dex */
public enum g5 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f53431d = null;

    g5() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f53431d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f53431d;
                if (obj == null) {
                    obj = new com.tencent.mm.app.e5();
                    this.f53431d = obj;
                }
            }
        }
        return (com.tencent.mm.app.e5) obj;
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
                return com.tencent.mm.app.f5.f53417a;
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
        return java.util.Objects.equals(obj, com.tencent.mm.autogen.events.MediaLeakEvent.class);
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(com.tencent.mm.app.e5.class.getName());
    }
}

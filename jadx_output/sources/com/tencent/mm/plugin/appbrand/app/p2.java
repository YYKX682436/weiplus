package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes5.dex */
public enum p2 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f75222d = null;

    p2() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f75222d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f75222d;
                if (obj == null) {
                    obj = new com.tencent.mm.plugin.appbrand.app.m2();
                    this.f75222d = obj;
                }
            }
        }
        return (com.tencent.mm.plugin.appbrand.app.m2) obj;
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
                return com.tencent.mm.plugin.appbrand.app.n2.f75195a;
            case 1:
                return com.tencent.mm.plugin.appbrand.app.o2.f75209a;
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

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(com.tencent.mm.plugin.appbrand.app.m2.class.getName());
    }
}

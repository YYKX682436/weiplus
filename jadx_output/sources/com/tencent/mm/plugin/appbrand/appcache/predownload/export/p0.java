package com.tencent.mm.plugin.appbrand.appcache.predownload.export;

/* loaded from: classes7.dex */
public enum p0 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f75827d = null;

    p0() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f75827d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f75827d;
                if (obj == null) {
                    obj = (com.tencent.mm.plugin.appbrand.appcache.predownload.export.m0) com.tencent.mm.plugin.appbrand.appcache.predownload.export.m0.f75819d.b();
                    if (obj == null) {
                        if (gm0.j1.b().f273254q) {
                            throw null;
                        }
                        throw new c01.c();
                    }
                    this.f75827d = obj;
                }
            }
        }
        return (com.tencent.mm.plugin.appbrand.appcache.predownload.export.m0) obj;
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
                return com.tencent.mm.plugin.appbrand.appcache.predownload.export.n0.f75821a;
            case 1:
                return com.tencent.mm.plugin.appbrand.appcache.predownload.export.o0.f75822a;
            case 2:
                return com.tencent.mm.plugin.appbrand.appcache.predownload.export.m0.class;
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
        return "provider ".concat(com.tencent.mm.plugin.appbrand.appcache.predownload.export.m0.class.getName());
    }
}

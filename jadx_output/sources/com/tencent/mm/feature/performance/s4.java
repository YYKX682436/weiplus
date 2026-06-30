package com.tencent.mm.feature.performance;

/* loaded from: classes6.dex */
public enum s4 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f67672d = null;

    s4() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f67672d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f67672d;
                if (obj == null) {
                    obj = new com.tencent.mm.feature.performance.r4();
                    this.f67672d = obj;
                }
            }
        }
        return (com.tencent.mm.feature.performance.r4) obj;
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
        return java.util.Objects.equals(obj, j95.a.ASYNC);
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(com.tencent.mm.feature.performance.r4.class.getName());
    }
}

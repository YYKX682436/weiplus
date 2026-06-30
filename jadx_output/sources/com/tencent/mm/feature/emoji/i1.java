package com.tencent.mm.feature.emoji;

/* loaded from: classes5.dex */
public enum i1 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f66317d = null;

    i1() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f66317d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f66317d;
                if (obj == null) {
                    obj = new com.tencent.mm.feature.emoji.g1();
                    this.f66317d = obj;
                }
            }
        }
        return (com.tencent.mm.feature.emoji.g1) obj;
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
                return com.tencent.mm.feature.emoji.h1.f66302a;
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
        return "provider ".concat(com.tencent.mm.feature.emoji.g1.class.getName());
    }
}

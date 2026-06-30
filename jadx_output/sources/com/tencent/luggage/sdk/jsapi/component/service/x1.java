package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes6.dex */
public enum x1 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f47564d = null;

    x1() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f47564d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f47564d;
                if (obj == null) {
                    obj = new com.tencent.luggage.sdk.jsapi.component.service.w1();
                    this.f47564d = obj;
                }
            }
        }
        return (com.tencent.luggage.sdk.jsapi.component.service.w1) obj;
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

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(com.tencent.luggage.sdk.jsapi.component.service.w1.class.getName());
    }
}

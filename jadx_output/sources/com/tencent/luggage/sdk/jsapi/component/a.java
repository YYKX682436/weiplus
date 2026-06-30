package com.tencent.luggage.sdk.jsapi.component;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.l f47330d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f47331e = new java.util.HashMap(16);

    public a(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f47330d = lVar;
    }

    public final java.util.Collection E() {
        java.util.LinkedList linkedList;
        synchronized (this.f47331e) {
            linkedList = new java.util.LinkedList(((java.util.HashMap) this.f47331e).values());
        }
        return linkedList;
    }

    public final synchronized com.tencent.mm.plugin.appbrand.jsapi.l F() {
        return this.f47330d;
    }

    public final void G(java.lang.Class cls, java.lang.Object obj) {
        synchronized (this.f47331e) {
            ((java.util.HashMap) this.f47331e).put(cls, obj);
        }
    }

    public java.lang.Object r(java.lang.Class cls) {
        synchronized (this.f47331e) {
            java.lang.Object cast = cls.cast(((java.util.HashMap) this.f47331e).get(cls));
            if (cast != null) {
                return cast;
            }
            for (java.lang.Object obj : ((java.util.HashMap) this.f47331e).values()) {
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }
    }
}

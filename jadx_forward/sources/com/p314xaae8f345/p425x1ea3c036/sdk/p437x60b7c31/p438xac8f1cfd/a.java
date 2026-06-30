package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f128863d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f128864e = new java.util.HashMap(16);

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f128863d = lVar;
    }

    public final java.util.Collection E() {
        java.util.LinkedList linkedList;
        synchronized (this.f128864e) {
            linkedList = new java.util.LinkedList(((java.util.HashMap) this.f128864e).values());
        }
        return linkedList;
    }

    public final synchronized com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l F() {
        return this.f128863d;
    }

    public final void G(java.lang.Class cls, java.lang.Object obj) {
        synchronized (this.f128864e) {
            ((java.util.HashMap) this.f128864e).put(cls, obj);
        }
    }

    public java.lang.Object r(java.lang.Class cls) {
        synchronized (this.f128864e) {
            java.lang.Object cast = cls.cast(((java.util.HashMap) this.f128864e).get(cls));
            if (cast != null) {
                return cast;
            }
            for (java.lang.Object obj : ((java.util.HashMap) this.f128864e).values()) {
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }
    }
}

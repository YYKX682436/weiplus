package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v f168686a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f168687b = new java.util.concurrent.ConcurrentHashMap();

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.t a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.t) f168687b.get(type);
        if (tVar != null) {
            return tVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDecorWidgetPreLoader", "obtainInstance: no preloaded, create it [%s]", type.name());
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.t();
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDecorWidgetPreLoader", "warmUpAndTryPreload type=" + type);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f168687b;
        if (concurrentHashMap.get(type) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.t tVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.t();
            tVar.d(al1.b.class);
            tVar.d(al1.l.class);
            if (type.ordinal() == 0) {
                tVar.d(zl1.t.class);
                tVar.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c9.class);
                for (int i17 = 0; i17 < 5; i17++) {
                    tVar.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1232xcb77185e.C12813xe3573f17.class);
                }
            }
            concurrentHashMap.put(type, tVar);
        }
    }
}

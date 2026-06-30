package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.b f174101a = new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f174102b = new java.util.HashMap();

    public final synchronized jz5.l a(long j17) {
        return (jz5.l) f174102b.get(java.lang.Long.valueOf(j17));
    }

    public final synchronized jz5.l b(long j17) {
        jz5.l lVar;
        lVar = (jz5.l) f174102b.remove(java.lang.Long.valueOf(j17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("remove extState=");
        sb6.append(lVar != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a) lVar.f384366d : null);
        sb6.append(" for pkgId=");
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtStateManager", sb6.toString());
        return lVar;
    }

    public final synchronized void c(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a state, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtStateManager", "set ExtState=" + state + " for pkgId=" + j17);
        f174102b.put(java.lang.Long.valueOf(j17), new jz5.l(state, obj));
    }
}

package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.backup.roambackup.b f92568a = new com.tencent.mm.plugin.backup.roambackup.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f92569b = new java.util.HashMap();

    public final synchronized jz5.l a(long j17) {
        return (jz5.l) f92569b.get(java.lang.Long.valueOf(j17));
    }

    public final synchronized jz5.l b(long j17) {
        jz5.l lVar;
        lVar = (jz5.l) f92569b.remove(java.lang.Long.valueOf(j17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("remove extState=");
        sb6.append(lVar != null ? (com.tencent.mm.plugin.backup.roambackup.a) lVar.f302833d : null);
        sb6.append(" for pkgId=");
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i("ExtStateManager", sb6.toString());
        return lVar;
    }

    public final synchronized void c(long j17, com.tencent.mm.plugin.backup.roambackup.a state, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(state, "state");
        com.tencent.mars.xlog.Log.i("ExtStateManager", "set ExtState=" + state + " for pkgId=" + j17);
        f92569b.put(java.lang.Long.valueOf(j17), new jz5.l(state, obj));
    }
}

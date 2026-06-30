package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class k8 {

    /* renamed from: d */
    public static int f102331d;

    /* renamed from: a */
    public static final com.tencent.mm.plugin.finder.assist.k8 f102328a = new com.tencent.mm.plugin.finder.assist.k8();

    /* renamed from: b */
    public static final java.util.HashMap f102329b = new java.util.HashMap();

    /* renamed from: c */
    public static final java.util.HashMap f102330c = new java.util.HashMap();

    /* renamed from: e */
    public static final jz5.g f102332e = jz5.h.b(com.tencent.mm.plugin.finder.assist.j8.f102292d);

    public static /* synthetic */ r45.nw6 f(com.tencent.mm.plugin.finder.assist.k8 k8Var, java.lang.String str, java.lang.String str2, im5.b bVar, zy2.i5 i5Var, zy2.i5 i5Var2, boolean z17, int i17, int i18, r45.gz0 gz0Var, int i19, java.lang.Object obj) {
        return k8Var.e(str, str2, bVar, i5Var, i5Var2, (i19 & 32) != 0 ? false : z17, (i19 & 64) != 0 ? 0 : i17, (i19 & 128) != 0 ? 0 : i18, (i19 & 256) != 0 ? null : gz0Var);
    }

    public final void a(pq5.g gVar, java.lang.String str, zy2.i5 i5Var, zy2.i5 i5Var2) {
        gVar.K(new com.tencent.mm.plugin.finder.assist.g8(str, i5Var, i5Var2));
    }

    public final r45.nw6 b(java.lang.String username) {
        r45.nw6 nw6Var;
        kotlin.jvm.internal.o.g(username, "username");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getPreviewInfo " + username + ' ');
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.G1).getValue()).r()).intValue() == 1) {
            sb6.append("from lru");
            com.tencent.mm.plugin.finder.assist.f8 f8Var = (com.tencent.mm.plugin.finder.assist.f8) d().b(username);
            nw6Var = f8Var != null ? f8Var.f102171a : null;
        } else {
            nw6Var = (r45.nw6) f102329b.get(username);
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(" result=");
        sb7.append(nw6Var != null ? nw6Var.hashCode() : 0);
        sb6.append(sb7.toString());
        com.tencent.mars.xlog.Log.i("FinderWxProfileManager", sb6.toString());
        return nw6Var;
    }

    public final java.lang.Integer c(java.lang.String str) {
        java.lang.Integer num;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getRequestTime " + str + ' ');
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.G1).getValue()).r()).intValue() == 1) {
            sb6.append("from lru");
            com.tencent.mm.plugin.finder.assist.f8 f8Var = (com.tencent.mm.plugin.finder.assist.f8) d().b(str);
            num = f8Var != null ? f8Var.f102172b : null;
        } else {
            num = (java.lang.Integer) f102330c.get(str);
        }
        sb6.append(" result=" + num);
        com.tencent.mars.xlog.Log.i("FinderWxProfileManager", sb6.toString());
        return num;
    }

    public final com.tencent.mm.sdk.platformtools.c0 d() {
        return (com.tencent.mm.sdk.platformtools.c0) ((jz5.n) f102332e).getValue();
    }

    public final r45.nw6 e(java.lang.String str, java.lang.String str2, im5.b bVar, zy2.i5 i5Var, zy2.i5 i5Var2, boolean z17, int i17, int i18, r45.gz0 gz0Var) {
        java.lang.Integer c17;
        pq5.g l17;
        if (str == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (i5Var2 == null) {
                return null;
            }
            i5Var2.a(-1000);
            return null;
        }
        if (c01.id.e() - (z17 ? 0 : (kotlin.jvm.internal.o.b(str, c01.z1.r()) || (c17 = c(str)) == null) ? 0 : c17.intValue()) > f102331d) {
            if (bVar != null) {
                l17 = new db2.a4(str, i17, "", i18, str2, gz0Var).l();
                l17.f(bVar);
            } else {
                l17 = new db2.a4(str, i17, "", i18, str2, gz0Var).l();
            }
            a(l17, str, i5Var, i5Var2);
        }
        return b(str);
    }

    public final void g(java.lang.String str, int i17) {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.G1).getValue()).r()).intValue() != 1) {
            f102330c.put(str, java.lang.Integer.valueOf(i17));
            return;
        }
        com.tencent.mm.plugin.finder.assist.f8 f8Var = (com.tencent.mm.plugin.finder.assist.f8) d().b(str);
        if (f8Var == null) {
            f8Var = new com.tencent.mm.plugin.finder.assist.f8(null, null);
        }
        com.tencent.mm.sdk.platformtools.c0 d17 = d();
        f8Var.f102172b = java.lang.Integer.valueOf(i17);
        d17.d(str, f8Var);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes10.dex */
public final class k8 {

    /* renamed from: d */
    public static int f183864d;

    /* renamed from: a */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.k8 f183861a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.k8();

    /* renamed from: b */
    public static final java.util.HashMap f183862b = new java.util.HashMap();

    /* renamed from: c */
    public static final java.util.HashMap f183863c = new java.util.HashMap();

    /* renamed from: e */
    public static final jz5.g f183865e = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.j8.f183825d);

    public static /* synthetic */ r45.nw6 f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.k8 k8Var, java.lang.String str, java.lang.String str2, im5.b bVar, zy2.i5 i5Var, zy2.i5 i5Var2, boolean z17, int i17, int i18, r45.gz0 gz0Var, int i19, java.lang.Object obj) {
        return k8Var.e(str, str2, bVar, i5Var, i5Var2, (i19 & 32) != 0 ? false : z17, (i19 & 64) != 0 ? 0 : i17, (i19 & 128) != 0 ? 0 : i18, (i19 & 256) != 0 ? null : gz0Var);
    }

    public final void a(pq5.g gVar, java.lang.String str, zy2.i5 i5Var, zy2.i5 i5Var2) {
        gVar.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g8(str, i5Var, i5Var2));
    }

    public final r45.nw6 b(java.lang.String username) {
        r45.nw6 nw6Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getPreviewInfo " + username + ' ');
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.G1).mo141623x754a37bb()).r()).intValue() == 1) {
            sb6.append("from lru");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.f8 f8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.f8) d().b(username);
            nw6Var = f8Var != null ? f8Var.f183704a : null;
        } else {
            nw6Var = (r45.nw6) f183862b.get(username);
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(" result=");
        sb7.append(nw6Var != null ? nw6Var.hashCode() : 0);
        sb6.append(sb7.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderWxProfileManager", sb6.toString());
        return nw6Var;
    }

    public final java.lang.Integer c(java.lang.String str) {
        java.lang.Integer num;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getRequestTime " + str + ' ');
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.G1).mo141623x754a37bb()).r()).intValue() == 1) {
            sb6.append("from lru");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.f8 f8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.f8) d().b(str);
            num = f8Var != null ? f8Var.f183705b : null;
        } else {
            num = (java.lang.Integer) f183863c.get(str);
        }
        sb6.append(" result=" + num);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderWxProfileManager", sb6.toString());
        return num;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.c0 d() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.c0) ((jz5.n) f183865e).mo141623x754a37bb();
    }

    public final r45.nw6 e(java.lang.String str, java.lang.String str2, im5.b bVar, zy2.i5 i5Var, zy2.i5 i5Var2, boolean z17, int i17, int i18, r45.gz0 gz0Var) {
        java.lang.Integer c17;
        pq5.g l17;
        if (str == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (i5Var2 == null) {
                return null;
            }
            i5Var2.a(-1000);
            return null;
        }
        if (c01.id.e() - (z17 ? 0 : (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, c01.z1.r()) || (c17 = c(str)) == null) ? 0 : c17.intValue()) > f183864d) {
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.G1).mo141623x754a37bb()).r()).intValue() != 1) {
            f183863c.put(str, java.lang.Integer.valueOf(i17));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.f8 f8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.f8) d().b(str);
        if (f8Var == null) {
            f8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.f8(null, null);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.c0 d17 = d();
        f8Var.f183705b = java.lang.Integer.valueOf(i17);
        d17.d(str, f8Var);
    }
}

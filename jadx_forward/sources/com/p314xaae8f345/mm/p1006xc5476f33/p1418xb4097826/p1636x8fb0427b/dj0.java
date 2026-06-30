package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes10.dex */
public final class dj0 extends l75.n0 implements zy2.cb {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f208190g = {l75.n0.m145250x3fdc6f77(qb2.x1.K, "FinderSessionInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f208191d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f208192e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f208193f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj0(l75.k0 db6) {
        super(db6, qb2.x1.K, "FinderSessionInfo", dm.b5.f317386u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = qb2.x1.K;
        this.f208191d = db6;
        this.f208192e = new java.util.concurrent.ConcurrentHashMap();
        this.f208193f = new java.util.concurrent.ConcurrentHashMap();
    }

    public java.util.LinkedList D0(java.lang.String senderUserName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(senderUserName, "senderUserName");
        if (senderUserName.length() == 0) {
            return null;
        }
        java.lang.String sql = "select * , rowid from FinderSessionInfo where senderUserName = '" + senderUserName + "' ";
        java.util.LinkedList linkedList = new java.util.LinkedList();
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        android.database.Cursor B = this.f208191d.B(sql, null);
        try {
            java.lang.String name = java.lang.Thread.currentThread().getName();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "getName(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sql, "sql");
            new qb2.r("FinderSessionInfoStorage.getSessionInfoBySenderUserName", r26.i0.u(sql, ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
            while (B.moveToNext()) {
                qb2.x1 x1Var = new qb2.x1();
                x1Var.mo9015xbf5d97fd(B);
                linkedList.add(x1Var);
            }
            vz5.b.a(B, null);
            return linkedList;
        } finally {
        }
    }

    public qb2.x1 J0(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return new qb2.x1();
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f208193f;
        qb2.x1 x1Var = (qb2.x1) concurrentHashMap.get(str);
        if (x1Var == null) {
            java.lang.String sql = "select * , rowid from FinderSessionInfo where sessionId = '" + str + "' ";
            x1Var = new qb2.x1();
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            android.database.Cursor B = this.f208191d.B(sql, null);
            try {
                java.lang.String name = java.lang.Thread.currentThread().getName();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "getName(...)");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sql, "sql");
                new qb2.r("FinderSessionInfoStorage.getSessionInfoBySessionId", r26.i0.u(sql, ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
                if (B.moveToFirst()) {
                    x1Var.mo9015xbf5d97fd(B);
                }
                vz5.b.a(B, null);
                if (x1Var.f72763xa3c65b86 > 0) {
                    concurrentHashMap.put(str, x1Var);
                    this.f208192e.put(x1Var.f65985x114ef53e + '_' + x1Var.f65983x1362f030, x1Var);
                }
            } finally {
            }
        }
        return x1Var;
    }

    public void L0(java.lang.String sessionId, java.lang.String talker, int i17, int i18, zy2.bb source, int i19, int i27, java.lang.String senderUserName, int i28, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(senderUserName, "senderUserName");
        qb2.x1 x1Var = new qb2.x1();
        x1Var.f65984xbed8694c = sessionId;
        x1Var.f65985x114ef53e = talker;
        x1Var.f65986x2262335f = i17;
        x1Var.f65987xa783a79b = c01.id.c();
        x1Var.f65981x55775f67 = g92.b.f351302e.U();
        x1Var.f65976xaf64e94a = i18;
        x1Var.f65980x36454e5d = i19;
        x1Var.f65977x83e02cb6 = i27;
        x1Var.f65983x1362f030 = senderUserName;
        x1Var.f65982x13644c0a = com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(senderUserName) ? 3 : com.p314xaae8f345.mm.p2621x8fb0427b.z3.T3(senderUserName) ? 2 : 1;
        x1Var.f65979x404ea322 = i28;
        x1Var.f65978x3679555d = z17;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(talker)) {
            throw new java.lang.RuntimeException(talker.concat(" is invalid"));
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        boolean mo55864x413cb2b4 = mo55864x413cb2b4(x1Var, false);
        java.lang.String name = java.lang.Thread.currentThread().getName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "getName(...)");
        new qb2.r("FinderSessionInfoStorage.replaceSessionInfo", r26.i0.u("replace", ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
        if (mo55864x413cb2b4) {
            this.f208192e.remove(x1Var.f65985x114ef53e + '_' + x1Var.f65983x1362f030);
            this.f208193f.remove(sessionId);
            mo145247xf35bbb4(x1Var.f65984xbed8694c);
        }
        if (source == zy2.bb.f558890g) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t80 Kj = ((c61.l7) i95.n0.c(c61.l7.class)).Kj();
            qb2.t D0 = Kj.D0(sessionId);
            D0.f65868x114ef53e = talker;
            D0.f65851xaf64e94a = i18;
            D0.f65869x2262335f = i17;
            if (!Kj.mo55864x413cb2b4(D0, false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.SessionStorage", "[replaceSessionInfo] fail! sessionId=".concat(sessionId));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SessionStorage", "[replaceSessionInfo] source=" + source + ", ret=" + mo55864x413cb2b4 + ", sessionId=" + sessionId + ", talker=" + talker + ", actionPermission=" + i18 + ", type=" + i17 + ", followType=" + i28);
    }

    public void P0(java.lang.String sessionId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        qb2.x1 J0 = J0(sessionId);
        J0.f65980x36454e5d = i17;
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        boolean mo51732xbf274172 = mo51732xbf274172(J0, false, new java.lang.String[0]);
        java.lang.String name = java.lang.Thread.currentThread().getName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "getName(...)");
        new qb2.r("FinderSessionInfoStorage.updateOpType", r26.i0.u("updateNotify", ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
        if (mo51732xbf274172) {
            this.f208192e.remove(J0.f65985x114ef53e + '_' + J0.f65983x1362f030);
            this.f208193f.remove(J0.f65984xbed8694c);
            mo145247xf35bbb4(J0.f65984xbed8694c);
        }
    }

    public void W0(java.lang.String sessionId, int i17, int i18, int i19, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        qb2.x1 J0 = J0(sessionId);
        J0.f65980x36454e5d = i17;
        J0.f65976xaf64e94a = i18;
        J0.f65979x404ea322 = i19;
        J0.f65978x3679555d = z17;
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        mo51732xbf274172(J0, false, new java.lang.String[0]);
        java.lang.String name = java.lang.Thread.currentThread().getName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "getName(...)");
        new qb2.r("FinderSessionInfoStorage.updateOpTypeAndAction", r26.i0.u("updateNotify", ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
        if (mo51732xbf274172(J0, false, new java.lang.String[0])) {
            this.f208192e.remove(J0.f65985x114ef53e + '_' + J0.f65983x1362f030);
            this.f208193f.remove(J0.f65984xbed8694c);
            mo145247xf35bbb4(J0.f65984xbed8694c);
        }
    }

    public boolean y0(java.lang.String sessionId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        qb2.x1 J0 = J0(sessionId);
        this.f208193f.remove(sessionId);
        this.f208192e.remove(J0.f65985x114ef53e + '_' + J0.f65983x1362f030);
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        boolean mo49766xb06685ab = mo49766xb06685ab(J0, z17, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
        java.lang.String name = java.lang.Thread.currentThread().getName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "getName(...)");
        new qb2.r("FinderSessionInfoStorage.deleteSession", r26.i0.u("updateNotify", ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
        return mo49766xb06685ab;
    }

    public java.lang.String z0(java.lang.String str, int i17) {
        qb2.x1 x1Var;
        if (str == null || str.length() == 0) {
            x1Var = new qb2.x1();
        } else {
            java.lang.String U = i17 != 1 ? i17 != 2 ? i17 != 3 ? "" : g92.b.f351302e.U() : c01.z1.k() : c01.z1.r();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f208192e;
            qb2.x1 x1Var2 = (qb2.x1) concurrentHashMap.get(str + '_' + U);
            if (x1Var2 == null) {
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                java.lang.String sql = "select * , rowid from FinderSessionInfo  where talker = '" + str + "' and senderUserName = '" + U + '\'';
                android.database.Cursor B = this.f208191d.B(sql, null);
                try {
                    java.lang.String name = java.lang.Thread.currentThread().getName();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "getName(...)");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sql, "sql");
                    new qb2.r("FinderSessionInfoStorage.getSessionInfoByTalker", r26.i0.u(sql, ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
                    if (B.moveToFirst()) {
                        qb2.x1 x1Var3 = new qb2.x1();
                        x1Var3.mo9015xbf5d97fd(B);
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = this.f208193f;
                        java.lang.String field_sessionId = x1Var3.f65984xbed8694c;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
                        concurrentHashMap2.put(field_sessionId, x1Var3);
                        concurrentHashMap.put(str + '_' + U, x1Var3);
                        vz5.b.a(B, null);
                        x1Var = x1Var3;
                    } else {
                        vz5.b.a(B, null);
                        x1Var = null;
                    }
                } catch (java.lang.Throwable th6) {
                    try {
                        throw th6;
                    } catch (java.lang.Throwable th7) {
                        vz5.b.a(B, th6);
                        throw th7;
                    }
                }
            } else {
                x1Var = x1Var2;
            }
        }
        java.lang.String str2 = x1Var != null ? x1Var.f65984xbed8694c : null;
        return str2 == null ? "" : str2;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes10.dex */
public final class t80 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.q80 f209599e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.q80(null);

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f209600f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.p80 f209601g;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f209602d;

    static {
        l75.e0 e0Var = qb2.t.H1;
        f209600f = new java.lang.String[]{l75.n0.m145250x3fdc6f77(qb2.t.H1, "FinderConversation")};
        f209601g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.p80();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t80(l75.k0 db6) {
        super(db6, qb2.t.H1, "FinderConversation", dm.a4.K);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = qb2.t.H1;
        this.f209602d = db6;
        db6.A("FinderConversation", "CREATE INDEX IF NOT EXISTS FinderConversation_scene_type_senderUserName_index ON FinderConversation(scene,type,senderUserName)");
        db6.A("FinderConversation", "CREATE INDEX IF NOT EXISTS FinderConversation_scene_type_senderUserNameVersion_index ON FinderConversation(scene,type,senderUserNameVersion)");
        db6.A("FinderConversation", "CREATE INDEX IF NOT EXISTS FinderConversation_scene_type_talker_index ON FinderConversation(scene,type,talker)");
    }

    public qb2.t D0(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        java.lang.String sql = "select *, rowid from FinderConversation where sessionId = '" + sessionId + "' ";
        android.database.Cursor B = this.f209602d.B(sql, null);
        qb2.t tVar = new qb2.t(f209601g);
        tVar.f65866xbed8694c = sessionId;
        if (B != null) {
            if (B.moveToFirst()) {
                tVar.mo9015xbf5d97fd(B);
            }
            B.close();
        }
        java.lang.String name = java.lang.Thread.currentThread().getName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "getName(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sql, "sql");
        new qb2.r("FinderConversationStorage.get", r26.i0.u(sql, ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
        return tVar;
    }

    public int J0(int i17, java.lang.String finderUsername) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        m92.b b17 = g92.b.f351302e.b1(finderUsername, true);
        if (b17 == null) {
            return 0;
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        p75.n0 n0Var = dm.a4.B;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        p75.m c17 = dm.a4.H.i(java.lang.Integer.valueOf(i17)).c(dm.a4.G.i(1));
        p75.d dVar = dm.a4.I;
        java.lang.String field_finder_version_username_history = b17.f68700xd6cccd66;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_finder_version_username_history, "field_finder_version_username_history");
        p75.y yVar = (p75.y) c17;
        yVar.f(dVar.l(kz5.n0.S0(r26.n0.f0(field_finder_version_username_history, new java.lang.String[]{";"}, false, 0, 6, null))));
        p75.i0 g17 = dm.a4.B.g(linkedList);
        g17.f434190d = yVar;
        g17.d(linkedList2);
        g17.b(linkedList3);
        p75.l0 a17 = g17.a();
        java.util.List k17 = a17.k(this.f209602d, qb2.t.class);
        java.lang.String name = java.lang.Thread.currentThread().getName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "getName(...)");
        java.lang.String sql = a17.f434169a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sql, "sql");
        new qb2.r("FinderConversationStorage.getGreetConvCount", r26.i0.u(sql, ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
        return ((java.util.ArrayList) k17).size();
    }

    public int L0(int i17, int i18, java.lang.String finderUsername) {
        p75.l0 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        if (i17 != 1) {
            m92.b b17 = g92.b.f351302e.b1(finderUsername, true);
            if (b17 == null) {
                return 0;
            }
            if (i18 >= 0) {
                p75.i0 h17 = dm.a4.B.h(dm.a4.D.y());
                p75.d dVar = dm.a4.I;
                java.lang.String field_finder_version_username_history = b17.f68700xd6cccd66;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_finder_version_username_history, "field_finder_version_username_history");
                h17.f434190d = dVar.l(r26.n0.f0(field_finder_version_username_history, new java.lang.String[]{";"}, false, 0, 6, null)).c(dm.a4.G.i(java.lang.Integer.valueOf(i18)).c(dm.a4.H.i(java.lang.Integer.valueOf(i17))));
                h17.f434189c = "Finder.ConversationStorage";
                a17 = h17.a();
            } else {
                p75.i0 h18 = dm.a4.B.h(dm.a4.D.y());
                p75.d dVar2 = dm.a4.I;
                java.lang.String field_finder_version_username_history2 = b17.f68700xd6cccd66;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_finder_version_username_history2, "field_finder_version_username_history");
                h18.f434190d = dVar2.l(r26.n0.f0(field_finder_version_username_history2, new java.lang.String[]{";"}, false, 0, 6, null)).c(dm.a4.H.i(java.lang.Integer.valueOf(i17)));
                h18.f434189c = "Finder.ConversationStorage";
                a17 = h18.a();
            }
        } else if (i18 >= 0) {
            p75.i0 h19 = dm.a4.B.h(dm.a4.D.y());
            h19.f434190d = dm.a4.G.i(java.lang.Integer.valueOf(i18)).c(dm.a4.H.i(java.lang.Integer.valueOf(i17)));
            h19.f434189c = "Finder.ConversationStorage";
            a17 = h19.a();
        } else {
            p75.i0 h27 = dm.a4.B.h(dm.a4.D.y());
            h27.f434190d = dm.a4.G.i(java.lang.Integer.valueOf(i18)).c(dm.a4.H.i(java.lang.Integer.valueOf(i17)));
            h27.f434189c = "Finder.ConversationStorage";
            a17 = h27.a();
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        int m17 = a17.m(this.f209602d);
        java.lang.String name = java.lang.Thread.currentThread().getName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "getName(...)");
        java.lang.String sql = a17.f434169a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sql, "sql");
        new qb2.r("FinderConversationStorage.getUnreadCount", r26.i0.u(sql, ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ConversationStorage", "[getUnreadCount] type=" + i18 + " count=" + m17);
        return m17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [p75.d] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List, kz5.p0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.ArrayList] */
    public java.util.List P0(java.lang.String finderUsername, int i17, int i18, int[] iArr, int i19) {
        java.util.List S0;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        ?? r66 = kz5.p0.f395529d;
        if (i19 == 1) {
            S0 = kz5.c0.i(c01.z1.r(), c01.z1.k());
        } else {
            m92.b b17 = g92.b.f351302e.b1(finderUsername, true);
            if (b17 == null) {
                return r66;
            }
            java.lang.String field_finder_version_username_history = b17.f68700xd6cccd66;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_finder_version_username_history, "field_finder_version_username_history");
            S0 = kz5.n0.S0(r26.n0.f0(field_finder_version_username_history, new java.lang.String[]{";"}, false, 0, 6, null));
        }
        if (iArr != null) {
            arrayList = new java.util.ArrayList();
            int length = iArr.length;
            for (int i27 = 0; i27 < length; i27++) {
                int i28 = iArr[i27];
                if (i28 >= 100) {
                    arrayList.add(java.lang.Integer.valueOf(i28));
                }
            }
        } else {
            arrayList = r66;
        }
        if (iArr != null) {
            r66 = new java.util.ArrayList();
            int length2 = iArr.length;
            for (int i29 = 0; i29 < length2; i29++) {
                int i37 = iArr[i29];
                if (i37 < 100) {
                    r66.add(java.lang.Integer.valueOf(i37));
                }
            }
        }
        p75.n0 n0Var = dm.a4.B;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        java.util.LinkedList linkedList4 = new java.util.LinkedList();
        p75.m0 i38 = dm.a4.H.i(java.lang.Integer.valueOf(i19));
        p75.m0 l17 = dm.a4.I.l(S0);
        ?? r142 = dm.a4.G;
        p75.y yVar = (p75.y) i38.c(l17.c(r142.k(r66)));
        yVar.g(r142.k(arrayList), p75.o.f434211e);
        linkedList3.add(dm.a4.F.u());
        linkedList3.add(dm.a4.E.u());
        p75.i0 g17 = dm.a4.B.g(linkedList2);
        g17.f434190d = yVar;
        g17.f434192f = linkedList3;
        g17.f434193g = linkedList4;
        g17.c(i18, i17);
        p75.l0 a17 = g17.a();
        java.util.Iterator it = ((java.util.ArrayList) a17.k(this.f209602d, qb2.t.class)).iterator();
        while (it.hasNext()) {
            qb2.t tVar = (qb2.t) it.next();
            tVar.C1 = f209601g;
            tVar.u0();
            linkedList.add(tVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ConversationStorage", "SQL=" + a17);
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        java.lang.String name = java.lang.Thread.currentThread().getName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "getName(...)");
        java.lang.String sql = a17.m157942x9616526c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sql, "sql");
        new qb2.r("FinderConversationStorage.queryLimit", r26.i0.u(sql, ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[query] finderUsername=");
        sb6.append(finderUsername);
        sb6.append(" offset=");
        sb6.append(i17);
        sb6.append(" pageCount=");
        sb6.append(i18);
        sb6.append(" type=");
        if (iArr != null) {
            arrayList2 = new java.util.ArrayList(iArr.length);
            for (int i39 : iArr) {
                arrayList2.add(java.lang.Integer.valueOf(i39));
            }
        } else {
            arrayList2 = null;
        }
        sb6.append(arrayList2);
        sb6.append(" list size=");
        sb6.append(linkedList.size());
        sb6.append(", scene=");
        sb6.append(i19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ConversationStorage", sb6.toString());
        return linkedList;
    }

    @Override // l75.n0
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public boolean mo55864x413cb2b4(qb2.t tVar, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[replace] ");
        sb6.append(tVar != null ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.u80.a(tVar) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ConversationStorage", sb6.toString());
        boolean z18 = false;
        if (tVar == null) {
            return false;
        }
        android.content.ContentValues mo9763xeb27878e = tVar.mo9763xeb27878e();
        java.lang.String field_sessionId = tVar.f65866xbed8694c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        java.lang.String sql = "select *, rowid from FinderConversation where sessionId = '" + field_sessionId + "' ";
        l75.k0 k0Var = this.f209602d;
        android.database.Cursor B = k0Var.B(sql, null);
        try {
            java.lang.String name = java.lang.Thread.currentThread().getName();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "getName(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sql, "sql");
            new qb2.r("FinderConversationStorage.isExit", r26.i0.u(sql, ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
            boolean z19 = B.getCount() > 0;
            vz5.b.a(B, null);
            if (z19) {
                if (k0Var.p(mo145255x88e404c3(), mo9763xeb27878e, "sessionId = ?", new java.lang.String[]{"" + tVar.f65866xbed8694c}) > 0) {
                    z18 = true;
                }
            } else {
                z18 = super.mo51731x24249762(tVar, false);
            }
            if (z18 && z17) {
                mo145247xf35bbb4(tVar.f65866xbed8694c);
            }
            return z18;
        } finally {
        }
    }

    @Override // l75.n0
    /* renamed from: deleteNotify */
    public boolean mo60485xc9e4dcd4(long j17, boolean z17) {
        qb2.t tVar = new qb2.t(f209601g);
        if (get(j17, tVar)) {
            tVar.u0();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ConversationStorage", "[delete] rowId=" + j17 + " isNotify=" + z17 + ' ' + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.u80.a(tVar));
        return super.mo60485xc9e4dcd4(j17, z17);
    }

    public boolean y0(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        boolean z17 = false;
        if (sessionId.length() == 0) {
            return false;
        }
        qb2.t D0 = D0(sessionId);
        int i17 = D0.f65870xa35b5abb;
        D0.f65870xa35b5abb = 0;
        D0.f65861x9b4f418d = 1;
        if (i17 != 0) {
            z17 = m145258xce0038c9(D0.f72763xa3c65b86, D0, false);
            mo142179xf35bbb4(D0.f65866xbed8694c, 5, D0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ConversationStorage", "[clearUnreadCount] ret=" + z17 + ' ' + i17 + " => " + D0.f65870xa35b5abb + " sessionId=" + sessionId);
        return z17;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public boolean mo49766xb06685ab(qb2.t tVar, boolean z17, java.lang.String... keys) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keys, "keys");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[delete] ");
        sb6.append(tVar != null ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.u80.a(tVar) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ConversationStorage", sb6.toString());
        return super.mo49766xb06685ab(tVar, z17, (java.lang.String[]) java.util.Arrays.copyOf(keys, keys.length));
    }

    @Override // l75.n0
    /* renamed from: delete */
    public boolean mo9951xb06685ab(l75.f0 f0Var, java.lang.String[] keys) {
        qb2.t tVar = (qb2.t) f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keys, "keys");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[delete] ");
        sb6.append(tVar != null ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.u80.a(tVar) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ConversationStorage", sb6.toString());
        return super.mo9951xb06685ab(tVar, (java.lang.String[]) java.util.Arrays.copyOf(keys, keys.length));
    }
}

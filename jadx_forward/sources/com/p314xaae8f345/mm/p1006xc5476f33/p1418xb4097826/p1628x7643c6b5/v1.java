package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

@j95.b
/* loaded from: classes10.dex */
public final class v1 extends i95.w implements zy2.g6 {
    public v1() {
        xu5.b.a("FinderConversationNotify");
    }

    public boolean Ai(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(str)) {
            return ((c61.l7) i95.n0.c(c61.l7.class)).Kj().D0(str).f65860xa97e89ae > 0;
        }
        throw new java.lang.RuntimeException("sessionId[" + str + "] is not session");
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        le0.x.Q0.add(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.u1.f207750a);
    }

    public int wi(java.lang.String sessionId) {
        if (sessionId == null || sessionId.length() == 0) {
            return 0;
        }
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(sessionId)) {
            throw new java.lang.RuntimeException("sessionId[" + sessionId + "] is not session");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t80 Kj = ((c61.l7) i95.n0.c(c61.l7.class)).Kj();
        Kj.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p75.n0 n0Var = dm.a4.B;
        p75.d UNREADCOUNT = dm.a4.D;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UNREADCOUNT, "UNREADCOUNT");
        p75.i0 h17 = n0Var.h(UNREADCOUNT);
        h17.f434190d = dm.a4.C.j(sessionId);
        h17.f434189c = "Finder.ConversationStorage";
        p75.l0 a17 = h17.a();
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        int m17 = a17.m(Kj.f209602d);
        java.lang.String name = java.lang.Thread.currentThread().getName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "getName(...)");
        java.lang.String sql = a17.f434169a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sql, "sql");
        new qb2.r("FinderConversationStorage.getUnreadCount#sessionId", r26.i0.u(sql, ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ConversationStorage", "[getUnreadCount] sessionId=" + sessionId + ' ' + m17);
        return m17;
    }
}

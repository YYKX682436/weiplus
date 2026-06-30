package z53;

/* loaded from: classes8.dex */
public final class t extends l75.n0 implements n60.j {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f551800e = {l75.n0.m145250x3fdc6f77(z53.i.I, "GameLifeConversation")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f551801d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(l75.k0 db6) {
        super(db6, z53.i.I, "GameLifeConversation", dm.n5.f320213r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = z53.i.I;
        this.f551801d = db6;
        add(((t53.m0) i95.n0.c(t53.m0.class)).f497338p);
    }

    public final java.util.List Ca(int i17, int i18) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        android.database.Cursor B = this.f551801d.B("select *, rowid from GameLifeConversation ORDER BY updateTime DESC limit " + i18 + " offset " + i17, null);
        try {
            if (B.moveToFirst()) {
                while (!B.isAfterLast()) {
                    z53.i iVar = new z53.i();
                    iVar.mo9015xbf5d97fd(B);
                    linkedList.add(iVar);
                    B.moveToNext();
                }
            }
            vz5.b.a(B, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.ConversationStorage", "[query] offset=" + i17 + " pageCount=" + i18 + " list size=" + linkedList.size());
            return linkedList;
        } finally {
        }
    }

    public final z53.i D0() {
        android.database.Cursor B = this.f551801d.B("SELECT *, rowid FROM GameLifeConversation WHERE unReadCount>0 ORDER BY updateTime DESC LIMIT 1", null);
        try {
            if (!B.moveToFirst() || B.isAfterLast()) {
                vz5.b.a(B, null);
                return null;
            }
            z53.i iVar = new z53.i();
            iVar.mo9015xbf5d97fd(B);
            vz5.b.a(B, null);
            return iVar;
        } finally {
        }
    }

    @Override // l75.n0
    /* renamed from: replace */
    public boolean mo11260x413cb2b4(l75.f0 f0Var) {
        z53.i iVar = (z53.i) f0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[replace] ");
        sb6.append(iVar != null ? z53.u.a(iVar) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.ConversationStorage", sb6.toString());
        return super.mo11260x413cb2b4(iVar);
    }

    public final boolean y0(java.lang.String sessionId) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.a4(sessionId)) {
            z17 = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.PluginGameLife", "check sessionId failed");
            z17 = false;
        }
        if (!z17) {
            return false;
        }
        z53.i z07 = z0(sessionId);
        int i17 = z07.f67671xa35b5abb;
        z07.f67671xa35b5abb = 0;
        z07.f67664x6b18c3b5 = 0L;
        z07.f67665x195d889b = null;
        boolean m145258xce0038c9 = m145258xce0038c9(z07.f72763xa3c65b86, z07, false);
        mo142179xf35bbb4("single", 4, z07);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.ConversationStorage", "[clearUnreadCount] ret=" + m145258xce0038c9 + ' ' + i17 + " => " + z07.f67671xa35b5abb + " sessionId=" + sessionId);
        return m145258xce0038c9;
    }

    public final z53.i z0(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        android.database.Cursor B = this.f551801d.B("select *, rowid from GameLifeConversation where sessionId = '" + sessionId + "' ", null);
        z53.i iVar = new z53.i();
        iVar.f67669xbed8694c = sessionId;
        if (B != null) {
            if (B.moveToFirst()) {
                iVar.mo9015xbf5d97fd(B);
            }
            B.close();
        }
        return iVar;
    }
}

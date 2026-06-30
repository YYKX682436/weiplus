package g63;

/* loaded from: classes8.dex */
public final class u implements m33.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g63.f0 f350708a;

    public u(g63.f0 f0Var) {
        this.f350708a = f0Var;
    }

    public final void a(m33.d1 d1Var) {
        if (d1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.ConversationPresenter", "checkHistoryConversation gameLifeHistoryNode null");
            return;
        }
        if (!d1Var.f404813a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.ConversationPresenter", "checkHistoryConversation gameLifeNode.hasGameLife false");
            return;
        }
        g63.f0 f0Var = this.f350708a;
        z53.t tVar = f0Var.f350643e;
        tVar.getClass();
        z53.i iVar = new z53.i();
        android.database.Cursor B = tVar.f551801d.B("SELECT *, rowid FROM GameLifeConversation WHERE sessionId='@gamelifehistory'", null);
        try {
            if (B.moveToFirst()) {
                iVar.mo9015xbf5d97fd(B);
                vz5.b.a(B, null);
            } else {
                vz5.b.a(B, null);
            }
            int i17 = d1Var.f404814b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.ConversationPresenter", "checkHistoryConversation sysrowid: " + iVar.f72763xa3c65b86 + " old: " + iVar.f67671xa35b5abb + " new: " + i17);
            int i18 = iVar.f67671xa35b5abb;
            if (i18 == Integer.MAX_VALUE) {
                return;
            }
            long j17 = iVar.f72763xa3c65b86;
            if (j17 > 0 && i17 <= i18) {
                iVar.f67671xa35b5abb = i17;
                z53.t tVar2 = f0Var.f350643e;
                tVar2.m145258xce0038c9(j17, iVar, false);
                tVar2.mo142179xf35bbb4("single", 4, iVar);
                return;
            }
            iVar.f67672xa783a79b = c01.id.c();
            iVar.f67671xa35b5abb = i17;
            iVar.f67669xbed8694c = "@gamelifehistory";
            iVar.f67663xf66fcca9 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.fqd);
            z53.t tVar3 = f0Var.f350643e;
            tVar3.mo55864x413cb2b4(iVar, false);
            tVar3.mo142179xf35bbb4("single", iVar.f72763xa3c65b86 <= 0 ? 2 : 1, iVar);
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                vz5.b.a(B, th6);
                throw th7;
            }
        }
    }
}

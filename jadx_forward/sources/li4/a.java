package li4;

/* loaded from: classes11.dex */
public final class a extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f400317e = {l75.n0.m145250x3fdc6f77(hi4.a.f363072x1, "TextStatusConversation")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f400318d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l75.k0 db6) {
        super(db6, hi4.a.f363072x1, "TextStatusConversation", rj4.c.C);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = hi4.a.f363072x1;
        this.f400318d = db6;
        db6.A("TextStatusConversation", "CREATE INDEX IF NOT EXISTS TextStatusConversation_type_scene_index ON TextStatusConversation(scene,type)");
    }

    public static int J0(li4.a aVar, int i17, int i18, java.lang.Object obj) {
        java.lang.String str;
        if ((i18 & 1) != 0) {
            i17 = -1;
        }
        aVar.getClass();
        if (i17 < 0) {
            str = "select sum(unReadCount) from TextStatusConversation";
        } else {
            str = "select sum(unReadCount) from TextStatusConversation where updateTime > " + (i17 * 1000);
        }
        android.os.SystemClock.uptimeMillis();
        android.database.Cursor B = aVar.f400318d.B(str, null);
        try {
            int i19 = 0;
            if (B.moveToFirst() && !B.isAfterLast()) {
                i19 = B.getInt(0);
            }
            vz5.b.a(B, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusConversationStorage", "[getUnreadCount] count=" + i19);
            return i19;
        } finally {
        }
    }

    public final int D0() {
        int J0 = J0(this, 0, 1, null);
        ni4.x xVar = ni4.x.f419309d;
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TEXT_STATUS_LASTTIME_CONV_UNREAD_INT, null);
        java.lang.Integer num = m17 instanceof java.lang.Integer ? (java.lang.Integer) m17 : null;
        return J0 - (num != null ? num.intValue() : 0);
    }

    public final java.util.List L0(int i17, int i18, int[] iArr, int i19) {
        java.lang.String str;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (iArr != null) {
            java.lang.String str2 = "(";
            int i27 = 0;
            for (int i28 : iArr) {
                i27++;
                if (i28 != 100) {
                    str2 = str2 + "type=" + i28;
                    if (i27 < iArr.length) {
                        str2 = str2 + " or ";
                    }
                }
            }
            str = "select *, rowid from TextStatusConversation WHERE scene=" + i19 + " and " + r26.n0.Z(str2, " or ").concat(")") + "  ORDER BY placedFlag DESC, updateTime DESC limit " + i18 + " offset " + i17;
        } else {
            str = "select *, rowid from TextStatusConversation ORDER BY placedFlag DESC, updateTime DESC limit " + i18 + " offset " + i17;
        }
        android.os.SystemClock.uptimeMillis();
        android.database.Cursor B = this.f400318d.B(str, null);
        try {
            if (B.moveToFirst()) {
                while (!B.isAfterLast()) {
                    hi4.a aVar = new hi4.a();
                    aVar.mo9015xbf5d97fd(B);
                    aVar.t0();
                    linkedList.add(aVar);
                    B.moveToNext();
                }
            }
            vz5.b.a(B, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusConversationStorage", "[query] offset=" + i17 + " pageCount=" + i18 + " type=" + iArr + " list size=" + linkedList.size() + ", scene=" + i19);
            return linkedList;
        } finally {
        }
    }

    @Override // l75.n0
    /* renamed from: replace */
    public boolean mo55864x413cb2b4(l75.f0 f0Var, boolean z17) {
        java.lang.String str;
        hi4.a aVar = (hi4.a) f0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[replace] ");
        if (aVar != null) {
            str = "sessionId=" + aVar.f76582xbed8694c + " placedFlag=" + aVar.f76576xa97e89ae + " unReadCount=" + aVar.f76586xa35b5abb + " status=" + aVar.f76583x10a0fed7 + " updateTime=" + aVar.f76587xa783a79b + " digest=" + aVar.f76569xf66fcca9 + " digestType=" + aVar.f76570x6b1f5383 + " lastMsgID=" + aVar.f76575x11a0aa61 + " unReadCount=" + aVar.f76586xa35b5abb + "content=" + aVar.f76568xad49e234 + " isSend=" + aVar.f76574xff7bdab7 + " editingMsg=" + aVar.f76572x51f5672e + " systemRowId=" + aVar.f72763xa3c65b86 + " type=" + aVar.f76585x2262335f;
        } else {
            str = null;
        }
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusConversationStorage", sb6.toString());
        boolean z18 = false;
        if (aVar != null) {
            android.content.ContentValues mo9763xeb27878e = aVar.mo9763xeb27878e();
            java.lang.String field_sessionId = aVar.f76582xbed8694c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
            android.os.SystemClock.uptimeMillis();
            l75.k0 k0Var = this.f400318d;
            android.database.Cursor B = k0Var.B("select *, rowid from TextStatusConversation where sessionId = '" + field_sessionId + "' ", null);
            try {
                boolean z19 = B.getCount() > 0;
                vz5.b.a(B, null);
                if (z19) {
                    if (k0Var.p(mo145255x88e404c3(), mo9763xeb27878e, "sessionId = ?", new java.lang.String[]{"" + aVar.f76582xbed8694c}) > 0) {
                        z18 = true;
                    }
                } else {
                    z18 = super.mo51731x24249762(aVar, false);
                }
                if (z18 && z17) {
                    mo145247xf35bbb4(aVar.f76582xbed8694c);
                }
            } finally {
            }
        }
        return z18;
    }

    public final boolean y0(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        if (sessionId.length() == 0) {
            return false;
        }
        hi4.a z07 = z0(sessionId);
        int i17 = z07.f76586xa35b5abb;
        z07.f76586xa35b5abb = 0;
        z07.f76577x9b4f418d = 1;
        z07.f76573xe363a67 = 0;
        boolean mo11261xce0038c9 = mo11261xce0038c9(z07.f72763xa3c65b86, z07);
        mo142179xf35bbb4(z07.f76582xbed8694c, 5, z07);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusConversationStorage", "[clearUnreadCount] ret=" + mo11261xce0038c9 + ' ' + i17 + " => " + z07.f76586xa35b5abb + " sessionId=" + sessionId);
        return mo11261xce0038c9;
    }

    public final hi4.a z0(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        android.database.Cursor B = this.f400318d.B("select *, rowid from TextStatusConversation where sessionId = '" + sessionId + "' ", null);
        hi4.a aVar = new hi4.a();
        aVar.f76582xbed8694c = sessionId;
        if (B != null) {
            if (B.moveToFirst()) {
                aVar.mo9015xbf5d97fd(B);
            }
            B.close();
        }
        return aVar;
    }
}

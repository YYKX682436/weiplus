package w21;

/* loaded from: classes12.dex */
public class g1 extends l75.s0 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f523904h = {"CREATE TABLE IF NOT EXISTS voiceinfo ( FileName TEXT PRIMARY KEY, User TEXT, MsgId INT, NetOffset INT, FileNowSize INT, TotalLen INT, Status INT, CreateTime INT, LastModifyTime INT, ClientId TEXT, VoiceLength INT, MsgLocalId INT, Human TEXT, reserved1 INT, reserved2 TEXT, MsgSource TEXT, MsgFlag INT, MsgSeq INT, MasterBufId INT, checksum INT DEFAULT 0, VoiceFlag INT DEFAULT 0, VoiceInfoExt BLOB, MsgTalker TEXT  )", "CREATE INDEX IF NOT EXISTS voiceinfomsgidindex ON voiceinfo ( MsgId ) ", "CREATE UNIQUE INDEX IF NOT EXISTS voiceinfouniqueindex ON voiceinfo ( FileName )", "CREATE INDEX IF NOT EXISTS voice_unfinish_info_index ON voiceinfo ( Status,User,CreateTime )"};

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f523905i = {"CREATE INDEX IF NOT EXISTS voice_union_msgid_talker_index ON voiceinfo ( MsgId,MsgTalker )", "CREATE INDEX IF NOT EXISTS voice_union_msglocalid_talker_index ON voiceinfo ( MsgLocalId,MsgTalker )"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f523906d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f523907e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f523908f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f523909g = new java.util.HashMap();

    public g1(l75.k0 k0Var) {
        android.database.Cursor B = k0Var.B("PRAGMA table_info(voiceinfo)", null);
        if (B == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceStorage", "addNewColIfNeed failed, cursor is null.");
        } else {
            int columnIndex = B.getColumnIndex(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
            boolean z17 = false;
            boolean z18 = false;
            boolean z19 = false;
            boolean z27 = false;
            boolean z28 = false;
            boolean z29 = false;
            boolean z37 = false;
            boolean z38 = false;
            while (B.moveToNext()) {
                if (columnIndex >= 0) {
                    java.lang.String string = B.getString(columnIndex);
                    z17 = "MsgSource".equals(string) ? true : z17;
                    z18 = "MsgFlag".equals(string) ? true : z18;
                    z19 = "MsgSeq".equals(string) ? true : z19;
                    z27 = "MasterBufId".equals(string) ? true : z27;
                    z28 = "checksum".equals(string) ? true : z28;
                    z29 = "VoiceFlag".equals(string) ? true : z29;
                    z37 = "VoiceInfoExt".equals(string) ? true : z37;
                    if ("MsgTalker".equals(string)) {
                        z38 = true;
                    }
                }
            }
            B.close();
            if (!z17) {
                k0Var.A("voiceinfo", "Alter table voiceinfo add MsgSource TEXT");
            }
            if (!z18) {
                k0Var.A("voiceinfo", "Alter table voiceinfo add MsgFlag INT");
            }
            if (!z19) {
                k0Var.A("voiceinfo", "Alter table voiceinfo add MsgSeq INT");
            }
            if (!z27) {
                k0Var.A("voiceinfo", "Alter table voiceinfo add MasterBufId INT");
            }
            if (!z28) {
                k0Var.A("voiceinfo", "Alter table voiceinfo add checksum INT DEFAULT 0");
            }
            if (!z29) {
                k0Var.A("voiceinfo", "Alter table voiceinfo add VoiceFlag INT DEFAULT 0");
            }
            if (!z37) {
                k0Var.A("voiceinfo", "Alter table voiceinfo add VoiceInfoExt BLOB");
            }
            if (!z38) {
                k0Var.A("voiceinfo", "Alter table voiceinfo add MsgTalker TEXT");
            }
            qt0.b.f448024a.b(new qt0.e(k0Var, f523905i, "voiceinfo", "voiceinfo", 1));
        }
        this.f523906d = k0Var;
    }

    public static java.lang.String n0(java.lang.String str, java.lang.String str2) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return c01.y1.a(str, java.lang.System.currentTimeMillis());
    }

    public static java.lang.String s0(long j17) {
        return j17 + "_m";
    }

    public w21.w0 D0(long j17) {
        w21.w0 w0Var = null;
        android.database.Cursor f17 = this.f523906d.f("SELECT FileName, User, MsgId, NetOffset, FileNowSize, TotalLen, Status, CreateTime, LastModifyTime, ClientId, VoiceLength, MsgLocalId, Human, reserved1, reserved2, MsgSource, MsgFlag, MsgSeq, MasterBufId, checksum, VoiceFlag, VoiceInfoExt, MsgTalker FROM voiceinfo WHERE MsgId=" + j17, null, 2);
        if (f17.moveToFirst()) {
            w0Var = new w21.w0();
            w0Var.a(f17);
        }
        f17.close();
        return w0Var;
    }

    public w21.w0 J0(java.lang.String str, long j17) {
        boolean a17 = pt0.p.f439751a1.a("voiceinfo");
        l75.k0 k0Var = this.f523906d;
        w21.w0 w0Var = null;
        if (a17) {
            android.database.Cursor f17 = k0Var.f(("SELECT FileName, User, MsgId, NetOffset, FileNowSize, TotalLen, Status, CreateTime, LastModifyTime, ClientId, VoiceLength, MsgLocalId, Human, reserved1, reserved2, MsgSource, MsgFlag, MsgSeq, MasterBufId, checksum, VoiceFlag, VoiceInfoExt, MsgTalker FROM voiceinfo WHERE MsgLocalId=" + j17) + " AND MsgTalker= ?", new java.lang.String[]{str}, 2);
            if (f17.moveToFirst()) {
                w0Var = new w21.w0();
                w0Var.a(f17);
            }
            f17.close();
        } else {
            android.database.Cursor f18 = k0Var.f("SELECT FileName, User, MsgId, NetOffset, FileNowSize, TotalLen, Status, CreateTime, LastModifyTime, ClientId, VoiceLength, MsgLocalId, Human, reserved1, reserved2, MsgSource, MsgFlag, MsgSeq, MasterBufId, checksum, VoiceFlag, VoiceInfoExt, MsgTalker FROM voiceinfo WHERE MsgLocalId=" + j17, null, 2);
            if (f18.moveToFirst()) {
                w0Var = new w21.w0();
                w0Var.a(f18);
            }
            f18.close();
        }
        return w0Var;
    }

    public boolean L0(w21.w0 w0Var) {
        iz5.a.g(null, w0Var != null);
        if (android.text.TextUtils.isEmpty(w0Var.f524040x)) {
            w0Var.f524040x = "";
            w0Var.f524017a |= 4194304;
        }
        pt0.p.G6(w0Var.f524029m, w0Var.f524040x);
        android.content.ContentValues b17 = w0Var.b();
        if (b17.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceStorage", "insert falied, no values set");
        } else if (this.f523906d.l("voiceinfo", "FileName", b17) != -1) {
            m145262xf35bbb4();
            return true;
        }
        return false;
    }

    public boolean P0(java.lang.String str, w21.w0 w0Var) {
        iz5.a.g(null, str.length() > 0);
        iz5.a.g(null, w0Var != null);
        if (android.text.TextUtils.isEmpty(w0Var.f524040x)) {
            w0Var.f524040x = "";
            w0Var.f524017a |= 4194304;
        } else {
            pt0.p.G6(w0Var.f524029m, w0Var.f524040x);
        }
        android.content.ContentValues b17 = w0Var.b();
        if (b17.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceStorage", "update failed, no values set");
        } else {
            if (this.f523906d.p("voiceinfo", b17, "FileName= ?", new java.lang.String[]{str}) > 0) {
                m145262xf35bbb4();
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceStorage", "update failed, fileName:%s", str);
        }
        return false;
    }

    public boolean d(java.lang.String str) {
        iz5.a.g(null, str.length() > 0);
        if (this.f523906d.mo70514xb06685ab("voiceinfo", "FileName= ?", new java.lang.String[]{str}) <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VoiceStorage", "delete failed, no such file:".concat(str));
        }
        return true;
    }

    public void m0(bm5.y yVar, java.lang.String str) {
        java.lang.String vj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).vj(yVar, str, false);
        int b17 = w21.v0.b(vj6, true);
        java.util.Map map = this.f523907e;
        if (b17 == 0) {
            w21.a aVar = (w21.a) ((java.util.HashMap) map).get(vj6);
            if (aVar != null) {
                aVar.b();
                ((java.util.HashMap) map).remove(vj6);
                return;
            }
            return;
        }
        if (b17 == 1) {
            java.util.Map map2 = this.f523908f;
            w21.l0 l0Var = (w21.l0) ((java.util.HashMap) map2).get(vj6);
            if (l0Var != null) {
                l0Var.b();
                ((java.util.HashMap) map2).remove(vj6);
                return;
            }
            return;
        }
        if (b17 != 2) {
            w21.a aVar2 = (w21.a) ((java.util.HashMap) map).get(vj6);
            if (aVar2 != null) {
                aVar2.b();
                ((java.util.HashMap) map).remove(vj6);
                return;
            }
            return;
        }
        java.util.Map map3 = this.f523909g;
        w21.x xVar = (w21.x) ((java.util.HashMap) map3).get(vj6);
        if (xVar != null) {
            xVar.b();
            ((java.util.HashMap) map3).remove(vj6);
        }
    }

    public final w21.j u0(bm5.y yVar, java.lang.String str) {
        java.lang.String vj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).vj(yVar, str, false);
        int b17 = w21.v0.b(vj6, true);
        java.util.Map map = this.f523907e;
        if (b17 == 0) {
            if (((java.util.HashMap) map).get(vj6) == null) {
                ((java.util.HashMap) map).put(vj6, new w21.a(vj6));
            }
            return (w21.j) ((java.util.HashMap) map).get(vj6);
        }
        if (b17 == 1) {
            java.util.Map map2 = this.f523908f;
            if (((java.util.HashMap) map2).get(vj6) == null) {
                ((java.util.HashMap) map2).put(vj6, new w21.l0(vj6));
            }
            return (w21.j) ((java.util.HashMap) map2).get(vj6);
        }
        if (b17 != 2) {
            if (((java.util.HashMap) map).get(vj6) == null) {
                ((java.util.HashMap) map).put(vj6, new w21.a(vj6));
            }
            return (w21.j) ((java.util.HashMap) map).get(vj6);
        }
        java.util.Map map3 = this.f523909g;
        if (((java.util.HashMap) map3).get(vj6) == null) {
            ((java.util.HashMap) map3).put(vj6, new w21.x(vj6));
        }
        return (w21.j) ((java.util.HashMap) map3).get(vj6);
    }

    public w21.w0 y0(java.lang.String str) {
        w21.w0 w0Var;
        android.database.Cursor f17 = this.f523906d.f("SELECT FileName, User, MsgId, NetOffset, FileNowSize, TotalLen, Status, CreateTime, LastModifyTime, ClientId, VoiceLength, MsgLocalId, Human, reserved1, reserved2, MsgSource, MsgFlag, MsgSeq, MasterBufId, checksum, VoiceFlag, VoiceInfoExt, MsgTalker FROM voiceinfo WHERE FileName= ?", new java.lang.String[]{str}, 2);
        if (f17.moveToFirst()) {
            w0Var = new w21.w0();
            w0Var.a(f17);
        } else {
            w0Var = null;
        }
        f17.close();
        return w0Var;
    }

    public w21.w0 z0(java.lang.String str) {
        w21.w0 w0Var = null;
        if (str == null) {
            return null;
        }
        android.database.Cursor f17 = this.f523906d.f("SELECT FileName, User, MsgId, NetOffset, FileNowSize, TotalLen, Status, CreateTime, LastModifyTime, ClientId, VoiceLength, MsgLocalId, Human, reserved1, reserved2, MsgSource, MsgFlag, MsgSeq, MasterBufId, checksum, VoiceFlag, VoiceInfoExt, MsgTalker FROM voiceinfo WHERE FileName= ?", new java.lang.String[]{str}, 2);
        f17.getCount();
        if (f17.moveToFirst()) {
            w0Var = new w21.w0();
            w0Var.a(f17);
        }
        f17.close();
        return w0Var;
    }
}

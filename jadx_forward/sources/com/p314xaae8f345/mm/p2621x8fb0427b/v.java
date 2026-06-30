package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public class v extends com.p314xaae8f345.mm.p2621x8fb0427b.f {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f277801c = {"CREATE TABLE IF NOT EXISTS bizchatmessage ( msgId INTEGER PRIMARY KEY, msgSvrId INTEGER , type INT, status INT, isSend INT, isShowTimer INTEGER, createTime INTEGER, talker TEXT, content TEXT, imgPath TEXT, reserved TEXT, lvbuffer BLOB, transContent TEXT, transBrandWording TEXT, bizChatId INTEGER DEFAULT -1, bizChatUserId TEXT, talkerId INTEGER, bizClientMsgId TEXT ) ", "CREATE INDEX IF NOT EXISTS  bizmessageChatIdIndex ON bizchatmessage ( bizChatId )", "CREATE INDEX IF NOT EXISTS  bizmessageSvrIdIndex ON bizchatmessage ( msgSvrId )", "CREATE INDEX IF NOT EXISTS  bizmessageTalkerIndex ON bizchatmessage ( talker )", "CREATE INDEX IF NOT EXISTS  bizmessageTalerStatusIndex ON bizchatmessage ( talker,status )", "CREATE INDEX IF NOT EXISTS  bizmessageCreateTimeIndex ON bizchatmessage ( createTime )", "CREATE INDEX IF NOT EXISTS  bizmessageCreateTaklerTimeIndex ON bizchatmessage ( talker,createTime )", "CREATE INDEX IF NOT EXISTS  bizmessageBizChatIdTypeCreateTimeIndex ON bizchatmessage ( bizChatId,type,createTime )", "CREATE INDEX IF NOT EXISTS  bizmessageSendCreateTimeIndex ON bizchatmessage ( status,isSend,createTime )", "CREATE INDEX IF NOT EXISTS  bizchatmessageTalkerTypeIndex ON bizchatmessage ( talker,type )", "CREATE INDEX IF NOT EXISTS  bizchatmessageTalkerClientMsgIdIndex ON bizchatmessage ( talker,bizClientMsgId )"};

    public v(xg3.m0 m0Var) {
        super(m0Var);
        g(d(), "bizchatmessage");
        a(new xg3.k0(16, "bizchatmessage", xg3.k0.a(2500001L, 3000000L, 99000001L, 102000000L, -1L, -1L)));
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.f
    public boolean b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, c01.ea eaVar) {
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizChatMessageStorage", "dealMsgSourceValue:message == null");
            return false;
        }
        f9Var.Y0(-1L);
        if (eaVar != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(eaVar.f118687m)) {
            s01.h hVar = new s01.h();
            hVar.f69169xf75e5c37 = eaVar.f118687m;
            hVar.f69170x75756b18 = f9Var.Q0();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(eaVar.f118688n)) {
                hVar.f69174xf62a869b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(eaVar.f118688n, -1);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(eaVar.f118686l)) {
                hVar.f69173x73703457 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(eaVar.f118686l, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(eaVar.f118685k, -1));
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(eaVar.f118685k)) {
                hVar.f69173x73703457 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(eaVar.f118685k, -1);
            }
            s01.h m17 = s01.r.m(hVar);
            if (m17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizChatMessageStorage", "dealMsgSourceValue:bizChatInfo == null!");
                return false;
            }
            f9Var.Y0(m17.f69168x92559640);
            java.lang.String str = eaVar.f118689o;
            if (str == null) {
                str = "";
            }
            f9Var.Z0(str);
            if (eaVar.f118691q.equals("1")) {
                f9Var.j1(1);
            }
            f9Var.a1(eaVar.f118679e);
            if (f9Var.A0() != 1 && eaVar.f118689o != null) {
                if (eaVar.f118689o.equals(r01.q3.Vi().z0(f9Var.Q0()))) {
                    f9Var.j1(1);
                }
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(eaVar.f118689o)) {
                s01.a0 a0Var = new s01.a0();
                a0Var.f65840x13fe5d2b = eaVar.f118689o;
                a0Var.f65841xdde069b = eaVar.f118690p;
                a0Var.f65836x75756b18 = f9Var.Q0();
                s01.d0 Vi = r01.q3.Vi();
                Vi.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatUserInfoStorage", "updateUserName");
                s01.a0 y07 = Vi.y0(a0Var.f65840x13fe5d2b);
                if (y07 == null) {
                    Vi.mo880xb970c2b9(a0Var);
                } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a0Var.f65841xdde069b) && !a0Var.f65841xdde069b.equals(y07.f65841xdde069b)) {
                    y07.f65841xdde069b = a0Var.f65841xdde069b;
                    Vi.J0(y07);
                }
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.f
    public void c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        c01.ea w17;
        if (f9Var == null) {
            return;
        }
        java.lang.String Q0 = f9Var.Q0();
        if (android.text.TextUtils.isEmpty(Q0)) {
            return;
        }
        java.lang.String str = f9Var.G;
        if (!android.text.TextUtils.isEmpty(str) && r01.z.g(Q0) && (w17 = c01.w9.w(str)) != null && android.text.TextUtils.equals(w17.f118691q, "1")) {
            f9Var.j1(1);
        }
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.f
    public java.lang.String f(java.lang.String str) {
        iz5.a.g(null, str != null && str.length() > 0);
        if (r01.z.g(str)) {
            return "bizchatmessage";
        }
        return null;
    }

    public int h(java.lang.String str, long j17) {
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizChatMessageStorage", "getBizMsgCountFromMsgTable talker:%s,bizChatId:%s", str, java.lang.Long.valueOf(j17));
            return -1;
        }
        int i17 = r01.q3.aj().J0(j17).f69075xcfb74bb3;
        if (i17 != 0) {
            return i17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatMessageStorage", "geBiztMsgCount contactMsgCount is 0 ,go normal %s", str);
        return m(str, j17);
    }

    public final java.lang.String i(java.lang.String str) {
        long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(str);
        if (m07 <= 0) {
            return "";
        }
        return " createTime > " + m07 + " AND ";
    }

    public android.database.Cursor j(java.lang.String str, long j17) {
        java.lang.System.currentTimeMillis();
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizChatMessageStorage", "getImgMessage fail, argument is invalid");
            return null;
        }
        java.lang.String e17 = e(str);
        this.f275428a.getClass();
        android.database.Cursor B = d().B("select * from " + e17 + "  INDEXED BY bizmessageBizChatIdTypeCreateTimeIndex  where" + l(str, j17) + "AND type IN (3,39,13,43,62,44,49,268435505)  order by createTime", null);
        java.lang.System.currentTimeMillis();
        return B;
    }

    public int k(java.lang.String str, long j17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT COUNT(*) FROM ");
        xg3.m0 m0Var = this.f275428a;
        sb6.append(((com.p314xaae8f345.mm.p2621x8fb0427b.g9) m0Var).X8(str));
        sb6.append(" WHERE ");
        sb6.append(i(str));
        sb6.append(l(str, j17));
        sb6.append("AND type IN (3,39,13,43,62,44,268435505,486539313)");
        m0Var.getClass();
        android.database.Cursor B = d().B(sb6.toString(), null);
        int i17 = B.moveToLast() ? B.getInt(0) : 0;
        B.close();
        return i17;
    }

    public java.lang.String l(java.lang.String str, long j17) {
        return " bizChatId= " + j17 + " AND talker= '" + str + "'";
    }

    public int m(java.lang.String str, long j17) {
        android.database.Cursor B = d().B("SELECT COUNT(*) FROM " + e(str) + " WHERE " + l(str, j17), null);
        int i17 = B.moveToLast() ? B.getInt(0) : 0;
        B.close();
        return i17;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 n(java.lang.String str, long j17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        android.database.Cursor B = d().B("select * from " + e(str) + " where" + l(str, j17) + "order by createTime DESC limit 1", null);
        if (B.getCount() != 0) {
            B.moveToFirst();
            f9Var.mo9015xbf5d97fd(B);
        }
        B.close();
        return f9Var;
    }
}

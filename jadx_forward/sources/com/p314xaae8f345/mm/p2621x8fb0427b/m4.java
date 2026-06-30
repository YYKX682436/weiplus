package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public class m4 extends l75.a1 implements com.p314xaae8f345.mm.p2621x8fb0427b.l8 {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f276649i;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f276650d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.g8 f276651e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.p4 f276652f = new com.p314xaae8f345.mm.p2621x8fb0427b.p4(null);

    /* renamed from: g, reason: collision with root package name */
    public final l75.v0 f276653g;

    /* renamed from: h, reason: collision with root package name */
    public final l75.v0 f276654h;

    static {
        l75.e0 e0Var = pp.a.f438897e2;
        f276649i = new java.lang.String[]{l75.n0.m145250x3fdc6f77(e0Var, "rconversation"), l75.n0.m145250x3fdc6f77(e0Var, "rbottleconversation"), "CREATE TABLE IF NOT EXISTS conversation ( unReadCount INTEGER, status INT, isSend INT, createTime LONG, username VARCHAR(40), content TEXT, reserved TEXT );", "CREATE TABLE IF NOT EXISTS bottleconversation ( unReadCount INTEGER, status INT, isSend INT, createTime LONG, username VARCHAR(40), content TEXT, reserved TEXT );", "CREATE INDEX IF NOT EXISTS rconversation_unreadcount_index ON rconversation ( unReadCount )", "DROP INDEX IF EXISTS multi_index ", "DROP INDEX IF EXISTS rconversation_multi_index", "CREATE INDEX IF NOT EXISTS rconversation_parentref_index ON  rconversation ( parentRef )", "CREATE INDEX IF NOT EXISTS rbottleconversation_unreadcount_index ON  rbottleconversation ( unReadCount )", "CREATE INDEX IF NOT EXISTS rconversation_flag_parentref_index ON  rconversation ( flag,parentRef )"};
    }

    public m4(l75.k0 k0Var) {
        boolean z17;
        com.p314xaae8f345.mm.p2621x8fb0427b.n4 n4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.n4(this);
        this.f276653g = n4Var;
        n4Var.a(new com.p314xaae8f345.mm.p2621x8fb0427b.C21307x618311a(), null);
        com.p314xaae8f345.mm.p2621x8fb0427b.o4 o4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.o4(this);
        this.f276654h = o4Var;
        o4Var.a(new com.p314xaae8f345.mm.p2621x8fb0427b.C21308x618311b(), null);
        android.database.Cursor f17 = k0Var.f("PRAGMA table_info( rconversation)", null, 2);
        int columnIndex = f17.getColumnIndex(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
        while (true) {
            if (!f17.moveToNext()) {
                z17 = false;
                break;
            } else if (columnIndex >= 0 && "flag".equalsIgnoreCase(f17.getString(columnIndex))) {
                z17 = true;
                break;
            }
        }
        f17.close();
        l75.e0 e0Var = pp.a.f438897e2;
        java.util.List<java.lang.String> m145251xdc9c58c4 = l75.n0.m145251xdc9c58c4(e0Var, "rconversation", k0Var);
        m145251xdc9c58c4.addAll(l75.n0.m145251xdc9c58c4(e0Var, "rbottleconversation", k0Var));
        java.util.Iterator<java.lang.String> it = m145251xdc9c58c4.iterator();
        while (it.hasNext()) {
            k0Var.A("rconversation", it.next());
        }
        if (!z17) {
            k0Var.A("rconversation", "update rconversation set flag = conversationTime");
        }
        this.f276650d = k0Var;
    }

    public static java.lang.String D(java.lang.String... strArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.String str : strArr) {
            if (sb6.length() > 0) {
                sb6.append(" or ");
            }
            sb6.append("parentRef");
            sb6.append(" = '");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
            sb6.append(str);
            sb6.append("'");
        }
        return sb6.toString();
    }

    public static java.lang.String g(java.lang.String str, java.util.List list) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        if (list != null && list.size() > 0) {
            sb6.append(str);
            sb6.append(" not in (");
            int i17 = 0;
            while (i17 < list.size()) {
                sb6.append("\"");
                java.lang.String str2 = (java.lang.String) list.get(i17);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str2);
                sb6.append(str2);
                sb6.append("\"");
                sb6.append(i17 == list.size() + (-1) ? "" : ",");
                i17++;
            }
            sb6.append(") ");
        }
        return sb6.toString();
    }

    public android.database.Cursor A(int i17, java.util.List list, java.lang.String str, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select unReadCount, status, isSend, conversationTime, username, content, msgType, flag, digest, digestUser, attrflag, editingMsg, atCount, unReadMuteCount, UnReadInvite, hasTodo, hbMarkRed, remitMarkRed, hasSpecialFollow from rconversation where ");
        l75.e0 e0Var = pp.a.f438897e2;
        if (str == null) {
            sb6.append(O());
        } else if ("*".equals(str)) {
            sb6.append(" 1 = 1 ");
        } else {
            sb6.append("parentRef = '");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
            sb6.append(str);
            sb6.append("' ");
        }
        java.lang.String a17 = c01.e2.a(false, i17);
        if (a17 == null) {
            a17 = "";
        }
        sb6.append(a17);
        if (list != null && list.size() > 0) {
            java.util.Iterator it = new java.util.ArrayList(list).iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                sb6.append(" and rconversation.username != '");
                sb6.append(str2);
                sb6.append("'");
            }
        }
        sb6.append(" order by flag desc");
        return this.f276650d.f(sb6.toString(), null, z17 ? 4 : 0);
    }

    public android.database.Cursor B(int i17, java.util.List list, java.lang.String str, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(1024);
        sb6.append("select unReadCount, status, isSend, conversationTime, username, content, msgType, flag, digest, digestUser, attrflag, editingMsg, atCount, unReadMuteCount, UnReadInvite, hasTodo, hbMarkRed, remitMarkRed, parentRef");
        sb6.append(" from rconversation where ");
        l75.e0 e0Var = pp.a.f438897e2;
        if (str == null) {
            sb6.append(O());
        } else if ("*".equals(str)) {
            sb6.append(" 1 = 1 ");
        } else {
            sb6.append("parentRef");
            sb6.append(" = '");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
            sb6.append(str);
            sb6.append("' ");
        }
        java.lang.String a17 = c01.e2.a(false, i17);
        if (a17 == null) {
            a17 = "";
        }
        sb6.append(a17);
        if (list != null && list.size() > 0) {
            java.util.Iterator it = new java.util.ArrayList(list).iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                sb6.append(" and rconversation.username != '");
                sb6.append(str2);
                sb6.append("'");
            }
        }
        sb6.append(" order by flag desc");
        return this.f276650d.f(sb6.toString(), null, z17 ? 4 : 0);
    }

    public android.database.Cursor C(int i17, java.util.List list, java.lang.String str, boolean z17, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String str4 = (str2 == null || str2.length() <= 0) ? " " : " and rconversation.username = rcontact.username ";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select unReadCount, status, isSend, conversationTime, rconversation.username, content, rconversation.msgType, rconversation.flag, rconversation.digest, rconversation.digestUser, rconversation.hasTrunc, rcontact.nickname from rconversation,rcontact  where rconversation.username = rcontact.username");
        sb6.append(str4);
        java.lang.String a17 = c01.e2.a(false, i17);
        if (a17 == null) {
            a17 = "";
        }
        sb6.append(a17);
        java.lang.String str5 = sb6.toString() + g(" and rconversation.username", list);
        if (z17) {
            str5 = str5 + " and ( verifyFlag & 8 ) = 0";
        }
        l75.e0 e0Var = pp.a.f438897e2;
        if (str == null) {
            str5 = str5 + " and ( parentRef is null or parentRef = '' or " + D("message_fold") + " ) ";
        }
        if (str2 != null && str2.length() > 0) {
            str5 = str5 + z(str2);
        }
        if (str2 == null || str2.equals("")) {
            str3 = str5 + " order by flag desc, conversationTime desc";
        } else {
            str3 = str5 + " order by rconversation.username like \"%@chatroom\" asc";
        }
        return this.f276650d.B(str3, null);
    }

    public final java.lang.String E(java.lang.String str) {
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(str) ? "rbottleconversation" : "rconversation";
    }

    public int F(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        android.database.Cursor f17 = this.f276650d.f("select sum(unReadCount) from rconversation,rcontact where rconversation.username = rcontact.username".concat(str), null, 2);
        int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        return i17;
    }

    public long G(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var) {
        java.lang.String h17 = l4Var.h1();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (h17 == null) {
            h17 = "";
        }
        if (h17.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConversationStorage", "insert conversation failed, username empty");
            return -1L;
        }
        l4Var.z1(v(l4Var));
        h(l4Var, true);
        long l17 = this.f276650d.l(E(h17), null, l4Var.mo9763xeb27878e());
        if (l17 != -1) {
            b(2, this, l4Var.h1());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConversationStorage", "insert failed return -1, table:%s", E(h17));
        }
        return l17;
    }

    public boolean H(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var) {
        if (J(l4Var)) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("message_fold_config2").o("fold_button_status_int_sync", 65536) != 65536;
        }
        return false;
    }

    public boolean I(java.lang.String str) {
        if (K(str)) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("message_fold_config2").o("fold_button_status_int_sync", 65536) != 65536;
        }
        return false;
    }

    public boolean J(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var) {
        if (l4Var != null) {
            return xg3.b.b(l4Var, 4, 0L) != 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConversationStorage", "isPlacedTop failed, conversation null");
        return false;
    }

    public boolean K(java.lang.String str) {
        if (str != null && str.length() > 0) {
            return J(p(str));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConversationStorage", "isPlacedTop failed");
        return false;
    }

    public java.lang.String L(int i17, java.lang.String str) {
        java.util.Map d17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || i17 != 49 || (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "msg", null)) == null) {
            return null;
        }
        return (java.lang.String) d17.get(".msg.appmsg.title");
    }

    public void M(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Update rconversation set parentRef = '', unReadCount = 0");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(" where username = \"");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        sb7.append(str);
        sb7.append("\"");
        sb6.append(sb7.toString());
        if (this.f276650d.A("rconversation", sb6.toString())) {
            b(3, this, str);
        }
    }

    public void N() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("msgCount", (java.lang.Integer) 0);
        this.f276650d.p("rconversation", contentValues, null, null);
    }

    public final java.lang.String O() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("message_fold_config2").o("fold_button_status_int_sync", 65536);
        if (o17 == 262144 || o17 == 65536) {
            sb6.append("((parentRef is null) or (parentRef in ('', 'message_fold')))");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n("message_fold");
        } else {
            sb6.append("((parentRef is null) or (parentRef=''))");
        }
        return sb6.toString();
    }

    public void P(java.lang.String[] strArr, java.lang.String str) {
        Q(strArr, str, true, false);
    }

    public void Q(java.lang.String[] strArr, java.lang.String str, boolean z17, boolean z18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Update rconversation set parentRef = '");
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(str == null ? "" : str);
        sb6.append("' where 1 != 1 ");
        for (java.lang.String str2 : strArr) {
            sb6.append(" or username = '");
            sb6.append(str2);
            sb6.append("'");
        }
        if (this.f276650d.A("rconversation", sb6.toString())) {
            if (z17) {
                for (java.lang.String str3 : strArr) {
                    b(3, this, str3);
                }
            }
            if (z18) {
                b(3, this, str);
            }
        }
    }

    public boolean R(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var) {
        if (l4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConversationStorage", "setMoveUp conv == null");
            return false;
        }
        java.lang.System.currentTimeMillis();
        l75.k0 k0Var = this.f276650d;
        android.database.Cursor f17 = k0Var.f("select max(conversationTime) as conversationTime from rconversation", null, 2);
        long j17 = 0;
        while (f17.moveToNext()) {
            j17 = f17.getLong(0);
        }
        f17.close();
        java.lang.System.currentTimeMillis();
        long a17 = c01.id.a();
        if (j17 > a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ConversationStorage", "conversationTime=%s serverTime=%s diff=%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(a17), java.lang.Long.valueOf(a17 - j17));
            j17 = a17;
        }
        long b17 = xg3.b.b(l4Var, 1, j17 + 1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update ");
        sb6.append(E(l4Var.h1()));
        sb6.append(" set flag = ");
        sb6.append(b17);
        sb6.append(" where username = \"");
        java.lang.String h17 = l4Var.h1();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(h17);
        sb6.append(h17);
        sb6.append("\"");
        boolean A = k0Var.A("rconversation", sb6.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationStorage", "[setMoveUp] flag=%s result=%s", java.lang.Long.valueOf(b17), java.lang.Boolean.valueOf(A));
        if (A) {
            b(3, this, l4Var.h1());
        }
        return A;
    }

    public boolean S(java.lang.String str) {
        boolean z17 = false;
        if (str == null || str.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConversationStorage", "setPlacedTop conversation failed");
            return false;
        }
        if (p(str) == null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4(str);
            l4Var.n1(java.lang.System.currentTimeMillis());
            G(l4Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationStorage", "setPlacedTop username = ".concat(str));
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = p(str);
        i(p17, true);
        if (p17 != null) {
            long b17 = xg3.b.b(p17, 2, 0L);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("update " + E(p17.h1()) + " set flag = " + b17);
            if ("message_fold".equals(p17.W0())) {
                sb6.append(" , parentRef = '");
                java.lang.String W0 = p17.W0();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(W0);
                sb6.append(W0);
                sb6.append("' ");
            }
            sb6.append(" where username = \"");
            java.lang.String h17 = p17.h1();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(h17);
            sb6.append(h17);
            sb6.append("\"");
            z17 = this.f276650d.A("rconversation", sb6.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationStorage", "[setPlacedTop] flag=%s result=%s", java.lang.Long.valueOf(b17), java.lang.Boolean.valueOf(z17));
            if (z17) {
                b(3, this, p17.h1());
            }
        }
        return z17;
    }

    public boolean T(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConversationStorage", "update conversation failed");
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = p(str);
        if (p17 == null || (p17.d1() > 0 && str.equals(p17.h1()))) {
            return true;
        }
        p17.j1(p17.u0() | 1048576);
        i(p17, false);
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("unReadCount", (java.lang.Integer) 1);
        contentValues.put("atCount", (java.lang.Integer) 0);
        contentValues.put("attrflag", java.lang.Integer.valueOf(p17.u0()));
        contentValues.put("parentRef", p17.W0());
        java.lang.String E = E(str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        int p18 = this.f276650d.p(E, contentValues, "username= ?", new java.lang.String[]{str});
        if (p18 > 0) {
            b(3, this, str);
        }
        return p18 > 0;
    }

    public boolean U(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var) {
        if (l4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConversationStorage", "unSetPlacedTop conversation null");
            return false;
        }
        long b17 = xg3.b.b(l4Var, 3, l4Var.w0());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("update " + E(l4Var.h1()) + " set flag = " + b17);
        if ("message_fold".equals(l4Var.W0())) {
            sb6.append(" , parentRef = '' ");
        }
        sb6.append(" where username = \"");
        java.lang.String h17 = l4Var.h1();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(h17);
        sb6.append(h17);
        sb6.append("\"");
        boolean A = this.f276650d.A("rconversation", sb6.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationStorage", "[setPlacedTop] flag=%s result=%s", java.lang.Long.valueOf(b17), java.lang.Boolean.valueOf(A));
        if (A) {
            b(3, this, l4Var.h1());
        }
        return A;
    }

    public boolean V(java.lang.String str) {
        if (str != null && str.length() > 0) {
            return U(p(str));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConversationStorage", "unSetPlacedTop conversation failed");
        return false;
    }

    public int W(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, java.lang.String str) {
        return Y(l4Var, str, true, true);
    }

    public int X(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, java.lang.String str, boolean z17) {
        return Y(l4Var, str, z17, true);
    }

    public int Y(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, java.lang.String str, boolean z17, boolean z18) {
        if (str == null || str.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConversationStorage", "update conversation failed");
            return 0;
        }
        if (z17) {
            l4Var.z1(v(l4Var));
        }
        h(l4Var, z18);
        i(l4Var, false);
        android.content.ContentValues mo9763xeb27878e = l4Var.mo9763xeb27878e();
        if (l4Var.f276619h2) {
            mo9763xeb27878e.remove("content");
            mo9763xeb27878e.remove("digest");
        }
        int p17 = this.f276650d.p(E(str), mo9763xeb27878e, "username=?", new java.lang.String[]{str});
        if (p17 != 0) {
            b(3, this, str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConversationStorage", "update failed return 0,  table:%s", E(str));
        }
        return p17;
    }

    public boolean Z(java.lang.String str, int i17, boolean z17, int i18) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        if (p(str) == null) {
            return true;
        }
        int i19 = z17 ? i18 | i17 : (~i17) & i18;
        if (i19 == i18) {
            return false;
        }
        if (i18 >= 0 && i18 < 536870912 && ((i19 >= 536870912 || i19 < 0) && str.contains("@"))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Conversition", "wrong add attr flag: %s, %s, %s, %s, %s", str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            jx3.f.INSTANCE.d(20435, 3, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), str);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update ");
        sb6.append(E(str));
        sb6.append(" set attrflag = ");
        sb6.append(i19);
        sb6.append(" where username = \"");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        sb6.append(str);
        sb6.append("\"");
        boolean A = this.f276650d.A("rconversation", sb6.toString());
        if (A) {
            b(3, this, str);
        }
        return A;
    }

    public void a0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        boolean z17;
        java.lang.String Q0 = f9Var.Q0();
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = p(Q0);
        if (p17 != null && p17.w0() > f9Var.mo78012x3fdd41df() && p17.w0() != com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationStorage", "updateConvFromLastMsg ignore(maybe the system time is bigger than normal)");
            return;
        }
        if (p17 == null) {
            p17 = new com.p314xaae8f345.mm.p2621x8fb0427b.l4(Q0);
            z17 = true;
        } else {
            z17 = false;
        }
        p17.M1(f9Var.A0());
        p17.Y1(p17.d1());
        p17.h2(f9Var);
        p17.S1(java.lang.Integer.toString(f9Var.mo78013xfb85f7b0()));
        p17.z1((p17.G0() & 4611686018427387904L) | (f9Var.mo78012x3fdd41df() & 72057594037927935L));
        if (z17) {
            G(p17);
        } else {
            W(p17, Q0);
        }
    }

    public boolean b0(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17;
        if (str == null || str.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConversationStorage", "update conversation failed");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationStorage", "updateUnreadByTalker %s", str);
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p18 = p(str);
        if (p18 != null) {
            i(p18, false);
            g95.u.b(str);
            int d17 = p18.d1();
            l75.k0 k0Var = this.f276650d;
            if (d17 == 0 && p18.f1() == 0 && str.equals(p18.h1())) {
                Z(str, 1048576, false, p18.u0());
                android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put("UnReadInvite", (java.lang.Integer) 0);
                contentValues.put("atCount", (java.lang.Integer) 0);
                contentValues.put("parentRef", p18.W0());
                java.lang.String E = E(str);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
                if (k0Var.p(E, contentValues, "username= ?", new java.lang.String[]{str}) > 0) {
                    b(3, this, str);
                }
            } else {
                android.content.ContentValues contentValues2 = new android.content.ContentValues();
                contentValues2.put("unReadCount", (java.lang.Integer) 0);
                contentValues2.put("unReadMuteCount", (java.lang.Integer) 0);
                contentValues2.put("UnReadInvite", (java.lang.Integer) 0);
                contentValues2.put("atCount", (java.lang.Integer) 0);
                contentValues2.put("attrflag", java.lang.Integer.valueOf(p18.u0() & (-1048577)));
                contentValues2.put("parentRef", p18.W0());
                java.lang.String E2 = E(str);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
                int p19 = k0Var.p(E2, contentValues2, "username= ?", new java.lang.String[]{str});
                if (p19 > 0) {
                    b(3, this, str);
                }
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(str) && com.p314xaae8f345.mm.p2621x8fb0427b.z3.o4(p18.W0()) && (p17 = p(p18.W0())) != null) {
                    java.lang.String h17 = p17.h1();
                    android.content.ContentValues contentValues3 = new android.content.ContentValues();
                    int d18 = p17.d1() - p18.d1();
                    contentValues3.put("unReadCount", java.lang.Integer.valueOf(d18 > 0 ? d18 : 0));
                    int f17 = p17.f1() - p18.f1();
                    contentValues3.put("unReadMuteCount", java.lang.Integer.valueOf(f17 > 0 ? f17 : 0));
                    if (d18 <= 0 && f17 <= 0) {
                        contentValues3.put("attrflag", java.lang.Integer.valueOf(p18.u0() & (-1048577)));
                    }
                    java.lang.String E3 = E(h17);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(h17);
                    int p27 = k0Var.p(E3, contentValues3, "username= ?", new java.lang.String[]{h17});
                    if (p27 > 0) {
                        b(3, this, h17);
                    }
                    p19 = p27;
                }
                if (p19 <= 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // l75.a1
    public boolean c() {
        return true;
    }

    @Override // l75.a1
    public void d(l75.y0 y0Var) {
        java.util.Iterator it = ((fs.c) fs.g.f(com.p314xaae8f345.mm.p2621x8fb0427b.i8.class)).all().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p2621x8fb0427b.i8) ((fs.q) it.next()).get()).g(y0Var.f398511a, y0Var.f398514d, y0Var.f398512b);
        }
    }

    @Override // l75.a1
    public boolean f() {
        l75.k0 k0Var = this.f276650d;
        if (k0Var != null && !k0Var.J()) {
            return true;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = k0Var == null ? "null" : java.lang.Boolean.valueOf(k0Var.J());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ConversationStorage", "shouldProcessEvent db is close :%s", objArr);
        return false;
    }

    public final void h(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, boolean z17) {
        if (l4Var == null) {
            return;
        }
        if (z17 && l4Var.d1() > 0 && (l4Var.u0() & 1048576) != 0) {
            l4Var.j1(l4Var.u0() & (-1048577));
        }
        if (!"message_fold".equals(l4Var.h1()) || J(l4Var)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConversationStorage", "insert or update message_fold error!, stack: %s", android.util.Log.getStackTraceString(new java.lang.Throwable()));
    }

    public final void i(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, boolean z17) {
        if (l4Var == null) {
            return;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.X3(l4Var.h1())) {
            l4Var.T1(null);
            return;
        }
        if (z17) {
            if (l4Var.W0() == null || l4Var.W0().isEmpty() || l4Var.W0().equals("message_fold")) {
                if (!J(l4Var) && l4Var.d1() == 0 && l4Var.f1() == 0 && !l4Var.d2(1048576) && !l4Var.d2(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965)) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("message_fold_config2").o("fold_button_status_int_sync", 65536) == 131072) {
                        l4Var.T1("message_fold");
                        return;
                    }
                }
                l4Var.T1(null);
                return;
            }
            return;
        }
        if (l4Var.W0() == null || l4Var.W0().isEmpty() || l4Var.W0().equals("message_fold")) {
            if (l4Var.d1() == 0 && l4Var.f1() == 0 && !l4Var.d2(1048576) && !l4Var.d2(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965) && J(l4Var)) {
                l4Var.T1("message_fold");
            } else if ("message_fold".equals(l4Var.W0())) {
                l4Var.T1(null);
            }
        }
    }

    public void j(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, int i17, int i18) {
        java.lang.String h17 = l4Var.h1();
        java.util.Map map = c01.w9.f119072b;
        if (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7.equals(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().X8(h17))) {
            java.lang.String h18 = l4Var.h1();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (h18 == null) {
                h18 = "";
            }
            if (h18.length() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConversationStorage", "countMsg conversation failed, username empty");
                return;
            }
            if (l4Var.T0() == 0) {
                l4Var.R1(c01.w9.v(l4Var.h1()));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationStorage", "getMsgCount from message table");
            } else if (i17 > 0) {
                l4Var.R1(l4Var.T0() - i17);
                if (l4Var.T0() < 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConversationStorage", "msg < 0 ,some path must be ignore!");
                    l4Var.R1(0);
                }
            } else if (i18 > 0) {
                l4Var.R1(l4Var.T0() + i18);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationStorage", "countMsg %d talker :%s deleteCount:%d insertCount:%d", java.lang.Integer.valueOf(l4Var.T0()), l4Var.h1(), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
    }

    public void k(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ConversationStorage", "delChatContact username:%s  stack:%s", str, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        if (this.f276650d.mo70514xb06685ab(E(str), "username=?", new java.lang.String[]{str}) != 0) {
            b(5, this, str);
        }
    }

    public boolean l() {
        l75.k0 k0Var = this.f276650d;
        boolean z17 = k0Var.A("rconversation", "delete from rconversation") || k0Var.A("rconversation", "delete from rbottleconversation");
        if (z17) {
            b(5, this, "");
        }
        return z17;
    }

    public void m(java.util.LinkedList linkedList) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ConversationStorage", "deleteConversations   stack:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        if (linkedList == null || linkedList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ConversationStorage", "deleteConversation:namelist is null");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("delete from rconversation where username='");
        sb6.append((java.lang.String) linkedList.poll());
        sb6.append('\'');
        while (!linkedList.isEmpty()) {
            java.lang.String str = (java.lang.String) linkedList.poll();
            sb6.append(" or username='");
            sb6.append(str);
            sb6.append('\'');
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationStorage", "deleteConversations:sql is %s", sb6.toString());
        this.f276650d.A("rconversation", sb6.toString());
    }

    public boolean n(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ConversationStorage", "deleteMessageEndByName nameTag:%s  stack:%s", str, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        boolean A = this.f276650d.A("rconversation", "delete from " + E(str) + " where username like '%" + str + "'");
        if (A) {
            b(5, this, str);
        }
        return A;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (((r0.w0() & 8388608) != 0) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 o(xg3.m0 r5, java.lang.String r6, int r7) {
        /*
            r4 = this;
            if (r7 != 0) goto La
            r0 = r5
            com.tencent.mm.storage.g9 r0 = (com.p314xaae8f345.mm.p2621x8fb0427b.g9) r0
            com.tencent.mm.storage.f9 r0 = r0.q5(r6)
            goto L11
        La:
            r0 = r5
            com.tencent.mm.storage.g9 r0 = (com.p314xaae8f345.mm.p2621x8fb0427b.g9) r0
            com.tencent.mm.storage.f9 r0 = r0.S6(r6, r7)
        L11:
            if (r0 == 0) goto L32
            boolean r1 = r0.c3()
            r2 = 1
            if (r1 != 0) goto L29
            int r1 = r0.w0()
            r3 = 8388608(0x800000, float:1.1754944E-38)
            r1 = r1 & r3
            r3 = 0
            if (r1 == 0) goto L26
            r1 = r2
            goto L27
        L26:
            r1 = r3
        L27:
            if (r1 == 0) goto L2a
        L29:
            r3 = r2
        L2a:
            if (r3 == 0) goto L32
            int r7 = r7 + r2
            com.tencent.mm.storage.f9 r5 = r4.o(r5, r6, r7)
            return r5
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2621x8fb0427b.m4.o(xg3.m0, java.lang.String, int):com.tencent.mm.storage.f9");
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.l4 p(java.lang.String str) {
        android.database.Cursor D = this.f276650d.D(E(str), null, "username=?", new java.lang.String[]{str}, null, null, null, 100);
        if (D.moveToFirst()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
            l4Var.mo9015xbf5d97fd(D);
            D.close();
            return l4Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ConversationStorage", "get null with username:" + str);
        D.close();
        return null;
    }

    public java.util.List q(java.util.List list) {
        if (list == null) {
            list = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str = ("select username from rconversation" + g(" where username", list)) + " order by flag desc, conversationTime desc";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationStorage", "getAllConvUserName sql %s", str);
        android.database.Cursor B = this.f276650d.B(str, null);
        int columnIndex = B.getColumnIndex(dm.i4.f66875xa013b0d5);
        while (B.moveToNext()) {
            arrayList.add(B.getString(columnIndex));
        }
        B.close();
        return arrayList;
    }

    public android.database.Cursor r(java.util.List list, int i17, int i18) {
        if (list == null) {
            list = new java.util.ArrayList();
        }
        java.lang.String str = "select username from rconversation";
        int i19 = 0;
        while (i19 < list.size()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append(i19 > 0 ? " and " : " where ");
            sb6.append("username != \"");
            java.lang.String str2 = (java.lang.String) list.get(i19);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str2);
            sb6.append(str2);
            sb6.append("\"");
            str = sb6.toString();
            i19++;
        }
        return this.f276650d.B(str + " order by flag desc, conversationTime desc limit " + i18 + " offset " + i17, null);
    }

    public android.database.Cursor s(int i17, java.util.List list, java.lang.String str, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select * from rconversation where ");
        l75.e0 e0Var = pp.a.f438897e2;
        if (str == null) {
            sb6.append(O());
        } else if ("*".equals(str)) {
            sb6.append(" 1 = 1 ");
        } else {
            sb6.append("parentRef = '");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
            sb6.append(str);
            sb6.append("' ");
        }
        java.lang.String a17 = c01.e2.a(false, i17);
        if (a17 == null) {
            a17 = "";
        }
        sb6.append(a17);
        if (list != null && list.size() > 0) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                sb6.append(" and rconversation.username != '");
                sb6.append(str2);
                sb6.append("'");
            }
        }
        sb6.append(" order by flag desc, conversationTime desc");
        if (i18 > 0) {
            sb6.append(" limit ");
            sb6.append(i18);
        }
        return this.f276650d.B(sb6.toString(), null);
    }

    public android.database.Cursor t(java.util.List list, int i17, java.util.List list2, java.lang.String str, boolean z17, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select unReadCount, status, isSend, conversationTime, rconversation.username, content, rconversation.msgType, rconversation.flag, rconversation.digest, rconversation.digestUser, rconversation.hasTrunc, rcontact.nickname from rconversation,rcontact  where rconversation.username = rcontact.username" + ((str2 == null || str2.length() <= 0) ? " " : " and rconversation.username = rcontact.username ") + "and (");
        for (int i18 = 0; i18 < list.size(); i18++) {
            if (i18 != list.size() - 1) {
                sb6.append("rconversation.username = '");
                sb6.append((java.lang.String) list.get(i18));
                sb6.append("' OR ");
            } else {
                sb6.append("rconversation.username = '");
                sb6.append((java.lang.String) list.get(i18));
                sb6.append("')");
            }
        }
        java.lang.String a17 = c01.e2.a(false, i17);
        if (a17 == null) {
            a17 = "";
        }
        sb6.append(a17);
        sb6.append(g(" and rconversation.username", list2));
        if (z17) {
            sb6.append(" and ( verifyFlag & 8 ) = 0");
        }
        l75.e0 e0Var = pp.a.f438897e2;
        if (str == null) {
            sb6.append(" and ( parentRef is null or parentRef = '' or " + D("message_fold", "conversationboxservice") + " ) ");
        }
        if (str2 != null && str2.length() > 0) {
            sb6.append(z(str2));
        }
        sb6.append("order by case rconversation.username ");
        for (int i19 = 0; i19 < list.size(); i19++) {
            sb6.append(" when '");
            sb6.append((java.lang.String) list.get(i19));
            sb6.append("' then ");
            sb6.append(i19);
        }
        sb6.append(" end");
        return this.f276650d.B(sb6.toString().toString(), null);
    }

    public int u(java.lang.String str) {
        java.lang.String str2 = "SELECT COUNT(*) FROM rconversation WHERE parentRef = '" + str + "'";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationStorage", "get enterprise conversation count, sql is %s", str2);
        android.database.Cursor f17 = this.f276650d.f(str2, null, 2);
        if (f17 != null) {
            r0 = f17.moveToFirst() ? f17.getInt(0) : 0;
            f17.close();
        }
        return r0;
    }

    public final long v(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var) {
        if (l4Var != null) {
            return xg3.b.c(l4Var.G0(), l4Var.w0());
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return java.lang.System.currentTimeMillis() & 72057594037927935L;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.g8 w() {
        if (this.f276651e == null) {
            ((bt.p0) ((com.p314xaae8f345.mm.p2621x8fb0427b.h8) i95.n0.c(com.p314xaae8f345.mm.p2621x8fb0427b.h8.class))).getClass();
            com.p314xaae8f345.mm.app.w7 w7Var = com.p314xaae8f345.mm.app.w7.f135429f;
            if (w7Var.f135437d == null) {
                w7Var.f135437d = new com.p314xaae8f345.mm.app.u7(w7Var);
            }
            this.f276651e = w7Var.f135437d;
        }
        return this.f276651e;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.l4 x(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = null;
        android.database.Cursor s17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().s(1, null, str, -1);
        if (s17 != null) {
            if (s17.getCount() > 0 && s17.moveToFirst()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
                l4Var2.mo9015xbf5d97fd(s17);
                l4Var = l4Var2;
            }
            s17.close();
        }
        return l4Var;
    }

    public java.lang.String y(java.lang.String str) {
        java.lang.String str2 = "SELECT rconversation.username FROM rconversation WHERE parentRef = '" + str + "' ORDER BY conversationTime DESC, conversationTime DESC  LIMIT 1 ";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationStorage", "get last enterprise conversation user, sql is %s", str2);
        android.database.Cursor f17 = this.f276650d.f(str2, null, 2);
        if (f17 != null) {
            if (f17.moveToFirst()) {
                java.lang.String string = f17.getString(0);
                f17.close();
                return string;
            }
            f17.close();
        }
        return null;
    }

    public final java.lang.String z(java.lang.String str) {
        return " and ( rconversation.username like '%" + str + "%' or content like '%" + str + "%' or rcontact.nickname like '%" + str + "%' or rcontact.alias like '%" + str + "%' or rcontact.pyInitial like '%" + str + "%' or rcontact.quanPin like '%" + str + "%' or rcontact.conRemark like '%" + str + "%'  ) ";
    }
}

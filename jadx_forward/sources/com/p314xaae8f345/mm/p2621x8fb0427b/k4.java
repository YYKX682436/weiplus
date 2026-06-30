package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public class k4 extends l75.a1 implements com.p314xaae8f345.mm.p2621x8fb0427b.e8 {

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String[] f276600j;

    /* renamed from: k, reason: collision with root package name */
    public static final java.lang.String[] f276601k;

    /* renamed from: l, reason: collision with root package name */
    public static final java.lang.String f276602l;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f276603m;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f276604d;

    /* renamed from: e, reason: collision with root package name */
    public int f276605e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Map f276606f = null;

    /* renamed from: g, reason: collision with root package name */
    public final kk.j f276607g = new jt0.j(200);

    /* renamed from: h, reason: collision with root package name */
    public final kk.j f276608h = new jt0.j(400);

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.j4 f276609i = new com.p314xaae8f345.mm.p2621x8fb0427b.j4(null);

    static {
        l75.e0 e0Var = com.p314xaae8f345.mm.p670x38b72420.s.G2;
        f276600j = new java.lang.String[]{l75.n0.m145250x3fdc6f77(e0Var, "rcontact"), l75.n0.m145250x3fdc6f77(e0Var, "bottlecontact"), l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p2621x8fb0427b.a4.f275280r, "ContactCmdBuf"), "CREATE TABLE IF NOT EXISTS contact ( contactID INTEGER PRIMARY KEY, sex INT, type INT, showHead INT, username VARCHAR(40), nickname VARCHAR(40), pyInitial VARCHAR(40), quanPin VARCHAR(60), reserved TEXT );", "CREATE TABLE IF NOT EXISTS contact_ext ( username VARCHAR(40), Uin INTEGER DEFAULT 0, Email VARCHAR(128), Mobile VARCHAR(40), ShowFlag INTEGER DEFAULT 0 , ConType INTEGER DEFAULT 0 , ConRemark TEXT, ConRemark_PYShort TEXT, ConRemark_PYFull TEXT, ConQQMBlog TEXT, ConSMBlog TEXT, DomainList TEXT, reserved1 INT DEFAULT 0 , reserved2 INT DEFAULT 0 , reserved3 INT DEFAULT 0 , reserved4 INT DEFAULT 0 , reserved5 INT DEFAULT 0 , reserved6 TEXT, reserved7 TEXT, reserved8 TEXT, reserved9 TEXT, reserved10 TEXT, weiboflag  INT DEFAULT 0 ,weibonickname TEXT  );"};
        f276601k = new java.lang.String[]{"CREATE UNIQUE INDEX IF NOT EXISTS  contact_username_unique_index ON rcontact ( username )", "CREATE INDEX IF NOT EXISTS  contact_alias_index ON rcontact ( alias )", "CREATE INDEX IF NOT EXISTS  en_username_unique_index ON rcontact ( encryptUsername )", "CREATE UNIQUE INDEX IF NOT EXISTS  bottle_username_unique_index ON bottlecontact ( username )", "CREATE INDEX IF NOT EXISTS type_verifyFlag_index ON rcontact ( type,verifyFlag ) ", "CREATE INDEX IF NOT EXISTS contact_usernameflag_index ON rcontact ( usernameFlag ) "};
        f276602l = "showHead = 32";
        f276603m = "type & 64 !=0  AND type >= 64";
    }

    public k4(l75.k0 k0Var) {
        boolean z17;
        android.database.Cursor f17 = k0Var.f("PRAGMA table_info( contact_ext )", null, 2);
        int columnIndex = f17.getColumnIndex(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
        boolean z18 = false;
        boolean z19 = false;
        while (true) {
            z17 = true;
            if (!f17.moveToNext() || (z18 && z19)) {
                break;
            }
            if (columnIndex >= 0) {
                java.lang.String string = f17.getString(columnIndex);
                if ("weiboNickname".equalsIgnoreCase(string)) {
                    z19 = true;
                } else if ("weiboFlag".equalsIgnoreCase(string)) {
                    z18 = true;
                }
            }
        }
        f17.close();
        if (!z18) {
            k0Var.A("contact_ext", "Alter table contact_ext add weiboFlag INT DEFAULT 0 ");
        }
        if (!z19) {
            k0Var.A("contact_ext", "Alter table contact_ext add weiboNickname INT DEFAULT 0 ");
        }
        android.database.Cursor f18 = k0Var.f("PRAGMA table_info( rcontact )", null, 2);
        int columnIndex2 = f18.getColumnIndex(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
        while (true) {
            if (f18.moveToNext()) {
                if (columnIndex2 >= 0 && "verifyFlag".equalsIgnoreCase(f18.getString(columnIndex2))) {
                    break;
                }
            } else {
                z17 = false;
                break;
            }
        }
        f18.close();
        if (!z17) {
            k0Var.A("rcontact", "Alter table rcontact add verifyFlag INT DEFAULT 0 ");
        }
        java.util.Iterator<java.lang.String> it = l75.n0.m145251xdc9c58c4(com.p314xaae8f345.mm.p670x38b72420.s.G2, "bottlecontact", k0Var).iterator();
        while (it.hasNext()) {
            k0Var.A("bottlecontact", it.next());
        }
        java.util.Iterator<java.lang.String> it6 = l75.n0.m145251xdc9c58c4(com.p314xaae8f345.mm.p670x38b72420.s.G2, "rcontact", k0Var).iterator();
        while (it6.hasNext()) {
            k0Var.A("rcontact", it6.next());
        }
        for (java.lang.String str : f276601k) {
            k0Var.A("rcontact", str);
        }
        java.util.Iterator<java.lang.String> it7 = l75.n0.m145251xdc9c58c4(com.p314xaae8f345.mm.p2621x8fb0427b.a4.f275280r, "ContactCmdBuf", k0Var).iterator();
        while (it7.hasNext()) {
            k0Var.A("ContactCmdBuf", it7.next());
        }
        this.f276604d = k0Var;
    }

    public static java.lang.String M() {
        l75.e0 e0Var = com.p314xaae8f345.mm.p670x38b72420.s.G2;
        return "( (type & 1!=0) and type & 8=0" + c01.e2.c(dm.i4.f66875xa013b0d5, new java.lang.String[]{"@chatroom", "@im.chatroom"}, new java.lang.String[0]) + ")";
    }

    public static java.lang.String S() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" where (type & 1!=0) and type & 32=0   and ");
        l75.e0 e0Var = com.p314xaae8f345.mm.p670x38b72420.s.G2;
        sb6.append("type & 8=0" + c01.e2.b(dm.i4.f66875xa013b0d5, "@openim", false, new java.lang.String[0]));
        return sb6.toString();
    }

    public static java.lang.String a0(java.lang.String str) {
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(str) ? "bottlecontact" : "rcontact";
    }

    public static java.lang.String b0() {
        l75.e0 e0Var = com.p314xaae8f345.mm.p670x38b72420.s.G2;
        return "( (type & 1!=0) and type & 8=0" + c01.e2.b(dm.i4.f66875xa013b0d5, "@talkroom", false, new java.lang.String[0]) + ")";
    }

    public static java.lang.String d0() {
        java.lang.String t17 = t(false, false);
        iz5.a.g(null, t17 != null && t17.length() > 0);
        return t17 + c01.e2.b(dm.i4.f66875xa013b0d5, "@micromsg.qq.com", false, " or (" + b0() + ')');
    }

    public static java.lang.String t(boolean z17, boolean z18) {
        l75.e0 e0Var = com.p314xaae8f345.mm.p670x38b72420.s.G2;
        java.lang.String str = ((" where (" + (z17 ? "type & 1!=0 or type & 16!=0" : "type & 1!=0") + ")") + " and type & 32=0 ") + " and type & 8 =0 ";
        if (!z18) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = com.p314xaae8f345.mm.p2621x8fb0427b.z3.M2;
            str = str + " and verifyFlag & 8 =0 ";
        }
        return str + " and deleteFlag = 0";
    }

    public android.database.Cursor A(java.lang.String str, java.lang.String str2, java.util.List list, java.util.List list2, boolean z17, boolean z18) {
        java.lang.String str3 = "select username ,nickname ,alias,conRemark,verifyFlag,showHead,weiboFlag,rowid ,deleteFlag,lvbuff,descWordingId,openImAppid from rcontact " + I(str, str2, list) + N(list2) + " order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ";
        l75.k0 k0Var = this.f276604d;
        if (!z17) {
            return k0Var.f(str3, null, 4);
        }
        e95.h[] hVarArr = new e95.h[2];
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select username ,nickname ,alias,conRemark,verifyFlag,showHead,weiboFlag,rowid ,deleteFlag,lvbuff,descWordingId,openImAppid from rcontact ");
        sb6.append(F(list, z18));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = com.p314xaae8f345.mm.p2621x8fb0427b.z3.M2;
        sb6.append(" order by case when verifyFlag & 8 != 0 then 0 else 1 end , showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ");
        android.database.Cursor f17 = k0Var.f(sb6.toString(), null, 4);
        android.database.Cursor f18 = k0Var.f(str3, null, 4);
        if (!(f17 instanceof e95.h) || !(f18 instanceof e95.h)) {
            return d95.d.a();
        }
        hVarArr[0] = (e95.h) f17;
        hVarArr[1] = (e95.h) f18;
        return new e95.j(hVarArr);
    }

    public android.database.Cursor B(java.util.List list) {
        iz5.a.g(null, list.size() > 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, uiType, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact  where username IN (");
        for (int i17 = 0; i17 < list.size(); i17++) {
            if (i17 == list.size() - 1) {
                sb6.append(" '");
                sb6.append((java.lang.String) list.get(i17));
                sb6.append("'");
            } else {
                sb6.append(" '");
                sb6.append((java.lang.String) list.get(i17));
                sb6.append("',");
            }
        }
        sb6.append(" ) order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ");
        return this.f276604d.B(sb6.toString(), null);
    }

    public android.database.Cursor C(java.util.List list) {
        iz5.a.g(null, list.size() > 0);
        java.lang.String str = "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, uiType, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact  where (";
        for (int i17 = 0; i17 < list.size(); i17++) {
            str = i17 != list.size() - 1 ? str + "username = '" + ((java.lang.String) list.get(i17)) + "' OR " : str + "username = '" + ((java.lang.String) list.get(i17)) + "'";
        }
        java.lang.String str2 = str + ") order by case username ";
        for (int i18 = 0; i18 < list.size(); i18++) {
            str2 = str2 + " when '" + ((java.lang.String) list.get(i18)) + "' then " + i18;
        }
        return this.f276604d.B(str2 + " end", null);
    }

    public android.database.Cursor D() {
        return this.f276604d.B("select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, uiType, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact  where rowid = -1", null);
    }

    public android.database.Cursor E(java.util.List list, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, uiType, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact ");
        sb6.append(((t(false, z17) + " AND " + f276603m) + c01.e2.b(dm.i4.f66875xa013b0d5, "@openim", true, new java.lang.String[0])) + o(list));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = com.p314xaae8f345.mm.p2621x8fb0427b.z3.M2;
        sb6.append(" order by case when verifyFlag & 8 != 0 then 0 else 1 end , showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ");
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactStorage", "getFavCursorWithoutOpenIM favourSql = %s", sb7);
        return this.f276604d.B(sb7, null);
    }

    public java.lang.String F(java.util.List list, boolean z17) {
        return (t(false, z17) + " AND " + f276603m) + o(list);
    }

    public r45.hs0 G(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactStorage", "getFieldVersion failed user is null");
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.a4 a4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.a4();
        android.database.Cursor D = this.f276604d.D("ContactCmdBuf", null, "username=?", new java.lang.String[]{str}, null, null, null, 2);
        if (D.moveToFirst()) {
            a4Var.mo9015xbf5d97fd(D);
        }
        D.close();
        r45.hs0 hs0Var = a4Var.f66484x94ac5fb5;
        if (hs0Var != null) {
            hs0Var.mo12245xcc313de3();
        }
        return a4Var.f66484x94ac5fb5;
    }

    public java.util.List H(java.util.List list) {
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ContactStorage", "getFilterList: but white list is empty");
            return new java.util.LinkedList();
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("username='");
        sb6.append((java.lang.String) list.get(0));
        sb6.append("'");
        for (int i17 = 1; i17 < list.size(); i17++) {
            sb6.append(" or username='");
            sb6.append((java.lang.String) list.get(i17));
            sb6.append("'");
        }
        java.lang.String sb7 = sb6.toString();
        l75.e0 e0Var = com.p314xaae8f345.mm.p670x38b72420.s.G2;
        java.lang.String format = java.lang.String.format("select %s from %s where (%s) and (%s & %d != 0)  order by %s", dm.i4.f66875xa013b0d5, "rcontact", sb7, "type", 1, "showHead asc, pyInitial asc, quanPin asc, nickname asc, username asc ");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactStorage", "getFilterList: sql is %s", format);
        android.database.Cursor f17 = this.f276604d.f(format, null, 2);
        if (f17 != null) {
            while (f17.moveToNext()) {
                linkedList.add(f17.getString(0));
            }
            f17.close();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactStorage", "getFilerList: use time[%d ms] whiteList[%s], usernameList[%s]", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), list, linkedList.toString());
        return linkedList;
    }

    public java.lang.String I(java.lang.String str, java.lang.String str2, java.util.List list) {
        java.lang.String str3;
        if (str == null || str.equals("@all.android")) {
            str3 = "" + t(true, false);
        } else if (str.equals("@all.contact.android")) {
            l75.e0 e0Var = com.p314xaae8f345.mm.p670x38b72420.s.G2;
            str3 = " where (type & 1!=0) and type & 32=0  ";
        } else if (str.equals("@all.chatroom.contact")) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("(type & 1!=0");
            l75.e0 e0Var2 = com.p314xaae8f345.mm.p670x38b72420.s.G2;
            sb7.append(c01.e2.c(dm.i4.f66875xa013b0d5, new java.lang.String[]{"@chatroom", "@im.chatroom"}, new java.lang.String[0]));
            sb7.append(")");
            sb6.append((" where (" + sb7.toString() + ") and ") + "type & 32=0 ");
            str3 = sb6.toString();
        } else if (str.equals("@all.contact.without.chatroom")) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("");
            java.lang.String t17 = t(false, false);
            iz5.a.g(null, t17 != null && t17.length() > 0);
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder(" or (");
            sb9.append(b0());
            sb9.append(") or (");
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("type & 8=0");
            l75.e0 e0Var3 = com.p314xaae8f345.mm.p670x38b72420.s.G2;
            sb10.append(c01.e2.b(dm.i4.f66875xa013b0d5, "@openim", false, new java.lang.String[0]));
            sb9.append(sb10.toString());
            sb9.append(")");
            sb8.append(t17 + c01.e2.b(dm.i4.f66875xa013b0d5, "@micromsg.qq.com", false, sb9.toString()));
            str3 = sb8.toString();
        } else if (str.equals("@all.contact.without.chatroom.without.openim") || str.equals("@all.contact.without.chatroom.without.openim.without.openimfavour")) {
            str3 = "" + d0();
        } else if (str.equals("@all.contact.without.chatroom.without.openim.without.chatbot")) {
            str3 = ("" + d0()) + " and username not like 'wxid_wi_%'";
        } else if (str.equals("@black.android")) {
            l75.e0 e0Var4 = com.p314xaae8f345.mm.p670x38b72420.s.G2;
            str3 = " where type & 8!=0 and type >= 8";
        } else if (str.equals("@werun.black.android")) {
            l75.e0 e0Var5 = com.p314xaae8f345.mm.p670x38b72420.s.G2;
            str3 = " where type & 524288!=0";
        } else if (str.equals("@tophistory.black.android")) {
            l75.e0 e0Var6 = com.p314xaae8f345.mm.p670x38b72420.s.G2;
            str3 = " where type & 131072!=0";
        } else if (str.equals("@tophistory.unlike.android")) {
            l75.e0 e0Var7 = com.p314xaae8f345.mm.p670x38b72420.s.G2;
            str3 = " where type & 262144!=0";
        } else if (str.equals("@social.black.android")) {
            l75.e0 e0Var8 = com.p314xaae8f345.mm.p670x38b72420.s.G2;
            str3 = " where (type & 1!=0) and type & 32=0   and type & 8388608!=0";
        } else if (str.equals("@sns.black.android")) {
            l75.e0 e0Var9 = com.p314xaae8f345.mm.p670x38b72420.s.G2;
            str3 = " where (type & 1!=0) and type & 32=0   and type & 256!=0";
        } else if (str.equals("@sns.unlike.android")) {
            l75.e0 e0Var10 = com.p314xaae8f345.mm.p670x38b72420.s.G2;
            str3 = " where (type & 1!=0) and type & 32=0   and type & 1048576!=0";
        } else if (str.equals("@finder.block.his.liked.android")) {
            l75.e0 e0Var11 = com.p314xaae8f345.mm.p670x38b72420.s.G2;
            str3 = " where (type & 1!=0) and type & 32=0   and type & 33554432!=0";
        } else if (str.equals("@finder.block.my.liked.android")) {
            l75.e0 e0Var12 = com.p314xaae8f345.mm.p670x38b72420.s.G2;
            str3 = " where (type & 1!=0) and type & 32=0   and type & 134217728!=0";
        } else if (str.equals("@t.qq.com")) {
            str3 = " where username like '%@t.qq.com'";
        } else if (str.equals("@domain.android")) {
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder("");
            java.lang.String t18 = t(true, false);
            iz5.a.g(null, t18 != null && t18.length() > 0);
            sb11.append(t18 + " and domainList like '%" + str2 + "%'");
            str3 = sb11.toString();
        } else if (str.equals("@micromsg.qq.com")) {
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder("");
            java.lang.String t19 = t(false, false);
            iz5.a.g(null, t19 != null && t19.length() > 0);
            sb12.append(t19 + c01.e2.b(dm.i4.f66875xa013b0d5, "@micromsg.qq.com", false, " or (" + M() + ')', " or (" + b0() + ')'));
            str3 = sb12.toString();
        } else if (str.equals("@micromsg.no.verify.biz.qq.com")) {
            java.lang.StringBuilder sb13 = new java.lang.StringBuilder("");
            l75.e0 e0Var13 = com.p314xaae8f345.mm.p670x38b72420.s.G2;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = com.p314xaae8f345.mm.p2621x8fb0427b.z3.M2;
            sb13.append(" where (type & 1 !=0 ) and type & 32 =0 and type & 8 =0 and verifyFlag & 8 =0" + c01.e2.b(dm.i4.f66875xa013b0d5, "@micromsg.qq.com", false, " or (" + M() + ')'));
            str3 = sb13.toString();
        } else if (str.equals("@micromsg.with.all.biz.qq.com")) {
            java.lang.StringBuilder sb14 = new java.lang.StringBuilder("");
            l75.e0 e0Var14 = com.p314xaae8f345.mm.p670x38b72420.s.G2;
            iz5.a.g(null, " where (type & 1 !=0 ) and type & 32 =0 and type & 8 =0".length() > 0);
            sb14.append(" where (type & 1 !=0 ) and type & 32 =0 and type & 8 =0" + c01.e2.b(dm.i4.f66875xa013b0d5, "@micromsg.qq.com", false, " or (" + M() + ')'));
            str3 = sb14.toString();
        } else if (str.equals("@micromsg.with.all.biz.qq.com.openim")) {
            java.lang.StringBuilder sb15 = new java.lang.StringBuilder("");
            l75.e0 e0Var15 = com.p314xaae8f345.mm.p670x38b72420.s.G2;
            iz5.a.g(null, " where (type & 1 !=0 ) and type & 32 =0 and type & 8 =0".length() > 0);
            sb15.append(" where (type & 1 !=0 ) and type & 32 =0 and type & 8 =0" + c01.e2.b(dm.i4.f66875xa013b0d5, "@micromsg.qq.com", false, " or (" + M() + ')', " or ((username like '%@openim'))"));
            str3 = sb15.toString();
        } else if (str.equals("@qqim")) {
            java.lang.StringBuilder sb16 = new java.lang.StringBuilder("");
            java.lang.String t27 = t(false, false);
            iz5.a.g(null, t27 != null && t27.length() > 0);
            sb16.append(t27 + c01.e2.b(dm.i4.f66875xa013b0d5, "@qqim", false, new java.lang.String[0]));
            str3 = sb16.toString();
        } else if (str.equals("@all.chatroom")) {
            l75.e0 e0Var16 = com.p314xaae8f345.mm.p670x38b72420.s.G2;
            str3 = " where (type & 1 !=0 or type & 2 !=0 or type & 4 !=0 or 1) ";
        } else if (str.equals("@verify.contact")) {
            l75.e0 e0Var17 = com.p314xaae8f345.mm.p670x38b72420.s.G2;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.M2;
            str3 = " where (type & 1 != 0 and verifyFlag & 16 != 0) ";
        } else if (str.equals("@biz.contact")) {
            l75.e0 e0Var18 = com.p314xaae8f345.mm.p670x38b72420.s.G2;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var3 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.M2;
            str3 = " where (type & 1 != 0 and verifyFlag & 8 != 0) ";
        } else if (str.equals("@all.weixin.android")) {
            l75.e0 e0Var19 = com.p314xaae8f345.mm.p670x38b72420.s.G2;
            str3 = " where (type & 1 != 0 or  (username not like '%@qqim' and username not like '%@qr' and username not like '%@bottle' and username not like '%@fb' and username not like '%@google' and username not like '%@t.qq.com' and username not like '%@t.sina.com' and username not like '%@t.sina.com')) ";
        } else if (str.equals("@openim.contact")) {
            str3 = "" + S();
        } else if (str.equals("@guardian.teenmode")) {
            l75.e0 e0Var20 = com.p314xaae8f345.mm.p670x38b72420.s.G2;
            str3 = " where type & 1073741824!=0 ";
        } else if (str.equals("@ward.teenmode")) {
            l75.e0 e0Var21 = com.p314xaae8f345.mm.p670x38b72420.s.G2;
            str3 = " where type & 536870912!=0 ";
        } else if (str.equals("@all.contact.without.chatroom.openim.openimfavour.snsblack.black.socialblack")) {
            java.lang.StringBuilder sb17 = new java.lang.StringBuilder("");
            java.lang.String t28 = t(false, false);
            l75.e0 e0Var22 = com.p314xaae8f345.mm.p670x38b72420.s.G2;
            java.lang.String str4 = t28 + " and type & 256=0 and type & 8388608=0";
            iz5.a.g(null, str4 != null && str4.length() > 0);
            java.lang.String str5 = " or (" + b0() + ')';
            sb17.append((str4 + " and ( username not like '%@%'" + str5 + ")") + c01.e2.b(dm.i4.f66875xa013b0d5, "@micromsg.qq.com", false, str5));
            str3 = sb17.toString();
        } else if (str.equals("@convInBox")) {
            l75.e0 e0Var23 = com.p314xaae8f345.mm.p670x38b72420.s.G2;
            str3 = " where type & 268435456!=0 ";
        } else if (str.equals("wxid_wi_")) {
            str3 = " where username like 'wxid_wi_%'";
        } else {
            str3 = "" + t(false, false);
        }
        return str3 + o(list);
    }

    public android.database.Cursor J(int i17, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, uiType, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact  where (type & 1!=0) and type & 32=0   AND type & ");
        l75.e0 e0Var = com.p314xaae8f345.mm.p670x38b72420.s.G2;
        sb6.append(i17);
        sb6.append(" !=0  AND type >= ");
        sb6.append(i17);
        java.lang.String sb7 = sb6.toString();
        if (z17) {
            sb7 = sb7 + " order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ";
        }
        return this.f276604d.B(sb7, null);
    }

    public android.database.Cursor K() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select username ,nickname ,alias,conRemark,verifyFlag,showHead,weiboFlag,rowid ,deleteFlag,lvbuff,descWordingId,openImAppid from rcontact  where type & 1 !=0 and type & 32 =0 and type & 8 =0 and verifyFlag & 8 = 0");
        l75.e0 e0Var = com.p314xaae8f345.mm.p670x38b72420.s.G2;
        sb6.append(c01.e2.b(dm.i4.f66875xa013b0d5, "@micromsg.qq.com", false, new java.lang.String[0]));
        sb6.append(" or username = 'weixin'");
        return this.f276604d.f(sb6.toString(), null, 2);
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 L(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) ((lt0.f) this.f276607g).i(str);
        if (z3Var != null) {
            return z3Var;
        }
        return null;
    }

    public final java.lang.String N(java.util.List list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            sb6.append(" or username = '");
            sb6.append(str);
            sb6.append("'");
        }
        return sb6.toString();
    }

    public int O(boolean z17, java.lang.String[] strArr, java.lang.String... strArr2) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select count(username) from rcontact where type & 1 !=0 and type & 32 =0 and ");
        l75.e0 e0Var = com.p314xaae8f345.mm.p670x38b72420.s.G2;
        if (!z17) {
            sb6.append("type & 8 =0 and ");
        }
        sb6.append("verifyFlag & 8 = 0 ");
        int i17 = 0;
        sb6.append(c01.e2.b(dm.i4.f66875xa013b0d5, "@micromsg.qq.com", false, new java.lang.String[0]));
        if (strArr != null && strArr.length > 0) {
            for (java.lang.String str : strArr) {
                if (!"weixin".equals(str)) {
                    sb6.append(" and rcontact.username != '");
                    sb6.append(str);
                    sb6.append("'");
                }
            }
        }
        if (strArr2 != null && strArr2.length > 0) {
            for (java.lang.String str2 : strArr2) {
                if (!"weixin".equals(str2)) {
                    sb6.append(" and rcontact.username != '");
                    sb6.append(str2);
                    sb6.append("'");
                }
            }
        }
        sb6.append(" or username = 'weixin'");
        java.lang.String sb7 = sb6.toString();
        android.database.Cursor f17 = this.f276604d.f(sb7, null, 2);
        if (f17 != null && f17.moveToFirst()) {
            i17 = f17.getInt(0);
            f17.close();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactStorage", "getNormalContactCount, sql:%s, result:%d, includeBlack:%s, time:%d", sb7, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        return i17;
    }

    public final java.lang.String P(java.util.List list) {
        java.lang.String N = N(list);
        int indexOf = N.indexOf("or");
        return indexOf <= 2 ? N.substring(indexOf + 2) : N;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
    
        if (r1.moveToFirst() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        r2 = r1.getString(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0083, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r2) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0085, code lost:
    
        r0.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        if (r1.moveToNext() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
    
        r1.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List Q() {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " select openImAppid from rcontact"
            r0.<init>(r1)
            java.lang.String r1 = S()
            r0.append(r1)
            java.lang.String r1 = " group by openImAppid "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            l75.k0 r1 = r8.f276604d
            r2 = 0
            r3 = 2
            android.database.Cursor r0 = r1.f(r0, r2, r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L24:
            boolean r5 = r0.moveToNext()
            r6 = 0
            if (r5 == 0) goto L4a
            java.lang.String r5 = r0.getString(r6)
            boolean r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r5)
            if (r6 != 0) goto L24
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "'"
            r6.<init>(r7)
            r6.append(r5)
            r6.append(r7)
            java.lang.String r5 = r6.toString()
            r4.add(r5)
            goto L24
        L4a:
            r0.close()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            int r5 = r4.size()
            if (r5 <= 0) goto L91
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = " select acctTypeId from OpenIMAppIdInfo where appid in ("
            r5.<init>(r7)
            java.lang.String r7 = ","
            java.lang.String r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(r4, r7)
            r5.append(r4)
            java.lang.String r4 = ") group by acctTypeId"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.database.Cursor r1 = r1.f(r4, r2, r3)
            boolean r2 = r1.moveToFirst()
            if (r2 == 0) goto L8e
        L7b:
            java.lang.String r2 = r1.getString(r6)
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r2)
            if (r3 != 0) goto L88
            r0.add(r2)
        L88:
            boolean r2 = r1.moveToNext()
            if (r2 != 0) goto L7b
        L8e:
            r1.close()
        L91:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2621x8fb0427b.k4.Q():java.util.List");
    }

    public android.database.Cursor R(java.util.List list, java.lang.String str, java.util.List list2) {
        return this.f276604d.f(g("select rcontact.username ,rcontact.nickname ,rcontact.alias,rcontact.conRemark,rcontact.verifyFlag,rcontact.showHead,rcontact.weiboFlag,rcontact.rowid ,rcontact.deleteFlag,rcontact.lvbuff,rcontact.descWordingId, rcontact.openImAppid,  OpenIMWordingInfo.wording, OpenIMWordingInfo.quanpin  from rcontact left join OpenIMWordingInfo on rcontact.descWordingId=OpenIMWordingInfo.wordingId and rcontact.openImAppid = OpenIMWordingInfo.appid ", list, str, list2) + " order by OpenIMWordingInfo.quanpin IS NULL, OpenIMWordingInfo.quanpin ", null, 4);
    }

    public java.lang.String T(java.lang.String str) {
        if (str == null || str.equals("")) {
            return "";
        }
        return (((((((" and (conRemark like '%" + str + "%' or ") + "conRemarkPYFull like '%" + str + "%' or ") + "conRemarkPYShort like '%" + str + "%' or ") + "alias like '%" + str + "%' or ") + "username like '%" + str + "%' or ") + "nickname like '%" + str + "%' or ") + "pyInitial like '%" + str + "%' or ") + "quanPin like '%" + str + "%' )";
    }

    public android.database.Cursor U(java.lang.String[] strArr, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list) {
        return this.f276604d.B("select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, uiType, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact " + I(str2, str3, list) + c0(strArr) + T(str) + " order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ", null);
    }

    public android.database.Cursor V(java.lang.String[] strArr, java.lang.String str, java.lang.String str2, java.util.List list, java.util.List list2) {
        if (strArr == null || strArr.length == 0) {
            return d95.d.a();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, uiType, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact ");
        sb6.append(I(str, str2, list2));
        sb6.append(c0(strArr));
        java.lang.String str3 = "";
        if (str2 != null && !str2.equals("")) {
            java.lang.String str4 = " and (";
            if (list != null && list.size() != 0) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    str4 = str4 + "username = '" + ((java.lang.String) it.next()) + "' or ";
                }
            }
            str3 = (((((((str4 + "conRemark like '%" + str2 + "%' or ") + "conRemarkPYFull like '%" + str2 + "%' or ") + "conRemarkPYShort like '%" + str2 + "%' or ") + "alias like '%" + str2 + "%' or ") + "username like '%" + str2 + "%' or ") + "nickname like '%" + str2 + "%' or ") + "pyInitial like '%" + str2 + "%' or ") + "quanPin like '%" + str2 + "%' )";
        }
        sb6.append(str3);
        sb6.append(" order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ");
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactStorage", sb7);
        return this.f276604d.B(sb7, null);
    }

    public android.database.Cursor W(java.lang.String[] strArr, java.lang.String str, java.lang.String str2, java.util.List list) {
        java.lang.String str3 = "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, uiType, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact " + I(str, str2, list) + c0(strArr);
        if (strArr != null && strArr.length > 0) {
            str3 = str3 + " order by 1=1 ";
            for (java.lang.String str4 : strArr) {
                str3 = str3 + ",username='" + str4 + "' desc";
            }
        }
        return this.f276604d.B(str3, null);
    }

    public java.lang.String X(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 v17 = v(str);
        if (v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactStorage", "getSendMsgTicket ca == null");
            return "";
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        java.lang.String a17 = v17.a1();
        objArr[1] = java.lang.Integer.valueOf((a17 != null ? a17 : "").length());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactStorage", "getSendMsgTicket %s %s", objArr);
        return v17.a1();
    }

    public int[] Y(java.util.List list) {
        java.lang.String str = "select distinct showHead from rcontact  where (" + P(list) + ")  order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ";
        java.lang.System.currentTimeMillis();
        android.database.Cursor B = this.f276604d.B(str, null);
        java.lang.System.currentTimeMillis();
        java.lang.System.currentTimeMillis();
        int count = B.getCount() >= 0 ? B.getCount() : 0;
        java.lang.System.currentTimeMillis();
        int[] iArr = new int[count];
        if (B.getCount() > 0) {
            for (int i17 = 0; i17 < count; i17++) {
                B.moveToPosition(i17);
                iArr[i17] = B.getInt(0);
            }
        }
        B.close();
        return iArr;
    }

    public int[] Z(java.lang.String[] strArr, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list) {
        java.lang.String str4 = "select distinct showHead from rcontact " + I(str, str2, list) + c0(strArr) + T(str3) + " order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ";
        java.lang.System.currentTimeMillis();
        android.database.Cursor B = this.f276604d.B(str4, null);
        java.lang.System.currentTimeMillis();
        java.lang.System.currentTimeMillis();
        int count = B.getCount() >= 0 ? B.getCount() : 0;
        java.lang.System.currentTimeMillis();
        int[] iArr = new int[count];
        if (B.getCount() > 0) {
            for (int i17 = 0; i17 < count; i17++) {
                B.moveToPosition(i17);
                iArr[i17] = B.getInt(0);
            }
        }
        B.close();
        return iArr;
    }

    public final java.lang.String c0(java.lang.String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        int i17 = 0;
        if (strArr.length < 500) {
            java.lang.String str = " and (";
            while (i17 < strArr.length) {
                if (i17 > 0) {
                    str = str + " or ";
                }
                str = str + "username = '" + strArr[i17] + "' ";
                i17++;
            }
            return str + " )";
        }
        if (strArr.length == 0) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        while (i17 < strArr.length) {
            if (i17 == strArr.length - 1) {
                sb6.append(" '" + strArr[i17].trim() + "' ");
            } else {
                sb6.append(" '" + strArr[i17].trim() + "' ,");
            }
            i17++;
        }
        return (" and username in (" + sb6.toString() + ") ") + "";
    }

    @Override // l75.a1
    public void d(l75.y0 y0Var) {
        java.util.Iterator it = ((fs.c) fs.g.f(com.p314xaae8f345.mm.p2621x8fb0427b.d8.class)).all().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p2621x8fb0427b.d8) ((fs.q) it.next()).get()).g(y0Var.f398511a, this, y0Var.f398512b);
        }
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 e0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(str)) {
            str = com.p314xaae8f345.mm.p2621x8fb0427b.z3.Y4(str);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(str) ? "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, uiType, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from bottlecontact" : "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, uiType, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact");
        sb6.append(" where username=");
        sb6.append(d95.b0.O(str));
        sb6.append(" or encryptUsername=");
        sb6.append(d95.b0.O(str));
        android.database.Cursor f17 = this.f276604d.f(sb6.toString(), null, 2);
        if (f17.moveToFirst()) {
            z3Var.mo9015xbf5d97fd(f17);
            i(z3Var);
            z3Var.Z4();
        }
        f17.close();
        return z3Var;
    }

    @Override // l75.a1
    public boolean f() {
        l75.k0 k0Var = this.f276604d;
        if (k0Var != null && !k0Var.J()) {
            return true;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = k0Var == null ? "null" : java.lang.Boolean.valueOf(k0Var.J());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ContactStorage", "shouldProcessEvent db is close :%s", objArr);
        return false;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(str)) {
            str = com.p314xaae8f345.mm.p2621x8fb0427b.z3.Y4(str);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 L = L(str);
        if (L != null) {
            return L;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(str) ? "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, uiType, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from bottlecontact" : "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, uiType, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact");
        sb6.append(" where username=");
        sb6.append(d95.b0.O(str));
        sb6.append(" or encryptUsername=");
        sb6.append(d95.b0.O(str));
        android.database.Cursor f17 = this.f276604d.f(sb6.toString(), null, 2);
        if (f17.moveToFirst()) {
            z3Var.mo9015xbf5d97fd(f17);
            i(z3Var);
            s0(z3Var, false);
        }
        f17.close();
        return z3Var;
    }

    public final java.lang.String g(java.lang.String str, java.util.List list, java.lang.String str2, java.util.List list2) {
        java.lang.String str3 = (str + " and OpenIMWordingInfo.language='" + str2 + "' ") + S();
        java.lang.String str4 = "";
        if (list2 != null && list2.size() > 0) {
            java.util.Iterator it = list2.iterator();
            java.lang.String str5 = "";
            while (it.hasNext()) {
                java.lang.String str6 = (java.lang.String) it.next();
                str5 = (str5.equals("") ? str5.concat(" and (") : str5.concat(" or ")) + "openImAppid == '" + str6 + "'";
            }
            str4 = str5 + " )";
        }
        return (str3 + str4) + o(list);
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 g0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f276609i.get(str);
        if (z3Var != null) {
            s0(z3Var, false);
            return z3Var;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        android.database.Cursor f17 = this.f276604d.f("select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, uiType, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact where alias=" + d95.b0.O(str), null, 2);
        if (f17.moveToFirst()) {
            z3Var2.mo9015xbf5d97fd(f17);
            i(z3Var2);
            s0(z3Var2, false);
        }
        f17.close();
        z3Var2.Z4();
        return z3Var2;
    }

    public boolean h(java.lang.String str) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (!str.contains("@") || str.endsWith("@stranger"))) {
            lt0.f fVar = (lt0.f) this.f276608h;
            java.lang.Integer num = (java.lang.Integer) fVar.get(str);
            if (num != null) {
                return (num.intValue() & 1) != 0;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = n(str, true);
            if (n17 != null && (n17.d1().equals(str) || str.equals(n17.J0()))) {
                fVar.j(str, java.lang.Integer.valueOf(n17.m124896xfb85f7b0()));
                return (n17.m124896xfb85f7b0() & 1) != 0;
            }
            fVar.j(str, 0);
        }
        return false;
    }

    public boolean h0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        return i0(z3Var) > 0;
    }

    public final void i(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        java.util.Map map = this.f276606f;
        if (map == null || android.os.Process.myTid() != this.f276605e) {
            return;
        }
        java.lang.String d17 = z3Var.d1();
        int m124896xfb85f7b0 = z3Var.m124896xfb85f7b0();
        java.util.HashMap hashMap = (java.util.HashMap) map;
        java.lang.Integer num = (java.lang.Integer) hashMap.get(d17);
        if (num != null && (m124896xfb85f7b0 & 1) == 0 && (num.intValue() & 1) != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ContactStorage", "Non-contact bug found: " + d17);
            jx3.f.INSTANCE.d(21019, 0, 0, 25601, "", d17);
        }
        hashMap.put(d17, java.lang.Integer.valueOf(m124896xfb85f7b0));
    }

    public int i0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        java.lang.String str;
        java.lang.String d17 = z3Var.d1();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (d17 == null) {
            d17 = "";
        }
        if (d17.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactStorage", "FATAL ERROR, invalid contact, empty username");
            return -1;
        }
        z3Var.T1(z3Var.c2());
        z3Var.n3(z3Var.d2());
        com.p314xaae8f345.mm.p2621x8fb0427b.j4 j4Var = this.f276609i;
        j4Var.w0(this, z3Var);
        int o07 = j4Var.o0(z3Var, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactStorage", "insert extensions replace=%s %s", java.lang.Integer.valueOf(o07), z3Var.d1());
        if (o07 < 0) {
            android.content.ContentValues mo9763xeb27878e = z3Var.mo9763xeb27878e();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            o07 = (int) this.f276604d.l(a0(z3Var.d1()), com.p314xaae8f345.mm.p670x38b72420.s.G2.f398486b, mo9763xeb27878e);
            int currentTimeMillis2 = (int) (java.lang.System.currentTimeMillis() - currentTimeMillis);
            boolean z18 = z65.c.f551988a;
            jx3.f.INSTANCE.m(463, z18 ? 11 : 14, z18 ? 12 : 15, currentTimeMillis2, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactStorage", "insert: username=%s, showHead=%d, verifyFlag=%d, ret=:%d take[%s]ms fg:%b", z3Var.d1(), java.lang.Integer.valueOf(z3Var.W0()), java.lang.Integer.valueOf(z3Var.f1()), java.lang.Integer.valueOf(o07), java.lang.Integer.valueOf(currentTimeMillis2), java.lang.Boolean.valueOf(z18));
            if (o07 != -1) {
                z3Var.E2 = o07;
                s0(z3Var, false);
                l(2, this, z3Var.d1(), z3Var);
                java.lang.String username = z3Var.d1();
                int f17 = z3Var.f1();
                int m124896xfb85f7b0 = z3Var.m124896xfb85f7b0();
                int i17 = z3Var.f318119x1;
                int i18 = z3Var.T;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
                bn0.g gVar = bn0.g.f104312a;
                bn0.a f18 = gVar.f(username);
                gVar.j(username, new bn0.a(f17, m124896xfb85f7b0, i17, i18, (f18 == null || (str = f18.f104305e) == null) ? "" : str));
                return o07;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactStorage", "insert failed: username=%s", z3Var.d1());
        }
        return o07;
    }

    public int j(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactStorage", "delCmdBuf failed user is null");
            return -1;
        }
        return this.f276604d.mo70514xb06685ab("ContactCmdBuf", "username=?", new java.lang.String[]{"" + str});
    }

    public boolean j0(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = n(str, true);
        return (n17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.d1()) || !n17.d1().equals(str)) ? false : true;
    }

    public int k(java.lang.String str) {
        iz5.a.g(null, str.length() > 0);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(str)) {
            str = com.p314xaae8f345.mm.p2621x8fb0427b.z3.Y4(str);
        }
        k0(str);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3(str);
        z3Var.mo43621x7650bebc(0);
        z3Var.W1(0L);
        z3Var.X1("fake_" + java.lang.System.currentTimeMillis());
        z3Var.K1("fake_" + java.lang.System.currentTimeMillis());
        z3Var.j3(0);
        int p17 = this.f276604d.p(a0(str), z3Var.mo9763xeb27878e(), "username=?", new java.lang.String[]{"" + str});
        j(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ContactStorage", "delete (because the talker id , dk just mark it  disappear .) user:%s res:%s %s", str, java.lang.Integer.valueOf(p17), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        if (p17 == 0) {
            return p17;
        }
        l(5, this, str, z3Var);
        return p17;
    }

    public void k0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        ((lt0.f) this.f276607g).mo141381xc84af884(str);
        ((lt0.f) this.f276608h).mo141381xc84af884(str);
    }

    public void l(int i17, l75.a1 a1Var, java.lang.Object obj, java.lang.Object obj2) {
        l75.y0 y0Var = new l75.y0(this, i17, a1Var, obj, obj2);
        l75.v0 v0Var = this.f398472c;
        v0Var.d(y0Var);
        v0Var.c();
        o75.e eVar = dm.e2.D2;
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) obj2;
        eVar.getClass();
        if (str != null) {
            if ((r26.n0.N(str) ^ true ? str : null) != null) {
                o75.c cVar = new o75.c(i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? o75.b.f425114b : o75.b.f425117e : o75.b.f425116d : o75.b.f425116d : o75.b.f425115c, str, eVar.mo42857x23aed0ac());
                cVar.f425123d = z3Var;
                eVar.mo127123xc2079749(cVar);
            }
        }
    }

    public boolean l0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        java.lang.String str;
        iz5.a.g("contact NULL !", z3Var != null);
        if (!(z3Var != null && z3Var.F2 > 0)) {
            return true;
        }
        z3Var.T1(z3Var.c2());
        z3Var.n3(z3Var.d2());
        com.p314xaae8f345.mm.p2621x8fb0427b.j4 j4Var = this.f276609i;
        j4Var.w0(this, z3Var);
        boolean z17 = j4Var.o0(z3Var, false) > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactStorage", "[replace] ret:%s username=%s, showHead=%d, verifyFlag=%d", java.lang.Boolean.valueOf(z17), z3Var.d1(), java.lang.Integer.valueOf(z3Var.W0()), java.lang.Integer.valueOf(z3Var.f1()));
        if (!z17) {
            android.content.ContentValues mo9763xeb27878e = z3Var.mo9763xeb27878e();
            int i17 = (int) z3Var.E2;
            if (i17 > 0) {
                mo9763xeb27878e.put("rowid", java.lang.Integer.valueOf(i17));
            }
            z17 = this.f276604d.m(a0(z3Var.d1()), com.p314xaae8f345.mm.p670x38b72420.s.G2.f398486b, mo9763xeb27878e) > 0;
        }
        k0(z3Var.d1());
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var.J0())) {
            k0(z3Var.J0());
        }
        if (!z17) {
            return false;
        }
        java.lang.String username = z3Var.d1();
        int f17 = z3Var.f1();
        int m124896xfb85f7b0 = z3Var.m124896xfb85f7b0();
        int i18 = z3Var.f318119x1;
        int i19 = z3Var.T;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        bn0.g gVar = bn0.g.f104312a;
        bn0.a f18 = gVar.f(username);
        if (f18 == null || (str = f18.f104305e) == null) {
            str = "";
        }
        gVar.j(username, new bn0.a(f17, m124896xfb85f7b0, i18, i19, str));
        l(4, this, z3Var.d1(), z3Var);
        return true;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 m(java.lang.String str) {
        return n(str, true);
    }

    public boolean m0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        return j0(z3Var.d1()) ? p0(z3Var.d1(), z3Var) == 0 : i0(z3Var) >= 0;
    }

    public final com.p314xaae8f345.mm.p2621x8fb0427b.z3 n(java.lang.String str, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactStorage", "[get]username = %s", str);
            return null;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(str)) {
            str = com.p314xaae8f345.mm.p2621x8fb0427b.z3.Y4(str);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 L = L(str);
        if (L != null) {
            return L.t3();
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f276609i.get(str);
        if (z3Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactStorage", "[get]extensions:%s %s", str, java.lang.Integer.valueOf(z3Var.m124896xfb85f7b0()));
            s0(z3Var, false);
            return z3Var;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(str) ? "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, uiType, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from bottlecontact" : "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, uiType, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact");
        sb6.append(" where username=");
        sb6.append(d95.b0.O(str));
        sb6.append(" or encryptUsername=");
        sb6.append(d95.b0.O(str));
        android.database.Cursor f17 = this.f276604d.f(sb6.toString(), null, 2);
        if (f17.moveToFirst()) {
            z3Var2.mo9015xbf5d97fd(f17);
            f17.close();
            z3Var2.Z4();
            s0(z3Var2, false);
            i(z3Var2);
        } else {
            f17.close();
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactStorage", "[get]getRaw:%s %s", str, java.lang.Integer.valueOf(z3Var2.m124896xfb85f7b0()));
        }
        return z3Var2;
    }

    public int n0(java.lang.String str, r45.hs0 hs0Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactStorage", "setFieldVersion failed user is null");
            return -1;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.a4 a4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.a4();
        a4Var.f66484x94ac5fb5 = hs0Var;
        a4Var.f66485xdec927b = str;
        l75.k0 k0Var = this.f276604d;
        int i17 = (k0Var.p("ContactCmdBuf", a4Var.mo9763xeb27878e(), "username=?", new java.lang.String[]{str}) > 0 || k0Var.l("ContactCmdBuf", dm.i4.f66875xa013b0d5, a4Var.mo9763xeb27878e()) != -1) ? 0 : -1;
        if (hs0Var != null) {
            hs0Var.mo12245xcc313de3();
        }
        return i17;
    }

    public final java.lang.String o(java.util.List list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        for (int i17 = 0; i17 < list.size(); i17++) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) list.get(i17))) {
                if (i17 == list.size() - 1) {
                    sb6.append(" '" + ((java.lang.String) list.get(i17)).trim() + "' ");
                } else {
                    sb6.append(" '" + ((java.lang.String) list.get(i17)).trim() + "' ,");
                }
            }
        }
        return (" and username not in (" + sb6.toString() + ") ") + "";
    }

    public void o0(boolean z17) {
        if (z17) {
            this.f276605e = android.os.Process.myTid();
            this.f276606f = new java.util.HashMap();
        } else {
            this.f276605e = 0;
            this.f276606f = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactStorage", "setNewInit: " + this.f276605e);
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 p(long j17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = null;
        if (j17 <= 0) {
            return null;
        }
        android.database.Cursor f17 = this.f276604d.f("select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, uiType, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact  where rowid=" + j17, null, 2);
        if (f17.moveToFirst()) {
            z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
            z3Var.mo9015xbf5d97fd(f17);
            i(z3Var);
            s0(z3Var, false);
        }
        f17.close();
        if (z3Var != null) {
            z3Var.Z4();
        }
        return z3Var;
    }

    public int p0(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactStorage", "begin to update contact :%s, usernameFlag=%d", str, java.lang.Long.valueOf(z3Var.e1()));
        if (!(z3Var.F2 > 0)) {
            return 1;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(str)) {
            str = com.p314xaae8f345.mm.p2621x8fb0427b.z3.Y4(str);
        }
        z3Var.T1(z3Var.c2());
        z3Var.n3(z3Var.d2());
        com.p314xaae8f345.mm.p2621x8fb0427b.j4 j4Var = this.f276609i;
        j4Var.w0(this, z3Var);
        int o07 = j4Var.o0(z3Var, true);
        if (o07 < 0) {
            android.content.ContentValues mo9763xeb27878e = z3Var.mo9763xeb27878e();
            int i17 = (int) z3Var.E2;
            if (i17 > 0) {
                mo9763xeb27878e.put("rowid", java.lang.Integer.valueOf(i17));
            }
            if (mo9763xeb27878e.size() > 0) {
                o07 = this.f276604d.p(a0(str), mo9763xeb27878e, "username=?", new java.lang.String[]{"" + str});
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactStorage", "[update] ret=%s username=%s, showHead=%d, verifyFlag=%d, type=%d, usernameFlag=%d, take[%d]ms", java.lang.Integer.valueOf(o07), z3Var.d1(), java.lang.Integer.valueOf(z3Var.W0()), java.lang.Integer.valueOf(z3Var.f1()), java.lang.Integer.valueOf(z3Var.m124896xfb85f7b0()), java.lang.Long.valueOf(z3Var.e1()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        k0(str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var.J0())) {
            k0(z3Var.J0());
        }
        if (o07 != 0) {
            l(4, this, z3Var.d1(), z3Var);
            java.lang.String username = z3Var.d1();
            int f17 = z3Var.f1();
            int m124896xfb85f7b0 = z3Var.m124896xfb85f7b0();
            int i18 = z3Var.f318119x1;
            int i19 = z3Var.T;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
            bn0.g gVar = bn0.g.f104312a;
            bn0.a f18 = gVar.f(username);
            gVar.j(username, new bn0.a(f17, m124896xfb85f7b0, i18, i19, (f18 == null || (str2 = f18.f104305e) == null) ? "" : str2));
        }
        return o07;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 q(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(str)) {
            str = com.p314xaae8f345.mm.p2621x8fb0427b.z3.Y4(str);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 L = L(str);
        if (L != null) {
            L.Z4();
            return L;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f276609i.get(str);
        if (z3Var != null) {
            s0(z3Var, false);
            return z3Var;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(str) ? "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, uiType, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from bottlecontact" : "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, uiType, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact");
        sb6.append(" where username=");
        sb6.append(d95.b0.O(str));
        android.database.Cursor f17 = this.f276604d.f(sb6.toString(), null, 2);
        if (f17.moveToFirst()) {
            z3Var2.mo9015xbf5d97fd(f17);
            i(z3Var2);
            s0(z3Var2, false);
        }
        f17.close();
        z3Var2.Z4();
        return z3Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0257  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int q0(java.lang.String r18, com.p314xaae8f345.mm.p2621x8fb0427b.z3 r19) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2621x8fb0427b.k4.q0(java.lang.String, com.tencent.mm.storage.z3):int");
    }

    public android.database.Cursor r() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, uiType, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact  where ");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("type & 8=0");
        l75.e0 e0Var = com.p314xaae8f345.mm.p670x38b72420.s.G2;
        sb7.append(c01.e2.b(dm.i4.f66875xa013b0d5, "@chatroom", false, new java.lang.String[0]));
        sb6.append(sb7.toString());
        return this.f276604d.B(sb6.toString(), null);
    }

    public int r0(java.lang.String str, java.lang.String str2) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr[0] = str == null ? "" : str;
        objArr[1] = java.lang.Integer.valueOf((str2 != null ? str2 : "").length());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactStorage", "updateSendMsgTicketByUser %s %s", objArr);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 v17 = v(str);
        if (v17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(v17.a1(), str2)) {
            return 0;
        }
        v17.V1(str2);
        return p0(str, v17);
    }

    public byte[] s(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactStorage", "getCmdbuf failed user is null");
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.a4 a4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.a4();
        android.database.Cursor D = this.f276604d.D("ContactCmdBuf", null, "username=?", new java.lang.String[]{str}, null, null, null, 2);
        if (D.moveToFirst()) {
            a4Var.mo9015xbf5d97fd(D);
        }
        D.close();
        byte[] bArr = a4Var.f66483xf4f1e9de;
        if (bArr != null) {
            int length = bArr.length;
        }
        return a4Var.f66483xf4f1e9de;
    }

    public void s0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17) {
        if (z3Var == null || z3Var.d1() == null) {
            return;
        }
        if (z3Var.m124896xfb85f7b0() != 0 || z17) {
            ((lt0.f) this.f276607g).j(z3Var.d1(), z3Var);
            ((lt0.f) this.f276608h).j(z3Var.d1(), java.lang.Integer.valueOf(z3Var.m124896xfb85f7b0()));
        }
    }

    public long u(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = n(str, true);
        if (n17 != null) {
            if (n17.E2 > 0) {
                return (int) r0;
            }
        }
        return -1L;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 v(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(str)) {
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        android.database.Cursor f17 = this.f276604d.f("select  *,rowid  from rcontact where username=" + d95.b0.O(str) + " or encryptUsername=" + d95.b0.O(str), null, 2);
        if (f17.moveToFirst()) {
            z3Var.mo9015xbf5d97fd(f17);
            f17.close();
            z3Var.Z4();
            i(z3Var);
            s0(z3Var, false);
        } else {
            f17.close();
        }
        return z3Var;
    }

    public int w(java.lang.String str, java.lang.String str2, java.util.List list) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str3 = "select count(username) from rcontact" + I(str, str2, list) + T(str2);
        android.database.Cursor f17 = this.f276604d.f(str3, null, 2);
        int i17 = 0;
        if (f17 != null && f17.moveToFirst()) {
            i17 = f17.getInt(0);
            f17.close();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactStorage", "getCountByFilterType, sql:%s, count:%d, time:%d", str3, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        return i17;
    }

    public android.database.Cursor x(java.lang.String str, java.lang.String str2, java.util.List list) {
        return this.f276604d.B("select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, uiType, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact " + I(str, str2, list) + " order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ", null);
    }

    public android.database.Cursor y(java.lang.String str, java.lang.String str2, java.util.List list, java.util.List list2, boolean z17, boolean z18) {
        java.lang.String str3 = "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, uiType, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact " + I(str, str2, list) + N(list2) + " order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ";
        l75.k0 k0Var = this.f276604d;
        if (!z17) {
            return k0Var.B(str3, null);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, uiType, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact ");
        sb6.append(F(list, z18));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = com.p314xaae8f345.mm.p2621x8fb0427b.z3.M2;
        sb6.append(" order by case when verifyFlag & 8 != 0 then 0 else 1 end , showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ");
        return new android.database.MergeCursor(new android.database.Cursor[]{k0Var.B(sb6.toString(), null), k0Var.B(str3, null)});
    }

    public android.database.Cursor z(java.util.List list, boolean z17) {
        java.lang.String str = "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, uiType, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact  where " + P(list);
        if (z17) {
            str = str + "  order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ";
        }
        return this.f276604d.B(str, null);
    }
}

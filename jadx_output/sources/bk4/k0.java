package bk4;

/* loaded from: classes9.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final bk4.k0 f21502a = new bk4.k0();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f21503b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f21504c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashSet f21505d;

    static {
        com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479673ca);
        f21503b = jz5.h.b(bk4.j0.f21491d);
        f21504c = jz5.h.b(bk4.i0.f21486d);
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add("weixin");
        hashSet.addAll(c01.e2.i());
        hashSet.addAll(c01.e2.h());
        f21505d = hashSet;
    }

    public static final void a(bk4.k0 k0Var) {
        jz5.f0 f0Var;
        k0Var.getClass();
        long c17 = c01.id.c();
        jz5.g gVar = f21503b;
        java.lang.Object value = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        long j17 = 0;
        long q17 = ((com.tencent.mm.sdk.platformtools.o4) value).q("KEY_TEXT_STATUS_DND_LAST_DELETE_TIME", 0L);
        if (c17 - q17 >= 259200000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusDNDUtils", "checkDeleteRecord: currentTime:" + c17 + " lastDeleteTime:" + q17);
            long c18 = c01.id.c();
            java.lang.String[] b17 = k0Var.d().b();
            if (b17 != null) {
                int length = b17.length;
                int i17 = 0;
                while (i17 < length) {
                    java.lang.String str = b17[i17];
                    bk4.k0 k0Var2 = f21502a;
                    long q18 = k0Var2.d().q(str, j17);
                    if (c18 - q18 >= 259200000) {
                        k0Var2.d().remove(str);
                        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusDNDUtils", "deleteRecord: key:" + str + " saveTime:" + q18);
                    }
                    i17++;
                    j17 = 0;
                }
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusDNDUtils", "deleteRecord: keys is empty ");
            }
            java.lang.Object value2 = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            ((com.tencent.mm.sdk.platformtools.o4) value2).B("KEY_TEXT_STATUS_DND_LAST_DELETE_TIME", c17);
        }
    }

    public static final void b(bk4.k0 k0Var, xg3.l0 l0Var) {
        java.lang.Iterable iterable;
        java.lang.String str;
        k0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusDNDUtils", "handleMsgNotifyForTextStatusDoNotDisturbMode() called with: notifyInfo = [" + l0Var + ']');
        if (l0Var != null && kotlin.jvm.internal.o.b(l0Var.f454411b, "insert")) {
            java.util.ArrayList arrayList = l0Var.f454412c;
            if (com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
                return;
            }
            java.lang.String str2 = l0Var.f454410a;
            kotlin.jvm.internal.o.d(arrayList);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it.next();
                bk4.k0 k0Var2 = f21502a;
                if (f9Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(str2) && f9Var.getType() != 10000 && f9Var.getType() != 50) {
                    java.lang.String y07 = f9Var.y0();
                    java.lang.String T0 = f9Var.T0();
                    boolean b17 = y07 == null ? false : kotlin.jvm.internal.o.b(y07, en1.a.a());
                    qj4.s sVar = qj4.s.f363958a;
                    java.util.List list = null;
                    if (!b17) {
                        java.lang.String a17 = en1.a.a();
                        kotlin.jvm.internal.o.f(a17, "username(...)");
                        ai4.m0 m0Var = ai4.m0.f5173a;
                        mj4.h M = m0Var.M(a17);
                        if (kotlin.jvm.internal.o.b(M != null ? ((mj4.k) M).h() : null, "1065")) {
                            java.lang.String c17 = k0Var2.c(en1.a.a());
                            if (!com.tencent.mm.storage.z3.R4(str2)) {
                                if (!kz5.n0.O(f21505d, str2)) {
                                    c01.i2 i2Var = c01.i2.f37244a;
                                    if (!com.tencent.mm.storage.z3.y4(i2Var.a()) && !c01.e2.U(i2Var.a()) && !com.tencent.mm.storage.z3.R3(i2Var.a()) && !c01.e2.G(i2Var.a())) {
                                        if (!(str2 != null && r26.i0.y(str2, "gh_", false))) {
                                            if (str2 != null && r26.n0.B(str2, "@", false)) {
                                                r4 = true;
                                            }
                                            if (!r4) {
                                                mj4.h E = m0Var.E();
                                                k0Var2.f(E != null ? ((mj4.k) E).l() : null, str2, str2, c17);
                                                mj4.h M2 = m0Var.M(T0);
                                                sVar.q(1, 1, str2, T0, M2 != null ? ((mj4.k) M2).l() : null, 0);
                                            }
                                        }
                                    }
                                }
                                com.tencent.mars.xlog.Log.w("MicroMsg.TextStatus.TextStatusDNDUtils", "handleDNDTips: blockFromUserName talker:" + str2);
                            } else if (f9Var.r2() || f9Var.s2(en1.a.a())) {
                                int t17 = c01.w9.t(f9Var.j());
                                if (t17 != -1) {
                                    java.lang.String j17 = f9Var.j();
                                    if (j17 != null) {
                                        java.lang.String substring = j17.substring(0, t17);
                                        kotlin.jvm.internal.o.f(substring, "substring(...)");
                                        int length = substring.length() - 1;
                                        int i17 = 0;
                                        boolean z17 = false;
                                        while (i17 <= length) {
                                            boolean z18 = kotlin.jvm.internal.o.i(substring.charAt(!z17 ? i17 : length), 32) <= 0;
                                            if (z17) {
                                                if (!z18) {
                                                    break;
                                                } else {
                                                    length--;
                                                }
                                            } else if (z18) {
                                                i17++;
                                            } else {
                                                z17 = true;
                                            }
                                        }
                                        str = substring.subSequence(i17, length + 1).toString();
                                    } else {
                                        str = null;
                                    }
                                    if (str == null || str.length() == 0) {
                                        com.tencent.mars.xlog.Log.w("MicroMsg.TextStatus.TextStatusDNDUtils", "handleDNDTips: user isNullOrEmpty ." + str);
                                    } else {
                                        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                                        if (n17 == null || !n17.r2()) {
                                            com.tencent.mars.xlog.Log.w("MicroMsg.TextStatus.TextStatusDNDUtils", "isNeedToBeHandled: is not contact ,do not show tips . contact:" + n17);
                                        } else {
                                            ai4.m0 m0Var2 = ai4.m0.f5173a;
                                            mj4.h E2 = m0Var2.E();
                                            k0Var2.f(E2 != null ? ((mj4.k) E2).l() : null, str2, str, c17);
                                            mj4.h M3 = m0Var2.M(T0);
                                            sVar.q(1, 2, str2, T0, M3 != null ? ((mj4.k) M3).l() : null, 2);
                                        }
                                    }
                                } else {
                                    com.tencent.mars.xlog.Log.w("MicroMsg.TextStatus.TextStatusDNDUtils", "handleDNDTips: parseGroupChatMsg fail");
                                }
                            }
                        }
                    } else if (com.tencent.mm.storage.z3.R4(str2)) {
                        java.lang.String str3 = f9Var.G;
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                            kotlin.jvm.internal.o.d(str3);
                            if (r26.n0.B(str3, "notify@all", false)) {
                                ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
                                java.util.List m17 = c01.v1.m(str2);
                                if (m17 != null) {
                                    k0Var2.e(m17, str2);
                                }
                            } else {
                                java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str3, "msgsource", null);
                                java.lang.String str4 = d17 != null ? (java.lang.String) d17.get(".msgsource.atuserlist") : null;
                                if (str4 != null) {
                                    java.util.List g17 = new r26.t(",").g(str4, 0);
                                    if (!g17.isEmpty()) {
                                        java.util.ListIterator listIterator = g17.listIterator(g17.size());
                                        while (listIterator.hasPrevious()) {
                                            if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                                                iterable = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                                                break;
                                            }
                                        }
                                    }
                                    iterable = kz5.p0.f313996d;
                                    list = kz5.n0.S0(iterable);
                                }
                                k0Var2.e(list, str2);
                            }
                        }
                    } else {
                        if (!(T0 != null ? kotlin.jvm.internal.o.b(T0, en1.a.a()) : false)) {
                            kotlin.jvm.internal.o.d(T0);
                            ai4.m0 m0Var3 = ai4.m0.f5173a;
                            mj4.h M4 = m0Var3.M(T0);
                            if (kotlin.jvm.internal.o.b(M4 != null ? ((mj4.k) M4).h() : null, "1065")) {
                                java.lang.String c18 = k0Var2.c(T0);
                                mj4.h M5 = m0Var3.M(T0);
                                k0Var2.f(M5 != null ? ((mj4.k) M5).l() : null, str2, str2, c18);
                                mj4.h M6 = m0Var3.M(T0);
                                sVar.q(1, 1, str2, T0, M6 != null ? ((mj4.k) M6).l() : null, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    public final java.lang.String c(java.lang.String str) {
        if (str != null) {
            mj4.h M = ai4.m0.f5173a.M(str);
            if (kotlin.jvm.internal.o.b(M != null ? ((mj4.k) M).h() : null, "1065")) {
                java.lang.String str2 = "<textstatus_iconId=\"1065\"/>" + bk4.i.a().n(str);
                if (kotlin.jvm.internal.o.b(str, en1.a.a())) {
                    return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jwf, str2);
                }
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jwl, c01.a2.e(str), str2);
            }
        }
        return null;
    }

    public final com.tencent.mm.sdk.platformtools.o4 d() {
        java.lang.Object value = ((jz5.n) f21504c).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.sdk.platformtools.o4) value;
    }

    public final void e(java.util.List list, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleChatRoomShowTips() called with: usernames = ");
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        sb6.append(", talker = ");
        sb6.append(str);
        java.lang.String str7 = "MicroMsg.TextStatus.TextStatusDNDUtils";
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusDNDUtils", sb6.toString());
        java.lang.String a17 = en1.a.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str8 = "";
        if (list != null) {
            java.util.Iterator it = list.iterator();
            str3 = "";
            str4 = str3;
            str5 = str4;
            while (it.hasNext()) {
                java.lang.String str9 = (java.lang.String) it.next();
                if (str9 != null && !kotlin.jvm.internal.o.b(str9, en1.a.a())) {
                    mj4.h M = ai4.m0.f5173a.M(str9);
                    if (kotlin.jvm.internal.o.b(M != null ? ((mj4.k) M).h() : null, "1065")) {
                        mj4.h M2 = ai4.m0.f5173a.M(str9);
                        java.lang.String l17 = M2 != null ? ((mj4.k) M2).l() : null;
                        java.lang.String str10 = str + '_' + l17 + '_' + a17;
                        bk4.k0 k0Var = f21502a;
                        if (!k0Var.d().f(str10)) {
                            arrayList.add(l17);
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                            sb7.append(str8);
                            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                            sb7.append(c01.a2.f(str9, str));
                            sb7.append((char) 12289);
                            str8 = sb7.toString();
                            java.lang.String str11 = str4 + str9 + ':';
                            java.lang.String str12 = str5 + l17 + ':';
                            com.tencent.mm.sdk.platformtools.o4 d17 = k0Var.d();
                            str6 = str7;
                            d17.putLong(str10, c01.id.c());
                            if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                                str3 = bk4.i.a().n(str9);
                            }
                            str5 = str12;
                            str4 = str11;
                            str7 = str6;
                        }
                    }
                }
                str6 = str7;
                str7 = str6;
            }
            str2 = str7;
        } else {
            str2 = "MicroMsg.TextStatus.TextStatusDNDUtils";
            str3 = "";
            str4 = str3;
            str5 = str4;
        }
        com.tencent.mars.xlog.Log.i(str2, "handleChatRoomShowTips: statusIdList:" + arrayList.size());
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str8)) {
            java.lang.String substring = str8.substring(0, str8.length() - 1);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jwl, substring, "<textstatus_iconId=\"1065\"/>" + str3);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                g(str, string);
                qj4.s sVar = qj4.s.f363958a;
                java.lang.String substring2 = str4.substring(0, str4.length() - 1);
                kotlin.jvm.internal.o.f(substring2, "substring(...)");
                java.lang.String substring3 = str5.substring(0, str5.length() - 1);
                kotlin.jvm.internal.o.f(substring3, "substring(...)");
                sVar.q(1, 2, str, substring2, substring3, 1);
            }
        }
    }

    public final void f(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusDNDUtils", "handleInsertTips() called with: textStatusId = " + str + ", talker = " + str2 + ",fromUserName:" + str3 + " content = " + str4 + " switch:true");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str2);
        sb6.append('_');
        sb6.append(str);
        sb6.append('_');
        sb6.append(str3);
        java.lang.String sb7 = sb6.toString();
        if (d().f(sb7)) {
            return;
        }
        d().putLong(sb7, c01.id.c());
        g(str2, str4);
    }

    public final void g(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            return;
        }
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        f9Var.j1(2);
        f9Var.u1(str);
        f9Var.r1(4);
        f9Var.f1(2097152);
        f9Var.d1(str2);
        f9Var.e1(c01.w9.m(str, c01.id.c() / 1000));
        f9Var.setType(10000);
        c01.w9.x(f9Var);
    }
}

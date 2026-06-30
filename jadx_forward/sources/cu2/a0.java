package cu2;

/* loaded from: classes10.dex */
public final class a0 {
    public a0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static /* synthetic */ java.util.List c(cu2.a0 a0Var, long j17, int i17, int[] iArr, int i18, java.lang.String str, int i19, int i27, java.lang.Object obj) {
        return a0Var.b(j17, i17, (i27 & 4) != 0 ? new int[0] : iArr, i18, str, (i27 & 32) != 0 ? 0 : i19);
    }

    public final boolean a(dm.pd mention, int i17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mention, "mention");
        l75.n0 fk6 = ((c61.l7) i95.n0.c(c61.l7.class)).fk(g(i17));
        if (g(i17) == 1) {
            int i18 = dm.x4.f322559a3;
            str = "WxIdentityMsg";
        } else {
            int i19 = dm.x4.f322559a3;
            str = "FinderIdentityMsg";
        }
        java.lang.String str2 = "DELETE FROM " + str + " WHERE id=" + mention.f66095xc8a07680;
        boolean m145253xb158737d = fk6.m145253xb158737d(str, str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMentionLogic", "updateMentionExtFlag sql:" + str2 + ", flag:" + mention.f66082x26b1b2e8 + " succ:" + m145253xb158737d);
        return m145253xb158737d;
    }

    public final java.util.List b(long j17, int i17, int[] iArr, int i18, java.lang.String finderUsername, int i19) {
        java.lang.String str;
        java.lang.String str2;
        java.util.LinkedList linkedList;
        int[] types = iArr;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        m92.b j37 = g92.a.j3(g92.b.f351302e, finderUsername, false, 2, null);
        int m75939xb282bd08 = j37 != null ? j37.u0().m75939xb282bd08(34) : 0;
        l75.n0 fk6 = ((c61.l7) i95.n0.c(c61.l7.class)).fk(g(i18));
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_USER_AUTO_INCREMENT_ID_INT_SYNC, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) t70Var.f2().r()).intValue() != -1) {
            m75939xb282bd08 = ((java.lang.Number) t70Var.f2().r()).intValue();
        }
        if (m75939xb282bd08 == 1 || i19 == 1) {
            str = " AND businessType = " + i19;
        } else {
            str = "";
        }
        if (types.length == 0) {
            str2 = e(i18) + " WHERE " + f(i18, finderUsername) + "id < " + j17 + "  AND flag = 0  AND userVersion = " + r17 + str + " ORDER BY createTime DESC,id DESC LIMIT " + i17;
        } else {
            int length = types.length;
            java.lang.String str3 = "(";
            int i27 = 0;
            int i28 = 0;
            while (i27 < length) {
                int i29 = types[i27];
                int i37 = i28 + 1;
                if (i28 > 0) {
                    str3 = str3 + ',';
                }
                str3 = str3 + i29;
                i27++;
                types = iArr;
                i28 = i37;
            }
            str2 = e(i18) + " WHERE " + f(i18, finderUsername) + " id < " + j17 + "  AND flag = 0  AND type IN " + (str3 + ')') + " AND userVersion = " + r17 + str + " ORDER BY createTime DESC,id DESC LIMIT " + i17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMentionLogic", "get mention sql " + str2);
        android.database.Cursor m145256x1d3f4980 = fk6.m145256x1d3f4980(str2, new java.lang.String[0]);
        try {
            if (m145256x1d3f4980 != null) {
                linkedList = new java.util.LinkedList();
                while (m145256x1d3f4980.moveToNext()) {
                    try {
                        l75.f0 f0Var = (l75.f0) dm.pd.class.newInstance();
                        f0Var.mo9015xbf5d97fd(m145256x1d3f4980);
                        linkedList.add(f0Var);
                    } finally {
                    }
                }
                vz5.b.a(m145256x1d3f4980, null);
            } else {
                linkedList = new java.util.LinkedList();
            }
            vz5.b.a(m145256x1d3f4980, null);
            return linkedList;
        } finally {
        }
    }

    public final dm.pd d(long j17, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMentionLogic", "getMention by id " + j17 + " mentionCreateTime " + i17);
        android.database.Cursor m145256x1d3f4980 = ((c61.l7) i95.n0.c(c61.l7.class)).fk(g(i18)).m145256x1d3f4980(e(i18) + " WHERE id = " + j17 + " AND createTime = " + i17, new java.lang.String[0]);
        if (m145256x1d3f4980 != null) {
            try {
                if (m145256x1d3f4980.moveToNext()) {
                    dm.pd pdVar = new dm.pd();
                    pdVar.mo9015xbf5d97fd(m145256x1d3f4980);
                    vz5.b.a(m145256x1d3f4980, null);
                    return pdVar;
                }
                vz5.b.a(m145256x1d3f4980, null);
            } finally {
            }
        }
        return null;
    }

    public final java.lang.String e(int i17) {
        java.lang.String str;
        if (g(i17) == 1) {
            int i18 = dm.x4.f322559a3;
            str = "WxIdentityMsg";
        } else {
            int i19 = dm.x4.f322559a3;
            str = "FinderIdentityMsg";
        }
        return "SELECT rowid, * FROM ".concat(str);
    }

    public final java.lang.String f(int i17, java.lang.String str) {
        if (i17 != 1) {
            return " ";
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, g92.b.f351302e.T0()) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return " finderUserName='" + str + "' AND ";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return " ";
        }
        return " (finderUserName='" + str + "' OR finderUserName IS NULL OR finderUserName='') AND ";
    }

    public final int g(int i17) {
        if (i17 != 1) {
            return i17 != 2 ? 0 : 1;
        }
        return 2;
    }

    public final int h(java.util.List mentionList, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mentionList, "mentionList");
        java.util.Iterator it = mentionList.iterator();
        int i18 = 0;
        while (it.hasNext()) {
            dm.pd mention = (dm.pd) it.next();
            cu2.a0 a0Var = cu2.b0.f303904a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mention, "mention");
            l75.n0 fk6 = ((c61.l7) i95.n0.c(c61.l7.class)).fk(a0Var.g(i17));
            dm.pd d17 = a0Var.d(mention.f66095xc8a07680, mention.f66080xac3be4e, i17);
            if (d17 != null) {
                fk6.mo70496xb06685ab(d17.f72763xa3c65b86);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMentionLogic", "insertMention: delete exist data, id=" + mention.f66095xc8a07680 + ", createTime=" + mention.f66080xac3be4e);
            }
            boolean mo880xb970c2b9 = fk6.mo880xb970c2b9(mention);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("replace mention success ");
            sb6.append(mention.f66095xc8a07680);
            sb6.append(", ");
            sb6.append(d17 == null ? "null" : java.lang.Long.valueOf(d17.f72763xa3c65b86));
            sb6.append(", ");
            sb6.append(mo880xb970c2b9);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMentionLogic", sb6.toString());
            if (mo880xb970c2b9) {
                i18++;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMentionLogic", "insert mention insertSucc=" + i18 + ", size=" + mentionList.size() + ", scene=" + i17);
        return i18;
    }

    public final void i(java.lang.String clientMsgId, int i17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clientMsgId, "clientMsgId");
        l75.n0 fk6 = ((c61.l7) i95.n0.c(c61.l7.class)).fk(g(i17));
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_USER_AUTO_INCREMENT_ID_INT_SYNC, 0);
        if (g(i17) == 1) {
            int i18 = dm.x4.f322559a3;
            str = "WxIdentityMsg";
        } else {
            int i19 = dm.x4.f322559a3;
            str = "FinderIdentityMsg";
        }
        java.lang.String str2 = "DELETE FROM " + str + "  WHERE type=10  AND clientMsgId='" + clientMsgId + "'  AND userVersion=" + r17 + ' ';
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT * FROM ");
        sb6.append(str);
        sb6.append("  WHERE type=10  AND clientMsgId='");
        sb6.append(clientMsgId);
        sb6.append("'  AND userVersion=");
        sb6.append(r17);
        sb6.append(' ');
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMentionLogic", "removePrivateMention, succ " + fk6.m145253xb158737d(str, str2) + ",  sql " + str2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:36:0x0048. Please report as an issue. */
    public final so2.i j(dm.pd mention) {
        so2.i r3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mention, "mention");
        int i17 = mention.f66129x2262335f;
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 != 3) {
                    if (i17 == 4) {
                        r3Var = new so2.c4(mention);
                    } else if (i17 == 5) {
                        r3Var = new so2.a4(mention);
                    } else if (i17 == 7) {
                        r3Var = new so2.w3(mention);
                    } else if (i17 == 8) {
                        r3Var = new so2.v3(mention);
                    } else if (i17 == 10) {
                        r3Var = new so2.s3(mention);
                    } else if (i17 == 11) {
                        r3Var = new so2.t3(mention);
                    } else if (i17 == 15) {
                        r3Var = new so2.p3(mention);
                    } else if (i17 == 25) {
                        r3Var = new so2.z3(mention);
                    } else if (i17 == 33) {
                        r3Var = new so2.x3(mention);
                    } else if (i17 != 43) {
                        if (i17 != 17) {
                            if (i17 != 18) {
                                if (i17 != 35 && i17 != 36) {
                                    switch (i17) {
                                        case 28:
                                            r3Var = new so2.f4(mention);
                                            break;
                                        case 29:
                                            r3Var = new so2.e4(mention);
                                            break;
                                        case 30:
                                            r3Var = new so2.g4(mention);
                                            break;
                                        default:
                                            switch (i17) {
                                                case 39:
                                                case 40:
                                                    r3Var = new so2.n3(mention);
                                                    break;
                                                case 41:
                                                    break;
                                                default:
                                                    return null;
                                            }
                                    }
                                }
                            }
                            r3Var = new so2.q3(mention);
                        } else {
                            r3Var = new so2.u3(mention);
                        }
                    }
                }
                r3Var = new so2.o3(mention);
            }
            r3Var = new so2.y3(mention);
        } else {
            r3Var = new so2.r3(mention);
        }
        return r3Var;
    }

    public final dm.pd k(int i17, r45.pg2 mention, java.lang.String finderUsername) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mention, "mention");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        dm.pd pdVar = new dm.pd();
        pdVar.f66093xa3f9e12a = mention.m75945x2fec8307(0);
        if (mention.m75939xb282bd08(23) != 0) {
            r45.rg2 rg2Var = new r45.rg2();
            rg2Var.set(1, java.lang.Integer.valueOf(mention.m75939xb282bd08(23)));
            rg2Var.set(0, mention.m75941xfb821914(22));
            pdVar.f66070x5f9d295d = rg2Var;
        } else {
            pdVar.f66070x5f9d295d = new r45.rg2();
        }
        if (i17 != 1) {
            finderUsername = "";
        }
        pdVar.f66086x552bcd21 = finderUsername;
        pdVar.f66106x21f9b213 = mention.m75945x2fec8307(1);
        pdVar.f66129x2262335f = mention.m75939xb282bd08(2);
        pdVar.f66079xad49e234 = mention.m75945x2fec8307(3);
        pdVar.f66080xac3be4e = mention.m75939xb282bd08(4);
        pdVar.f66128x7b284d5e = mention.m75945x2fec8307(5);
        pdVar.f66095xc8a07680 = mention.m75942xfb822ef2(6);
        pdVar.f66108x2327e25f = mention.m75942xfb822ef2(7);
        pdVar.f66109x2812d6a6 = mention.m75945x2fec8307(17);
        pdVar.f66076x418206d5 = mention.m75942xfb822ef2(8);
        pdVar.f66087x225ba391 = mention.m75939xb282bd08(9);
        pdVar.f66112x830ccb = mention.m75945x2fec8307(11);
        pdVar.f66082x26b1b2e8 = mention.m75939xb282bd08(10);
        pdVar.f66107x7dac62e = (r45.rk2) mention.m75936x14adae67(12);
        pdVar.f66103x1a330c39 = mention.m75939xb282bd08(13);
        pdVar.f66081x4f4dc37 = mention.m75945x2fec8307(14);
        pdVar.f66117x24d5d7c2 = mention.m75945x2fec8307(16);
        pdVar.f66116x38e2f75a = mention.m75945x2fec8307(15);
        pdVar.f66131xdec927b = mention.m75945x2fec8307(18);
        r45.tg2 tg2Var = (r45.tg2) mention.m75936x14adae67(19);
        pdVar.f66078xad49d1db = tg2Var != null ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) tg2Var.m75936x14adae67(0) : null;
        r45.tg2 tg2Var2 = (r45.tg2) mention.m75936x14adae67(20);
        pdVar.f66118x59e01cfb = tg2Var2 != null ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) tg2Var2.m75936x14adae67(0) : null;
        pdVar.f66130x6eb656c8 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_USER_AUTO_INCREMENT_ID_INT_SYNC, 0);
        pdVar.f66088x33459fc2 = mention.m75939xb282bd08(24);
        pdVar.f66073x6066efac = mention.m75945x2fec8307(25);
        pdVar.f66090x2fc02651 = mention.m75942xfb822ef2(26);
        pdVar.f66110xf8be237e = mention.m75939xb282bd08(27);
        pdVar.f66113xacc57927 = mention.m75942xfb822ef2(28);
        pdVar.f66114x64cc3cde = mention.m75945x2fec8307(29);
        r45.t64 t64Var = (r45.t64) mention.m75936x14adae67(30);
        pdVar.f66100x4185df7 = t64Var != null ? t64Var.m75942xfb822ef2(1) : 0L;
        r45.tg2 tg2Var3 = (r45.tg2) mention.m75936x14adae67(19);
        pdVar.f66084xf96c1fe0 = tg2Var3 != null ? tg2Var3.m75942xfb822ef2(2) : 0L;
        pdVar.f66071x3a790d90 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) mention.m75936x14adae67(31);
        r45.t64 t64Var2 = (r45.t64) mention.m75936x14adae67(30);
        pdVar.f66102x5f7e1916 = t64Var2 != null ? t64Var2.m75939xb282bd08(0) : 0;
        pdVar.f66077x5edb197a = (r45.oy0) mention.m75936x14adae67(32);
        r45.tg2 tg2Var4 = (r45.tg2) mention.m75936x14adae67(19);
        pdVar.f66115xfc824e7b = tg2Var4 != null ? tg2Var4.m75939xb282bd08(3) : 0;
        pdVar.f66083x26b3182a = (r45.vg2) mention.m75936x14adae67(33);
        pdVar.f66124x65f321b = mention.m75942xfb822ef2(34);
        pdVar.f66089x404ea322 = mention.m75939xb282bd08(35);
        pdVar.f66101x5f78ee8a = (r45.t64) mention.m75936x14adae67(30);
        pdVar.f66127xca12e5b3 = (r45.xg2) mention.m75936x14adae67(38);
        pdVar.f66072xe412923f = mention.m75939xb282bd08(39);
        pdVar.f66085x5cf940e9 = (r45.ub1) mention.m75936x14adae67(40);
        pdVar.f66122x76e81a5a = mention.m75939xb282bd08(44);
        pdVar.f66105xcd878615 = mention.m75939xb282bd08(46);
        pdVar.f66091x7b4a207a = (r45.r31) mention.m75936x14adae67(41);
        pdVar.f66111xe4b06ec6 = mention.m75939xb282bd08(47);
        pdVar.f66096x722c2 = mention.m75939xb282bd08(48);
        pdVar.f66104x89e93fac = mention.m75945x2fec8307(49);
        pdVar.f66092x4956d0f8 = mention.m75939xb282bd08(50);
        pdVar.f66125x61cb454c = mention.m75945x2fec8307(51);
        pdVar.f66120x64708e93 = mention.m75942xfb822ef2(45);
        pdVar.f66126xdf83d1d8 = mention.m75939xb282bd08(52);
        pdVar.f66094x434c90c3 = (r45.fb1) mention.m75936x14adae67(54);
        pdVar.f66123xabd3e0e0 = mention;
        pdVar.f66097xb24da186 = mention.m75939xb282bd08(56);
        java.lang.String m75945x2fec8307 = mention.m75945x2fec8307(57);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        pdVar.f66121x27aa51ce = m75945x2fec8307;
        java.lang.String m75945x2fec83072 = mention.m75945x2fec8307(58);
        pdVar.f66069xb0606dbe = m75945x2fec83072 != null ? m75945x2fec83072 : "";
        pdVar.f66075xb4d0aad9 = mention.m75939xb282bd08(59);
        pdVar.f66074xb4cb804d = (r45.e60) mention.m75936x14adae67(60);
        pdVar.f66099xe8b3a2d = mention.m75939xb282bd08(61);
        pdVar.f66098xe860fa1 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) mention.m75936x14adae67(62);
        pdVar.f66119x1307b415 = mention.m75942xfb822ef2(63);
        return pdVar;
    }

    public final boolean l(dm.pd mention, int i17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mention, "mention");
        l75.n0 fk6 = ((c61.l7) i95.n0.c(c61.l7.class)).fk(g(i17));
        if (g(i17) == 1) {
            int i18 = dm.x4.f322559a3;
            str = "WxIdentityMsg";
        } else {
            int i19 = dm.x4.f322559a3;
            str = "FinderIdentityMsg";
        }
        java.lang.String str2 = "UPDATE " + str + " SET extFlag=" + mention.f66082x26b1b2e8 + " WHERE id=" + mention.f66095xc8a07680;
        boolean m145253xb158737d = fk6.m145253xb158737d(str, str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMentionLogic", "updateMentionExtFlag sql:" + str2 + ", success:" + m145253xb158737d + " flag:" + mention.f66082x26b1b2e8);
        return m145253xb158737d;
    }
}

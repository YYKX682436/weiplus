package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f246278a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f246279b;

    /* renamed from: c, reason: collision with root package name */
    public static java.util.LinkedHashMap f246280c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Comparator f246281d;

    static {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb6.append(gm0.j1.u().h());
        sb6.append("sns_recvd_ad");
        f246279b = sb6.toString();
        f246281d = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.v();
    }

    public static void A(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 c17932x22276883, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateStatExtInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70311x485d7 = c17932x22276883.m70311x485d7();
        r45.td6 td6Var = new r45.td6();
        r45.ud6 ud6Var = new r45.ud6();
        td6Var.f467862d = ud6Var;
        ud6Var.f468802f = c17902x72cc1771.f38104xce64ddf1;
        ud6Var.f468801e = m70311x485d7.Id;
        ud6Var.f468803g = c17932x22276883.m70310x2fa78b11();
        r45.ud6 ud6Var2 = td6Var.f467862d;
        ud6Var2.f468804h = com.p314xaae8f345.mm.p959x883644fd.k0.g(ud6Var2);
        int i17 = m70311x485d7.f39014x86965dde.f451370e;
        if (i17 == 1) {
            td6Var.f467862d.f468800d = 1;
        } else if (i17 == 15) {
            td6Var.f467862d.f468800d = 2;
        } else {
            td6Var.f467862d.f468800d = 0;
        }
        td6Var.f467862d.f468805i = c17932x22276883.m70304x74652662();
        try {
            java.lang.String replace = android.util.Base64.encodeToString(td6Var.mo14344x5f01b1f6(), 0).replace("\n", "");
            r45.ud6 ud6Var3 = td6Var.f467862d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "replace newly add snsId:%s, statExtStr:%s(id=%s,uxInfo=%s)", m70311x485d7.Id, replace, ud6Var3.f468801e, ud6Var3.f468802f);
            m70311x485d7.f39040xbd345fc4 = replace;
            c17932x22276883.m70330xfabce6e3(m70311x485d7);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AdSnsInfoStorageLogic", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateStatExtInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
    }

    public static void a(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addRecvdAd", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (j17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addRecvdAd", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        if (f246280c == null) {
            l();
        }
        f246280c.put(java.lang.Long.valueOf(j17), 0);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            try {
                java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(f246280c);
                objectOutputStream.flush();
                o35.a.k(f246279b, byteArrayOutputStream.toByteArray());
            } catch (java.io.IOException e17) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdSnsInfoStorageLogic", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
            try {
                byteArrayOutputStream.close();
            } catch (java.io.IOException unused) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addRecvdAd", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            }
        } catch (java.lang.Throwable th6) {
            try {
                byteArrayOutputStream.close();
            } catch (java.io.IOException unused2) {
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addRecvdAd", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            throw th6;
        }
    }

    public static boolean b(long j17, r45.l76 l76Var, int i17, int i18, int i19, boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7;
        int i27;
        java.lang.String str3;
        int i28;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        int size;
        r45.k76 k76Var;
        java.lang.String str11;
        int i29;
        java.lang.String str12 = "checkComment";
        java.lang.String str13 = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkComment", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (l76Var != null && (i29 = l76Var.f460738f.f459995h) != 7 && i29 != 8 && i29 != 16) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkComment", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return false;
        }
        java.lang.String r17 = c01.z1.r();
        if (l76Var != null && (k76Var = l76Var.f460739g) != null && (str11 = k76Var.f459991d) != null && str11.equals(r17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkComment", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 y07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().y0(j17);
        if (y07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "AdSnsInfo of %s is not exist!", java.lang.Long.valueOf(j17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkComment", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return false;
        }
        try {
            c19806x4c372b7 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7().mo11468x92b714fd(y07.f67595x4c58c87d);
            c19806x4c372b7.Id = j17;
            i27 = y07.f67601x912e119f;
            r45.k76 k76Var2 = l76Var.f460738f;
            int i37 = k76Var2.f459995h;
            str3 = r17;
            java.lang.String str14 = "checkComment";
            try {
                if (i37 == 7) {
                    if (i18 > 0) {
                        try {
                            if (i27 + i18 < k76Var2.f459997m) {
                                if (z17) {
                                    try {
                                        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().b1(y07.m70309x7525eefd()) != null) {
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70299x10413e67 = y07.m70299x10413e67();
                                            if (m70299x10413e67 != null) {
                                                p94.f0 f0Var = (p94.f0) i95.n0.c(p94.f0.class);
                                                int m70310x2fa78b11 = y07.m70310x2fa78b11();
                                                java.lang.Object[] objArr = new java.lang.Object[7];
                                                objArr[0] = java.lang.Long.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.n(y07.m70309x7525eefd()));
                                                objArr[1] = m70299x10413e67.f38105xcf532ea0;
                                                objArr[2] = 2;
                                                objArr[3] = 1;
                                                java.util.LinkedList<r45.e86> linkedList = c19806x4c372b7.f38984xe83113e0;
                                                if (linkedList != null) {
                                                    try {
                                                        size = linkedList.size();
                                                    } catch (java.lang.Exception e17) {
                                                        e = e17;
                                                        str = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
                                                        str2 = str14;
                                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AdSnsInfoStorageLogic", e, "", new java.lang.Object[0]);
                                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, str);
                                                        return true;
                                                    }
                                                } else {
                                                    size = 0;
                                                }
                                                objArr[4] = java.lang.Integer.valueOf(size);
                                                java.util.LinkedList<r45.e86> linkedList2 = c19806x4c372b7.f38963x20c46e68;
                                                objArr[5] = java.lang.Integer.valueOf(linkedList2 != null ? linkedList2.size() : 0);
                                                str10 = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
                                                objArr[6] = java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() / 1000));
                                                ((p34.p) f0Var).Bi(13182, m70310x2fa78b11, objArr);
                                            } else {
                                                str10 = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the adinfo is null!");
                                            }
                                        } else {
                                            str10 = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the snsInfo is null!");
                                        }
                                    } catch (java.lang.Exception e18) {
                                        e = e18;
                                        str2 = str14;
                                        str = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AdSnsInfoStorageLogic", e, "", new java.lang.Object[0]);
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, str);
                                        return true;
                                    }
                                } else {
                                    str10 = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
                                }
                                try {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "snsid " + j17 + " firstCreateTime " + i27 + " actionLikeTimeLimit: " + i18 + " curAction.createTime: " + k76Var2.f459997m + "is over the time limit!");
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str14, str10);
                                    return false;
                                } catch (java.lang.Exception e19) {
                                    e = e19;
                                    str12 = str14;
                                    str13 = str10;
                                    str2 = str12;
                                    str = str13;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AdSnsInfoStorageLogic", e, "", new java.lang.Object[0]);
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, str);
                                    return true;
                                }
                            }
                        } catch (java.lang.Exception e27) {
                            e = e27;
                            str12 = str14;
                        }
                    }
                    i28 = i19;
                    str = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
                    str4 = " actionLikeTimeLimit: ";
                    str7 = " actionCommentTimeLimit: ";
                    str2 = str14;
                } else {
                    str12 = str14;
                    if (i37 == 8 || i37 == 16) {
                        i28 = i19;
                        if (i28 > 0) {
                            str4 = " actionLikeTimeLimit: ";
                            if (i27 + i28 < k76Var2.f459997m) {
                                if (z17) {
                                    try {
                                        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().b1(y07.m70309x7525eefd()) != null) {
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70299x10413e672 = y07.m70299x10413e67();
                                            if (m70299x10413e672 != null) {
                                                p94.f0 f0Var2 = (p94.f0) i95.n0.c(p94.f0.class);
                                                int m70310x2fa78b112 = y07.m70310x2fa78b11();
                                                java.lang.Object[] objArr2 = new java.lang.Object[7];
                                                objArr2[0] = java.lang.Long.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.n(y07.m70309x7525eefd()));
                                                objArr2[1] = m70299x10413e672.f38105xcf532ea0;
                                                objArr2[2] = 2;
                                                objArr2[3] = 2;
                                                java.util.LinkedList<r45.e86> linkedList3 = c19806x4c372b7.f38984xe83113e0;
                                                objArr2[4] = java.lang.Integer.valueOf(linkedList3 != null ? linkedList3.size() : 0);
                                                java.util.LinkedList<r45.e86> linkedList4 = c19806x4c372b7.f38963x20c46e68;
                                                objArr2[5] = java.lang.Integer.valueOf(linkedList4 != null ? linkedList4.size() : 0);
                                                str5 = str12;
                                                str6 = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
                                                objArr2[6] = java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() / 1000));
                                                ((p34.p) f0Var2).Bi(13182, m70310x2fa78b112, objArr2);
                                            } else {
                                                str5 = str12;
                                                str6 = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the adinfo is null!");
                                            }
                                        } else {
                                            str5 = str12;
                                            str6 = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the snsInfo is null!");
                                        }
                                    } catch (java.lang.Exception e28) {
                                        e = e28;
                                        str14 = str12;
                                        str2 = str14;
                                        str = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AdSnsInfoStorageLogic", e, "", new java.lang.Object[0]);
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, str);
                                        return true;
                                    }
                                } else {
                                    str5 = str12;
                                    str6 = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "snsid " + j17 + " firstCreateTime " + i27 + " actionCommentTimeLimit: " + i28 + " curAction.createTime: " + k76Var2.f459997m + "is over the time limit!");
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, str6);
                                return false;
                            }
                            str2 = str12;
                            str = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
                            str7 = " actionCommentTimeLimit: ";
                        }
                    } else {
                        i28 = i19;
                    }
                    str2 = str12;
                    str = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
                    str4 = " actionLikeTimeLimit: ";
                    str7 = " actionCommentTimeLimit: ";
                }
            } catch (java.lang.Exception e29) {
                e = e29;
            }
        } catch (java.lang.Exception e37) {
            e = e37;
        }
        try {
            java.util.Iterator<r45.e86> it = c19806x4c372b7.f38984xe83113e0.iterator();
            int i38 = 0;
            while (it.hasNext()) {
                r45.e86 next = it.next();
                if (next.f454664i > i27) {
                    java.lang.String str15 = next.f454659d;
                    str9 = str3;
                    if (str15 == null || !str15.equals(str9)) {
                        i38++;
                    }
                } else {
                    str9 = str3;
                }
                str3 = str9;
            }
            java.lang.String str16 = str3;
            int i39 = i38 + 0;
            java.util.Iterator<r45.e86> it6 = c19806x4c372b7.f38963x20c46e68.iterator();
            int i47 = 0;
            while (it6.hasNext()) {
                r45.e86 next2 = it6.next();
                java.util.Iterator<r45.e86> it7 = it6;
                if (next2.f454664i > i27 && ((str8 = next2.f454659d) == null || !str8.equals(str16))) {
                    i47++;
                }
                it6 = it7;
            }
            int i48 = i39 + i47;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "totalsize " + i48 + " firstCreateTime " + i27 + " actionLimit: " + i17 + str4 + i18 + str7 + i28);
            if (i48 >= i17) {
                if (z17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().b1(y07.m70309x7525eefd());
                    if (b17 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70346x10413e67 = b17.m70346x10413e67();
                        if (m70346x10413e67 != null) {
                            p94.f0 f0Var3 = (p94.f0) i95.n0.c(p94.f0.class);
                            int m70310x2fa78b113 = y07.m70310x2fa78b11();
                            java.lang.Object[] objArr3 = new java.lang.Object[7];
                            objArr3[0] = java.lang.Long.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.n(y07.m70309x7525eefd()));
                            objArr3[1] = m70346x10413e67.f38105xcf532ea0;
                            objArr3[2] = 1;
                            objArr3[3] = 2;
                            java.util.LinkedList<r45.e86> linkedList5 = c19806x4c372b7.f38984xe83113e0;
                            objArr3[4] = java.lang.Integer.valueOf(linkedList5 != null ? linkedList5.size() : 0);
                            java.util.LinkedList<r45.e86> linkedList6 = c19806x4c372b7.f38963x20c46e68;
                            objArr3[5] = java.lang.Integer.valueOf(linkedList6 != null ? linkedList6.size() : 0);
                            objArr3[6] = java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() / 1000));
                            ((p34.p) f0Var3).Bi(13182, m70310x2fa78b113, objArr3);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the adinfo is null!");
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the snsInfo is null!");
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, str);
                return false;
            }
        } catch (java.lang.Exception e38) {
            e = e38;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AdSnsInfoStorageLogic", e, "", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, str);
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, str);
        return true;
    }

    public static r45.g5 c(r45.ck5 ck5Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convert", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (ck5Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convert", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return null;
        }
        r45.g5 g5Var = new r45.g5();
        r45.du5 du5Var = ck5Var.f453154e;
        g5Var.f456419e = du5Var;
        if (du5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "recObject.RecommendInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convert", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return null;
        }
        g5Var.f456418d = d(ck5Var.f453153d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convert", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        return g5Var;
    }

    public static r45.f76 d(r45.ca6 ca6Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convert", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (ca6Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convert", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return null;
        }
        r45.f76 f76Var = new r45.f76();
        r45.du5 du5Var = ca6Var.f452936e;
        f76Var.f455610e = du5Var;
        if (du5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "recommendObj.RecommendXml is null");
        }
        f76Var.f455609d = ca6Var.f452935d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convert", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        return f76Var;
    }

    public static java.util.LinkedList e(java.util.LinkedList linkedList) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convertRecObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.g5 c17 = c((r45.ck5) it.next());
            if (c17 != null) {
                linkedList2.add(c17);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertRecObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        return linkedList2;
    }

    public static void f(long j17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteAdWithNoCheck", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        try {
            java.lang.String t07 = ca4.z0.t0(j17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 y07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().y0(j17);
            if (y07 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "deleteAdWithNoCheck, adSnsInfo is null, snsId=" + t07);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteAdWithNoCheck", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "deleteAdWithNoCheck, snsId=" + t07);
            try {
                ca4.c0.b(i17, j17, y07.m70299x10413e67(), y07.m70300x74235b3e());
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdSnsInfoStorageLogic", "reportAdDelException: " + th6.toString());
            }
            a84.n.e(y07);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteAdWithNoCheck", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdSnsInfoStorageLogic", "deleteAdWithNoCheck, snsId=" + ca4.z0.t0(j17) + ", exp=" + e17.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteAdWithNoCheck", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        }
    }

    public static int g(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCreateTime", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(c19806x4c372b7.Id);
        int i17 = W0 == null ? c19806x4c372b7.f38965xc86e6609 : W0.f68883xac3be4e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCreateTime", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        return i17;
    }

    public static int h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDynamicGraySwitch", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        int i17 = 1;
        try {
            i17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_timeline_dynamic_snsobject_enable_android, 1);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdSnsInfoStorageLogic", "getDynamicGraySwitch, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDynamicGraySwitch", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        return i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x039a A[Catch: all -> 0x03a3, TRY_LEAVE, TryCatch #1 {all -> 0x03a3, blocks: (B:59:0x038a, B:61:0x039a), top: B:58:0x038a }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03ab A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(java.util.List r42, java.util.List r43, boolean r44, int r45) {
        /*
            Method dump skipped, instructions count: 1146
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.i(java.util.List, java.util.List, boolean, int):void");
    }

    public static void j(java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("insertRec", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (linkedList != null) {
            java.util.LinkedList e17 = e(linkedList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "convert " + e17.size() + " recObj to AdvertiseObj");
            java.util.Iterator it = e17.iterator();
            while (it.hasNext()) {
                r45.g5 g5Var = (r45.g5) it.next();
                if (k(g5Var.f456418d.f455609d.Id)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AdSnsInfoStorageLogic", "ignore recvd ad filter by snsId " + g5Var.f456418d.f455609d.Id);
                    it.remove();
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("insertTestAD", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            if (linkedList2 == null || linkedList2.size() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertTestAD", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            } else {
                int g17 = g((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) linkedList2.get(linkedList2.size() - 1));
                for (int i18 = 0; i18 < e17.size(); i18++) {
                    r45.g5 g5Var2 = (r45.g5) e17.get(i18);
                    if (g5Var2 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "ad is null");
                    } else {
                        r45.f76 f76Var = g5Var2.f456418d;
                        if (f76Var == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "item.SnsADObject is null");
                        } else if (f76Var.f455609d == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "item.SnsADObject.SnsObject is null");
                        } else {
                            java.lang.String g18 = x51.j1.g(g5Var2.f456419e);
                            java.lang.String g19 = x51.j1.g(g5Var2.f456418d.f455610e);
                            java.lang.String f17 = x51.j1.f(g5Var2.f456418d.f455609d.f38990xb6613a90);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771(g18);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "skXml " + g18);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "adXml " + g19);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "snsXml " + f17 + com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4(g19);
                            long j17 = c17903x3b438f4.f38260x6671312d;
                            if (j17 == 0 || !k(j17)) {
                                int i19 = g17 + 1;
                                if (c17902x72cc1771.f38086x8cc202f1 >= linkedList2.size() || (i17 = c17902x72cc1771.f38086x8cc202f1) < 0) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AdSnsInfoStorageLogic", "invalid ad.pos " + c17902x72cc1771.f38086x8cc202f1);
                                } else {
                                    i19 = g((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) linkedList2.get(i17)) + 1;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "create adinfo time  " + i19 + " pos " + c17902x72cc1771.f38086x8cc202f1);
                                }
                                int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "gettime " + currentTimeMillis);
                                o(g5Var2, i19, currentTimeMillis);
                                a(g5Var2.f456418d.f455609d.Id);
                                a(c17903x3b438f4.f38260x6671312d);
                                u(g5Var2.f456418d.f455609d.Id, c17902x72cc1771);
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AdSnsInfoStorageLogic", "ignore recvd ad filter by originSnsId " + c17903x3b438f4.f38260x6671312d);
                            }
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertTestAD", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1697L, 76L, linkedList.size());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertRec", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
    }

    public static boolean k(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isRecvdAd", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        l();
        boolean z17 = f246280c.get(java.lang.Long.valueOf(j17)) != null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isRecvdAd", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (r5 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        if (r5 == null) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void l() {
        /*
            java.lang.String r0 = "MicroMsg.AdSnsInfoStorageLogic"
            java.lang.String r1 = "loadRecvdAd"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r1, r2)
            java.util.LinkedHashMap r3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.f246280c
            if (r3 != 0) goto L93
            java.lang.String r3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.f246279b
            byte[] r3 = o35.a.i(r3)
            if (r3 == 0) goto L71
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
            r4.<init>(r3)
            r3 = 0
            java.io.ObjectInputStream r5 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L36 java.lang.ClassNotFoundException -> L38 java.io.IOException -> L4a java.io.StreamCorruptedException -> L59
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L36 java.lang.ClassNotFoundException -> L38 java.io.IOException -> L4a java.io.StreamCorruptedException -> L59
            java.lang.Object r3 = r5.readObject()     // Catch: java.lang.Throwable -> L2d java.lang.ClassNotFoundException -> L30 java.io.IOException -> L32 java.io.StreamCorruptedException -> L34
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch: java.lang.Throwable -> L2d java.lang.ClassNotFoundException -> L30 java.io.IOException -> L32 java.io.StreamCorruptedException -> L34
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.f246280c = r3     // Catch: java.lang.Throwable -> L2d java.lang.ClassNotFoundException -> L30 java.io.IOException -> L32 java.io.StreamCorruptedException -> L34
            r5.close()     // Catch: java.io.IOException -> L71
            goto L71
        L2d:
            r0 = move-exception
            r3 = r5
            goto L68
        L30:
            r3 = move-exception
            goto L3b
        L32:
            r3 = move-exception
            goto L4d
        L34:
            r3 = move-exception
            goto L5c
        L36:
            r0 = move-exception
            goto L68
        L38:
            r4 = move-exception
            r5 = r3
            r3 = r4
        L3b:
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(r3)     // Catch: java.lang.Throwable -> L2d
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r3)     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto L71
        L46:
            r5.close()     // Catch: java.io.IOException -> L71
            goto L71
        L4a:
            r4 = move-exception
            r5 = r3
            r3 = r4
        L4d:
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(r3)     // Catch: java.lang.Throwable -> L2d
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r3)     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto L71
            goto L46
        L59:
            r4 = move-exception
            r5 = r3
            r3 = r4
        L5c:
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(r3)     // Catch: java.lang.Throwable -> L2d
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r3)     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto L71
            goto L46
        L68:
            if (r3 == 0) goto L6d
            r3.close()     // Catch: java.io.IOException -> L6d
        L6d:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r1, r2)
            throw r0
        L71:
            java.util.LinkedHashMap r0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.f246280c
            if (r0 != 0) goto L93
            java.lang.String r0 = "instanceRecvdAd"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r2)
            com.tencent.mm.plugin.sns.model.w r3 = new com.tencent.mm.plugin.sns.model.w
            r4 = 4649075278012743680(0x4084d55560000000, double:666.6666870117188)
            double r4 = java.lang.Math.ceil(r4)
            int r4 = (int) r4
            int r4 = r4 + 1
            r5 = 1061158912(0x3f400000, float:0.75)
            r3.<init>(r4, r5)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.f246280c = r3
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r2)
        L93:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.l():void");
    }

    public static void m(java.util.LinkedList linkedList) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preDownloadAdLandingPagesRec", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (linkedList != null && !linkedList.isEmpty()) {
            java.util.LinkedList e17 = e(linkedList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "convert " + e17.size() + " recObj to AdvertiseObj");
            za4.f1.a(e17, true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preDownloadAdLandingPagesRec", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x044f A[Catch: all -> 0x0471, TryCatch #0 {all -> 0x0471, blocks: (B:61:0x0449, B:63:0x044f, B:64:0x0453, B:66:0x0459, B:68:0x0463), top: B:60:0x0449 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 n(r45.f76 r19, int r20) {
        /*
            Method dump skipped, instructions count: 1153
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.n(r45.f76, int):com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    public static void o(r45.g5 g5Var, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replace", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        p(g5Var, i17, i18, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replace", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
    }

    public static void p(r45.g5 g5Var, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replace", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (g5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "error adobj");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replace", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        r45.f76 f76Var = g5Var.f456418d;
        if (f76Var == null || (c19806x4c372b7 = f76Var.f455609d) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "error adobj");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replace", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 n17 = n(f76Var, i19);
        if (n17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AdSnsInfoStorageLogic", "adSnsInfo is null!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replace", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        java.lang.String g17 = x51.j1.g(g5Var.f456419e);
        if (i19 == 1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.f67592xf10bd636)) {
            g17 = n17.f67592xf10bd636;
        }
        A(n17, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771(g17));
        n17.f67598xac3be4e = i17;
        n17.f67597x480f98d1 = i18;
        java.lang.String g18 = x51.j1.g(g5Var.f456418d.f455610e);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g18)) {
            n17.f67608xe19bc6c = g18;
        }
        java.lang.String str = n17.f67608xe19bc6c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("filterAdxml", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("filterAdxml", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        n17.f67593x28cf0d8f = str;
        if (i19 == 0) {
            n17.f67592xf10bd636 = x51.j1.g(g5Var.f456419e);
        } else if (i19 == 1) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.f67592xf10bd636)) {
                n17.f67592xf10bd636 = x51.j1.g(g5Var.f456419e);
            }
        } else if (i19 == 2 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x51.j1.g(g5Var.f456419e))) {
            n17.f67592xf10bd636 = x51.j1.g(g5Var.f456419e);
        }
        m44.a.e(n17, "replace");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().W0(c19806x4c372b7.Id, n17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replace", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
    }

    public static void q(r45.g5 g5Var, int i17) {
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replaceAtObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (g5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "advertiseObject null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceAtObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        r45.f76 f76Var = g5Var.f456418d;
        if (f76Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "advertiseObject.SnsADObject is null ");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceAtObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = f76Var.f455609d;
        if (c19806x4c372b7 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "advertiseObject.SnsADObject.SnsObject is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceAtObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        java.lang.String t07 = ca4.z0.t0(c19806x4c372b7.Id);
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().P0(g5Var.f456418d.f455609d.Id)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "replaceAtObj, update, snsId=" + t07);
            r(g5Var.f456418d, "", i17, true);
        } else {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b72 = g5Var.f456418d.f455609d;
            int i19 = c19806x4c372b72.f38964x242cb387;
            java.util.LinkedList<r45.e86> linkedList = c19806x4c372b72.f38963x20c46e68;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdCreateTimeByComments", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
            if (i19 > 0 && linkedList != null) {
                java.util.Iterator<r45.e86> it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.e86 next = it.next();
                    if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.t2.i(next.f454672t, 32) && currentTimeMillis > (i18 = next.f454664i)) {
                        currentTimeMillis = i18;
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdCreateTimeByComments", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "replaceAtObj, insert at adObject, snsId=" + t07 + ", createTime=" + currentTimeMillis);
            p(g5Var, currentTimeMillis, currentTimeMillis, i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 y07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().y0(g5Var.f456418d.f455609d.Id);
            if (y07 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "set at ad invisible");
                y07.m70324xe45c5d84();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().W0(y07.f67610x29d1292e, y07);
            }
        }
        y(g5Var.f456418d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 y08 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().y0(g5Var.f456418d.f455609d.Id);
        if (y08 != null) {
            java.lang.String str = y08.f67594xe7057709;
            y08.f67594xe7057709 = x51.j1.g(g5Var.f456419e);
            if (i17 == 1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                y08.f67594xe7057709 = str;
            }
            r45.o3 m70308xe0bbc4b6 = y08.m70308xe0bbc4b6();
            if (m70308xe0bbc4b6 == null) {
                m70308xe0bbc4b6 = new r45.o3();
            }
            r45.mo5 mo5Var = g5Var.f456421g;
            m70308xe0bbc4b6.f463395e = mo5Var;
            if (mo5Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "update atFriend remindInfo, aid64 %d, aid %d", java.lang.Long.valueOf(mo5Var.f462251i), java.lang.Integer.valueOf(m70308xe0bbc4b6.f463395e.f462246d));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdSnsInfoStorageLogic", "atFriendRemindInfo == null");
            }
            y08.m70327x17925e2a(m70308xe0bbc4b6);
            m44.a.e(y08, "replaceAtObj");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().W0(y08.f67610x29d1292e, y08);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceAtObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
    }

    public static void r(r45.f76 f76Var, java.lang.String str, int i17, boolean z17) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (f76Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "replaceObj, error adobj");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = f76Var.f455609d;
        if (c19806x4c372b7 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "replaceObj, error adobj");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        java.lang.String t07 = ca4.z0.t0(c19806x4c372b7.Id);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 n17 = n(f76Var, i17);
        if (!z17 && i17 == 2 && n17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            n17.f67592xf10bd636 = str;
        }
        if (!z17 && i17 == 2 && n17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.f67592xf10bd636)) {
            A(n17, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771(n17.f67592xf10bd636));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "adDynamic replaceObj, snsId=" + t07 + "isAt=" + z17 + ", replaceDynamicMode=" + i17 + ", dynamicAdinfoStr=" + str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().W0(f76Var.f455609d.Id, n17);
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(zc4.h.class);
        }
        ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).d7(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.m(n17.m70305x51f8f990()), o75.b.f425116d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
    }

    public static boolean s(long j17, r45.l76 l76Var) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updataComment", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        r45.k76 k76Var = l76Var.f460738f;
        int i17 = k76Var.f459995h;
        if (i17 != 7 && i17 != 8 && i17 != 16) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updataComment", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 y07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().y0(j17);
        if (y07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "pass the action because the snsinfo is null " + j17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updataComment", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return false;
        }
        try {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7().mo11468x92b714fd(y07.f67595x4c58c87d);
            c19806x4c372b7.Id = j17;
            int i18 = k76Var.f459995h;
            if (i18 == 7) {
                java.util.Iterator<r45.e86> it = c19806x4c372b7.f38984xe83113e0.iterator();
                while (it.hasNext()) {
                    r45.e86 next = it.next();
                    if (next.f454664i == k76Var.f459997m && next.f454659d.equals(k76Var.f459991d)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "like create time " + next.f454664i + " ");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updataComment", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                        return false;
                    }
                }
                c19806x4c372b7.f38984xe83113e0.add(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i4.l(l76Var));
            } else if (i18 == 8 || i18 == 16) {
                java.util.Iterator<r45.e86> it6 = c19806x4c372b7.f38963x20c46e68.iterator();
                while (it6.hasNext()) {
                    r45.e86 next2 = it6.next();
                    if (next2.f454664i == k76Var.f459997m && next2.f454659d.equals(k76Var.f459991d)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "like create time " + next2.f454664i + " ");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updataComment", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                        return false;
                    }
                }
                c19806x4c372b7.f38963x20c46e68.add(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i4.l(l76Var));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.t2.n(y07, c19806x4c372b7.f38963x20c46e68);
            }
            y07.m70321x8904a400(c19806x4c372b7.mo14344x5f01b1f6());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().W0(c19806x4c372b7.Id, y07);
            synchronized (jm0.k.f381803i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(zc4.h.class);
            }
            ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).d7(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.m(y07.m70305x51f8f990()), o75.b.f425116d);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdSnsInfoStorageLogic", "e " + e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AdSnsInfoStorageLogic", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updataComment", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void t(r45.f76 r18, r45.cu5 r19, java.lang.String r20, int r21) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.t(r45.f76, r45.cu5, java.lang.String, int):void");
    }

    public static void u(long j17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateADInfoImm", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (c17902x72cc1771 == null || !c17902x72cc1771.f38082x4579db1d || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17902x72cc1771.f38081xedaa190c)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateADInfoImm", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k2 k2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k2(j17, 1, c17902x72cc1771.f38081xedaa190c);
        gm0.j1.i();
        gm0.j1.n().f354821b.g(k2Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateADInfoImm", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
    }

    public static boolean v(r45.g5 g5Var) {
        r45.f76 f76Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateAdvertiseObjDynamicField", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (g5Var == null || (f76Var = g5Var.f456418d) == null || (c19806x4c372b7 = f76Var.f455609d) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "updateAdvertiseObjDynamicField, params err");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateAdvertiseObjDynamicField", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return false;
        }
        java.lang.String t07 = ca4.z0.t0(c19806x4c372b7.Id);
        r45.f76 f76Var2 = g5Var.f456418d;
        if (f76Var2.f455610e == null) {
            f76Var2.f455610e = x51.j1.i("");
        }
        if (g5Var.f456419e == null) {
            g5Var.f456419e = x51.j1.i("");
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b72 = g5Var.f456418d.f455609d;
        if (c19806x4c372b72.f38990xb6613a90 == null) {
            c19806x4c372b72.f38990xb6613a90 = x51.j1.h("", false);
        }
        r45.f76 f76Var3 = g5Var.f456418d;
        boolean c17 = x51.j1.c(f76Var3.f455612g, f76Var3.f455613h, f76Var3.f455611f);
        if (c17) {
            g5Var.f456419e.c(x51.j1.g(g5Var.f456418d.f455612g));
            r45.f76 f76Var4 = g5Var.f456418d;
            f76Var4.f455610e.c(x51.j1.g(f76Var4.f455613h));
            r45.f76 f76Var5 = g5Var.f456418d;
            f76Var5.f455609d.f38990xb6613a90.d(x51.j1.g(f76Var5.f455611f).getBytes(java.nio.charset.StandardCharsets.UTF_8));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "adDynamic, updateAdvertiseObjDynamicField called with: advertiseObject = [" + g5Var + "] isValid = " + c17 + ", snsId=" + t07);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateAdvertiseObjDynamicField", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        return c17;
    }

    public static void w(r45.f76 f76Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 c17932x22276883) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateAdxmlForAdSnsInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        r45.du5 du5Var = f76Var.f455610e;
        if (du5Var != null) {
            java.lang.String g17 = x51.j1.g(du5Var);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
                c17932x22276883.f67608xe19bc6c = g17;
            }
            java.lang.String str = c17932x22276883.f67608xe19bc6c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("filterAdxml", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("filterAdxml", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !str.equals(c17932x22276883.f67593x28cf0d8f)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "update field adxml ".concat(str));
                c17932x22276883.f67593x28cf0d8f = str;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateAdxmlForAdSnsInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
    }

    public static boolean x(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 c17932x22276883, r45.cu5 cu5Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateContentForAdSnsInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        java.lang.String f17 = x51.j1.f(cu5Var);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateContentForAdSnsInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return true;
        }
        if (c17932x22276883.m70322xe9f5bdb7(f17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateContentForAdSnsInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateContentForAdSnsInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        return true;
    }

    public static void y(r45.f76 f76Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateEmojiInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (f76Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "updateEmojiInfo >> ad is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateEmojiInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = f76Var.f455609d;
        if (c19806x4c372b7 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "updateEmojiInfo .SnsObject is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateEmojiInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        java.util.LinkedList<r45.e86> linkedList = c19806x4c372b7.f38963x20c46e68;
        if (linkedList != null) {
            java.util.Iterator<r45.e86> it = linkedList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.x1.f252839a.j(c19806x4c372b7.Id, it.next());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateEmojiInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
    }

    public static boolean z(r45.f76 f76Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateSnsADObjDynamicField", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (f76Var == null || f76Var.f455609d == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateSnsADObjDynamicField", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return false;
        }
        if (f76Var.f455610e == null) {
            f76Var.f455610e = x51.j1.i("");
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = f76Var.f455609d;
        if (c19806x4c372b7.f38990xb6613a90 == null) {
            c19806x4c372b7.f38990xb6613a90 = x51.j1.h("", false);
        }
        boolean c17 = x51.j1.c(f76Var.f455612g, f76Var.f455613h, f76Var.f455611f);
        if (c17) {
            f76Var.f455610e.c(x51.j1.g(f76Var.f455613h));
            f76Var.f455609d.f38990xb6613a90.d(x51.j1.g(f76Var.f455611f).getBytes(java.nio.charset.StandardCharsets.UTF_8));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateSnsADObjDynamicField", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        return c17;
    }
}

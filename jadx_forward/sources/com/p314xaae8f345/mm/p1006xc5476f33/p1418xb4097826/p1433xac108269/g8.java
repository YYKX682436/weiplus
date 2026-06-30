package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes10.dex */
public final class g8 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183735a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f183736b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f183737c;

    public g8(java.lang.String str, zy2.i5 i5Var, zy2.i5 i5Var2) {
        this.f183735a = str;
        this.f183736b = i5Var;
        this.f183737c = i5Var2;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        int i17;
        int i18;
        int i19;
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        r45.ie ieVar;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i27 = fVar.f152148a;
        java.lang.String str = this.f183735a;
        if ((i27 == 0 && fVar.f152149b == 0) || (i17 = fVar.f152149b) == -5700 || i17 == -5701) {
            r45.nw6 nw6Var = new r45.nw6();
            nw6Var.set(0, (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) ((r45.w13) fVar.f152151d).m75936x14adae67(1));
            nw6Var.set(1, java.lang.Integer.valueOf(((r45.w13) fVar.f152151d).m75939xb282bd08(2)));
            nw6Var.set(2, ((r45.w13) fVar.f152151d).m75941xfb821914(3));
            nw6Var.set(3, java.lang.Integer.valueOf(((r45.w13) fVar.f152151d).m75939xb282bd08(5)));
            nw6Var.set(4, (r45.d71) ((r45.w13) fVar.f152151d).m75936x14adae67(6));
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Ab).mo141623x754a37bb()).r()).intValue() == 1) {
                r45.u13 u13Var = new r45.u13();
                u13Var.set(2, 1);
                u13Var.set(1, 1);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                r45.a04 a04Var = new r45.a04();
                a04Var.set(3, "https://dldir1v6.qq.com/weixin/checkresupdate/icons_filled_music_dbffd75457b5423684dbbd330c2e3117.png");
                a04Var.set(2, "超过一年半");
                a04Var.set(1, "关注我");
                linkedList.add(a04Var);
                r45.a04 a04Var2 = new r45.a04();
                a04Var2.set(3, "https://dldir1v6.qq.com/weixin/checkresupdate/icons_filled_music_dbffd75457b5423684dbbd330c2e3117.png");
                a04Var2.set(2, "累计四个月");
                a04Var2.set(1, "成为会员");
                linkedList.add(a04Var2);
                r45.a04 a04Var3 = new r45.a04();
                a04Var3.set(3, "https://dldir1v6.qq.com/weixin/checkresupdate/icons_filled_music_dbffd75457b5423684dbbd330c2e3117.png");
                a04Var3.set(2, "48");
                a04Var3.set(1, "评论我");
                linkedList.add(a04Var3);
                r45.a04 a04Var4 = new r45.a04();
                a04Var4.set(3, "https://dldir1v6.qq.com/weixin/checkresupdate/icons_filled_music_dbffd75457b5423684dbbd330c2e3117.png");
                a04Var4.set(2, "48");
                a04Var4.set(1, "评论我");
                linkedList.add(a04Var4);
                r45.a04 a04Var5 = new r45.a04();
                a04Var5.set(3, "https://dldir1v6.qq.com/weixin/checkresupdate/icons_filled_music_dbffd75457b5423684dbbd330c2e3117.png");
                a04Var5.set(2, "168");
                a04Var5.set(1, "喜欢我");
                linkedList.add(a04Var5);
                u13Var.set(0, linkedList);
                nw6Var.set(5, u13Var);
                i19 = 7;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.k8 k8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.k8.f183861a;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("nickname: ");
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) ((r45.w13) fVar.f152151d).m75936x14adae67(1);
                sb6.append(c19782x23db1cfa != null ? c19782x23db1cfa.m76184x8010e5e4() : null);
                sb6.append(", memberTAG: ");
                r45.u13 u13Var2 = (r45.u13) ((r45.w13) fVar.f152151d).m75936x14adae67(7);
                sb6.append(u13Var2 != null && u13Var2.m75939xb282bd08(1) == 1);
                sb6.append(", followTAG: ");
                r45.u13 u13Var3 = (r45.u13) ((r45.w13) fVar.f152151d).m75936x14adae67(7);
                sb6.append(u13Var3 != null && u13Var3.m75939xb282bd08(2) == 1);
                sb6.append(", item: ");
                r45.u13 u13Var4 = (r45.u13) ((r45.w13) fVar.f152151d).m75936x14adae67(7);
                sb6.append((u13Var4 == null || (m75941xfb8219142 = u13Var4.m75941xfb821914(0)) == null) ? null : java.lang.Integer.valueOf(m75941xfb8219142.size()));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderWxProfileManager", sb6.toString());
                r45.u13 u13Var5 = (r45.u13) ((r45.w13) fVar.f152151d).m75936x14adae67(7);
                if (u13Var5 != null && (m75941xfb821914 = u13Var5.m75941xfb821914(0)) != null) {
                    int i28 = 0;
                    for (java.lang.Object obj2 : m75941xfb821914) {
                        int i29 = i28 + 1;
                        if (i28 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.k8 k8Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.k8.f183861a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderWxProfileManager", "interaction, index: " + i28 + ", wording: " + ((r45.a04) obj2).m75945x2fec8307(4));
                        i28 = i29;
                    }
                }
                i19 = 7;
                nw6Var.set(5, (r45.u13) ((r45.w13) fVar.f152151d).m75936x14adae67(7));
            }
            nw6Var.set(i19, (r45.jk4) ((r45.w13) fVar.f152151d).m75936x14adae67(9));
            r45.d71 d71Var = (r45.d71) nw6Var.m75936x14adae67(4);
            if (((d71Var == null || (ieVar = (r45.ie) d71Var.m75936x14adae67(0)) == null) ? null : ieVar.f458493e) == null) {
                r45.d71 d71Var2 = (r45.d71) nw6Var.m75936x14adae67(4);
                r45.ie ieVar2 = d71Var2 != null ? (r45.ie) d71Var2.m75936x14adae67(0) : null;
                if (ieVar2 != null) {
                    r45.du5 du5Var = new r45.du5();
                    du5Var.c("");
                    ieVar2.f458493e = du5Var;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Bb).mo141623x754a37bb()).r()).intValue() == 1) {
                nw6Var.set(6, new java.util.LinkedList());
                java.util.LinkedList m75941xfb8219143 = nw6Var.m75941xfb821914(6);
                r45.ow6 ow6Var = new r45.ow6();
                ow6Var.set(0, "testItem1");
                ow6Var.set(1, 6);
                ow6Var.set(2, "https://dldir1v6.qq.com/weixin/checkresupdate/shopicon_51fca260daa5429ca68962e278c6eef5.png");
                m75941xfb8219143.add(ow6Var);
                java.util.LinkedList m75941xfb8219144 = nw6Var.m75941xfb821914(6);
                r45.ow6 ow6Var2 = new r45.ow6();
                ow6Var2.set(0, "testItem2");
                ow6Var2.set(1, 1);
                ow6Var2.set(2, "https://dldir1v6.qq.com/weixin/checkresupdate/shopicon_51fca260daa5429ca68962e278c6eef5.png");
                m75941xfb8219144.add(ow6Var2);
                java.util.LinkedList m75941xfb8219145 = nw6Var.m75941xfb821914(6);
                r45.ow6 ow6Var3 = new r45.ow6();
                ow6Var3.set(0, "testItem3");
                ow6Var3.set(1, 5);
                ow6Var3.set(2, "https://dldir1v6.qq.com/weixin/checkresupdate/shopicon_51fca260daa5429ca68962e278c6eef5.png");
                m75941xfb8219145.add(ow6Var3);
            } else {
                nw6Var.set(6, ((r45.w13) fVar.f152151d).m75941xfb821914(8));
            }
            nw6Var.set(8, (r45.so2) ((r45.w13) fVar.f152151d).m75936x14adae67(10));
            nw6Var.set(9, (r45.h32) ((r45.w13) fVar.f152151d).m75936x14adae67(14));
            nw6Var.set(10, (r45.c32) ((r45.w13) fVar.f152151d).m75936x14adae67(15));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.k8 k8Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.k8.f183861a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderWxProfileManager", "CgiFinderUserPagePreview resp get info objects:" + nw6Var.m75941xfb821914(2).size() + ",notice_info:" + ((r45.h32) nw6Var.m75936x14adae67(9)) + ",next_live_notification_info:" + ((r45.c32) nw6Var.m75936x14adae67(10)));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.k8 k8Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.k8.f183861a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.G1).mo141623x754a37bb()).r()).intValue() == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.f8 f8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.f8) k8Var4.d().b(str);
                if (f8Var == null) {
                    f8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.f8(null, null);
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.c0 d17 = k8Var4.d();
                f8Var.f183704a = nw6Var;
                d17.d(str, f8Var);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.k8.f183862b.put(str, nw6Var);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.k8.f183864d = ((r45.w13) fVar.f152151d).m75939xb282bd08(4);
            zy2.i5 i5Var = this.f183736b;
            if (i5Var != null) {
                i5Var.a(nw6Var);
            }
        } else {
            zy2.i5 i5Var2 = this.f183737c;
            if (i5Var2 != null) {
                i5Var2.a(java.lang.Integer.valueOf(i17));
            }
        }
        if ((fVar.f152148a == 0 && fVar.f152149b == 0) || (i18 = fVar.f152149b) == -5700 || i18 == -5701) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.k8.f183861a.g(str, c01.id.e());
        }
        return jz5.f0.f384359a;
    }
}

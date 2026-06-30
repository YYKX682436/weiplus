package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class g8 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f102203b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f102204c;

    public g8(java.lang.String str, zy2.i5 i5Var, zy2.i5 i5Var2) {
        this.f102202a = str;
        this.f102203b = i5Var;
        this.f102204c = i5Var2;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        int i17;
        int i18;
        int i19;
        java.util.LinkedList list;
        java.util.LinkedList list2;
        r45.ie ieVar;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i27 = fVar.f70615a;
        java.lang.String str = this.f102202a;
        if ((i27 == 0 && fVar.f70616b == 0) || (i17 = fVar.f70616b) == -5700 || i17 == -5701) {
            r45.nw6 nw6Var = new r45.nw6();
            nw6Var.set(0, (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.w13) fVar.f70618d).getCustom(1));
            nw6Var.set(1, java.lang.Integer.valueOf(((r45.w13) fVar.f70618d).getInteger(2)));
            nw6Var.set(2, ((r45.w13) fVar.f70618d).getList(3));
            nw6Var.set(3, java.lang.Integer.valueOf(((r45.w13) fVar.f70618d).getInteger(5)));
            nw6Var.set(4, (r45.d71) ((r45.w13) fVar.f70618d).getCustom(6));
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Ab).getValue()).r()).intValue() == 1) {
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
                com.tencent.mm.plugin.finder.assist.k8 k8Var = com.tencent.mm.plugin.finder.assist.k8.f102328a;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("nickname: ");
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.w13) fVar.f70618d).getCustom(1);
                sb6.append(finderContact != null ? finderContact.getNickname() : null);
                sb6.append(", memberTAG: ");
                r45.u13 u13Var2 = (r45.u13) ((r45.w13) fVar.f70618d).getCustom(7);
                sb6.append(u13Var2 != null && u13Var2.getInteger(1) == 1);
                sb6.append(", followTAG: ");
                r45.u13 u13Var3 = (r45.u13) ((r45.w13) fVar.f70618d).getCustom(7);
                sb6.append(u13Var3 != null && u13Var3.getInteger(2) == 1);
                sb6.append(", item: ");
                r45.u13 u13Var4 = (r45.u13) ((r45.w13) fVar.f70618d).getCustom(7);
                sb6.append((u13Var4 == null || (list2 = u13Var4.getList(0)) == null) ? null : java.lang.Integer.valueOf(list2.size()));
                com.tencent.mars.xlog.Log.i("FinderWxProfileManager", sb6.toString());
                r45.u13 u13Var5 = (r45.u13) ((r45.w13) fVar.f70618d).getCustom(7);
                if (u13Var5 != null && (list = u13Var5.getList(0)) != null) {
                    int i28 = 0;
                    for (java.lang.Object obj2 : list) {
                        int i29 = i28 + 1;
                        if (i28 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        com.tencent.mm.plugin.finder.assist.k8 k8Var2 = com.tencent.mm.plugin.finder.assist.k8.f102328a;
                        com.tencent.mars.xlog.Log.i("FinderWxProfileManager", "interaction, index: " + i28 + ", wording: " + ((r45.a04) obj2).getString(4));
                        i28 = i29;
                    }
                }
                i19 = 7;
                nw6Var.set(5, (r45.u13) ((r45.w13) fVar.f70618d).getCustom(7));
            }
            nw6Var.set(i19, (r45.jk4) ((r45.w13) fVar.f70618d).getCustom(9));
            r45.d71 d71Var = (r45.d71) nw6Var.getCustom(4);
            if (((d71Var == null || (ieVar = (r45.ie) d71Var.getCustom(0)) == null) ? null : ieVar.f376960e) == null) {
                r45.d71 d71Var2 = (r45.d71) nw6Var.getCustom(4);
                r45.ie ieVar2 = d71Var2 != null ? (r45.ie) d71Var2.getCustom(0) : null;
                if (ieVar2 != null) {
                    r45.du5 du5Var = new r45.du5();
                    du5Var.c("");
                    ieVar2.f376960e = du5Var;
                }
            }
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Bb).getValue()).r()).intValue() == 1) {
                nw6Var.set(6, new java.util.LinkedList());
                java.util.LinkedList list3 = nw6Var.getList(6);
                r45.ow6 ow6Var = new r45.ow6();
                ow6Var.set(0, "testItem1");
                ow6Var.set(1, 6);
                ow6Var.set(2, "https://dldir1v6.qq.com/weixin/checkresupdate/shopicon_51fca260daa5429ca68962e278c6eef5.png");
                list3.add(ow6Var);
                java.util.LinkedList list4 = nw6Var.getList(6);
                r45.ow6 ow6Var2 = new r45.ow6();
                ow6Var2.set(0, "testItem2");
                ow6Var2.set(1, 1);
                ow6Var2.set(2, "https://dldir1v6.qq.com/weixin/checkresupdate/shopicon_51fca260daa5429ca68962e278c6eef5.png");
                list4.add(ow6Var2);
                java.util.LinkedList list5 = nw6Var.getList(6);
                r45.ow6 ow6Var3 = new r45.ow6();
                ow6Var3.set(0, "testItem3");
                ow6Var3.set(1, 5);
                ow6Var3.set(2, "https://dldir1v6.qq.com/weixin/checkresupdate/shopicon_51fca260daa5429ca68962e278c6eef5.png");
                list5.add(ow6Var3);
            } else {
                nw6Var.set(6, ((r45.w13) fVar.f70618d).getList(8));
            }
            nw6Var.set(8, (r45.so2) ((r45.w13) fVar.f70618d).getCustom(10));
            nw6Var.set(9, (r45.h32) ((r45.w13) fVar.f70618d).getCustom(14));
            nw6Var.set(10, (r45.c32) ((r45.w13) fVar.f70618d).getCustom(15));
            com.tencent.mm.plugin.finder.assist.k8 k8Var3 = com.tencent.mm.plugin.finder.assist.k8.f102328a;
            com.tencent.mars.xlog.Log.i("FinderWxProfileManager", "CgiFinderUserPagePreview resp get info objects:" + nw6Var.getList(2).size() + ",notice_info:" + ((r45.h32) nw6Var.getCustom(9)) + ",next_live_notification_info:" + ((r45.c32) nw6Var.getCustom(10)));
            com.tencent.mm.plugin.finder.assist.k8 k8Var4 = com.tencent.mm.plugin.finder.assist.k8.f102328a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.G1).getValue()).r()).intValue() == 1) {
                com.tencent.mm.plugin.finder.assist.f8 f8Var = (com.tencent.mm.plugin.finder.assist.f8) k8Var4.d().b(str);
                if (f8Var == null) {
                    f8Var = new com.tencent.mm.plugin.finder.assist.f8(null, null);
                }
                com.tencent.mm.sdk.platformtools.c0 d17 = k8Var4.d();
                f8Var.f102171a = nw6Var;
                d17.d(str, f8Var);
            } else {
                com.tencent.mm.plugin.finder.assist.k8.f102329b.put(str, nw6Var);
            }
            com.tencent.mm.plugin.finder.assist.k8.f102331d = ((r45.w13) fVar.f70618d).getInteger(4);
            zy2.i5 i5Var = this.f102203b;
            if (i5Var != null) {
                i5Var.a(nw6Var);
            }
        } else {
            zy2.i5 i5Var2 = this.f102204c;
            if (i5Var2 != null) {
                i5Var2.a(java.lang.Integer.valueOf(i17));
            }
        }
        if ((fVar.f70615a == 0 && fVar.f70616b == 0) || (i18 = fVar.f70616b) == -5700 || i18 == -5701) {
            com.tencent.mm.plugin.finder.assist.k8.f102328a.g(str, c01.id.e());
        }
        return jz5.f0.f302826a;
    }
}

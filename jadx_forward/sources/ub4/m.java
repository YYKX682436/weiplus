package ub4;

/* loaded from: classes4.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ub4.n f507721d;

    public m(ub4.n nVar, ub4.p pVar) {
        this.f507721d = nVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        android.content.Intent intent;
        int i17;
        java.lang.String str8;
        java.lang.String str9;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter$SnsAlbumItemViewHolder$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/album/SnsAlbumItemAdapter$SnsAlbumItemViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() != null && (view.getTag() instanceof ub4.o)) {
            ub4.n nVar = this.f507721d;
            ub4.p pVar = nVar.f507724f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
            ub4.l lVar = pVar.f507728e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
            if (lVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
                ub4.l lVar2 = nVar.f507724f.f507728e;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
                int i18 = ((ub4.o) view.getTag()).f507725a;
                java.lang.String str10 = ((ub4.o) view.getTag()).f507726b;
                ub4.t tVar = (ub4.t) lVar2;
                tVar.getClass();
                java.lang.String str11 = "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$3";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGridItemClick", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$3");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAlbumUI", "onClickItem localId=%s, mediaId=%s", java.lang.Integer.valueOf(i18), str10);
                int i19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2182x5897e6f.C18155xbfbac8cb.f249293t;
                java.lang.String str12 = "access$100";
                java.lang.String str13 = "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2182x5897e6f.C18155xbfbac8cb c18155xbfbac8cb = tVar.f507731a;
                c18155xbfbac8cb.getClass();
                java.lang.String str14 = "goSnsGallery";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("goSnsGallery", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
                android.content.Intent intent2 = new android.content.Intent(c18155xbfbac8cb.mo7430x19263085(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee.class);
                intent2.putExtra("sns_gallery_userName", c18155xbfbac8cb.f249301n);
                intent2.putExtra("sns_gallery_is_self", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(c18155xbfbac8cb.f249300m, c18155xbfbac8cb.f249301n));
                intent2.putExtra("sns_gallery_localId", i18);
                intent2.putExtra("sns_source", c18155xbfbac8cb.f249302o);
                intent2.putExtra("sns_video_scene", 3);
                intent2.putExtra("key_from_scene", 5);
                intent2.putExtra("INTENT_ALBUM_SCENE", 3);
                ub4.i iVar = c18155xbfbac8cb.f249297g;
                if (iVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLimtiSeq", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                    java.lang.String str15 = iVar.f507703g;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLimtiSeq", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                    intent2.putExtra("sns_gallery_limit_seq", str15);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6 d6Var = c18155xbfbac8cb.f249304q;
                    java.lang.String str16 = c18155xbfbac8cb.f249301n;
                    ub4.i iVar2 = c18155xbfbac8cb.f249297g;
                    iVar2.getClass();
                    str2 = "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter$SnsAlbumItemViewHolder$1";
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeGalleryItems", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    str3 = "onGridItemClick";
                    str = "onClick";
                    int i27 = 0;
                    while (true) {
                        java.util.ArrayList arrayList3 = (java.util.ArrayList) iVar2.f507700d;
                        str4 = str11;
                        if (i27 >= arrayList3.size()) {
                            break;
                        }
                        java.util.Iterator it = ((ub4.c) arrayList3.get(i27)).f507685a.iterator();
                        while (it.hasNext()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) it.next();
                            java.util.Iterator it6 = it;
                            int i28 = c17933xe8d1b226.f38324x142bbdc6;
                            if (c17933xe8d1b226.m70371x485d7() != null) {
                                str8 = str12;
                                if (c17933xe8d1b226.m70371x485d7().f39014x86965dde == null || c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451373h.size() == 0) {
                                    i17 = i18;
                                } else {
                                    if (c17933xe8d1b226.m70405x7b43eb28()) {
                                        str9 = str13;
                                    } else {
                                        str9 = str13;
                                        if (c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e != 15) {
                                            it = it6;
                                            str12 = str8;
                                            str13 = str9;
                                        }
                                    }
                                    if (i28 == i18) {
                                        iVar2.f507708o = arrayList2.size();
                                    }
                                    java.util.Iterator it7 = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451373h.iterator();
                                    int i29 = 0;
                                    while (it7.hasNext()) {
                                        int i37 = i18;
                                        r45.jj4 jj4Var = (r45.jj4) it7.next();
                                        java.util.Iterator it8 = it7;
                                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(jj4Var.f459388d, str10)) {
                                            iVar2.f507708o += i29;
                                        }
                                        r45.m33 m33Var = new r45.m33();
                                        m33Var.f461642d = jj4Var;
                                        m33Var.f461643e = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.i("sns_table_", i28);
                                        m33Var.f461644f = c17933xe8d1b226.m70357x3fdd41df();
                                        m33Var.f461645g = i29;
                                        arrayList2.add(m33Var);
                                        i29++;
                                        it7 = it8;
                                        i18 = i37;
                                        str14 = str14;
                                        intent2 = intent2;
                                    }
                                    i17 = i18;
                                    it = it6;
                                    str12 = str8;
                                    str13 = str9;
                                    i18 = i17;
                                    str14 = str14;
                                    intent2 = intent2;
                                }
                            } else {
                                i17 = i18;
                                str8 = str12;
                            }
                            str9 = str13;
                            it = it6;
                            str12 = str8;
                            str13 = str9;
                            i18 = i17;
                            str14 = str14;
                            intent2 = intent2;
                        }
                        i27++;
                        str11 = str4;
                    }
                    str5 = str12;
                    str6 = str13;
                    str7 = str14;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeGalleryItems", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                    d6Var.s(str16, arrayList2);
                    ub4.i iVar3 = c18155xbfbac8cb.f249297g;
                    iVar3.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFixPosition", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                    int i38 = iVar3.f507708o;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFixPosition", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                    intent = intent2;
                    intent.putExtra("sns_gallery_position", i38);
                } else {
                    str3 = "onGridItemClick";
                    str4 = "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$3";
                    str5 = "access$100";
                    str = "onClick";
                    str2 = "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter$SnsAlbumItemViewHolder$1";
                    str6 = "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI";
                    str7 = "goSnsGallery";
                    intent = intent2;
                }
                c18155xbfbac8cb.m7587x5dc77fb5(intent, 8);
                java.lang.String str17 = str6;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str7, str17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, str17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str3, str4);
                java.lang.String str18 = str;
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/album/SnsAlbumItemAdapter$SnsAlbumItemViewHolder$1", "android/view/View$OnClickListener", str18, "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str18, str2);
            }
        }
        str = "onClick";
        str2 = "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter$SnsAlbumItemViewHolder$1";
        java.lang.String str182 = str;
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/album/SnsAlbumItemAdapter$SnsAlbumItemViewHolder$1", "android/view/View$OnClickListener", str182, "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str182, str2);
    }
}

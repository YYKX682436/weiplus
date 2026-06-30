package uo2;

/* loaded from: classes2.dex */
public final class m implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14492xad25b4ca f511164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f511165e;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14492xad25b4ca c14492xad25b4ca, java.lang.String str) {
        this.f511164d = c14492xad25b4ca;
        this.f511165e = str;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        r45.zi2 zi2Var;
        r45.zi2 zi2Var2;
        java.lang.String str5;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        int i18;
        r45.zi2 zi2Var3;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        android.content.Intent intent = new android.content.Intent();
        int itemId = menuItem.getItemId();
        if (itemId == 1001) {
            intent.putExtra("key_finder_post_router", 2);
        } else if (itemId == 1002) {
            intent.putExtra("key_finder_post_router", 3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14492xad25b4ca c14492xad25b4ca = this.f511164d;
        str = "";
        if (c14492xad25b4ca.getType() == 1) {
            str2 = c14492xad25b4ca.getAudioPath();
            r45.o03 finderBgmInfo = c14492xad25b4ca.getFinderBgmInfo();
            java.lang.String m75945x2fec8307 = finderBgmInfo != null ? finderBgmInfo.m75945x2fec8307(3) : null;
            str4 = m75945x2fec8307 != null ? m75945x2fec8307 : "-1";
            r45.o03 finderBgmInfo2 = c14492xad25b4ca.getFinderBgmInfo();
            str3 = finderBgmInfo2 != null ? finderBgmInfo2.m75945x2fec8307(2) : null;
            if (str3 == null) {
                str3 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 originFeed = c14492xad25b4ca.getOriginFeed();
            intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_PLAY_DURATION", (originFeed == null || (feedObject = originFeed.getFeedObject()) == null) ? 0 : (int) bu2.z.b(feedObject));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 originFeed2 = c14492xad25b4ca.getOriginFeed();
            intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_COVER_URL", originFeed2 != null ? originFeed2.m59210xe5e0d2a0() : null);
            if (((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).Zi(false)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 originFeed3 = c14492xad25b4ca.getOriginFeed();
                java.lang.String concat = "wxfinderobject_".concat(pm0.v.u(originFeed3 != null ? originFeed3.m59251x5db1b11() : 0L));
                zi2Var = new r45.zi2();
                zi2Var.set(12, "");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 originFeed4 = c14492xad25b4ca.getOriginFeed();
                zi2Var.set(1, originFeed4 != null ? originFeed4.m59210xe5e0d2a0() : null);
                android.content.res.Resources resources = c14492xad25b4ca.getContext().getResources();
                java.lang.Object[] objArr = new java.lang.Object[1];
                r45.o03 finderBgmInfo3 = c14492xad25b4ca.getFinderBgmInfo();
                objArr[0] = (finderBgmInfo3 == null || (c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) finderBgmInfo3.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa3.m76184x8010e5e4();
                zi2Var.set(2, resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cxs, objArr));
                intent.putExtra("KEY_FINDER_POST_MUSIC_FEEDID", concat);
                str = str4;
            } else {
                str = str4;
                zi2Var = null;
            }
        } else if (c14492xad25b4ca.getType() == 2) {
            wt3.h0 audioInfo = c14492xad25b4ca.getAudioInfo();
            if (audioInfo == null || (str2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a) audioInfo).f237248i) == null) {
                str2 = "";
            }
            r45.o03 finderBgmInfo4 = c14492xad25b4ca.getFinderBgmInfo();
            java.lang.String m75945x2fec83072 = finderBgmInfo4 != null ? finderBgmInfo4.m75945x2fec8307(3) : null;
            str4 = m75945x2fec83072 != null ? m75945x2fec83072 : "-1";
            r45.o03 finderBgmInfo5 = c14492xad25b4ca.getFinderBgmInfo();
            if (finderBgmInfo5 == null || (zi2Var2 = (r45.zi2) finderBgmInfo5.m75936x14adae67(1)) == null) {
                str3 = "";
                zi2Var = null;
            } else {
                str3 = zi2Var2.m75945x2fec8307(5);
                if (str3 == null) {
                    str3 = "";
                }
                zi2Var = new r45.zi2();
                r45.o03 finderBgmInfo6 = c14492xad25b4ca.getFinderBgmInfo();
                if (finderBgmInfo6 == null || (str5 = finderBgmInfo6.m75945x2fec8307(3)) == null) {
                    str5 = "";
                }
                zi2Var.set(0, str5);
                java.lang.String m75945x2fec83073 = zi2Var2.m75945x2fec8307(5);
                zi2Var.set(5, m75945x2fec83073 != null ? m75945x2fec83073 : "");
                zi2Var.set(3, zi2Var2.m75945x2fec8307(3));
                zi2Var.set(2, zi2Var2.m75945x2fec8307(2));
            }
            str = str4;
        } else {
            str2 = "";
            str3 = str2;
            zi2Var = null;
        }
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_ID", str);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_PATH", str2);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_INFO", zi2Var != null ? zi2Var.mo14344x5f01b1f6() : null);
        r45.o03 finderBgmInfo7 = c14492xad25b4ca.getFinderBgmInfo();
        java.lang.String m76197x6c03c64c = (finderBgmInfo7 == null || (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) finderBgmInfo7.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa2.m76197x6c03c64c();
        android.content.Context context = c14492xad25b4ca.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        intent.putExtra("KEY_FINDER_POST_BGM_IF_ORIGIN", p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m76197x6c03c64c, xy2.c.e(context)));
        intent.putExtra("KEY_FINDER_POST_ORIGIN_BGM_URL", str3);
        r45.o03 finderBgmInfo8 = c14492xad25b4ca.getFinderBgmInfo();
        if ((finderBgmInfo8 != null ? (r45.zi2) finderBgmInfo8.m75936x14adae67(1) : null) != null) {
            r45.o03 finderBgmInfo9 = c14492xad25b4ca.getFinderBgmInfo();
            intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_NAME", java.lang.String.valueOf((finderBgmInfo9 == null || (zi2Var3 = (r45.zi2) finderBgmInfo9.m75936x14adae67(1)) == null) ? null : zi2Var3.m75945x2fec8307(2)));
        } else {
            android.content.res.Resources resources2 = c14492xad25b4ca.getContext().getResources();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            r45.o03 finderBgmInfo10 = c14492xad25b4ca.getFinderBgmInfo();
            objArr2[0] = (finderBgmInfo10 == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) finderBgmInfo10.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa.m76184x8010e5e4();
            java.lang.String string = resources2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cxs, objArr2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_NAME", string);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFollowTopicHeaderView", "tabType " + c14492xad25b4ca.getTabType());
        int tabType = c14492xad25b4ca.getTabType();
        if (tabType == 1 || tabType == 35 || tabType == 3 || tabType == 4) {
            i18 = 5;
        } else {
            i18 = 5;
            if (tabType == 5 || tabType == 6) {
                i18 = 7;
            }
        }
        intent.putExtra("key_finder_post_from", i18);
        intent.putExtra("key_finder_post_id", this.f511165e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        android.content.Context context2 = c14492xad25b4ca.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        i0Var.gk(context2, intent);
    }
}

package sb4;

/* loaded from: classes4.dex */
public final class w extends sb4.e {
    public final android.app.Activity C;
    public int D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(boolean z17, sb4.v snsClick, android.app.Activity context, java.lang.String userName) {
        super(z17, context, snsClick, userName);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsClick, "snsClick");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.C = context;
    }

    @Override // sb4.e
    public boolean A() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSearchModeEnd", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSearchModeEnd", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        return false;
    }

    public final java.util.ArrayList H(java.lang.String clickSnsId, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeGalleryItems", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickSnsId, "clickSnsId");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.D = i17;
        java.util.List list = this.f486989e;
        int size = ((java.util.ArrayList) list).size();
        int i18 = 0;
        while (i18 < size) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) ((java.util.ArrayList) list).get(i18);
            java.lang.String m70367x7525eefd = c17933xe8d1b226.m70367x7525eefd();
            int j17 = pb4.e.f434729a.j(c17933xe8d1b226);
            if (c17933xe8d1b226.m70371x485d7().f39014x86965dde != null && c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451373h.size() != 0 && (c17933xe8d1b226.m70405x7b43eb28() || c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 15)) {
                if (m70367x7525eefd.equals(clickSnsId)) {
                    this.D = arrayList.size();
                }
                java.util.Iterator it = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451373h.iterator();
                int i19 = 0;
                while (it.hasNext()) {
                    r45.jj4 jj4Var = (r45.jj4) it.next();
                    r45.m33 m33Var = new r45.m33();
                    m33Var.f461642d = jj4Var;
                    m33Var.f461643e = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.i("sns_table_", j17);
                    m33Var.f461644f = c17933xe8d1b226.m70357x3fdd41df();
                    m33Var.f461645g = i19;
                    arrayList.add(m33Var);
                    i19++;
                    i18 = i18;
                }
            }
            i18++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeGalleryItems", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        return arrayList;
    }

    @Override // sb4.e
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("browseFeed", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        java.util.ArrayList arrayList = ta4.h1.f498283a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("browseFeed", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        if (c17933xe8d1b226 != null) {
            java.lang.String s07 = ca4.z0.s0(c17933xe8d1b226.f68891x29d1292e);
            java.util.ArrayList arrayList2 = ta4.h1.f498283a;
            if (!arrayList2.contains(s07)) {
                arrayList2.add(s07);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("browseFeed", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.b0 b0Var = this.A;
        if (b0Var != null && c17933xe8d1b226 != null) {
            b0Var.c(c17933xe8d1b226);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("browseFeed", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCount", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        int size = ((java.util.ArrayList) this.f486989e).size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCount", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        return size;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        java.lang.Object obj = ((java.util.ArrayList) this.f486989e).get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        return obj;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemId", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemId", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        return 0L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0079. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x007c. Please report as an issue. */
    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        java.util.Map map = this.f486992h;
        if (((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17)) != null) {
            java.lang.Object obj = ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            i18 = ((java.lang.Number) obj).intValue();
        } else {
            i18 = -1;
        }
        if (i18 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsStarListAdapter", "unknow error " + i18);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
            return -1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) getItem(i18);
        int i19 = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e;
        if (i19 != 1) {
            if (i19 == 4) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("wx5aa333606550dfd5", c17933xe8d1b226.m70371x485d7().f39012x33e0f24f != null ? c17933xe8d1b226.m70371x485d7().f39012x33e0f24f.f472379d : "")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
                    return 6;
                }
                ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_new_music_type_flag, bm5.h0.RepairerConfig_Mv_CardDownLevel_Int, 0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
                return 1;
            }
            if (i19 == 15) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
                return 2;
            }
            if (i19 == 21) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
                return 3;
            }
            if (i19 != 59 && i19 != 28 && i19 != 29) {
                if (i19 == 33) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
                    return 5;
                }
                if (i19 != 34) {
                    switch (i19) {
                        case 36:
                        case 37:
                        case 38:
                            break;
                        case 39:
                            int i27 = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451383u;
                            if (i27 == 3 || i27 == 100000000) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
                                return 4;
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
                            return 1;
                        default:
                            switch (i19) {
                                case 42:
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
                                    return 6;
                                case com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32774x503933e6 /* 43 */:
                                case 44:
                                case 45:
                                case 46:
                                    break;
                                case 47:
                                    android.app.Activity context = this.C;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "context");
                                    if (je4.g.d(context, c17933xe8d1b226.m70371x485d7())) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
                                        return 6;
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
                                    return 1;
                                default:
                                    switch (i19) {
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 55:
                                        case 56:
                                            break;
                                        case 54:
                                            break;
                                        default:
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
                                            return 1;
                                    }
                            }
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
            return 4;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        return 0;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getView", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        int itemViewType = getItemViewType(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarListAdapter", "position " + itemViewType);
        android.view.View p17 = itemViewType != 0 ? itemViewType != 2 ? itemViewType != 3 ? itemViewType != 4 ? itemViewType != 5 ? itemViewType != 6 ? p(i17, view) : o(i17, view) : n(i17, view) : l(i17, view) : m(i17, view) : r(i17, view) : q(i17, view);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getView", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        return p17;
    }

    @Override // sb4.e
    public boolean h(int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkDateTvDisplay", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkDateTvDisplay", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        return true;
    }

    @Override // sb4.e
    public boolean j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkToShowStarIcon", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkToShowStarIcon", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        return false;
    }

    @Override // sb4.e
    public void k(android.widget.TextView yearTv, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkYearTvView", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(yearTv, "yearTv");
        int i19 = i17 / 10000;
        int i27 = i18 / 10000;
        d(yearTv);
        android.app.Activity activity = this.C;
        if (i19 == 0) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.os.f() != i27) {
                B(yearTv);
                java.lang.String string = activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jh6);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i27)}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                yearTv.setText(format);
                yearTv.setVisibility(0);
                d(yearTv);
            }
        } else if (i27 != i19) {
            B(yearTv);
            java.lang.String string2 = activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jh6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            java.lang.String format2 = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i27)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
            yearTv.setText(format2);
            yearTv.setVisibility(0);
            d(yearTv);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkYearTvView", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
    }

    @Override // sb4.e
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 t(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLastestSnsInfo", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        if (!(c17933xe8d1b226 != null && this.f487001t == c17933xe8d1b226.f38324x142bbdc6)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLastestSnsInfo", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
            return null;
        }
        pb4.e eVar = pb4.e.f434729a;
        java.lang.String m70363x51f8f990 = c17933xe8d1b226.m70363x51f8f990();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70363x51f8f990, "getLocalid(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getByLocalId", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        int m17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.m(m70363x51f8f990);
        l75.k0 f17 = eVar.f();
        p75.i0 i18 = dm.ab.f317249y.i();
        i18.f434190d = dm.ab.f317250z.j(m70363x51f8f990);
        dm.ab abVar = (dm.ab) i18.a().o(f17, dm.ab.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getByLocalId >> ");
        sb6.append(m70363x51f8f990);
        sb6.append(", ");
        sb6.append(m17);
        sb6.append(", ");
        sb6.append(abVar != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarSnsInfoStorage", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 n17 = eVar.n(abVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getByLocalId", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        this.f487001t = -1;
        if (n17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsStarListAdapter", "getLastestSnsInfo failed to sight update snsInfo, fixPos:%d, localId:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(c17933xe8d1b226.f38324x142bbdc6));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLastestSnsInfo", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarListAdapter", "getLastestSnsInfo success to update snsInfo, fixPos:%d, localId:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(c17933xe8d1b226.f38324x142bbdc6));
        ((java.util.ArrayList) this.f486989e).set(i17, n17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLastestSnsInfo", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        return n17;
    }

    @Override // sb4.e
    public int v() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPositionTop", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPositionTop", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        return 0;
    }

    @Override // sb4.e
    public boolean z(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPositionGoToPhoto", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPositionGoToPhoto", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        return false;
    }
}

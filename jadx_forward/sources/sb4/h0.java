package sb4;

/* loaded from: classes4.dex */
public class h0 extends android.widget.BaseAdapter implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x4 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs f487046d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f487047e = new java.util.ArrayList();

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18144x3e20023a activityC18144x3e20023a, android.widget.ListView listView, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var, int i17, java.lang.String str, com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.m mVar) {
        this.f487046d = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs(activityC18144x3e20023a, listView, iVar, l1Var, i17, this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x4
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns V1(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("genStruct", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns nsVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns) ((java.util.ArrayList) this.f487047e).get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("genStruct", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        return nsVar;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBaseAdapter", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBaseAdapter", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        return this.f487046d;
    }

    public final android.util.Pair c(hm5.c cVar) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaCmtCount", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        int i18 = 0;
        if (cVar != null) {
            int i19 = 0;
            i17 = 0;
            while (i18 < cVar.b()) {
                nm5.j jVar = (nm5.j) cVar.a(i18);
                if (jVar != null && jVar.a(7) != null) {
                    int intValue = ((java.lang.Integer) jVar.a(7)).intValue();
                    if (intValue == 2) {
                        i17++;
                    } else if (intValue == 1) {
                        i19++;
                    }
                }
                i18++;
            }
            i18 = i19;
        } else {
            i17 = 0;
        }
        android.util.Pair pair = new android.util.Pair(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaCmtCount", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        return pair;
    }

    public void d(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18144x3e20023a activityC18144x3e20023a) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadData", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        if (activityC18144x3e20023a != null && !activityC18144x3e20023a.f249175y) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Uj().mo50293x3498a0(new sb4.g0(this, activityC18144x3e20023a));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadData", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x4
    public com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.AbstractC22733x77ee84fd g2() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVending", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVending", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        return null;
    }

    @Override // android.widget.Adapter, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x4
    /* renamed from: getCount */
    public int mo70850x7444f759() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCount", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        int size = ((java.util.ArrayList) this.f487047e).size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCount", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        return size;
    }

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ java.lang.Object getItem(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 mo70851xfb80e389 = mo70851xfb80e389(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        return mo70851xfb80e389;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemId", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemId", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns nsVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getView", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        java.util.List list = this.f487047e;
        if (i17 >= 0 && i17 < ((java.util.ArrayList) list).size()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.X(((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns) ((java.util.ArrayList) list).get(i17)).f251571j);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar = this.f487046d;
        bsVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        od4.b bVar = od4.b.f426181a;
        int i18 = 1;
        int i19 = view != null ? 1 : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initReport", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
        java.util.HashMap hashMap = od4.b.f426182b;
        if (hashMap.get(java.lang.Integer.valueOf(i17)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsMethodReport", "already initReport position:" + i17 + "? ");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initReport", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
        } else {
            hashMap.put(java.lang.Integer.valueOf(i17), new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6898xf2e84d22());
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6898xf2e84d22 c6898xf2e84d22 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6898xf2e84d22) hashMap.get(java.lang.Integer.valueOf(i17));
            if (c6898xf2e84d22 != null) {
                c6898xf2e84d22.f142148h = i19;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initReport", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 mo70851xfb80e389 = bsVar.f249568a.mo70851xfb80e389(i17);
        android.view.View a17 = bsVar.a(mo70851xfb80e389, i17, bsVar.f249569b.k() == 1 ? com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs.k(mo70851xfb80e389, false) : com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs.j(mo70851xfb80e389), view);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindViewParams", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        if (a17 != null && i17 >= 0) {
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (i17 < arrayList.size() && (nsVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns) arrayList.get(i17)) != null) {
                try {
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = nsVar.f251558a;
                    if (c17933xe8d1b226 != null) {
                        hashMap2.put("sns_feed_id", ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
                        hashMap2.put("sns_feed_username", c17933xe8d1b226.m70374x6bf53a6c());
                        hashMap2.put("sns_feed_share_name", c17933xe8d1b226.m70374x6bf53a6c());
                        hashMap2.put("sns_feed_type", java.lang.Integer.valueOf(c17933xe8d1b226.f68895x2262335f));
                        hashMap2.put("sns_is_live", java.lang.Integer.valueOf((c17933xe8d1b226.f68895x2262335f == 54 && pc4.e.f434959a.a()) ? 1 : 0));
                    }
                    boolean z17 = nsVar.f251577p;
                    hashMap2.put("sns_nick_name", nsVar.f251585x);
                    hashMap2.put("sns_feed_is_ad", java.lang.Integer.valueOf(z17 ? 1 : 0));
                    hashMap2.put("sns_feed_position", java.lang.Integer.valueOf(i17));
                    hashMap2.put("sns_is_ws", 1);
                    hashMap2.put("sns_is_ws_block", 0);
                    if (nsVar.f251560b.f39014x86965dde.F != null) {
                        i18 = 4;
                    } else {
                        int i27 = nsVar.f251568g;
                        if (i27 != 18 && i27 != 20) {
                            i18 = 0;
                        }
                    }
                    hashMap2.put("sns_feed_tail_type", java.lang.Integer.valueOf(i18));
                    hm5.c cVar = nsVar.U;
                    int b17 = cVar != null ? cVar.b() : 0;
                    hm5.c cVar2 = nsVar.V;
                    int b18 = cVar2 != null ? cVar2.b() : 0;
                    hashMap2.put("sns_feed_like_count", java.lang.Integer.valueOf(b17));
                    hashMap2.put("sns_feed_comment_count", java.lang.Integer.valueOf(b18));
                    android.util.Pair c17 = c(nsVar.V);
                    hashMap2.put("sns_emo_cmt_cnt", c17.first);
                    hashMap2.put("sns_img_cmt_cnt", c17.second);
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(a17, hashMap2);
                } catch (java.lang.Exception unused) {
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindViewParams", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getView", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        return a17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x4
    public void w3(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onNotifyChange", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        this.f487046d.m();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onNotifyChange", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
    }

    @Override // android.widget.Adapter, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x4
    /* renamed from: getItem */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 mo70851xfb80e389(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns) ((java.util.ArrayList) this.f487047e).get(i17)).f251558a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        return c17933xe8d1b226;
    }
}

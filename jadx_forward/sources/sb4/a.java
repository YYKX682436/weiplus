package sb4;

/* loaded from: classes11.dex */
public class a extends com.p314xaae8f345.mm.ui.p2690x38b72420.a5 {

    /* renamed from: n, reason: collision with root package name */
    public android.database.Cursor f486972n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f486973o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f486974p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f486975q;

    public a(com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 abstractActivityC22312xbd689c47, java.util.List list, boolean z17, boolean z18, java.util.List list2) {
        super(abstractActivityC22312xbd689c47, list, z17, true);
        this.f486972n = null;
        this.f486973o = null;
        this.f486974p = new java.util.ArrayList();
        this.f486975q = z18;
        this.f486973o = list2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewlifeChatRoomAdapter", "create!");
        s();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCount", "com.tencent.mm.plugin.sns.ui.adapter.NewlifeChatRoomAdapter");
        int size = ((java.util.ArrayList) this.f486974p).size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCount", "com.tencent.mm.plugin.sns.ui.adapter.NewlifeChatRoomAdapter");
        return size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        tb4.d dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createDataItem", "com.tencent.mm.plugin.sns.ui.adapter.NewlifeChatRoomAdapter");
        java.lang.String str = (java.lang.String) ((java.util.ArrayList) this.f486974p).get(i17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, "recent_use")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createRecentUseHeaderDataItem", "com.tencent.mm.plugin.sns.ui.adapter.NewlifeChatRoomAdapter");
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0 n0Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0(i17);
            n0Var.f288436y = "最近推荐";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createRecentUseHeaderDataItem", "com.tencent.mm.plugin.sns.ui.adapter.NewlifeChatRoomAdapter");
            dVar = n0Var;
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, "recent")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createRecentHeaderDataItem", "com.tencent.mm.plugin.sns.ui.adapter.NewlifeChatRoomAdapter");
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0 n0Var2 = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0(i17);
            n0Var2.f288436y = this.f288609d.mo8774x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbx);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createRecentHeaderDataItem", "com.tencent.mm.plugin.sns.ui.adapter.NewlifeChatRoomAdapter");
            dVar = n0Var2;
        } else {
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 L = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(str);
            if (L == null) {
                gm0.j1.i();
                L = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(str);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createSnsChatRoomDataItem", "com.tencent.mm.plugin.sns.ui.adapter.NewlifeChatRoomAdapter");
            tb4.d dVar2 = new tb4.d(i17);
            dVar2.E = null;
            dVar2.f(L);
            dVar2.f288369e = this.f288611f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShowMoreBtn", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem");
            dVar2.G = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShowMoreBtn", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSnsChatRoomDataItem", "com.tencent.mm.plugin.sns.ui.adapter.NewlifeChatRoomAdapter");
            dVar = dVar2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createDataItem", "com.tencent.mm.plugin.sns.ui.adapter.NewlifeChatRoomAdapter");
        return dVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    public void s() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetData", "com.tencent.mm.plugin.sns.ui.adapter.NewlifeChatRoomAdapter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewlifeChatRoomAdapter", "resetData");
        android.database.Cursor cursor = this.f486972n;
        if (cursor != null) {
            cursor.close();
            this.f486972n = null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        java.util.List list = this.f288121m;
        l75.e0 e0Var = pp.a.f438897e2;
        this.f486972n = Di.C(5, list, null, this.f288120i, "");
        h();
        java.util.List<java.lang.String> list2 = this.f486973o;
        boolean L0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list2);
        java.util.List list3 = this.f486974p;
        if (!L0) {
            for (java.lang.String str : list2) {
                gm0.j1.i();
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                if (n17 != null && ((int) n17.E2) != 0) {
                    list3.add(str);
                }
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list3)) {
            list3.add(0, "recent");
        } else {
            list3.add(0, "recent_use");
            list3.add("recent");
        }
        while (this.f486972n.moveToNext()) {
            android.database.Cursor cursor2 = this.f486972n;
            java.lang.String string = cursor2.getString(cursor2.getColumnIndex(dm.i4.f66875xa013b0d5));
            if (!list3.contains(string)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkFilterAssociateChatRoom", "com.tencent.mm.plugin.sns.ui.adapter.NewlifeChatRoomAdapter");
                if (this.f486975q) {
                    z17 = !c01.e2.E(string);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkFilterAssociateChatRoom", "com.tencent.mm.plugin.sns.ui.adapter.NewlifeChatRoomAdapter");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkFilterAssociateChatRoom", "com.tencent.mm.plugin.sns.ui.adapter.NewlifeChatRoomAdapter");
                    z17 = true;
                }
                if (z17) {
                    list3.add(string);
                }
            }
        }
        if (list3.size() > 1 && list3.get(list3.size() - 1) == "recent") {
            list3.remove(list3.size() - 1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetData", "com.tencent.mm.plugin.sns.ui.adapter.NewlifeChatRoomAdapter");
    }
}

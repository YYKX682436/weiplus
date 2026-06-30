package sb4;

/* loaded from: classes11.dex */
public class c extends com.p314xaae8f345.mm.ui.p2690x38b72420.a5 {

    /* renamed from: n, reason: collision with root package name */
    public android.database.Cursor f486979n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f486980o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f486981p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f486982q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View.OnClickListener f486983r;

    public c(com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 abstractActivityC22312xbd689c47, java.util.List list, boolean z17, boolean z18, boolean z19) {
        super(abstractActivityC22312xbd689c47, list, z17, true);
        this.f486979n = null;
        this.f486980o = null;
        this.f486981p = new java.util.ArrayList();
        this.f486983r = null;
        this.f486982q = z19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsChatRoomAdapter", "create!");
        s();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCount", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
        int size = ((java.util.ArrayList) this.f486981p).size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCount", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
        return size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        tb4.d dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createDataItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
        java.lang.String str = (java.lang.String) ((java.util.ArrayList) this.f486981p).get(i17);
        boolean D0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, "recent_use");
        com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var = this.f288609d;
        if (D0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createRecentUseHeaderDataItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0 n0Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0(i17);
            n0Var.f288436y = l4Var.mo8774x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jby);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createRecentUseHeaderDataItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
            dVar = n0Var;
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, "recent")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createRecentHeaderDataItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0 n0Var2 = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0(i17);
            n0Var2.f288436y = l4Var.mo8774x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbx);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createRecentHeaderDataItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
            dVar = n0Var2;
        } else {
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 L = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(str);
            if (L == null) {
                gm0.j1.i();
                L = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(str);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createSnsChatRoomDataItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
            tb4.d dVar2 = new tb4.d(i17);
            dVar2.E = this.f486983r;
            dVar2.f(L);
            dVar2.f288369e = this.f288611f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSnsChatRoomDataItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
            dVar = dVar2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createDataItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
        return dVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    public void s() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetData", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsChatRoomAdapter", "resetData");
        this.f486980o = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().g().f525833e;
        android.database.Cursor cursor = this.f486979n;
        if (cursor != null) {
            cursor.close();
            this.f486979n = null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        java.util.List list = this.f288121m;
        l75.e0 e0Var = pp.a.f438897e2;
        this.f486979n = Di.C(5, list, null, this.f288120i, "");
        h();
        boolean L0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f486980o);
        java.util.List list2 = this.f486981p;
        if (!L0) {
            for (wa4.y yVar : this.f486980o) {
                gm0.j1.i();
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(yVar.f525838d, true);
                if (n17 != null && ((int) n17.E2) != 0) {
                    list2.add(yVar.f525838d);
                }
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list2)) {
            list2.add(0, "recent");
        } else {
            list2.add(0, "recent_use");
            list2.add("recent");
        }
        while (this.f486979n.moveToNext()) {
            android.database.Cursor cursor2 = this.f486979n;
            java.lang.String string = cursor2.getString(cursor2.getColumnIndex(dm.i4.f66875xa013b0d5));
            if (!list2.contains(string)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkFilterAssociateChatRoom", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
                if (this.f486982q) {
                    z17 = !c01.e2.E(string);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkFilterAssociateChatRoom", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkFilterAssociateChatRoom", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
                    z17 = true;
                }
                if (z17) {
                    list2.add(string);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetData", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
    }
}

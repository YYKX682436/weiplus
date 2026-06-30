package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI */
/* loaded from: classes12.dex */
public class ActivityC18020x8424ad99 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f248371s = 0;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 f248374f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f248375g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f248376h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f248377i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f248378m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f248379n;

    /* renamed from: p, reason: collision with root package name */
    public vg3.x3 f248381p;

    /* renamed from: r, reason: collision with root package name */
    public int f248383r;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.GridView f248372d = null;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kf f248373e = null;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f248380o = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public boolean f248382q = false;

    public static java.lang.String T6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18020x8424ad99 activityC18020x8424ad99, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var, java.lang.String str) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        activityC18020x8424ad99.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDisplayNameInRoom", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        if (a3Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayNameInRoom", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
            str2 = "";
        } else {
            java.lang.String z07 = a3Var.z0(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayNameInRoom", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
            str2 = z07;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        return str2;
    }

    public final int U6(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWrapColNum", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWrapColNum", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
            return 0;
        }
        int width = (int) ((((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getWidth() - (context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561409hp) * 1.0f)) / ((int) ((context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561417hx) * 2.0f) + context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561423i3))));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsChatRoomMemberUI", "[getWrapColNum] :%s", java.lang.Integer.valueOf(width));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWrapColNum", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        return width;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cqx;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        super.onConfigurationChanged(configuration);
        this.f248372d.setNumColumns(U6(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        super.onCreate(bundle);
        this.f248381p = (vg3.x3) gm0.j1.s(vg3.x3.class);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initViews", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        this.f248375g = getIntent().getStringExtra("RoomInfo_Id");
        this.f248378m = getIntent().getStringExtra("room_name");
        this.f248376h = getIntent().getStringExtra("Add_address_titile");
        int i17 = 0;
        getIntent().getIntExtra("room_member_count", 0);
        this.f248383r = getIntent().getIntExtra("CONTACT_INFO_UI_SOURCE", 10);
        this.f248382q = getIntent().getBooleanExtra("filter_open_im", false);
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f248375g);
        this.f248374f = z07;
        if (z07 != null) {
            this.f248377i = z07.f69107x5be1edb3;
            this.f248379n = c01.z1.r().equals(this.f248377i);
        }
        android.widget.GridView gridView = (android.widget.GridView) findViewById(com.p314xaae8f345.mm.R.id.f568551n72);
        this.f248372d = gridView;
        gridView.setNumColumns(U6(this));
        this.f248372d.setColumnWidth(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561409hp));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kf kfVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kf(this, this, this.f248374f, this.f248375g, null, this.f248377i);
        this.f248373e = kfVar;
        this.f248372d.setAdapter((android.widget.ListAdapter) kfVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kf kfVar2 = this.f248373e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ff ffVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ff(this);
        kfVar2.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMemberItemClickListener", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter");
        kfVar2.f251162f = ffVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMemberItemClickListener", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter");
        qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
        java.lang.String str = this.f248375g;
        ((py.a) iVar).getClass();
        java.util.List m17 = c01.v1.m(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMemberOrderList", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        java.util.List list = this.f248380o;
        if (m17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMemberOrderList", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        } else {
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            arrayList.clear();
            while (true) {
                java.util.LinkedList linkedList = (java.util.LinkedList) m17;
                if (i17 >= linkedList.size()) {
                    break;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) this.f248381p).Bi().n((java.lang.String) linkedList.get(i17), true);
                java.lang.String d17 = n17.d1();
                if ((!this.f248382q || android.text.TextUtils.isEmpty(d17) || !d17.contains("@openim")) && n17.r2() && !c01.z1.J(n17.d1())) {
                    if (this.f248374f.L0(n17.d1())) {
                        arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.Cif(1, n17, 3));
                    } else if (this.f248374f.G0(n17.d1())) {
                        arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.Cif(1, n17, 2));
                    } else {
                        arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.Cif(1, n17, 1));
                    }
                }
                i17++;
            }
            java.util.Collections.sort(list, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.gf(this));
            this.f248373e.notifyDataSetChanged();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMemberOrderList", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        }
        mo54450xbf7c1df6(this.f248376h + "(" + ((java.util.ArrayList) list).size() + ")");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initViews", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hf(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
    }
}

package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class DelChatroomMemberUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f63746d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.chatroom.ui.v2 f63747e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f63748f;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.storage.a3 f63751i;

    /* renamed from: m, reason: collision with root package name */
    public int f63752m;

    /* renamed from: n, reason: collision with root package name */
    public int f63753n;

    /* renamed from: o, reason: collision with root package name */
    public int f63754o;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f63758s;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f63749g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f63750h = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public boolean f63755p = false;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.roomsdk.model.factory.a f63756q = null;

    /* renamed from: r, reason: collision with root package name */
    public android.app.ProgressDialog f63757r = null;

    public static com.tencent.mm.roomsdk.model.factory.a T6(com.tencent.mm.chatroom.ui.DelChatroomMemberUI delChatroomMemberUI, java.lang.String str, boolean z17) {
        delChatroomMemberUI.getClass();
        if (str == null || str.equals("")) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(str);
        com.tencent.mm.roomsdk.model.factory.a b17 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(delChatroomMemberUI.f63748f).b(delChatroomMemberUI.f63748f, linkedList, delChatroomMemberUI.f63752m);
        b17.f192246b = new com.tencent.mm.chatroom.ui.k2(delChatroomMemberUI, str, z17, linkedList);
        b17.f192247c = new com.tencent.mm.chatroom.ui.n2(delChatroomMemberUI, str);
        if (z17) {
            b17.b();
            return b17;
        }
        b17.c(delChatroomMemberUI, delChatroomMemberUI.getString(com.tencent.mm.R.string.f490573yv), delChatroomMemberUI.getString(com.tencent.mm.R.string.i4_), true, true, new com.tencent.mm.chatroom.ui.o2(delChatroomMemberUI, b17));
        return b17;
    }

    public static void U6(com.tencent.mm.chatroom.ui.DelChatroomMemberUI delChatroomMemberUI, com.tencent.mm.storage.f9 f9Var, int i17, java.util.List list, int i18, int i19, int i27, java.lang.String str) {
        delChatroomMemberUI.getClass();
        vg3.j4 j4Var = (vg3.j4) i95.n0.c(vg3.j4.class);
        java.lang.String str2 = delChatroomMemberUI.f63748f;
        int size = list != null ? list.size() : 0;
        long E1 = com.tencent.mm.sdk.platformtools.t8.E1(f9Var != null ? f9Var.Y1() : "");
        ((y04.e) j4Var).getClass();
        a14.h.a(str2, size, i18, i17, i19, i27, E1, str);
    }

    public static gd0.f V6(java.lang.String str, com.tencent.mm.storage.f9 f9Var, int i17, java.lang.String str2, o65.f fVar) {
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DelChatroomMemberUI", "revokeRecord msgInfo is null");
            return null;
        }
        r45.qw3 qw3Var = new r45.qw3();
        qw3Var.f384311d = f9Var.I0();
        qw3Var.f384312e = java.lang.Long.parseLong(f9Var.Y1());
        qw3Var.f384313f = str;
        qw3Var.f384314g = i17;
        if (i17 == 2) {
            qw3Var.f384315h = str2;
        }
        qw3Var.f384316i = c01.y1.a(c01.z1.r(), f9Var.getCreateTime());
        ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).getClass();
        com.tencent.mm.roomsdk.model.factory.h hVar = new com.tencent.mm.roomsdk.model.factory.h(true);
        xg3.p0 p0Var = new xg3.p0(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP, qw3Var);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(p0Var);
        hVar.f192266f = new e21.k(linkedList);
        hVar.f192248d = fVar;
        hVar.b();
        return hVar;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488405se;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.i4q);
        this.f63746d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f485891jg1);
        com.tencent.mm.chatroom.ui.v2 v2Var = new com.tencent.mm.chatroom.ui.v2(this);
        this.f63747e = v2Var;
        java.util.LinkedList<java.lang.String> linkedList = this.f63749g;
        if (linkedList != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DelChatroomMemberAdapter", "initData members.size %d", java.lang.Integer.valueOf(linkedList.size()));
            java.util.LinkedList linkedList2 = (java.util.LinkedList) v2Var.f64589d;
            linkedList2.clear();
            for (java.lang.String str : linkedList) {
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                if (n17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(n17.d1()) && n17.d1().equals(str)) {
                    linkedList2.add(n17);
                }
            }
        }
        this.f63746d.setAdapter((android.widget.ListAdapter) this.f63747e);
        setBackBtn(new com.tencent.mm.chatroom.ui.i2(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f63748f = getIntent().getStringExtra("RoomInfo_Id");
        this.f63752m = getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        this.f63753n = getIntent().getIntExtra("local_scene", 0);
        this.f63754o = getIntent().getIntExtra("select_record_report_opt", 0);
        this.f63755p = getIntent().getBooleanExtra("revoke_record", false);
        if (this.f63753n == 1) {
            this.f63758s = pt0.f0.Li(this.f63748f, getIntent().getLongExtra("msg_id", -1L));
        }
        java.lang.String stringExtra = getIntent().getStringExtra("members");
        this.f63750h = com.tencent.mm.sdk.platformtools.t8.O1(getIntent().getStringExtra("origin_members"), ",");
        for (java.lang.String str : stringExtra.split(",")) {
            this.f63749g.add(str);
        }
        this.f63751i = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f63748f);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DelChatroomMemberUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
    }
}

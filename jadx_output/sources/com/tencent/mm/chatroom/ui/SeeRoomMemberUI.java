package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class SeeRoomMemberUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0, pn.a {

    /* renamed from: z, reason: collision with root package name */
    public static int f63934z = 5;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.GridView f63935d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.chatroom.ui.cc f63936e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.storage.a3 f63937f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f63938g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f63939h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f63940i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f63941m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f63942n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f63943o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f63944p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f63945q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f63946r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f63947s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f63948t;

    /* renamed from: u, reason: collision with root package name */
    public int f63949u;

    /* renamed from: v, reason: collision with root package name */
    public int f63950v;

    /* renamed from: w, reason: collision with root package name */
    public int f63951w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.AdapterView.OnItemClickListener f63952x = new com.tencent.mm.chatroom.ui.tb(this);

    /* renamed from: y, reason: collision with root package name */
    public pn.m f63953y = null;

    public static java.lang.String U6(com.tencent.mm.storage.a3 a3Var, java.lang.String str) {
        return a3Var == null ? "" : a3Var.z0(str);
    }

    public final void T6(java.lang.String str) {
        if (str == null || str.equals("")) {
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(str);
        com.tencent.mm.roomsdk.model.factory.a b17 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(this.f63939h).b(this.f63939h, linkedList, 0);
        b17.f192246b = new com.tencent.mm.chatroom.ui.vb(this);
        b17.f192247c = new com.tencent.mm.chatroom.ui.wb(this);
        b17.c(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.i4_), true, true, new com.tencent.mm.chatroom.ui.xb(this, b17));
    }

    public int V6(android.content.Context context) {
        if (context == null) {
            return 0;
        }
        int width = (int) ((((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getWidth() - (context.getResources().getDimension(com.tencent.mm.R.dimen.f479876hp) * 1.0f)) / ((int) ((context.getResources().getDimension(com.tencent.mm.R.dimen.f479884hx) * 2.0f) + context.getResources().getDimension(com.tencent.mm.R.dimen.f479890i3))));
        com.tencent.mars.xlog.Log.i("MicroMsg.SeeRoomMemberUI", "[getWrapColNum] :%s", java.lang.Integer.valueOf(width));
        f63934z = width;
        return width;
    }

    @Override // pn.a
    public void Z0() {
        if (this.f63937f != null) {
            setMMTitle(this.f63938g + "(" + this.f63937f.A0().size() + ")");
        }
    }

    @Override // pn.a
    public void d1() {
        com.tencent.mm.storage.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        java.lang.String str = this.f63940i;
        if (str == null) {
            str = this.f63939h;
        }
        this.f63937f = a17.z0(str);
        qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
        java.lang.String str2 = this.f63939h;
        ((py.a) iVar).getClass();
        runOnUiThread(new com.tencent.mm.chatroom.ui.ub(this, c01.v1.m(str2)));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cjb;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(this.f63938g + "(" + this.f63949u + ")");
        setBackBtn(new com.tencent.mm.chatroom.ui.ob(this));
        this.f63947s = (com.tencent.mm.ui.widget.MMEditText) findViewById(com.tencent.mm.R.id.f486065k13);
        android.widget.GridView gridView = (android.widget.GridView) findViewById(com.tencent.mm.R.id.bgx);
        this.f63935d = gridView;
        gridView.setNumColumns(V6(this));
        this.f63935d.setColumnWidth(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479876hp));
        com.tencent.mm.storage.a3 a3Var = this.f63937f;
        java.lang.String str = this.f63939h;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(null)) {
            throw null;
        }
        com.tencent.mm.storage.ja m07 = ((com.tencent.mm.storage.ka) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).hj()).m0("@t.qq.com");
        if (m07 != null) {
            linkedList.add(m07.f195058b);
        }
        this.f63936e = new com.tencent.mm.chatroom.ui.cc(this, this, a3Var, str, linkedList, this.f63946r);
        this.f63947s.addTextChangedListener(new com.tencent.mm.chatroom.ui.pb(this));
        this.f63935d.setOnItemClickListener(this.f63952x);
        this.f63935d.setOnItemLongClickListener(new com.tencent.mm.chatroom.ui.sb(this));
        this.f63935d.setAdapter((android.widget.ListAdapter) this.f63936e);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        boolean z17 = true;
        if (i17 != 1) {
            if (i17 == 2) {
                if (intent == null) {
                    return;
                }
                T6(intent.getStringExtra("Select_Contact"));
                return;
            } else {
                if (i17 == 132412 && intent != null) {
                    java.lang.String stringExtra = intent.getStringExtra("intent_key_invitation_reason");
                    pn.m mVar = this.f63953y;
                    if (mVar != null) {
                        mVar.b(stringExtra != null ? stringExtra : "", com.tencent.mm.R.string.g2b);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (intent == null) {
            return;
        }
        java.lang.String stringExtra2 = intent.getStringExtra("Select_Contact");
        com.tencent.mm.chatroom.ui.ChatroomInfoUI.LocalHistoryInfo localHistoryInfo = (com.tencent.mm.chatroom.ui.ChatroomInfoUI.LocalHistoryInfo) intent.getParcelableExtra("select_record_msg_info");
        if (com.tencent.mm.storage.z3.N4(this.f63939h) && !c01.e2.E(this.f63939h) && !c01.t1.a(stringExtra2)) {
            db5.e1.s(this, getString(com.tencent.mm.R.string.i5c), getString(com.tencent.mm.R.string.f490573yv));
            return;
        }
        java.lang.String r17 = c01.z1.r();
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (!(r17 != null ? r17 : "").equals(stringExtra2)) {
            qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
            java.lang.String str = this.f63939h;
            ((py.a) iVar).getClass();
            java.util.List m17 = c01.v1.m(str);
            boolean z19 = false;
            if (m17 != null) {
                java.util.Iterator it = m17.iterator();
                while (it.hasNext()) {
                    if (((java.lang.String) it.next()).equals(stringExtra2)) {
                        z19 = true;
                    }
                }
            }
            z17 = z19;
        }
        if (z17) {
            db5.e1.s(this, getString(com.tencent.mm.R.string.f489840d8), getString(com.tencent.mm.R.string.f490573yv));
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.P1(stringExtra2.split(",")) == null) {
                return;
            }
            this.f63953y = new pn.m(this, this.f63939h, intent.getStringExtra("Select_Contact"), localHistoryInfo, intent.getLongExtra("select_record_fake_msg_id", 0L), this);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f63935d.setNumColumns(V6(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(219L, 2L, 1L, true);
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.yc.CTRL_INDEX, this);
        this.f63939h = getIntent().getStringExtra("RoomInfo_Id");
        this.f63940i = getIntent().getStringExtra("Chat_User");
        getIntent().getStringExtra("Chatroom_member_list");
        this.f63943o = getIntent().getBooleanExtra("Is_Chatroom", true);
        this.f63944p = getIntent().getBooleanExtra("Is_Lbsroom", false);
        this.f63948t = getIntent().getBooleanExtra("Is_RoomOwner", false);
        this.f63946r = getIntent().getStringExtra("room_owner_name");
        this.f63938g = getIntent().getStringExtra("Add_address_titile");
        com.tencent.mm.storage.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        java.lang.String str = this.f63940i;
        if (str == null) {
            str = this.f63939h;
        }
        this.f63937f = a17.z0(str);
        this.f63949u = getIntent().getIntExtra("room_member_count", 0);
        this.f63945q = getIntent().getStringExtra("room_name");
        this.f63950v = getIntent().getIntExtra("offset", 0);
        this.f63951w = getIntent().getIntExtra("first_pos", 0);
        initView();
        if (this.f63936e != null) {
            d1();
            this.f63935d.setSelection(this.f63951w * f63934z < this.f63936e.getCount() ? this.f63951w * f63934z : this.f63936e.getCount() - 1);
            this.f63935d.postDelayed(new com.tencent.mm.chatroom.ui.nb(this), 100L);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.yc.CTRL_INDEX, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.chatroom.ui.cc ccVar = this.f63936e;
        if (ccVar != null) {
            ccVar.c(this.f63947s.getText().toString());
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        tm.a b17 = tm.a.b(str);
        if (b17 != null) {
            b17.c(this, null, null);
        }
    }
}

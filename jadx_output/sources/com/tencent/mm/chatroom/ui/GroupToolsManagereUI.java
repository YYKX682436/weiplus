package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class GroupToolsManagereUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f63770v = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f63771d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f63772e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f63773f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f63774g;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.chatroom.ui.c4 f63776i;

    /* renamed from: m, reason: collision with root package name */
    public androidx.recyclerview.widget.g1 f63777m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.chatroom.ui.d4 f63778n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.chatroom.ui.c4 f63779o;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f63782r;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f63775h = null;

    /* renamed from: p, reason: collision with root package name */
    public rn.h f63780p = null;

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f63781q = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public boolean f63783s = false;

    /* renamed from: t, reason: collision with root package name */
    public int f63784t = 0;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.chatroom.ui.w3 f63785u = new com.tencent.mm.chatroom.ui.n3(this);

    public final boolean T6() {
        if (this.f63783s) {
            db5.e1.C(this, getString(com.tencent.mm.R.string.ays), "", getString(com.tencent.mm.R.string.ayu), getString(com.tencent.mm.R.string.ayt), false, new com.tencent.mm.chatroom.ui.q3(this), new com.tencent.mm.chatroom.ui.r3(this));
        } else {
            kn.m0.a(this.f63782r, 1, this.f63784t, this.f63780p.f397604t.size());
            finish();
        }
        return true;
    }

    public final void U6() {
        if (this.f63783s) {
            enableOptionMenu(0, true);
        } else {
            enableOptionMenu(0, false);
        }
    }

    public final void V6() {
        if (this.f63780p.f397604t.size() > 0) {
            this.f63771d.setVisibility(0);
        } else {
            this.f63771d.setVisibility(8);
        }
        if (this.f63781q.size() > 0) {
            this.f63773f.setVisibility(0);
        } else {
            this.f63773f.setVisibility(8);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488416sp;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        setBackGroundColorResource(com.tencent.mm.R.color.f478491c);
        setBackBtn(new com.tencent.mm.chatroom.ui.o3(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.ayv), new com.tencent.mm.chatroom.ui.s3(this), null, com.tencent.mm.ui.fb.GREEN);
        U6();
        this.f63771d = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.jb8);
        this.f63772e = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.jb9);
        this.f63773f = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.jb6);
        this.f63774g = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.jb7);
        this.f63778n = new com.tencent.mm.chatroom.ui.d4(getContext());
        this.f63772e.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this));
        this.f63772e.N(this.f63778n);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        java.util.LinkedList linkedList = this.f63780p.f397604t;
        com.tencent.mm.chatroom.ui.w3 w3Var = this.f63785u;
        com.tencent.mm.chatroom.ui.c4 c4Var = new com.tencent.mm.chatroom.ui.c4(context, true, linkedList, w3Var);
        this.f63776i = c4Var;
        this.f63772e.setAdapter(c4Var);
        this.f63776i.notifyDataSetChanged();
        this.f63774g.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this));
        this.f63774g.N(this.f63778n);
        this.f63779o = new com.tencent.mm.chatroom.ui.c4(getContext(), false, this.f63781q, w3Var);
        if (this.f63780p.v0()) {
            this.f63779o.f64070f = false;
        }
        this.f63774g.setAdapter(this.f63779o);
        this.f63779o.notifyDataSetChanged();
        V6();
        androidx.recyclerview.widget.g1 g1Var = new androidx.recyclerview.widget.g1(new com.tencent.mm.chatroom.ui.u3(this.f63780p.f397604t, new com.tencent.mm.chatroom.ui.p3(this)));
        this.f63777m = g1Var;
        g1Var.d(this.f63772e);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setSoftInputMode(32);
        java.lang.String stringExtra = getIntent().getStringExtra("key_chatroomname");
        this.f63782r = stringExtra;
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.roomtools.GroupToolsManagereUI", "mChatRoomName is null");
            finish();
        } else {
            rn.h y07 = ((nn.j) i95.n0.c(nn.j.class)).Di().y0(this.f63782r);
            this.f63780p = y07;
            if (y07 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.roomtools.GroupToolsManagereUI", "tools is null");
                finish();
            } else {
                java.util.ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("key_recent_use_tools");
                if (parcelableArrayListExtra == null) {
                    this.f63781q = new java.util.LinkedList();
                } else {
                    this.f63781q.addAll(parcelableArrayListExtra);
                }
                java.util.Iterator it = this.f63780p.f397604t.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.chatroom.storage.GroupToolItem groupToolItem = (com.tencent.mm.chatroom.storage.GroupToolItem) it.next();
                    if (this.f63781q.contains(groupToolItem)) {
                        this.f63781q.remove(groupToolItem);
                    }
                }
                this.f63784t = this.f63780p.f397604t.size();
                com.tencent.mars.xlog.Log.i("MicroMsg.roomtools.GroupToolsManagereUI", "mChatRoomName is %s, recentUseToolItemList:%s", this.f63782r, java.lang.Integer.valueOf(this.f63781q.size()));
            }
        }
        initView();
        gm0.j1.d().a(3546, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(3546, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyUp(i17, keyEvent);
        }
        T6();
        return true;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.roomtools.GroupToolsManagereUI", "onSceneEnd errType = %d, errCode = %d, errMsg = %s, scenetype:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(m1Var.getType()));
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f63775h;
        if (u3Var != null && u3Var.isShowing()) {
            this.f63775h.dismiss();
        }
        if (i17 == 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.roomtools.GroupToolsManagereUI", "onSceneEnd result:%s", java.lang.Boolean.valueOf(((nn.j) i95.n0.c(nn.j.class)).Di().update(this.f63780p, new java.lang.String[0])));
            kn.m0.a(this.f63782r, 3, this.f63784t, this.f63780p.f397604t.size());
            finish();
        } else {
            androidx.appcompat.app.AppCompatActivity context = getContext();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = getString(com.tencent.mm.R.string.k4u);
            }
            db5.t7.makeText(context, str, 0).show();
        }
    }
}

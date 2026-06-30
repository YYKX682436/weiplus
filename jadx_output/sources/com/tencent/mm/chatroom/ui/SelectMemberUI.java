package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class SelectMemberUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.ui.contact.l4, com.tencent.mm.ui.contact.n4 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f63971d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f63972e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f63973f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f63974g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.chatroom.ui.SelectMemberScrollBar f63975h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.contact.e5 f63976i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.chatroom.ui.kd f63977m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.storage.a3 f63978n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f63979o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f63980p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.HashSet f63981q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Map f63982r = new java.util.HashMap();

    /* renamed from: s, reason: collision with root package name */
    public boolean f63983s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f63984t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f63985u;

    @Override // com.tencent.mm.ui.contact.l4
    public android.widget.ListView O3() {
        return this.f63971d;
    }

    public android.widget.BaseAdapter T6() {
        return this.f63977m;
    }

    public java.util.HashSet U6() {
        return new java.util.HashSet();
    }

    public java.util.HashSet V6() {
        return new java.util.HashSet();
    }

    @Override // com.tencent.mm.ui.contact.l4
    public java.lang.String W5(com.tencent.mm.ui.contact.item.d dVar) {
        return null;
    }

    public void W6() {
        java.lang.String stringExtra = getIntent().getStringExtra("RoomInfo_Id");
        this.f63979o = stringExtra;
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectMemberUI", "[getIntentParams] roomId:%s", stringExtra);
        this.f63978n = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(this.f63979o);
        getIntent().getIntExtra("from_scene", 0);
        this.f63980p = getIntent().getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        this.f63983s = getIntent().getBooleanExtra("is_show_owner", true);
        this.f63984t = getIntent().getBooleanExtra("is_mulit_select_mode", false);
        this.f63981q = new java.util.HashSet();
    }

    public boolean X6() {
        return this.f63984t;
    }

    public boolean Y6() {
        return !(this instanceof com.tencent.mm.chatroom.ui.SelectDelMemberUI);
    }

    public java.util.List Z6() {
        return this.f63978n.A0();
    }

    public void a7(android.view.View view, int i17, long j17) {
    }

    public void b7(android.view.View view, android.widget.LinearLayout linearLayout, android.widget.ImageButton imageButton, int i17, java.lang.String str) {
        if (V6().contains(str)) {
            return;
        }
        boolean contains = this.f63981q.contains(str);
        java.util.Map map = this.f63982r;
        if (contains) {
            ((java.util.HashMap) map).remove(str);
            this.f63981q.remove(str);
            imageButton.setImageResource(com.tencent.mm.R.drawable.f481256oo);
            linearLayout.setTag(com.tencent.mm.R.id.cec, java.lang.Boolean.FALSE);
            return;
        }
        java.lang.String str2 = null;
        if (view != null) {
            java.lang.Object tag = view.getTag(com.tencent.mm.R.id.vcb);
            if (tag instanceof java.lang.String) {
                str2 = (java.lang.String) tag;
            }
        }
        if (!android.text.TextUtils.isEmpty(str2)) {
            ((java.util.HashMap) map).put(str, str2);
        }
        this.f63981q.add(str);
        imageButton.setImageResource(com.tencent.mm.R.raw.checkbox_selected);
        linearLayout.setTag(com.tencent.mm.R.id.cec, java.lang.Boolean.TRUE);
    }

    public boolean c7() {
        return !(this instanceof com.tencent.mm.chatroom.ui.SelectAddRoomManagerUI);
    }

    @Override // com.tencent.mm.ui.contact.n4
    public void d4(java.lang.String str, int i17, boolean z17) {
        runOnUiThread(new com.tencent.mm.chatroom.ui.ad(this, str, i17));
    }

    @Override // com.tencent.mm.ui.contact.l4
    public android.app.Activity getActivity() {
        return this;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cjx;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        java.lang.String str = this.f63980p;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        setMMTitle(str);
        this.f63971d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f485880jf5);
        this.f63973f = findViewById(com.tencent.mm.R.id.mjj);
        this.f63974g = findViewById(com.tencent.mm.R.id.mjl);
        this.f63985u = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484228dg2);
        com.tencent.mm.storage.a3 a3Var = this.f63978n;
        this.f63977m = new com.tencent.mm.chatroom.ui.kd(this, this, a3Var, this.f63979o, a3Var.field_roomowner);
        java.util.HashSet hashSet = new java.util.HashSet();
        if (!(this instanceof com.tencent.mm.chatroom.ui.SeeMemberRecordUI)) {
            hashSet.add(c01.z1.r());
        }
        com.tencent.mm.ui.contact.e5 e5Var = new com.tencent.mm.ui.contact.e5(this, this.f63979o, 0, X6(), hashSet);
        this.f63976i = e5Var;
        e5Var.f207051i = this;
        this.f63971d.setAdapter((android.widget.ListAdapter) T6());
        com.tencent.mm.chatroom.ui.SelectMemberScrollBar selectMemberScrollBar = (com.tencent.mm.chatroom.ui.SelectMemberScrollBar) findViewById(com.tencent.mm.R.id.jft);
        this.f63975h = selectMemberScrollBar;
        selectMemberScrollBar.setOnScrollBarTouchListener(new com.tencent.mm.chatroom.ui.vc(this));
        if (Y6()) {
            this.f63975h.setVisibility(0);
        } else {
            this.f63975h.setVisibility(8);
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) findViewById(com.tencent.mm.R.id.mjh);
        this.f63972e = mMEditText;
        mMEditText.addTextChangedListener(new com.tencent.mm.chatroom.ui.xc(this));
        com.tencent.mm.chatroom.ui.kd kdVar = this.f63977m;
        android.view.View view = kdVar.f64292o.f63974g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter", "loadData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter", "loadData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        gm0.j1.e().j(new com.tencent.mm.chatroom.ui.dd(kdVar));
        setBackBtn(new com.tencent.mm.chatroom.ui.yc(this));
        if (c7()) {
            this.f63971d.setOnItemClickListener(new com.tencent.mm.chatroom.ui.zc(this));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectMemberUI", "[onCreate]");
        W6();
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.f63976i.k();
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.contact.l4
    public boolean p5(com.tencent.mm.ui.contact.item.d dVar) {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(sn.c.class);
    }

    public boolean t4(com.tencent.mm.ui.contact.item.d dVar) {
        return false;
    }
}

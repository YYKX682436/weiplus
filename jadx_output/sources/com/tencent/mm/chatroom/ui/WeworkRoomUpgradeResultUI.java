package com.tencent.mm.chatroom.ui;

/* loaded from: classes3.dex */
public class WeworkRoomUpgradeResultUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f64008d;

    /* renamed from: e, reason: collision with root package name */
    public int f64009e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f64010f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f64011g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f64012h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f64013i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f64014m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f64015n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f64016o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f64017p;

    /* renamed from: q, reason: collision with root package name */
    public androidx.recyclerview.widget.LinearLayoutManager f64018q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.chatroom.ui.qe f64019r;

    public static void T6(android.content.Context context) {
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeworkRoomUpgradeResultUI", "gotoWeWork context null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(android.net.Uri.parse("wxwork://jump"));
        intent.setPackage("com.tencent.wework");
        intent.setFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/chatroom/ui/WeworkRoomUpgradeResultUI", "gotoWeWork", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/chatroom/ui/WeworkRoomUpgradeResultUI", "gotoWeWork", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d_f;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        setBackGroundColorResource(com.tencent.mm.R.color.f478491c);
        setMMTitle("");
        if (getSupportActionBar() != null) {
            getSupportActionBar().o();
        }
        this.f64013i = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.h5n);
        this.f64014m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483930ci1);
        this.f64015n = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.a5b);
        this.f64016o = (android.widget.Button) findViewById(com.tencent.mm.R.id.g6_);
        this.f64017p = (android.widget.Button) findViewById(com.tencent.mm.R.id.gsu);
        if (this.f64009e != 3) {
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.f483923ch1)).setText(this.f64010f);
            this.f64015n.setVisibility(8);
            this.f64016o.setVisibility(0);
            this.f64017p.setVisibility(8);
            this.f64016o.setOnClickListener(new com.tencent.mm.chatroom.ui.pe(this));
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f64013i.getLayoutParams();
        layoutParams.topMargin = i65.a.b(this, 48);
        this.f64013i.setLayoutParams(layoutParams);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.f64014m.getLayoutParams();
        layoutParams2.topMargin = i65.a.b(this, 16);
        this.f64014m.setLayoutParams(layoutParams2);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f483923ch1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/chatroom/ui/WeworkRoomUpgradeResultUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/chatroom/ui/WeworkRoomUpgradeResultUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f64015n.setVisibility(0);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(this);
        this.f64018q = linearLayoutManager;
        linearLayoutManager.Q(1);
        this.f64015n.setLayoutManager(this.f64018q);
        this.f64015n.N(new com.tencent.mm.chatroom.ui.r4(getContext(), 0.5f, 56.0f));
        com.tencent.mm.chatroom.ui.qe qeVar = new com.tencent.mm.chatroom.ui.qe(getContext(), this.f64011g, this.f64012h);
        this.f64019r = qeVar;
        this.f64015n.setAdapter(qeVar);
        this.f64019r.notifyDataSetChanged();
        this.f64016o.setVisibility(8);
        this.f64017p.setVisibility(0);
        this.f64017p.setOnClickListener(new com.tencent.mm.chatroom.ui.oe(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        this.f64008d = getIntent().getStringExtra("RoomInfo_Id");
        boolean z17 = false;
        int intExtra = getIntent().getIntExtra("upgrade_openim_room_from_scene", 0);
        this.f64009e = intExtra;
        com.tencent.mars.xlog.Log.i("MicroMsg.WeworkRoomUpgradeResultUI", "mFromScene:%s", java.lang.Integer.valueOf(intExtra));
        if (this.f64009e == 3 || !com.tencent.mm.sdk.platformtools.t8.K0(this.f64008d)) {
            this.f64010f = getIntent().getStringExtra("popup_wording");
            this.f64011g = getIntent().getStringArrayListExtra("wework_upgrade_success_list");
            this.f64012h = getIntent().getStringArrayListExtra("wework_upgrade_fail_list");
            z17 = true;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeworkRoomUpgradeResultUI", "mRoomId is null");
            finish();
        }
        if (z17) {
            initView();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}

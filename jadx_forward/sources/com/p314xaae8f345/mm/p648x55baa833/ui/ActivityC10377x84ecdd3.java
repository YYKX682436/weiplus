package com.p314xaae8f345.mm.p648x55baa833.ui;

/* renamed from: com.tencent.mm.chatroom.ui.WeworkRoomUpgradeResultUI */
/* loaded from: classes3.dex */
public class ActivityC10377x84ecdd3 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f145541d;

    /* renamed from: e, reason: collision with root package name */
    public int f145542e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f145543f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f145544g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f145545h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f145546i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f145547m;

    /* renamed from: n, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f145548n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f145549o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f145550p;

    /* renamed from: q, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f145551q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p648x55baa833.ui.qe f145552r;

    public static void T6(android.content.Context context) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeworkRoomUpgradeResultUI", "gotoWeWork context null");
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

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d_f;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
        mo54450xbf7c1df6("");
        if (mo2533x106ab264() != null) {
            mo2533x106ab264().o();
        }
        this.f145546i = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.h5n);
        this.f145547m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565463ci1);
        this.f145548n = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.a5b);
        this.f145549o = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.g6_);
        this.f145550p = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.gsu);
        if (this.f145542e != 3) {
            ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565456ch1)).setText(this.f145543f);
            this.f145548n.setVisibility(8);
            this.f145549o.setVisibility(0);
            this.f145550p.setVisibility(8);
            this.f145549o.setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.pe(this));
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f145546i.getLayoutParams();
        layoutParams.topMargin = i65.a.b(this, 48);
        this.f145546i.setLayoutParams(layoutParams);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.f145547m.getLayoutParams();
        layoutParams2.topMargin = i65.a.b(this, 16);
        this.f145547m.setLayoutParams(layoutParams2);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f565456ch1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/chatroom/ui/WeworkRoomUpgradeResultUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/chatroom/ui/WeworkRoomUpgradeResultUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f145548n.setVisibility(0);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this);
        this.f145551q = c1162x665295de;
        c1162x665295de.Q(1);
        this.f145548n.mo7967x900dcbe1(this.f145551q);
        this.f145548n.N(new com.p314xaae8f345.mm.p648x55baa833.ui.r4(mo55332x76847179(), 0.5f, 56.0f));
        com.p314xaae8f345.mm.p648x55baa833.ui.qe qeVar = new com.p314xaae8f345.mm.p648x55baa833.ui.qe(mo55332x76847179(), this.f145544g, this.f145545h);
        this.f145552r = qeVar;
        this.f145548n.mo7960x6cab2c8d(qeVar);
        this.f145552r.m8146xced61ae5();
        this.f145549o.setVisibility(8);
        this.f145550p.setVisibility(0);
        this.f145550p.setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.oe(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        this.f145541d = getIntent().getStringExtra("RoomInfo_Id");
        boolean z17 = false;
        int intExtra = getIntent().getIntExtra("upgrade_openim_room_from_scene", 0);
        this.f145542e = intExtra;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeworkRoomUpgradeResultUI", "mFromScene:%s", java.lang.Integer.valueOf(intExtra));
        if (this.f145542e == 3 || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f145541d)) {
            this.f145543f = getIntent().getStringExtra("popup_wording");
            this.f145544g = getIntent().getStringArrayListExtra("wework_upgrade_success_list");
            this.f145545h = getIntent().getStringArrayListExtra("wework_upgrade_fail_list");
            z17 = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeworkRoomUpgradeResultUI", "mRoomId is null");
            finish();
        }
        if (z17) {
            mo43517x10010bd5();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}

package com.p314xaae8f345.mm.ui.p2646xfa354eeb;

/* renamed from: com.tencent.mm.ui.bizchat.BizChatAtSomeoneUI */
/* loaded from: classes11.dex */
public class ActivityC21583x3a52b428 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: o, reason: collision with root package name */
    public static boolean f279419o;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f279420d;

    /* renamed from: e, reason: collision with root package name */
    public hb5.e f279421e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f279422f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f279423g;

    /* renamed from: h, reason: collision with root package name */
    public s01.h f279424h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.c9 f279425i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f279426m;

    /* renamed from: n, reason: collision with root package name */
    public long f279427n;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569692ir;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        java.lang.String[] strArr;
        mo54450xbf7c1df6(this.f279426m);
        mo54448x9c8c0d33(new hb5.a(this));
        com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.c9(true, true);
        this.f279425i = c9Var;
        c9Var.f291857i = new hb5.b(this);
        m78489xd6d59aa8(true, c9Var);
        this.f279420d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.bgy);
        s01.a0 a0Var = new s01.a0();
        s01.h hVar = this.f279424h;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f279423g)) {
            strArr = null;
        } else {
            strArr = this.f279423g.split(";");
            java.util.Arrays.toString(strArr);
        }
        java.lang.String[] strArr2 = strArr;
        java.util.List linkedList = new java.util.LinkedList();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f279422f)) {
            linkedList = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(this.f279422f.split(";"));
        }
        this.f279421e = new hb5.e(this, a0Var, hVar, strArr2, linkedList);
        this.f279420d.setOnItemClickListener(new hb5.c(this));
        this.f279420d.setAdapter((android.widget.ListAdapter) this.f279421e);
        this.f279420d.setOnScrollListener(new hb5.d(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f279422f = getIntent().getStringExtra("Block_list");
        this.f279423g = getIntent().getStringExtra("Chatroom_member_list");
        getIntent().getStringExtra("Chat_User");
        this.f279426m = getIntent().getStringExtra("Add_address_titile");
        this.f279427n = getIntent().getLongExtra("key_biz_chat_id", -1L);
        s01.h z07 = r01.q3.Ui().z0(this.f279427n);
        this.f279424h = z07;
        if (z07.f69178x60615314.equals(c01.z1.r())) {
            f279419o = true;
        }
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.f279421e.c();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = this.f279425i;
        if (c9Var != null) {
            c9Var.b();
        }
    }
}

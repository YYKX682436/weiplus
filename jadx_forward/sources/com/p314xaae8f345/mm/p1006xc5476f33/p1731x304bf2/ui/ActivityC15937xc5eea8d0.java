package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.plugin.game.ui.CreateOrJoinChatroomUI */
/* loaded from: classes9.dex */
public class ActivityC15937xc5eea8d0 extends com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f222178q = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f222179e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f222180f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f222181g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f222182h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f222183i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f222184m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f222185n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f222186o;

    /* renamed from: p, reason: collision with root package name */
    public android.app.ProgressDialog f222187p = null;

    public static void O6(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15937xc5eea8d0 activityC15937xc5eea8d0, java.lang.String str) {
        activityC15937xc5eea8d0.getClass();
        android.content.Intent intent = new android.content.Intent();
        java.lang.String Zi = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(activityC15937xc5eea8d0, activityC15937xc5eea8d0.f222181g);
        intent.putExtra("action", activityC15937xc5eea8d0.f222179e);
        intent.putExtra("app_name", Zi);
        intent.putExtra("rawUrl", str);
        j45.l.n(activityC15937xc5eea8d0, "webview", ".ui.tools.game.GameChattingRoomWebViewUI", intent, 5);
    }

    public final void P6() {
        android.app.ProgressDialog progressDialog = this.f222187p;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f222187p.cancel();
    }

    public final void Q6(int i17) {
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = this.f222181g;
        ((kt.c) i0Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str);
        android.os.Bundle bundle = new android.os.Bundle();
        if (this.f222179e.equals("action_create")) {
            com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11233x50febd6f.Resp resp = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11233x50febd6f.Resp();
            if (h17 != null) {
                resp.f32869xc3c3c505 = h17.f67384x996f3ea;
            }
            resp.f32870x7fa0d2de = this.f222182h;
            resp.f32897xb32a65a0 = this.f222186o;
            resp.f32867xa7c470f2 = i17;
            resp.mo48431x792022dd(bundle);
        } else if (this.f222179e.equals("action_join")) {
            com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11236x99f739d.Resp resp2 = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11236x99f739d.Resp();
            if (h17 != null) {
                resp2.f32869xc3c3c505 = h17.f67384x996f3ea;
            }
            resp2.f32870x7fa0d2de = this.f222182h;
            resp2.f32906xb32a65a0 = this.f222186o;
            resp2.f32867xa7c470f2 = i17;
            resp2.mo48431x792022dd(bundle);
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args args = new com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args();
        args.f32706x6a744ba6 = this.f222180f;
        args.f32701xaddf3082 = bundle;
        args.f32703x5cfee87 = 268435456;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.g(bundle);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.h(bundle);
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.m48400x35cf88(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, args);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 5) {
            if (i18 == 4) {
                Q6(0);
            } else if (i18 == 5) {
                if (intent != null) {
                    ((com.p314xaae8f345.mm.app.p622xc5476f33.j) o25.z1.a()).b(this, intent.getStringExtra("rawUrl"), true, null, null);
                }
            } else if (i18 == 0) {
                Q6(-2);
            }
        }
        finish();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreateOrJoinChatroomUI", "onCreate");
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.a(this);
        android.content.Intent intent = getIntent();
        this.f222179e = intent.getStringExtra("action");
        this.f222180f = intent.getStringExtra("package_name");
        this.f222181g = intent.getStringExtra("key_app_id");
        this.f222182h = intent.getStringExtra("key_transaction");
        this.f222183i = intent.getStringExtra(ya.b.f77478x4cd4defb);
        this.f222184m = intent.getStringExtra("chatroom_name");
        this.f222185n = intent.getStringExtra("chatroom_nickname");
        this.f222186o = intent.getStringExtra("ext_msg");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f222179e) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f222181g) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f222183i)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CreateOrJoinChatroomUI", "Invalid args");
            finish();
            return;
        }
        this.f222187p = db5.e1.Q(this, "", getBaseContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fpq), true, true, null);
        if (!this.f222179e.equals("action_create")) {
            if (this.f222179e.equals("action_join")) {
                com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                lVar.f152197a = new m53.j1();
                lVar.f152198b = new m53.k1();
                lVar.f152199c = "/cgi-bin/mmgame-bin/gamejoinchatroom";
                lVar.f152200d = 1206;
                com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
                m53.j1 j1Var = (m53.j1) a17.f152243a.f152217a;
                j1Var.f405341d = this.f222181g;
                j1Var.f405342e = this.f222183i;
                java.lang.String str = this.f222185n;
                j1Var.f405343f = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(str == null ? new byte[0] : str.getBytes());
                com.p314xaae8f345.mm.p944x882e457a.z2.d(a17, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.q(this), false);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreateOrJoinChatroomUI", "createChatroom, appid = %s, groupId = %s, ChatRoomName = %s", this.f222181g, this.f222183i, this.f222184m);
        com.p314xaae8f345.mm.p944x882e457a.l lVar2 = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar2.f152197a = new m53.s0();
        lVar2.f152198b = new m53.t0();
        lVar2.f152199c = "/cgi-bin/mmgame-bin/gamecreatechatroom";
        lVar2.f152200d = 1205;
        com.p314xaae8f345.mm.p944x882e457a.o a18 = lVar2.a();
        m53.s0 s0Var = (m53.s0) a18.f152243a.f152217a;
        s0Var.f405571d = this.f222181g;
        s0Var.f405572e = this.f222183i;
        java.lang.String str2 = this.f222184m;
        s0Var.f405573f = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(str2 == null ? new byte[0] : str2.getBytes());
        java.lang.String str3 = this.f222185n;
        s0Var.f405574g = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(str3 == null ? new byte[0] : str3.getBytes());
        com.p314xaae8f345.mm.p944x882e457a.z2.d(a18, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p(this), false);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        P6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.f(this);
        super.onDestroy();
    }
}

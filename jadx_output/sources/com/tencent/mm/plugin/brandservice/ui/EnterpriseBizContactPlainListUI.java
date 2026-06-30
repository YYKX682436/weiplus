package com.tencent.mm.plugin.brandservice.ui;

/* loaded from: classes9.dex */
public class EnterpriseBizContactPlainListUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public or1.f1 f94022d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f94023e;

    /* renamed from: f, reason: collision with root package name */
    public int f94024f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f94025g;

    /* renamed from: h, reason: collision with root package name */
    public long f94026h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f94027i;

    public static void T6(com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI enterpriseBizContactPlainListUI, int i17) {
        java.lang.String str;
        qk.g d17;
        r45.co coVar = (r45.co) enterpriseBizContactPlainListUI.f94022d.getItem(i17);
        if (coVar == null || (str = coVar.f371676d) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrandService.EnterpriseBizContactPlainListUI", "item is null.");
            return;
        }
        int i18 = enterpriseBizContactPlainListUI.f94024f;
        if (i18 == 1) {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str2 = coVar.f371676d;
            ((sg3.a) v0Var).getClass();
            ((r35.k1) ((o25.q1) i95.n0.c(o25.q1.class))).wi(enterpriseBizContactPlainListUI.mController, null, coVar.f371676d, enterpriseBizContactPlainListUI.getString(com.tencent.mm.R.string.i28), c01.a2.b(str2), null, enterpriseBizContactPlainListUI.getString(com.tencent.mm.R.string.f490551ya), new or1.z0(enterpriseBizContactPlainListUI, coVar));
            return;
        }
        if (i18 == 2) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", coVar.f371676d);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent, enterpriseBizContactPlainListUI);
            return;
        }
        if (i18 == 3) {
            java.util.HashMap hashMap = (java.util.HashMap) enterpriseBizContactPlainListUI.getIntent().getSerializableExtra("enterprise_extra_params");
            java.lang.String str3 = (java.lang.String) hashMap.get("img_url");
            java.lang.String str4 = (java.lang.String) hashMap.get("desc");
            java.lang.String str5 = (java.lang.String) hashMap.get(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            java.lang.String str6 = coVar.f371676d;
            r35.u3 u3Var = r35.t3.f369263a;
            com.tencent.mm.ui.ga controller = enterpriseBizContactPlainListUI.getController();
            java.lang.String string = enterpriseBizContactPlainListUI.getResources().getString(com.tencent.mm.R.string.f490551ya);
            or1.a1 a1Var = new or1.a1(enterpriseBizContactPlainListUI, str6);
            ((ez.z0) u3Var).getClass();
            r35.j1.j(controller, str5, str3, str4, null, false, string, a1Var);
            return;
        }
        if (i18 == 4) {
            qk.o b17 = r01.z.b(str);
            java.lang.String str7 = null;
            if (b17 != null) {
                b17.A0();
                qk.n nVar = b17.f364301x1;
                if (nVar != null && (d17 = nVar.d()) != null) {
                    str7 = d17.f364119d;
                }
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
                return;
            }
            r01.m y07 = r01.q3.bj().y0(b17.y0());
            int i19 = y07 != null ? y07.field_qyUin : 0;
            int i27 = y07 != null ? y07.field_userUin : 0;
            r01.m y08 = r01.q3.bj().y0(b17.field_username);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13419, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(y08 != null ? y08.field_qyUin : 0), java.lang.Integer.valueOf(i27), 1);
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("rawUrl", str7);
            intent2.putExtra("useJs", true);
            intent2.putExtra("srcUsername", coVar.f371676d);
            intent2.putExtra("enterprise_biz_name", enterpriseBizContactPlainListUI.f94025g);
            intent2.putExtra("biz_chat_chat_id", enterpriseBizContactPlainListUI.f94026h);
            j45.l.n(enterpriseBizContactPlainListUI.getContext(), "webview", ".ui.tools.WebViewUI", intent2, 1);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488742a93;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f94023e = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f484233dh2);
        if (this.f94022d == null) {
            this.f94022d = new or1.f1(this, this);
            this.f94027i = new or1.w0(this);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandService.EnterpriseBizContactPlainListUI", "count = %s", java.lang.Integer.valueOf(this.f94022d.getCount()));
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f94025g, true);
        if (this.f94024f == 2) {
            setMMTitle(com.tencent.mm.R.string.c1_);
        } else if (n17 != null) {
            setMMTitle(n17.f2());
        }
        if (n17 == null || !n17.r2() || this.f94022d.getCount() <= 0) {
            this.f94023e.setVisibility(8);
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484234dh3);
            textView.setText(com.tencent.mm.R.string.c1g);
            textView.setVisibility(0);
        } else {
            this.f94023e.setVisibility(0);
            this.f94023e.setAdapter((android.widget.ListAdapter) this.f94022d);
            this.f94023e.setOnItemClickListener(this.f94027i);
        }
        setBackBtn(new or1.x0(this));
        setToTop(new or1.y0(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (this.f94024f == 4) {
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f94024f = getIntent().getIntExtra("enterprise_scene", 2);
        this.f94025g = getIntent().getStringExtra("enterprise_biz_name");
        this.f94026h = getIntent().getLongExtra("biz_chat_chat_id", -1L);
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandService.EnterpriseBizContactPlainListUI", "bizName = %s", this.f94025g);
        initView();
        r01.q3.cj().add(this.f94022d);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this.f94022d);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        r01.q3.cj().remove(this.f94022d);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this.f94022d);
        this.f94022d.c();
        or1.f1 f1Var = this.f94022d;
        bb5.g gVar = f1Var.f347491p;
        if (gVar != null) {
            gVar.a();
            f1Var.f347491p = null;
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (c01.e2.J(this.f94025g)) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.BrandService.EnterpriseBizContactPlainListUI", "%s !isContact", this.f94025g);
        finish();
    }
}

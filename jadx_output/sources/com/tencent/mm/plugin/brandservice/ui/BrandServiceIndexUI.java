package com.tencent.mm.plugin.brandservice.ui;

@gm0.a2
/* loaded from: classes9.dex */
public class BrandServiceIndexUI extends com.tencent.mm.ui.MMActivity implements l75.q0, pr1.i {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f93993p = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView f93995e;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f93994d = null;

    /* renamed from: f, reason: collision with root package name */
    public int f93996f = 251658241;

    /* renamed from: g, reason: collision with root package name */
    public boolean f93997g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f93998h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f93999i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f94000m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f94001n = false;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashSet f94002o = new java.util.HashSet();

    @Override // pr1.i
    public void S4(int i17, java.lang.String str) {
        if (this.f93996f == 1) {
            java.util.HashSet hashSet = this.f94002o;
            if (hashSet.contains(java.lang.Integer.valueOf(i17))) {
                return;
            }
            hashSet.add(java.lang.Integer.valueOf(i17));
            boolean z17 = this.f93999i;
            java.lang.String str2 = z17 ? "7_2" : "7_3";
            java.lang.String str3 = z17 ? "me_bizlist" : "contacts_bizlist";
            com.tencent.wechat.mm.brand_service.x xVar = new com.tencent.wechat.mm.brand_service.x();
            xVar.f219215g = com.tencent.wechat.mm.brand_service.w.Expose;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            xVar.f219214f = java.lang.System.currentTimeMillis();
            xVar.f219216h = str2;
            xVar.f219217i = str3;
            if (str == null) {
                str = "";
            }
            xVar.f219218m = str;
            xVar.f219220o = java.lang.String.valueOf(i17 + 1);
            if (this.f93999i) {
                xVar.f219212d = com.tencent.wechat.aff.brand_service.a.f216045b.b();
            }
            com.tencent.wechat.aff.brand_service.a aVar = com.tencent.wechat.aff.brand_service.a.f216045b;
            com.tencent.wechat.mm.brand_service.y yVar = new com.tencent.wechat.mm.brand_service.y();
            yVar.f219254d = xVar;
            aVar.f(yVar);
        }
    }

    @Override // pr1.i
    public void X5(int i17, java.lang.String str) {
    }

    @Override // pr1.i
    public void b6(int i17, java.lang.String str) {
        if (this.f93996f == 1) {
            boolean z17 = this.f93999i;
            java.lang.String str2 = z17 ? "7_2" : "7_3";
            java.lang.String str3 = z17 ? "me_bizlist" : "contacts_bizlist";
            com.tencent.wechat.mm.brand_service.x xVar = new com.tencent.wechat.mm.brand_service.x();
            xVar.f219215g = com.tencent.wechat.mm.brand_service.w.Click;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            xVar.f219214f = java.lang.System.currentTimeMillis();
            xVar.f219216h = str2;
            xVar.f219217i = str3;
            if (str == null) {
                str = "";
            }
            xVar.f219218m = str;
            xVar.f219220o = java.lang.String.valueOf(i17 + 1);
            if (this.f93999i) {
                xVar.f219212d = com.tencent.wechat.aff.brand_service.a.f216045b.b();
            }
            com.tencent.wechat.aff.brand_service.a aVar = com.tencent.wechat.aff.brand_service.a.f216045b;
            com.tencent.wechat.mm.brand_service.y yVar = new com.tencent.wechat.mm.brand_service.y();
            yVar.f219254d = xVar;
            aVar.f(yVar);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488246o0;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        int i17 = this.f93996f;
        if (i17 == 251658241 || i17 == 0) {
            setMMTitle(com.tencent.mm.R.string.f489922fj);
        } else if (i17 == 1) {
            setMMTitle(com.tencent.mm.R.string.me9);
        }
        com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView = (com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView) findViewById(com.tencent.mm.R.id.ndr);
        this.f93995e = brandServiceSortView;
        brandServiceSortView.setServiceType(this.f93996f);
        this.f93995e.setShowFooterView(true);
        this.f93995e.setReturnResult(this.f94001n);
        this.f93995e.setDelegate(this);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kn9);
        this.f93994d = textView;
        textView.setOnClickListener(new or1.s(this));
        this.f93994d.setVisibility(8);
        setBackBtn(new or1.t(this));
        if (((qk.s6) gm0.j1.s(qk.s6.class)).hh() && this.f93997g) {
            addIconOptionMenu(0, com.tencent.mm.R.string.jzr, com.tencent.mm.R.raw.actionbar_icon_dark_search, new or1.u(this));
        }
        if (this.f93998h) {
            addIconOptionMenu(1, com.tencent.mm.R.string.jzq, com.tencent.mm.R.raw.actionbar_icon_dark_more, new or1.v(this));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1 && i18 == -1 && this.f94001n) {
            setResult(-1, intent);
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f93996f = getIntent().getIntExtra("intent_service_type", 251658241);
        this.f93997g = getIntent().getBooleanExtra("intent_should_show_search", true);
        this.f93998h = getIntent().getBooleanExtra("intent_should_show_menu", true);
        this.f93999i = getIntent().getBooleanExtra("intent_is_from_brand_service", false);
        this.f94001n = com.tencent.mm.ui.contact.i5.d(getIntent().getIntExtra("list_attr", 0), 16384);
        initView();
        r01.q3.cj().add(this);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1378L, 7L, 1L, false);
        int i17 = this.f93996f;
        if (i17 == 0) {
            ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.BrandServiceIndexUI)).Rj(this, iy1.a.ServiceBizList);
            return;
        }
        if (i17 == 1) {
            ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.BrandServiceContactsUI)).Rj(this, iy1.a.ServiceChat);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        if (gm0.j1.a()) {
            this.f93995e.j();
            r01.q3.cj().remove(this);
        }
        super.onDestroy();
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        this.f94000m = true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        gm0.j1.i();
        gm0.j1.u().c().w(233474, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        gm0.j1.i();
        gm0.j1.u().c().w(233473, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        gm0.j1.i();
        gm0.j1.u().c().w(233476, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        if (this.f94000m) {
            this.f94000m = false;
            this.f93995e.i();
        }
        super.onResume();
        ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
        enableOptionMenu(1, true);
    }
}

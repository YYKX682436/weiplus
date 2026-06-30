package com.tencent.mm.plugin.address.ui;

@db5.a(8192)
/* loaded from: classes15.dex */
public class InvoiceListUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f74424o = 0;

    /* renamed from: d, reason: collision with root package name */
    public i83.b f74425d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.address.ui.b0 f74426e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ListView f74427f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f74428g = new java.lang.Object();

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f74429h = null;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f74430i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public boolean f74431m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f74432n = false;

    public final void T6(int i17) {
        android.content.Intent intent = new android.content.Intent();
        if (i17 != 0) {
            intent.setClass(this, com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI.class);
            intent.putExtra("invoice_id", i17);
        } else {
            intent.setClass(this, com.tencent.mm.plugin.address.ui.AddInvoiceUI.class);
            intent.putExtra("launch_from_invoicelist_webview", this.f74431m);
            intent.putExtra("invoice_id", i17);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/address/ui/InvoiceListUI", "editInvoiceUI", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/address/ui/InvoiceListUI", "editInvoiceUI", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void U6() {
        synchronized (this.f74428g) {
            o71.l.wi();
            java.util.LinkedList linkedList = o71.l.Ai().f352473a.f289633d;
            this.f74430i = linkedList;
            this.f74426e.f74521e = linkedList;
            linkedList.size();
            this.f74426e.notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.blg;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hb7);
        this.f74429h = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (this.f74431m) {
            android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hp_);
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        } else {
            android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hp_);
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
        }
        this.f74429h.setOnClickListener(new com.tencent.mm.plugin.address.ui.t(this));
        this.f74427f = (android.widget.ListView) findViewById(com.tencent.mm.R.id.mpv);
        com.tencent.mm.plugin.address.ui.b0 b0Var = new com.tencent.mm.plugin.address.ui.b0(this, this);
        this.f74426e = b0Var;
        this.f74427f.setAdapter((android.widget.ListAdapter) b0Var);
        this.f74427f.setOnItemClickListener(new com.tencent.mm.plugin.address.ui.u(this));
        this.f74427f.setOnItemLongClickListener(new com.tencent.mm.plugin.address.ui.w(this));
        this.f74426e.notifyDataSetChanged();
        setBackBtn(new com.tencent.mm.plugin.address.ui.x(this));
        addIconOptionMenu(0, com.tencent.mm.R.string.ip6, com.tencent.mm.R.raw.actionbar_icon_dark_add, new com.tencent.mm.plugin.address.ui.y(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        i83.b bVar;
        if (i17 == 1) {
            if (-1 == i18) {
                if (intent == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.InvoiceUtil", "intent is null");
                    bVar = null;
                } else {
                    bVar = new i83.b();
                    java.lang.String stringExtra = intent.getStringExtra("type");
                    bVar.f289635e = stringExtra;
                    if (stringExtra == null || !stringExtra.equals("1")) {
                        bVar.f289636f = intent.getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                        bVar.f289638h = intent.getStringExtra("tax_number");
                        bVar.f289645r = intent.getStringExtra("company_address");
                        bVar.f289642o = intent.getStringExtra("telephone");
                        bVar.f289640m = intent.getStringExtra("bank_name");
                        bVar.f289639i = intent.getStringExtra("bank_account");
                    } else {
                        bVar.f289637g = intent.getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                    }
                }
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("choose_invoice_title_info", t71.e.a(bVar));
                setResult(-1, intent2);
            } else {
                setResult(0);
            }
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        this.f74431m = intent.getBooleanExtra("launch_from_webview", false);
        boolean booleanExtra = intent.getBooleanExtra("launch_from_appbrand", false);
        if (this.f74431m || booleanExtra) {
            this.f74431m = true;
        }
        if (this.f74431m) {
            com.tencent.mm.storage.n3 p17 = c01.d9.b().p();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_INVOICE_HAS_SHOW_DISCLAIMER_DIALOG_BOOLEAN_SYNC;
            boolean booleanValue = ((java.lang.Boolean) p17.m(u3Var, java.lang.Boolean.TRUE)).booleanValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.InvoiceListUI", "showDisclaimerDailog..isShowDisclaimerDialog " + booleanValue);
            if (booleanValue) {
                com.tencent.mars.xlog.Log.i("MicroMsg.InvoiceListUI", "showDisclaimerDialog");
                db5.e1.E(this, getString(com.tencent.mm.R.string.f492333g33), getString(com.tencent.mm.R.string.f492334g34), getString(com.tencent.mm.R.string.f489708h), false, new com.tencent.mm.plugin.address.ui.z(this));
                c01.d9.b().p().x(u3Var, java.lang.Boolean.FALSE);
            }
        }
        setMMTitle(com.tencent.mm.R.string.itr);
        c01.d9.e().a(tj.d.CTRL_INDEX, this);
        c01.d9.e().a(com.tencent.mm.plugin.appbrand.jsapi.profile.n.CTRL_INDEX, this);
        initView();
        U6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        c01.d9.e().q(tj.d.CTRL_INDEX, this);
        c01.d9.e().q(com.tencent.mm.plugin.appbrand.jsapi.profile.n.CTRL_INDEX, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        c01.d9.e().g(new q71.m());
        super.onResume();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            if (m1Var.getType() != 1191) {
                if (m1Var.getType() == 1194) {
                    c01.d9.e().g(new q71.m());
                    this.f74432n = true;
                    return;
                }
                return;
            }
            U6();
            if (this.f74431m) {
                o71.l.wi();
                if (o71.l.Ai().f352473a.f289633d.size() != 0 || this.f74432n) {
                    return;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.setClass(this, com.tencent.mm.plugin.address.ui.AddInvoiceUI.class);
                intent.putExtra("launch_from_webview", true);
                startActivityForResult(intent, 1);
            }
        }
    }
}

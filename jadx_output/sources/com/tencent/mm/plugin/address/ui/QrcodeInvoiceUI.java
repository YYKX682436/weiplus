package com.tencent.mm.plugin.address.ui;

/* loaded from: classes15.dex */
public class QrcodeInvoiceUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f74444x = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f74446e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView f74447f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView f74448g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView f74449h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView f74450i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView f74451m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView f74452n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView f74453o;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.Bitmap f74455q;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f74457s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f74458t;

    /* renamed from: d, reason: collision with root package name */
    public int f74445d = 0;

    /* renamed from: p, reason: collision with root package name */
    public i83.b f74454p = null;

    /* renamed from: r, reason: collision with root package name */
    public db5.d5 f74456r = null;

    /* renamed from: u, reason: collision with root package name */
    public float f74459u = 0.0f;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View.OnClickListener f74460v = new com.tencent.mm.plugin.address.ui.r0(this);

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View.OnClickListener f74461w = new com.tencent.mm.plugin.address.ui.s0(this);

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c1c;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        java.lang.String str;
        i83.b bVar;
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView invoiceQrcodeTextView = (com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView) findViewById(com.tencent.mm.R.id.lfe);
        this.f74447f = invoiceQrcodeTextView;
        if (invoiceQrcodeTextView != null) {
            invoiceQrcodeTextView.b();
        }
        com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView invoiceQrcodeTextView2 = (com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView) findViewById(com.tencent.mm.R.id.lfa);
        this.f74448g = invoiceQrcodeTextView2;
        if (invoiceQrcodeTextView2 != null) {
            invoiceQrcodeTextView2.b();
        }
        com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView invoiceQrcodeTextView3 = (com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView) findViewById(com.tencent.mm.R.id.lfd);
        this.f74449h = invoiceQrcodeTextView3;
        if (invoiceQrcodeTextView3 != null) {
            invoiceQrcodeTextView3.b();
        }
        com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView invoiceQrcodeTextView4 = (com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView) findViewById(com.tencent.mm.R.id.lf_);
        this.f74450i = invoiceQrcodeTextView4;
        if (invoiceQrcodeTextView4 != null) {
            invoiceQrcodeTextView4.b();
        }
        com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView invoiceQrcodeTextView5 = (com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView) findViewById(com.tencent.mm.R.id.lfb);
        this.f74451m = invoiceQrcodeTextView5;
        if (invoiceQrcodeTextView5 != null) {
            invoiceQrcodeTextView5.b();
        }
        com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView invoiceQrcodeTextView6 = (com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView) findViewById(com.tencent.mm.R.id.lf8);
        this.f74452n = invoiceQrcodeTextView6;
        if (invoiceQrcodeTextView6 != null) {
            invoiceQrcodeTextView6.b();
        }
        com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView invoiceQrcodeTextView7 = (com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView) findViewById(com.tencent.mm.R.id.lf9);
        this.f74453o = invoiceQrcodeTextView7;
        if (invoiceQrcodeTextView7 != null) {
            invoiceQrcodeTextView7.b();
        }
        this.f74449h.getClass();
        this.f74449h.f74441o = true;
        if (this.f74445d != 0) {
            this.f74446e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lfm);
            p71.a Ai = o71.l.Ai();
            int i17 = this.f74445d;
            java.util.Iterator it = Ai.f352473a.f289633d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bVar = null;
                    break;
                } else {
                    bVar = (i83.b) it.next();
                    if (bVar.f289634d == i17) {
                        break;
                    }
                }
            }
            this.f74454p = bVar;
            if (bVar == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.QrcodeInvoiceUI", "invoiceSvrObj is null ,now finish..");
                finish();
            }
            i83.b bVar2 = this.f74454p;
            if (bVar2 == null || (str3 = bVar2.f289635e) == null || !str3.equals("0")) {
                i83.b bVar3 = this.f74454p;
                if (bVar3 != null && (str2 = bVar3.f289635e) != null && str2.equals("1")) {
                    this.f74446e.setText(getString(com.tencent.mm.R.string.g2u));
                    this.f74447f.setVisibility(8);
                    this.f74449h.setVisibility(8);
                    this.f74450i.setVisibility(8);
                    this.f74451m.setVisibility(8);
                    this.f74452n.setVisibility(8);
                    this.f74453o.setVisibility(8);
                }
            } else {
                this.f74446e.setText(getString(com.tencent.mm.R.string.g2q));
                this.f74448g.setVisibility(8);
                java.lang.String str4 = this.f74454p.f289638h;
                if (str4 == null || str4.equals("")) {
                    this.f74449h.setVisibility(8);
                } else {
                    this.f74449h.setVisibility(0);
                    this.f74449h.setValStr(this.f74454p.f289638h);
                }
                java.lang.String str5 = this.f74454p.f289645r;
                if (str5 == null || str5.equals("")) {
                    this.f74450i.setVisibility(8);
                } else {
                    this.f74450i.setVisibility(0);
                    this.f74450i.setValStr(this.f74454p.f289645r);
                }
                java.lang.String str6 = this.f74454p.f289642o;
                if (str6 == null || str6.equals("")) {
                    this.f74451m.setVisibility(8);
                } else {
                    this.f74451m.setVisibility(0);
                    this.f74451m.setValStr(this.f74454p.f289642o);
                }
                java.lang.String str7 = this.f74454p.f289640m;
                if (str7 == null || str7.equals("")) {
                    this.f74452n.setVisibility(8);
                } else {
                    this.f74452n.setVisibility(0);
                    this.f74452n.setValStr(this.f74454p.f289640m);
                }
                java.lang.String str8 = this.f74454p.f289639i;
                if (str8 == null || str8.equals("")) {
                    this.f74453o.setVisibility(8);
                } else {
                    this.f74453o.setVisibility(0);
                    this.f74453o.setValStr(this.f74454p.f289639i);
                }
            }
            this.f74446e.setVisibility(0);
            i83.b bVar4 = this.f74454p;
            if (bVar4 != null) {
                this.f74447f.setValStr(bVar4.f289636f);
                this.f74448g.setValStr(this.f74454p.f289637g);
            }
            if (this.f74456r == null) {
                android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.blh, null);
                inflate.setOnClickListener(new com.tencent.mm.plugin.address.ui.p0(this));
                this.f74458t = inflate.findViewById(com.tencent.mm.R.id.hfq);
                this.f74457s = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.hfp);
                db5.d5 d5Var = new db5.d5(inflate, -1, -1, true);
                this.f74456r = d5Var;
                d5Var.setClippingEnabled(false);
                this.f74456r.update();
                this.f74456r.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(16777215));
                this.f74456r.setOnDismissListener(new com.tencent.mm.plugin.address.ui.q0(this));
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.QrcodeInvoiceUI", "serverId is 0,now finish...");
            finish();
        }
        setBackBtn(new com.tencent.mm.plugin.address.ui.n0(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490381te), new com.tencent.mm.plugin.address.ui.o0(this), null, com.tencent.mm.ui.fb.GREEN);
        i83.b bVar5 = this.f74454p;
        if (bVar5 == null || (str = bVar5.f289646s) == null || str.equals("")) {
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.hfr);
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.hfs);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/address/ui/QrcodeInvoiceUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/address/ui/QrcodeInvoiceUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lex);
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.hfr);
        if (imageView2 != null) {
            imageView2.setVisibility(0);
            android.graphics.Bitmap Bi = ((jd0.w1) ((kd0.k2) i95.n0.c(kd0.k2.class))).Bi(this, this.f74454p.f289646s, 12, 3);
            this.f74455q = Bi;
            imageView2.setImageBitmap(Bi);
            imageView2.setOnClickListener(this.f74461w);
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.hfs);
        if (findViewById2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/address/ui/QrcodeInvoiceUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/address/ui/QrcodeInvoiceUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lex);
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1) {
            if (i17 == 3 && i18 != -1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.QrcodeInvoiceUI", "MallRecharge pay result : cancel");
                return;
            }
            return;
        }
        if (i18 == -1) {
            java.lang.String stringExtra = intent.getStringExtra("karea_result");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                this.f74451m.setValStr(stringExtra);
            }
            java.lang.String stringExtra2 = intent.getStringExtra("kpost_code");
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                return;
            }
            this.f74451m.setValStr(stringExtra2);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f74445d = getIntent().getIntExtra("invoice_id", 0);
        setMMTitle(com.tencent.mm.R.string.g2y);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyUp(i17, keyEvent);
        }
        setResult(0);
        finish();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        getWindow().setSoftInputMode(3);
        super.onResume();
        initView();
    }

    public void showPopupWindow(android.view.View view) {
        db5.d5 d5Var = this.f74456r;
        if (d5Var == null || d5Var.isShowing()) {
            return;
        }
        this.f74456r.showAtLocation(view.getRootView(), 17, 0, 0);
        this.f74456r.setFocusable(true);
        this.f74456r.setTouchable(true);
        this.f74456r.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(16777215));
        this.f74456r.setOutsideTouchable(true);
        android.view.View view2 = this.f74458t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/address/ui/QrcodeInvoiceUI", "showPopupWindow", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/address/ui/QrcodeInvoiceUI", "showPopupWindow", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f74457s.setOnClickListener(this.f74460v);
        this.f74457s.setImageBitmap(this.f74455q);
        if (this.f74455q != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.QrcodeInvoiceUI", "updatePopWindowContent mQRCodeBmp != null");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.QrcodeInvoiceUI", "updatePopWindowContent mQRCodeBmp == null");
        }
        this.f74456r.update();
    }
}

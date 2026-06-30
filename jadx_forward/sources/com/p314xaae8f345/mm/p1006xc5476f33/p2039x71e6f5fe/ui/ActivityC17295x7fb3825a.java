package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.scanner.ui.ConfirmScanBankCardResultUI */
/* loaded from: classes3.dex */
public class ActivityC17295x7fb3825a extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Map f240818h = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f240819d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f240820e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f240821f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.EditText f240822g;

    public final void T6() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("BaseScanUI_select_scan_mode", 7);
        intent.putExtra("scan_bankcard_with_confirm_ui", true);
        intent.addFlags(268435456);
        intent.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17302x1966fea1.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/ConfirmScanBankCardResultUI", "goBackScan", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/scanner/ui/ConfirmScanBankCardResultUI", "goBackScan", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a0_;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        T6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.ib6);
        boolean z17 = false;
        if (getIntent() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConfirmScanBankCardResultUI", "intent is null, return");
        } else {
            java.lang.String stringExtra = getIntent().getStringExtra("_image_cache_key_");
            this.f240820e = stringExtra;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConfirmScanBankCardResultUI", "bmp cache key is null or nil");
            } else {
                android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((java.util.HashMap) f240818h).get(this.f240820e);
                this.f240819d = bitmap;
                if (bitmap == null || bitmap.isRecycled()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConfirmScanBankCardResultUI", "bmp invalid, return");
                } else {
                    z17 = true;
                }
            }
        }
        if (!z17) {
            finish();
            return;
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("_card_num_");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConfirmScanBankCardResultUI", "cardNum is null or nil");
            finish();
            return;
        }
        this.f240821f = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.h8_);
        this.f240822g = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.d5t);
        this.f240821f.setImageBitmap(this.f240819d);
        this.f240822g.setText(stringExtra2);
        findViewById(com.p314xaae8f345.mm.R.id.f565058b36).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.i(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.j(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        android.widget.ImageView imageView = this.f240821f;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f240820e)) {
            ((java.util.HashMap) f240818h).remove(this.f240820e);
        }
        android.graphics.Bitmap bitmap = this.f240819d;
        if (bitmap != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConfirmScanBankCardResultUI", "bitmap recycle %s", bitmap.toString());
            this.f240819d.recycle();
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.PreviewLastHdHeadImg */
/* loaded from: classes5.dex */
public class ViewOnClickListenerC17386xd1d83869 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements android.view.View.OnClickListener {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f241697i = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f241698d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f241699e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f241700f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f241701g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f241702h;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bid;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.irs);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        mo78578x8b18f126(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77625x1f52c6));
        this.f241701g = c01.z1.r();
        this.f241702h = getIntent().getStringExtra("last_avatar_path");
        this.f241698d = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.gxr);
        this.f241699e = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.i0(this.f241702h);
        this.f241700f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ou6);
        this.f241698d.setImageBitmap(this.f241699e);
        this.f241700f.setOnClickListener(this);
        mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.u1(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.v1(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0063  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r12) {
        /*
            r11 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/setting/ui/setting/PreviewLastHdHeadImg"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r12)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r11
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r0 = "CropImage_OutputPath"
            java.lang.String r12 = r12.getStringExtra(r0)
            java.lang.String r1 = "(Landroid/view/View;)V"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "android/view/View$OnClickListener"
            java.lang.String r4 = "com/tencent/mm/plugin/setting/ui/setting/PreviewLastHdHeadImg"
            r5 = 0
            if (r12 == 0) goto L7b
            android.graphics.Bitmap r6 = r11.f241699e
            java.lang.String r7 = ""
            boolean r8 = r12.equals(r7)
            if (r8 != 0) goto L60
            android.graphics.Bitmap$CompressFormat r8 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Exception -> L43
            r9 = 100
            r10 = 1
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(r6, r9, r8, r12, r10)     // Catch: java.lang.Exception -> L43
            goto L61
        L43:
            r6 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.String r9 = "MicroMsg.PreviewLastHdHeadImg"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r9, r6, r7, r8)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "saveBitmapToImage failed:"
            r7.<init>(r8)
            java.lang.String r6 = r6.toString()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r9, r6)
        L60:
            r10 = r5
        L61:
            if (r10 == 0) goto L7b
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            r6.putExtra(r0, r12)
            java.lang.String r12 = "CropImage_NeedCompress"
            r6.putExtra(r12, r5)
            r12 = -1
            r11.setResult(r12, r6)
            r11.finish()
            yj0.a.h(r11, r4, r3, r2, r1)
            return
        L7b:
            r11.setResult(r5)
            r11.finish()
            yj0.a.h(r11, r4, r3, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ViewOnClickListenerC17386xd1d83869.onClick(android.view.View):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m78497xc03943d(true);
        super.onCreate(bundle);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        mo43517x10010bd5();
    }
}

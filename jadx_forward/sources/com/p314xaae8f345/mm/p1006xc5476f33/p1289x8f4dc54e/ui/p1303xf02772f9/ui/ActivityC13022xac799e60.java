package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/userinfo/ui/BrandServiceUserInfoManageUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/j", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.brandservice.ui.userinfo.ui.BrandServiceUserInfoManageUI */
/* loaded from: classes4.dex */
public final class ActivityC13022xac799e60 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f176087h = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f176088d = 251658241;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f176089e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.l(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f176090f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.k(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f176091g = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.p.f176115d);

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569784o5;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f176088d = getIntent().getIntExtra("intent_service_type", 251658241);
        mo54450xbf7c1df6("");
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.m(this));
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j9_);
        android.text.TextPaint paint = textView != null ? textView.getPaint() : null;
        if (paint != null) {
            paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        }
        android.text.TextPaint paint2 = textView != null ? textView.getPaint() : null;
        if (paint2 != null) {
            paint2.setStrokeWidth(0.8f);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.f564989ax0);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f564990ax1);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.awz);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.awt);
        jz5.g gVar = this.f176090f;
        ((xm3.t0) ((jz5.n) gVar).mo141623x754a37bb()).B = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.o) ((jz5.n) this.f176091g).mo141623x754a37bb();
        c1163xf1deaba4.mo7960x6cab2c8d((xm3.t0) ((jz5.n) gVar).mo141623x754a37bb());
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe) ((jz5.n) this.f176089e).mo141623x754a37bb()).f233604u.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.n(this, c1163xf1deaba4, findViewById, findViewById2, progressBar));
        if (this.f176088d == 1) {
            ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j9_)).setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.n67));
            ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.awy)).setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572298n65));
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1209x3af610bc;

@db5.a(m123858x6ac9171 = 19)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendVideoUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.recommend.AppBrandRecommendVideoUI */
/* loaded from: classes4.dex */
public final class ActivityC12729xe5225219 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5 f171712d;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5 c19637x95a2b3f5 = this.f171712d;
        if (c19637x95a2b3f5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoView");
            throw null;
        }
        if (c19637x95a2b3f5.mo61531xc00617a4()) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5 c19637x95a2b3f52 = this.f171712d;
            if (c19637x95a2b3f52 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoView");
                throw null;
            }
            c19637x95a2b3f52.mo48231x65825f6();
        }
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569617gs;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        m78531x8f8cf1fb();
        getWindow().setFlags(1024, 1024);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f564741zt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f171712d = (com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5) findViewById;
        java.lang.String stringExtra = getIntent().getStringExtra("1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5 c19637x95a2b3f5 = this.f171712d;
        if (c19637x95a2b3f5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoView");
            throw null;
        }
        c19637x95a2b3f5.h(true, stringExtra, 1000);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5 c19637x95a2b3f52 = this.f171712d;
        if (c19637x95a2b3f52 != null) {
            c19637x95a2b3f52.mo48238x68ac462();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoView");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

@db5.a(m123858x6ac9171 = 7)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/AppBrandCheckWxaShortLinkUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandCheckWxaShortLinkUI */
/* loaded from: classes9.dex */
public class ActivityC12639x67ea3d2c extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f170862g = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f170863d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Runnable f170864e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f170865f = new java.util.concurrent.atomic.AtomicBoolean(false);

    public void T6(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.cgi.C12593xa2ff72c4 shortLinkInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shortLinkInfo, "shortLinkInfo");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7063x1921ad1b c7063x1921ad1b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7063x1921ad1b();
        c7063x1921ad1b.f143716g = i17;
        c7063x1921ad1b.f143718i = c7063x1921ad1b.b("appid", shortLinkInfo.f170407d, true);
        c7063x1921ad1b.f143715f = c7063x1921ad1b.b(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, getIntent().getStringExtra(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7), true);
        c7063x1921ad1b.f143713d = c7063x1921ad1b.b("requestid", getIntent().getStringExtra("requestId"), true);
        try {
            c7063x1921ad1b.f143714e = java.lang.Integer.parseInt(getIntent().getStringExtra("scene_for_report"));
        } catch (java.lang.Exception unused) {
        }
        c7063x1921ad1b.f143717h = 1;
        c7063x1921ad1b.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCheckWxaShortLinkUI", "reportForDialogWxaTag toShowString = " + c7063x1921ad1b.n());
    }

    public final lj1.a U6(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l1 l1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(l1Var, "<this>");
        switch (l1Var.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return lj1.a.f400342e;
            case 4:
                return lj1.a.f400343f;
            default:
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                return lj1.a.f400341d;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569457bp;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        android.content.Intent intent = getIntent();
        java.lang.String link = intent != null ? intent.getStringExtra("url") : null;
        android.content.Intent intent2 = getIntent();
        java.lang.String stringExtra = intent2 != null ? intent2.getStringExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811) : null;
        android.content.Intent intent3 = getIntent();
        java.lang.Boolean valueOf = intent3 != null ? java.lang.Boolean.valueOf(intent3.getBooleanExtra("need_check", true)) : null;
        android.content.Intent intent4 = getIntent();
        int intExtra = intent4 != null ? intent4.getIntExtra("chatType", -1) : -1;
        android.content.Intent intent5 = getIntent();
        java.lang.String stringExtra2 = intent5 != null ? intent5.getStringExtra("senderUsername") : null;
        android.content.Intent intent6 = getIntent();
        boolean booleanExtra = intent6 != null ? intent6.getBooleanExtra("show_launchwxatipdialog", true) : true;
        if (!(link == null || r26.n0.N(link))) {
            if (!(stringExtra == null || stringExtra.length() == 0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCheckWxaShortLinkUI", "start check short link");
                java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l1 m75717xdce0328 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l1.m75717xdce0328(stringExtra);
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, bool)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.e1 e1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.e1((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.cgi.C12593xa2ff72c4) getIntent().getParcelableExtra("shortLinkInfo"), link, this, stringExtra2, intExtra, m75717xdce0328);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.f1 f1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.f1(weakReference);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(link, "link");
                    kj1.l lVar = new kj1.l(this, f1Var, e1Var, link, booleanExtra);
                    kj1.w wVar = kj1.w.f389912a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.cgi.C12593xa2ff72c4 c12593xa2ff72c4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.cgi.C12593xa2ff72c4) kj1.w.f389913b.get(link);
                    if (c12593xa2ff72c4 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbsWxaShortLinkLauncher", "use cache for link:".concat(link));
                        lVar.mo149xb9724478(bool, c12593xa2ff72c4);
                        return;
                    }
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.g1 g1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.g1(this, weakReference);
                this.f170864e = g1Var;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(g1Var, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f170863d;
                if (u3Var != null) {
                    u3Var.dismiss();
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, 3, null);
                this.f170863d = f17;
                f17.setCancelable(false);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c1 c1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c1(m75717xdce0328, intExtra, stringExtra2, this, weakReference);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.d1 d1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.d1(weakReference);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(link, "link");
                kj1.g gVar = new kj1.g(this, d1Var, c1Var, link, true);
                kj1.w wVar2 = kj1.w.f389912a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.cgi.C12593xa2ff72c4 c12593xa2ff72c42 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.cgi.C12593xa2ff72c4) kj1.w.f389913b.get(link);
                if (c12593xa2ff72c42 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbsWxaShortLinkLauncher", "use cache for link:".concat(link));
                    gVar.mo149xb9724478(bool, c12593xa2ff72c42);
                    return;
                } else {
                    if (!kj1.m.f389898a.matcher(link).matches()) {
                        d1Var.mo146xb9724478(kj1.g0.f389860e);
                        return;
                    }
                    lj1.a f18 = c1Var.f();
                    r45.h20 h20Var = new r45.h20();
                    h20Var.f457305e = f18.ordinal();
                    h20Var.f457304d = link;
                    nd.b a17 = nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
                    ((km5.q) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0) a17).e1("/cgi-bin/mmbiz-bin/wxaapp/wxaapp_checkshortlink", "", h20Var, r45.i20.class).n(new lj1.b(gVar))).s(new lj1.c(gVar));
                    return;
                }
            }
        }
        setResult(-1, new android.content.Intent());
        finish();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCheckWxaShortLinkUI", "url empty or invalid scene, finish");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCheckWxaShortLinkUI", "onDestroy");
        java.lang.Runnable runnable = this.f170864e;
        if (runnable != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(runnable);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f170863d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.ui.v9.e(getWindow());
        com.p314xaae8f345.mm.ui.v9.c(getWindow(), false);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        db5.f.c(this, null);
    }
}

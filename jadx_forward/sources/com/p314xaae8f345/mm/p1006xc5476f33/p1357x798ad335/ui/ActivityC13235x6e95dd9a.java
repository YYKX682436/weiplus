package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui;

@db5.a(m123858x6ac9171 = 3)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-downloader_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI */
/* loaded from: classes8.dex */
public final class ActivityC13235x6e95dd9a extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f178753m = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f178754d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f178755e;

    /* renamed from: f, reason: collision with root package name */
    public long f178756f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13216xc6166eab f178757g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f178758h = jz5.h.b(new j02.d(this));

    /* renamed from: i, reason: collision with root package name */
    public final vz.i1 f178759i = new j02.a0(this);

    public static final void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a activityC13235x6e95dd9a, com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13215x104b3cc8 c13215x104b3cc8) {
        activityC13235x6e95dd9a.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a();
        aVar.f178767a = c13215x104b3cc8.f178459r;
        aVar.f178768b = c13215x104b3cc8.f178460s;
        aVar.f178773g = c13215x104b3cc8.f178458q;
        aVar.f178769c = c13215x104b3cc8.f178448d;
        aVar.f178774h = c13215x104b3cc8.f178461t;
        aVar.f178770d = c13215x104b3cc8.f178450f;
        aVar.f178772f = c13215x104b3cc8.f178451g;
        aVar.f178780n = 1;
        aVar.f178781o = c13215x104b3cc8.f178462u;
        vz.a2 a2Var = (vz.a2) i95.n0.c(vz.a2.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        j02.e eVar = new j02.e(activityC13235x6e95dd9a);
        ((uz.c2) a2Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.j1.c(context, aVar, false, eVar);
    }

    public static final void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a activityC13235x6e95dd9a, android.content.Context context, java.lang.String str) {
        activityC13235x6e95dd9a.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", false);
        intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
        intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
        intent.putExtra("convertActivityFromTranslucent", true);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public static final void V6(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a activityC13235x6e95dd9a, int i17, java.lang.String str, java.lang.String str2, boolean z17) {
        if (activityC13235x6e95dd9a.f178754d) {
            return;
        }
        activityC13235x6e95dd9a.f178754d = true;
        c02.w wVar = new c02.w();
        wVar.f119169d = i17;
        if (i17 == 1) {
            wVar.f119170e = str;
        } else {
            wVar.f119171f = str2;
        }
        wVar.f119173h = z17 ? 1 : 2;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = wVar;
        lVar.f152198b = new c02.x();
        lVar.f152199c = "/cgi-bin/mmgame-bin/setretainrecord";
        lVar.f152200d = 4904;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.h0.a(lVar.a(), j02.c0.f378514a);
    }

    public final b02.a W6() {
        return (b02.a) ((jz5.n) this.f178758h).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        if (this.f178755e) {
            setResult(-1);
        } else {
            setResult(0);
        }
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m78598x47a8a819(true);
        m78497xc03943d(true);
        super.onCreate(bundle);
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.o();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        android.os.Parcelable parcelableExtra = getIntent().getParcelableExtra("appInfoWrapper");
        h0Var.f391656d = parcelableExtra;
        if (parcelableExtra == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameDetainManager.GameCloudAppDownloadUI", "gamelog.download, download, detain ,appInfoWrapper is null ");
            finish();
            return;
        }
        this.f178757g = (com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13216xc6166eab) parcelableExtra;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.a(this);
        getWindow().getDecorView().post(new j02.b0(this, h0Var));
        vz.i1 i1Var = this.f178759i;
        if (i1Var != null) {
            ((java.util.concurrent.CopyOnWriteArraySet) com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c.f178442f).add(i1Var);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c cVar = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c.f178440d;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        vz.i1 i1Var = this.f178759i;
        if (i1Var != null) {
            ((java.util.concurrent.CopyOnWriteArraySet) com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c.f178442f).remove(i1Var);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c cVar = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c.f178440d;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.f(this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return false;
    }
}

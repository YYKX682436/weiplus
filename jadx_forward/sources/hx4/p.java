package hx4;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final jx4.a f367215a;

    /* renamed from: b, reason: collision with root package name */
    public long f367216b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f367217c;

    /* renamed from: d, reason: collision with root package name */
    public int f367218d;

    /* renamed from: e, reason: collision with root package name */
    public int f367219e;

    /* renamed from: f, reason: collision with root package name */
    public lx4.j f367220f;

    /* renamed from: g, reason: collision with root package name */
    public final hx4.d f367221g;

    /* renamed from: h, reason: collision with root package name */
    public final hx4.g f367222h;

    public p(jx4.a uiModel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiModel, "uiModel");
        this.f367215a = uiModel;
        this.f367217c = new java.util.ArrayList();
        this.f367219e = -1;
        this.f367221g = new hx4.d(this);
        this.f367222h = new hx4.g(this);
    }

    public static final void a(hx4.p pVar, int i17) {
        pVar.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("show_webview_menu", i17 != 5);
        pVar.b(0, intent);
        hx4.s.a(pVar.f367216b, i17, pVar.f367218d);
    }

    public final void b(int i17, android.content.Intent intent) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Boolean.valueOf(intent == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrowserChooseController", "finishUI resultCode: %d, data == null: %b", objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.ActivityC19352x791af613 activityC19352x791af613 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.ActivityC19352x791af613) this.f367215a;
        activityC19352x791af613.setResult(i17, intent);
        activityC19352x791af613.finish();
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrowserChooseController", "showBrowserChooseDialog");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.ActivityC19352x791af613 activityC19352x791af613 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.ActivityC19352x791af613) this.f367215a;
        lx4.b bVar = new lx4.b(activityC19352x791af613.mo55332x76847179());
        bVar.setOnKeyListener(new hx4.i(bVar, this));
        bVar.setOnCancelListener(new hx4.j(this));
        bVar.f403649h = this.f367221g;
        java.util.List list = this.f367217c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        bVar.f403647f = list;
        android.content.Intent intent = (android.content.Intent) activityC19352x791af613.getIntent().getParcelableExtra("targetintent");
        bVar.f403650i = intent != null ? intent.getBooleanExtra("show_browser_setting_entry", false) : false;
        activityC19352x791af613.getClass();
        bVar.show();
    }
}

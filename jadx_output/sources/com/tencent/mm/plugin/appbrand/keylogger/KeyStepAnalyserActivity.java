package com.tencent.mm.plugin.appbrand.keylogger;

/* loaded from: classes7.dex */
public class KeyStepAnalyserActivity extends com.tencent.mm.plugin.appbrand.keylogger.KeyStepBaseActivity {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f84096p = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.keylogger.d f84097e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.regex.Pattern f84098f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f84099g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Class f84100h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f84101i;

    /* renamed from: m, reason: collision with root package name */
    public int f84102m;

    /* renamed from: n, reason: collision with root package name */
    public int f84103n;

    /* renamed from: o, reason: collision with root package name */
    public int f84104o;

    public final void K6(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.KeyStepBaseActivity", "analyse time:%d", java.lang.Long.valueOf(j17));
        com.tencent.mm.plugin.appbrand.keylogger.d dVar = this.f84097e;
        java.lang.String str = this.f84099g;
        java.util.regex.Pattern pattern = this.f84098f;
        com.tencent.mm.plugin.appbrand.keylogger.g gVar = new com.tencent.mm.plugin.appbrand.keylogger.g(this);
        dVar.getClass();
        new com.tencent.mm.sdk.platformtools.n3(java.lang.String.format(java.util.Locale.ENGLISH, "KeyStepAnalyser:%s", str)).post(new com.tencent.mm.plugin.appbrand.keylogger.a(dVar, str, pattern, j17, gVar));
    }

    @Override // com.tencent.mm.plugin.appbrand.keylogger.KeyStepBaseActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f487936c0;
    }

    @Override // com.tencent.mm.plugin.appbrand.keylogger.KeyStepBaseActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f84100h = (java.lang.Class) getIntent().getSerializableExtra("process");
        this.f84101i = getIntent().getStringExtra("category");
        this.f84099g = com.tencent.mm.plugin.appbrand.keylogger.b0.b(this.f84100h);
        this.f84098f = (java.util.regex.Pattern) getIntent().getSerializableExtra("session_id_prefix");
        this.f84122d.setText(getString(com.tencent.mm.R.string.f492359g72));
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        this.f84102m = calendar.get(1);
        this.f84103n = calendar.get(2);
        this.f84104o = calendar.get(5);
        findViewById(com.tencent.mm.R.id.cqp).setOnClickListener(new com.tencent.mm.plugin.appbrand.keylogger.e(this));
        this.f84097e = new com.tencent.mm.plugin.appbrand.keylogger.d();
        K6(java.lang.System.currentTimeMillis());
    }
}

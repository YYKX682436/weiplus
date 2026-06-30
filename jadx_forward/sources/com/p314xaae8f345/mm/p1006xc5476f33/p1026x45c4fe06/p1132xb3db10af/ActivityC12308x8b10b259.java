package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af;

/* renamed from: com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserActivity */
/* loaded from: classes7.dex */
public class ActivityC12308x8b10b259 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.AbstractActivityC12310x81e5924b {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f165629p = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.d f165630e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.regex.Pattern f165631f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f165632g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Class f165633h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f165634i;

    /* renamed from: m, reason: collision with root package name */
    public int f165635m;

    /* renamed from: n, reason: collision with root package name */
    public int f165636n;

    /* renamed from: o, reason: collision with root package name */
    public int f165637o;

    public final void K6(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KeyStepBaseActivity", "analyse time:%d", java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.d dVar = this.f165630e;
        java.lang.String str = this.f165632g;
        java.util.regex.Pattern pattern = this.f165631f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.g gVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.g(this);
        dVar.getClass();
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(java.lang.String.format(java.util.Locale.ENGLISH, "KeyStepAnalyser:%s", str)).mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.a(dVar, str, pattern, j17, gVar));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.AbstractActivityC12310x81e5924b
    /* renamed from: getLayoutId */
    public int mo51581x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569469c0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.AbstractActivityC12310x81e5924b, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f165633h = (java.lang.Class) getIntent().getSerializableExtra("process");
        this.f165634i = getIntent().getStringExtra("category");
        this.f165632g = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.b0.b(this.f165633h);
        this.f165631f = (java.util.regex.Pattern) getIntent().getSerializableExtra("session_id_prefix");
        this.f165655d.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573892g72));
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        this.f165635m = calendar.get(1);
        this.f165636n = calendar.get(2);
        this.f165637o = calendar.get(5);
        findViewById(com.p314xaae8f345.mm.R.id.cqp).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.e(this));
        this.f165630e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.d();
        K6(java.lang.System.currentTimeMillis());
    }
}

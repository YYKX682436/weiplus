package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUpLogUploadingUI */
/* loaded from: classes12.dex */
public class ActivityC17363xb7882d32 extends com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f241599q = 0;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f241601f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f241602g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f241603h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f241604i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f241605m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ProgressBar f241606n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f241607o;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241600e = false;

    /* renamed from: p, reason: collision with root package name */
    public final k14.m f241608p = new o14.t(this);

    public final java.lang.String Z6(long j17) {
        return j17 < 0 ? "-" : j17 < 1024 ? java.lang.String.format("%s B", java.lang.Long.valueOf(j17)) : j17 < 1048576 ? java.lang.String.format("%.1f KB", java.lang.Float.valueOf(((float) j17) / 1024.0f)) : j17 < 1073741824 ? java.lang.String.format("%.1f MB", java.lang.Float.valueOf(((float) j17) / 1048576.0f)) : java.lang.String.format("%.1f GB", java.lang.Float.valueOf(((float) j17) / 1.0737418E9f));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ban;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getExtras() == null || !getIntent().getExtras().getBoolean("MMWizardActivity.WIZARD_ROOT_KILLSELF", false)) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.fa9);
            this.f241603h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.g7e);
            this.f241604i = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.g7_);
            this.f241601f = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.g79);
            this.f241602g = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f566536g75);
            this.f241606n = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.g7a);
            this.f241607o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.g7c);
            this.f241605m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.g7b);
            this.f241604i.setImageResource(com.p314xaae8f345.mm.R.raw.f79352x60dda3b);
            this.f241603h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fai);
            this.f241601f.setOnClickListener(new o14.o(this));
            this.f241602g.setOnClickListener(new o14.r(this));
            mo54448x9c8c0d33(new o14.s(this));
            this.f241606n.setVisibility(0);
            this.f241607o.setVisibility(0);
            this.f241601f.setVisibility(8);
            this.f241602g.setVisibility(0);
            k14.n.a().c(this.f241608p, getIntent().getStringExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37645x68f5f8be), getIntent().getStringExtra("begin_hour"), getIntent().getStringExtra("end_hour"), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u1(getIntent().getStringExtra("KEY_CCNUM"), ""), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u1(getIntent().getStringExtra("KEY_PHONENUM"), ""));
            k14.n a17 = k14.n.a();
            java.lang.String[] strArr = {a17.f384895b, a17.f384896c, a17.f384897d};
            if (strArr[0] == null || strArr[1] == null || strArr[2] == null) {
                return;
            }
            this.f241605m.setVisibility(0);
            java.lang.String str = strArr[0];
            int length = str.length();
            if (length >= 8) {
                int i17 = length - 4;
                java.lang.String substring = strArr[0].substring(length - 8, i17);
                int i18 = length - 2;
                str = java.lang.String.format("%s.%s.%s", substring, strArr[0].substring(i17, i18), strArr[0].substring(i18));
            }
            this.f241605m.setText(java.lang.String.format("%s %s~%s", str, strArr[1], strArr[2]));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        W6(1);
        return true;
    }
}

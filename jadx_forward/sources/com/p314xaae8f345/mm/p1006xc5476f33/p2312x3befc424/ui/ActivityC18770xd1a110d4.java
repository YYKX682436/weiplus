package com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui;

/* renamed from: com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseReportUI */
/* loaded from: classes.dex */
public class ActivityC18770xd1a110d4 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f256837i;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f256838d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f256839e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f256840f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f256841g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f256842h;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c7k;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6("");
        this.f256840f = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.lz9);
        this.f256841g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lzb);
        this.f256842h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lza);
        if (getIntent().getBooleanExtra("diagnose_result", false)) {
            this.f256840f.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bkk);
            this.f256841g.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.k47));
            this.f256842h.setVisibility(0);
            mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.bpe), new com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.m(this));
            return;
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.n(this));
        f256837i = getIntent().getStringExtra("diagnose_log_file_path");
        this.f256840f.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bkj);
        this.f256841g.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574959k46));
        java.lang.String str = f256837i;
        if (str == null || com.p314xaae8f345.mm.vfs.w6.k(str) <= 0) {
            return;
        }
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lz_)).setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.i1y, f256837i.replace("mnt/", "")));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.lz_);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.mlp);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.mly);
        this.f256838d = button;
        button.setVisibility(0);
        this.f256838d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.o(this));
        android.widget.Button button2 = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.p1l);
        this.f256839e = button2;
        button2.setVisibility(0);
        this.f256839e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.p(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }
}

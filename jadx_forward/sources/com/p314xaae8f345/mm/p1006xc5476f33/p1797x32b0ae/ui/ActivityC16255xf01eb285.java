package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI */
/* loaded from: classes15.dex */
public class ActivityC16255xf01eb285 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Map f225872m = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.g1();

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f225873d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f225874e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.s1 f225875f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f225876g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f225877h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16266x3ede7a38 f225878i;

    /* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI$a */
    /* loaded from: classes3.dex */
    public static class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
        private a() {
        }

        @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
        /* renamed from: invoke */
        public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
            if (rVar != null) {
                rVar.a(null);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bpz;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a.b(7, new com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943());
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16192x8446fa43.m65649x9cf0d20b().m65654xc6fdd8af();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16192x8446fa43.m65649x9cf0d20b().m65657xb5d4e76f();
        ((d83.u) ((e70.z) i95.n0.c(e70.z.class))).Bi(new e70.w("wxalitec8a16f9bf80f65dffb97cdf7760c1142", com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29, null), new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.h1(this));
        this.f225877h = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.q1r);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16266x3ede7a38 c16266x3ede7a38 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16266x3ede7a38(this);
        c16266x3ede7a38.f127592z = true;
        c16266x3ede7a38.A = true;
        c16266x3ede7a38.f225910y0 = null;
        c16266x3ede7a38.f225909x0 = null;
        this.f225878i = c16266x3ede7a38;
        this.f225877h.addView(c16266x3ede7a38, 3);
        ((android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.pua)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.j1(this));
        this.f225876g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.afe);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.m65927x7420eb55();
        java.lang.String m65304x4e6e15bd = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65304x4e6e15bd();
        this.f225876g.setText("基础库列表  当前基础库大版本：" + m65304x4e6e15bd);
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564607vv)).setText("App列表");
        this.f225873d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.aff);
        this.f225873d.setAdapter((android.widget.ListAdapter) new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.q1(this, this));
        x03.x0.f532694d.a().f532697b.c("http://wxsnsdy.tc.qq.com/105/20210/snsdyvideodownload?filekey=30280201010421301f0201690402534804102ca905ce620b1241b726bc41dcff44e00204012882540400&bizid=1023&hy=SH&fileparam=302c020101042530230204136ffd93020457e3c4ff02024ef202031e8d7f02030f42400204045a320a0201000400", 80);
        this.f225874e = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.f564608vw);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.s1 s1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.s1(this, this);
        this.f225875f = s1Var;
        this.f225874e.setAdapter((android.widget.ListAdapter) s1Var);
        this.f225874e.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.o1(this));
        this.f225874e.setOnItemLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.p1(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.m65927x7420eb55();
        java.lang.String m65304x4e6e15bd = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65304x4e6e15bd();
        this.f225876g.setText("基础库列表  当前基础库大版本：" + m65304x4e6e15bd);
        this.f225875f.notifyDataSetChanged();
    }
}

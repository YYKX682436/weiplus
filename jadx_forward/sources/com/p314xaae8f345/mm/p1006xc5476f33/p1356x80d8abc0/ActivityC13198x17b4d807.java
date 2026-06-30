package com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0;

/* renamed from: com.tencent.mm.plugin.dbbackup.DBRecoveryUI */
/* loaded from: classes12.dex */
public class ActivityC13198x17b4d807 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements wz1.l {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f178312q = {0, 5, 60, 75, 95, 100, 100};

    /* renamed from: d, reason: collision with root package name */
    public wz1.i f178313d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f178314e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f178315f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ProgressBar f178316g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f178317h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f178318i;

    /* renamed from: m, reason: collision with root package name */
    public int f178319m;

    /* renamed from: n, reason: collision with root package name */
    public int f178320n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f178321o;

    /* renamed from: p, reason: collision with root package name */
    public final android.content.DialogInterface.OnClickListener f178322p = new com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.l(this);

    public final void T6() {
        this.f178318i.setEnabled(false);
        wz1.i iVar = this.f178313d;
        if (iVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DBRecoveryUI", "Recovery task is not running.");
            return;
        }
        iVar.f532261t.m108007xae7a2e7a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBRecoveryTask", "Recovery cancel triggered.");
        this.f178313d = null;
    }

    public final void U6() {
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        c17.w(89, 2);
        c17.i(true);
    }

    public final void V6() {
        if (this.f178313d != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DBRecoveryUI", "Recovery task has already started.");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBRecoveryUI", "Start DB recovery");
        android.view.View view = this.f178314e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/dbbackup/DBRecoveryUI", "startRecover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/dbbackup/DBRecoveryUI", "startRecover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f178315f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/dbbackup/DBRecoveryUI", "startRecover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/dbbackup/DBRecoveryUI", "startRecover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f178318i.setEnabled(true);
        byte[] bytes = kk.k.g((wo.w0.g(true) + gm0.j1.b().h()).getBytes()).substring(0, 7).getBytes();
        java.lang.String m17 = gm0.j1.u().m();
        java.lang.String mo70515xfb83cc9b = gm0.j1.u().f354686f.mo70515xfb83cc9b();
        java.lang.String str = mo70515xfb83cc9b + "-recovery";
        this.f178320n = 0;
        java.lang.String str2 = gm0.j1.u().d() + "dbback/";
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
        byte[] copyOf = java.util.Arrays.copyOf(bytes, bytes.length);
        byte[] copyOf2 = java.util.Arrays.copyOf(bytes, bytes.length);
        com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.q qVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.q(this);
        java.lang.String str3 = gm0.j1.u().h() + "heavyDetailInfo";
        boolean z17 = this.f178319m == 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(m17);
        boolean z18 = z17;
        sb6.append(".sm");
        arrayList3.add(sb6.toString());
        arrayList3.add(str2 + "corrupted/EnMicroMsg.db.sm");
        arrayList3.add(str2 + "EnMicroMsg.db.sm");
        if (!"0".equals(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_db_recovery_use_leaf_backup_android", "0"))) {
            arrayList4.add(m17 + ".li");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBRecoveryUI", "Recovery using leaf backup enabled.");
        }
        wz1.i iVar = new wz1.i(null);
        iVar.f532243b = str;
        iVar.f532244c = mo70515xfb83cc9b;
        iVar.f532245d = m17;
        iVar.f532246e = str3;
        iVar.f532247f = new java.util.ArrayList(arrayList3);
        iVar.f532248g = new java.util.ArrayList(arrayList4);
        iVar.f532249h = new java.util.ArrayList(arrayList5);
        iVar.f532250i = copyOf;
        iVar.f532251j = copyOf2;
        iVar.f532254m = qVar;
        iVar.f532252k = new java.util.ArrayList(linkedHashSet);
        iVar.f532253l = new java.util.ArrayList(linkedHashSet2);
        iVar.f532255n = z18;
        iVar.f532256o = this;
        this.f178313d = iVar;
        iVar.execute(new java.lang.Void[0]);
        this.f178321o = true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a3l;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        if (this.f178321o) {
            T6();
        } else {
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f178319m = getIntent().getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 2);
        this.f178321o = false;
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572569bn4);
        this.f178314e = findViewById(com.p314xaae8f345.mm.R.id.ngw);
        this.f178315f = findViewById(com.p314xaae8f345.mm.R.id.f565646d26);
        this.f178316g = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.lbl);
        this.f178317h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568008lc2);
        findViewById(com.p314xaae8f345.mm.R.id.ngc).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.n(this));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.b5i);
        this.f178318i = findViewById;
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.o(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.p(this));
        if (this.f178319m == 0) {
            V6();
        }
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.mo68477x336bdfd8(181L, this.f178319m + 51, 1L, true);
        fVar.mo68477x336bdfd8(873L, 14L, 1L, false);
        if (this.f178319m == 2) {
            fVar.mo68477x336bdfd8(873L, 15L, 1L, false);
        }
    }
}

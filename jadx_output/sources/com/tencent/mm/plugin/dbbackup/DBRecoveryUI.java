package com.tencent.mm.plugin.dbbackup;

/* loaded from: classes12.dex */
public class DBRecoveryUI extends com.tencent.mm.ui.MMActivity implements wz1.l {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f96779q = {0, 5, 60, 75, 95, 100, 100};

    /* renamed from: d, reason: collision with root package name */
    public wz1.i f96780d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f96781e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f96782f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ProgressBar f96783g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f96784h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f96785i;

    /* renamed from: m, reason: collision with root package name */
    public int f96786m;

    /* renamed from: n, reason: collision with root package name */
    public int f96787n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f96788o;

    /* renamed from: p, reason: collision with root package name */
    public final android.content.DialogInterface.OnClickListener f96789p = new com.tencent.mm.plugin.dbbackup.l(this);

    public final void T6() {
        this.f96785i.setEnabled(false);
        wz1.i iVar = this.f96780d;
        if (iVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DBRecoveryUI", "Recovery task is not running.");
            return;
        }
        iVar.f450728t.cancel();
        com.tencent.mars.xlog.Log.i("MicroMsg.DBRecoveryTask", "Recovery cancel triggered.");
        this.f96780d = null;
    }

    public final void U6() {
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        c17.w(89, 2);
        c17.i(true);
    }

    public final void V6() {
        if (this.f96780d != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DBRecoveryUI", "Recovery task has already started.");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DBRecoveryUI", "Start DB recovery");
        android.view.View view = this.f96781e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/dbbackup/DBRecoveryUI", "startRecover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/dbbackup/DBRecoveryUI", "startRecover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f96782f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/dbbackup/DBRecoveryUI", "startRecover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/dbbackup/DBRecoveryUI", "startRecover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f96785i.setEnabled(true);
        byte[] bytes = kk.k.g((wo.w0.g(true) + gm0.j1.b().h()).getBytes()).substring(0, 7).getBytes();
        java.lang.String m17 = gm0.j1.u().m();
        java.lang.String path = gm0.j1.u().f273153f.getPath();
        java.lang.String str = path + "-recovery";
        this.f96787n = 0;
        java.lang.String str2 = gm0.j1.u().d() + "dbback/";
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
        byte[] copyOf = java.util.Arrays.copyOf(bytes, bytes.length);
        byte[] copyOf2 = java.util.Arrays.copyOf(bytes, bytes.length);
        com.tencent.mm.plugin.dbbackup.q qVar = new com.tencent.mm.plugin.dbbackup.q(this);
        java.lang.String str3 = gm0.j1.u().h() + "heavyDetailInfo";
        boolean z17 = this.f96786m == 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(m17);
        boolean z18 = z17;
        sb6.append(".sm");
        arrayList3.add(sb6.toString());
        arrayList3.add(str2 + "corrupted/EnMicroMsg.db.sm");
        arrayList3.add(str2 + "EnMicroMsg.db.sm");
        if (!"0".equals(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_db_recovery_use_leaf_backup_android", "0"))) {
            arrayList4.add(m17 + ".li");
            com.tencent.mars.xlog.Log.i("MicroMsg.DBRecoveryUI", "Recovery using leaf backup enabled.");
        }
        wz1.i iVar = new wz1.i(null);
        iVar.f450710b = str;
        iVar.f450711c = path;
        iVar.f450712d = m17;
        iVar.f450713e = str3;
        iVar.f450714f = new java.util.ArrayList(arrayList3);
        iVar.f450715g = new java.util.ArrayList(arrayList4);
        iVar.f450716h = new java.util.ArrayList(arrayList5);
        iVar.f450717i = copyOf;
        iVar.f450718j = copyOf2;
        iVar.f450721m = qVar;
        iVar.f450719k = new java.util.ArrayList(linkedHashSet);
        iVar.f450720l = new java.util.ArrayList(linkedHashSet2);
        iVar.f450722n = z18;
        iVar.f450723o = this;
        this.f96780d = iVar;
        iVar.execute(new java.lang.Void[0]);
        this.f96788o = true;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a3l;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f96788o) {
            T6();
        } else {
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f96786m = getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2);
        this.f96788o = false;
        setMMTitle(com.tencent.mm.R.string.f491036bn4);
        this.f96781e = findViewById(com.tencent.mm.R.id.ngw);
        this.f96782f = findViewById(com.tencent.mm.R.id.f484113d26);
        this.f96783g = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.lbl);
        this.f96784h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486475lc2);
        findViewById(com.tencent.mm.R.id.ngc).setOnClickListener(new com.tencent.mm.plugin.dbbackup.n(this));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.b5i);
        this.f96785i = findViewById;
        findViewById.setOnClickListener(new com.tencent.mm.plugin.dbbackup.o(this));
        setBackBtn(new com.tencent.mm.plugin.dbbackup.p(this));
        if (this.f96786m == 0) {
            V6();
        }
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.idkeyStat(181L, this.f96786m + 51, 1L, true);
        fVar.idkeyStat(873L, 14L, 1L, false);
        if (this.f96786m == 2) {
            fVar.idkeyStat(873L, 15L, 1L, false);
        }
    }
}

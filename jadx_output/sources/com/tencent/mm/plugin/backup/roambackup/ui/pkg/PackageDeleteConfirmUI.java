package com.tencent.mm.plugin.backup.roambackup.ui.pkg;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageDeleteConfirmUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PackageDeleteConfirmUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public long f92829d = -1;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.aff.affroam.g f92830e;

    /* renamed from: f, reason: collision with root package name */
    public po1.d f92831f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f92832g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f92833h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f92834i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f92835m;

    /* renamed from: n, reason: collision with root package name */
    public int f92836n;

    public static final void T6(com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageDeleteConfirmUI packageDeleteConfirmUI) {
        packageDeleteConfirmUI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) packageDeleteConfirmUI, 1, true);
        k0Var.f211872n = new zo1.g2(packageDeleteConfirmUI);
        k0Var.f211881s = new zo1.h2(packageDeleteConfirmUI, k0Var);
        k0Var.q(packageDeleteConfirmUI.getString(com.tencent.mm.R.string.mxc), 17);
        k0Var.v();
    }

    public static final void U6(com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageDeleteConfirmUI packageDeleteConfirmUI) {
        packageDeleteConfirmUI.getClass();
        qo1.j0 d17 = qo1.j1.f365523a.d(packageDeleteConfirmUI.f92829d);
        jz5.l d18 = d17.d();
        com.tencent.wechat.aff.affroam.n0 n0Var = (com.tencent.wechat.aff.affroam.n0) d18.f302833d;
        if (n0Var == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_PREPARING || n0Var == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_RUNNING) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            boolean z17 = d17 instanceof qo1.v0;
            java.lang.String str = com.tencent.mm.plugin.backup.roambackup.w1.f92923a;
            objArr[0] = z17 ? com.tencent.mm.plugin.backup.roambackup.w1.f92923a : com.tencent.mm.plugin.backup.roambackup.w1.f92924b;
            java.lang.String string = packageDeleteConfirmUI.getString(com.tencent.mm.R.string.mwu, objArr);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(packageDeleteConfirmUI);
            e4Var.f211776c = string;
            e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
            e4Var.c();
            com.tencent.mars.xlog.Log.w("PackageDeleteConfirmUI", "A task is running, skip delete action, isBackupTask=" + z17);
            return;
        }
        com.tencent.mm.plugin.backup.roambackup.r0 r0Var = com.tencent.mm.plugin.backup.roambackup.r0.f92684a;
        long j17 = packageDeleteConfirmUI.f92829d;
        java.util.ArrayList d19 = kz5.c0.d(java.lang.Long.valueOf(j17));
        com.tencent.wechat.aff.affroam.g k17 = r0Var.k(j17);
        kotlin.jvm.internal.o.d(k17);
        java.lang.String a17 = go1.d.f273944a.a(k17);
        po1.c cVar = po1.d.f357294i;
        com.tencent.wechat.aff.affroam.u uVar = k17.f215832g;
        kotlin.jvm.internal.o.f(uVar, "getTargetDevice(...)");
        io1.a aVar = new io1.a(j17, io1.b.f293458d, cVar.a(uVar), 0.0f, false, 0);
        com.tencent.mm.plugin.backup.roambackup.b.f92568a.c(j17, com.tencent.mm.plugin.backup.roambackup.a.f92561e, aVar);
        r0Var.q(j17);
        com.tencent.mm.plugin.backup.roambackup.service.RoamForegroundService.f92724f.a();
        com.tencent.mm.plugin.backup.roambackup.u.f92737a.e().b(d19, new com.tencent.mm.plugin.backup.roambackup.b0(java.lang.System.currentTimeMillis(), j17, k17, aVar, a17));
        android.content.Intent intent = new android.content.Intent(packageDeleteConfirmUI, (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI.class);
        intent.putExtra("expandCard", true);
        intent.putExtra("packageId", packageDeleteConfirmUI.f92829d);
        intent.addFlags(67108864);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(packageDeleteConfirmUI, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageDeleteConfirmUI", "startDelete", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        packageDeleteConfirmUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(packageDeleteConfirmUI, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageDeleteConfirmUI", "startDelete", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        packageDeleteConfirmUI.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dxj;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new zo1.e2(this));
        setMMTitle("");
        setActionbarColor(getColor(com.tencent.mm.R.color.f478491c));
        setBackGroundColorResource(com.tencent.mm.R.color.f478491c);
        hideActionbarLine();
        setBounceEnabled(false);
        long longExtra = getIntent().getLongExtra("packageId", -1L);
        this.f92829d = longExtra;
        if (longExtra == -1) {
            com.tencent.mars.xlog.Log.e("PackageDeleteConfirmUI", "Error: Fail to get packageId from intent");
            finish();
            return;
        }
        com.tencent.wechat.aff.affroam.g k17 = com.tencent.mm.plugin.backup.roambackup.r0.f92684a.k(longExtra);
        kotlin.jvm.internal.o.d(k17);
        this.f92830e = k17;
        po1.c cVar = po1.d.f357294i;
        com.tencent.wechat.aff.affroam.u uVar = k17.f215832g;
        kotlin.jvm.internal.o.f(uVar, "getTargetDevice(...)");
        this.f92831f = cVar.a(uVar);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.rz7);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f92832g = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.rz8);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f92833h = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f486232rz5);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f92834i = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.f486231rz4);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.Button button = (android.widget.Button) findViewById4;
        this.f92835m = button;
        button.setOnClickListener(new zo1.f2(this));
        go1.d dVar = go1.d.f273944a;
        com.tencent.wechat.aff.affroam.g gVar = this.f92830e;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("pkgInfo");
            throw null;
        }
        java.lang.String a17 = dVar.a(gVar);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f92832g;
        if (weImageView == null) {
            kotlin.jvm.internal.o.o("iconIv");
            throw null;
        }
        weImageView.s(com.tencent.mm.R.raw.trash_off_regular, com.tencent.mm.R.color.FG_2);
        android.widget.TextView textView = this.f92833h;
        if (textView == null) {
            kotlin.jvm.internal.o.o("titleTv");
            throw null;
        }
        android.text.TextPaint paint = textView.getPaint();
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(1.25f);
        android.widget.TextView textView2 = this.f92833h;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("titleTv");
            throw null;
        }
        textView2.setText(getString(com.tencent.mm.R.string.mx_, a17));
        android.widget.TextView textView3 = this.f92834i;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("hintTv");
            throw null;
        }
        textView3.setText(com.tencent.mm.R.string.mxe);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.wechat.aff.affroam.g gVar2 = this.f92830e;
        if (gVar2 == null) {
            kotlin.jvm.internal.o.o("pkgInfo");
            throw null;
        }
        java.lang.String S1 = com.tencent.mm.sdk.platformtools.t8.S1(gVar2.f215837o.f215838d);
        kotlin.jvm.internal.o.f(S1, "toSizeKBSting(...)");
        sb6.append("(".concat(S1));
        sb6.append(')');
        java.lang.String sb7 = sb6.toString();
        android.widget.Button button2 = this.f92835m;
        if (button2 != null) {
            button2.setText(getString(com.tencent.mm.R.string.mvv, sb7));
        } else {
            kotlin.jvm.internal.o.o("deleteBtn");
            throw null;
        }
    }
}

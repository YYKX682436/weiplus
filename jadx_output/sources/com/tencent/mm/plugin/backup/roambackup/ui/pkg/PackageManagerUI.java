package com.tencent.mm.plugin.backup.roambackup.ui.pkg;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageManagerUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PackageManagerUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f92837m = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f92838d = -1;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.aff.affroam.g f92839e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f92840f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f92841g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f92842h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f92843i;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dxk;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.PackageManagerUI", "onActivityResult requestCode=" + i17 + ", resultCode=" + i18);
        if (i17 == 125 && i18 == -1) {
            final com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(getContext(), 2, 0, false, false);
            z2Var.y(getResources().getString(com.tencent.mm.R.string.f490454vi));
            z2Var.F = new com.tencent.mm.ui.widget.dialog.p3() { // from class: zo1.q2
                @Override // com.tencent.mm.ui.widget.dialog.p3
                public final void a() {
                    com.tencent.mm.ui.widget.dialog.z2.this.B();
                }
            };
            z2Var.x(1);
            z2Var.i(com.tencent.mm.R.layout.dq6);
            z2Var.C();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (!((com.tencent.mm.plugin.backup.roambackup.p1) ((mv.y) i95.n0.c(mv.y.class))).Ui()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PackageManagerUI", "Roam is disable");
            finish();
        }
        setMMTitle(com.tencent.mm.R.string.mwf);
        setBackBtn(new zo1.r2(this));
        long longExtra = getIntent().getLongExtra("packageId", -1L);
        this.f92838d = longExtra;
        if (longExtra == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PackageManagerUI", "Get a invalid package id");
            finish();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.tencent.mm.plugin.backup.roambackup.y1.K);
        com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct roamBackupRecoverReport28098Struct = new com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct();
        roamBackupRecoverReport28098Struct.f60066d = 8L;
        roamBackupRecoverReport28098Struct.f60067e = 1L;
        roamBackupRecoverReport28098Struct.k();
        ((android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.rzd)).setOnClickListener(new zo1.s2(this));
        ((android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.rz9)).setOnClickListener(new zo1.t2(this));
        ((android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.rzf)).setOnClickListener(new zo1.u2(this));
        ((android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.rzb)).setOnClickListener(new zo1.v2(this));
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.rza)).setOnClickListener(new zo1.x2(this));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.rze);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f92840f = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.rz_);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f92841g = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.rzg);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f92842h = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.rzc);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f92843i = (android.widget.TextView) findViewById4;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.backup.roambackup.r0.f92684a.e(true);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.backup.roambackup.r0 r0Var = com.tencent.mm.plugin.backup.roambackup.r0.f92684a;
        com.tencent.wechat.aff.affroam.g k17 = r0Var.k(this.f92838d);
        if (k17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PackageManagerUI", "Fail to get package by id=" + this.f92838d);
            finish();
            return;
        }
        this.f92839e = k17;
        java.lang.String a17 = go1.d.f273944a.a(k17);
        com.tencent.wechat.aff.affroam.g gVar = this.f92839e;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("pkgInfo");
            throw null;
        }
        java.lang.String S1 = com.tencent.mm.sdk.platformtools.t8.S1(gVar.f215837o.f215838d);
        com.tencent.mars.xlog.Log.i("MicroMsg.PackageManagerUI", "Package(pkgId=" + this.f92838d + ", displayName=" + a17 + ", size=" + S1 + ')');
        android.widget.TextView textView = this.f92840f;
        if (textView == null) {
            kotlin.jvm.internal.o.o("nameTv");
            throw null;
        }
        textView.setText(a17);
        android.widget.TextView textView2 = this.f92841g;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("backedUpConvsTv");
            throw null;
        }
        textView2.setText(S1);
        po1.a aVar = com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo.CREATOR;
        com.tencent.wechat.aff.affroam.g gVar2 = this.f92839e;
        if (gVar2 == null) {
            kotlin.jvm.internal.o.o("pkgInfo");
            throw null;
        }
        com.tencent.wechat.aff.affroam.i iVar = gVar2.f215834i;
        kotlin.jvm.internal.o.f(iVar, "getBackupRange(...)");
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo a18 = aVar.a(iVar);
        android.widget.TextView textView3 = this.f92842h;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("rangeTv");
            throw null;
        }
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        textView3.setText(fo1.r.c(a18, context));
        po1.c cVar = po1.d.f357294i;
        com.tencent.wechat.aff.affroam.g gVar3 = this.f92839e;
        if (gVar3 == null) {
            kotlin.jvm.internal.o.o("pkgInfo");
            throw null;
        }
        com.tencent.wechat.aff.affroam.u uVar = gVar3.f215832g;
        kotlin.jvm.internal.o.f(uVar, "getTargetDevice(...)");
        po1.d a19 = cVar.a(uVar);
        android.widget.TextView textView4 = this.f92843i;
        if (textView4 == null) {
            kotlin.jvm.internal.o.o("locationTv");
            throw null;
        }
        textView4.setText(a19.b());
        r0Var.e(false);
    }
}

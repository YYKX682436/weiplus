package com.tencent.mm.plugin.backup.roambackup.ui.pkg;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/pkg/StartRestoringUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lio1/c;", "", "<init>", "()V", "RestoreTaskStatusView", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class StartRestoringUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements io1.c {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f92881g = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartRestoringUI.RestoreTaskStatusView f92882d;

    /* renamed from: e, reason: collision with root package name */
    public long f92883e = -1;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.wechat.aff.affroam.g f92884f;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/pkg/StartRestoringUI$RestoreTaskStatusView;", "Lwo1/a1;", "app_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class RestoreTaskStatusView extends wo1.a1 {

        /* renamed from: v, reason: collision with root package name */
        public com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartRestoringUI f92885v;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public RestoreTaskStatusView(android.content.Context context, android.util.AttributeSet attrs) {
            this(context, attrs, 0, 0, 12, null);
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(attrs, "attrs");
        }

        @Override // wo1.a1
        public void k(com.tencent.wechat.aff.affroam.g pkgInfo, qo1.j0 task, po1.d device, int i17) {
            kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
            kotlin.jvm.internal.o.g(task, "task");
            kotlin.jvm.internal.o.g(device, "device");
            r();
            getIconRectangle().setVisibility(0);
            getIconRectangle().setImageResource(i17);
            getTitleTv().setText(com.tencent.mm.R.string.mzj);
            getGreenBtn().setVisibility(0);
            getGreenBtn().setText(com.tencent.mm.R.string.mwn);
            getGreenBtn().setOnClickListener(new com.tencent.mm.plugin.backup.roambackup.ui.pkg.d(this, pkgInfo, device));
            getLinkBtn().setVisibility(0);
            getLinkBtn().setText(com.tencent.mm.R.string.mzi);
            getLinkBtn().setOnClickListener(new com.tencent.mm.plugin.backup.roambackup.ui.pkg.g(this, device, pkgInfo));
        }

        @Override // wo1.a1
        public void p(com.tencent.wechat.aff.affroam.g pkgInfo, qo1.f0 task, po1.d device) {
            kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
            kotlin.jvm.internal.o.g(task, "task");
            kotlin.jvm.internal.o.g(device, "device");
            com.tencent.mars.xlog.Log.i("MicroMsg.StartRestoringUI", "stop restore task by pkgId=" + pkgInfo.f215829d);
            qo1.j1.f365523a.i(pkgInfo.f215829d);
            com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartRestoringUI startRestoringUI = this.f92885v;
            if (startRestoringUI == null) {
                kotlin.jvm.internal.o.o(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                throw null;
            }
            int i17 = com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartRestoringUI.f92881g;
            startRestoringUI.U6();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public RestoreTaskStatusView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
            this(context, attrs, i17, 0, 8, null);
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(attrs, "attrs");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public RestoreTaskStatusView(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5, int r6, kotlin.jvm.internal.i r7) {
            /*
                r1 = this;
                r7 = r6 & 4
                r0 = 0
                if (r7 == 0) goto L6
                r4 = r0
            L6:
                r6 = r6 & 8
                if (r6 == 0) goto Lb
                r5 = r0
            Lb:
                java.lang.String r6 = "context"
                kotlin.jvm.internal.o.g(r2, r6)
                java.lang.String r6 = "attrs"
                kotlin.jvm.internal.o.g(r3, r6)
                r1.<init>(r2, r3, r4, r5)
                r2 = 1
                r1.setDummyAsRestore(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartRestoringUI.RestoreTaskStatusView.<init>(android.content.Context, android.util.AttributeSet, int, int, int, kotlin.jvm.internal.i):void");
        }
    }

    @Override // io1.c
    public void P5(qo1.f0 task, float f17) {
        kotlin.jvm.internal.o.g(task, "task");
        if (this.f92883e == task.f365483i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StartRestoringUI", "onProgressChanged, pkgId=" + this.f92883e + ", percentage=" + f17);
            pm0.v.X(new com.tencent.mm.plugin.backup.roambackup.ui.pkg.h(this, f17, task));
        }
    }

    public final void U6() {
        finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477729q, com.tencent.mm.R.anim.f477855dd);
    }

    @Override // io1.c
    public void V1(qo1.j0 task, com.tencent.wechat.aff.affroam.n0 state, qo1.i0 error) {
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(error, "error");
        com.tencent.wechat.aff.affroam.g k17 = com.tencent.mm.plugin.backup.roambackup.r0.f92684a.k(this.f92883e);
        if (k17 == null && (k17 = this.f92884f) == null) {
            kotlin.jvm.internal.o.o("mPkgInfo");
            throw null;
        }
        this.f92884f = k17;
        com.tencent.mars.xlog.Log.i("MicroMsg.StartRestoringUI", "onTaskStateChanged, pkgId=" + this.f92883e + ", status=" + state);
        pm0.v.X(new com.tencent.mm.plugin.backup.roambackup.ui.pkg.i(this, task, state, error));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dxp;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        boolean a17;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 126 && i18 == -1) {
            if (!(intent == null)) {
                java.lang.String[] stringArrayExtra = intent.getStringArrayExtra("Select_Contact");
                if (stringArrayExtra == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.StartRestoringUI", "result is null");
                    return;
                }
                po1.c cVar = po1.d.f357294i;
                com.tencent.wechat.aff.affroam.g gVar = this.f92884f;
                if (gVar == null) {
                    kotlin.jvm.internal.o.o("mPkgInfo");
                    throw null;
                }
                com.tencent.wechat.aff.affroam.u uVar = gVar.f215832g;
                kotlin.jvm.internal.o.f(uVar, "getTargetDevice(...)");
                po1.d a18 = cVar.a(uVar);
                if (a18.f357296b != po1.g.f357310h) {
                    a17 = true;
                } else {
                    po1.d e17 = ro1.v.f398014a.e(a18.f357295a);
                    a17 = ((e17 == null || so1.b.f410226a.h(e17)) ? so1.g.f410238a : to1.g.f420911a).a(this, a18);
                }
                if (!a17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.StartRestoringUI", "Request permission failed");
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.StartRestoringUI", "start restore task, pkgId=" + this.f92883e);
                qo1.j1 j1Var = qo1.j1.f365523a;
                com.tencent.wechat.aff.affroam.g gVar2 = this.f92884f;
                if (gVar2 == null) {
                    kotlin.jvm.internal.o.o("mPkgInfo");
                    throw null;
                }
                int ordinal = j1Var.h(gVar2, kz5.z.z0(stringArrayExtra)).ordinal();
                if (ordinal == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.StartRestoringUI", "task launched(pkgId=" + this.f92883e + "), finish current activity.");
                    setResult(-1, getIntent());
                    U6();
                    return;
                }
                int i19 = com.tencent.mm.R.string.n0p;
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        i19 = com.tencent.mm.R.string.n0q;
                    } else if (ordinal != 3) {
                        throw new jz5.j();
                    }
                }
                int i27 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(this);
                e4Var.d(i19);
                e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
                e4Var.c();
                return;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("skip for invalid data, reqCode=");
        sb6.append(i17);
        sb6.append(", resultCode=");
        sb6.append(i18);
        sb6.append(", dataIsNull=");
        sb6.append(intent == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.StartRestoringUI", sb6.toString());
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        U6();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.wechat.aff.affroam.g gVar;
        super.onCreate(bundle);
        com.tencent.mm.plugin.backup.roambackup.v1 v1Var = com.tencent.mm.plugin.backup.roambackup.v1.f92914a;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (!v1Var.a(context, new zo1.k5(this))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.StartRestoringUI", "onCreate, can not backup ");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.tencent.mm.plugin.backup.roambackup.y1.Z);
        com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct roamBackupRecoverReport28098Struct = new com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct();
        roamBackupRecoverReport28098Struct.f60066d = 10L;
        roamBackupRecoverReport28098Struct.f60067e = 1L;
        roamBackupRecoverReport28098Struct.k();
        long longExtra = getIntent().getLongExtra("packageId", -1L);
        this.f92883e = longExtra;
        if (longExtra > 0) {
            gVar = com.tencent.mm.plugin.backup.roambackup.r0.f92684a.k(longExtra);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.StartRestoringUI", "Invalid packageId = " + this.f92883e);
            gVar = null;
        }
        if (gVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.StartRestoringUI", "Fail to get package by packageId=" + this.f92883e);
            U6();
            return;
        }
        this.f92884f = gVar;
        getWindow().addFlags(128);
        setMMTitle(com.tencent.mm.R.string.mzk);
        setBounceEnabled(false);
        setBackBtn(new zo1.l5(this), com.tencent.mm.R.raw.icons_outlined_arrow_down_circle);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.s7_);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartRestoringUI.RestoreTaskStatusView restoreTaskStatusView = (com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartRestoringUI.RestoreTaskStatusView) findViewById;
        this.f92882d = restoreTaskStatusView;
        restoreTaskStatusView.f92885v = this;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        qo1.j1.f365523a.e(this.f92883e, false);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.backup.roambackup.r0 r0Var = com.tencent.mm.plugin.backup.roambackup.r0.f92684a;
        r0Var.p(this);
        com.tencent.mm.plugin.backup.roambackup.r0.f92688e.remove(this);
        r0Var.e(true);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.backup.roambackup.r0 r0Var = com.tencent.mm.plugin.backup.roambackup.r0.f92684a;
        r0Var.b(this);
        com.tencent.mm.plugin.backup.roambackup.r0.f92688e.add(this);
        qo1.j0 d17 = qo1.j1.f365523a.d(this.f92883e);
        boolean z17 = d17 instanceof qo1.v0;
        if (z17 && d17.b()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.StartRestoringUI", "error task type, task=" + d17);
            U6();
            return;
        }
        if (z17) {
            d17 = new qo1.g0(this.f92883e);
        }
        jz5.l d18 = d17.d();
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartRestoringUI.RestoreTaskStatusView restoreTaskStatusView = this.f92882d;
        if (restoreTaskStatusView == null) {
            kotlin.jvm.internal.o.o("statueView");
            throw null;
        }
        com.tencent.wechat.aff.affroam.g gVar = this.f92884f;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("mPkgInfo");
            throw null;
        }
        restoreTaskStatusView.v(gVar, d17, (com.tencent.wechat.aff.affroam.n0) d18.f302833d, (qo1.i0) d18.f302834e);
        r0Var.e(false);
    }
}

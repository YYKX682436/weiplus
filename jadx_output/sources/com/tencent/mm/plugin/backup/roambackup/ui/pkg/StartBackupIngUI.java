package com.tencent.mm.plugin.backup.roambackup.ui.pkg;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/pkg/StartBackupIngUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lio1/c;", "", "<init>", "()V", "BackupTaskStatusView", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class StartBackupIngUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements io1.c {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartBackupIngUI.BackupTaskStatusView f92876e;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.wechat.aff.affroam.g f92878g;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f92875d = "MicroMsg.StartBackupIngUI";

    /* renamed from: f, reason: collision with root package name */
    public long f92877f = -1;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/pkg/StartBackupIngUI$BackupTaskStatusView;", "Lwo1/a1;", "app_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class BackupTaskStatusView extends wo1.a1 {

        /* renamed from: v, reason: collision with root package name */
        public final java.lang.String f92879v;

        /* renamed from: w, reason: collision with root package name */
        public com.tencent.mm.ui.MMActivity f92880w;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public BackupTaskStatusView(android.content.Context context, android.util.AttributeSet attrs) {
            this(context, attrs, 0, 0, 12, null);
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(attrs, "attrs");
        }

        @Override // wo1.a1
        public void p(com.tencent.wechat.aff.affroam.g pkgInfo, qo1.f0 task, po1.d device) {
            kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
            kotlin.jvm.internal.o.g(task, "task");
            kotlin.jvm.internal.o.g(device, "device");
            getLinkBtn().setOnClickListener(new com.tencent.mm.plugin.backup.roambackup.ui.pkg.a(this, pkgInfo));
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public BackupTaskStatusView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
            this(context, attrs, i17, 0, 8, null);
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(attrs, "attrs");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public BackupTaskStatusView(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5, int r6, kotlin.jvm.internal.i r7) {
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
                java.lang.String r2 = "BackupTaskStatusView"
                r1.f92879v = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartBackupIngUI.BackupTaskStatusView.<init>(android.content.Context, android.util.AttributeSet, int, int, int, kotlin.jvm.internal.i):void");
        }
    }

    @Override // io1.c
    public void P5(qo1.f0 task, float f17) {
        kotlin.jvm.internal.o.g(task, "task");
        long j17 = this.f92877f;
        if (j17 == task.f365483i) {
            com.tencent.wechat.aff.affroam.g k17 = com.tencent.mm.plugin.backup.roambackup.r0.f92684a.k(j17);
            if (k17 == null && (k17 = this.f92878g) == null) {
                kotlin.jvm.internal.o.o("mPkgInfo");
                throw null;
            }
            this.f92878g = k17;
            com.tencent.mars.xlog.Log.i(this.f92875d, "onProgressChanged, pkgId=" + this.f92877f + ", percentage = " + f17);
            pm0.v.X(new com.tencent.mm.plugin.backup.roambackup.ui.pkg.b(this, f17, task));
        }
    }

    @Override // io1.c
    public void V1(qo1.j0 task, com.tencent.wechat.aff.affroam.n0 state, qo1.i0 error) {
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(error, "error");
        if (this.f92877f == task.a()) {
            com.tencent.mars.xlog.Log.i(this.f92875d, "onTaskStateChanged, pkgId=" + this.f92877f + ", status=" + state);
            pm0.v.X(new com.tencent.mm.plugin.backup.roambackup.ui.pkg.c(this, task, state, error));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dxo;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.wechat.aff.affroam.g gVar;
        super.onCreate(bundle);
        com.tencent.mm.plugin.backup.roambackup.v1 v1Var = com.tencent.mm.plugin.backup.roambackup.v1.f92914a;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        boolean a17 = v1Var.a(context, new zo1.i5(this));
        java.lang.String str = this.f92875d;
        if (!a17) {
            com.tencent.mars.xlog.Log.e(str, "onCreate, can not backup ");
        }
        long longExtra = getIntent().getLongExtra("packageId", -1L);
        this.f92877f = longExtra;
        if (longExtra > 0) {
            gVar = com.tencent.mm.plugin.backup.roambackup.r0.f92684a.k(longExtra);
        } else {
            com.tencent.mars.xlog.Log.e(str, "Invalid packageId = " + this.f92877f);
            gVar = null;
        }
        if (gVar == null) {
            com.tencent.mars.xlog.Log.e(str, "Fail to get package by packageId=" + this.f92877f);
            finish();
            return;
        }
        this.f92878g = gVar;
        getWindow().addFlags(128);
        setMMTitle(com.tencent.mm.R.string.mzh);
        setBounceEnabled(false);
        setBackBtn(new zo1.j5(this));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.s79);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartBackupIngUI.BackupTaskStatusView backupTaskStatusView = (com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartBackupIngUI.BackupTaskStatusView) findViewById;
        this.f92876e = backupTaskStatusView;
        backupTaskStatusView.f92880w = this;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        qo1.j1.f365523a.e(this.f92877f, false);
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
        qo1.j0 d17 = qo1.j1.f365523a.d(this.f92877f);
        boolean z17 = d17 instanceof qo1.c1;
        if (z17 && d17.b()) {
            com.tencent.mars.xlog.Log.e(this.f92875d, "error task type, task=" + d17);
            finish();
            return;
        }
        if (z17) {
            d17 = new qo1.g0(this.f92877f);
        }
        jz5.l d18 = d17.d();
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartBackupIngUI.BackupTaskStatusView backupTaskStatusView = this.f92876e;
        if (backupTaskStatusView == null) {
            kotlin.jvm.internal.o.o("statueView");
            throw null;
        }
        com.tencent.wechat.aff.affroam.g gVar = this.f92878g;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("mPkgInfo");
            throw null;
        }
        backupTaskStatusView.v(gVar, d17, (com.tencent.wechat.aff.affroam.n0) d18.f302833d, (qo1.i0) d18.f302834e);
        r0Var.e(false);
    }
}

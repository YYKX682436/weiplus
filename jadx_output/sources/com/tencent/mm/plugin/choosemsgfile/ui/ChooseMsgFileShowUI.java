package com.tencent.mm.plugin.choosemsgfile.ui;

@db5.a(3)
/* loaded from: classes8.dex */
public class ChooseMsgFileShowUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f95577t = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f95580f;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.choosemsgfile.ui.b0 f95583i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.choosemsgfile.ui.c0 f95584m;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f95578d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f95579e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f95581g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f95582h = java.lang.Integer.toString(hashCode());

    /* renamed from: n, reason: collision with root package name */
    public boolean f95585n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f95586o = false;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f95587p = new com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI.AnonymousClass1(com.tencent.mm.app.a0.f53288d);

    /* renamed from: q, reason: collision with root package name */
    public final android.webkit.ValueCallback f95588q = new com.tencent.mm.plugin.choosemsgfile.ui.h(this);

    /* renamed from: r, reason: collision with root package name */
    public uh0.v f95589r = null;

    /* renamed from: s, reason: collision with root package name */
    public final android.webkit.ValueCallback f95590s = new com.tencent.mm.plugin.choosemsgfile.ui.m(this);

    /* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI$1, reason: invalid class name */
    /* loaded from: classes8.dex */
    public class AnonymousClass1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MiniQbFloatBallMenuActionEvent> {
        public AnonymousClass1(androidx.lifecycle.y yVar) {
            super(yVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        
            if (r1 != 8) goto L27;
         */
        @Override // com.tencent.mm.sdk.event.IListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean callback(com.tencent.mm.autogen.events.MiniQbFloatBallMenuActionEvent r19) {
            /*
                Method dump skipped, instructions count: 222
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI.AnonymousClass1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
        }
    }

    public final uh0.v U6(boolean z17) {
        uh0.v vVar;
        if (!z17 && (vVar = this.f95589r) != null) {
            return vVar;
        }
        uh0.v vVar2 = this.f95589r;
        if (vVar2 != null) {
            vVar2.f427739a = true;
        }
        com.tencent.mm.plugin.choosemsgfile.ui.i iVar = new com.tencent.mm.plugin.choosemsgfile.ui.i(this);
        this.f95589r = iVar;
        return iVar;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mm.plugin.choosemsgfile.ui.b0 b0Var = this.f95583i;
        if (b0Var != null) {
            b0Var.p();
        }
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f95578d = getIntent().getStringExtra("key_filepath");
        this.f95579e = getIntent().getStringExtra("key_fileext");
        this.f95580f = getIntent().getIntExtra("sence", 0);
        try {
            int lastIndexOf = this.f95578d.lastIndexOf(47) + 1;
            if (lastIndexOf < 0 || lastIndexOf == this.f95578d.length()) {
                lastIndexOf = 0;
            }
            java.lang.String str = this.f95578d;
            this.f95581g = str.substring(lastIndexOf, str.length());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChooseMsgFileShowUI", "get file name error " + e17.getMessage());
            this.f95581g = "";
        }
        com.tencent.mm.plugin.choosemsgfile.ui.b0 b0Var = new com.tencent.mm.plugin.choosemsgfile.ui.b0(new com.tencent.mm.plugin.choosemsgfile.ui.d0(getContext()));
        this.f95583i = b0Var;
        java.lang.String str2 = this.f95578d;
        java.lang.String str3 = this.f95579e;
        int i17 = this.f95580f;
        com.tencent.mars.xlog.Log.i("MicroMsg.FilesFloatBall.ChooseMsgFilesPageFloatBallHelper", "onCreate, filePath:%s fileExt:%s ", str2, str3);
        b0Var.f95614v = str2;
        b0Var.f95615w = i17;
        b0Var.b(4, qp1.n.c(str2));
        b0Var.t().f93086f = 4;
        b0Var.t().f93085e = b0Var.f95615w;
        b0Var.g();
        android.os.Bundle bundle2 = b0Var.f93132d.G;
        if (bundle2 != null) {
            bundle2.putBoolean("ifAppAttachDownloadUI", false);
            b0Var.f93132d.G.putString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, str2);
            b0Var.f93132d.G.putString("fileExt", str3);
            b0Var.f93132d.G.putInt("sence", java.lang.Integer.valueOf(i17).intValue());
            b0Var.g();
        }
        com.tencent.mm.plugin.choosemsgfile.ui.b0 b0Var2 = this.f95583i;
        java.lang.String str4 = this.f95579e;
        java.lang.String str5 = this.f95581g;
        b0Var2.getClass();
        java.lang.Integer b17 = qp1.a0.b(str4);
        if (b17 == null) {
            b17 = qp1.a0.b(com.eclipsesource.mmv8.Platform.UNKNOWN);
        }
        b0Var2.f93132d.f93060u = b17.intValue();
        b0Var2.f93132d.f93063x = str5;
        b0Var2.g();
        com.tencent.mm.plugin.choosemsgfile.ui.c0 c0Var = new com.tencent.mm.plugin.choosemsgfile.ui.c0(new com.tencent.mm.plugin.choosemsgfile.ui.e0(getContext()));
        this.f95584m = c0Var;
        java.lang.String str6 = this.f95578d;
        java.lang.String str7 = this.f95579e;
        int i18 = this.f95580f;
        com.tencent.mars.xlog.Log.i("MicroMsg.FilesFloatBall.ChooseMsgFilesPageMultiTaskHelper", "onCreate, filePath:%s fileExt:%s ", str6, str7);
        c0Var.y(4, com.tencent.mm.plugin.multitask.s0.c(str6));
        r45.qs0 qs0Var = c0Var.f95617x;
        qs0Var.set(1, str6);
        qs0Var.set(7, java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(str6)));
        qs0Var.set(2, str7);
        qs0Var.set(5, java.lang.Integer.valueOf(i18));
        qs0Var.set(0, java.lang.Boolean.FALSE);
        try {
            c0Var.f300077a.field_data = qs0Var.toByteArray();
        } catch (java.io.IOException e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FilesFloatBall.ChooseMsgFilesPageMultiTaskHelper", "handleMultiTaskInfoClicked", e18);
        }
        c0Var.J();
        com.tencent.mm.plugin.choosemsgfile.ui.c0 c0Var2 = this.f95584m;
        java.lang.String str8 = this.f95579e;
        java.lang.String str9 = this.f95581g;
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = c0Var2.f300077a;
        multiTaskInfo.v0().set(1, str9);
        multiTaskInfo.v0().set(4, str8);
        c0Var2.J();
        com.tencent.mm.sdk.event.IListener iListener = this.f95587p;
        if (iListener != null) {
            iListener.alive();
        }
        ((th0.u) ((uh0.r) i95.n0.c(uh0.r.class))).getClass();
        com.tencent.mm.xwebutil.i.f214840b = null;
        uh0.s sVar = (uh0.s) i95.n0.c(uh0.s.class);
        boolean s17 = this.f95584m.s();
        boolean a17 = this.f95584m.a();
        java.lang.String str10 = this.f95578d;
        java.lang.String str11 = this.f95581g;
        java.lang.String str12 = this.f95579e;
        java.lang.String str13 = this.f95582h;
        android.webkit.ValueCallback valueCallback = this.f95590s;
        uh0.v U6 = U6(true);
        ((th0.w) sVar).getClass();
        vt0.c.f(s17, a17, false, this, str10, str11, str12, "", str13, 7, valueCallback, U6, true, "", true, false);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        uh0.r rVar = (uh0.r) i95.n0.c(uh0.r.class);
        java.lang.String str = this.f95578d;
        ((th0.u) rVar).getClass();
        com.tencent.mm.xwebutil.i.a(this, this.f95582h, str);
        super.onDestroy();
        com.tencent.mm.sdk.event.IListener iListener = this.f95587p;
        if (iListener != null) {
            iListener.dead();
        }
        com.tencent.mm.plugin.choosemsgfile.ui.b0 b0Var = this.f95583i;
        if (b0Var != null) {
            b0Var.o0();
        }
        com.tencent.mm.plugin.choosemsgfile.ui.c0 c0Var = this.f95584m;
        if (c0Var != null) {
            c0Var.getClass();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.choosemsgfile.ui.b0 b0Var = this.f95583i;
        if (b0Var != null) {
            b0Var.z();
        }
        com.tencent.mm.plugin.choosemsgfile.ui.c0 c0Var = this.f95584m;
        if (c0Var != null) {
            c0Var.A();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.choosemsgfile.ui.b0 b0Var = this.f95583i;
        if (b0Var != null) {
            b0Var.x();
        }
        com.tencent.mm.plugin.choosemsgfile.ui.c0 c0Var = this.f95584m;
        if (c0Var != null) {
            c0Var.z();
        }
    }
}

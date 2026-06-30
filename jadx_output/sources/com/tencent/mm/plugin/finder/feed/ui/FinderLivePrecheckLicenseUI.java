package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLivePrecheckLicenseUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "com/tencent/mm/plugin/finder/feed/ui/bc", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderLivePrecheckLicenseUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI {
    public static final /* synthetic */ int I = 0;
    public boolean A;
    public boolean E;
    public int F;
    public long G;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMWebView f109403v;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.Button f109405x;

    /* renamed from: y, reason: collision with root package name */
    public az2.f f109406y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.network.r0 f109407z;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f109404w = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.hc(this));
    public java.lang.String B = "";
    public java.lang.String C = "";
    public int D = 5;
    public final com.tencent.mm.sdk.platformtools.b4 H = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.finder.feed.ui.gc(this), true);

    public final void d7(java.lang.String str) {
        if (com.tencent.mars.comm.NetStatusUtil.getNetType(getContext()) == -1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("licenseLoadUrl but non network, onNetworkChange is null:");
            sb6.append(this.f109407z == null);
            sb6.append('!');
            com.tencent.mars.xlog.Log.e("FinderLivePrecheckLicenseUI", sb6.toString());
            if (this.f109407z == null) {
                this.f109407z = new com.tencent.mm.plugin.finder.feed.ui.fc(this);
                gm0.j1.n().a(this.f109407z);
                return;
            }
            return;
        }
        if (this.A) {
            com.tencent.mars.xlog.Log.e("FinderLivePrecheckLicenseUI", "licenseLoadUrl " + str + " but haveLoadWebView!");
            return;
        }
        this.A = true;
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f109403v;
        if (mMWebView != null) {
            mMWebView.post(new com.tencent.mm.plugin.finder.feed.ui.ec(this, str));
        }
        com.tencent.mars.xlog.Log.i("FinderLivePrecheckLicenseUI", "licenseLoadUrl " + str + '!');
    }

    public final void e7() {
        if (kotlin.jvm.internal.o.b(this.B, "TYPE_STANDARD") && this.D <= 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_COUNTDOWN_FINISH", true);
            setResult(0, intent);
        }
        finish();
    }

    public final void f7() {
        android.widget.Button button = this.f109405x;
        if (button == null) {
            return;
        }
        button.setText(kotlin.jvm.internal.o.b(this.B, "TYPE_LICENSE") ? this.D <= 0 ? getResources().getString(com.tencent.mm.R.string.e5q) : getResources().getString(com.tencent.mm.R.string.e5p, java.lang.Integer.valueOf(this.D)) : this.D <= 0 ? getResources().getString(com.tencent.mm.R.string.e5m) : getResources().getString(com.tencent.mm.R.string.e5l, java.lang.Integer.valueOf(this.D)));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ax_;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("KEY_COUNTDOWN_FINISH", false) : false;
        com.tencent.mars.xlog.Log.i("FinderLivePrecheckLicenseUI", "onActivityResult requestCode:" + i17 + ", resultCode:" + i18 + ", standardCountdownFinish:" + booleanExtra);
        if (i17 == 1001) {
            if (i18 == -1) {
                setResult(-1);
                finish();
            }
            this.E = booleanExtra;
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        e7();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0135  */
    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.FinderLivePrecheckLicenseUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("FinderLivePrecheckLicenseUI", "onDestroy");
        super.onDestroy();
        this.H.d();
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f109403v;
        if (mMWebView != null) {
            mMWebView.destroy();
        }
        this.f109403v = null;
        com.tencent.mm.network.r0 r0Var = this.f109407z;
        if (r0Var != null) {
            gm0.j1.n().d(r0Var);
        }
        az2.f fVar = this.f109406y;
        if (fVar != null) {
            fVar.b();
        }
        this.f109406y = null;
    }
}

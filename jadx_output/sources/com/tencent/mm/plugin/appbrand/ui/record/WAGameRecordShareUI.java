package com.tencent.mm.plugin.appbrand.ui.record;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "ShareResult", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public class WAGameRecordShareUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f90180p = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.CommonVideoView f90181d;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f90184g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f90185h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f90186i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f90187m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f90188n;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f90182e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public m33.k1 f90183f = new m33.k1();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f90189o = new java.util.HashMap(4);

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareUI$ShareResult;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes7.dex */
    public static final class ShareResult implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI.ShareResult> CREATOR = new com.tencent.mm.plugin.appbrand.ui.record.a();

        /* renamed from: d, reason: collision with root package name */
        public final int f90190d;

        /* renamed from: e, reason: collision with root package name */
        public final java.lang.String f90191e;

        public ShareResult(int i17, java.lang.String errMsg) {
            kotlin.jvm.internal.o.g(errMsg, "errMsg");
            this.f90190d = i17;
            this.f90191e = errMsg;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel out, int i17) {
            kotlin.jvm.internal.o.g(out, "out");
            out.writeInt(this.f90190d);
            out.writeString(this.f90191e);
        }
    }

    public static final void T6(com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI, java.lang.String str) {
        wAGameRecordShareUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameRecordShareUI", "hy: jump to " + str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("geta8key_username", c01.z1.r());
        j45.l.j(wAGameRecordShareUI, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public static final void U6(com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI, int i17, int i18, java.lang.String str) {
        jz5.f0 f0Var;
        java.util.HashMap hashMap = wAGameRecordShareUI.f90189o;
        com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI.ShareResult shareResult = (com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI.ShareResult) hashMap.get(java.lang.Integer.valueOf(i17));
        if (shareResult != null) {
            if (shareResult.f90190d != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WAGameRecordShareUI", "hy: share option " + i17 + " update with " + i18 + ", " + str);
                hashMap.put(java.lang.Integer.valueOf(i17), new com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI.ShareResult(i18, str));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WAGameRecordShareUI", "hy: share option " + i17 + " will not update result due to former success");
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WAGameRecordShareUI", "hy: share option " + i17 + " init with " + i18 + ", " + str);
            hashMap.put(java.lang.Integer.valueOf(i17), new com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI.ShareResult(i18, str));
        }
    }

    public static final void V6(com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI) {
        wAGameRecordShareUI.getClass();
        m33.l1 l1Var = (m33.l1) i95.n0.c(m33.l1.class);
        java.util.ArrayList videoFiles = wAGameRecordShareUI.f90182e;
        fk1.u uVar = new fk1.u(wAGameRecordShareUI);
        ((com.tencent.mm.plugin.game.p0) l1Var).getClass();
        i53.l4 l4Var = new i53.l4();
        kotlin.jvm.internal.o.g(videoFiles, "videoFiles");
        if (videoFiles.isEmpty()) {
            uVar.a("videoFiles is empty");
            return;
        }
        java.util.Iterator it = videoFiles.iterator();
        while (it.hasNext()) {
            m33.k1 k1Var = (m33.k1) it.next();
            java.lang.String str = k1Var.f323303a;
            java.lang.String str2 = k1Var.f323306d;
            n53.b.c(new lj0.b(str, 0L, 1L, 2, 2, 0, k1Var.f323309g, k1Var.f323310h, str2, 34, null));
        }
        java.lang.String c17 = com.tencent.mm.vfs.q7.c("gameCenterVideos");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        ((ku5.t0) ku5.t0.f312615d).g(new i53.k4(videoFiles, c17, l4Var, arrayList, 50, uVar));
    }

    public static /* synthetic */ void a7(com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI, long j17, long j18, int i17, int i18, java.lang.String str, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report");
        }
        wAGameRecordShareUI.Z6(j17, j18, i17, (i19 & 8) != 0 ? 0 : i18, (i19 & 16) != 0 ? null : str);
    }

    public int W6(int i17) {
        float f17;
        int i18;
        if (i17 == com.tencent.mm.R.layout.f488033ey) {
            f17 = getResources().getDisplayMetrics().density;
            i18 = com.tencent.wcdb.FileUtils.S_IRWXU;
        } else {
            if (i17 != com.tencent.mm.R.layout.f488034ez) {
                return 0;
            }
            f17 = getResources().getDisplayMetrics().density;
            i18 = 371;
        }
        return (int) (f17 * i18);
    }

    public double X6() {
        return 0.74d;
    }

    public void Y6(android.view.View reLayoutButton, android.view.View hideButton) {
        kotlin.jvm.internal.o.g(reLayoutButton, "reLayoutButton");
        kotlin.jvm.internal.o.g(hideButton, "hideButton");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(hideButton, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareUI", "reLayoutAndHideButton", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        hideButton.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(hideButton, "com/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareUI", "reLayoutAndHideButton", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(reLayoutButton.getLayoutParams());
        layoutParams.width = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479679cf);
        layoutParams.setMarginStart(0);
        layoutParams.setMarginEnd(0);
        reLayoutButton.setLayoutParams(layoutParams);
    }

    public final void Z6(long j17, long j18, int i17, int i18, java.lang.String str) {
        java.lang.Object obj = this.f90182e.get(0);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        m33.k1 k1Var = (m33.k1) obj;
        this.f90183f = k1Var;
        lj0.b bVar = new lj0.b(k1Var.f323303a, j17, j18, i17, i18, 0, k1Var.f323309g, k1Var.f323310h, str);
        ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).getClass();
        n53.b.c(bVar);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("k_ext_data", this.f90189o);
        setResult(-1, intent);
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488038f3;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setNavigationbarColor(b3.l.getColor(this, com.tencent.mm.R.color.j_));
        setActionbarColor(b3.l.getColor(this, com.tencent.mm.R.color.j_));
        setMMTitle("");
        setBackGroundColorResource(com.tencent.mm.R.color.j_);
        java.lang.String valueOf = java.lang.String.valueOf(getIntent().getStringExtra("k_ext_absFilePath"));
        this.f90184g = valueOf;
        m33.k1 k1Var = this.f90183f;
        k1Var.f323305c = valueOf;
        k1Var.f323303a = java.lang.String.valueOf(getIntent().getStringExtra("k_ext_appid"));
        k1Var.f323304b = java.lang.String.valueOf(getIntent().getStringExtra("k_ext_appName"));
        k1Var.f323306d = java.lang.String.valueOf(getIntent().getStringExtra("k_ext_configJson"));
        k1Var.f323307e = java.lang.String.valueOf(getIntent().getStringExtra("k_ext_share_title"));
        k1Var.f323308f = java.lang.String.valueOf(getIntent().getStringExtra("k_ext_share_desc"));
        k1Var.f323309g = getIntent().getIntExtra("k_ext_app_version", 0);
        k1Var.f323310h = getIntent().getIntExtra("k_ext_app_version_type", 0);
        k1Var.f323311i = getIntent().getIntExtra("k_ext_is_dev_edited", 0);
        this.f90182e.add(this.f90183f);
        java.util.ArrayList<java.lang.Integer> integerArrayListExtra = getIntent().getIntegerArrayListExtra("k_ext_share_options");
        kotlin.jvm.internal.o.e(integerArrayListExtra, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Int>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Int> }");
        this.f90185h = integerArrayListExtra;
        setBackBtn(new fk1.p(this));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.c8t);
        com.tencent.mm.pluginsdk.ui.CommonVideoView commonVideoView = (com.tencent.mm.pluginsdk.ui.CommonVideoView) findViewById;
        commonVideoView.setIMMVideoViewCallback(new fk1.m(commonVideoView));
        java.lang.String str = this.f90184g;
        if (str == null) {
            kotlin.jvm.internal.o.o("absVideoPath");
            throw null;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            commonVideoView.stop();
            java.lang.String str2 = this.f90184g;
            if (str2 == null) {
                kotlin.jvm.internal.o.o("absVideoPath");
                throw null;
            }
            commonVideoView.h(false, str2, 0);
        }
        commonVideoView.setIsShowBasicControls(true);
        commonVideoView.setScaleType(com.tencent.mm.pluginsdk.ui.e1.COVER);
        commonVideoView.getLayoutParams().height = (int) (commonVideoView.getResources().getDisplayMetrics().heightPixels * X6());
        kotlin.jvm.internal.o.f(findViewById, "apply(...)");
        this.f90181d = (com.tencent.mm.pluginsdk.ui.CommonVideoView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f487096nh4);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f90186i = (android.widget.Button) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.msi);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f90187m = (android.widget.Button) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.mth);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f90188n = (android.widget.TextView) findViewById4;
        java.util.ArrayList arrayList = this.f90185h;
        if (arrayList == null) {
            kotlin.jvm.internal.o.o("shareOptionsInParam");
            throw null;
        }
        if (arrayList.contains(3)) {
            android.widget.Button button = this.f90186i;
            if (button == null) {
                kotlin.jvm.internal.o.o("stashButton");
                throw null;
            }
            button.setOnClickListener(new fk1.d(this));
        } else {
            android.widget.Button button2 = this.f90187m;
            if (button2 == null) {
                kotlin.jvm.internal.o.o("shareButton");
                throw null;
            }
            android.widget.Button button3 = this.f90186i;
            if (button3 == null) {
                kotlin.jvm.internal.o.o("stashButton");
                throw null;
            }
            Y6(button2, button3);
        }
        java.util.ArrayList arrayList2 = this.f90185h;
        if (arrayList2 == null) {
            kotlin.jvm.internal.o.o("shareOptionsInParam");
            throw null;
        }
        if (!arrayList2.contains(0)) {
            java.util.ArrayList arrayList3 = this.f90185h;
            if (arrayList3 == null) {
                kotlin.jvm.internal.o.o("shareOptionsInParam");
                throw null;
            }
            if (!arrayList3.contains(1)) {
                java.util.ArrayList arrayList4 = this.f90185h;
                if (arrayList4 == null) {
                    kotlin.jvm.internal.o.o("shareOptionsInParam");
                    throw null;
                }
                if (!arrayList4.contains(2)) {
                    android.widget.Button button4 = this.f90186i;
                    if (button4 == null) {
                        kotlin.jvm.internal.o.o("stashButton");
                        throw null;
                    }
                    android.widget.Button button5 = this.f90187m;
                    if (button5 == null) {
                        kotlin.jvm.internal.o.o("shareButton");
                        throw null;
                    }
                    Y6(button4, button5);
                    Z6(601L, 0L, 1, 1, "{\"isEdit\": " + this.f90183f.f323311i + '}');
                }
            }
        }
        android.widget.Button button6 = this.f90187m;
        if (button6 == null) {
            kotlin.jvm.internal.o.o("shareButton");
            throw null;
        }
        button6.setOnClickListener(new fk1.l(this));
        Z6(601L, 0L, 1, 1, "{\"isEdit\": " + this.f90183f.f323311i + '}');
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f90182e.clear();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.pluginsdk.ui.CommonVideoView commonVideoView = this.f90181d;
        if (commonVideoView == null) {
            kotlin.jvm.internal.o.o("playView");
            throw null;
        }
        if (commonVideoView.isPlaying()) {
            com.tencent.mm.pluginsdk.ui.CommonVideoView commonVideoView2 = this.f90181d;
            if (commonVideoView2 != null) {
                commonVideoView2.pause();
            } else {
                kotlin.jvm.internal.o.o("playView");
                throw null;
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.pluginsdk.ui.CommonVideoView commonVideoView = this.f90181d;
        if (commonVideoView == null) {
            kotlin.jvm.internal.o.o("playView");
            throw null;
        }
        if (commonVideoView.isPlaying()) {
            return;
        }
        com.tencent.mm.pluginsdk.ui.CommonVideoView commonVideoView2 = this.f90181d;
        if (commonVideoView2 != null) {
            commonVideoView2.start();
        } else {
            kotlin.jvm.internal.o.o("playView");
            throw null;
        }
    }
}

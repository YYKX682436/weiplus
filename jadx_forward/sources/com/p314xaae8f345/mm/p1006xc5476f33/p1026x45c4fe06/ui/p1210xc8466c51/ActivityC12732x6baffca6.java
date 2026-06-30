package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "ShareResult", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI */
/* loaded from: classes8.dex */
public class ActivityC12732x6baffca6 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f171713p = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5 f171714d;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f171717g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f171718h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f171719i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f171720m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f171721n;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f171715e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public m33.k1 f171716f = new m33.k1();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f171722o = new java.util.HashMap(4);

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareUI$ShareResult;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI$ShareResult */
    /* loaded from: classes7.dex */
    public static final class ShareResult implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6.ShareResult> f35303x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.a();

        /* renamed from: d, reason: collision with root package name */
        public final int f171723d;

        /* renamed from: e, reason: collision with root package name */
        public final java.lang.String f171724e;

        public ShareResult(int i17, java.lang.String errMsg) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
            this.f171723d = i17;
            this.f171724e = errMsg;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel out, int i17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
            out.writeInt(this.f171723d);
            out.writeString(this.f171724e);
        }
    }

    public static final void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 activityC12732x6baffca6, java.lang.String str) {
        activityC12732x6baffca6.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameRecordShareUI", "hy: jump to " + str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("geta8key_username", c01.z1.r());
        j45.l.j(activityC12732x6baffca6, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public static final void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 activityC12732x6baffca6, int i17, int i18, java.lang.String str) {
        jz5.f0 f0Var;
        java.util.HashMap hashMap = activityC12732x6baffca6.f171722o;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6.ShareResult shareResult = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6.ShareResult) hashMap.get(java.lang.Integer.valueOf(i17));
        if (shareResult != null) {
            if (shareResult.f171723d != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameRecordShareUI", "hy: share option " + i17 + " update with " + i18 + ", " + str);
                hashMap.put(java.lang.Integer.valueOf(i17), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6.ShareResult(i18, str));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameRecordShareUI", "hy: share option " + i17 + " will not update result due to former success");
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameRecordShareUI", "hy: share option " + i17 + " init with " + i18 + ", " + str);
            hashMap.put(java.lang.Integer.valueOf(i17), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6.ShareResult(i18, str));
        }
    }

    public static final void V6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 activityC12732x6baffca6) {
        activityC12732x6baffca6.getClass();
        m33.l1 l1Var = (m33.l1) i95.n0.c(m33.l1.class);
        java.util.ArrayList videoFiles = activityC12732x6baffca6.f171715e;
        fk1.u uVar = new fk1.u(activityC12732x6baffca6);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) l1Var).getClass();
        i53.l4 l4Var = new i53.l4();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoFiles, "videoFiles");
        if (videoFiles.isEmpty()) {
            uVar.a("videoFiles is empty");
            return;
        }
        java.util.Iterator it = videoFiles.iterator();
        while (it.hasNext()) {
            m33.k1 k1Var = (m33.k1) it.next();
            java.lang.String str = k1Var.f404836a;
            java.lang.String str2 = k1Var.f404839d;
            n53.b.c(new lj0.b(str, 0L, 1L, 2, 2, 0, k1Var.f404842g, k1Var.f404843h, str2, 34, null));
        }
        java.lang.String c17 = com.p314xaae8f345.mm.vfs.q7.c("gameCenterVideos");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        ((ku5.t0) ku5.t0.f394148d).g(new i53.k4(videoFiles, c17, l4Var, arrayList, 50, uVar));
    }

    public static /* synthetic */ void a7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 activityC12732x6baffca6, long j17, long j18, int i17, int i18, java.lang.String str, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report");
        }
        activityC12732x6baffca6.Z6(j17, j18, i17, (i19 & 8) != 0 ? 0 : i18, (i19 & 16) != 0 ? null : str);
    }

    public int W6(int i17) {
        float f17;
        int i18;
        if (i17 == com.p314xaae8f345.mm.R.C30864xbddafb2a.f569566ey) {
            f17 = getResources().getDisplayMetrics().density;
            i18 = com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df;
        } else {
            if (i17 != com.p314xaae8f345.mm.R.C30864xbddafb2a.f569567ez) {
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reLayoutButton, "reLayoutButton");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hideButton, "hideButton");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(hideButton, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareUI", "reLayoutAndHideButton", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        hideButton.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(hideButton, "com/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareUI", "reLayoutAndHideButton", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(reLayoutButton.getLayoutParams());
        layoutParams.width = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561212cf);
        layoutParams.setMarginStart(0);
        layoutParams.setMarginEnd(0);
        reLayoutButton.setLayoutParams(layoutParams);
    }

    public final void Z6(long j17, long j18, int i17, int i18, java.lang.String str) {
        java.lang.Object obj = this.f171715e.get(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        m33.k1 k1Var = (m33.k1) obj;
        this.f171716f = k1Var;
        lj0.b bVar = new lj0.b(k1Var.f404836a, j17, j18, i17, i18, 0, k1Var.f404842g, k1Var.f404843h, str);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).getClass();
        n53.b.c(bVar);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("k_ext_data", this.f171722o);
        setResult(-1, intent);
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569571f3;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo78578x8b18f126(b3.l.m9702x7444d5ad(this, com.p314xaae8f345.mm.R.C30859x5a72f63.j_));
        mo64405x4dab7448(b3.l.m9702x7444d5ad(this, com.p314xaae8f345.mm.R.C30859x5a72f63.j_));
        mo54450xbf7c1df6("");
        m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.j_);
        java.lang.String valueOf = java.lang.String.valueOf(getIntent().getStringExtra("k_ext_absFilePath"));
        this.f171717g = valueOf;
        m33.k1 k1Var = this.f171716f;
        k1Var.f404838c = valueOf;
        k1Var.f404836a = java.lang.String.valueOf(getIntent().getStringExtra("k_ext_appid"));
        k1Var.f404837b = java.lang.String.valueOf(getIntent().getStringExtra("k_ext_appName"));
        k1Var.f404839d = java.lang.String.valueOf(getIntent().getStringExtra("k_ext_configJson"));
        k1Var.f404840e = java.lang.String.valueOf(getIntent().getStringExtra("k_ext_share_title"));
        k1Var.f404841f = java.lang.String.valueOf(getIntent().getStringExtra("k_ext_share_desc"));
        k1Var.f404842g = getIntent().getIntExtra("k_ext_app_version", 0);
        k1Var.f404843h = getIntent().getIntExtra("k_ext_app_version_type", 0);
        k1Var.f404844i = getIntent().getIntExtra("k_ext_is_dev_edited", 0);
        this.f171715e.add(this.f171716f);
        java.util.ArrayList<java.lang.Integer> integerArrayListExtra = getIntent().getIntegerArrayListExtra("k_ext_share_options");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(integerArrayListExtra, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Int>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Int> }");
        this.f171718h = integerArrayListExtra;
        mo54448x9c8c0d33(new fk1.p(this));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.c8t);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5 c19637x95a2b3f5 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5) findViewById;
        c19637x95a2b3f5.mo61532x526554de(new fk1.m(c19637x95a2b3f5));
        java.lang.String str = this.f171717g;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("absVideoPath");
            throw null;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            c19637x95a2b3f5.mo48239x360802();
            java.lang.String str2 = this.f171717g;
            if (str2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("absVideoPath");
                throw null;
            }
            c19637x95a2b3f5.h(false, str2, 0);
        }
        c19637x95a2b3f5.mo64629xc2e9d13b(true);
        c19637x95a2b3f5.mo48237xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.COVER);
        c19637x95a2b3f5.getLayoutParams().height = (int) (c19637x95a2b3f5.getResources().getDisplayMetrics().heightPixels * X6());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "apply(...)");
        this.f171714d = (com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f568629nh4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f171719i = (android.widget.Button) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.msi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f171720m = (android.widget.Button) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.mth);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f171721n = (android.widget.TextView) findViewById4;
        java.util.ArrayList arrayList = this.f171718h;
        if (arrayList == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shareOptionsInParam");
            throw null;
        }
        if (arrayList.contains(3)) {
            android.widget.Button button = this.f171719i;
            if (button == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("stashButton");
                throw null;
            }
            button.setOnClickListener(new fk1.d(this));
        } else {
            android.widget.Button button2 = this.f171720m;
            if (button2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shareButton");
                throw null;
            }
            android.widget.Button button3 = this.f171719i;
            if (button3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("stashButton");
                throw null;
            }
            Y6(button2, button3);
        }
        java.util.ArrayList arrayList2 = this.f171718h;
        if (arrayList2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shareOptionsInParam");
            throw null;
        }
        if (!arrayList2.contains(0)) {
            java.util.ArrayList arrayList3 = this.f171718h;
            if (arrayList3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shareOptionsInParam");
                throw null;
            }
            if (!arrayList3.contains(1)) {
                java.util.ArrayList arrayList4 = this.f171718h;
                if (arrayList4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shareOptionsInParam");
                    throw null;
                }
                if (!arrayList4.contains(2)) {
                    android.widget.Button button4 = this.f171719i;
                    if (button4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("stashButton");
                        throw null;
                    }
                    android.widget.Button button5 = this.f171720m;
                    if (button5 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shareButton");
                        throw null;
                    }
                    Y6(button4, button5);
                    Z6(601L, 0L, 1, 1, "{\"isEdit\": " + this.f171716f.f404844i + '}');
                }
            }
        }
        android.widget.Button button6 = this.f171720m;
        if (button6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shareButton");
            throw null;
        }
        button6.setOnClickListener(new fk1.l(this));
        Z6(601L, 0L, 1, 1, "{\"isEdit\": " + this.f171716f.f404844i + '}');
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f171715e.clear();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5 c19637x95a2b3f5 = this.f171714d;
        if (c19637x95a2b3f5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("playView");
            throw null;
        }
        if (c19637x95a2b3f5.mo61531xc00617a4()) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5 c19637x95a2b3f52 = this.f171714d;
            if (c19637x95a2b3f52 != null) {
                c19637x95a2b3f52.mo48231x65825f6();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("playView");
                throw null;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5 c19637x95a2b3f5 = this.f171714d;
        if (c19637x95a2b3f5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("playView");
            throw null;
        }
        if (c19637x95a2b3f5.mo61531xc00617a4()) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5 c19637x95a2b3f52 = this.f171714d;
        if (c19637x95a2b3f52 != null) {
            c19637x95a2b3f52.mo48238x68ac462();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("playView");
            throw null;
        }
    }
}

package kp3;

/* loaded from: classes12.dex */
public final class f extends y9.i {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f392510n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f392511o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.LinearLayout f392512p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.VideoView f392513q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.ImageView f392514r;

    /* renamed from: s, reason: collision with root package name */
    public final p012xc85e97e9.p062xff91adb5.p063xd1075a44.C1055x35d85f5 f392515s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f392516t;

    /* renamed from: u, reason: collision with root package name */
    public long f392517u;

    /* renamed from: v, reason: collision with root package name */
    public long f392518v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f392519w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context, java.lang.String str) {
        super(context, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f392510n = str;
        this.f392519w = "";
        android.view.View inflate = getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.elo, (android.view.ViewGroup) null);
        if (inflate != null) {
            this.f392511o = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567774up1);
            this.f392512p = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567773up0);
            this.f392513q = (android.widget.VideoView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567775up2);
            this.f392514r = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567777up4);
            p012xc85e97e9.p062xff91adb5.p063xd1075a44.C1055x35d85f5 c1055x35d85f5 = (p012xc85e97e9.p062xff91adb5.p063xd1075a44.C1055x35d85f5) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567776up3);
            this.f392515s = c1055x35d85f5;
            if (c1055x35d85f5 != null) {
                c1055x35d85f5.post(new kp3.a(this));
            }
            ((android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.uoz)).setOnClickListener(new kp3.b(this));
            setContentView(inflate);
        }
    }

    public final void E(java.lang.String str) {
        if (isShowing()) {
            this.f392519w = str;
            dismiss();
        }
    }

    public final void F(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        android.widget.VideoView videoView;
        android.widget.ImageView imageView;
        android.widget.TextView textView;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmGuideDialog", "[showGuideDialog] title:" + str + ", content:" + str2 + ", videoMaskUrl:" + str3 + ", videoUrl: " + str4);
        if (str == null || str.length() == 0) {
            str = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.obv);
        }
        if (!(str == null || str.length() == 0) && (textView = this.f392511o) != null) {
            textView.setText(str);
        }
        if (str2 == null || str2.length() == 0) {
            str2 = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.obu);
        }
        java.lang.String str5 = str2;
        if (!(str5 == null || str5.length() == 0)) {
            android.widget.LinearLayout linearLayout = this.f392512p;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            java.util.List<java.lang.String> f07 = r26.n0.f0(str5, new java.lang.String[]{"\n"}, false, 0, 6, null);
            for (java.lang.String str6 : f07) {
                android.view.View inflate = getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.elp, (android.view.ViewGroup) null);
                if (inflate != null) {
                    android.widget.ImageView imageView2 = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.uox);
                    if (imageView2 != null) {
                        imageView2.setVisibility(f07.size() > 1 ? 0 : 8);
                    }
                    android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.uoy);
                    if (textView2 != null) {
                        textView2.setText(str6);
                    }
                    if (linearLayout != null) {
                        linearLayout.addView(inflate);
                    }
                }
            }
        }
        if (str4 == null || str4.length() == 0) {
            str3 = "https://cdn.palmda.com/static/img/palm_guide_img_right.jpg";
        }
        if (str4 == null || str4.length() == 0) {
            str4 = "https://cdn.palmda.com/static/video/right.mp4";
        }
        if (!(str3 == null || str3.length() == 0) && (imageView = this.f392514r) != null) {
            ((wo0.b) vo0.e.f520001b.a(str3)).c(imageView);
            imageView.setVisibility(0);
        }
        if (!(str4 == null || str4.length() == 0) && (videoView = this.f392513q) != null) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.f392518v = 0L;
            if (videoView != null) {
                if (videoView.isPlaying()) {
                    videoView.stopPlayback();
                }
                videoView.setOnPreparedListener(null);
                videoView.setOnInfoListener(null);
            }
            videoView.setOnPreparedListener(kp3.d.f392502a);
            videoView.setOnInfoListener(new kp3.e(new p3321xbce91901.jvm.p3324x21ffc6bd.c0(), this, currentTimeMillis, videoView));
            videoView.setVideoURI(android.net.Uri.parse(str4));
        }
        show();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        long j17;
        if (isShowing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmGuideDialog", "[dismiss]");
            jp3.t tVar = jp3.t.f382562a;
            if (this.f392517u != 0) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                j17 = java.lang.System.currentTimeMillis() - this.f392517u;
            } else {
                j17 = 0;
            }
            java.lang.Long valueOf = java.lang.Long.valueOf(j17);
            java.lang.String str = this.f392519w;
            java.lang.String str2 = str == null || str.length() == 0 ? "cancel" : this.f392519w;
            java.lang.Long valueOf2 = java.lang.Long.valueOf(this.f392518v);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doGuidePopUpInfoReport] sessionId:");
            java.lang.String str3 = this.f392510n;
            sb6.append(str3);
            sb6.append(", showDuringMs:");
            sb6.append(valueOf);
            sb6.append(", closeReason:");
            sb6.append(str2);
            sb6.append(", guideVideoLoadCostMs:");
            sb6.append(valueOf2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmReportHelper", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[8];
            if (str3 == null) {
                str3 = "";
            }
            objArr[0] = str3;
            objArr[1] = 0;
            objArr[2] = "";
            objArr[3] = "palm_guide_popup_info";
            objArr[4] = java.lang.Long.valueOf(valueOf != null ? valueOf.longValue() : 0L);
            objArr[5] = java.lang.Long.valueOf(valueOf2 != null ? valueOf2.longValue() : 0L);
            objArr[6] = 0;
            if (str2 == null) {
                str2 = "";
            }
            objArr[7] = str2;
            g0Var.d(31121, objArr);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f392516t;
            if (b4Var != null) {
                b4Var.d();
            }
            android.widget.VideoView videoView = this.f392513q;
            if (videoView != null) {
                if (videoView.isPlaying()) {
                    videoView.stopPlayback();
                }
                videoView.setOnPreparedListener(null);
                videoView.setOnInfoListener(null);
            }
            p012xc85e97e9.p062xff91adb5.p063xd1075a44.C1055x35d85f5 c1055x35d85f5 = this.f392515s;
            if (c1055x35d85f5 != null) {
                c1055x35d85f5.removeAllViews();
            }
            super.dismiss();
        }
    }

    @Override // y9.i, p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f575608dq);
        }
        android.view.Window window2 = getWindow();
        if (window2 == null) {
            return;
        }
        window2.setNavigationBarColor(b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f));
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        if (isShowing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmGuideDialog", "[show]");
            this.f392519w = "";
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f392517u = java.lang.System.currentTimeMillis();
        }
    }
}

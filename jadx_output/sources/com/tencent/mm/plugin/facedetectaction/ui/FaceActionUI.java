package com.tencent.mm.plugin.facedetectaction.ui;

@db5.a(3)
/* loaded from: classes14.dex */
public class FaceActionUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f100173J = 0;
    public k72.i A;
    public int B;
    public int C;
    public int D;
    public long E;
    public long F;
    public int G;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.RelativeLayout f100174d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.RelativeLayout f100175e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.RelativeLayout f100176f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.RelativeLayout f100177g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.facedetectlight.ui.PreviewFrameLayout f100178h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.facedetectaction.ui.FaceActionMask f100179i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMTextureView f100180m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f100181n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f100182o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f100183p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f100184q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f100185r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f100186s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.Button f100187t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.Button f100188u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f100189v;

    /* renamed from: x, reason: collision with root package name */
    public int f100191x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f100192y;

    /* renamed from: z, reason: collision with root package name */
    public n72.q f100193z;

    /* renamed from: w, reason: collision with root package name */
    public boolean f100190w = false;
    public java.lang.String H = "";
    public int I = 0;

    public void T6(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionUI", "callbackDetectFailed（）");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("token", str2);
        bundle.putString("serial_id", str3);
        U6(str, i17, bundle, java.lang.Boolean.valueOf(this.f100190w));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void U6(java.lang.String str, int i17, android.os.Bundle bundle, java.lang.Boolean bool) {
        char c17;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionUI", "finishWithResult errMsg: %s, errCode: %d", str, java.lang.Integer.valueOf(i17));
        java.lang.String str2 = bool.booleanValue() ? "yes" : "no";
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("click_other_verify_btn", str2);
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionUI", "seriaId:%s", this.H);
        bundle2.putString("serial_id", this.H);
        android.os.Bundle bundle3 = new android.os.Bundle();
        bundle3.putInt("err_code", i17);
        bundle3.putString("err_msg", str);
        bundle3.putInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.C);
        bundle3.putInt("countFace", this.D);
        bundle3.putInt("err_type", this.G);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.F = android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionUI", "endTime：" + this.F);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionUI", "startTime：" + this.E);
        bundle3.putLong("totalTime", this.F - this.E);
        bundle3.putAll(bundle2);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(bundle3);
        str.getClass();
        switch (str.hashCode()) {
            case -1367724422:
                if (str.equals("cancel")) {
                    c17 = 0;
                    break;
                }
                c17 = 65535;
                break;
            case 3548:
                if (str.equals("ok")) {
                    c17 = 1;
                    break;
                }
                c17 = 65535;
                break;
            case 3135262:
                if (str.equals("fail")) {
                    c17 = 2;
                    break;
                }
                c17 = 65535;
                break;
            default:
                c17 = 65535;
                break;
        }
        switch (c17) {
            case 0:
                vz2.c.j("usrCancel");
                setResult(0, intent);
                break;
            case 1:
                setResult(-1, intent);
                break;
            case 2:
                setResult(1, intent);
                break;
            default:
                setResult(-1, intent);
                break;
        }
        if (i17 != 0) {
            vz2.c.h(i17);
            finish();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionUI", "errCode == ConstantsFace.UploadErrCode.OK");
        ku5.u0 u0Var = ku5.t0.f312615d;
        l72.q qVar = new l72.q(this, i17);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(qVar, 1500L, false);
    }

    public final void V6() {
        this.f100174d = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.do8);
        this.f100178h = (com.tencent.mm.plugin.facedetectlight.ui.PreviewFrameLayout) findViewById(com.tencent.mm.R.id.f484284do2);
        com.tencent.mm.ui.base.MMTextureView mMTextureView = (com.tencent.mm.ui.base.MMTextureView) findViewById(com.tencent.mm.R.id.f484283do1);
        this.f100180m = mMTextureView;
        mMTextureView.setVisibility(4);
        this.f100179i = (com.tencent.mm.plugin.facedetectaction.ui.FaceActionMask) findViewById(com.tencent.mm.R.id.f484285do3);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.dme);
        this.f100184q = imageView;
        imageView.post(new l72.k(this));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484286do4);
        this.f100182o = textView;
        textView.post(new l72.l(this));
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.dmd)).setOnClickListener(new l72.m(this));
        this.I = 0;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a_w;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.I == 3) {
            T6("fail", this.B, "", this.H);
        } else {
            k72.u.B.a();
        }
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionUI", "onCreate()");
        super.onCreate(bundle);
        vz2.c.c().f56203e = 1L;
        vz2.c.j("enter");
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(2097280);
        this.C = getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        this.D = 0;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.E = android.os.SystemClock.elapsedRealtime();
        this.G = 4;
        getWindow().getDecorView().setSystemUiVisibility(1280);
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.aaw));
        this.f100181n = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.aar);
        V6();
        this.f100175e = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.dox);
        this.f100176f = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.doy);
        this.f100177g = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.dow);
        this.f100175e.setVisibility(4);
        this.f100176f.setVisibility(4);
        this.f100177g.setVisibility(4);
        this.f100183p = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.dna);
        this.f100185r = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.dn6);
        this.f100186s = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.dng);
        this.f100189v = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dne);
        this.f100187t = (android.widget.Button) findViewById(com.tencent.mm.R.id.dnc);
        this.f100188u = (android.widget.Button) findViewById(com.tencent.mm.R.id.dnd);
        if (com.tencent.mm.sdk.platformtools.t8.K0(k72.u.B.f304754i)) {
            this.f100188u.setVisibility(8);
        } else {
            this.f100188u.setText(k72.u.B.f304754i);
            this.f100188u.setOnClickListener(new l72.n(this));
        }
        if (!com.tencent.mm.plugin.facedetect.model.s0.b(this)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionUI", "carson: no camera permission. request permission");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionUI", "carson: checkFacePermissionAnd Request true and do init ");
        this.A = new l72.c(this);
        k72.u uVar = k72.u.B;
        uVar.f304760r = new l72.j(this);
        uVar.f304761s = this;
        uVar.c(this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionUI", "onDestroy");
        k72.u.B.b(true);
        k72.u.B.f304761s = null;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onRequestPermissionsResult(int r9, java.lang.String[] r10, int[] r11) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionUI", "preview");
        n72.q qVar = this.f100193z;
        if (qVar != null) {
            qVar.f335282q = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionUI", "mCamera ！= null");
        }
        this.f100182o.setText(com.tencent.mm.R.string.c7o);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        n72.q qVar = this.f100193z;
        if (qVar != null) {
            qVar.f(this.f100180m);
            this.f100193z.g();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionUI", "onStop");
        super.onStop();
        n72.q qVar = this.f100193z;
        if (qVar != null) {
            qVar.f335283r = false;
        }
    }
}

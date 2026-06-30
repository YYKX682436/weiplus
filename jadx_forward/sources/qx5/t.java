package qx5;

/* loaded from: classes13.dex */
public class t extends by5.u0 {

    /* renamed from: f, reason: collision with root package name */
    public android.app.ProgressDialog f449052f = null;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f449053g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ cy5.h f449054h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f449055i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f449056j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f449057k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f449058l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f449059m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f449060n;

    public t(android.content.Context context, cy5.h hVar, int i17, boolean z17, java.lang.String str, java.lang.String str2, boolean z18, android.webkit.ValueCallback valueCallback) {
        this.f449053g = context;
        this.f449054h = hVar;
        this.f449055i = i17;
        this.f449056j = z17;
        this.f449057k = str;
        this.f449058l = str2;
        this.f449059m = z18;
        this.f449060n = valueCallback;
    }

    @Override // by5.u0
    public java.lang.Object d(java.lang.Object[] objArr) {
        java.io.File file;
        by5.n0 n0Var;
        cy5.h hVar = this.f449054h;
        boolean z17 = true;
        try {
            int f17 = hVar.f(true);
            int i17 = this.f449055i;
            if (i17 <= 0) {
                i17 = 99999;
                if (f17 >= 99999) {
                    i17 = f17 + 1;
                }
            } else if (f17 > 0) {
                java.lang.String o17 = hVar.o(f17);
                hVar.u(-1, true);
                if (o17 != null && !o17.isEmpty()) {
                    by5.u.h(o17);
                }
            }
            n0Var = new by5.n0();
            by5.m0 m0Var = n0Var.f118107m;
            m0Var.f118070e = i17;
            n0Var.f118104j = false;
            m0Var.f118088w = hVar.g(i17, false);
            file = new java.io.File(m0Var.f118088w);
        } catch (java.lang.Exception e17) {
            e = e17;
            file = null;
        }
        try {
            if (this.f449056j) {
                by5.u.f(this.f449053g.getAssets().open(this.f449057k), file);
            } else {
                by5.u.d(this.f449058l, file.getPath());
            }
            n0Var.f118100f = by5.x.c(file.getPath());
            n0Var.f118106l = true;
            if (hVar.s(n0Var) != 0) {
                z17 = false;
            }
            return java.lang.Boolean.valueOf(z17);
        } catch (java.lang.Exception e18) {
            e = e18;
            by5.c4.c("XWebDebugPluginHelper", "loadZipFormatPluginFromLocal error: " + e);
            if (file != null) {
                by5.u.h(file.getAbsolutePath());
            }
            return java.lang.Boolean.FALSE;
        }
    }

    @Override // by5.u0
    public void g(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        if (bool.booleanValue()) {
            this.f449052f.setMessage("安装完成");
        } else {
            java.lang.String str = this.f449056j ? "asset/" : "sdcard/apkxwebtest/";
            this.f449052f.setMessage("安装失败，请确保文件存在: " + str + this.f449057k);
        }
        this.f449052f.getButton(-1).setVisibility(0);
        if (this.f449059m) {
            this.f449052f.hide();
        }
        android.webkit.ValueCallback valueCallback = this.f449060n;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(bool);
        }
    }

    @Override // by5.u0
    public void h() {
        android.app.ProgressDialog progressDialog = new android.app.ProgressDialog(this.f449053g);
        this.f449052f = progressDialog;
        progressDialog.setProgressStyle(0);
        this.f449052f.setMessage("安装中");
        this.f449052f.setCancelable(false);
        this.f449052f.setCanceledOnTouchOutside(false);
        this.f449052f.setButton(-1, "完成", new qx5.s(this));
        this.f449052f.show();
        this.f449052f.getButton(-1).setVisibility(8);
    }
}

package com.tencent.mm.modelavatar;

/* loaded from: classes5.dex */
public class y0 implements com.tencent.mm.modelbase.u0, kv.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f70569d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f70570e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f70571f;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f70575m;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Runnable f70573h = null;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Runnable f70574i = null;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f70572g = null;

    public y0(android.content.Context context, java.lang.String str, boolean z17) {
        this.f70569d = context;
        this.f70570e = str;
        this.f70571f = z17;
        gm0.j1.d().a(157, this);
        gm0.j1.d().a(14509, this);
    }

    public boolean a(int i17, java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        android.content.Context context = this.f70569d;
        java.lang.String str = this.f70570e;
        iz5.a.g(null, (context == null || str == null || str.length() <= 0) ? false : true);
        this.f70573h = runnable;
        this.f70574i = runnable2;
        gm0.j1.d().g(com.tencent.mm.storage.z3.L4(null) ? new com.tencent.mm.modelavatar.v0(i17, str, null, true) : new com.tencent.mm.modelavatar.x0(i17, str, null, true));
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(runnable == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ProcessUploadHDHeadImg", "post is null ? %B", objArr);
        return true;
    }

    public boolean b(int i17, java.lang.Runnable runnable, boolean z17) {
        java.lang.String str = this.f70570e;
        android.content.Context context = this.f70569d;
        iz5.a.g(null, (context == null || str == null || str.length() <= 0) ? false : true);
        this.f70573h = runnable;
        android.content.Context context2 = this.f70569d;
        this.f70572g = db5.e1.Q(context2, context2.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.j0o), true, true, null);
        java.lang.String str2 = this.f70575m;
        gm0.j1.d().g(com.tencent.mm.storage.z3.L4(str2) ? new com.tencent.mm.modelavatar.v0(i17, str, str2, z17) : new com.tencent.mm.modelavatar.x0(i17, str, str2, z17));
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(runnable == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ProcessUploadHDHeadImg", "post is null ? %B", objArr);
        return true;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        tm.a b17;
        com.tencent.mars.xlog.Log.i("MicroMsg.ProcessUploadHDHeadImg", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        gm0.j1.d().q(157, this);
        gm0.j1.d().q(14509, this);
        android.app.ProgressDialog progressDialog = this.f70572g;
        android.content.Context context = this.f70569d;
        if (progressDialog != null && progressDialog.isShowing() && (context instanceof android.app.Activity) && !((android.app.Activity) context).isFinishing()) {
            try {
                this.f70572g.dismiss();
            } catch (java.lang.IllegalArgumentException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ProcessUploadHDHeadImg", "dismiss dialog err" + e17.getMessage());
            }
        }
        if (i17 == 0 && i18 == 0) {
            dp.a.makeText(context, com.tencent.mm.R.string.j0n, 0).show();
            if (this.f70573h != null) {
                new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(this.f70573h);
            }
            com.tencent.mm.plugin.report.service.b1.f(this.f70571f ? 1 : 4, 2);
            return;
        }
        if (this.f70574i != null) {
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(this.f70574i);
        }
        if (i17 == 4 && (i18 == -100 || i18 == -2023)) {
            return;
        }
        if (str != null && str.length() > 0 && (b17 = tm.a.b(str)) != null) {
            b17.c(context, null, null);
        } else if (i17 == 4 && i18 == -4) {
            dp.a.makeText(context, com.tencent.mm.R.string.bfj, 0).show();
        } else {
            dp.a.makeText(context, com.tencent.mm.R.string.j0m, 0).show();
        }
    }

    public y0(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17) {
        this.f70569d = context;
        this.f70570e = str2;
        this.f70571f = z17;
        this.f70575m = str;
        gm0.j1.d().a(157, this);
        gm0.j1.d().a(14509, this);
    }
}

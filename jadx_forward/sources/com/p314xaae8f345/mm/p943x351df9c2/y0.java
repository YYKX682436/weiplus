package com.p314xaae8f345.mm.p943x351df9c2;

/* loaded from: classes5.dex */
public class y0 implements com.p314xaae8f345.mm.p944x882e457a.u0, kv.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f152102d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f152103e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f152104f;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f152108m;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Runnable f152106h = null;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Runnable f152107i = null;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f152105g = null;

    public y0(android.content.Context context, java.lang.String str, boolean z17) {
        this.f152102d = context;
        this.f152103e = str;
        this.f152104f = z17;
        gm0.j1.d().a(157, this);
        gm0.j1.d().a(14509, this);
    }

    public boolean a(int i17, java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        android.content.Context context = this.f152102d;
        java.lang.String str = this.f152103e;
        iz5.a.g(null, (context == null || str == null || str.length() <= 0) ? false : true);
        this.f152106h = runnable;
        this.f152107i = runnable2;
        gm0.j1.d().g(com.p314xaae8f345.mm.p2621x8fb0427b.z3.L4(null) ? new com.p314xaae8f345.mm.p943x351df9c2.v0(i17, str, null, true) : new com.p314xaae8f345.mm.p943x351df9c2.x0(i17, str, null, true));
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(runnable == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessUploadHDHeadImg", "post is null ? %B", objArr);
        return true;
    }

    public boolean b(int i17, java.lang.Runnable runnable, boolean z17) {
        java.lang.String str = this.f152103e;
        android.content.Context context = this.f152102d;
        iz5.a.g(null, (context == null || str == null || str.length() <= 0) ? false : true);
        this.f152106h = runnable;
        android.content.Context context2 = this.f152102d;
        this.f152105g = db5.e1.Q(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j0o), true, true, null);
        java.lang.String str2 = this.f152108m;
        gm0.j1.d().g(com.p314xaae8f345.mm.p2621x8fb0427b.z3.L4(str2) ? new com.p314xaae8f345.mm.p943x351df9c2.v0(i17, str, str2, z17) : new com.p314xaae8f345.mm.p943x351df9c2.x0(i17, str, str2, z17));
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(runnable == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessUploadHDHeadImg", "post is null ? %B", objArr);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        tm.a b17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessUploadHDHeadImg", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        gm0.j1.d().q(157, this);
        gm0.j1.d().q(14509, this);
        android.app.ProgressDialog progressDialog = this.f152105g;
        android.content.Context context = this.f152102d;
        if (progressDialog != null && progressDialog.isShowing() && (context instanceof android.app.Activity) && !((android.app.Activity) context).isFinishing()) {
            try {
                this.f152105g.dismiss();
            } catch (java.lang.IllegalArgumentException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProcessUploadHDHeadImg", "dismiss dialog err" + e17.getMessage());
            }
        }
        if (i17 == 0 && i18 == 0) {
            dp.a.m125853x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.j0n, 0).show();
            if (this.f152106h != null) {
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(this.f152106h);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(this.f152104f ? 1 : 4, 2);
            return;
        }
        if (this.f152107i != null) {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(this.f152107i);
        }
        if (i17 == 4 && (i18 == -100 || i18 == -2023)) {
            return;
        }
        if (str != null && str.length() > 0 && (b17 = tm.a.b(str)) != null) {
            b17.c(context, null, null);
        } else if (i17 == 4 && i18 == -4) {
            dp.a.m125853x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.bfj, 0).show();
        } else {
            dp.a.m125853x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.j0m, 0).show();
        }
    }

    public y0(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17) {
        this.f152102d = context;
        this.f152103e = str2;
        this.f152104f = z17;
        this.f152108m = str;
        gm0.j1.d().a(157, this);
        gm0.j1.d().a(14509, this);
    }
}

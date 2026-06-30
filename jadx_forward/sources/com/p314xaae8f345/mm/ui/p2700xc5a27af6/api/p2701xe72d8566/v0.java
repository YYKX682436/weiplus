package com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566;

/* loaded from: classes8.dex */
public final class v0 implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f290094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 f290095b;

    public v0(android.content.Context context, com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 j1Var) {
        this.f290094a = context;
        this.f290095b = j1Var;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcPath, "srcPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destPath, "destPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService", "save, success, srcPath: " + srcPath + ", destPath: " + destPath);
        android.content.Context context = this.f290094a;
        dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573837g00, destPath), 1).show();
        com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 j1Var = this.f290095b;
        qj5.n nVar = j1Var.f290033f;
        if (nVar != null) {
            nVar.u();
        }
        j1Var.f290033f = null;
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcPath, "srcPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destPath, "destPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService", "save, failed, srcPath: " + srcPath + ", destPath: " + destPath);
        android.content.Context context = this.f290094a;
        dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i87), 1).show();
    }
}

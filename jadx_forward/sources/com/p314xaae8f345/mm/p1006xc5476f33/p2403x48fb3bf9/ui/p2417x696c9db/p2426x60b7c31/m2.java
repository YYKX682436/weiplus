package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class m2 implements k70.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f266801a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m f266802b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266803c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266805e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266806f;

    public m2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, android.app.ProgressDialog progressDialog, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar, java.lang.String str, java.lang.String str2, nw4.y2 y2Var) {
        this.f266806f = c1Var;
        this.f266801a = progressDialog;
        this.f266802b = mVar;
        this.f266803c = str;
        this.f266804d = str2;
        this.f266805e = y2Var;
    }

    @Override // k70.u
    public void a(android.graphics.Bitmap bitmap, byte[] bArr) {
        android.app.ProgressDialog progressDialog = this.f266801a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f266806f.Q5(this.f266802b, "", this.f266803c, this.f266804d, null, null, null, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266806f;
        nw4.y2 y2Var = this.f266805e;
        c1Var.i5(y2Var, "send_service_app_msg:ok", null);
        c1Var.n5(y2Var);
    }
}

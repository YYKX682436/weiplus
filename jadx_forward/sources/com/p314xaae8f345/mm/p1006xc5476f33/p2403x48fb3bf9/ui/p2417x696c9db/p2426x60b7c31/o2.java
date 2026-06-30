package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class o2 implements k70.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f266833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m f266834b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266835c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266837e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266838f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266839g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266840h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f266841i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266842j;

    public o2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, android.app.ProgressDialog progressDialog, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.Map map) {
        this.f266842j = c1Var;
        this.f266833a = progressDialog;
        this.f266834b = mVar;
        this.f266835c = str;
        this.f266836d = str2;
        this.f266837e = str3;
        this.f266838f = str4;
        this.f266839g = str5;
        this.f266840h = str6;
        this.f266841i = map;
    }

    @Override // k70.u
    public void a(android.graphics.Bitmap bitmap, byte[] bArr) {
        android.app.ProgressDialog progressDialog = this.f266833a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f266842j.Q5(this.f266834b, this.f266835c, this.f266836d, this.f266837e, this.f266838f, this.f266839g, null, this.f266840h);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266842j;
        android.content.Context context = c1Var.f266508d;
        if (context != null) {
            db5.e1.T(context, j65.q.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572081y7));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("send_app_msg sendChatType=");
        java.util.Map map = this.f266841i;
        sb6.append(map.get("sendChatType") == null ? "NULL" : map.get("sendChatType"));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", sb6.toString());
        c1Var.i5(c1Var.f266509e, "send_app_msg:ok", map);
    }
}

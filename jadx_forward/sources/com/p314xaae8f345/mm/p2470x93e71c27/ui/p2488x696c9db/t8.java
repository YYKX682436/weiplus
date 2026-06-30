package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes8.dex */
public class t8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f273461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f273462e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f273463f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f273464g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f273465h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f9 f273466i;

    public t8(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f9 f9Var) {
        this.f273461d = context;
        this.f273462e = str;
        this.f273463f = str2;
        this.f273464g = str3;
        this.f273465h = z17;
        this.f273466i = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.STORAGE, d85.f0.M, new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s8(this))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUtil", "business switch close ,return");
            return;
        }
        if (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.f273141a == null) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.f273141a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.i6(1, "webview-save-image", 1);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.f273141a.a(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d9(this.f273461d, this.f273462e, this.f273463f, this.f273464g, this.f273465h, 0, null, this.f273466i));
    }
}

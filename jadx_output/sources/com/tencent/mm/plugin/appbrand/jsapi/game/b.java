package com.tencent.mm.plugin.appbrand.jsapi.game;

/* loaded from: classes5.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f81254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81255e;

    public b(com.tencent.mm.plugin.appbrand.jsapi.game.f fVar, android.content.Context context, java.lang.String str) {
        this.f81254d = context;
        this.f81255e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f81254d;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.g(this.f81255e);
        u1Var.n(context.getString(com.tencent.mm.R.string.l_e));
        u1Var.q(false);
    }
}

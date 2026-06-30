package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f101590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.y0 f101591e;

    public x0(com.tencent.mm.plugin.fav.ui.y0 y0Var, android.app.Dialog dialog) {
        this.f101591e = y0Var;
        this.f101590d = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        o72.x1.k(this.f101591e.f101611d, new com.tencent.mm.plugin.fav.ui.w0(this), 29);
    }
}

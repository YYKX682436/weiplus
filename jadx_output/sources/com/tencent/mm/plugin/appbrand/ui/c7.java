package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class c7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f89625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.d7 f89626e;

    public c7(com.tencent.mm.plugin.appbrand.ui.d7 d7Var, yz5.a aVar) {
        this.f89626e = d7Var;
        this.f89625d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.d7 d7Var = this.f89626e;
        if (d7Var.getParent() instanceof android.view.ViewGroup) {
            d7Var.animate().alpha(0.0f).withEndAction(new com.tencent.mm.plugin.appbrand.ui.b7(this, d7Var, (android.view.ViewGroup) d7Var.getParent())).withStartAction(new com.tencent.mm.plugin.appbrand.ui.a7(this)).start();
        }
    }
}

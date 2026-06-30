package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class c5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.e5 f91381d;

    public c5(com.tencent.mm.plugin.appbrand.widget.input.e5 e5Var) {
        this.f91381d = e5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.widget.input.e5 e5Var = this.f91381d;
        e5Var.f91427f = true;
        java.lang.String str = e5Var.f91423b;
        e5Var.f91422a.postDelayed(e5Var.f91429h, android.view.ViewConfiguration.getLongPressTimeout());
    }
}

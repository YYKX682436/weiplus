package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public final class v5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f91699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.w5 f91700e;

    public v5(int i17, com.tencent.mm.plugin.appbrand.widget.input.w5 w5Var) {
        this.f91699d = i17;
        this.f91700e = w5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.widget.input.w5 w5Var = this.f91700e;
        int i17 = this.f91699d;
        if (i17 > 0 && i17 != w5Var.f91713d.b()) {
            w5Var.f91713d.d(i17);
        }
        if (i17 > 0 && !w5Var.f91715f) {
            w5Var.f91713d.a(true);
            w5Var.f91715f = true;
        }
        w5Var.f91714e = null;
    }
}

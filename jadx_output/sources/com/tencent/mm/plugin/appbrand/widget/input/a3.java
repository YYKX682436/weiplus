package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public final class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.b3 f91284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f91285e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f91286f;

    public a3(com.tencent.mm.plugin.appbrand.widget.input.b3 b3Var, int i17, int i18) {
        this.f91284d = b3Var;
        this.f91285e = i17;
        this.f91286f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        com.tencent.mm.plugin.appbrand.widget.input.b3 b3Var = this.f91284d;
        b3Var.getClass();
        int i18 = this.f91285e;
        if (i18 < 0 || (i17 = this.f91286f) < 0 || i18 > i17) {
            return;
        }
        try {
            b3Var.f91366w.setSelection(i18, i17);
        } catch (java.lang.Exception unused) {
        }
    }
}

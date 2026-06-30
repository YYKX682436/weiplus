package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class c4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f91376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f91377e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f91378f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f91379g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.d4 f91380h;

    public c4(com.tencent.mm.plugin.appbrand.widget.input.d4 d4Var, boolean z17, java.lang.String str, int i17, int i18) {
        this.f91380h = d4Var;
        this.f91376d = z17;
        this.f91377e = str;
        this.f91378f = i17;
        this.f91379g = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f91376d;
        java.lang.String str = this.f91377e;
        com.tencent.mm.plugin.appbrand.widget.input.d4 d4Var = this.f91380h;
        if (z17) {
            d4Var.f91400e.u(str);
        } else {
            d4Var.f91400e.setText(str);
        }
        try {
            d4Var.f91400e.setSelection(java.lang.Math.min(this.f91378f + this.f91379g, str.length()));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.WebEditText", "replace softBank to unicode, setSelection ", e17);
        }
    }
}

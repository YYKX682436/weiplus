package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public final class s2 implements com.tencent.mm.plugin.appbrand.jsapi.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.w2 f91651d;

    public s2(com.tencent.mm.plugin.appbrand.widget.input.w2 w2Var) {
        this.f91651d = w2Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.w
    public final void onDestroy() {
        com.tencent.mm.plugin.appbrand.widget.input.w2 w2Var = this.f91651d;
        com.tencent.mars.xlog.Log.i(w2Var.f91704o, "onDestroy");
        c01.n2.d().e(w2Var.f91705p);
    }
}

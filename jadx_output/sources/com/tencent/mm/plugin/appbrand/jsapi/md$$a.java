package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final /* synthetic */ class md$$a implements im5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.md f81613d;

    public /* synthetic */ md$$a(com.tencent.mm.plugin.appbrand.jsapi.md mdVar) {
        this.f81613d = mdVar;
    }

    @Override // im5.a
    public final void dead() {
        com.tencent.mm.plugin.appbrand.jsapi.md mdVar = this.f81613d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = mdVar.f81605b;
        if (k0Var != null) {
            k0Var.u();
            mdVar.f81605b = null;
        }
    }
}

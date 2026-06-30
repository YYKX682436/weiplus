package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f81193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.finder.d1 f81194e;

    public c1(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.plugin.appbrand.jsapi.finder.d1 d1Var) {
        this.f81193d = u3Var;
        this.f81194e = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f81193d.dismiss();
        this.f81194e.finishProcess(null);
    }
}

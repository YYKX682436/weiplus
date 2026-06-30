package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes.dex */
public final class p3 implements com.tencent.mm.ipcinvoker.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f89916a;

    public p3(java.lang.String str) {
        this.f89916a = str;
    }

    @Override // com.tencent.mm.ipcinvoker.u0
    public final void R() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDebugUI", "onPostCreate: reconnect:" + this.f89916a);
    }
}

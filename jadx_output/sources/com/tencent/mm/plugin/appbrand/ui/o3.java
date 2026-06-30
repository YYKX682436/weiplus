package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes.dex */
public final class o3 implements com.tencent.mm.ipcinvoker.t0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f89896d;

    public o3(java.lang.String str) {
        this.f89896d = str;
    }

    @Override // com.tencent.mm.ipcinvoker.t0
    public final void h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDebugUI", "onPostCreate: disconnect:" + this.f89896d);
    }
}

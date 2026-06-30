package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f77822d;

    public p0(java.lang.String str) {
        this.f77822d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "小程序monkey test: xml 解析出错，请检查内容及格式是否正确\n\n" + this.f77822d, 1).show();
    }
}

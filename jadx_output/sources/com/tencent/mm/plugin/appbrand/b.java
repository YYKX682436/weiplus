package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class b implements com.tencent.mm.plugin.appbrand.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f76749d;

    public b(cl.q0 q0Var) {
        this.f76749d = q0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.c0
    public void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f76749d.d(str, new com.tencent.mm.plugin.appbrand.a(valueCallback));
    }

    public java.lang.String toString() {
        return "AppBrandAdWorkerHelper$convertToAdWorkerExecutable@" + this.f76749d.hashCode();
    }
}

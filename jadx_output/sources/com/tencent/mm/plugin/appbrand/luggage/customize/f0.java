package com.tencent.mm.plugin.appbrand.luggage.customize;

/* loaded from: classes7.dex */
public class f0 implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o91.c f85521a;

    public f0(com.tencent.mm.plugin.appbrand.luggage.customize.g0 g0Var, o91.c cVar) {
        this.f85521a = cVar;
    }

    @Override // r.a
    public java.lang.Object apply(java.lang.Object obj) {
        java.io.InputStream inputStream = (java.io.InputStream) obj;
        o91.c cVar = this.f85521a;
        if (cVar == null) {
            return null;
        }
        cVar.a(inputStream);
        return null;
    }
}

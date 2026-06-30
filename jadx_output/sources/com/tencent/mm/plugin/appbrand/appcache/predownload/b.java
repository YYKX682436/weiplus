package com.tencent.mm.plugin.appbrand.appcache.predownload;

/* loaded from: classes3.dex */
public final class b implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f75743a;

    public b(kotlinx.coroutines.q qVar) {
        this.f75743a = qVar;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        kotlinx.coroutines.r rVar = (kotlinx.coroutines.r) this.f75743a;
        if (rVar.n()) {
            rVar.resumeWith(kotlin.Result.m521constructorimpl(bool));
        }
    }
}

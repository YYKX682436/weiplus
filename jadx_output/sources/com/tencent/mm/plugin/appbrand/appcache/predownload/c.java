package com.tencent.mm.plugin.appbrand.appcache.predownload;

/* loaded from: classes3.dex */
public final class c implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f75747a;

    public c(kotlinx.coroutines.q qVar) {
        this.f75747a = qVar;
    }

    @Override // km5.e
    public final void a(java.lang.Object obj) {
        kotlinx.coroutines.q qVar = this.f75747a;
        if (((kotlinx.coroutines.r) qVar).n()) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
        }
    }
}

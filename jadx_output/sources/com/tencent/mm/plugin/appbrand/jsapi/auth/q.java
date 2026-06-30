package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class q implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f79689a;

    public q(kotlinx.coroutines.q qVar) {
        this.f79689a = qVar;
    }

    @Override // km5.e
    public final void a(java.lang.Object obj) {
        kotlinx.coroutines.q qVar = this.f79689a;
        if (((kotlinx.coroutines.r) qVar).n()) {
            if (obj instanceof com.tencent.mm.plugin.appbrand.networking.p) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                kotlin.jvm.internal.o.d(obj);
                qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure((java.lang.Throwable) obj)));
            } else if (obj == null) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new com.tencent.mm.plugin.appbrand.networking.p(com.tencent.mm.plugin.appbrand.networking.o.UNKNOWN, -1, null, null))));
            } else {
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new com.tencent.mm.plugin.appbrand.networking.p(com.tencent.mm.plugin.appbrand.networking.o.UNKNOWN, -1, obj.toString(), null))));
            }
        }
    }
}

package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class b4 implements ui1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.c4 f79416a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f79417b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f79418c;

    public b4(com.tencent.mm.plugin.appbrand.jsapi.auth.c4 c4Var, kotlinx.coroutines.q qVar, kotlin.jvm.internal.f0 f0Var) {
        this.f79416a = c4Var;
        this.f79417b = qVar;
        this.f79418c = f0Var;
    }

    @Override // ui1.y
    public void a(int i17, java.util.ArrayList resultData, int i18, boolean z17) {
        kotlin.jvm.internal.o.g(resultData, "resultData");
        kotlinx.coroutines.q qVar = this.f79417b;
        com.tencent.mm.plugin.appbrand.jsapi.auth.c4 c4Var = this.f79416a;
        if (i17 != 1 && i17 != 2) {
            qVar.resumeWith(kotlin.Result.m521constructorimpl(new com.tencent.mm.plugin.appbrand.jsapi.auth.l3(c4Var.f79539d, "fail auth cancel", jc1.f.f298922k, null, 8, null)));
            return;
        }
        if (resultData.isEmpty()) {
            qVar.resumeWith(kotlin.Result.m521constructorimpl(new com.tencent.mm.plugin.appbrand.jsapi.auth.l3(c4Var.f79539d, null, jc1.f.f298915d, null, 10, null)));
            return;
        }
        r45.m24 a17 = c4Var.f79539d.a(true);
        a17.f380091f = (java.lang.String) kz5.n0.X(resultData);
        a17.f380092g = i17;
        a17.f380095m = i18;
        a17.f380097o = this.f79418c.f310116d;
        a17.f380098p = z17;
        if (2 == i17) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.appbrand.jsapi.auth.a4(c4Var, a17, null), 2, null);
            qVar.resumeWith(kotlin.Result.m521constructorimpl(new com.tencent.mm.plugin.appbrand.jsapi.auth.l3(c4Var.f79539d, "fail auth deny", jc1.f.f298921j, null, 8, null)));
        } else {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(new com.tencent.mm.plugin.appbrand.jsapi.auth.q3(c4Var.f79539d, a17)));
        }
    }
}

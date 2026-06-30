package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class m1 implements ui1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.y f79635a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f79636b;

    public m1(com.tencent.mm.plugin.appbrand.jsapi.auth.y yVar, kotlinx.coroutines.q qVar) {
        this.f79635a = yVar;
        this.f79636b = qVar;
    }

    @Override // ui1.y
    public void a(int i17, java.util.ArrayList resultData, int i18, boolean z17) {
        kotlin.jvm.internal.o.g(resultData, "resultData");
        com.tencent.mm.plugin.appbrand.jsapi.auth.y yVar = this.f79635a;
        if (i17 == 1) {
            yVar.a(z17, 0);
        } else if (i17 == 2) {
            yVar.a(z17, 1);
        } else if (i17 == 3) {
            yVar.a(z17, 2);
        }
        kotlinx.coroutines.q qVar = this.f79636b;
        if (((kotlinx.coroutines.r) qVar).n()) {
            qVar.resumeWith(kotlin.Result.m521constructorimpl(new com.tencent.mm.plugin.appbrand.jsapi.auth.i1(i17, null, resultData, z17, 2, null)));
        }
    }
}

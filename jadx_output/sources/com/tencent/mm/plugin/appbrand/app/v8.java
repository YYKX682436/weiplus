package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes4.dex */
public final class v8 implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f75317a;

    public v8(com.tencent.mm.ipcinvoker.r rVar) {
        this.f75317a = rVar;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        com.tencent.mm.ipcinvoker.r rVar = this.f75317a;
        if (rVar != null) {
            kotlin.jvm.internal.o.d(num);
            rVar.a(new com.tencent.mm.plugin.appbrand.app.ServiceForWebViewAnyProcess$IPCReportMiniProgramPageDataResult(num.intValue(), true, null));
        }
    }
}

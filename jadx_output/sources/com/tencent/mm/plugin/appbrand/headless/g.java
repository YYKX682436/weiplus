package com.tencent.mm.plugin.appbrand.headless;

/* loaded from: classes7.dex */
public final class g implements com.tencent.mm.plugin.appbrand.headless.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.headless.p f78299a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.task.k f78300b;

    public g(com.tencent.mm.plugin.appbrand.headless.p pVar, com.tencent.mm.plugin.appbrand.task.k kVar) {
        this.f78299a = pVar;
        this.f78300b = kVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.headless.p
    public void a(int i17, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.headless.p pVar = this.f78299a;
        if (pVar != null) {
            pVar.a(i17, str);
        }
        com.tencent.mm.plugin.appbrand.task.k kVar = this.f78300b;
        if (kVar == null) {
            return;
        }
        kVar.f89082m = false;
    }

    @Override // com.tencent.mm.plugin.appbrand.headless.p
    public void onSuccess(java.lang.String processName) {
        kotlin.jvm.internal.o.g(processName, "processName");
        com.tencent.mm.plugin.appbrand.headless.p pVar = this.f78299a;
        if (pVar != null) {
            pVar.onSuccess(processName);
        }
        com.tencent.mm.plugin.appbrand.task.k kVar = this.f78300b;
        if (kVar == null) {
            return;
        }
        kVar.f89082m = false;
    }
}

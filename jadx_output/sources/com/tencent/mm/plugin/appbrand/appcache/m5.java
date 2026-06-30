package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class m5 implements com.tencent.mm.plugin.appbrand.utils.p4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wu5.c f75673a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.utils.p4 f75674b;

    public m5(com.tencent.mm.plugin.appbrand.appcache.e5 e5Var, wu5.c cVar, com.tencent.mm.plugin.appbrand.utils.p4 p4Var) {
        this.f75673a = cVar;
        this.f75674b = p4Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.p4
    public void a(yz5.a aVar) {
        wu5.c cVar = this.f75673a;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.f75674b.a(aVar);
    }
}

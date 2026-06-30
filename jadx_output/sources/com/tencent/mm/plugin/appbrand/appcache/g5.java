package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class g5 implements com.tencent.mm.plugin.appbrand.appcache.p5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f75550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.h5 f75551b;

    public g5(com.tencent.mm.plugin.appbrand.appcache.h5 h5Var, yz5.a aVar) {
        this.f75551b = h5Var;
        this.f75550a = aVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.p5
    public void a(boolean z17, int i17) {
        this.f75550a.invoke();
        com.tencent.mm.plugin.appbrand.appcache.p5 p5Var = this.f75551b.f75566b;
        if (p5Var != null) {
            p5Var.a(z17, i17);
        }
    }
}

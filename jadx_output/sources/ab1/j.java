package ab1;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f2723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f2724e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ab1.l f2725f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$SelectRequest f2726g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f2727h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kotlin.jvm.internal.c0 c0Var, yz5.l lVar, ab1.l lVar2, com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$SelectRequest addressSelectorContract$SelectRequest, kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f2723d = c0Var;
        this.f2724e = lVar;
        this.f2725f = lVar2;
        this.f2726g = addressSelectorContract$SelectRequest;
        this.f2727h = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.address.model.RcptItem rcptItem = (com.tencent.mm.plugin.address.model.RcptItem) obj;
        kotlin.jvm.internal.o.g(rcptItem, "rcptItem");
        this.f2723d.f310112d = true;
        ab1.l lVar = this.f2725f;
        lVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String post = rcptItem.f74373f;
        kotlin.jvm.internal.o.f(post, "post");
        com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$SelectResponse addressSelectorContract$SelectResponse = new com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$SelectResponse(arrayList, java.lang.Integer.parseInt(r26.n0.u0(post).toString()));
        do {
            ab1.c cVar = this.f2726g.f78705d;
            ab1.c cVar2 = ab1.c.f2712h;
            java.lang.String str = rcptItem.f74372e;
            if (cVar == cVar2) {
                str = u46.l.t(str, 0, 6);
            }
            kotlin.jvm.internal.o.d(str);
            int parseInt = java.lang.Integer.parseInt(str);
            java.lang.String name = rcptItem.f74371d;
            kotlin.jvm.internal.o.f(name, "name");
            addressSelectorContract$SelectResponse.f78708d.add(0, new com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$AddressNode(name, parseInt));
            rcptItem = lVar.wi().c(rcptItem.f74375h);
        } while (rcptItem != null);
        this.f2724e.invoke(addressSelectorContract$SelectResponse);
        java.lang.Object obj2 = this.f2727h.f310123d;
        kotlin.jvm.internal.o.d(obj2);
        ((com.tencent.mm.plugin.address.ui.l1) obj2).dismiss();
        return jz5.f0.f302826a;
    }
}

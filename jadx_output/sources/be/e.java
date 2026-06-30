package be;

/* loaded from: classes7.dex */
public final class e extends be1.f0 {
    public e() {
        super(new be.c());
    }

    @Override // be1.f0, be1.c0
    public java.util.Map B(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = (com.tencent.luggage.sdk.jsapi.component.service.y) lVar;
        java.util.Map B = super.B(yVar);
        int a17 = he.b.a(yVar);
        if (a17 > 0) {
            ((java.util.HashMap) B).put("statusBarHeight", java.lang.Integer.valueOf(a17));
        }
        return B;
    }

    @Override // be1.f0
    /* renamed from: D */
    public java.util.Map B(com.tencent.mm.plugin.appbrand.y yVar) {
        com.tencent.luggage.sdk.jsapi.component.service.y yVar2 = (com.tencent.luggage.sdk.jsapi.component.service.y) yVar;
        java.util.Map B = super.B(yVar2);
        int a17 = he.b.a(yVar2);
        if (a17 > 0) {
            ((java.util.HashMap) B).put("statusBarHeight", java.lang.Integer.valueOf(a17));
        }
        return B;
    }
}

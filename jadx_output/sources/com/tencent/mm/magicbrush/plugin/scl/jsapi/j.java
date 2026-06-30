package com.tencent.mm.magicbrush.plugin.scl.jsapi;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f68663d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(yz5.l lVar) {
        super(3);
        this.f68663d = lVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        ((java.lang.Number) obj).intValue();
        java.util.HashMap hashMap = (java.util.HashMap) obj3;
        kotlin.jvm.internal.o.g((java.lang.String) obj2, "<anonymous parameter 1>");
        java.lang.Object obj4 = hashMap != null ? hashMap.get("service") : null;
        this.f68663d.invoke(obj4 instanceof com.tencent.mm.plugin.appbrand.e9 ? (com.tencent.mm.plugin.appbrand.e9) obj4 : null);
        return jz5.f0.f302826a;
    }
}

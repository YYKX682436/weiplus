package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes4.dex */
public class n implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.o f76273d;

    public n(com.tencent.mm.plugin.appbrand.appstorage.o oVar) {
        this.f76273d = oVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.appbrand.appstorage.k kVar = new com.tencent.mm.plugin.appbrand.appstorage.k();
        kVar.field_key = (java.lang.String) obj;
        kVar.field_data = (java.lang.String) obj2;
        super/*l75.n0*/.replace(kVar);
        return null;
    }
}

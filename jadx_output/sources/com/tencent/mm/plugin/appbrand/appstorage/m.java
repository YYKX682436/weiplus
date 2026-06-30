package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes4.dex */
public class m implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.o f76264d;

    public m(com.tencent.mm.plugin.appbrand.appstorage.o oVar) {
        this.f76264d = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        com.tencent.mm.plugin.appbrand.appstorage.k kVar = new com.tencent.mm.plugin.appbrand.appstorage.k();
        kVar.field_key = (java.lang.String) obj;
        z17 = super/*l75.n0*/.get(kVar, new java.lang.String[0]);
        if (z17) {
            return kVar.field_data;
        }
        return null;
    }
}

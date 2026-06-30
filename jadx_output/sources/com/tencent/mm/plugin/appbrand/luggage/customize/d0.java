package com.tencent.mm.plugin.appbrand.luggage.customize;

/* loaded from: classes7.dex */
public class d0 implements o91.e {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f85517d;

    public d0(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f85517d = linkedList;
        linkedList.add(new com.tencent.mm.plugin.appbrand.luggage.customize.l0(appBrandRuntime));
        linkedList.add(new com.tencent.mm.plugin.appbrand.luggage.customize.a0());
        linkedList.add(new com.tencent.mm.plugin.appbrand.luggage.customize.b0(appBrandRuntime));
        linkedList.add(new com.tencent.mm.plugin.appbrand.luggage.customize.z(appBrandRuntime));
    }

    @Override // o91.e
    public java.lang.String T0(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str) {
        if (lVar != null && str != null && str.length() != 0) {
            for (o91.e eVar : this.f85517d) {
                if (eVar.U0(lVar, str)) {
                    return eVar.T0(lVar, str);
                }
            }
        }
        return str;
    }

    @Override // o91.e
    public boolean U0(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str) {
        if (lVar != null && str != null && str.length() != 0) {
            java.util.Iterator it = this.f85517d.iterator();
            while (it.hasNext()) {
                if (((o91.e) it.next()).U0(lVar, str)) {
                    return true;
                }
            }
        }
        return false;
    }
}

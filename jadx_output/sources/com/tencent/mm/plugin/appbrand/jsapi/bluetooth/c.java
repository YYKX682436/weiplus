package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes7.dex */
public class c implements ob1.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e f80051a;

    public c(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e eVar) {
        this.f80051a = eVar;
    }

    @Override // ob1.k
    public void a(java.lang.String str, boolean z17) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.f80051a.f80060h).iterator();
        while (it.hasNext()) {
            ((ob1.k) it.next()).a(str, z17);
        }
    }
}

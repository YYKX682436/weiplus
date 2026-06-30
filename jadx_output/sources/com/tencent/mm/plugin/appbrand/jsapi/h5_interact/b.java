package com.tencent.mm.plugin.appbrand.jsapi.h5_interact;

/* loaded from: classes7.dex */
public class b implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ipc.l0 f81274d;

    public b(com.tencent.mm.plugin.appbrand.ipc.l0 l0Var) {
        this.f81274d = l0Var;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        if (bVar == u81.b.DESTROYED) {
            com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.F(str, this.f81274d);
        }
    }
}

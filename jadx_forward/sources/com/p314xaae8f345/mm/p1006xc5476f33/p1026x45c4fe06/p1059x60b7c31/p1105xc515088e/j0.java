package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e;

/* loaded from: classes15.dex */
public class j0 implements tl1.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.k0 f164272a;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.k0 k0Var) {
        this.f164272a = k0Var;
    }

    @Override // tl1.t
    public void a(boolean z17, java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.k0 k0Var = this.f164272a;
        tl1.b bVar = k0Var.f501733d;
        if (bVar != null) {
            bVar.h();
        }
        if (!z17) {
            k0Var.d("fail cancel", null);
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                k0Var.d("fail", null);
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("value", str);
            k0Var.d("ok", hashMap);
        }
    }
}

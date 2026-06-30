package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e;

/* loaded from: classes15.dex */
public class c implements tl1.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.e f164246a;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.e eVar) {
        this.f164246a = eVar;
    }

    @Override // tl1.t
    public void a(boolean z17, java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.e eVar = this.f164246a;
        if (eVar.f501733d == null) {
            return;
        }
        if (!z17) {
            eVar.d("fail cancel", null);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            eVar.d("fail", null);
        } else {
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("value", str);
            eVar.d("ok", hashMap);
        }
        eVar.f501733d.d(true);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e;

/* loaded from: classes15.dex */
public class w implements tl1.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.x f164292a;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.x xVar) {
        this.f164292a = xVar;
    }

    @Override // tl1.u
    public void a(java.lang.Object obj) {
        int[] iArr = (int[]) obj;
        int i17 = iArr[0];
        int i18 = iArr[1];
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.n nVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.n(null);
        java.util.HashMap hashMap = new java.util.HashMap(2);
        hashMap.put("errMsg", "ok");
        hashMap.put("column", java.lang.Integer.valueOf(i17));
        hashMap.put("current", java.lang.Integer.valueOf(i18));
        nVar.t(hashMap);
        java.lang.ref.WeakReference weakReference = this.f164292a.f164275f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar = weakReference != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t) weakReference.get() : null;
        if (tVar == null) {
            return;
        }
        nVar.p(tVar);
        nVar.m();
    }
}

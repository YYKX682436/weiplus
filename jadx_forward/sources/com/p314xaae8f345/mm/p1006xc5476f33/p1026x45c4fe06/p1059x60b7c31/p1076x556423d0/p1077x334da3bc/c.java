package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.p1077x334da3bc;

/* loaded from: classes7.dex */
public final class c implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.p1077x334da3bc.d f161785a;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.p1077x334da3bc.d dVar) {
        this.f161785a = dVar;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiOpenChannelsActivityMB", "onCallback, ret:" + obj);
        jz5.l lVar = obj instanceof jz5.l ? (jz5.l) obj : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.p1077x334da3bc.d dVar = this.f161785a;
        if (lVar != null) {
            java.lang.Object obj2 = lVar.f384366d;
            java.lang.Integer num = obj2 instanceof java.lang.Integer ? (java.lang.Integer) obj2 : null;
            dVar.m50420x7b736e5c(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.p1077x334da3bc.C12062x8ef6f3cc(num != null ? num.intValue() : 0));
        }
        dVar.m50420x7b736e5c(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.p1077x334da3bc.C12062x8ef6f3cc(0));
    }
}

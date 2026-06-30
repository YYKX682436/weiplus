package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public class i4 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.va {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.j4 f157122a;

    public i4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.j4 j4Var) {
        this.f157122a = j4Var;
    }

    @Override // m81.d
    public /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
    }

    @Override // m81.d
    public void c(java.lang.String str, m81.c cVar, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LibIncrementalTestCase[incremental]", "MockLibInfo Download Result %s", cVar);
        if (cVar == m81.c.OK) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.h4(this));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r4.q(this.f157122a.f157139d, "Download MockLibInfo Error: " + cVar.name());
    }
}

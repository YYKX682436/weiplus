package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz;

/* loaded from: classes7.dex */
public final class w0 implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.x0 f161552d;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.x0 x0Var) {
        this.f161552d = x0Var;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        u81.h hVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "onRunningStateChanged appId:" + str + " state:" + bVar);
        if ((bVar == null ? -1 : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.v0.f161551a[bVar.ordinal()]) != 1) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f161552d.f161553g;
        if (c11510xdd90c2f2 != null && (hVar = c11510xdd90c2f2.N) != null) {
            hVar.c(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22 = this.f161552d.f161553g;
        if (c11510xdd90c2f22 != null) {
            c11510xdd90c2f22.S();
        }
    }
}

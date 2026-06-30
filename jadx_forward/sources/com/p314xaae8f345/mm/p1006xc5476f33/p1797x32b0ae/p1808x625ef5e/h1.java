package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes8.dex */
public class h1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h f225506e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 f225507f;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar) {
        this.f225507f = g1Var;
        this.f225505d = str;
        this.f225506e = hVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        boolean z17 = ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) obj).f149933d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar = this.f225506e;
        java.lang.String str = this.f225505d;
        if (!z17) {
            if (hVar != null) {
                hVar.mo25333x2fd71e(str, 2);
                return;
            }
            return;
        }
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y17 = this.f225507f.y(str, null);
        if (hVar != null) {
            if (y17 != null) {
                hVar.mo25334x90b54003(y17, 0);
            } else {
                hVar.mo25333x2fd71e(str, 2);
            }
        }
    }
}

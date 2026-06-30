package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes8.dex */
public class m1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h f225547e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225548f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 f225549g;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar, java.lang.String str2) {
        this.f225549g = g1Var;
        this.f225546d = str;
        this.f225547e = hVar;
        this.f225548f = str2;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        boolean z17 = ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) obj).f149933d;
        java.lang.String str = this.f225548f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar = this.f225547e;
        if (!z17) {
            if (hVar != null) {
                hVar.mo25333x2fd71e(str, 5);
                return;
            }
            return;
        }
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y17 = this.f225549g.y(this.f225546d, null);
        if (hVar != null) {
            if (y17 != null) {
                hVar.mo25334x90b54003(y17, 0);
            } else {
                hVar.mo25333x2fd71e(str, 2);
            }
        }
    }
}

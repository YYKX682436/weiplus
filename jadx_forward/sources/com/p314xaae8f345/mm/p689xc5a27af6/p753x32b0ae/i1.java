package com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae;

/* loaded from: classes8.dex */
public class i1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f148732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148733b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.k1 f148734c;

    public i1(com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.k1 k1Var, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar, java.lang.String str) {
        this.f148734c = k1Var;
        this.f148732a = rVar;
        this.f148733b = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: fail */
    public void mo25333x2fd71e(java.lang.String str, int i17) {
        this.f148732a.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898(-1L));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: success */
    public void mo25334x90b54003(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441, int i17) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f148732a;
        if (c3712x3ed8a441 == null) {
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898(-1L));
        } else {
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898(this.f148734c.a(this.f148733b)));
        }
    }
}

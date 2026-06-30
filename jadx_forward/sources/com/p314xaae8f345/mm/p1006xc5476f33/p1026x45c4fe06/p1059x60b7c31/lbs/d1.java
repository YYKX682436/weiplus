package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* loaded from: classes7.dex */
public final class d1 implements lk1.b, im5.a {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f162937d;

    /* renamed from: e, reason: collision with root package name */
    public lk1.b f162938e;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime, lk1.b delegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this.f162937d = runtime;
        this.f162938e = delegate;
        runtime.mo46316x322b85(this);
    }

    @Override // im5.a
    /* renamed from: dead */
    public void mo10668x2efc64() {
        this.f162938e = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f162937d;
        if (c11510xdd90c2f2 != null) {
            c11510xdd90c2f2.n2(this);
        }
        this.f162937d = null;
    }

    @Override // lk1.b
    public void j(int i17, java.lang.String str, lk1.a aVar) {
        lk1.b bVar = this.f162938e;
        if (bVar != null) {
            bVar.j(i17, str, aVar);
        }
        mo10668x2efc64();
    }
}

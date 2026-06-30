package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc;

/* loaded from: classes7.dex */
public final class x implements com.p314xaae8f345.mm.p794xb0fa9b5e.r, im5.a {

    /* renamed from: d, reason: collision with root package name */
    public yz5.a f159974d;

    /* renamed from: e, reason: collision with root package name */
    public im5.b f159975e;

    public x(yz5.a block, im5.b bVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        this.f159974d = block;
        this.f159975e = bVar;
        if (bVar != null) {
            bVar.mo46316x322b85(this);
        }
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        yz5.a aVar = this.f159974d;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        mo10668x2efc64();
    }

    @Override // im5.a
    /* renamed from: dead */
    public void mo10668x2efc64() {
        this.f159974d = null;
        im5.b bVar = this.f159975e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.n2 n2Var = bVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.n2 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.n2) bVar : null;
        if (n2Var != null) {
            n2Var.n2(this);
        }
        this.f159975e = null;
    }
}

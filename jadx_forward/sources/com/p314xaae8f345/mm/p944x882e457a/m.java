package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes8.dex */
public final class m extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.f f152217a;

    /* renamed from: b, reason: collision with root package name */
    public final int f152218b;

    /* renamed from: c, reason: collision with root package name */
    public final int f152219c;

    public m(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, int i17, int i18, boolean z17, int i19) {
        this.f152217a = fVar;
        this.f152218b = i17;
        this.f152219c = i18;
        m150627x65ba7055(i19);
    }

    @Override // o45.zg
    /* renamed from: getCmdId */
    public int mo13850x7443ca3f() {
        return this.f152219c;
    }

    @Override // o45.xg
    /* renamed from: getFuncId */
    public int mo13851x19c9adf5() {
        return this.f152218b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o45.xg
    /* renamed from: toProtoBuf */
    public byte[] mo13852xc3d7db06() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f152217a;
        if (fVar instanceof r45.my3) {
            ((r45.my3) fVar).mo11509x3ab820bc(o45.bh.a(this));
        }
        return fVar.mo14344x5f01b1f6();
    }
}

package r45;

/* loaded from: classes4.dex */
public class du5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f454289d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f454290e;

    public r45.du5 b(byte[] bArr) {
        c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
        for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
            if (!mo75949x4476b383(aVar, this, m75958x5767edba)) {
                aVar.b();
            }
        }
        return this;
    }

    public r45.du5 c(java.lang.String str) {
        this.f454289d = str;
        this.f454290e = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.du5)) {
            return false;
        }
        r45.du5 du5Var = (r45.du5) fVar;
        java.lang.String str = this.f454289d;
        if (str == null && du5Var.f454289d == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(du5Var.f454289d);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: computeSize */
    public int mo75928xcd1e8d8() {
        return (this.f454290e ? b36.f.j(1, this.f454289d) + 0 : 0) + 0;
    }

    /* renamed from: getString */
    public java.lang.String m161602x2fec8307() {
        return this.f454289d;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public /* bridge */ /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        b(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: populateBuilderWithField */
    public boolean mo75949x4476b383(c36.a aVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, int i17) {
        r45.du5 du5Var = (r45.du5) fVar;
        if (i17 != 1) {
            return false;
        }
        du5Var.c(aVar.k(i17));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toByteArray */
    public byte[] mo14344x5f01b1f6() {
        return super.mo14344x5f01b1f6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        return this.f454289d;
    }

    /* renamed from: toString */
    public java.lang.String m161603x9616526c() {
        return this.f454289d;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: validate */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo75964xab491916() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: writeFields */
    public void mo75956x3d5d1f78(g36.f fVar) {
        if (this.f454290e) {
            fVar.j(1, this.f454289d);
        }
    }
}

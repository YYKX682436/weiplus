package r45;

/* loaded from: classes4.dex */
public class eu5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f455266d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f455267e;

    public r45.eu5 b(byte[] bArr) {
        c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
        for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
            if (!mo75949x4476b383(aVar, this, m75958x5767edba)) {
                aVar.b();
            }
        }
        c();
        return this;
    }

    public r45.eu5 c() {
        if (this.f455267e) {
            return this;
        }
        throw new b36.g("Not all required fields were included (false = not included in message),  uiVal:" + this.f455267e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof r45.eu5) && this.f455266d == ((r45.eu5) fVar).f455266d;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: computeSize */
    public int mo75928xcd1e8d8() {
        return b36.f.e(1, this.f455266d) + 0 + 0;
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
        r45.eu5 eu5Var = (r45.eu5) fVar;
        if (i17 != 1) {
            return false;
        }
        eu5Var.f455266d = aVar.g(i17);
        eu5Var.f455267e = true;
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toByteArray */
    public byte[] mo14344x5f01b1f6() {
        c();
        return super.mo14344x5f01b1f6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        return java.lang.Integer.valueOf(this.f455266d);
    }

    /* renamed from: toString */
    public java.lang.String m161610x9616526c() {
        return (r45.eu5.class.getName().concat("(") + "uiVal = " + this.f455266d + "   ") + ")";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: validate */
    public /* bridge */ /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.f mo75964xab491916() {
        c();
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: writeFields */
    public void mo75956x3d5d1f78(g36.f fVar) {
        fVar.e(1, this.f455266d);
    }
}

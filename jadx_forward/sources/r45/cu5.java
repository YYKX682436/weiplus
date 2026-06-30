package r45;

/* loaded from: classes4.dex */
public class cu5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f453372d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f453373e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f453374f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f453375g;

    public r45.cu5 b(byte[] bArr) {
        c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
        for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
            if (!mo75949x4476b383(aVar, this, m75958x5767edba)) {
                aVar.b();
            }
        }
        f();
        return this;
    }

    public r45.cu5 c(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        if (gVar == null) {
            d(null);
        }
        this.f453374f = gVar;
        this.f453375g = true;
        this.f453372d = gVar.f273689a.length;
        this.f453373e = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof r45.cu5) && this.f453372d == ((r45.cu5) fVar).f453372d;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: computeSize */
    public int mo75928xcd1e8d8() {
        int e17 = b36.f.e(1, this.f453372d) + 0;
        if (this.f453375g) {
            e17 += b36.f.b(2, this.f453374f);
        }
        return e17 + 0;
    }

    public r45.cu5 d(byte[] bArr) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g b17 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr);
        c(b17);
        this.f453372d = b17.f273689a.length;
        this.f453373e = true;
        return this;
    }

    public r45.cu5 e(byte[] bArr, int i17, int i18) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr, i17, i18);
        c(gVar);
        this.f453372d = gVar.f273689a.length;
        this.f453373e = true;
        return this;
    }

    public r45.cu5 f() {
        if (this.f453373e) {
            return this;
        }
        throw new b36.g("Not all required fields were included (false = not included in message),  iLen:" + this.f453373e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public /* bridge */ /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        b(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: populateBuilderWithField */
    public final boolean mo75949x4476b383(c36.a aVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, int i17) {
        r45.cu5 cu5Var = (r45.cu5) fVar;
        if (i17 == 1) {
            cu5Var.f453372d = aVar.g(i17);
            cu5Var.f453373e = true;
            return true;
        }
        if (i17 != 2) {
            return false;
        }
        cu5Var.c(aVar.d(i17));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toByteArray */
    public byte[] mo14344x5f01b1f6() {
        f();
        return super.mo14344x5f01b1f6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        return "";
    }

    /* renamed from: toString */
    public java.lang.String m161592x9616526c() {
        java.lang.String str = r45.cu5.class.getName().concat("(") + "iLen = " + this.f453372d + "   ";
        if (this.f453375g) {
            str = str + "Buffer = " + java.lang.String.valueOf(this.f453374f) + "   ";
        }
        return str + ")";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: validate */
    public /* bridge */ /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.f mo75964xab491916() {
        f();
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: writeFields */
    public void mo75956x3d5d1f78(g36.f fVar) {
        fVar.e(1, this.f453372d);
        if (this.f453375g) {
            fVar.b(2, this.f453374f);
        }
    }
}

package r45;

/* loaded from: classes8.dex */
public class bn0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f452418d;

    /* renamed from: e, reason: collision with root package name */
    public int f452419e;

    /* renamed from: f, reason: collision with root package name */
    public int f452420f;

    /* renamed from: g, reason: collision with root package name */
    public int f452421g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f452422h;

    static {
        new r45.bn0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bn0)) {
            return false;
        }
        r45.bn0 bn0Var = (r45.bn0) fVar;
        return n51.f.a(this.f76494x2de60e5e, bn0Var.f76494x2de60e5e) && n51.f.a(this.f452418d, bn0Var.f452418d) && n51.f.a(java.lang.Integer.valueOf(this.f452419e), java.lang.Integer.valueOf(bn0Var.f452419e)) && n51.f.a(java.lang.Integer.valueOf(this.f452420f), java.lang.Integer.valueOf(bn0Var.f452420f)) && n51.f.a(java.lang.Integer.valueOf(this.f452421g), java.lang.Integer.valueOf(bn0Var.f452421g)) && n51.f.a(this.f452422h, bn0Var.f452422h);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: getBaseRequest */
    public r45.he mo11508xa452ad48() {
        return this.f76494x2de60e5e;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.bn0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f452418d;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f452419e);
            fVar.e(4, this.f452420f);
            fVar.e(5, this.f452421g);
            java.lang.String str = this.f452422h;
            if (str != null) {
                fVar.j(6, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f452418d;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            int e17 = i18 + b36.f.e(3, this.f452419e) + b36.f.e(4, this.f452420f) + b36.f.e(5, this.f452421g);
            java.lang.String str2 = this.f452422h;
            return str2 != null ? e17 + b36.f.j(6, str2) : e17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    this.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                this.f452418d = aVar2.d(intValue);
                return 0;
            case 3:
                this.f452419e = aVar2.g(intValue);
                return 0;
            case 4:
                this.f452420f = aVar2.g(intValue);
                return 0;
            case 5:
                this.f452421g = aVar2.g(intValue);
                return 0;
            case 6:
                this.f452422h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (r45.bn0) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: setBaseRequest */
    public r45.my3 mo11509x3ab820bc(r45.he heVar) {
        this.f76494x2de60e5e = heVar;
        return this;
    }
}

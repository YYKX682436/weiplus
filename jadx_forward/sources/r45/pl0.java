package r45;

/* loaded from: classes9.dex */
public class pl0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464681d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464682e;

    /* renamed from: f, reason: collision with root package name */
    public int f464683f;

    /* renamed from: g, reason: collision with root package name */
    public int f464684g;

    /* renamed from: h, reason: collision with root package name */
    public int f464685h;

    /* renamed from: i, reason: collision with root package name */
    public r45.cu5 f464686i;

    static {
        new r45.pl0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pl0)) {
            return false;
        }
        r45.pl0 pl0Var = (r45.pl0) fVar;
        return n51.f.a(this.f76494x2de60e5e, pl0Var.f76494x2de60e5e) && n51.f.a(this.f464681d, pl0Var.f464681d) && n51.f.a(this.f464682e, pl0Var.f464682e) && n51.f.a(java.lang.Integer.valueOf(this.f464683f), java.lang.Integer.valueOf(pl0Var.f464683f)) && n51.f.a(java.lang.Integer.valueOf(this.f464684g), java.lang.Integer.valueOf(pl0Var.f464684g)) && n51.f.a(java.lang.Integer.valueOf(this.f464685h), java.lang.Integer.valueOf(pl0Var.f464685h)) && n51.f.a(this.f464686i, pl0Var.f464686i);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: getBaseRequest */
    public r45.he mo11508xa452ad48() {
        return this.f76494x2de60e5e;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.pl0();
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
            java.lang.String str = this.f464681d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f464682e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f464683f);
            fVar.e(5, this.f464684g);
            fVar.e(6, this.f464685h);
            r45.cu5 cu5Var = this.f464686i;
            if (cu5Var != null) {
                fVar.i(7, cu5Var.mo75928xcd1e8d8());
                this.f464686i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f464681d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f464682e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            int e17 = i18 + b36.f.e(4, this.f464683f) + b36.f.e(5, this.f464684g) + b36.f.e(6, this.f464685h);
            r45.cu5 cu5Var2 = this.f464686i;
            return cu5Var2 != null ? e17 + b36.f.i(7, cu5Var2.mo75928xcd1e8d8()) : e17;
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
                this.f464681d = aVar2.k(intValue);
                return 0;
            case 3:
                this.f464682e = aVar2.k(intValue);
                return 0;
            case 4:
                this.f464683f = aVar2.g(intValue);
                return 0;
            case 5:
                this.f464684g = aVar2.g(intValue);
                return 0;
            case 6:
                this.f464685h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    this.f464686i = cu5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (r45.pl0) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: setBaseRequest */
    public r45.my3 mo11509x3ab820bc(r45.he heVar) {
        this.f76494x2de60e5e = heVar;
        return this;
    }
}

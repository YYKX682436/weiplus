package r45;

/* loaded from: classes9.dex */
public class hf3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f457644d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f457645e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f457646f;

    /* renamed from: g, reason: collision with root package name */
    public int f457647g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f457648h;

    /* renamed from: i, reason: collision with root package name */
    public r45.ae f457649i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f457650m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f457651n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hf3)) {
            return false;
        }
        r45.hf3 hf3Var = (r45.hf3) fVar;
        return n51.f.a(this.f76494x2de60e5e, hf3Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f457644d), java.lang.Integer.valueOf(hf3Var.f457644d)) && n51.f.a(this.f457645e, hf3Var.f457645e) && n51.f.a(this.f457646f, hf3Var.f457646f) && n51.f.a(java.lang.Integer.valueOf(this.f457647g), java.lang.Integer.valueOf(hf3Var.f457647g)) && n51.f.a(this.f457648h, hf3Var.f457648h) && n51.f.a(this.f457649i, hf3Var.f457649i) && n51.f.a(this.f457650m, hf3Var.f457650m) && n51.f.a(java.lang.Boolean.valueOf(this.f457651n), java.lang.Boolean.valueOf(hf3Var.f457651n));
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
            fVar.e(2, this.f457644d);
            java.lang.String str = this.f457645e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f457646f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f457647g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f457648h;
            if (gVar != null) {
                fVar.b(6, gVar);
            }
            r45.ae aeVar = this.f457649i;
            if (aeVar != null) {
                fVar.i(7, aeVar.mo75928xcd1e8d8());
                this.f457649i.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f457650m;
            if (gVar2 != null) {
                fVar.b(9, gVar2);
            }
            fVar.a(10, this.f457651n);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f457644d);
            java.lang.String str3 = this.f457645e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f457646f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            int e17 = i18 + b36.f.e(5, this.f457647g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f457648h;
            if (gVar3 != null) {
                e17 += b36.f.b(6, gVar3);
            }
            r45.ae aeVar2 = this.f457649i;
            if (aeVar2 != null) {
                e17 += b36.f.i(7, aeVar2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f457650m;
            if (gVar4 != null) {
                e17 += b36.f.b(9, gVar4);
            }
            return e17 + b36.f.a(10, this.f457651n);
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
        r45.hf3 hf3Var = (r45.hf3) objArr[1];
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
                    hf3Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                hf3Var.f457644d = aVar2.g(intValue);
                return 0;
            case 3:
                hf3Var.f457645e = aVar2.k(intValue);
                return 0;
            case 4:
                hf3Var.f457646f = aVar2.k(intValue);
                return 0;
            case 5:
                hf3Var.f457647g = aVar2.g(intValue);
                return 0;
            case 6:
                hf3Var.f457648h = aVar2.d(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ae aeVar3 = new r45.ae();
                    if (bArr2 != null && bArr2.length > 0) {
                        aeVar3.mo11468x92b714fd(bArr2);
                    }
                    hf3Var.f457649i = aeVar3;
                }
                return 0;
            case 8:
            default:
                return -1;
            case 9:
                hf3Var.f457650m = aVar2.d(intValue);
                return 0;
            case 10:
                hf3Var.f457651n = aVar2.c(intValue);
                return 0;
        }
    }
}

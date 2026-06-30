package r45;

/* loaded from: classes4.dex */
public class bx1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f452644d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452645e;

    /* renamed from: f, reason: collision with root package name */
    public long f452646f;

    /* renamed from: g, reason: collision with root package name */
    public long f452647g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f452648h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f452649i;

    /* renamed from: m, reason: collision with root package name */
    public int f452650m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f452651n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bx1)) {
            return false;
        }
        r45.bx1 bx1Var = (r45.bx1) fVar;
        return n51.f.a(this.f76494x2de60e5e, bx1Var.f76494x2de60e5e) && n51.f.a(this.f452644d, bx1Var.f452644d) && n51.f.a(this.f452645e, bx1Var.f452645e) && n51.f.a(java.lang.Long.valueOf(this.f452646f), java.lang.Long.valueOf(bx1Var.f452646f)) && n51.f.a(java.lang.Long.valueOf(this.f452647g), java.lang.Long.valueOf(bx1Var.f452647g)) && n51.f.a(this.f452648h, bx1Var.f452648h) && n51.f.a(this.f452649i, bx1Var.f452649i) && n51.f.a(java.lang.Integer.valueOf(this.f452650m), java.lang.Integer.valueOf(bx1Var.f452650m)) && n51.f.a(this.f452651n, bx1Var.f452651n);
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
            r45.kv0 kv0Var = this.f452644d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.mo75928xcd1e8d8());
                this.f452644d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f452645e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f452646f);
            fVar.h(5, this.f452647g);
            java.lang.String str2 = this.f452648h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f452649i;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            fVar.e(8, this.f452650m);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f452651n;
            if (gVar2 != null) {
                fVar.b(9, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.kv0 kv0Var2 = this.f452644d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f452645e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int h17 = i18 + b36.f.h(4, this.f452646f) + b36.f.h(5, this.f452647g);
            java.lang.String str4 = this.f452648h;
            if (str4 != null) {
                h17 += b36.f.j(6, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f452649i;
            if (gVar3 != null) {
                h17 += b36.f.b(7, gVar3);
            }
            int e17 = h17 + b36.f.e(8, this.f452650m);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f452651n;
            return gVar4 != null ? e17 + b36.f.b(9, gVar4) : e17;
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
        r45.bx1 bx1Var = (r45.bx1) objArr[1];
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
                    bx1Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kv0Var3.mo11468x92b714fd(bArr2);
                    }
                    bx1Var.f452644d = kv0Var3;
                }
                return 0;
            case 3:
                bx1Var.f452645e = aVar2.k(intValue);
                return 0;
            case 4:
                bx1Var.f452646f = aVar2.i(intValue);
                return 0;
            case 5:
                bx1Var.f452647g = aVar2.i(intValue);
                return 0;
            case 6:
                bx1Var.f452648h = aVar2.k(intValue);
                return 0;
            case 7:
                bx1Var.f452649i = aVar2.d(intValue);
                return 0;
            case 8:
                bx1Var.f452650m = aVar2.g(intValue);
                return 0;
            case 9:
                bx1Var.f452651n = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

package r45;

/* loaded from: classes8.dex */
public class nj4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f462976d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f462977e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f462978f;

    /* renamed from: g, reason: collision with root package name */
    public int f462979g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f462980h;

    /* renamed from: i, reason: collision with root package name */
    public r45.iu f462981i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f462982m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nj4)) {
            return false;
        }
        r45.nj4 nj4Var = (r45.nj4) fVar;
        return n51.f.a(this.f462976d, nj4Var.f462976d) && n51.f.a(this.f462977e, nj4Var.f462977e) && n51.f.a(this.f462978f, nj4Var.f462978f) && n51.f.a(java.lang.Integer.valueOf(this.f462979g), java.lang.Integer.valueOf(nj4Var.f462979g)) && n51.f.a(this.f462980h, nj4Var.f462980h) && n51.f.a(this.f462981i, nj4Var.f462981i) && n51.f.a(this.f462982m, nj4Var.f462982m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f462976d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f462977e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f462978f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f462979g);
            java.lang.String str4 = this.f462980h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            r45.iu iuVar = this.f462981i;
            if (iuVar != null) {
                fVar.i(6, iuVar.mo75928xcd1e8d8());
                this.f462981i.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str5 = this.f462982m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f462976d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f462977e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f462978f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            int e17 = j17 + b36.f.e(4, this.f462979g);
            java.lang.String str9 = this.f462980h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            r45.iu iuVar2 = this.f462981i;
            if (iuVar2 != null) {
                e17 += b36.f.i(6, iuVar2.mo75928xcd1e8d8());
            }
            java.lang.String str10 = this.f462982m;
            return str10 != null ? e17 + b36.f.j(7, str10) : e17;
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
        r45.nj4 nj4Var = (r45.nj4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                nj4Var.f462976d = aVar2.k(intValue);
                return 0;
            case 2:
                nj4Var.f462977e = aVar2.k(intValue);
                return 0;
            case 3:
                nj4Var.f462978f = aVar2.k(intValue);
                return 0;
            case 4:
                nj4Var.f462979g = aVar2.g(intValue);
                return 0;
            case 5:
                nj4Var.f462980h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.iu iuVar3 = new r45.iu();
                    if (bArr != null && bArr.length > 0) {
                        iuVar3.mo11468x92b714fd(bArr);
                    }
                    nj4Var.f462981i = iuVar3;
                }
                return 0;
            case 7:
                nj4Var.f462982m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

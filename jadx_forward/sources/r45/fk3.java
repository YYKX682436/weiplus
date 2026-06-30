package r45;

/* loaded from: classes8.dex */
public class fk3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ek3 f455940d;

    /* renamed from: e, reason: collision with root package name */
    public int f455941e;

    /* renamed from: f, reason: collision with root package name */
    public r45.dk3 f455942f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f455943g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f455944h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fk3)) {
            return false;
        }
        r45.fk3 fk3Var = (r45.fk3) fVar;
        return n51.f.a(this.f455940d, fk3Var.f455940d) && n51.f.a(java.lang.Integer.valueOf(this.f455941e), java.lang.Integer.valueOf(fk3Var.f455941e)) && n51.f.a(this.f455942f, fk3Var.f455942f) && n51.f.a(this.f455943g, fk3Var.f455943g) && n51.f.a(this.f455944h, fk3Var.f455944h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ek3 ek3Var = this.f455940d;
            if (ek3Var != null) {
                fVar.i(1, ek3Var.mo75928xcd1e8d8());
                this.f455940d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f455941e);
            r45.dk3 dk3Var = this.f455942f;
            if (dk3Var != null) {
                fVar.i(3, dk3Var.mo75928xcd1e8d8());
                this.f455942f.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f455943g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            java.lang.String str = this.f455944h;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ek3 ek3Var2 = this.f455940d;
            int i18 = (ek3Var2 != null ? 0 + b36.f.i(1, ek3Var2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f455941e);
            r45.dk3 dk3Var2 = this.f455942f;
            if (dk3Var2 != null) {
                i18 += b36.f.i(3, dk3Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f455943g;
            if (gVar2 != null) {
                i18 += b36.f.b(4, gVar2);
            }
            java.lang.String str2 = this.f455944h;
            return str2 != null ? i18 + b36.f.j(5, str2) : i18;
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
        r45.fk3 fk3Var = (r45.fk3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ek3 ek3Var3 = new r45.ek3();
                if (bArr != null && bArr.length > 0) {
                    ek3Var3.mo11468x92b714fd(bArr);
                }
                fk3Var.f455940d = ek3Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            fk3Var.f455941e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                fk3Var.f455943g = aVar2.d(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            fk3Var.f455944h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.dk3 dk3Var3 = new r45.dk3();
            if (bArr2 != null && bArr2.length > 0) {
                dk3Var3.mo11468x92b714fd(bArr2);
            }
            fk3Var.f455942f = dk3Var3;
        }
        return 0;
    }
}

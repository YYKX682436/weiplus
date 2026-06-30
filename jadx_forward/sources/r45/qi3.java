package r45;

/* loaded from: classes8.dex */
public class qi3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f465547d;

    /* renamed from: e, reason: collision with root package name */
    public int f465548e;

    /* renamed from: f, reason: collision with root package name */
    public double f465549f;

    /* renamed from: g, reason: collision with root package name */
    public double f465550g;

    /* renamed from: h, reason: collision with root package name */
    public int f465551h;

    /* renamed from: i, reason: collision with root package name */
    public int f465552i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qi3)) {
            return false;
        }
        r45.qi3 qi3Var = (r45.qi3) fVar;
        return n51.f.a(this.f76494x2de60e5e, qi3Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f465547d), java.lang.Integer.valueOf(qi3Var.f465547d)) && n51.f.a(java.lang.Integer.valueOf(this.f465548e), java.lang.Integer.valueOf(qi3Var.f465548e)) && n51.f.a(java.lang.Double.valueOf(this.f465549f), java.lang.Double.valueOf(qi3Var.f465549f)) && n51.f.a(java.lang.Double.valueOf(this.f465550g), java.lang.Double.valueOf(qi3Var.f465550g)) && n51.f.a(java.lang.Integer.valueOf(this.f465551h), java.lang.Integer.valueOf(qi3Var.f465551h)) && n51.f.a(java.lang.Integer.valueOf(this.f465552i), java.lang.Integer.valueOf(qi3Var.f465552i));
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
            fVar.e(2, this.f465547d);
            fVar.e(3, this.f465548e);
            fVar.c(4, this.f465549f);
            fVar.c(5, this.f465550g);
            fVar.e(6, this.f465551h);
            fVar.e(7, this.f465552i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f465547d) + b36.f.e(3, this.f465548e) + b36.f.c(4, this.f465549f) + b36.f.c(5, this.f465550g) + b36.f.e(6, this.f465551h) + b36.f.e(7, this.f465552i);
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
        r45.qi3 qi3Var = (r45.qi3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    qi3Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                qi3Var.f465547d = aVar2.g(intValue);
                return 0;
            case 3:
                qi3Var.f465548e = aVar2.g(intValue);
                return 0;
            case 4:
                qi3Var.f465549f = aVar2.e(intValue);
                return 0;
            case 5:
                qi3Var.f465550g = aVar2.e(intValue);
                return 0;
            case 6:
                qi3Var.f465551h = aVar2.g(intValue);
                return 0;
            case 7:
                qi3Var.f465552i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

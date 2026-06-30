package r45;

/* loaded from: classes4.dex */
public class wi3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f470737d;

    /* renamed from: e, reason: collision with root package name */
    public int f470738e;

    /* renamed from: f, reason: collision with root package name */
    public double f470739f;

    /* renamed from: g, reason: collision with root package name */
    public double f470740g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wi3)) {
            return false;
        }
        r45.wi3 wi3Var = (r45.wi3) fVar;
        return n51.f.a(this.f76494x2de60e5e, wi3Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f470737d), java.lang.Integer.valueOf(wi3Var.f470737d)) && n51.f.a(java.lang.Integer.valueOf(this.f470738e), java.lang.Integer.valueOf(wi3Var.f470738e)) && n51.f.a(java.lang.Double.valueOf(this.f470739f), java.lang.Double.valueOf(wi3Var.f470739f)) && n51.f.a(java.lang.Double.valueOf(this.f470740g), java.lang.Double.valueOf(wi3Var.f470740g));
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
            fVar.e(2, this.f470737d);
            fVar.e(3, this.f470738e);
            fVar.c(4, this.f470739f);
            fVar.c(5, this.f470740g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f470737d) + b36.f.e(3, this.f470738e) + b36.f.c(4, this.f470739f) + b36.f.c(5, this.f470740g);
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
        r45.wi3 wi3Var = (r45.wi3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.mo11468x92b714fd(bArr);
                }
                wi3Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            wi3Var.f470737d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            wi3Var.f470738e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            wi3Var.f470739f = aVar2.e(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        wi3Var.f470740g = aVar2.e(intValue);
        return 0;
    }
}

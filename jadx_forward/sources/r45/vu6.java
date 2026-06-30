package r45;

/* loaded from: classes2.dex */
public class vu6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public double f470120d;

    /* renamed from: e, reason: collision with root package name */
    public double f470121e;

    /* renamed from: f, reason: collision with root package name */
    public double f470122f;

    /* renamed from: g, reason: collision with root package name */
    public double f470123g;

    /* renamed from: h, reason: collision with root package name */
    public double f470124h;

    /* renamed from: i, reason: collision with root package name */
    public int f470125i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vu6)) {
            return false;
        }
        r45.vu6 vu6Var = (r45.vu6) fVar;
        return n51.f.a(this.f76494x2de60e5e, vu6Var.f76494x2de60e5e) && n51.f.a(java.lang.Double.valueOf(this.f470120d), java.lang.Double.valueOf(vu6Var.f470120d)) && n51.f.a(java.lang.Double.valueOf(this.f470121e), java.lang.Double.valueOf(vu6Var.f470121e)) && n51.f.a(java.lang.Double.valueOf(this.f470122f), java.lang.Double.valueOf(vu6Var.f470122f)) && n51.f.a(java.lang.Double.valueOf(this.f470123g), java.lang.Double.valueOf(vu6Var.f470123g)) && n51.f.a(java.lang.Double.valueOf(this.f470124h), java.lang.Double.valueOf(vu6Var.f470124h)) && n51.f.a(java.lang.Integer.valueOf(this.f470125i), java.lang.Integer.valueOf(vu6Var.f470125i));
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
            fVar.c(2, this.f470120d);
            fVar.c(3, this.f470121e);
            fVar.c(4, this.f470122f);
            fVar.c(5, this.f470123g);
            fVar.c(6, this.f470124h);
            fVar.e(7, this.f470125i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.c(2, this.f470120d) + b36.f.c(3, this.f470121e) + b36.f.c(4, this.f470122f) + b36.f.c(5, this.f470123g) + b36.f.c(6, this.f470124h) + b36.f.e(7, this.f470125i);
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
        r45.vu6 vu6Var = (r45.vu6) objArr[1];
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
                    vu6Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                vu6Var.f470120d = aVar2.e(intValue);
                return 0;
            case 3:
                vu6Var.f470121e = aVar2.e(intValue);
                return 0;
            case 4:
                vu6Var.f470122f = aVar2.e(intValue);
                return 0;
            case 5:
                vu6Var.f470123g = aVar2.e(intValue);
                return 0;
            case 6:
                vu6Var.f470124h = aVar2.e(intValue);
                return 0;
            case 7:
                vu6Var.f470125i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

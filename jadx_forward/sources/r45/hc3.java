package r45;

/* loaded from: classes4.dex */
public class hc3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f457575d;

    /* renamed from: e, reason: collision with root package name */
    public double f457576e;

    /* renamed from: f, reason: collision with root package name */
    public double f457577f;

    /* renamed from: g, reason: collision with root package name */
    public long f457578g;

    /* renamed from: h, reason: collision with root package name */
    public int f457579h;

    /* renamed from: i, reason: collision with root package name */
    public int f457580i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hc3)) {
            return false;
        }
        r45.hc3 hc3Var = (r45.hc3) fVar;
        return n51.f.a(this.f76494x2de60e5e, hc3Var.f76494x2de60e5e) && n51.f.a(this.f457575d, hc3Var.f457575d) && n51.f.a(java.lang.Double.valueOf(this.f457576e), java.lang.Double.valueOf(hc3Var.f457576e)) && n51.f.a(java.lang.Double.valueOf(this.f457577f), java.lang.Double.valueOf(hc3Var.f457577f)) && n51.f.a(java.lang.Long.valueOf(this.f457578g), java.lang.Long.valueOf(hc3Var.f457578g)) && n51.f.a(java.lang.Integer.valueOf(this.f457579h), java.lang.Integer.valueOf(hc3Var.f457579h)) && n51.f.a(java.lang.Integer.valueOf(this.f457580i), java.lang.Integer.valueOf(hc3Var.f457580i));
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
            java.lang.String str = this.f457575d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.c(3, this.f457576e);
            fVar.c(4, this.f457577f);
            fVar.h(5, this.f457578g);
            fVar.e(6, this.f457579h);
            fVar.e(7, this.f457580i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f457575d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.c(3, this.f457576e) + b36.f.c(4, this.f457577f) + b36.f.h(5, this.f457578g) + b36.f.e(6, this.f457579h) + b36.f.e(7, this.f457580i);
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
        r45.hc3 hc3Var = (r45.hc3) objArr[1];
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
                    hc3Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                hc3Var.f457575d = aVar2.k(intValue);
                return 0;
            case 3:
                hc3Var.f457576e = aVar2.e(intValue);
                return 0;
            case 4:
                hc3Var.f457577f = aVar2.e(intValue);
                return 0;
            case 5:
                hc3Var.f457578g = aVar2.i(intValue);
                return 0;
            case 6:
                hc3Var.f457579h = aVar2.g(intValue);
                return 0;
            case 7:
                hc3Var.f457580i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

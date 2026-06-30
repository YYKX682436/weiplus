package r45;

/* loaded from: classes4.dex */
public class zp5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public double f473810d;

    /* renamed from: e, reason: collision with root package name */
    public double f473811e;

    /* renamed from: f, reason: collision with root package name */
    public int f473812f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f473813g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f473814h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zp5)) {
            return false;
        }
        r45.zp5 zp5Var = (r45.zp5) fVar;
        return n51.f.a(this.f76494x2de60e5e, zp5Var.f76494x2de60e5e) && n51.f.a(java.lang.Double.valueOf(this.f473810d), java.lang.Double.valueOf(zp5Var.f473810d)) && n51.f.a(java.lang.Double.valueOf(this.f473811e), java.lang.Double.valueOf(zp5Var.f473811e)) && n51.f.a(java.lang.Integer.valueOf(this.f473812f), java.lang.Integer.valueOf(zp5Var.f473812f)) && n51.f.a(this.f473813g, zp5Var.f473813g) && n51.f.a(this.f473814h, zp5Var.f473814h);
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
            fVar.c(2, this.f473810d);
            fVar.c(3, this.f473811e);
            fVar.e(4, this.f473812f);
            java.lang.String str = this.f473813g;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f473814h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.c(2, this.f473810d) + b36.f.c(3, this.f473811e) + b36.f.e(4, this.f473812f);
            java.lang.String str3 = this.f473813g;
            if (str3 != null) {
                i18 += b36.f.j(5, str3);
            }
            java.lang.String str4 = this.f473814h;
            return str4 != null ? i18 + b36.f.j(6, str4) : i18;
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
        r45.zp5 zp5Var = (r45.zp5) objArr[1];
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
                    zp5Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                zp5Var.f473810d = aVar2.e(intValue);
                return 0;
            case 3:
                zp5Var.f473811e = aVar2.e(intValue);
                return 0;
            case 4:
                zp5Var.f473812f = aVar2.g(intValue);
                return 0;
            case 5:
                zp5Var.f473813g = aVar2.k(intValue);
                return 0;
            case 6:
                zp5Var.f473814h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

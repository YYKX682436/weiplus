package r45;

/* loaded from: classes4.dex */
public class i93 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public double f458372d;

    /* renamed from: e, reason: collision with root package name */
    public double f458373e;

    /* renamed from: f, reason: collision with root package name */
    public int f458374f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f458375g;

    /* renamed from: h, reason: collision with root package name */
    public int f458376h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i93)) {
            return false;
        }
        r45.i93 i93Var = (r45.i93) fVar;
        return n51.f.a(this.f76494x2de60e5e, i93Var.f76494x2de60e5e) && n51.f.a(java.lang.Double.valueOf(this.f458372d), java.lang.Double.valueOf(i93Var.f458372d)) && n51.f.a(java.lang.Double.valueOf(this.f458373e), java.lang.Double.valueOf(i93Var.f458373e)) && n51.f.a(java.lang.Integer.valueOf(this.f458374f), java.lang.Integer.valueOf(i93Var.f458374f)) && n51.f.a(this.f458375g, i93Var.f458375g) && n51.f.a(java.lang.Integer.valueOf(this.f458376h), java.lang.Integer.valueOf(i93Var.f458376h));
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
            fVar.c(2, this.f458372d);
            fVar.c(3, this.f458373e);
            fVar.e(4, this.f458374f);
            java.lang.String str = this.f458375g;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f458376h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.c(2, this.f458372d) + b36.f.c(3, this.f458373e) + b36.f.e(4, this.f458374f);
            java.lang.String str2 = this.f458375g;
            if (str2 != null) {
                i18 += b36.f.j(5, str2);
            }
            return i18 + b36.f.e(6, this.f458376h);
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
        r45.i93 i93Var = (r45.i93) objArr[1];
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
                    i93Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                i93Var.f458372d = aVar2.e(intValue);
                return 0;
            case 3:
                i93Var.f458373e = aVar2.e(intValue);
                return 0;
            case 4:
                i93Var.f458374f = aVar2.g(intValue);
                return 0;
            case 5:
                i93Var.f458375g = aVar2.k(intValue);
                return 0;
            case 6:
                i93Var.f458376h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

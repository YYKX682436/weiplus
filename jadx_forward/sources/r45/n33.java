package r45;

/* loaded from: classes9.dex */
public class n33 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public r45.jw3 f462576e;

    /* renamed from: d, reason: collision with root package name */
    public int f462575d = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f462577f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f462578g = -1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f462579h = false;

    /* renamed from: i, reason: collision with root package name */
    public int f462580i = -1;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n33)) {
            return false;
        }
        r45.n33 n33Var = (r45.n33) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f462575d), java.lang.Integer.valueOf(n33Var.f462575d)) && n51.f.a(this.f462576e, n33Var.f462576e) && n51.f.a(java.lang.Integer.valueOf(this.f462577f), java.lang.Integer.valueOf(n33Var.f462577f)) && n51.f.a(java.lang.Integer.valueOf(this.f462578g), java.lang.Integer.valueOf(n33Var.f462578g)) && n51.f.a(java.lang.Boolean.valueOf(this.f462579h), java.lang.Boolean.valueOf(n33Var.f462579h)) && n51.f.a(java.lang.Integer.valueOf(this.f462580i), java.lang.Integer.valueOf(n33Var.f462580i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f462575d);
            r45.jw3 jw3Var = this.f462576e;
            if (jw3Var != null) {
                fVar.i(2, jw3Var.mo75928xcd1e8d8());
                this.f462576e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f462577f);
            fVar.e(4, this.f462578g);
            fVar.a(5, this.f462579h);
            fVar.e(6, this.f462580i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f462575d) + 0;
            r45.jw3 jw3Var2 = this.f462576e;
            if (jw3Var2 != null) {
                e17 += b36.f.i(2, jw3Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(3, this.f462577f) + b36.f.e(4, this.f462578g) + b36.f.a(5, this.f462579h) + b36.f.e(6, this.f462580i);
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
        r45.n33 n33Var = (r45.n33) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                n33Var.f462575d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.jw3 jw3Var3 = new r45.jw3();
                    if (bArr != null && bArr.length > 0) {
                        jw3Var3.mo11468x92b714fd(bArr);
                    }
                    n33Var.f462576e = jw3Var3;
                }
                return 0;
            case 3:
                n33Var.f462577f = aVar2.g(intValue);
                return 0;
            case 4:
                n33Var.f462578g = aVar2.g(intValue);
                return 0;
            case 5:
                n33Var.f462579h = aVar2.c(intValue);
                return 0;
            case 6:
                n33Var.f462580i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

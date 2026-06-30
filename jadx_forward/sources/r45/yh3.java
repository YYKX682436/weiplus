package r45;

/* loaded from: classes4.dex */
public class yh3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public float f472610d;

    /* renamed from: e, reason: collision with root package name */
    public float f472611e;

    /* renamed from: f, reason: collision with root package name */
    public int f472612f;

    /* renamed from: g, reason: collision with root package name */
    public int f472613g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f472614h;

    /* renamed from: i, reason: collision with root package name */
    public int f472615i;

    /* renamed from: m, reason: collision with root package name */
    public int f472616m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yh3)) {
            return false;
        }
        r45.yh3 yh3Var = (r45.yh3) fVar;
        return n51.f.a(this.f76494x2de60e5e, yh3Var.f76494x2de60e5e) && n51.f.a(java.lang.Float.valueOf(this.f472610d), java.lang.Float.valueOf(yh3Var.f472610d)) && n51.f.a(java.lang.Float.valueOf(this.f472611e), java.lang.Float.valueOf(yh3Var.f472611e)) && n51.f.a(java.lang.Integer.valueOf(this.f472612f), java.lang.Integer.valueOf(yh3Var.f472612f)) && n51.f.a(java.lang.Integer.valueOf(this.f472613g), java.lang.Integer.valueOf(yh3Var.f472613g)) && n51.f.a(this.f472614h, yh3Var.f472614h) && n51.f.a(java.lang.Integer.valueOf(this.f472615i), java.lang.Integer.valueOf(yh3Var.f472615i)) && n51.f.a(java.lang.Integer.valueOf(this.f472616m), java.lang.Integer.valueOf(yh3Var.f472616m));
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
            fVar.d(2, this.f472610d);
            fVar.d(3, this.f472611e);
            fVar.e(4, this.f472612f);
            fVar.e(5, this.f472613g);
            java.lang.String str = this.f472614h;
            if (str != null) {
                fVar.j(6, str);
            }
            fVar.e(7, this.f472615i);
            fVar.e(8, this.f472616m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.d(2, this.f472610d) + b36.f.d(3, this.f472611e) + b36.f.e(4, this.f472612f) + b36.f.e(5, this.f472613g);
            java.lang.String str2 = this.f472614h;
            if (str2 != null) {
                i18 += b36.f.j(6, str2);
            }
            return i18 + b36.f.e(7, this.f472615i) + b36.f.e(8, this.f472616m);
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
        r45.yh3 yh3Var = (r45.yh3) objArr[1];
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
                    yh3Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                yh3Var.f472610d = aVar2.f(intValue);
                return 0;
            case 3:
                yh3Var.f472611e = aVar2.f(intValue);
                return 0;
            case 4:
                yh3Var.f472612f = aVar2.g(intValue);
                return 0;
            case 5:
                yh3Var.f472613g = aVar2.g(intValue);
                return 0;
            case 6:
                yh3Var.f472614h = aVar2.k(intValue);
                return 0;
            case 7:
                yh3Var.f472615i = aVar2.g(intValue);
                return 0;
            case 8:
                yh3Var.f472616m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

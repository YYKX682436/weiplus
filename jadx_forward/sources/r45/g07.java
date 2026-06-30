package r45;

/* loaded from: classes2.dex */
public class g07 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456322d;

    /* renamed from: e, reason: collision with root package name */
    public r45.j32 f456323e;

    /* renamed from: f, reason: collision with root package name */
    public int f456324f;

    /* renamed from: g, reason: collision with root package name */
    public int f456325g;

    /* renamed from: h, reason: collision with root package name */
    public int f456326h;

    /* renamed from: i, reason: collision with root package name */
    public int f456327i;

    /* renamed from: m, reason: collision with root package name */
    public int f456328m;

    /* renamed from: n, reason: collision with root package name */
    public int f456329n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g07)) {
            return false;
        }
        r45.g07 g07Var = (r45.g07) fVar;
        return n51.f.a(this.f456322d, g07Var.f456322d) && n51.f.a(this.f456323e, g07Var.f456323e) && n51.f.a(java.lang.Integer.valueOf(this.f456324f), java.lang.Integer.valueOf(g07Var.f456324f)) && n51.f.a(java.lang.Integer.valueOf(this.f456325g), java.lang.Integer.valueOf(g07Var.f456325g)) && n51.f.a(java.lang.Integer.valueOf(this.f456326h), java.lang.Integer.valueOf(g07Var.f456326h)) && n51.f.a(java.lang.Integer.valueOf(this.f456327i), java.lang.Integer.valueOf(g07Var.f456327i)) && n51.f.a(java.lang.Integer.valueOf(this.f456328m), java.lang.Integer.valueOf(g07Var.f456328m)) && n51.f.a(java.lang.Integer.valueOf(this.f456329n), java.lang.Integer.valueOf(g07Var.f456329n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f456322d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.j32 j32Var = this.f456323e;
            if (j32Var != null) {
                fVar.i(2, j32Var.mo75928xcd1e8d8());
                this.f456323e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f456324f);
            fVar.e(4, this.f456325g);
            fVar.e(5, this.f456326h);
            fVar.e(6, this.f456327i);
            fVar.e(7, this.f456328m);
            fVar.e(8, this.f456329n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f456322d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.j32 j32Var2 = this.f456323e;
            if (j32Var2 != null) {
                j17 += b36.f.i(2, j32Var2.mo75928xcd1e8d8());
            }
            return j17 + b36.f.e(3, this.f456324f) + b36.f.e(4, this.f456325g) + b36.f.e(5, this.f456326h) + b36.f.e(6, this.f456327i) + b36.f.e(7, this.f456328m) + b36.f.e(8, this.f456329n);
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
        r45.g07 g07Var = (r45.g07) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                g07Var.f456322d = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.j32 j32Var3 = new r45.j32();
                    if (bArr != null && bArr.length > 0) {
                        j32Var3.mo11468x92b714fd(bArr);
                    }
                    g07Var.f456323e = j32Var3;
                }
                return 0;
            case 3:
                g07Var.f456324f = aVar2.g(intValue);
                return 0;
            case 4:
                g07Var.f456325g = aVar2.g(intValue);
                return 0;
            case 5:
                g07Var.f456326h = aVar2.g(intValue);
                return 0;
            case 6:
                g07Var.f456327i = aVar2.g(intValue);
                return 0;
            case 7:
                g07Var.f456328m = aVar2.g(intValue);
                return 0;
            case 8:
                g07Var.f456329n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

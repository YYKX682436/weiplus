package m53;

/* loaded from: classes8.dex */
public class b0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f405101d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405102e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f405103f;

    /* renamed from: g, reason: collision with root package name */
    public m53.i6 f405104g;

    /* renamed from: h, reason: collision with root package name */
    public int f405105h;

    /* renamed from: i, reason: collision with root package name */
    public int f405106i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f405107m;

    /* renamed from: n, reason: collision with root package name */
    public int f405108n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.b0)) {
            return false;
        }
        m53.b0 b0Var = (m53.b0) fVar;
        return n51.f.a(this.f405101d, b0Var.f405101d) && n51.f.a(this.f405102e, b0Var.f405102e) && n51.f.a(this.f405103f, b0Var.f405103f) && n51.f.a(this.f405104g, b0Var.f405104g) && n51.f.a(java.lang.Integer.valueOf(this.f405105h), java.lang.Integer.valueOf(b0Var.f405105h)) && n51.f.a(java.lang.Integer.valueOf(this.f405106i), java.lang.Integer.valueOf(b0Var.f405106i)) && n51.f.a(this.f405107m, b0Var.f405107m) && n51.f.a(java.lang.Integer.valueOf(this.f405108n), java.lang.Integer.valueOf(b0Var.f405108n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f405101d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f405102e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f405103f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            m53.i6 i6Var = this.f405104g;
            if (i6Var != null) {
                fVar.i(5, i6Var.mo75928xcd1e8d8());
                this.f405104g.mo75956x3d5d1f78(fVar);
            }
            fVar.e(6, this.f405105h);
            fVar.e(7, this.f405106i);
            java.lang.String str4 = this.f405107m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f405108n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f405101d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f405102e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f405103f;
            if (str7 != null) {
                j17 += b36.f.j(4, str7);
            }
            m53.i6 i6Var2 = this.f405104g;
            if (i6Var2 != null) {
                j17 += b36.f.i(5, i6Var2.mo75928xcd1e8d8());
            }
            int e17 = j17 + b36.f.e(6, this.f405105h) + b36.f.e(7, this.f405106i);
            java.lang.String str8 = this.f405107m;
            if (str8 != null) {
                e17 += b36.f.j(8, str8);
            }
            return e17 + b36.f.e(9, this.f405108n);
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
        m53.b0 b0Var = (m53.b0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                b0Var.f405101d = aVar2.k(intValue);
                return 0;
            case 2:
                b0Var.f405102e = aVar2.k(intValue);
                return 0;
            case 3:
            default:
                return -1;
            case 4:
                b0Var.f405103f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    m53.i6 i6Var3 = new m53.i6();
                    if (bArr != null && bArr.length > 0) {
                        i6Var3.mo11468x92b714fd(bArr);
                    }
                    b0Var.f405104g = i6Var3;
                }
                return 0;
            case 6:
                b0Var.f405105h = aVar2.g(intValue);
                return 0;
            case 7:
                b0Var.f405106i = aVar2.g(intValue);
                return 0;
            case 8:
                b0Var.f405107m = aVar2.k(intValue);
                return 0;
            case 9:
                b0Var.f405108n = aVar2.g(intValue);
                return 0;
        }
    }
}

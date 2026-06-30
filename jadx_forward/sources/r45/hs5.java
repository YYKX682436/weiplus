package r45;

/* loaded from: classes11.dex */
public class hs5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f457962d;

    /* renamed from: e, reason: collision with root package name */
    public int f457963e;

    /* renamed from: f, reason: collision with root package name */
    public int f457964f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f457965g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f457966h;

    /* renamed from: i, reason: collision with root package name */
    public int f457967i;

    /* renamed from: m, reason: collision with root package name */
    public r45.kk0 f457968m;

    /* renamed from: n, reason: collision with root package name */
    public r45.fn0 f457969n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hs5)) {
            return false;
        }
        r45.hs5 hs5Var = (r45.hs5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f457962d), java.lang.Integer.valueOf(hs5Var.f457962d)) && n51.f.a(java.lang.Integer.valueOf(this.f457963e), java.lang.Integer.valueOf(hs5Var.f457963e)) && n51.f.a(java.lang.Integer.valueOf(this.f457964f), java.lang.Integer.valueOf(hs5Var.f457964f)) && n51.f.a(this.f457965g, hs5Var.f457965g) && n51.f.a(this.f457966h, hs5Var.f457966h) && n51.f.a(java.lang.Integer.valueOf(this.f457967i), java.lang.Integer.valueOf(hs5Var.f457967i)) && n51.f.a(this.f457968m, hs5Var.f457968m) && n51.f.a(this.f457969n, hs5Var.f457969n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f457962d);
            fVar.e(2, this.f457963e);
            fVar.e(3, this.f457964f);
            java.lang.String str = this.f457965g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f457966h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f457967i);
            r45.kk0 kk0Var = this.f457968m;
            if (kk0Var != null) {
                fVar.i(7, kk0Var.mo75928xcd1e8d8());
                this.f457968m.mo75956x3d5d1f78(fVar);
            }
            r45.fn0 fn0Var = this.f457969n;
            if (fn0Var != null) {
                fVar.i(8, fn0Var.mo75928xcd1e8d8());
                this.f457969n.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f457962d) + 0 + b36.f.e(2, this.f457963e) + b36.f.e(3, this.f457964f);
            java.lang.String str3 = this.f457965g;
            if (str3 != null) {
                e17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f457966h;
            if (str4 != null) {
                e17 += b36.f.j(5, str4);
            }
            int e18 = e17 + b36.f.e(6, this.f457967i);
            r45.kk0 kk0Var2 = this.f457968m;
            if (kk0Var2 != null) {
                e18 += b36.f.i(7, kk0Var2.mo75928xcd1e8d8());
            }
            r45.fn0 fn0Var2 = this.f457969n;
            return fn0Var2 != null ? e18 + b36.f.i(8, fn0Var2.mo75928xcd1e8d8()) : e18;
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
        r45.hs5 hs5Var = (r45.hs5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                hs5Var.f457962d = aVar2.g(intValue);
                return 0;
            case 2:
                hs5Var.f457963e = aVar2.g(intValue);
                return 0;
            case 3:
                hs5Var.f457964f = aVar2.g(intValue);
                return 0;
            case 4:
                hs5Var.f457965g = aVar2.k(intValue);
                return 0;
            case 5:
                hs5Var.f457966h = aVar2.k(intValue);
                return 0;
            case 6:
                hs5Var.f457967i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.kk0 kk0Var3 = new r45.kk0();
                    if (bArr != null && bArr.length > 0) {
                        kk0Var3.mo11468x92b714fd(bArr);
                    }
                    hs5Var.f457968m = kk0Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.fn0 fn0Var3 = new r45.fn0();
                    if (bArr2 != null && bArr2.length > 0) {
                        fn0Var3.mo11468x92b714fd(bArr2);
                    }
                    hs5Var.f457969n = fn0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

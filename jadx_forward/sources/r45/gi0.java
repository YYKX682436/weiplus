package r45;

/* loaded from: classes10.dex */
public class gi0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f456801d;

    /* renamed from: e, reason: collision with root package name */
    public float f456802e;

    /* renamed from: f, reason: collision with root package name */
    public float f456803f;

    /* renamed from: g, reason: collision with root package name */
    public int f456804g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f456805h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f456806i;

    /* renamed from: m, reason: collision with root package name */
    public int f456807m;

    /* renamed from: n, reason: collision with root package name */
    public int f456808n;

    /* renamed from: o, reason: collision with root package name */
    public r45.di0 f456809o;

    /* renamed from: p, reason: collision with root package name */
    public r45.kp f456810p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gi0)) {
            return false;
        }
        r45.gi0 gi0Var = (r45.gi0) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f456801d), java.lang.Float.valueOf(gi0Var.f456801d)) && n51.f.a(java.lang.Float.valueOf(this.f456802e), java.lang.Float.valueOf(gi0Var.f456802e)) && n51.f.a(java.lang.Float.valueOf(this.f456803f), java.lang.Float.valueOf(gi0Var.f456803f)) && n51.f.a(java.lang.Integer.valueOf(this.f456804g), java.lang.Integer.valueOf(gi0Var.f456804g)) && n51.f.a(this.f456805h, gi0Var.f456805h) && n51.f.a(this.f456806i, gi0Var.f456806i) && n51.f.a(java.lang.Integer.valueOf(this.f456807m), java.lang.Integer.valueOf(gi0Var.f456807m)) && n51.f.a(java.lang.Integer.valueOf(this.f456808n), java.lang.Integer.valueOf(gi0Var.f456808n)) && n51.f.a(this.f456809o, gi0Var.f456809o) && n51.f.a(this.f456810p, gi0Var.f456810p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f456801d);
            fVar.d(2, this.f456802e);
            fVar.d(3, this.f456803f);
            fVar.e(4, this.f456804g);
            java.lang.String str = this.f456805h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f456806i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f456807m);
            fVar.e(8, this.f456808n);
            r45.di0 di0Var = this.f456809o;
            if (di0Var != null) {
                fVar.i(9, di0Var.mo75928xcd1e8d8());
                this.f456809o.mo75956x3d5d1f78(fVar);
            }
            r45.kp kpVar = this.f456810p;
            if (kpVar != null) {
                fVar.i(10, kpVar.mo75928xcd1e8d8());
                this.f456810p.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = b36.f.d(1, this.f456801d) + 0 + b36.f.d(2, this.f456802e) + b36.f.d(3, this.f456803f) + b36.f.e(4, this.f456804g);
            java.lang.String str3 = this.f456805h;
            if (str3 != null) {
                d17 += b36.f.j(5, str3);
            }
            java.lang.String str4 = this.f456806i;
            if (str4 != null) {
                d17 += b36.f.j(6, str4);
            }
            int e17 = d17 + b36.f.e(7, this.f456807m) + b36.f.e(8, this.f456808n);
            r45.di0 di0Var2 = this.f456809o;
            if (di0Var2 != null) {
                e17 += b36.f.i(9, di0Var2.mo75928xcd1e8d8());
            }
            r45.kp kpVar2 = this.f456810p;
            return kpVar2 != null ? e17 + b36.f.i(10, kpVar2.mo75928xcd1e8d8()) : e17;
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
        r45.gi0 gi0Var = (r45.gi0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                gi0Var.f456801d = aVar2.f(intValue);
                return 0;
            case 2:
                gi0Var.f456802e = aVar2.f(intValue);
                return 0;
            case 3:
                gi0Var.f456803f = aVar2.f(intValue);
                return 0;
            case 4:
                gi0Var.f456804g = aVar2.g(intValue);
                return 0;
            case 5:
                gi0Var.f456805h = aVar2.k(intValue);
                return 0;
            case 6:
                gi0Var.f456806i = aVar2.k(intValue);
                return 0;
            case 7:
                gi0Var.f456807m = aVar2.g(intValue);
                return 0;
            case 8:
                gi0Var.f456808n = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.di0 di0Var3 = new r45.di0();
                    if (bArr != null && bArr.length > 0) {
                        di0Var3.mo11468x92b714fd(bArr);
                    }
                    gi0Var.f456809o = di0Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.kp kpVar3 = new r45.kp();
                    if (bArr2 != null && bArr2.length > 0) {
                        kpVar3.mo11468x92b714fd(bArr2);
                    }
                    gi0Var.f456810p = kpVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

package r45;

/* loaded from: classes4.dex */
public class kg2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f460204d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460205e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460206f;

    /* renamed from: g, reason: collision with root package name */
    public int f460207g;

    /* renamed from: h, reason: collision with root package name */
    public long f460208h;

    /* renamed from: i, reason: collision with root package name */
    public long f460209i;

    /* renamed from: m, reason: collision with root package name */
    public int f460210m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kg2)) {
            return false;
        }
        r45.kg2 kg2Var = (r45.kg2) fVar;
        return n51.f.a(this.f460204d, kg2Var.f460204d) && n51.f.a(this.f460205e, kg2Var.f460205e) && n51.f.a(this.f460206f, kg2Var.f460206f) && n51.f.a(java.lang.Integer.valueOf(this.f460207g), java.lang.Integer.valueOf(kg2Var.f460207g)) && n51.f.a(java.lang.Long.valueOf(this.f460208h), java.lang.Long.valueOf(kg2Var.f460208h)) && n51.f.a(java.lang.Long.valueOf(this.f460209i), java.lang.Long.valueOf(kg2Var.f460209i)) && n51.f.a(java.lang.Integer.valueOf(this.f460210m), java.lang.Integer.valueOf(kg2Var.f460210m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f460204d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f460205e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f460206f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f460207g);
            fVar.h(5, this.f460208h);
            fVar.h(6, this.f460209i);
            fVar.e(7, this.f460210m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f460204d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f460205e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f460206f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.e(4, this.f460207g) + b36.f.h(5, this.f460208h) + b36.f.h(6, this.f460209i) + b36.f.e(7, this.f460210m);
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
        r45.kg2 kg2Var = (r45.kg2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                kg2Var.f460204d = aVar2.k(intValue);
                return 0;
            case 2:
                kg2Var.f460205e = aVar2.k(intValue);
                return 0;
            case 3:
                kg2Var.f460206f = aVar2.k(intValue);
                return 0;
            case 4:
                kg2Var.f460207g = aVar2.g(intValue);
                return 0;
            case 5:
                kg2Var.f460208h = aVar2.i(intValue);
                return 0;
            case 6:
                kg2Var.f460209i = aVar2.i(intValue);
                return 0;
            case 7:
                kg2Var.f460210m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

package r45;

/* loaded from: classes10.dex */
public class il4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f458662d;

    /* renamed from: e, reason: collision with root package name */
    public long f458663e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f458664f;

    /* renamed from: g, reason: collision with root package name */
    public r45.kf5 f458665g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f458666h;

    /* renamed from: i, reason: collision with root package name */
    public long f458667i;

    /* renamed from: m, reason: collision with root package name */
    public int f458668m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.il4)) {
            return false;
        }
        r45.il4 il4Var = (r45.il4) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f458662d), java.lang.Long.valueOf(il4Var.f458662d)) && n51.f.a(java.lang.Long.valueOf(this.f458663e), java.lang.Long.valueOf(il4Var.f458663e)) && n51.f.a(this.f458664f, il4Var.f458664f) && n51.f.a(this.f458665g, il4Var.f458665g) && n51.f.a(java.lang.Boolean.valueOf(this.f458666h), java.lang.Boolean.valueOf(il4Var.f458666h)) && n51.f.a(java.lang.Long.valueOf(this.f458667i), java.lang.Long.valueOf(il4Var.f458667i)) && n51.f.a(java.lang.Integer.valueOf(this.f458668m), java.lang.Integer.valueOf(il4Var.f458668m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f458662d);
            fVar.h(2, this.f458663e);
            java.lang.String str = this.f458664f;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.kf5 kf5Var = this.f458665g;
            if (kf5Var != null) {
                fVar.i(4, kf5Var.mo75928xcd1e8d8());
                this.f458665g.mo75956x3d5d1f78(fVar);
            }
            fVar.a(5, this.f458666h);
            fVar.h(6, this.f458667i);
            fVar.e(7, this.f458668m);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f458662d) + 0 + b36.f.h(2, this.f458663e);
            java.lang.String str2 = this.f458664f;
            if (str2 != null) {
                h17 += b36.f.j(3, str2);
            }
            r45.kf5 kf5Var2 = this.f458665g;
            if (kf5Var2 != null) {
                h17 += b36.f.i(4, kf5Var2.mo75928xcd1e8d8());
            }
            return h17 + b36.f.a(5, this.f458666h) + b36.f.h(6, this.f458667i) + b36.f.e(7, this.f458668m);
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
        r45.il4 il4Var = (r45.il4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                il4Var.f458662d = aVar2.i(intValue);
                return 0;
            case 2:
                il4Var.f458663e = aVar2.i(intValue);
                return 0;
            case 3:
                il4Var.f458664f = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.kf5 kf5Var3 = new r45.kf5();
                    if (bArr != null && bArr.length > 0) {
                        kf5Var3.mo11468x92b714fd(bArr);
                    }
                    il4Var.f458665g = kf5Var3;
                }
                return 0;
            case 5:
                il4Var.f458666h = aVar2.c(intValue);
                return 0;
            case 6:
                il4Var.f458667i = aVar2.i(intValue);
                return 0;
            case 7:
                il4Var.f458668m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

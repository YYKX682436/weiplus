package r45;

/* loaded from: classes4.dex */
public class az3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f451906d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f451907e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f451908f;

    /* renamed from: g, reason: collision with root package name */
    public long f451909g;

    /* renamed from: h, reason: collision with root package name */
    public int f451910h;

    /* renamed from: i, reason: collision with root package name */
    public int f451911i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.az3)) {
            return false;
        }
        r45.az3 az3Var = (r45.az3) fVar;
        return n51.f.a(this.f451906d, az3Var.f451906d) && n51.f.a(this.f451907e, az3Var.f451907e) && n51.f.a(this.f451908f, az3Var.f451908f) && n51.f.a(java.lang.Long.valueOf(this.f451909g), java.lang.Long.valueOf(az3Var.f451909g)) && n51.f.a(java.lang.Integer.valueOf(this.f451910h), java.lang.Integer.valueOf(az3Var.f451910h)) && n51.f.a(java.lang.Integer.valueOf(this.f451911i), java.lang.Integer.valueOf(az3Var.f451911i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f451906d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f451907e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f451908f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.h(4, this.f451909g);
            fVar.e(5, this.f451910h);
            fVar.e(6, this.f451911i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f451906d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f451907e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f451908f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.h(4, this.f451909g) + b36.f.e(5, this.f451910h) + b36.f.e(6, this.f451911i);
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
        r45.az3 az3Var = (r45.az3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                az3Var.f451906d = aVar2.k(intValue);
                return 0;
            case 2:
                az3Var.f451907e = aVar2.k(intValue);
                return 0;
            case 3:
                az3Var.f451908f = aVar2.k(intValue);
                return 0;
            case 4:
                az3Var.f451909g = aVar2.i(intValue);
                return 0;
            case 5:
                az3Var.f451910h = aVar2.g(intValue);
                return 0;
            case 6:
                az3Var.f451911i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

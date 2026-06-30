package r45;

/* loaded from: classes2.dex */
public class bq2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f452515d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452516e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452517f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f452518g;

    /* renamed from: h, reason: collision with root package name */
    public long f452519h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bq2)) {
            return false;
        }
        r45.bq2 bq2Var = (r45.bq2) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f452515d), java.lang.Long.valueOf(bq2Var.f452515d)) && n51.f.a(this.f452516e, bq2Var.f452516e) && n51.f.a(this.f452517f, bq2Var.f452517f) && n51.f.a(this.f452518g, bq2Var.f452518g) && n51.f.a(java.lang.Long.valueOf(this.f452519h), java.lang.Long.valueOf(bq2Var.f452519h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f452515d);
            java.lang.String str = this.f452516e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f452517f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f452518g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.h(5, this.f452519h);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f452515d) + 0;
            java.lang.String str4 = this.f452516e;
            if (str4 != null) {
                h17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f452517f;
            if (str5 != null) {
                h17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f452518g;
            if (str6 != null) {
                h17 += b36.f.j(4, str6);
            }
            return h17 + b36.f.h(5, this.f452519h);
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
        r45.bq2 bq2Var = (r45.bq2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bq2Var.f452515d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            bq2Var.f452516e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            bq2Var.f452517f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            bq2Var.f452518g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        bq2Var.f452519h = aVar2.i(intValue);
        return 0;
    }
}

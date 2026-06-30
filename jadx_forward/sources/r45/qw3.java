package r45;

/* loaded from: classes9.dex */
public class qw3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f465844d;

    /* renamed from: e, reason: collision with root package name */
    public long f465845e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465846f;

    /* renamed from: g, reason: collision with root package name */
    public int f465847g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f465848h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f465849i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qw3)) {
            return false;
        }
        r45.qw3 qw3Var = (r45.qw3) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f465844d), java.lang.Long.valueOf(qw3Var.f465844d)) && n51.f.a(java.lang.Long.valueOf(this.f465845e), java.lang.Long.valueOf(qw3Var.f465845e)) && n51.f.a(this.f465846f, qw3Var.f465846f) && n51.f.a(java.lang.Integer.valueOf(this.f465847g), java.lang.Integer.valueOf(qw3Var.f465847g)) && n51.f.a(this.f465848h, qw3Var.f465848h) && n51.f.a(this.f465849i, qw3Var.f465849i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f465844d);
            fVar.h(2, this.f465845e);
            java.lang.String str = this.f465846f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f465847g);
            java.lang.String str2 = this.f465848h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f465849i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f465844d) + 0 + b36.f.h(2, this.f465845e);
            java.lang.String str4 = this.f465846f;
            if (str4 != null) {
                h17 += b36.f.j(3, str4);
            }
            int e17 = h17 + b36.f.e(4, this.f465847g);
            java.lang.String str5 = this.f465848h;
            if (str5 != null) {
                e17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f465849i;
            return str6 != null ? e17 + b36.f.j(6, str6) : e17;
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
        r45.qw3 qw3Var = (r45.qw3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qw3Var.f465844d = aVar2.i(intValue);
                return 0;
            case 2:
                qw3Var.f465845e = aVar2.i(intValue);
                return 0;
            case 3:
                qw3Var.f465846f = aVar2.k(intValue);
                return 0;
            case 4:
                qw3Var.f465847g = aVar2.g(intValue);
                return 0;
            case 5:
                qw3Var.f465848h = aVar2.k(intValue);
                return 0;
            case 6:
                qw3Var.f465849i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

package r45;

/* loaded from: classes9.dex */
public class qg7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465510d;

    /* renamed from: e, reason: collision with root package name */
    public long f465511e;

    /* renamed from: f, reason: collision with root package name */
    public int f465512f;

    /* renamed from: g, reason: collision with root package name */
    public int f465513g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f465514h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f465515i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qg7)) {
            return false;
        }
        r45.qg7 qg7Var = (r45.qg7) fVar;
        return n51.f.a(this.f465510d, qg7Var.f465510d) && n51.f.a(java.lang.Long.valueOf(this.f465511e), java.lang.Long.valueOf(qg7Var.f465511e)) && n51.f.a(java.lang.Integer.valueOf(this.f465512f), java.lang.Integer.valueOf(qg7Var.f465512f)) && n51.f.a(java.lang.Integer.valueOf(this.f465513g), java.lang.Integer.valueOf(qg7Var.f465513g)) && n51.f.a(this.f465514h, qg7Var.f465514h) && n51.f.a(this.f465515i, qg7Var.f465515i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f465510d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f465511e);
            fVar.e(3, this.f465512f);
            fVar.e(4, this.f465513g);
            java.lang.String str2 = this.f465514h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f465515i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f465510d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.h(2, this.f465511e) + b36.f.e(3, this.f465512f) + b36.f.e(4, this.f465513g);
            java.lang.String str5 = this.f465514h;
            if (str5 != null) {
                j17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f465515i;
            return str6 != null ? j17 + b36.f.j(6, str6) : j17;
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
        r45.qg7 qg7Var = (r45.qg7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qg7Var.f465510d = aVar2.k(intValue);
                return 0;
            case 2:
                qg7Var.f465511e = aVar2.i(intValue);
                return 0;
            case 3:
                qg7Var.f465512f = aVar2.g(intValue);
                return 0;
            case 4:
                qg7Var.f465513g = aVar2.g(intValue);
                return 0;
            case 5:
                qg7Var.f465514h = aVar2.k(intValue);
                return 0;
            case 6:
                qg7Var.f465515i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

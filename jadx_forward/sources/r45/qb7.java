package r45;

/* loaded from: classes8.dex */
public class qb7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465345d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465346e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465347f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f465348g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f465349h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f465350i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qb7)) {
            return false;
        }
        r45.qb7 qb7Var = (r45.qb7) fVar;
        return n51.f.a(this.f465345d, qb7Var.f465345d) && n51.f.a(this.f465346e, qb7Var.f465346e) && n51.f.a(this.f465347f, qb7Var.f465347f) && n51.f.a(this.f465348g, qb7Var.f465348g) && n51.f.a(this.f465349h, qb7Var.f465349h) && n51.f.a(this.f465350i, qb7Var.f465350i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f465345d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f465346e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f465347f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f465348g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f465349h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f465350i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f465345d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f465346e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f465347f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f465348g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f465349h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f465350i;
            return str12 != null ? j17 + b36.f.j(6, str12) : j17;
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
        r45.qb7 qb7Var = (r45.qb7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qb7Var.f465345d = aVar2.k(intValue);
                return 0;
            case 2:
                qb7Var.f465346e = aVar2.k(intValue);
                return 0;
            case 3:
                qb7Var.f465347f = aVar2.k(intValue);
                return 0;
            case 4:
                qb7Var.f465348g = aVar2.k(intValue);
                return 0;
            case 5:
                qb7Var.f465349h = aVar2.k(intValue);
                return 0;
            case 6:
                qb7Var.f465350i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

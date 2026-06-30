package r45;

/* loaded from: classes7.dex */
public class jv5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f459664d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f459665e;

    /* renamed from: f, reason: collision with root package name */
    public int f459666f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f459667g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f459668h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f459669i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f459670m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jv5)) {
            return false;
        }
        r45.jv5 jv5Var = (r45.jv5) fVar;
        return n51.f.a(this.f459664d, jv5Var.f459664d) && n51.f.a(this.f459665e, jv5Var.f459665e) && n51.f.a(java.lang.Integer.valueOf(this.f459666f), java.lang.Integer.valueOf(jv5Var.f459666f)) && n51.f.a(this.f459667g, jv5Var.f459667g) && n51.f.a(this.f459668h, jv5Var.f459668h) && n51.f.a(this.f459669i, jv5Var.f459669i) && n51.f.a(this.f459670m, jv5Var.f459670m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f459664d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f459665e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f459666f);
            java.lang.String str3 = this.f459667g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f459668h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f459669i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f459670m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f459664d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f459665e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            int e17 = j17 + b36.f.e(3, this.f459666f);
            java.lang.String str9 = this.f459667g;
            if (str9 != null) {
                e17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f459668h;
            if (str10 != null) {
                e17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f459669i;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f459670m;
            return str12 != null ? e17 + b36.f.j(7, str12) : e17;
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
        r45.jv5 jv5Var = (r45.jv5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                jv5Var.f459664d = aVar2.k(intValue);
                return 0;
            case 2:
                jv5Var.f459665e = aVar2.k(intValue);
                return 0;
            case 3:
                jv5Var.f459666f = aVar2.g(intValue);
                return 0;
            case 4:
                jv5Var.f459667g = aVar2.k(intValue);
                return 0;
            case 5:
                jv5Var.f459668h = aVar2.k(intValue);
                return 0;
            case 6:
                jv5Var.f459669i = aVar2.k(intValue);
                return 0;
            case 7:
                jv5Var.f459670m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

package r45;

/* loaded from: classes9.dex */
public class il6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f458669d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f458670e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f458671f;

    /* renamed from: g, reason: collision with root package name */
    public float f458672g;

    /* renamed from: h, reason: collision with root package name */
    public float f458673h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f458674i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.il6)) {
            return false;
        }
        r45.il6 il6Var = (r45.il6) fVar;
        return n51.f.a(this.f458669d, il6Var.f458669d) && n51.f.a(this.f458670e, il6Var.f458670e) && n51.f.a(this.f458671f, il6Var.f458671f) && n51.f.a(java.lang.Float.valueOf(this.f458672g), java.lang.Float.valueOf(il6Var.f458672g)) && n51.f.a(java.lang.Float.valueOf(this.f458673h), java.lang.Float.valueOf(il6Var.f458673h)) && n51.f.a(this.f458674i, il6Var.f458674i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f458669d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f458670e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f458671f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.d(4, this.f458672g);
            fVar.d(5, this.f458673h);
            java.lang.String str4 = this.f458674i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f458669d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f458670e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f458671f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int d17 = j17 + b36.f.d(4, this.f458672g) + b36.f.d(5, this.f458673h);
            java.lang.String str8 = this.f458674i;
            return str8 != null ? d17 + b36.f.j(6, str8) : d17;
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
        r45.il6 il6Var = (r45.il6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                il6Var.f458669d = aVar2.k(intValue);
                return 0;
            case 2:
                il6Var.f458670e = aVar2.k(intValue);
                return 0;
            case 3:
                il6Var.f458671f = aVar2.k(intValue);
                return 0;
            case 4:
                il6Var.f458672g = aVar2.f(intValue);
                return 0;
            case 5:
                il6Var.f458673h = aVar2.f(intValue);
                return 0;
            case 6:
                il6Var.f458674i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

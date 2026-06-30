package r45;

/* loaded from: classes8.dex */
public class na7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f462745d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f462746e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f462747f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f462748g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f462749h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f462750i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.na7)) {
            return false;
        }
        r45.na7 na7Var = (r45.na7) fVar;
        return n51.f.a(this.f462745d, na7Var.f462745d) && n51.f.a(this.f462746e, na7Var.f462746e) && n51.f.a(this.f462747f, na7Var.f462747f) && n51.f.a(this.f462748g, na7Var.f462748g) && n51.f.a(this.f462749h, na7Var.f462749h) && n51.f.a(this.f462750i, na7Var.f462750i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f462745d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f462746e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f462747f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f462748g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f462749h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f462750i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f462745d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f462746e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f462747f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f462748g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f462749h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f462750i;
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
        r45.na7 na7Var = (r45.na7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                na7Var.f462745d = aVar2.k(intValue);
                return 0;
            case 2:
                na7Var.f462746e = aVar2.k(intValue);
                return 0;
            case 3:
                na7Var.f462747f = aVar2.k(intValue);
                return 0;
            case 4:
                na7Var.f462748g = aVar2.k(intValue);
                return 0;
            case 5:
                na7Var.f462749h = aVar2.k(intValue);
                return 0;
            case 6:
                na7Var.f462750i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

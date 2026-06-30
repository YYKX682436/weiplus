package r45;

/* loaded from: classes11.dex */
public class dn extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f454113d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f454114e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f454115f;

    /* renamed from: g, reason: collision with root package name */
    public int f454116g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f454117h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f454118i;

    /* renamed from: m, reason: collision with root package name */
    public int f454119m;

    /* renamed from: n, reason: collision with root package name */
    public int f454120n = 2;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dn)) {
            return false;
        }
        r45.dn dnVar = (r45.dn) fVar;
        return n51.f.a(this.f454113d, dnVar.f454113d) && n51.f.a(this.f454114e, dnVar.f454114e) && n51.f.a(this.f454115f, dnVar.f454115f) && n51.f.a(java.lang.Integer.valueOf(this.f454116g), java.lang.Integer.valueOf(dnVar.f454116g)) && n51.f.a(this.f454117h, dnVar.f454117h) && n51.f.a(this.f454118i, dnVar.f454118i) && n51.f.a(java.lang.Integer.valueOf(this.f454119m), java.lang.Integer.valueOf(dnVar.f454119m)) && n51.f.a(java.lang.Integer.valueOf(this.f454120n), java.lang.Integer.valueOf(dnVar.f454120n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f454113d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f454114e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f454115f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f454116g);
            java.lang.String str4 = this.f454117h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f454118i;
            if (gVar != null) {
                fVar.b(6, gVar);
            }
            fVar.e(7, this.f454119m);
            fVar.e(8, this.f454120n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f454113d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f454114e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f454115f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int e17 = j17 + b36.f.e(4, this.f454116g);
            java.lang.String str8 = this.f454117h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f454118i;
            if (gVar2 != null) {
                e17 += b36.f.b(6, gVar2);
            }
            return e17 + b36.f.e(7, this.f454119m) + b36.f.e(8, this.f454120n);
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
        r45.dn dnVar = (r45.dn) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                dnVar.f454113d = aVar2.k(intValue);
                return 0;
            case 2:
                dnVar.f454114e = aVar2.k(intValue);
                return 0;
            case 3:
                dnVar.f454115f = aVar2.k(intValue);
                return 0;
            case 4:
                dnVar.f454116g = aVar2.g(intValue);
                return 0;
            case 5:
                dnVar.f454117h = aVar2.k(intValue);
                return 0;
            case 6:
                dnVar.f454118i = aVar2.d(intValue);
                return 0;
            case 7:
                dnVar.f454119m = aVar2.g(intValue);
                return 0;
            case 8:
                dnVar.f454120n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

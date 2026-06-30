package r45;

/* loaded from: classes8.dex */
public class om extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f463881d;

    /* renamed from: e, reason: collision with root package name */
    public long f463882e;

    /* renamed from: f, reason: collision with root package name */
    public int f463883f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f463884g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f463885h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f463886i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f463887m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f463888n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f463889o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.om)) {
            return false;
        }
        r45.om omVar = (r45.om) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f463881d), java.lang.Long.valueOf(omVar.f463881d)) && n51.f.a(java.lang.Long.valueOf(this.f463882e), java.lang.Long.valueOf(omVar.f463882e)) && n51.f.a(java.lang.Integer.valueOf(this.f463883f), java.lang.Integer.valueOf(omVar.f463883f)) && n51.f.a(this.f463884g, omVar.f463884g) && n51.f.a(this.f463885h, omVar.f463885h) && n51.f.a(this.f463886i, omVar.f463886i) && n51.f.a(this.f463887m, omVar.f463887m) && n51.f.a(this.f463888n, omVar.f463888n) && n51.f.a(this.f463889o, omVar.f463889o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f463881d);
            fVar.h(2, this.f463882e);
            fVar.e(3, this.f463883f);
            java.lang.String str = this.f463884g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f463885h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f463886i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f463887m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f463888n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f463889o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f463881d) + 0 + b36.f.h(2, this.f463882e) + b36.f.e(3, this.f463883f);
            java.lang.String str7 = this.f463884g;
            if (str7 != null) {
                h17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f463885h;
            if (str8 != null) {
                h17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f463886i;
            if (str9 != null) {
                h17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f463887m;
            if (str10 != null) {
                h17 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f463888n;
            if (str11 != null) {
                h17 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f463889o;
            return str12 != null ? h17 + b36.f.j(9, str12) : h17;
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
        r45.om omVar = (r45.om) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                omVar.f463881d = aVar2.i(intValue);
                return 0;
            case 2:
                omVar.f463882e = aVar2.i(intValue);
                return 0;
            case 3:
                omVar.f463883f = aVar2.g(intValue);
                return 0;
            case 4:
                omVar.f463884g = aVar2.k(intValue);
                return 0;
            case 5:
                omVar.f463885h = aVar2.k(intValue);
                return 0;
            case 6:
                omVar.f463886i = aVar2.k(intValue);
                return 0;
            case 7:
                omVar.f463887m = aVar2.k(intValue);
                return 0;
            case 8:
                omVar.f463888n = aVar2.k(intValue);
                return 0;
            case 9:
                omVar.f463889o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

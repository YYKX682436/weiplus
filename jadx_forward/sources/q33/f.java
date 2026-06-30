package q33;

/* loaded from: classes8.dex */
public class f extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f441479d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f441480e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f441481f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f441482g;

    /* renamed from: h, reason: collision with root package name */
    public int f441483h;

    /* renamed from: i, reason: collision with root package name */
    public int f441484i;

    /* renamed from: m, reason: collision with root package name */
    public int f441485m;

    /* renamed from: n, reason: collision with root package name */
    public int f441486n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f441487o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f441488p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f441489q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof q33.f)) {
            return false;
        }
        q33.f fVar2 = (q33.f) fVar;
        return n51.f.a(this.f441479d, fVar2.f441479d) && n51.f.a(this.f441480e, fVar2.f441480e) && n51.f.a(this.f441481f, fVar2.f441481f) && n51.f.a(this.f441482g, fVar2.f441482g) && n51.f.a(java.lang.Integer.valueOf(this.f441483h), java.lang.Integer.valueOf(fVar2.f441483h)) && n51.f.a(java.lang.Integer.valueOf(this.f441484i), java.lang.Integer.valueOf(fVar2.f441484i)) && n51.f.a(java.lang.Integer.valueOf(this.f441485m), java.lang.Integer.valueOf(fVar2.f441485m)) && n51.f.a(java.lang.Integer.valueOf(this.f441486n), java.lang.Integer.valueOf(fVar2.f441486n)) && n51.f.a(this.f441487o, fVar2.f441487o) && n51.f.a(this.f441488p, fVar2.f441488p) && n51.f.a(this.f441489q, fVar2.f441489q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f441479d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f441480e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f441481f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f441482g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f441483h);
            fVar.e(6, this.f441484i);
            fVar.e(7, this.f441485m);
            fVar.e(8, this.f441486n);
            java.lang.String str5 = this.f441487o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f441488p;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f441489q;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f441479d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f441480e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f441481f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f441482g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            int e17 = j17 + b36.f.e(5, this.f441483h) + b36.f.e(6, this.f441484i) + b36.f.e(7, this.f441485m) + b36.f.e(8, this.f441486n);
            java.lang.String str12 = this.f441487o;
            if (str12 != null) {
                e17 += b36.f.j(9, str12);
            }
            java.lang.String str13 = this.f441488p;
            if (str13 != null) {
                e17 += b36.f.j(10, str13);
            }
            java.lang.String str14 = this.f441489q;
            return str14 != null ? e17 + b36.f.j(11, str14) : e17;
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
        q33.f fVar2 = (q33.f) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                fVar2.f441479d = aVar2.k(intValue);
                return 0;
            case 2:
                fVar2.f441480e = aVar2.k(intValue);
                return 0;
            case 3:
                fVar2.f441481f = aVar2.k(intValue);
                return 0;
            case 4:
                fVar2.f441482g = aVar2.k(intValue);
                return 0;
            case 5:
                fVar2.f441483h = aVar2.g(intValue);
                return 0;
            case 6:
                fVar2.f441484i = aVar2.g(intValue);
                return 0;
            case 7:
                fVar2.f441485m = aVar2.g(intValue);
                return 0;
            case 8:
                fVar2.f441486n = aVar2.g(intValue);
                return 0;
            case 9:
                fVar2.f441487o = aVar2.k(intValue);
                return 0;
            case 10:
                fVar2.f441488p = aVar2.k(intValue);
                return 0;
            case 11:
                fVar2.f441489q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

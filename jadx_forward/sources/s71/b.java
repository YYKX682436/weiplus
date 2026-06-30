package s71;

/* loaded from: classes12.dex */
public class b extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f485503d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f485504e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f485505f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f485506g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f485507h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f485508i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f485509m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f485510n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f485511o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f485512p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f485513q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f485514r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof s71.b)) {
            return false;
        }
        s71.b bVar = (s71.b) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f485503d), java.lang.Integer.valueOf(bVar.f485503d)) && n51.f.a(this.f485504e, bVar.f485504e) && n51.f.a(this.f485505f, bVar.f485505f) && n51.f.a(this.f485506g, bVar.f485506g) && n51.f.a(this.f485507h, bVar.f485507h) && n51.f.a(this.f485508i, bVar.f485508i) && n51.f.a(this.f485509m, bVar.f485509m) && n51.f.a(this.f485510n, bVar.f485510n) && n51.f.a(this.f485511o, bVar.f485511o) && n51.f.a(this.f485512p, bVar.f485512p) && n51.f.a(this.f485513q, bVar.f485513q) && n51.f.a(this.f485514r, bVar.f485514r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f485503d);
            java.lang.String str = this.f485504e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f485505f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f485506g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f485507h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f485508i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f485509m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f485510n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f485511o;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            java.lang.String str9 = this.f485512p;
            if (str9 != null) {
                fVar.j(10, str9);
            }
            java.lang.String str10 = this.f485513q;
            if (str10 != null) {
                fVar.j(11, str10);
            }
            java.lang.String str11 = this.f485514r;
            if (str11 != null) {
                fVar.j(12, str11);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f485503d) + 0;
            java.lang.String str12 = this.f485504e;
            if (str12 != null) {
                e17 += b36.f.j(2, str12);
            }
            java.lang.String str13 = this.f485505f;
            if (str13 != null) {
                e17 += b36.f.j(3, str13);
            }
            java.lang.String str14 = this.f485506g;
            if (str14 != null) {
                e17 += b36.f.j(4, str14);
            }
            java.lang.String str15 = this.f485507h;
            if (str15 != null) {
                e17 += b36.f.j(5, str15);
            }
            java.lang.String str16 = this.f485508i;
            if (str16 != null) {
                e17 += b36.f.j(6, str16);
            }
            java.lang.String str17 = this.f485509m;
            if (str17 != null) {
                e17 += b36.f.j(7, str17);
            }
            java.lang.String str18 = this.f485510n;
            if (str18 != null) {
                e17 += b36.f.j(8, str18);
            }
            java.lang.String str19 = this.f485511o;
            if (str19 != null) {
                e17 += b36.f.j(9, str19);
            }
            java.lang.String str20 = this.f485512p;
            if (str20 != null) {
                e17 += b36.f.j(10, str20);
            }
            java.lang.String str21 = this.f485513q;
            if (str21 != null) {
                e17 += b36.f.j(11, str21);
            }
            java.lang.String str22 = this.f485514r;
            return str22 != null ? e17 + b36.f.j(12, str22) : e17;
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
        s71.b bVar = (s71.b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bVar.f485503d = aVar2.g(intValue);
                return 0;
            case 2:
                bVar.f485504e = aVar2.k(intValue);
                return 0;
            case 3:
                bVar.f485505f = aVar2.k(intValue);
                return 0;
            case 4:
                bVar.f485506g = aVar2.k(intValue);
                return 0;
            case 5:
                bVar.f485507h = aVar2.k(intValue);
                return 0;
            case 6:
                bVar.f485508i = aVar2.k(intValue);
                return 0;
            case 7:
                bVar.f485509m = aVar2.k(intValue);
                return 0;
            case 8:
                bVar.f485510n = aVar2.k(intValue);
                return 0;
            case 9:
                bVar.f485511o = aVar2.k(intValue);
                return 0;
            case 10:
                bVar.f485512p = aVar2.k(intValue);
                return 0;
            case 11:
                bVar.f485513q = aVar2.k(intValue);
                return 0;
            case 12:
                bVar.f485514r = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

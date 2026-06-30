package r45;

/* loaded from: classes4.dex */
public class nu extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f463205d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f463206e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f463207f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f463208g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f463209h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f463210i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f463211m;

    /* renamed from: n, reason: collision with root package name */
    public float f463212n;

    /* renamed from: o, reason: collision with root package name */
    public float f463213o;

    /* renamed from: p, reason: collision with root package name */
    public float f463214p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f463215q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f463216r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f463217s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nu)) {
            return false;
        }
        r45.nu nuVar = (r45.nu) fVar;
        return n51.f.a(this.f463205d, nuVar.f463205d) && n51.f.a(this.f463206e, nuVar.f463206e) && n51.f.a(this.f463207f, nuVar.f463207f) && n51.f.a(this.f463208g, nuVar.f463208g) && n51.f.a(this.f463209h, nuVar.f463209h) && n51.f.a(this.f463210i, nuVar.f463210i) && n51.f.a(this.f463211m, nuVar.f463211m) && n51.f.a(java.lang.Float.valueOf(this.f463212n), java.lang.Float.valueOf(nuVar.f463212n)) && n51.f.a(java.lang.Float.valueOf(this.f463213o), java.lang.Float.valueOf(nuVar.f463213o)) && n51.f.a(java.lang.Float.valueOf(this.f463214p), java.lang.Float.valueOf(nuVar.f463214p)) && n51.f.a(this.f463215q, nuVar.f463215q) && n51.f.a(this.f463216r, nuVar.f463216r) && n51.f.a(this.f463217s, nuVar.f463217s);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f463205d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f463206e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f463207f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f463208g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f463209h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f463210i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f463211m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            fVar.d(8, this.f463212n);
            fVar.d(9, this.f463213o);
            fVar.d(10, this.f463214p);
            java.lang.String str8 = this.f463215q;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            java.lang.String str9 = this.f463216r;
            if (str9 != null) {
                fVar.j(12, str9);
            }
            java.lang.String str10 = this.f463217s;
            if (str10 == null) {
                return 0;
            }
            fVar.j(13, str10);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str11 = this.f463205d;
            int j17 = str11 != null ? 0 + b36.f.j(1, str11) : 0;
            java.lang.String str12 = this.f463206e;
            if (str12 != null) {
                j17 += b36.f.j(2, str12);
            }
            java.lang.String str13 = this.f463207f;
            if (str13 != null) {
                j17 += b36.f.j(3, str13);
            }
            java.lang.String str14 = this.f463208g;
            if (str14 != null) {
                j17 += b36.f.j(4, str14);
            }
            java.lang.String str15 = this.f463209h;
            if (str15 != null) {
                j17 += b36.f.j(5, str15);
            }
            java.lang.String str16 = this.f463210i;
            if (str16 != null) {
                j17 += b36.f.j(6, str16);
            }
            java.lang.String str17 = this.f463211m;
            if (str17 != null) {
                j17 += b36.f.j(7, str17);
            }
            int d17 = j17 + b36.f.d(8, this.f463212n) + b36.f.d(9, this.f463213o) + b36.f.d(10, this.f463214p);
            java.lang.String str18 = this.f463215q;
            if (str18 != null) {
                d17 += b36.f.j(11, str18);
            }
            java.lang.String str19 = this.f463216r;
            if (str19 != null) {
                d17 += b36.f.j(12, str19);
            }
            java.lang.String str20 = this.f463217s;
            return str20 != null ? d17 + b36.f.j(13, str20) : d17;
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
        r45.nu nuVar = (r45.nu) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                nuVar.f463205d = aVar2.k(intValue);
                return 0;
            case 2:
                nuVar.f463206e = aVar2.k(intValue);
                return 0;
            case 3:
                nuVar.f463207f = aVar2.k(intValue);
                return 0;
            case 4:
                nuVar.f463208g = aVar2.k(intValue);
                return 0;
            case 5:
                nuVar.f463209h = aVar2.k(intValue);
                return 0;
            case 6:
                nuVar.f463210i = aVar2.k(intValue);
                return 0;
            case 7:
                nuVar.f463211m = aVar2.k(intValue);
                return 0;
            case 8:
                nuVar.f463212n = aVar2.f(intValue);
                return 0;
            case 9:
                nuVar.f463213o = aVar2.f(intValue);
                return 0;
            case 10:
                nuVar.f463214p = aVar2.f(intValue);
                return 0;
            case 11:
                nuVar.f463215q = aVar2.k(intValue);
                return 0;
            case 12:
                nuVar.f463216r = aVar2.k(intValue);
                return 0;
            case 13:
                nuVar.f463217s = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

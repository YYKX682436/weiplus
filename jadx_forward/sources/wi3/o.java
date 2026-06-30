package wi3;

/* loaded from: classes4.dex */
public class o extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public java.lang.String A;
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g B;
    public final java.util.LinkedList C = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public long f527768d;

    /* renamed from: e, reason: collision with root package name */
    public int f527769e;

    /* renamed from: f, reason: collision with root package name */
    public int f527770f;

    /* renamed from: g, reason: collision with root package name */
    public long f527771g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f527772h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f527773i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f527774m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f527775n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f527776o;

    /* renamed from: p, reason: collision with root package name */
    public long f527777p;

    /* renamed from: q, reason: collision with root package name */
    public int f527778q;

    /* renamed from: r, reason: collision with root package name */
    public int f527779r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f527780s;

    /* renamed from: t, reason: collision with root package name */
    public int f527781t;

    /* renamed from: u, reason: collision with root package name */
    public int f527782u;

    /* renamed from: v, reason: collision with root package name */
    public int f527783v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f527784w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f527785x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f527786y;

    /* renamed from: z, reason: collision with root package name */
    public int f527787z;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof wi3.o)) {
            return false;
        }
        wi3.o oVar = (wi3.o) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f527768d), java.lang.Long.valueOf(oVar.f527768d)) && n51.f.a(java.lang.Integer.valueOf(this.f527769e), java.lang.Integer.valueOf(oVar.f527769e)) && n51.f.a(java.lang.Integer.valueOf(this.f527770f), java.lang.Integer.valueOf(oVar.f527770f)) && n51.f.a(java.lang.Long.valueOf(this.f527771g), java.lang.Long.valueOf(oVar.f527771g)) && n51.f.a(this.f527772h, oVar.f527772h) && n51.f.a(this.f527773i, oVar.f527773i) && n51.f.a(this.f527774m, oVar.f527774m) && n51.f.a(this.f527775n, oVar.f527775n) && n51.f.a(this.f527776o, oVar.f527776o) && n51.f.a(java.lang.Long.valueOf(this.f527777p), java.lang.Long.valueOf(oVar.f527777p)) && n51.f.a(java.lang.Integer.valueOf(this.f527778q), java.lang.Integer.valueOf(oVar.f527778q)) && n51.f.a(java.lang.Integer.valueOf(this.f527779r), java.lang.Integer.valueOf(oVar.f527779r)) && n51.f.a(this.f527780s, oVar.f527780s) && n51.f.a(java.lang.Integer.valueOf(this.f527781t), java.lang.Integer.valueOf(oVar.f527781t)) && n51.f.a(java.lang.Integer.valueOf(this.f527782u), java.lang.Integer.valueOf(oVar.f527782u)) && n51.f.a(java.lang.Integer.valueOf(this.f527783v), java.lang.Integer.valueOf(oVar.f527783v)) && n51.f.a(this.f527784w, oVar.f527784w) && n51.f.a(this.f527785x, oVar.f527785x) && n51.f.a(this.f527786y, oVar.f527786y) && n51.f.a(java.lang.Integer.valueOf(this.f527787z), java.lang.Integer.valueOf(oVar.f527787z)) && n51.f.a(this.A, oVar.A) && n51.f.a(this.B, oVar.B) && n51.f.a(this.C, oVar.C);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.C;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f527768d);
            fVar.e(2, this.f527769e);
            fVar.e(3, this.f527770f);
            fVar.h(4, this.f527771g);
            java.lang.String str = this.f527772h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f527773i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f527774m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f527775n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f527776o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.h(10, this.f527777p);
            fVar.e(11, this.f527778q);
            fVar.e(12, this.f527779r);
            java.lang.String str6 = this.f527780s;
            if (str6 != null) {
                fVar.j(13, str6);
            }
            fVar.e(14, this.f527781t);
            fVar.e(15, this.f527782u);
            fVar.e(16, this.f527783v);
            java.lang.String str7 = this.f527784w;
            if (str7 != null) {
                fVar.j(17, str7);
            }
            java.lang.String str8 = this.f527785x;
            if (str8 != null) {
                fVar.j(18, str8);
            }
            java.lang.String str9 = this.f527786y;
            if (str9 != null) {
                fVar.j(19, str9);
            }
            fVar.e(20, this.f527787z);
            java.lang.String str10 = this.A;
            if (str10 != null) {
                fVar.j(21, str10);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.B;
            if (gVar != null) {
                fVar.b(22, gVar);
            }
            fVar.g(23, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f527768d) + 0 + b36.f.e(2, this.f527769e) + b36.f.e(3, this.f527770f) + b36.f.h(4, this.f527771g);
            java.lang.String str11 = this.f527772h;
            if (str11 != null) {
                h17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f527773i;
            if (str12 != null) {
                h17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f527774m;
            if (str13 != null) {
                h17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f527775n;
            if (str14 != null) {
                h17 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f527776o;
            if (str15 != null) {
                h17 += b36.f.j(9, str15);
            }
            int h18 = h17 + b36.f.h(10, this.f527777p) + b36.f.e(11, this.f527778q) + b36.f.e(12, this.f527779r);
            java.lang.String str16 = this.f527780s;
            if (str16 != null) {
                h18 += b36.f.j(13, str16);
            }
            int e17 = h18 + b36.f.e(14, this.f527781t) + b36.f.e(15, this.f527782u) + b36.f.e(16, this.f527783v);
            java.lang.String str17 = this.f527784w;
            if (str17 != null) {
                e17 += b36.f.j(17, str17);
            }
            java.lang.String str18 = this.f527785x;
            if (str18 != null) {
                e17 += b36.f.j(18, str18);
            }
            java.lang.String str19 = this.f527786y;
            if (str19 != null) {
                e17 += b36.f.j(19, str19);
            }
            int e18 = e17 + b36.f.e(20, this.f527787z);
            java.lang.String str20 = this.A;
            if (str20 != null) {
                e18 += b36.f.j(21, str20);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.B;
            if (gVar2 != null) {
                e18 += b36.f.b(22, gVar2);
            }
            return e18 + b36.f.g(23, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        wi3.o oVar = (wi3.o) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                oVar.f527768d = aVar2.i(intValue);
                return 0;
            case 2:
                oVar.f527769e = aVar2.g(intValue);
                return 0;
            case 3:
                oVar.f527770f = aVar2.g(intValue);
                return 0;
            case 4:
                oVar.f527771g = aVar2.i(intValue);
                return 0;
            case 5:
                oVar.f527772h = aVar2.k(intValue);
                return 0;
            case 6:
                oVar.f527773i = aVar2.k(intValue);
                return 0;
            case 7:
                oVar.f527774m = aVar2.k(intValue);
                return 0;
            case 8:
                oVar.f527775n = aVar2.k(intValue);
                return 0;
            case 9:
                oVar.f527776o = aVar2.k(intValue);
                return 0;
            case 10:
                oVar.f527777p = aVar2.i(intValue);
                return 0;
            case 11:
                oVar.f527778q = aVar2.g(intValue);
                return 0;
            case 12:
                oVar.f527779r = aVar2.g(intValue);
                return 0;
            case 13:
                oVar.f527780s = aVar2.k(intValue);
                return 0;
            case 14:
                oVar.f527781t = aVar2.g(intValue);
                return 0;
            case 15:
                oVar.f527782u = aVar2.g(intValue);
                return 0;
            case 16:
                oVar.f527783v = aVar2.g(intValue);
                return 0;
            case 17:
                oVar.f527784w = aVar2.k(intValue);
                return 0;
            case 18:
                oVar.f527785x = aVar2.k(intValue);
                return 0;
            case 19:
                oVar.f527786y = aVar2.k(intValue);
                return 0;
            case 20:
                oVar.f527787z = aVar2.g(intValue);
                return 0;
            case 21:
                oVar.A = aVar2.k(intValue);
                return 0;
            case 22:
                oVar.B = aVar2.d(intValue);
                return 0;
            case 23:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    wi3.a aVar3 = new wi3.a();
                    if (bArr2 != null && bArr2.length > 0) {
                        aVar3.mo11468x92b714fd(bArr2);
                    }
                    oVar.C.add(aVar3);
                }
                return 0;
            default:
                return -1;
        }
    }
}

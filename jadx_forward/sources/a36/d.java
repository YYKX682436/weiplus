package a36;

/* loaded from: classes9.dex */
public class d extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f82649d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f82650e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f82651f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f82652g;

    /* renamed from: h, reason: collision with root package name */
    public long f82653h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f82654i;

    /* renamed from: m, reason: collision with root package name */
    public int f82655m;

    /* renamed from: n, reason: collision with root package name */
    public a36.h f82656n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f82657o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f82658p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f82659q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof a36.d)) {
            return false;
        }
        a36.d dVar = (a36.d) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f82649d), java.lang.Integer.valueOf(dVar.f82649d)) && n51.f.a(this.f82650e, dVar.f82650e) && n51.f.a(this.f82651f, dVar.f82651f) && n51.f.a(this.f82652g, dVar.f82652g) && n51.f.a(java.lang.Long.valueOf(this.f82653h), java.lang.Long.valueOf(dVar.f82653h)) && n51.f.a(this.f82654i, dVar.f82654i) && n51.f.a(java.lang.Integer.valueOf(this.f82655m), java.lang.Integer.valueOf(dVar.f82655m)) && n51.f.a(this.f82656n, dVar.f82656n) && n51.f.a(this.f82657o, dVar.f82657o) && n51.f.a(this.f82658p, dVar.f82658p) && n51.f.a(this.f82659q, dVar.f82659q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f82649d);
            java.lang.String str = this.f82650e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f82651f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f82652g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.h(6, this.f82653h);
            java.lang.String str4 = this.f82654i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f82655m);
            a36.h hVar = this.f82656n;
            if (hVar != null) {
                fVar.i(9, hVar.mo75928xcd1e8d8());
                this.f82656n.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str5 = this.f82657o;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f82658p;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            java.lang.String str7 = this.f82659q;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f82649d) + 0;
            java.lang.String str8 = this.f82650e;
            if (str8 != null) {
                e17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f82651f;
            if (str9 != null) {
                e17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f82652g;
            if (str10 != null) {
                e17 += b36.f.j(5, str10);
            }
            int h17 = e17 + b36.f.h(6, this.f82653h);
            java.lang.String str11 = this.f82654i;
            if (str11 != null) {
                h17 += b36.f.j(7, str11);
            }
            int e18 = h17 + b36.f.e(8, this.f82655m);
            a36.h hVar2 = this.f82656n;
            if (hVar2 != null) {
                e18 += b36.f.i(9, hVar2.mo75928xcd1e8d8());
            }
            java.lang.String str12 = this.f82657o;
            if (str12 != null) {
                e18 += b36.f.j(10, str12);
            }
            java.lang.String str13 = this.f82658p;
            if (str13 != null) {
                e18 += b36.f.j(11, str13);
            }
            java.lang.String str14 = this.f82659q;
            return str14 != null ? e18 + b36.f.j(12, str14) : e18;
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
        a36.d dVar = (a36.d) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                dVar.f82649d = aVar2.g(intValue);
                return 0;
            case 2:
                dVar.f82650e = aVar2.k(intValue);
                return 0;
            case 3:
                dVar.f82651f = aVar2.k(intValue);
                return 0;
            case 4:
            default:
                return -1;
            case 5:
                dVar.f82652g = aVar2.k(intValue);
                return 0;
            case 6:
                dVar.f82653h = aVar2.i(intValue);
                return 0;
            case 7:
                dVar.f82654i = aVar2.k(intValue);
                return 0;
            case 8:
                dVar.f82655m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    a36.h hVar3 = new a36.h();
                    if (bArr != null && bArr.length > 0) {
                        hVar3.mo11468x92b714fd(bArr);
                    }
                    dVar.f82656n = hVar3;
                }
                return 0;
            case 10:
                dVar.f82657o = aVar2.k(intValue);
                return 0;
            case 11:
                dVar.f82658p = aVar2.k(intValue);
                return 0;
            case 12:
                dVar.f82659q = aVar2.k(intValue);
                return 0;
        }
    }
}

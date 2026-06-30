package bw5;

/* loaded from: classes2.dex */
public class my extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f111943d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f111944e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f111945f;

    /* renamed from: g, reason: collision with root package name */
    public int f111946g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f111947h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f111948i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f111949m;

    /* renamed from: n, reason: collision with root package name */
    public int f111950n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f111951o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f111952p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.ly f111953q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f111954r = new boolean[12];

    static {
        new bw5.my();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.my mo11468x92b714fd(byte[] bArr) {
        return (bw5.my) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.my)) {
            return false;
        }
        bw5.my myVar = (bw5.my) fVar;
        return n51.f.a(this.f111943d, myVar.f111943d) && n51.f.a(this.f111944e, myVar.f111944e) && n51.f.a(this.f111945f, myVar.f111945f) && n51.f.a(java.lang.Integer.valueOf(this.f111946g), java.lang.Integer.valueOf(myVar.f111946g)) && n51.f.a(this.f111947h, myVar.f111947h) && n51.f.a(this.f111948i, myVar.f111948i) && n51.f.a(this.f111949m, myVar.f111949m) && n51.f.a(java.lang.Integer.valueOf(this.f111950n), java.lang.Integer.valueOf(myVar.f111950n)) && n51.f.a(this.f111951o, myVar.f111951o) && n51.f.a(this.f111952p, myVar.f111952p) && n51.f.a(this.f111953q, myVar.f111953q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.my();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f111954r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f111943d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f111944e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f111945f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f111946g);
            }
            java.lang.String str4 = this.f111947h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f111948i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f111949m;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            if (zArr[8]) {
                fVar.e(8, this.f111950n);
            }
            java.lang.String str7 = this.f111951o;
            if (str7 != null && zArr[9]) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f111952p;
            if (str8 != null && zArr[10]) {
                fVar.j(10, str8);
            }
            bw5.ly lyVar = this.f111953q;
            if (lyVar != null && zArr[11]) {
                fVar.i(11, lyVar.mo75928xcd1e8d8());
                this.f111953q.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f111943d;
            if (str9 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str9);
            }
            java.lang.String str10 = this.f111944e;
            if (str10 != null && zArr[2]) {
                i18 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f111945f;
            if (str11 != null && zArr[3]) {
                i18 += b36.f.j(3, str11);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f111946g);
            }
            java.lang.String str12 = this.f111947h;
            if (str12 != null && zArr[5]) {
                i18 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f111948i;
            if (str13 != null && zArr[6]) {
                i18 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f111949m;
            if (str14 != null && zArr[7]) {
                i18 += b36.f.j(7, str14);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f111950n);
            }
            java.lang.String str15 = this.f111951o;
            if (str15 != null && zArr[9]) {
                i18 += b36.f.j(9, str15);
            }
            java.lang.String str16 = this.f111952p;
            if (str16 != null && zArr[10]) {
                i18 += b36.f.j(10, str16);
            }
            bw5.ly lyVar2 = this.f111953q;
            return (lyVar2 == null || !zArr[11]) ? i18 : i18 + b36.f.i(11, lyVar2.mo75928xcd1e8d8());
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f111943d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f111944e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f111945f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f111946g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f111947h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f111948i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f111949m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f111950n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f111951o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f111952p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.ly lyVar3 = new bw5.ly();
                    if (bArr != null && bArr.length > 0) {
                        lyVar3.mo11468x92b714fd(bArr);
                    }
                    this.f111953q = lyVar3;
                }
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}

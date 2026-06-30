package bw5;

/* loaded from: classes2.dex */
public class hj extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f109758d;

    /* renamed from: e, reason: collision with root package name */
    public int f109759e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f109760f;

    /* renamed from: g, reason: collision with root package name */
    public long f109761g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f109762h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f109763i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f109764m;

    /* renamed from: n, reason: collision with root package name */
    public int f109765n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f109766o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f109767p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f109768q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f109769r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f109770s = new boolean[13];

    static {
        new bw5.hj();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.hj mo11468x92b714fd(byte[] bArr) {
        return (bw5.hj) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hj)) {
            return false;
        }
        bw5.hj hjVar = (bw5.hj) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f109758d), java.lang.Integer.valueOf(hjVar.f109758d)) && n51.f.a(java.lang.Integer.valueOf(this.f109759e), java.lang.Integer.valueOf(hjVar.f109759e)) && n51.f.a(this.f109760f, hjVar.f109760f) && n51.f.a(java.lang.Long.valueOf(this.f109761g), java.lang.Long.valueOf(hjVar.f109761g)) && n51.f.a(this.f109762h, hjVar.f109762h) && n51.f.a(this.f109763i, hjVar.f109763i) && n51.f.a(this.f109764m, hjVar.f109764m) && n51.f.a(java.lang.Integer.valueOf(this.f109765n), java.lang.Integer.valueOf(hjVar.f109765n)) && n51.f.a(this.f109766o, hjVar.f109766o) && n51.f.a(this.f109767p, hjVar.f109767p) && n51.f.a(this.f109768q, hjVar.f109768q) && n51.f.a(this.f109769r, hjVar.f109769r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.hj();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f109770s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f109758d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f109759e);
            }
            java.lang.String str = this.f109760f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.h(4, this.f109761g);
            }
            java.lang.String str2 = this.f109762h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f109763i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f109764m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            if (zArr[8]) {
                fVar.e(8, this.f109765n);
            }
            java.lang.String str5 = this.f109766o;
            if (str5 != null && zArr[9]) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f109767p;
            if (str6 != null && zArr[10]) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f109768q;
            if (str7 != null && zArr[11]) {
                fVar.j(11, str7);
            }
            java.lang.String str8 = this.f109769r;
            if (str8 == null || !zArr[12]) {
                return 0;
            }
            fVar.j(12, str8);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f109758d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f109759e);
            }
            java.lang.String str9 = this.f109760f;
            if (str9 != null && zArr[3]) {
                e17 += b36.f.j(3, str9);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f109761g);
            }
            java.lang.String str10 = this.f109762h;
            if (str10 != null && zArr[5]) {
                e17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f109763i;
            if (str11 != null && zArr[6]) {
                e17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f109764m;
            if (str12 != null && zArr[7]) {
                e17 += b36.f.j(7, str12);
            }
            if (zArr[8]) {
                e17 += b36.f.e(8, this.f109765n);
            }
            java.lang.String str13 = this.f109766o;
            if (str13 != null && zArr[9]) {
                e17 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f109767p;
            if (str14 != null && zArr[10]) {
                e17 += b36.f.j(10, str14);
            }
            java.lang.String str15 = this.f109768q;
            if (str15 != null && zArr[11]) {
                e17 += b36.f.j(11, str15);
            }
            java.lang.String str16 = this.f109769r;
            return (str16 == null || !zArr[12]) ? e17 : e17 + b36.f.j(12, str16);
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
                this.f109758d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f109759e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f109760f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f109761g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f109762h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f109763i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f109764m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f109765n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f109766o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f109767p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f109768q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f109769r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}

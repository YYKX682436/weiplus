package bw5;

/* loaded from: classes2.dex */
public class gc extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f109317d;

    /* renamed from: e, reason: collision with root package name */
    public int f109318e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f109319f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f109320g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f109321h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f109322i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f109323m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f109324n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f109325o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f109326p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f109327q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f109328r = new boolean[12];

    static {
        new bw5.gc();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.gc mo11468x92b714fd(byte[] bArr) {
        return (bw5.gc) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gc)) {
            return false;
        }
        bw5.gc gcVar = (bw5.gc) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f109317d), java.lang.Integer.valueOf(gcVar.f109317d)) && n51.f.a(java.lang.Integer.valueOf(this.f109318e), java.lang.Integer.valueOf(gcVar.f109318e)) && n51.f.a(this.f109319f, gcVar.f109319f) && n51.f.a(this.f109320g, gcVar.f109320g) && n51.f.a(this.f109321h, gcVar.f109321h) && n51.f.a(this.f109322i, gcVar.f109322i) && n51.f.a(this.f109323m, gcVar.f109323m) && n51.f.a(this.f109324n, gcVar.f109324n) && n51.f.a(this.f109325o, gcVar.f109325o) && n51.f.a(java.lang.Boolean.valueOf(this.f109326p), java.lang.Boolean.valueOf(gcVar.f109326p)) && n51.f.a(this.f109327q, gcVar.f109327q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.gc();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f109328r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f109317d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f109318e);
            }
            java.lang.String str = this.f109319f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f109320g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f109321h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f109322i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f109323m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f109324n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f109325o;
            if (str7 != null && zArr[9]) {
                fVar.j(9, str7);
            }
            if (zArr[10]) {
                fVar.a(10, this.f109326p);
            }
            java.lang.String str8 = this.f109327q;
            if (str8 != null && zArr[11]) {
                fVar.j(11, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f109317d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f109318e);
            }
            java.lang.String str9 = this.f109319f;
            if (str9 != null && zArr[3]) {
                e17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f109320g;
            if (str10 != null && zArr[4]) {
                e17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f109321h;
            if (str11 != null && zArr[5]) {
                e17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f109322i;
            if (str12 != null && zArr[6]) {
                e17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f109323m;
            if (str13 != null && zArr[7]) {
                e17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f109324n;
            if (str14 != null && zArr[8]) {
                e17 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f109325o;
            if (str15 != null && zArr[9]) {
                e17 += b36.f.j(9, str15);
            }
            if (zArr[10]) {
                e17 += b36.f.a(10, this.f109326p);
            }
            java.lang.String str16 = this.f109327q;
            return (str16 == null || !zArr[11]) ? e17 : e17 + b36.f.j(11, str16);
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
                this.f109317d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f109318e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f109319f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f109320g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f109321h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f109322i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f109323m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f109324n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f109325o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f109326p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f109327q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}

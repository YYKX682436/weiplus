package bw5;

/* loaded from: classes2.dex */
public class fn extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f108908d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f108909e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f108910f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f108911g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f108912h;

    /* renamed from: i, reason: collision with root package name */
    public int f108913i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f108914m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f108915n;

    /* renamed from: o, reason: collision with root package name */
    public int f108916o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f108917p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f108918q = new boolean[14];

    static {
        new bw5.fn();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fn mo11468x92b714fd(byte[] bArr) {
        return (bw5.fn) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fn)) {
            return false;
        }
        bw5.fn fnVar = (bw5.fn) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f108908d), java.lang.Integer.valueOf(fnVar.f108908d)) && n51.f.a(this.f108909e, fnVar.f108909e) && n51.f.a(this.f108910f, fnVar.f108910f) && n51.f.a(this.f108911g, fnVar.f108911g) && n51.f.a(this.f108912h, fnVar.f108912h) && n51.f.a(java.lang.Integer.valueOf(this.f108913i), java.lang.Integer.valueOf(fnVar.f108913i)) && n51.f.a(this.f108914m, fnVar.f108914m) && n51.f.a(this.f108915n, fnVar.f108915n) && n51.f.a(java.lang.Integer.valueOf(this.f108916o), java.lang.Integer.valueOf(fnVar.f108916o)) && n51.f.a(this.f108917p, fnVar.f108917p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.fn();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f108918q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f108908d);
            }
            java.lang.String str = this.f108909e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f108910f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f108911g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f108912h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            if (zArr[6]) {
                fVar.e(6, this.f108913i);
            }
            java.lang.String str5 = this.f108914m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f108915n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            if (zArr[10]) {
                fVar.e(10, this.f108916o);
            }
            java.lang.String str7 = this.f108917p;
            if (str7 != null && zArr[13]) {
                fVar.j(13, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f108908d) : 0;
            java.lang.String str8 = this.f108909e;
            if (str8 != null && zArr[2]) {
                e17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f108910f;
            if (str9 != null && zArr[3]) {
                e17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f108911g;
            if (str10 != null && zArr[4]) {
                e17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f108912h;
            if (str11 != null && zArr[5]) {
                e17 += b36.f.j(5, str11);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f108913i);
            }
            java.lang.String str12 = this.f108914m;
            if (str12 != null && zArr[7]) {
                e17 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f108915n;
            if (str13 != null && zArr[8]) {
                e17 += b36.f.j(8, str13);
            }
            if (zArr[10]) {
                e17 += b36.f.e(10, this.f108916o);
            }
            java.lang.String str14 = this.f108917p;
            return (str14 == null || !zArr[13]) ? e17 : e17 + b36.f.j(13, str14);
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
        if (intValue == 10) {
            this.f108916o = aVar2.g(intValue);
            zArr[10] = true;
            return 0;
        }
        if (intValue == 13) {
            this.f108917p = aVar2.k(intValue);
            zArr[13] = true;
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f108908d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f108909e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f108910f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f108911g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f108912h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f108913i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f108914m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f108915n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}

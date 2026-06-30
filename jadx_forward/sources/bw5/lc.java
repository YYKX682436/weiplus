package bw5;

/* loaded from: classes2.dex */
public class lc extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f111258d;

    /* renamed from: e, reason: collision with root package name */
    public int f111259e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f111260f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.ae f111261g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f111262h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f111263i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f111264m;

    /* renamed from: n, reason: collision with root package name */
    public int f111265n;

    /* renamed from: o, reason: collision with root package name */
    public int f111266o;

    /* renamed from: p, reason: collision with root package name */
    public int f111267p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f111268q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f111269r = new boolean[12];

    static {
        new bw5.lc();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.lc mo11468x92b714fd(byte[] bArr) {
        return (bw5.lc) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lc)) {
            return false;
        }
        bw5.lc lcVar = (bw5.lc) fVar;
        return n51.f.a(this.f111258d, lcVar.f111258d) && n51.f.a(java.lang.Integer.valueOf(this.f111259e), java.lang.Integer.valueOf(lcVar.f111259e)) && n51.f.a(this.f111260f, lcVar.f111260f) && n51.f.a(this.f111261g, lcVar.f111261g) && n51.f.a(this.f111262h, lcVar.f111262h) && n51.f.a(this.f111263i, lcVar.f111263i) && n51.f.a(this.f111264m, lcVar.f111264m) && n51.f.a(java.lang.Integer.valueOf(this.f111265n), java.lang.Integer.valueOf(lcVar.f111265n)) && n51.f.a(java.lang.Integer.valueOf(this.f111266o), java.lang.Integer.valueOf(lcVar.f111266o)) && n51.f.a(java.lang.Integer.valueOf(this.f111267p), java.lang.Integer.valueOf(lcVar.f111267p)) && n51.f.a(this.f111268q, lcVar.f111268q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.lc();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f111269r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f111258d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f111259e);
            }
            java.lang.String str2 = this.f111260f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            bw5.ae aeVar = this.f111261g;
            if (aeVar != null && zArr[4]) {
                fVar.i(4, aeVar.mo75928xcd1e8d8());
                this.f111261g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f111262h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f111263i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f111264m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            if (zArr[8]) {
                fVar.e(8, this.f111265n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f111266o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f111267p);
            }
            java.lang.String str6 = this.f111268q;
            if (str6 != null && zArr[11]) {
                fVar.j(11, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f111258d;
            if (str7 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str7);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f111259e);
            }
            java.lang.String str8 = this.f111260f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            bw5.ae aeVar2 = this.f111261g;
            if (aeVar2 != null && zArr[4]) {
                i18 += b36.f.i(4, aeVar2.mo75928xcd1e8d8());
            }
            java.lang.String str9 = this.f111262h;
            if (str9 != null && zArr[5]) {
                i18 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f111263i;
            if (str10 != null && zArr[6]) {
                i18 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f111264m;
            if (str11 != null && zArr[7]) {
                i18 += b36.f.j(7, str11);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f111265n);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f111266o);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f111267p);
            }
            java.lang.String str12 = this.f111268q;
            return (str12 == null || !zArr[11]) ? i18 : i18 + b36.f.j(11, str12);
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
                this.f111258d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f111259e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f111260f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.ae aeVar3 = new bw5.ae();
                    if (bArr != null && bArr.length > 0) {
                        aeVar3.mo11468x92b714fd(bArr);
                    }
                    this.f111261g = aeVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f111262h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f111263i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f111264m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f111265n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f111266o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f111267p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f111268q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}

package bw5;

/* loaded from: classes2.dex */
public class e3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.d3 f108229d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f108230e;

    /* renamed from: f, reason: collision with root package name */
    public int f108231f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f108232g;

    /* renamed from: h, reason: collision with root package name */
    public int f108233h;

    /* renamed from: i, reason: collision with root package name */
    public int f108234i;

    /* renamed from: m, reason: collision with root package name */
    public int f108235m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f108236n;

    /* renamed from: o, reason: collision with root package name */
    public int f108237o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f108238p;

    /* renamed from: q, reason: collision with root package name */
    public int f108239q;

    /* renamed from: r, reason: collision with root package name */
    public int f108240r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f108241s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f108242t = new boolean[15];

    static {
        new bw5.e3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.e3 mo11468x92b714fd(byte[] bArr) {
        return (bw5.e3) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.e3)) {
            return false;
        }
        bw5.e3 e3Var = (bw5.e3) fVar;
        return n51.f.a(this.f108229d, e3Var.f108229d) && n51.f.a(this.f108230e, e3Var.f108230e) && n51.f.a(java.lang.Integer.valueOf(this.f108231f), java.lang.Integer.valueOf(e3Var.f108231f)) && n51.f.a(this.f108232g, e3Var.f108232g) && n51.f.a(java.lang.Integer.valueOf(this.f108233h), java.lang.Integer.valueOf(e3Var.f108233h)) && n51.f.a(java.lang.Integer.valueOf(this.f108234i), java.lang.Integer.valueOf(e3Var.f108234i)) && n51.f.a(java.lang.Integer.valueOf(this.f108235m), java.lang.Integer.valueOf(e3Var.f108235m)) && n51.f.a(this.f108236n, e3Var.f108236n) && n51.f.a(java.lang.Integer.valueOf(this.f108237o), java.lang.Integer.valueOf(e3Var.f108237o)) && n51.f.a(this.f108238p, e3Var.f108238p) && n51.f.a(java.lang.Integer.valueOf(this.f108239q), java.lang.Integer.valueOf(e3Var.f108239q)) && n51.f.a(java.lang.Integer.valueOf(this.f108240r), java.lang.Integer.valueOf(e3Var.f108240r)) && n51.f.a(this.f108241s, e3Var.f108241s);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.e3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        bw5.d3 d3Var;
        boolean[] zArr = this.f108242t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.d3 d3Var2 = this.f108229d;
            if (d3Var2 != null && zArr[1]) {
                fVar.e(1, d3Var2.f107835d);
            }
            java.lang.String str = this.f108230e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f108231f);
            }
            java.lang.String str2 = this.f108232g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f108233h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f108234i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f108235m);
            }
            java.lang.String str3 = this.f108236n;
            if (str3 != null && zArr[8]) {
                fVar.j(8, str3);
            }
            if (zArr[10]) {
                fVar.e(10, this.f108237o);
            }
            java.lang.String str4 = this.f108238p;
            if (str4 != null && zArr[11]) {
                fVar.j(11, str4);
            }
            if (zArr[12]) {
                fVar.e(12, this.f108239q);
            }
            if (zArr[13]) {
                fVar.e(13, this.f108240r);
            }
            java.lang.String str5 = this.f108241s;
            if (str5 == null || !zArr[14]) {
                return 0;
            }
            fVar.j(14, str5);
            return 0;
        }
        if (i17 == 1) {
            bw5.d3 d3Var3 = this.f108229d;
            int e17 = (d3Var3 == null || !zArr[1]) ? 0 : 0 + b36.f.e(1, d3Var3.f107835d);
            java.lang.String str6 = this.f108230e;
            if (str6 != null && zArr[2]) {
                e17 += b36.f.j(2, str6);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f108231f);
            }
            java.lang.String str7 = this.f108232g;
            if (str7 != null && zArr[4]) {
                e17 += b36.f.j(4, str7);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f108233h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f108234i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f108235m);
            }
            java.lang.String str8 = this.f108236n;
            if (str8 != null && zArr[8]) {
                e17 += b36.f.j(8, str8);
            }
            if (zArr[10]) {
                e17 += b36.f.e(10, this.f108237o);
            }
            java.lang.String str9 = this.f108238p;
            if (str9 != null && zArr[11]) {
                e17 += b36.f.j(11, str9);
            }
            if (zArr[12]) {
                e17 += b36.f.e(12, this.f108239q);
            }
            if (zArr[13]) {
                e17 += b36.f.e(13, this.f108240r);
            }
            java.lang.String str10 = this.f108241s;
            return (str10 == null || !zArr[14]) ? e17 : e17 + b36.f.j(14, str10);
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
                int g17 = aVar2.g(intValue);
                if (g17 == 101) {
                    d3Var = bw5.d3.CDN_QUALITY_AUTO_CLIQOS;
                } else if (g17 != 102) {
                    switch (g17) {
                        case 0:
                            d3Var = bw5.d3.CDN_QUALITY_HD;
                            break;
                        case 1:
                            d3Var = bw5.d3.CDN_QUALITY_SD1;
                            break;
                        case 2:
                            d3Var = bw5.d3.CDN_QUALITY_SD2;
                            break;
                        case 3:
                            d3Var = bw5.d3.CDN_QUALITY_SM;
                            break;
                        case 4:
                            d3Var = bw5.d3.CDN_QUALITY_SB;
                            break;
                        case 5:
                            d3Var = bw5.d3.CDN_QUALITY_HEVC;
                            break;
                        case 6:
                            d3Var = bw5.d3.CDN_QUALITY_UL;
                            break;
                        default:
                            d3Var = null;
                            break;
                    }
                } else {
                    d3Var = bw5.d3.CDN_QUALITY_AUTO_SVRML;
                }
                this.f108229d = d3Var;
                zArr[1] = true;
                return 0;
            case 2:
                this.f108230e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f108231f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f108232g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f108233h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f108234i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f108235m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f108236n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
            default:
                return -1;
            case 10:
                this.f108237o = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f108238p = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f108239q = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f108240r = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f108241s = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
        }
    }
}

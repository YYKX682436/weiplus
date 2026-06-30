package bw5;

/* loaded from: classes9.dex */
public class mb0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f111683d;

    /* renamed from: e, reason: collision with root package name */
    public int f111684e;

    /* renamed from: f, reason: collision with root package name */
    public int f111685f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f111686g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f111687h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f111688i;

    /* renamed from: m, reason: collision with root package name */
    public int f111689m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f111690n;

    /* renamed from: o, reason: collision with root package name */
    public int f111691o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f111692p = new boolean[10];

    static {
        new bw5.mb0();
    }

    public java.lang.String b() {
        return this.f111692p[1] ? this.f111683d : "";
    }

    public java.lang.String c() {
        return this.f111692p[5] ? this.f111687h : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.mb0)) {
            return false;
        }
        bw5.mb0 mb0Var = (bw5.mb0) fVar;
        return n51.f.a(this.f111683d, mb0Var.f111683d) && n51.f.a(java.lang.Integer.valueOf(this.f111684e), java.lang.Integer.valueOf(mb0Var.f111684e)) && n51.f.a(java.lang.Integer.valueOf(this.f111685f), java.lang.Integer.valueOf(mb0Var.f111685f)) && n51.f.a(this.f111686g, mb0Var.f111686g) && n51.f.a(this.f111687h, mb0Var.f111687h) && n51.f.a(this.f111688i, mb0Var.f111688i) && n51.f.a(java.lang.Integer.valueOf(this.f111689m), java.lang.Integer.valueOf(mb0Var.f111689m)) && n51.f.a(this.f111690n, mb0Var.f111690n) && n51.f.a(java.lang.Integer.valueOf(this.f111691o), java.lang.Integer.valueOf(mb0Var.f111691o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public bw5.mb0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.mb0) super.mo11468x92b714fd(bArr);
    }

    /* renamed from: getName */
    public java.lang.String m12484xfb82e301() {
        return this.f111692p[4] ? this.f111686g : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.mb0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f111692p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f111683d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f111684e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f111685f);
            }
            java.lang.String str2 = this.f111686g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f111687h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f111688i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            if (zArr[7]) {
                fVar.e(7, this.f111689m);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f111690n;
            if (gVar != null && zArr[8]) {
                fVar.b(8, gVar);
            }
            if (zArr[9]) {
                fVar.e(9, this.f111691o);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f111683d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f111684e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f111685f);
            }
            java.lang.String str6 = this.f111686g;
            if (str6 != null && zArr[4]) {
                i18 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f111687h;
            if (str7 != null && zArr[5]) {
                i18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f111688i;
            if (str8 != null && zArr[6]) {
                i18 += b36.f.j(6, str8);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f111689m);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f111690n;
            if (gVar2 != null && zArr[8]) {
                i18 += b36.f.b(8, gVar2);
            }
            return zArr[9] ? i18 + b36.f.e(9, this.f111691o) : i18;
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
                this.f111683d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f111684e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f111685f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f111686g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f111687h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f111688i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f111689m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f111690n = aVar2.d(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f111691o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}

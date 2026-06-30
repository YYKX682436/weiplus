package bw5;

/* loaded from: classes2.dex */
public class t3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f114760d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f114761e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f114762f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f114763g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f114764h;

    /* renamed from: i, reason: collision with root package name */
    public r45.ri0 f114765i;

    /* renamed from: m, reason: collision with root package name */
    public int f114766m;

    /* renamed from: n, reason: collision with root package name */
    public int f114767n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f114768o = new boolean[9];

    static {
        new bw5.t3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.t3 mo11468x92b714fd(byte[] bArr) {
        return (bw5.t3) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.t3)) {
            return false;
        }
        bw5.t3 t3Var = (bw5.t3) fVar;
        return n51.f.a(this.f114760d, t3Var.f114760d) && n51.f.a(this.f114761e, t3Var.f114761e) && n51.f.a(this.f114762f, t3Var.f114762f) && n51.f.a(this.f114763g, t3Var.f114763g) && n51.f.a(this.f114764h, t3Var.f114764h) && n51.f.a(this.f114765i, t3Var.f114765i) && n51.f.a(java.lang.Integer.valueOf(this.f114766m), java.lang.Integer.valueOf(t3Var.f114766m)) && n51.f.a(java.lang.Integer.valueOf(this.f114767n), java.lang.Integer.valueOf(t3Var.f114767n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.t3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f114768o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f114760d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f114761e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f114762f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f114763g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f114764h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            r45.ri0 ri0Var = this.f114765i;
            if (ri0Var != null && zArr[6]) {
                fVar.i(6, ri0Var.mo75928xcd1e8d8());
                this.f114765i.mo75956x3d5d1f78(fVar);
            }
            if (zArr[7]) {
                fVar.e(7, this.f114766m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f114767n);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f114760d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f114761e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f114762f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f114763g;
            if (str9 != null && zArr[4]) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f114764h;
            if (str10 != null && zArr[5]) {
                i18 += b36.f.j(5, str10);
            }
            r45.ri0 ri0Var2 = this.f114765i;
            if (ri0Var2 != null && zArr[6]) {
                i18 += b36.f.i(6, ri0Var2.mo75928xcd1e8d8());
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f114766m);
            }
            return zArr[8] ? i18 + b36.f.e(8, this.f114767n) : i18;
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
                this.f114760d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f114761e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f114762f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f114763g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f114764h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ri0 ri0Var3 = new r45.ri0();
                    if (bArr != null && bArr.length > 0) {
                        ri0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f114765i = ri0Var3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f114766m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f114767n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}

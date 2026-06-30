package bw5;

/* loaded from: classes2.dex */
public class m10 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f111572d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f111573e;

    /* renamed from: f, reason: collision with root package name */
    public int f111574f;

    /* renamed from: g, reason: collision with root package name */
    public int f111575g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f111576h;

    /* renamed from: i, reason: collision with root package name */
    public int f111577i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f111578m;

    /* renamed from: n, reason: collision with root package name */
    public int f111579n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f111580o = new boolean[9];

    static {
        new bw5.m10();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.m10 mo11468x92b714fd(byte[] bArr) {
        return (bw5.m10) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.m10)) {
            return false;
        }
        bw5.m10 m10Var = (bw5.m10) fVar;
        return n51.f.a(this.f111572d, m10Var.f111572d) && n51.f.a(this.f111573e, m10Var.f111573e) && n51.f.a(java.lang.Integer.valueOf(this.f111574f), java.lang.Integer.valueOf(m10Var.f111574f)) && n51.f.a(java.lang.Integer.valueOf(this.f111575g), java.lang.Integer.valueOf(m10Var.f111575g)) && n51.f.a(this.f111576h, m10Var.f111576h) && n51.f.a(java.lang.Integer.valueOf(this.f111577i), java.lang.Integer.valueOf(m10Var.f111577i)) && n51.f.a(this.f111578m, m10Var.f111578m) && n51.f.a(java.lang.Integer.valueOf(this.f111579n), java.lang.Integer.valueOf(m10Var.f111579n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.m10();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f111580o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f111572d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f111573e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f111574f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f111575g);
            }
            java.lang.String str3 = this.f111576h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            if (zArr[6]) {
                fVar.e(6, this.f111577i);
            }
            java.lang.String str4 = this.f111578m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            if (zArr[8]) {
                fVar.e(8, this.f111579n);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f111572d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f111573e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f111574f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f111575g);
            }
            java.lang.String str7 = this.f111576h;
            if (str7 != null && zArr[5]) {
                i18 += b36.f.j(5, str7);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f111577i);
            }
            java.lang.String str8 = this.f111578m;
            if (str8 != null && zArr[7]) {
                i18 += b36.f.j(7, str8);
            }
            return zArr[8] ? i18 + b36.f.e(8, this.f111579n) : i18;
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
                this.f111572d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f111573e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f111574f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f111575g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f111576h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f111577i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f111578m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f111579n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}

package bw5;

/* loaded from: classes8.dex */
public class a8 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f106591d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.k9 f106592e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f106593f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f106594g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f106595h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f106596i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f106597m;

    /* renamed from: n, reason: collision with root package name */
    public int f106598n;

    /* renamed from: o, reason: collision with root package name */
    public int f106599o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f106600p = new boolean[10];

    static {
        new bw5.a8();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.a8 mo11468x92b714fd(byte[] bArr) {
        return (bw5.a8) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.a8)) {
            return false;
        }
        bw5.a8 a8Var = (bw5.a8) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f106591d), java.lang.Long.valueOf(a8Var.f106591d)) && n51.f.a(this.f106592e, a8Var.f106592e) && n51.f.a(this.f106593f, a8Var.f106593f) && n51.f.a(this.f106594g, a8Var.f106594g) && n51.f.a(this.f106595h, a8Var.f106595h) && n51.f.a(this.f106596i, a8Var.f106596i) && n51.f.a(this.f106597m, a8Var.f106597m) && n51.f.a(java.lang.Integer.valueOf(this.f106598n), java.lang.Integer.valueOf(a8Var.f106598n)) && n51.f.a(java.lang.Integer.valueOf(this.f106599o), java.lang.Integer.valueOf(a8Var.f106599o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.a8();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f106600p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f106591d);
            }
            bw5.k9 k9Var = this.f106592e;
            if (k9Var != null && zArr[2]) {
                fVar.i(2, k9Var.mo75928xcd1e8d8());
                this.f106592e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f106593f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f106594g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f106595h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f106596i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f106597m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            if (zArr[8]) {
                fVar.e(8, this.f106598n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f106599o);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f106591d) : 0;
            bw5.k9 k9Var2 = this.f106592e;
            if (k9Var2 != null && zArr[2]) {
                h17 += b36.f.i(2, k9Var2.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f106593f;
            if (str6 != null && zArr[3]) {
                h17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f106594g;
            if (str7 != null && zArr[4]) {
                h17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f106595h;
            if (str8 != null && zArr[5]) {
                h17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f106596i;
            if (str9 != null && zArr[6]) {
                h17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f106597m;
            if (str10 != null && zArr[7]) {
                h17 += b36.f.j(7, str10);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f106598n);
            }
            return zArr[9] ? h17 + b36.f.e(9, this.f106599o) : h17;
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
                this.f106591d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.k9 k9Var3 = new bw5.k9();
                    if (bArr != null && bArr.length > 0) {
                        k9Var3.mo11468x92b714fd(bArr);
                    }
                    this.f106592e = k9Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f106593f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f106594g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f106595h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f106596i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f106597m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f106598n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f106599o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}

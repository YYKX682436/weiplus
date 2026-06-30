package bw5;

/* loaded from: classes7.dex */
public class yf0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: m, reason: collision with root package name */
    public static final bw5.yf0 f117000m = new bw5.yf0();

    /* renamed from: d, reason: collision with root package name */
    public boolean f117001d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f117002e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.wd0 f117003f;

    /* renamed from: g, reason: collision with root package name */
    public int f117004g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f117005h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f117006i = new boolean[6];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yf0)) {
            return false;
        }
        bw5.yf0 yf0Var = (bw5.yf0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f117001d), java.lang.Boolean.valueOf(yf0Var.f117001d)) && n51.f.a(java.lang.Boolean.valueOf(this.f117002e), java.lang.Boolean.valueOf(yf0Var.f117002e)) && n51.f.a(this.f117003f, yf0Var.f117003f) && n51.f.a(java.lang.Integer.valueOf(this.f117004g), java.lang.Integer.valueOf(yf0Var.f117004g)) && n51.f.a(this.f117005h, yf0Var.f117005h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.yf0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f117006i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f117001d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f117002e);
            }
            bw5.wd0 wd0Var = this.f117003f;
            if (wd0Var != null && zArr[3]) {
                fVar.i(3, wd0Var.mo75928xcd1e8d8());
                this.f117003f.mo75956x3d5d1f78(fVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f117004g);
            }
            java.lang.String str = this.f117005h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f117001d) : 0;
            if (zArr[2]) {
                a17 += b36.f.a(2, this.f117002e);
            }
            bw5.wd0 wd0Var2 = this.f117003f;
            if (wd0Var2 != null && zArr[3]) {
                a17 += b36.f.i(3, wd0Var2.mo75928xcd1e8d8());
            }
            if (zArr[4]) {
                a17 += b36.f.e(4, this.f117004g);
            }
            java.lang.String str2 = this.f117005h;
            return (str2 == null || !zArr[5]) ? a17 : a17 + b36.f.j(5, str2);
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
        if (intValue == 1) {
            this.f117001d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f117002e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                this.f117004g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f117005h = aVar2.k(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.wd0 wd0Var3 = new bw5.wd0();
            if (bArr != null && bArr.length > 0) {
                wd0Var3.mo11468x92b714fd(bArr);
            }
            this.f117003f = wd0Var3;
        }
        zArr[3] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.yf0) super.mo11468x92b714fd(bArr);
    }
}

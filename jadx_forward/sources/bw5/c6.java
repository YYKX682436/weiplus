package bw5;

/* loaded from: classes8.dex */
public class c6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f107470d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.x7 f107471e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f107472f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f107473g;

    /* renamed from: h, reason: collision with root package name */
    public int f107474h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f107475i = new boolean[6];

    static {
        new bw5.c6();
    }

    public bw5.x7 b() {
        return this.f107475i[2] ? this.f107471e : new bw5.x7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.c6 mo11468x92b714fd(byte[] bArr) {
        return (bw5.c6) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.c6)) {
            return false;
        }
        bw5.c6 c6Var = (bw5.c6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f107470d), java.lang.Integer.valueOf(c6Var.f107470d)) && n51.f.a(this.f107471e, c6Var.f107471e) && n51.f.a(java.lang.Boolean.valueOf(this.f107472f), java.lang.Boolean.valueOf(c6Var.f107472f)) && n51.f.a(this.f107473g, c6Var.f107473g) && n51.f.a(java.lang.Integer.valueOf(this.f107474h), java.lang.Integer.valueOf(c6Var.f107474h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.c6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f107475i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f107470d);
            }
            bw5.x7 x7Var = this.f107471e;
            if (x7Var != null && zArr[2]) {
                fVar.i(2, x7Var.mo75928xcd1e8d8());
                this.f107471e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[3]) {
                fVar.a(3, this.f107472f);
            }
            java.lang.String str = this.f107473g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.e(5, this.f107474h);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f107470d) : 0;
            bw5.x7 x7Var2 = this.f107471e;
            if (x7Var2 != null && zArr[2]) {
                e17 += b36.f.i(2, x7Var2.mo75928xcd1e8d8());
            }
            if (zArr[3]) {
                e17 += b36.f.a(3, this.f107472f);
            }
            java.lang.String str2 = this.f107473g;
            if (str2 != null && zArr[4]) {
                e17 += b36.f.j(4, str2);
            }
            return zArr[5] ? e17 + b36.f.e(5, this.f107474h) : e17;
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
            this.f107470d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f107472f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue == 4) {
                this.f107473g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f107474h = aVar2.g(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.x7 x7Var3 = new bw5.x7();
            if (bArr != null && bArr.length > 0) {
                x7Var3.mo11468x92b714fd(bArr);
            }
            this.f107471e = x7Var3;
        }
        zArr[2] = true;
        return 0;
    }
}

package bw5;

/* loaded from: classes2.dex */
public class b50 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f107063d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f107064e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f107065f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f107066g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.e80 f107067h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f107068i = new boolean[6];

    static {
        new bw5.b50();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.b50 mo11468x92b714fd(byte[] bArr) {
        return (bw5.b50) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.b50)) {
            return false;
        }
        bw5.b50 b50Var = (bw5.b50) fVar;
        return n51.f.a(this.f107063d, b50Var.f107063d) && n51.f.a(this.f107064e, b50Var.f107064e) && n51.f.a(this.f107065f, b50Var.f107065f) && n51.f.a(java.lang.Boolean.valueOf(this.f107066g), java.lang.Boolean.valueOf(b50Var.f107066g)) && n51.f.a(this.f107067h, b50Var.f107067h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.b50();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f107068i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f107063d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f107064e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f107065f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.a(4, this.f107066g);
            }
            bw5.e80 e80Var = this.f107067h;
            if (e80Var != null && zArr[5]) {
                fVar.i(5, e80Var.mo75928xcd1e8d8());
                this.f107067h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f107063d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f107064e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f107065f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                i18 += b36.f.a(4, this.f107066g);
            }
            bw5.e80 e80Var2 = this.f107067h;
            return (e80Var2 == null || !zArr[5]) ? i18 : i18 + b36.f.i(5, e80Var2.mo75928xcd1e8d8());
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
            this.f107063d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f107064e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f107065f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f107066g = aVar2.c(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.e80 e80Var3 = new bw5.e80();
            if (bArr != null && bArr.length > 0) {
                e80Var3.mo11468x92b714fd(bArr);
            }
            this.f107067h = e80Var3;
        }
        zArr[5] = true;
        return 0;
    }
}

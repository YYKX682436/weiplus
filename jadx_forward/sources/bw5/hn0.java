package bw5;

/* loaded from: classes11.dex */
public class hn0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: m, reason: collision with root package name */
    public static final bw5.hn0 f109818m = new bw5.hn0();

    /* renamed from: d, reason: collision with root package name */
    public boolean f109819d;

    /* renamed from: e, reason: collision with root package name */
    public int f109820e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f109821f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.ks0 f109822g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.sm0 f109823h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f109824i = new boolean[6];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hn0)) {
            return false;
        }
        bw5.hn0 hn0Var = (bw5.hn0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f109819d), java.lang.Boolean.valueOf(hn0Var.f109819d)) && n51.f.a(java.lang.Integer.valueOf(this.f109820e), java.lang.Integer.valueOf(hn0Var.f109820e)) && n51.f.a(this.f109821f, hn0Var.f109821f) && n51.f.a(this.f109822g, hn0Var.f109822g) && n51.f.a(this.f109823h, hn0Var.f109823h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.hn0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f109824i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f109819d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f109820e);
            }
            java.lang.String str = this.f109821f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            bw5.ks0 ks0Var = this.f109822g;
            if (ks0Var != null && zArr[4]) {
                fVar.e(4, ks0Var.f111075d);
            }
            bw5.sm0 sm0Var = this.f109823h;
            if (sm0Var != null && zArr[5]) {
                fVar.i(5, sm0Var.mo75928xcd1e8d8());
                this.f109823h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f109819d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f109820e);
            }
            java.lang.String str2 = this.f109821f;
            if (str2 != null && zArr[3]) {
                a17 += b36.f.j(3, str2);
            }
            bw5.ks0 ks0Var2 = this.f109822g;
            if (ks0Var2 != null && zArr[4]) {
                a17 += b36.f.e(4, ks0Var2.f111075d);
            }
            bw5.sm0 sm0Var2 = this.f109823h;
            return (sm0Var2 == null || !zArr[5]) ? a17 : a17 + b36.f.i(5, sm0Var2.mo75928xcd1e8d8());
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
            this.f109819d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f109820e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f109821f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            int g17 = aVar2.g(intValue);
            this.f109822g = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : bw5.ks0.StatusXmlDelete : bw5.ks0.StatusXmlUpdateExtInfo : bw5.ks0.StatusXmlUpdateNone;
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.sm0 sm0Var3 = new bw5.sm0();
            if (bArr != null && bArr.length > 0) {
                sm0Var3.mo11468x92b714fd(bArr);
            }
            this.f109823h = sm0Var3;
        }
        zArr[5] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.hn0) super.mo11468x92b714fd(bArr);
    }
}

package bw5;

/* loaded from: classes2.dex */
public class dk0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: m, reason: collision with root package name */
    public static final bw5.dk0 f108045m = new bw5.dk0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f108046d;

    /* renamed from: e, reason: collision with root package name */
    public long f108047e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f108048f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.pj0 f108049g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f108050h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f108051i = new boolean[6];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.dk0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.dk0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.dk0)) {
            return false;
        }
        bw5.dk0 dk0Var = (bw5.dk0) fVar;
        return n51.f.a(this.f108046d, dk0Var.f108046d) && n51.f.a(java.lang.Long.valueOf(this.f108047e), java.lang.Long.valueOf(dk0Var.f108047e)) && n51.f.a(java.lang.Boolean.valueOf(this.f108048f), java.lang.Boolean.valueOf(dk0Var.f108048f)) && n51.f.a(this.f108049g, dk0Var.f108049g) && n51.f.a(java.lang.Boolean.valueOf(this.f108050h), java.lang.Boolean.valueOf(dk0Var.f108050h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.dk0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f108051i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f108046d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f108047e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f108048f);
            }
            bw5.pj0 pj0Var = this.f108049g;
            if (pj0Var != null && zArr[4]) {
                fVar.i(4, pj0Var.mo75928xcd1e8d8());
                this.f108049g.mo75956x3d5d1f78(fVar);
            }
            if (zArr[5]) {
                fVar.a(5, this.f108050h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f108046d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f108047e);
            }
            if (zArr[3]) {
                i18 += b36.f.a(3, this.f108048f);
            }
            bw5.pj0 pj0Var2 = this.f108049g;
            if (pj0Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, pj0Var2.mo75928xcd1e8d8());
            }
            return zArr[5] ? i18 + b36.f.a(5, this.f108050h) : i18;
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
            this.f108046d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f108047e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f108048f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            this.f108050h = aVar2.c(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.pj0 pj0Var3 = new bw5.pj0();
            if (bArr != null && bArr.length > 0) {
                pj0Var3.mo11468x92b714fd(bArr);
            }
            this.f108049g = pj0Var3;
        }
        zArr[4] = true;
        return 0;
    }
}

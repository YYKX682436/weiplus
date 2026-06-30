package bw5;

/* loaded from: classes11.dex */
public class p0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: h, reason: collision with root package name */
    public static final bw5.p0 f112952h = new bw5.p0();

    /* renamed from: d, reason: collision with root package name */
    public bw5.l0 f112953d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f112954e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f112955f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f112956g = new boolean[4];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.p0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.p0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.p0)) {
            return false;
        }
        bw5.p0 p0Var = (bw5.p0) fVar;
        return n51.f.a(this.f112953d, p0Var.f112953d) && n51.f.a(java.lang.Boolean.valueOf(this.f112954e), java.lang.Boolean.valueOf(p0Var.f112954e)) && n51.f.a(java.lang.Boolean.valueOf(this.f112955f), java.lang.Boolean.valueOf(p0Var.f112955f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.p0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f112956g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.l0 l0Var = this.f112953d;
            if (l0Var != null && zArr[1]) {
                fVar.e(1, l0Var.f111127d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f112954e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f112955f);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.l0 l0Var2 = this.f112953d;
            if (l0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, l0Var2.f111127d);
            }
            if (zArr[2]) {
                i18 += b36.f.a(2, this.f112954e);
            }
            return zArr[3] ? i18 + b36.f.a(3, this.f112955f) : i18;
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
            int g17 = aVar2.g(intValue);
            this.f112953d = g17 != 0 ? g17 != 1 ? null : bw5.l0.AFFMIG_PC : bw5.l0.AFFMIG_PHONE;
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f112954e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f112955f = aVar2.c(intValue);
        zArr[3] = true;
        return 0;
    }
}

package bw5;

/* loaded from: classes2.dex */
public class qb0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f113565d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.l60 f113566e;

    /* renamed from: f, reason: collision with root package name */
    public int f113567f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f113568g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f113569h = new boolean[5];

    static {
        new bw5.qb0();
    }

    public bw5.l60 b() {
        return this.f113569h[2] ? this.f113566e : new bw5.l60();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.qb0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.qb0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qb0)) {
            return false;
        }
        bw5.qb0 qb0Var = (bw5.qb0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f113565d), java.lang.Integer.valueOf(qb0Var.f113565d)) && n51.f.a(this.f113566e, qb0Var.f113566e) && n51.f.a(java.lang.Integer.valueOf(this.f113567f), java.lang.Integer.valueOf(qb0Var.f113567f)) && n51.f.a(java.lang.Boolean.valueOf(this.f113568g), java.lang.Boolean.valueOf(qb0Var.f113568g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.qb0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113569h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f113565d);
            }
            bw5.l60 l60Var = this.f113566e;
            if (l60Var != null && zArr[2]) {
                fVar.i(2, l60Var.mo75928xcd1e8d8());
                this.f113566e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f113567f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f113568g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f113565d) : 0;
            bw5.l60 l60Var2 = this.f113566e;
            if (l60Var2 != null && zArr[2]) {
                e17 += b36.f.i(2, l60Var2.mo75928xcd1e8d8());
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f113567f);
            }
            return zArr[4] ? e17 + b36.f.a(4, this.f113568g) : e17;
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
            this.f113565d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f113567f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f113568g = aVar2.c(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.l60 l60Var3 = new bw5.l60();
            if (bArr != null && bArr.length > 0) {
                l60Var3.mo11468x92b714fd(bArr);
            }
            this.f113566e = l60Var3;
        }
        zArr[2] = true;
        return 0;
    }
}

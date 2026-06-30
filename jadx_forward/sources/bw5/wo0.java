package bw5;

/* loaded from: classes2.dex */
public class wo0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f116334d;

    /* renamed from: e, reason: collision with root package name */
    public int f116335e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f116336f;

    /* renamed from: g, reason: collision with root package name */
    public int f116337g;

    /* renamed from: h, reason: collision with root package name */
    public float f116338h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f116339i = new boolean[6];

    static {
        new bw5.wo0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wo0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.wo0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wo0)) {
            return false;
        }
        bw5.wo0 wo0Var = (bw5.wo0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f116334d), java.lang.Integer.valueOf(wo0Var.f116334d)) && n51.f.a(java.lang.Integer.valueOf(this.f116335e), java.lang.Integer.valueOf(wo0Var.f116335e)) && n51.f.a(this.f116336f, wo0Var.f116336f) && n51.f.a(java.lang.Integer.valueOf(this.f116337g), java.lang.Integer.valueOf(wo0Var.f116337g)) && n51.f.a(java.lang.Float.valueOf(this.f116338h), java.lang.Float.valueOf(wo0Var.f116338h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.wo0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f116339i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f116334d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f116335e);
            }
            java.lang.String str = this.f116336f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.e(4, this.f116337g);
            }
            if (zArr[5]) {
                fVar.d(5, this.f116338h);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f116334d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f116335e);
            }
            java.lang.String str2 = this.f116336f;
            if (str2 != null && zArr[3]) {
                e17 += b36.f.j(3, str2);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f116337g);
            }
            return zArr[5] ? e17 + b36.f.d(5, this.f116338h) : e17;
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
            this.f116334d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f116335e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f116336f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f116337g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f116338h = aVar2.f(intValue);
        zArr[5] = true;
        return 0;
    }
}

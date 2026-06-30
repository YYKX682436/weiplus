package bw5;

/* loaded from: classes2.dex */
public class or0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f112747d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f112748e;

    /* renamed from: f, reason: collision with root package name */
    public int f112749f;

    /* renamed from: g, reason: collision with root package name */
    public int f112750g;

    /* renamed from: h, reason: collision with root package name */
    public int f112751h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f112752i = new boolean[6];

    static {
        new bw5.or0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.or0)) {
            return false;
        }
        bw5.or0 or0Var = (bw5.or0) fVar;
        return n51.f.a(this.f112747d, or0Var.f112747d) && n51.f.a(this.f112748e, or0Var.f112748e) && n51.f.a(java.lang.Integer.valueOf(this.f112749f), java.lang.Integer.valueOf(or0Var.f112749f)) && n51.f.a(java.lang.Integer.valueOf(this.f112750g), java.lang.Integer.valueOf(or0Var.f112750g)) && n51.f.a(java.lang.Integer.valueOf(this.f112751h), java.lang.Integer.valueOf(or0Var.f112751h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.or0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f112752i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f112747d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f112748e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f112749f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f112750g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f112751h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f112747d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f112748e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f112749f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f112750g);
            }
            return zArr[5] ? i18 + b36.f.e(5, this.f112751h) : i18;
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
            this.f112747d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f112748e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f112749f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f112750g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f112751h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.or0) super.mo11468x92b714fd(bArr);
    }
}

package bw5;

/* loaded from: classes2.dex */
public class cc0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f107577d;

    /* renamed from: e, reason: collision with root package name */
    public int f107578e;

    /* renamed from: f, reason: collision with root package name */
    public int f107579f;

    /* renamed from: g, reason: collision with root package name */
    public int f107580g;

    /* renamed from: h, reason: collision with root package name */
    public int f107581h;

    /* renamed from: i, reason: collision with root package name */
    public int f107582i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f107583m = new boolean[7];

    static {
        new bw5.cc0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.cc0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.cc0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.cc0)) {
            return false;
        }
        bw5.cc0 cc0Var = (bw5.cc0) fVar;
        return n51.f.a(this.f107577d, cc0Var.f107577d) && n51.f.a(java.lang.Integer.valueOf(this.f107578e), java.lang.Integer.valueOf(cc0Var.f107578e)) && n51.f.a(java.lang.Integer.valueOf(this.f107579f), java.lang.Integer.valueOf(cc0Var.f107579f)) && n51.f.a(java.lang.Integer.valueOf(this.f107580g), java.lang.Integer.valueOf(cc0Var.f107580g)) && n51.f.a(java.lang.Integer.valueOf(this.f107581h), java.lang.Integer.valueOf(cc0Var.f107581h)) && n51.f.a(java.lang.Integer.valueOf(this.f107582i), java.lang.Integer.valueOf(cc0Var.f107582i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.cc0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f107583m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f107577d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f107578e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f107579f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f107580g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f107581h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f107582i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f107577d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f107578e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f107579f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f107580g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f107581h);
            }
            return zArr[6] ? i18 + b36.f.e(6, this.f107582i) : i18;
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
                this.f107577d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f107578e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f107579f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f107580g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f107581h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f107582i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}

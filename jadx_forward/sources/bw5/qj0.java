package bw5;

/* loaded from: classes2.dex */
public class qj0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f113666d;

    /* renamed from: e, reason: collision with root package name */
    public int f113667e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f113668f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f113669g;

    /* renamed from: h, reason: collision with root package name */
    public int f113670h;

    /* renamed from: i, reason: collision with root package name */
    public int f113671i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f113672m = new boolean[7];

    static {
        new bw5.qj0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.qj0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.qj0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qj0)) {
            return false;
        }
        bw5.qj0 qj0Var = (bw5.qj0) fVar;
        return n51.f.a(this.f113666d, qj0Var.f113666d) && n51.f.a(java.lang.Integer.valueOf(this.f113667e), java.lang.Integer.valueOf(qj0Var.f113667e)) && n51.f.a(this.f113668f, qj0Var.f113668f) && n51.f.a(this.f113669g, qj0Var.f113669g) && n51.f.a(java.lang.Integer.valueOf(this.f113670h), java.lang.Integer.valueOf(qj0Var.f113670h)) && n51.f.a(java.lang.Integer.valueOf(this.f113671i), java.lang.Integer.valueOf(qj0Var.f113671i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.qj0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f113672m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f113666d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f113667e);
            }
            java.lang.String str2 = this.f113668f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f113669g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.e(5, this.f113670h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f113671i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f113666d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f113667e);
            }
            java.lang.String str5 = this.f113668f;
            if (str5 != null && zArr[3]) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f113669g;
            if (str6 != null && zArr[4]) {
                i18 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f113670h);
            }
            return zArr[6] ? i18 + b36.f.e(6, this.f113671i) : i18;
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
                this.f113666d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f113667e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f113668f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f113669g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f113670h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f113671i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}

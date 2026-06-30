package bw5;

/* loaded from: classes4.dex */
public class kn0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f110975d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f110976e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f110977f;

    /* renamed from: g, reason: collision with root package name */
    public int f110978g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f110979h;

    /* renamed from: i, reason: collision with root package name */
    public int f110980i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f110981m = new boolean[7];

    static {
        new bw5.kn0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.kn0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.kn0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.kn0)) {
            return false;
        }
        bw5.kn0 kn0Var = (bw5.kn0) fVar;
        return n51.f.a(this.f110975d, kn0Var.f110975d) && n51.f.a(this.f110976e, kn0Var.f110976e) && n51.f.a(this.f110977f, kn0Var.f110977f) && n51.f.a(java.lang.Integer.valueOf(this.f110978g), java.lang.Integer.valueOf(kn0Var.f110978g)) && n51.f.a(java.lang.Boolean.valueOf(this.f110979h), java.lang.Boolean.valueOf(kn0Var.f110979h)) && n51.f.a(java.lang.Integer.valueOf(this.f110980i), java.lang.Integer.valueOf(kn0Var.f110980i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.kn0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f110981m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f110975d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f110976e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f110977f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f110978g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f110979h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f110980i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f110975d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f110976e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f110977f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f110978g);
            }
            if (zArr[5]) {
                i18 += b36.f.a(5, this.f110979h);
            }
            return zArr[6] ? i18 + b36.f.e(6, this.f110980i) : i18;
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
                this.f110975d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f110976e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f110977f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f110978g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f110979h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f110980i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}

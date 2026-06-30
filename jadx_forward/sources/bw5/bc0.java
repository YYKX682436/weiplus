package bw5;

/* loaded from: classes2.dex */
public class bc0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f107129d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f107130e;

    /* renamed from: f, reason: collision with root package name */
    public int f107131f;

    /* renamed from: g, reason: collision with root package name */
    public int f107132g;

    /* renamed from: h, reason: collision with root package name */
    public int f107133h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f107134i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f107135m = new boolean[7];

    static {
        new bw5.bc0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.bc0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.bc0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bc0)) {
            return false;
        }
        bw5.bc0 bc0Var = (bw5.bc0) fVar;
        return n51.f.a(this.f107129d, bc0Var.f107129d) && n51.f.a(this.f107130e, bc0Var.f107130e) && n51.f.a(java.lang.Integer.valueOf(this.f107131f), java.lang.Integer.valueOf(bc0Var.f107131f)) && n51.f.a(java.lang.Integer.valueOf(this.f107132g), java.lang.Integer.valueOf(bc0Var.f107132g)) && n51.f.a(java.lang.Integer.valueOf(this.f107133h), java.lang.Integer.valueOf(bc0Var.f107133h)) && n51.f.a(java.lang.Boolean.valueOf(this.f107134i), java.lang.Boolean.valueOf(bc0Var.f107134i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.bc0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f107135m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f107129d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f107130e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f107131f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f107132g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f107133h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f107134i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f107129d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f107130e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f107131f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f107132g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f107133h);
            }
            return zArr[6] ? i18 + b36.f.a(6, this.f107134i) : i18;
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
                this.f107129d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f107130e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f107131f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f107132g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f107133h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f107134i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}

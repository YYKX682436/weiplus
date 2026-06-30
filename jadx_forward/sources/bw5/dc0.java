package bw5;

/* loaded from: classes2.dex */
public class dc0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f107962d;

    /* renamed from: e, reason: collision with root package name */
    public int f107963e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f107964f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f107965g;

    /* renamed from: h, reason: collision with root package name */
    public int f107966h;

    /* renamed from: i, reason: collision with root package name */
    public int f107967i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f107968m = new boolean[7];

    static {
        new bw5.dc0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.dc0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.dc0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.dc0)) {
            return false;
        }
        bw5.dc0 dc0Var = (bw5.dc0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f107962d), java.lang.Integer.valueOf(dc0Var.f107962d)) && n51.f.a(java.lang.Integer.valueOf(this.f107963e), java.lang.Integer.valueOf(dc0Var.f107963e)) && n51.f.a(this.f107964f, dc0Var.f107964f) && n51.f.a(this.f107965g, dc0Var.f107965g) && n51.f.a(java.lang.Integer.valueOf(this.f107966h), java.lang.Integer.valueOf(dc0Var.f107966h)) && n51.f.a(java.lang.Integer.valueOf(this.f107967i), java.lang.Integer.valueOf(dc0Var.f107967i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.dc0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f107968m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f107962d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f107963e);
            }
            java.lang.String str = this.f107964f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f107965g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f107966h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f107967i);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f107962d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f107963e);
            }
            java.lang.String str3 = this.f107964f;
            if (str3 != null && zArr[3]) {
                e17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f107965g;
            if (str4 != null && zArr[4]) {
                e17 += b36.f.j(4, str4);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f107966h);
            }
            return zArr[6] ? e17 + b36.f.e(6, this.f107967i) : e17;
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
                this.f107962d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f107963e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f107964f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f107965g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f107966h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f107967i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}

package bw5;

/* loaded from: classes2.dex */
public class k4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f110760d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f110761e;

    /* renamed from: f, reason: collision with root package name */
    public float f110762f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f110763g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.am f110764h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f110765i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f110766m = new boolean[7];

    static {
        new bw5.k4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.k4 mo11468x92b714fd(byte[] bArr) {
        return (bw5.k4) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.k4)) {
            return false;
        }
        bw5.k4 k4Var = (bw5.k4) fVar;
        return n51.f.a(this.f110760d, k4Var.f110760d) && n51.f.a(this.f110761e, k4Var.f110761e) && n51.f.a(java.lang.Float.valueOf(this.f110762f), java.lang.Float.valueOf(k4Var.f110762f)) && n51.f.a(java.lang.Boolean.valueOf(this.f110763g), java.lang.Boolean.valueOf(k4Var.f110763g)) && n51.f.a(this.f110764h, k4Var.f110764h) && n51.f.a(java.lang.Boolean.valueOf(this.f110765i), java.lang.Boolean.valueOf(k4Var.f110765i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.k4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f110766m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f110760d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f110761e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.d(3, this.f110762f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f110763g);
            }
            bw5.am amVar = this.f110764h;
            if (amVar != null && zArr[5]) {
                fVar.i(5, amVar.mo75928xcd1e8d8());
                this.f110764h.mo75956x3d5d1f78(fVar);
            }
            if (zArr[6]) {
                fVar.a(6, this.f110765i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f110760d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f110761e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            if (zArr[3]) {
                i18 += b36.f.d(3, this.f110762f);
            }
            if (zArr[4]) {
                i18 += b36.f.a(4, this.f110763g);
            }
            bw5.am amVar2 = this.f110764h;
            if (amVar2 != null && zArr[5]) {
                i18 += b36.f.i(5, amVar2.mo75928xcd1e8d8());
            }
            return zArr[6] ? i18 + b36.f.a(6, this.f110765i) : i18;
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
                this.f110760d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f110761e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f110762f = aVar2.f(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f110763g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.am amVar3 = new bw5.am();
                    if (bArr != null && bArr.length > 0) {
                        amVar3.mo11468x92b714fd(bArr);
                    }
                    this.f110764h = amVar3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f110765i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}

package bw5;

/* loaded from: classes2.dex */
public class fn0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f108919d;

    /* renamed from: e, reason: collision with root package name */
    public int f108920e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f108921f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f108922g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f108923h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f108924i;

    /* renamed from: m, reason: collision with root package name */
    public long f108925m;

    /* renamed from: n, reason: collision with root package name */
    public long f108926n;

    /* renamed from: o, reason: collision with root package name */
    public long f108927o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f108928p = new boolean[10];

    static {
        new bw5.fn0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fn0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.fn0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fn0)) {
            return false;
        }
        bw5.fn0 fn0Var = (bw5.fn0) fVar;
        return n51.f.a(this.f108919d, fn0Var.f108919d) && n51.f.a(java.lang.Integer.valueOf(this.f108920e), java.lang.Integer.valueOf(fn0Var.f108920e)) && n51.f.a(this.f108921f, fn0Var.f108921f) && n51.f.a(this.f108922g, fn0Var.f108922g) && n51.f.a(this.f108923h, fn0Var.f108923h) && n51.f.a(this.f108924i, fn0Var.f108924i) && n51.f.a(java.lang.Long.valueOf(this.f108925m), java.lang.Long.valueOf(fn0Var.f108925m)) && n51.f.a(java.lang.Long.valueOf(this.f108926n), java.lang.Long.valueOf(fn0Var.f108926n)) && n51.f.a(java.lang.Long.valueOf(this.f108927o), java.lang.Long.valueOf(fn0Var.f108927o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.fn0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f108928p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f108919d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f108920e);
            }
            java.lang.String str2 = this.f108921f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f108922g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f108923h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f108924i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            if (zArr[7]) {
                fVar.h(7, this.f108925m);
            }
            if (zArr[8]) {
                fVar.h(8, this.f108926n);
            }
            if (zArr[9]) {
                fVar.h(9, this.f108927o);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f108919d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f108920e);
            }
            java.lang.String str7 = this.f108921f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f108922g;
            if (str8 != null && zArr[4]) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f108923h;
            if (str9 != null && zArr[5]) {
                i18 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f108924i;
            if (str10 != null && zArr[6]) {
                i18 += b36.f.j(6, str10);
            }
            if (zArr[7]) {
                i18 += b36.f.h(7, this.f108925m);
            }
            if (zArr[8]) {
                i18 += b36.f.h(8, this.f108926n);
            }
            return zArr[9] ? i18 + b36.f.h(9, this.f108927o) : i18;
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
                this.f108919d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f108920e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f108921f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f108922g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f108923h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f108924i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f108925m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f108926n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f108927o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}

package bw5;

/* loaded from: classes2.dex */
public class f70 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f108712d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f108713e;

    /* renamed from: f, reason: collision with root package name */
    public int f108714f;

    /* renamed from: g, reason: collision with root package name */
    public float f108715g;

    /* renamed from: h, reason: collision with root package name */
    public float f108716h;

    /* renamed from: i, reason: collision with root package name */
    public float f108717i;

    /* renamed from: m, reason: collision with root package name */
    public float f108718m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f108719n = new boolean[8];

    static {
        new bw5.f70();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.f70 mo11468x92b714fd(byte[] bArr) {
        return (bw5.f70) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.f70)) {
            return false;
        }
        bw5.f70 f70Var = (bw5.f70) fVar;
        return n51.f.a(this.f108712d, f70Var.f108712d) && n51.f.a(java.lang.Boolean.valueOf(this.f108713e), java.lang.Boolean.valueOf(f70Var.f108713e)) && n51.f.a(java.lang.Integer.valueOf(this.f108714f), java.lang.Integer.valueOf(f70Var.f108714f)) && n51.f.a(java.lang.Float.valueOf(this.f108715g), java.lang.Float.valueOf(f70Var.f108715g)) && n51.f.a(java.lang.Float.valueOf(this.f108716h), java.lang.Float.valueOf(f70Var.f108716h)) && n51.f.a(java.lang.Float.valueOf(this.f108717i), java.lang.Float.valueOf(f70Var.f108717i)) && n51.f.a(java.lang.Float.valueOf(this.f108718m), java.lang.Float.valueOf(f70Var.f108718m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.f70();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f108719n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f108712d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.a(2, this.f108713e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f108714f);
            }
            if (zArr[4]) {
                fVar.d(4, this.f108715g);
            }
            if (zArr[5]) {
                fVar.d(5, this.f108716h);
            }
            if (zArr[6]) {
                fVar.d(6, this.f108717i);
            }
            if (zArr[7]) {
                fVar.d(7, this.f108718m);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f108712d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.a(2, this.f108713e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f108714f);
            }
            if (zArr[4]) {
                i18 += b36.f.d(4, this.f108715g);
            }
            if (zArr[5]) {
                i18 += b36.f.d(5, this.f108716h);
            }
            if (zArr[6]) {
                i18 += b36.f.d(6, this.f108717i);
            }
            return zArr[7] ? i18 + b36.f.d(7, this.f108718m) : i18;
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
                this.f108712d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f108713e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f108714f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f108715g = aVar2.f(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f108716h = aVar2.f(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f108717i = aVar2.f(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f108718m = aVar2.f(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}

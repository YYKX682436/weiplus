package bw5;

/* loaded from: classes4.dex */
public class xj0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f116682d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f116683e;

    /* renamed from: f, reason: collision with root package name */
    public int f116684f;

    /* renamed from: g, reason: collision with root package name */
    public int f116685g;

    /* renamed from: h, reason: collision with root package name */
    public int f116686h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f116687i;

    /* renamed from: m, reason: collision with root package name */
    public int f116688m;

    /* renamed from: n, reason: collision with root package name */
    public int f116689n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f116690o = new boolean[9];

    static {
        new bw5.xj0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.xj0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.xj0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.xj0)) {
            return false;
        }
        bw5.xj0 xj0Var = (bw5.xj0) fVar;
        return n51.f.a(this.f116682d, xj0Var.f116682d) && n51.f.a(this.f116683e, xj0Var.f116683e) && n51.f.a(java.lang.Integer.valueOf(this.f116684f), java.lang.Integer.valueOf(xj0Var.f116684f)) && n51.f.a(java.lang.Integer.valueOf(this.f116685g), java.lang.Integer.valueOf(xj0Var.f116685g)) && n51.f.a(java.lang.Integer.valueOf(this.f116686h), java.lang.Integer.valueOf(xj0Var.f116686h)) && n51.f.a(this.f116687i, xj0Var.f116687i) && n51.f.a(java.lang.Integer.valueOf(this.f116688m), java.lang.Integer.valueOf(xj0Var.f116688m)) && n51.f.a(java.lang.Integer.valueOf(this.f116689n), java.lang.Integer.valueOf(xj0Var.f116689n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.xj0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f116690o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f116682d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            r45.cu5 cu5Var = this.f116683e;
            if (cu5Var != null && zArr[2]) {
                fVar.i(2, cu5Var.mo75928xcd1e8d8());
                this.f116683e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f116684f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f116685g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f116686h);
            }
            java.lang.String str2 = this.f116687i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            if (zArr[7]) {
                fVar.e(7, this.f116688m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f116689n);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f116682d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            r45.cu5 cu5Var2 = this.f116683e;
            if (cu5Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, cu5Var2.mo75928xcd1e8d8());
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f116684f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f116685g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f116686h);
            }
            java.lang.String str4 = this.f116687i;
            if (str4 != null && zArr[6]) {
                i18 += b36.f.j(6, str4);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f116688m);
            }
            return zArr[8] ? i18 + b36.f.e(8, this.f116689n) : i18;
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
                this.f116682d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var3.b(bArr);
                    }
                    this.f116683e = cu5Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f116684f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f116685g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f116686h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f116687i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f116688m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f116689n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}

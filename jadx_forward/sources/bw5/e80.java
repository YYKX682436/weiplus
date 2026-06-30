package bw5;

/* loaded from: classes2.dex */
public class e80 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f108313d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f108314e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.c80 f108315f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.d80 f108316g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f108317h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.mb0 f108318i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.f80 f108319m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f108320n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.lb0 f108321o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f108322p = new boolean[10];

    static {
        new bw5.e80();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.e80 mo11468x92b714fd(byte[] bArr) {
        return (bw5.e80) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.e80)) {
            return false;
        }
        bw5.e80 e80Var = (bw5.e80) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f108313d), java.lang.Integer.valueOf(e80Var.f108313d)) && n51.f.a(this.f108314e, e80Var.f108314e) && n51.f.a(this.f108315f, e80Var.f108315f) && n51.f.a(this.f108316g, e80Var.f108316g) && n51.f.a(this.f108317h, e80Var.f108317h) && n51.f.a(this.f108318i, e80Var.f108318i) && n51.f.a(this.f108319m, e80Var.f108319m) && n51.f.a(this.f108320n, e80Var.f108320n) && n51.f.a(this.f108321o, e80Var.f108321o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.e80();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f108322p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f108313d);
            }
            java.lang.String str = this.f108314e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            bw5.c80 c80Var = this.f108315f;
            if (c80Var != null && zArr[3]) {
                fVar.i(3, c80Var.mo75928xcd1e8d8());
                this.f108315f.mo75956x3d5d1f78(fVar);
            }
            bw5.d80 d80Var = this.f108316g;
            if (d80Var != null && zArr[4]) {
                fVar.i(4, d80Var.mo75928xcd1e8d8());
                this.f108316g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f108317h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            bw5.mb0 mb0Var = this.f108318i;
            if (mb0Var != null && zArr[6]) {
                fVar.i(6, mb0Var.mo75928xcd1e8d8());
                this.f108318i.mo75956x3d5d1f78(fVar);
            }
            bw5.f80 f80Var = this.f108319m;
            if (f80Var != null && zArr[7]) {
                fVar.i(7, f80Var.mo75928xcd1e8d8());
                this.f108319m.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f108320n;
            if (str3 != null && zArr[8]) {
                fVar.j(8, str3);
            }
            bw5.lb0 lb0Var = this.f108321o;
            if (lb0Var != null && zArr[9]) {
                fVar.i(9, lb0Var.mo75928xcd1e8d8());
                this.f108321o.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f108313d) : 0;
            java.lang.String str4 = this.f108314e;
            if (str4 != null && zArr[2]) {
                e17 += b36.f.j(2, str4);
            }
            bw5.c80 c80Var2 = this.f108315f;
            if (c80Var2 != null && zArr[3]) {
                e17 += b36.f.i(3, c80Var2.mo75928xcd1e8d8());
            }
            bw5.d80 d80Var2 = this.f108316g;
            if (d80Var2 != null && zArr[4]) {
                e17 += b36.f.i(4, d80Var2.mo75928xcd1e8d8());
            }
            java.lang.String str5 = this.f108317h;
            if (str5 != null && zArr[5]) {
                e17 += b36.f.j(5, str5);
            }
            bw5.mb0 mb0Var2 = this.f108318i;
            if (mb0Var2 != null && zArr[6]) {
                e17 += b36.f.i(6, mb0Var2.mo75928xcd1e8d8());
            }
            bw5.f80 f80Var2 = this.f108319m;
            if (f80Var2 != null && zArr[7]) {
                e17 += b36.f.i(7, f80Var2.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f108320n;
            if (str6 != null && zArr[8]) {
                e17 += b36.f.j(8, str6);
            }
            bw5.lb0 lb0Var2 = this.f108321o;
            return (lb0Var2 == null || !zArr[9]) ? e17 : e17 + b36.f.i(9, lb0Var2.mo75928xcd1e8d8());
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
                this.f108313d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f108314e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.c80 c80Var3 = new bw5.c80();
                    if (bArr != null && bArr.length > 0) {
                        c80Var3.mo11468x92b714fd(bArr);
                    }
                    this.f108315f = c80Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.d80 d80Var3 = new bw5.d80();
                    if (bArr2 != null && bArr2.length > 0) {
                        d80Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f108316g = d80Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f108317h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.mb0 mb0Var3 = new bw5.mb0();
                    if (bArr3 != null && bArr3.length > 0) {
                        mb0Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f108318i = mb0Var3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.f80 f80Var3 = new bw5.f80();
                    if (bArr4 != null && bArr4.length > 0) {
                        f80Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f108319m = f80Var3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f108320n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.lb0 lb0Var3 = new bw5.lb0();
                    if (bArr5 != null && bArr5.length > 0) {
                        lb0Var3.mo11468x92b714fd(bArr5);
                    }
                    this.f108321o = lb0Var3;
                }
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}

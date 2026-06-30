package bw5;

/* loaded from: classes8.dex */
public class hp0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f109847d;

    /* renamed from: e, reason: collision with root package name */
    public int f109848e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f109849f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f109850g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.xq0 f109851h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.fb0 f109852i;

    /* renamed from: m, reason: collision with root package name */
    public int f109853m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f109854n = new boolean[8];

    static {
        new bw5.hp0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.hp0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.hp0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hp0)) {
            return false;
        }
        bw5.hp0 hp0Var = (bw5.hp0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f109847d), java.lang.Integer.valueOf(hp0Var.f109847d)) && n51.f.a(java.lang.Integer.valueOf(this.f109848e), java.lang.Integer.valueOf(hp0Var.f109848e)) && n51.f.a(this.f109849f, hp0Var.f109849f) && n51.f.a(this.f109850g, hp0Var.f109850g) && n51.f.a(this.f109851h, hp0Var.f109851h) && n51.f.a(this.f109852i, hp0Var.f109852i) && n51.f.a(java.lang.Integer.valueOf(this.f109853m), java.lang.Integer.valueOf(hp0Var.f109853m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.hp0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f109854n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f109847d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f109848e);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f109849f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f109850g;
            if (gVar2 != null && zArr[4]) {
                fVar.b(4, gVar2);
            }
            bw5.xq0 xq0Var = this.f109851h;
            if (xq0Var != null && zArr[5]) {
                fVar.i(5, xq0Var.mo75928xcd1e8d8());
                this.f109851h.mo75956x3d5d1f78(fVar);
            }
            bw5.fb0 fb0Var = this.f109852i;
            if (fb0Var != null && zArr[6]) {
                fVar.i(6, fb0Var.mo75928xcd1e8d8());
                this.f109852i.mo75956x3d5d1f78(fVar);
            }
            if (zArr[7]) {
                fVar.e(7, this.f109853m);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f109847d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f109848e);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f109849f;
            if (gVar3 != null && zArr[3]) {
                e17 += b36.f.b(3, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f109850g;
            if (gVar4 != null && zArr[4]) {
                e17 += b36.f.b(4, gVar4);
            }
            bw5.xq0 xq0Var2 = this.f109851h;
            if (xq0Var2 != null && zArr[5]) {
                e17 += b36.f.i(5, xq0Var2.mo75928xcd1e8d8());
            }
            bw5.fb0 fb0Var2 = this.f109852i;
            if (fb0Var2 != null && zArr[6]) {
                e17 += b36.f.i(6, fb0Var2.mo75928xcd1e8d8());
            }
            return zArr[7] ? e17 + b36.f.e(7, this.f109853m) : e17;
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
                this.f109847d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f109848e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f109849f = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f109850g = aVar2.d(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.xq0 xq0Var3 = new bw5.xq0();
                    if (bArr != null && bArr.length > 0) {
                        xq0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f109851h = xq0Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.fb0 fb0Var3 = new bw5.fb0();
                    if (bArr2 != null && bArr2.length > 0) {
                        fb0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f109852i = fb0Var3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f109853m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}

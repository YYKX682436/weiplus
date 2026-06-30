package bw5;

/* loaded from: classes11.dex */
public class fr0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.dr0 f109025d;

    /* renamed from: e, reason: collision with root package name */
    public int f109026e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.lp0 f109027f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.op0 f109028g;

    /* renamed from: h, reason: collision with root package name */
    public long f109029h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.eq0 f109030i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.uq0 f109031m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f109032n = new boolean[8];

    static {
        new bw5.fr0();
    }

    public bw5.lp0 b() {
        return this.f109032n[3] ? this.f109027f : new bw5.lp0();
    }

    public bw5.dr0 c() {
        return this.f109032n[1] ? this.f109025d : new bw5.dr0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fr0)) {
            return false;
        }
        bw5.fr0 fr0Var = (bw5.fr0) fVar;
        return n51.f.a(this.f109025d, fr0Var.f109025d) && n51.f.a(java.lang.Integer.valueOf(this.f109026e), java.lang.Integer.valueOf(fr0Var.f109026e)) && n51.f.a(this.f109027f, fr0Var.f109027f) && n51.f.a(this.f109028g, fr0Var.f109028g) && n51.f.a(java.lang.Long.valueOf(this.f109029h), java.lang.Long.valueOf(fr0Var.f109029h)) && n51.f.a(this.f109030i, fr0Var.f109030i) && n51.f.a(this.f109031m, fr0Var.f109031m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public bw5.fr0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.fr0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.fr0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f109032n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.dr0 dr0Var = this.f109025d;
            if (dr0Var != null && zArr[1]) {
                fVar.i(1, dr0Var.mo75928xcd1e8d8());
                this.f109025d.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f109026e);
            }
            bw5.lp0 lp0Var = this.f109027f;
            if (lp0Var != null && zArr[3]) {
                fVar.i(3, lp0Var.mo75928xcd1e8d8());
                this.f109027f.mo75956x3d5d1f78(fVar);
            }
            bw5.op0 op0Var = this.f109028g;
            if (op0Var != null && zArr[4]) {
                fVar.i(4, op0Var.mo75928xcd1e8d8());
                this.f109028g.mo75956x3d5d1f78(fVar);
            }
            if (zArr[5]) {
                fVar.h(5, this.f109029h);
            }
            bw5.eq0 eq0Var = this.f109030i;
            if (eq0Var != null && zArr[6]) {
                fVar.e(6, eq0Var.f108558d);
            }
            bw5.uq0 uq0Var = this.f109031m;
            if (uq0Var != null && zArr[7]) {
                fVar.i(7, uq0Var.mo75928xcd1e8d8());
                this.f109031m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.dr0 dr0Var2 = this.f109025d;
            if (dr0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, dr0Var2.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f109026e);
            }
            bw5.lp0 lp0Var2 = this.f109027f;
            if (lp0Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, lp0Var2.mo75928xcd1e8d8());
            }
            bw5.op0 op0Var2 = this.f109028g;
            if (op0Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, op0Var2.mo75928xcd1e8d8());
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f109029h);
            }
            bw5.eq0 eq0Var2 = this.f109030i;
            if (eq0Var2 != null && zArr[6]) {
                i18 += b36.f.e(6, eq0Var2.f108558d);
            }
            bw5.uq0 uq0Var2 = this.f109031m;
            return (uq0Var2 == null || !zArr[7]) ? i18 : i18 + b36.f.i(7, uq0Var2.mo75928xcd1e8d8());
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.dr0 dr0Var3 = new bw5.dr0();
                    if (bArr != null && bArr.length > 0) {
                        dr0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f109025d = dr0Var3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f109026e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.lp0 lp0Var3 = new bw5.lp0();
                    if (bArr2 != null && bArr2.length > 0) {
                        lp0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f109027f = lp0Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.op0 op0Var3 = new bw5.op0();
                    if (bArr3 != null && bArr3.length > 0) {
                        op0Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f109028g = op0Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f109029h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f109030i = bw5.eq0.a(aVar2.g(intValue));
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.uq0 uq0Var3 = new bw5.uq0();
                    if (bArr4 != null && bArr4.length > 0) {
                        uq0Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f109031m = uq0Var3;
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}

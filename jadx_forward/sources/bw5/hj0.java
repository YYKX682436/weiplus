package bw5;

/* loaded from: classes2.dex */
public class hj0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f109771d;

    /* renamed from: e, reason: collision with root package name */
    public int f109772e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.v f109773f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.ya f109774g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.g3 f109775h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f109776i;

    /* renamed from: m, reason: collision with root package name */
    public int f109777m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f109778n;

    /* renamed from: o, reason: collision with root package name */
    public int f109779o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f109780p;

    /* renamed from: q, reason: collision with root package name */
    public int f109781q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f109782r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f109783s = new boolean[13];

    static {
        new bw5.hj0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.hj0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.hj0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hj0)) {
            return false;
        }
        bw5.hj0 hj0Var = (bw5.hj0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f109771d), java.lang.Integer.valueOf(hj0Var.f109771d)) && n51.f.a(java.lang.Integer.valueOf(this.f109772e), java.lang.Integer.valueOf(hj0Var.f109772e)) && n51.f.a(this.f109773f, hj0Var.f109773f) && n51.f.a(this.f109774g, hj0Var.f109774g) && n51.f.a(this.f109775h, hj0Var.f109775h) && n51.f.a(java.lang.Boolean.valueOf(this.f109776i), java.lang.Boolean.valueOf(hj0Var.f109776i)) && n51.f.a(java.lang.Integer.valueOf(this.f109777m), java.lang.Integer.valueOf(hj0Var.f109777m)) && n51.f.a(java.lang.Boolean.valueOf(this.f109778n), java.lang.Boolean.valueOf(hj0Var.f109778n)) && n51.f.a(java.lang.Integer.valueOf(this.f109779o), java.lang.Integer.valueOf(hj0Var.f109779o)) && n51.f.a(java.lang.Boolean.valueOf(this.f109780p), java.lang.Boolean.valueOf(hj0Var.f109780p)) && n51.f.a(java.lang.Integer.valueOf(this.f109781q), java.lang.Integer.valueOf(hj0Var.f109781q)) && n51.f.a(this.f109782r, hj0Var.f109782r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.hj0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f109783s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f109771d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f109772e);
            }
            bw5.v vVar = this.f109773f;
            if (vVar != null && zArr[3]) {
                fVar.i(3, vVar.mo75928xcd1e8d8());
                this.f109773f.mo75956x3d5d1f78(fVar);
            }
            bw5.ya yaVar = this.f109774g;
            if (yaVar != null && zArr[4]) {
                fVar.i(4, yaVar.mo75928xcd1e8d8());
                this.f109774g.mo75956x3d5d1f78(fVar);
            }
            bw5.g3 g3Var = this.f109775h;
            if (g3Var != null && zArr[5]) {
                fVar.i(5, g3Var.mo75928xcd1e8d8());
                this.f109775h.mo75956x3d5d1f78(fVar);
            }
            if (zArr[6]) {
                fVar.a(6, this.f109776i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f109777m);
            }
            if (zArr[8]) {
                fVar.a(8, this.f109778n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f109779o);
            }
            if (zArr[10]) {
                fVar.a(10, this.f109780p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f109781q);
            }
            java.lang.String str = this.f109782r;
            if (str == null || !zArr[12]) {
                return 0;
            }
            fVar.j(12, str);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f109771d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f109772e);
            }
            bw5.v vVar2 = this.f109773f;
            if (vVar2 != null && zArr[3]) {
                e17 += b36.f.i(3, vVar2.mo75928xcd1e8d8());
            }
            bw5.ya yaVar2 = this.f109774g;
            if (yaVar2 != null && zArr[4]) {
                e17 += b36.f.i(4, yaVar2.mo75928xcd1e8d8());
            }
            bw5.g3 g3Var2 = this.f109775h;
            if (g3Var2 != null && zArr[5]) {
                e17 += b36.f.i(5, g3Var2.mo75928xcd1e8d8());
            }
            if (zArr[6]) {
                e17 += b36.f.a(6, this.f109776i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f109777m);
            }
            if (zArr[8]) {
                e17 += b36.f.a(8, this.f109778n);
            }
            if (zArr[9]) {
                e17 += b36.f.e(9, this.f109779o);
            }
            if (zArr[10]) {
                e17 += b36.f.a(10, this.f109780p);
            }
            if (zArr[11]) {
                e17 += b36.f.e(11, this.f109781q);
            }
            java.lang.String str2 = this.f109782r;
            return (str2 == null || !zArr[12]) ? e17 : e17 + b36.f.j(12, str2);
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
                this.f109771d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f109772e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.v vVar3 = new bw5.v();
                    if (bArr != null && bArr.length > 0) {
                        vVar3.mo11468x92b714fd(bArr);
                    }
                    this.f109773f = vVar3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.ya yaVar3 = new bw5.ya();
                    if (bArr2 != null && bArr2.length > 0) {
                        yaVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f109774g = yaVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.g3 g3Var3 = new bw5.g3();
                    if (bArr3 != null && bArr3.length > 0) {
                        g3Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f109775h = g3Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f109776i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f109777m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f109778n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f109779o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f109780p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f109781q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f109782r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}

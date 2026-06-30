package m53;

/* loaded from: classes4.dex */
public class l1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public m53.g0 f405392d;

    /* renamed from: e, reason: collision with root package name */
    public m53.h3 f405393e;

    /* renamed from: f, reason: collision with root package name */
    public m53.n4 f405394f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f405395g;

    /* renamed from: h, reason: collision with root package name */
    public m53.v2 f405396h;

    /* renamed from: i, reason: collision with root package name */
    public m53.m f405397i;

    /* renamed from: m, reason: collision with root package name */
    public m53.e0 f405398m;

    /* renamed from: n, reason: collision with root package name */
    public m53.t f405399n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.l1)) {
            return false;
        }
        m53.l1 l1Var = (m53.l1) fVar;
        return n51.f.a(this.f405392d, l1Var.f405392d) && n51.f.a(this.f405393e, l1Var.f405393e) && n51.f.a(this.f405394f, l1Var.f405394f) && n51.f.a(java.lang.Boolean.valueOf(this.f405395g), java.lang.Boolean.valueOf(l1Var.f405395g)) && n51.f.a(this.f405396h, l1Var.f405396h) && n51.f.a(this.f405397i, l1Var.f405397i) && n51.f.a(this.f405398m, l1Var.f405398m) && n51.f.a(this.f405399n, l1Var.f405399n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            m53.g0 g0Var = this.f405392d;
            if (g0Var != null) {
                fVar.i(1, g0Var.mo75928xcd1e8d8());
                this.f405392d.mo75956x3d5d1f78(fVar);
            }
            m53.h3 h3Var = this.f405393e;
            if (h3Var != null) {
                fVar.i(2, h3Var.mo75928xcd1e8d8());
                this.f405393e.mo75956x3d5d1f78(fVar);
            }
            m53.n4 n4Var = this.f405394f;
            if (n4Var != null) {
                fVar.i(3, n4Var.mo75928xcd1e8d8());
                this.f405394f.mo75956x3d5d1f78(fVar);
            }
            fVar.a(4, this.f405395g);
            m53.v2 v2Var = this.f405396h;
            if (v2Var != null) {
                fVar.i(5, v2Var.mo75928xcd1e8d8());
                this.f405396h.mo75956x3d5d1f78(fVar);
            }
            m53.m mVar = this.f405397i;
            if (mVar != null) {
                fVar.i(6, mVar.mo75928xcd1e8d8());
                this.f405397i.mo75956x3d5d1f78(fVar);
            }
            m53.e0 e0Var = this.f405398m;
            if (e0Var != null) {
                fVar.i(7, e0Var.mo75928xcd1e8d8());
                this.f405398m.mo75956x3d5d1f78(fVar);
            }
            m53.t tVar = this.f405399n;
            if (tVar != null) {
                fVar.i(8, tVar.mo75928xcd1e8d8());
                this.f405399n.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            m53.g0 g0Var2 = this.f405392d;
            int i18 = g0Var2 != null ? 0 + b36.f.i(1, g0Var2.mo75928xcd1e8d8()) : 0;
            m53.h3 h3Var2 = this.f405393e;
            if (h3Var2 != null) {
                i18 += b36.f.i(2, h3Var2.mo75928xcd1e8d8());
            }
            m53.n4 n4Var2 = this.f405394f;
            if (n4Var2 != null) {
                i18 += b36.f.i(3, n4Var2.mo75928xcd1e8d8());
            }
            int a17 = i18 + b36.f.a(4, this.f405395g);
            m53.v2 v2Var2 = this.f405396h;
            if (v2Var2 != null) {
                a17 += b36.f.i(5, v2Var2.mo75928xcd1e8d8());
            }
            m53.m mVar2 = this.f405397i;
            if (mVar2 != null) {
                a17 += b36.f.i(6, mVar2.mo75928xcd1e8d8());
            }
            m53.e0 e0Var2 = this.f405398m;
            if (e0Var2 != null) {
                a17 += b36.f.i(7, e0Var2.mo75928xcd1e8d8());
            }
            m53.t tVar2 = this.f405399n;
            return tVar2 != null ? a17 + b36.f.i(8, tVar2.mo75928xcd1e8d8()) : a17;
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
        m53.l1 l1Var = (m53.l1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    m53.g0 g0Var3 = new m53.g0();
                    if (bArr != null && bArr.length > 0) {
                        g0Var3.mo11468x92b714fd(bArr);
                    }
                    l1Var.f405392d = g0Var3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    m53.h3 h3Var3 = new m53.h3();
                    if (bArr2 != null && bArr2.length > 0) {
                        h3Var3.mo11468x92b714fd(bArr2);
                    }
                    l1Var.f405393e = h3Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    m53.n4 n4Var3 = new m53.n4();
                    if (bArr3 != null && bArr3.length > 0) {
                        n4Var3.mo11468x92b714fd(bArr3);
                    }
                    l1Var.f405394f = n4Var3;
                }
                return 0;
            case 4:
                l1Var.f405395g = aVar2.c(intValue);
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    m53.v2 v2Var3 = new m53.v2();
                    if (bArr4 != null && bArr4.length > 0) {
                        v2Var3.mo11468x92b714fd(bArr4);
                    }
                    l1Var.f405396h = v2Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    m53.m mVar3 = new m53.m();
                    if (bArr5 != null && bArr5.length > 0) {
                        mVar3.mo11468x92b714fd(bArr5);
                    }
                    l1Var.f405397i = mVar3;
                }
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    m53.e0 e0Var3 = new m53.e0();
                    if (bArr6 != null && bArr6.length > 0) {
                        e0Var3.mo11468x92b714fd(bArr6);
                    }
                    l1Var.f405398m = e0Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    m53.t tVar3 = new m53.t();
                    if (bArr7 != null && bArr7.length > 0) {
                        tVar3.mo11468x92b714fd(bArr7);
                    }
                    l1Var.f405399n = tVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

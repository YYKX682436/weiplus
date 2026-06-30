package m53;

/* loaded from: classes4.dex */
public class a4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f405093d;

    /* renamed from: e, reason: collision with root package name */
    public int f405094e;

    /* renamed from: f, reason: collision with root package name */
    public int f405095f;

    /* renamed from: g, reason: collision with root package name */
    public m53.i0 f405096g;

    /* renamed from: h, reason: collision with root package name */
    public int f405097h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.a4)) {
            return false;
        }
        m53.a4 a4Var = (m53.a4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f405093d), java.lang.Integer.valueOf(a4Var.f405093d)) && n51.f.a(java.lang.Integer.valueOf(this.f405094e), java.lang.Integer.valueOf(a4Var.f405094e)) && n51.f.a(java.lang.Integer.valueOf(this.f405095f), java.lang.Integer.valueOf(a4Var.f405095f)) && n51.f.a(this.f405096g, a4Var.f405096g) && n51.f.a(java.lang.Integer.valueOf(this.f405097h), java.lang.Integer.valueOf(a4Var.f405097h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f405093d);
            fVar.e(2, this.f405094e);
            fVar.e(3, this.f405095f);
            m53.i0 i0Var = this.f405096g;
            if (i0Var != null) {
                fVar.i(4, i0Var.mo75928xcd1e8d8());
                this.f405096g.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f405097h);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f405093d) + 0 + b36.f.e(2, this.f405094e) + b36.f.e(3, this.f405095f);
            m53.i0 i0Var2 = this.f405096g;
            if (i0Var2 != null) {
                e17 += b36.f.i(4, i0Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(5, this.f405097h);
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
        m53.a4 a4Var = (m53.a4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            a4Var.f405093d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            a4Var.f405094e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            a4Var.f405095f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            a4Var.f405097h = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            m53.i0 i0Var3 = new m53.i0();
            if (bArr != null && bArr.length > 0) {
                i0Var3.mo11468x92b714fd(bArr);
            }
            a4Var.f405096g = i0Var3;
        }
        return 0;
    }
}

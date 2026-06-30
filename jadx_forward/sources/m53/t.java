package m53;

/* loaded from: classes8.dex */
public class t extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f405596d;

    /* renamed from: e, reason: collision with root package name */
    public m53.f4 f405597e;

    /* renamed from: f, reason: collision with root package name */
    public m53.l f405598f;

    /* renamed from: g, reason: collision with root package name */
    public m53.t5 f405599g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.t)) {
            return false;
        }
        m53.t tVar = (m53.t) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f405596d), java.lang.Boolean.valueOf(tVar.f405596d)) && n51.f.a(this.f405597e, tVar.f405597e) && n51.f.a(this.f405598f, tVar.f405598f) && n51.f.a(this.f405599g, tVar.f405599g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f405596d);
            m53.f4 f4Var = this.f405597e;
            if (f4Var != null) {
                fVar.i(2, f4Var.mo75928xcd1e8d8());
                this.f405597e.mo75956x3d5d1f78(fVar);
            }
            m53.l lVar = this.f405598f;
            if (lVar != null) {
                fVar.i(3, lVar.mo75928xcd1e8d8());
                this.f405598f.mo75956x3d5d1f78(fVar);
            }
            m53.t5 t5Var = this.f405599g;
            if (t5Var != null) {
                fVar.i(4, t5Var.mo75928xcd1e8d8());
                this.f405599g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f405596d) + 0;
            m53.f4 f4Var2 = this.f405597e;
            if (f4Var2 != null) {
                a17 += b36.f.i(2, f4Var2.mo75928xcd1e8d8());
            }
            m53.l lVar2 = this.f405598f;
            if (lVar2 != null) {
                a17 += b36.f.i(3, lVar2.mo75928xcd1e8d8());
            }
            m53.t5 t5Var2 = this.f405599g;
            return t5Var2 != null ? a17 + b36.f.i(4, t5Var2.mo75928xcd1e8d8()) : a17;
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
        m53.t tVar = (m53.t) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            tVar.f405596d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                m53.f4 f4Var3 = new m53.f4();
                if (bArr != null && bArr.length > 0) {
                    f4Var3.mo11468x92b714fd(bArr);
                }
                tVar.f405597e = f4Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                m53.l lVar3 = new m53.l();
                if (bArr2 != null && bArr2.length > 0) {
                    lVar3.mo11468x92b714fd(bArr2);
                }
                tVar.f405598f = lVar3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            m53.t5 t5Var3 = new m53.t5();
            if (bArr3 != null && bArr3.length > 0) {
                t5Var3.mo11468x92b714fd(bArr3);
            }
            tVar.f405599g = t5Var3;
        }
        return 0;
    }
}

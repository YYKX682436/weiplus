package m53;

/* loaded from: classes8.dex */
public class z0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public m53.h f405748d;

    /* renamed from: e, reason: collision with root package name */
    public m53.b1 f405749e;

    /* renamed from: f, reason: collision with root package name */
    public m53.a1 f405750f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f405751g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.z0)) {
            return false;
        }
        m53.z0 z0Var = (m53.z0) fVar;
        return n51.f.a(this.f405748d, z0Var.f405748d) && n51.f.a(this.f405749e, z0Var.f405749e) && n51.f.a(this.f405750f, z0Var.f405750f) && n51.f.a(this.f405751g, z0Var.f405751g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            m53.h hVar = this.f405748d;
            if (hVar != null) {
                fVar.i(1, hVar.mo75928xcd1e8d8());
                this.f405748d.mo75956x3d5d1f78(fVar);
            }
            m53.b1 b1Var = this.f405749e;
            if (b1Var != null) {
                fVar.i(2, b1Var.mo75928xcd1e8d8());
                this.f405749e.mo75956x3d5d1f78(fVar);
            }
            m53.a1 a1Var = this.f405750f;
            if (a1Var != null) {
                fVar.i(3, a1Var.mo75928xcd1e8d8());
                this.f405750f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f405751g;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            m53.h hVar2 = this.f405748d;
            int i18 = hVar2 != null ? 0 + b36.f.i(1, hVar2.mo75928xcd1e8d8()) : 0;
            m53.b1 b1Var2 = this.f405749e;
            if (b1Var2 != null) {
                i18 += b36.f.i(2, b1Var2.mo75928xcd1e8d8());
            }
            m53.a1 a1Var2 = this.f405750f;
            if (a1Var2 != null) {
                i18 += b36.f.i(3, a1Var2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f405751g;
            return str2 != null ? i18 + b36.f.j(4, str2) : i18;
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
        m53.z0 z0Var = (m53.z0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                m53.h hVar3 = new m53.h();
                if (bArr != null && bArr.length > 0) {
                    hVar3.mo11468x92b714fd(bArr);
                }
                z0Var.f405748d = hVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                m53.b1 b1Var3 = new m53.b1();
                if (bArr2 != null && bArr2.length > 0) {
                    b1Var3.mo11468x92b714fd(bArr2);
                }
                z0Var.f405749e = b1Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            z0Var.f405751g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            m53.a1 a1Var3 = new m53.a1();
            if (bArr3 != null && bArr3.length > 0) {
                a1Var3.mo11468x92b714fd(bArr3);
            }
            z0Var.f405750f = a1Var3;
        }
        return 0;
    }
}

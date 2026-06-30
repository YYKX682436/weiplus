package t45;

/* loaded from: classes10.dex */
public class l0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f497134d;

    /* renamed from: e, reason: collision with root package name */
    public int f497135e;

    /* renamed from: f, reason: collision with root package name */
    public int f497136f;

    /* renamed from: g, reason: collision with root package name */
    public t45.e0 f497137g;

    /* renamed from: h, reason: collision with root package name */
    public t45.f f497138h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof t45.l0)) {
            return false;
        }
        t45.l0 l0Var = (t45.l0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f497134d), java.lang.Integer.valueOf(l0Var.f497134d)) && n51.f.a(java.lang.Integer.valueOf(this.f497135e), java.lang.Integer.valueOf(l0Var.f497135e)) && n51.f.a(java.lang.Integer.valueOf(this.f497136f), java.lang.Integer.valueOf(l0Var.f497136f)) && n51.f.a(this.f497137g, l0Var.f497137g) && n51.f.a(this.f497138h, l0Var.f497138h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f497134d);
            fVar.e(2, this.f497135e);
            fVar.e(3, this.f497136f);
            t45.e0 e0Var = this.f497137g;
            if (e0Var != null) {
                fVar.i(4, e0Var.mo75928xcd1e8d8());
                this.f497137g.mo75956x3d5d1f78(fVar);
            }
            t45.f fVar2 = this.f497138h;
            if (fVar2 != null) {
                fVar.i(5, fVar2.mo75928xcd1e8d8());
                this.f497138h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f497134d) + 0 + b36.f.e(2, this.f497135e) + b36.f.e(3, this.f497136f);
            t45.e0 e0Var2 = this.f497137g;
            if (e0Var2 != null) {
                e17 += b36.f.i(4, e0Var2.mo75928xcd1e8d8());
            }
            t45.f fVar3 = this.f497138h;
            return fVar3 != null ? e17 + b36.f.i(5, fVar3.mo75928xcd1e8d8()) : e17;
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
        t45.l0 l0Var = (t45.l0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            l0Var.f497134d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            l0Var.f497135e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            l0Var.f497136f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                t45.e0 e0Var3 = new t45.e0();
                if (bArr != null && bArr.length > 0) {
                    e0Var3.mo11468x92b714fd(bArr);
                }
                l0Var.f497137g = e0Var3;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            t45.f fVar4 = new t45.f();
            if (bArr2 != null && bArr2.length > 0) {
                fVar4.mo11468x92b714fd(bArr2);
            }
            l0Var.f497138h = fVar4;
        }
        return 0;
    }
}

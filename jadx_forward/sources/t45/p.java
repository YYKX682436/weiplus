package t45;

/* loaded from: classes2.dex */
public class p extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public t45.l0 f497159d;

    /* renamed from: e, reason: collision with root package name */
    public t45.n0 f497160e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof t45.p)) {
            return false;
        }
        t45.p pVar = (t45.p) fVar;
        return n51.f.a(this.f497159d, pVar.f497159d) && n51.f.a(this.f497160e, pVar.f497160e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            t45.l0 l0Var = this.f497159d;
            if (l0Var != null) {
                fVar.i(1, l0Var.mo75928xcd1e8d8());
                this.f497159d.mo75956x3d5d1f78(fVar);
            }
            t45.n0 n0Var = this.f497160e;
            if (n0Var != null) {
                fVar.i(2, n0Var.mo75928xcd1e8d8());
                this.f497160e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            t45.l0 l0Var2 = this.f497159d;
            int i18 = l0Var2 != null ? 0 + b36.f.i(1, l0Var2.mo75928xcd1e8d8()) : 0;
            t45.n0 n0Var2 = this.f497160e;
            return n0Var2 != null ? i18 + b36.f.i(2, n0Var2.mo75928xcd1e8d8()) : i18;
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
        t45.p pVar = (t45.p) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                t45.l0 l0Var3 = new t45.l0();
                if (bArr != null && bArr.length > 0) {
                    l0Var3.mo11468x92b714fd(bArr);
                }
                pVar.f497159d = l0Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            t45.n0 n0Var3 = new t45.n0();
            if (bArr2 != null && bArr2.length > 0) {
                n0Var3.mo11468x92b714fd(bArr2);
            }
            pVar.f497160e = n0Var3;
        }
        return 0;
    }
}

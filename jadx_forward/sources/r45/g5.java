package r45;

/* loaded from: classes4.dex */
public class g5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.f76 f456418d;

    /* renamed from: e, reason: collision with root package name */
    public r45.du5 f456419e;

    /* renamed from: f, reason: collision with root package name */
    public int f456420f;

    /* renamed from: g, reason: collision with root package name */
    public r45.mo5 f456421g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g5)) {
            return false;
        }
        r45.g5 g5Var = (r45.g5) fVar;
        return n51.f.a(this.f456418d, g5Var.f456418d) && n51.f.a(this.f456419e, g5Var.f456419e) && n51.f.a(java.lang.Integer.valueOf(this.f456420f), java.lang.Integer.valueOf(g5Var.f456420f)) && n51.f.a(this.f456421g, g5Var.f456421g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.f76 f76Var = this.f456418d;
            if (f76Var != null) {
                fVar.i(1, f76Var.mo75928xcd1e8d8());
                this.f456418d.mo75956x3d5d1f78(fVar);
            }
            r45.du5 du5Var = this.f456419e;
            if (du5Var != null) {
                fVar.i(2, du5Var.mo75928xcd1e8d8());
                this.f456419e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f456420f);
            r45.mo5 mo5Var = this.f456421g;
            if (mo5Var != null) {
                fVar.i(4, mo5Var.mo75928xcd1e8d8());
                this.f456421g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.f76 f76Var2 = this.f456418d;
            int i18 = f76Var2 != null ? 0 + b36.f.i(1, f76Var2.mo75928xcd1e8d8()) : 0;
            r45.du5 du5Var2 = this.f456419e;
            if (du5Var2 != null) {
                i18 += b36.f.i(2, du5Var2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(3, this.f456420f);
            r45.mo5 mo5Var2 = this.f456421g;
            return mo5Var2 != null ? e17 + b36.f.i(4, mo5Var2.mo75928xcd1e8d8()) : e17;
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
        r45.g5 g5Var = (r45.g5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.f76 f76Var3 = new r45.f76();
                if (bArr != null && bArr.length > 0) {
                    f76Var3.mo11468x92b714fd(bArr);
                }
                g5Var.f456418d = f76Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.du5 du5Var3 = new r45.du5();
                if (bArr2 != null && bArr2.length > 0) {
                    du5Var3.b(bArr2);
                }
                g5Var.f456419e = du5Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            g5Var.f456420f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.mo5 mo5Var3 = new r45.mo5();
            if (bArr3 != null && bArr3.length > 0) {
                mo5Var3.mo11468x92b714fd(bArr3);
            }
            g5Var.f456421g = mo5Var3;
        }
        return 0;
    }
}

package r45;

/* loaded from: classes4.dex */
public class yb7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.vb7 f472485d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f472486e;

    /* renamed from: f, reason: collision with root package name */
    public r45.l63 f472487f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yb7)) {
            return false;
        }
        r45.yb7 yb7Var = (r45.yb7) fVar;
        return n51.f.a(this.f472485d, yb7Var.f472485d) && n51.f.a(this.f472486e, yb7Var.f472486e) && n51.f.a(this.f472487f, yb7Var.f472487f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.vb7 vb7Var = this.f472485d;
            if (vb7Var != null) {
                fVar.i(1, vb7Var.mo75928xcd1e8d8());
                this.f472485d.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f472486e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            r45.l63 l63Var = this.f472487f;
            if (l63Var != null) {
                fVar.i(3, l63Var.mo75928xcd1e8d8());
                this.f472487f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.vb7 vb7Var2 = this.f472485d;
            int i18 = vb7Var2 != null ? 0 + b36.f.i(1, vb7Var2.mo75928xcd1e8d8()) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f472486e;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            r45.l63 l63Var2 = this.f472487f;
            return l63Var2 != null ? i18 + b36.f.i(3, l63Var2.mo75928xcd1e8d8()) : i18;
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
        r45.yb7 yb7Var = (r45.yb7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.vb7 vb7Var3 = new r45.vb7();
                if (bArr != null && bArr.length > 0) {
                    vb7Var3.mo11468x92b714fd(bArr);
                }
                yb7Var.f472485d = vb7Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            yb7Var.f472486e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.l63 l63Var3 = new r45.l63();
            if (bArr2 != null && bArr2.length > 0) {
                l63Var3.mo11468x92b714fd(bArr2);
            }
            yb7Var.f472487f = l63Var3;
        }
        return 0;
    }
}

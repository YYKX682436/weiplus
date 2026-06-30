package r45;

/* loaded from: classes4.dex */
public class l14 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.j14 f460603d;

    /* renamed from: e, reason: collision with root package name */
    public int f460604e;

    /* renamed from: f, reason: collision with root package name */
    public int f460605f;

    /* renamed from: g, reason: collision with root package name */
    public int f460606g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l14)) {
            return false;
        }
        r45.l14 l14Var = (r45.l14) fVar;
        return n51.f.a(this.f76492x92037252, l14Var.f76492x92037252) && n51.f.a(this.f460603d, l14Var.f460603d) && n51.f.a(java.lang.Integer.valueOf(this.f460604e), java.lang.Integer.valueOf(l14Var.f460604e)) && n51.f.a(java.lang.Integer.valueOf(this.f460605f), java.lang.Integer.valueOf(l14Var.f460605f)) && n51.f.a(java.lang.Integer.valueOf(this.f460606g), java.lang.Integer.valueOf(l14Var.f460606g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            r45.j14 j14Var = this.f460603d;
            if (j14Var != null) {
                fVar.i(2, j14Var.mo75928xcd1e8d8());
                this.f460603d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f460604e);
            fVar.e(4, this.f460605f);
            fVar.e(5, this.f460606g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.j14 j14Var2 = this.f460603d;
            if (j14Var2 != null) {
                i18 += b36.f.i(2, j14Var2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.e(3, this.f460604e) + b36.f.e(4, this.f460605f) + b36.f.e(5, this.f460606g);
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
        r45.l14 l14Var = (r45.l14) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr);
                }
                l14Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                l14Var.f460604e = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 4) {
                l14Var.f460605f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            l14Var.f460606g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.j14 j14Var3 = new r45.j14();
            if (bArr2 != null && bArr2.length > 0) {
                j14Var3.mo11468x92b714fd(bArr2);
            }
            l14Var.f460603d = j14Var3;
        }
        return 0;
    }
}

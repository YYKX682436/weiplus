package r45;

/* loaded from: classes10.dex */
public class ka0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.aj4 f460059d;

    /* renamed from: e, reason: collision with root package name */
    public r45.vl5 f460060e;

    /* renamed from: f, reason: collision with root package name */
    public r45.vl5 f460061f;

    /* renamed from: g, reason: collision with root package name */
    public r45.vl5 f460062g;

    /* renamed from: h, reason: collision with root package name */
    public r45.vl5 f460063h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ka0)) {
            return false;
        }
        r45.ka0 ka0Var = (r45.ka0) fVar;
        return n51.f.a(this.f460059d, ka0Var.f460059d) && n51.f.a(this.f460060e, ka0Var.f460060e) && n51.f.a(this.f460061f, ka0Var.f460061f) && n51.f.a(this.f460062g, ka0Var.f460062g) && n51.f.a(this.f460063h, ka0Var.f460063h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.aj4 aj4Var = this.f460059d;
            if (aj4Var != null) {
                fVar.i(1, aj4Var.mo75928xcd1e8d8());
                this.f460059d.mo75956x3d5d1f78(fVar);
            }
            r45.vl5 vl5Var = this.f460060e;
            if (vl5Var != null) {
                fVar.i(2, vl5Var.mo75928xcd1e8d8());
                this.f460060e.mo75956x3d5d1f78(fVar);
            }
            r45.vl5 vl5Var2 = this.f460061f;
            if (vl5Var2 != null) {
                fVar.i(3, vl5Var2.mo75928xcd1e8d8());
                this.f460061f.mo75956x3d5d1f78(fVar);
            }
            r45.vl5 vl5Var3 = this.f460062g;
            if (vl5Var3 != null) {
                fVar.i(4, vl5Var3.mo75928xcd1e8d8());
                this.f460062g.mo75956x3d5d1f78(fVar);
            }
            r45.vl5 vl5Var4 = this.f460063h;
            if (vl5Var4 != null) {
                fVar.i(5, vl5Var4.mo75928xcd1e8d8());
                this.f460063h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.aj4 aj4Var2 = this.f460059d;
            int i18 = aj4Var2 != null ? 0 + b36.f.i(1, aj4Var2.mo75928xcd1e8d8()) : 0;
            r45.vl5 vl5Var5 = this.f460060e;
            if (vl5Var5 != null) {
                i18 += b36.f.i(2, vl5Var5.mo75928xcd1e8d8());
            }
            r45.vl5 vl5Var6 = this.f460061f;
            if (vl5Var6 != null) {
                i18 += b36.f.i(3, vl5Var6.mo75928xcd1e8d8());
            }
            r45.vl5 vl5Var7 = this.f460062g;
            if (vl5Var7 != null) {
                i18 += b36.f.i(4, vl5Var7.mo75928xcd1e8d8());
            }
            r45.vl5 vl5Var8 = this.f460063h;
            return vl5Var8 != null ? i18 + b36.f.i(5, vl5Var8.mo75928xcd1e8d8()) : i18;
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
        r45.ka0 ka0Var = (r45.ka0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.aj4 aj4Var3 = new r45.aj4();
                if (bArr != null && bArr.length > 0) {
                    aj4Var3.mo11468x92b714fd(bArr);
                }
                ka0Var.f460059d = aj4Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.vl5 vl5Var9 = new r45.vl5();
                if (bArr2 != null && bArr2.length > 0) {
                    vl5Var9.mo11468x92b714fd(bArr2);
                }
                ka0Var.f460060e = vl5Var9;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.vl5 vl5Var10 = new r45.vl5();
                if (bArr3 != null && bArr3.length > 0) {
                    vl5Var10.mo11468x92b714fd(bArr3);
                }
                ka0Var.f460061f = vl5Var10;
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i29 = 0; i29 < size4; i29++) {
                byte[] bArr4 = (byte[]) j27.get(i29);
                r45.vl5 vl5Var11 = new r45.vl5();
                if (bArr4 != null && bArr4.length > 0) {
                    vl5Var11.mo11468x92b714fd(bArr4);
                }
                ka0Var.f460062g = vl5Var11;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j28 = aVar2.j(intValue);
        int size5 = j28.size();
        for (int i37 = 0; i37 < size5; i37++) {
            byte[] bArr5 = (byte[]) j28.get(i37);
            r45.vl5 vl5Var12 = new r45.vl5();
            if (bArr5 != null && bArr5.length > 0) {
                vl5Var12.mo11468x92b714fd(bArr5);
            }
            ka0Var.f460063h = vl5Var12;
        }
        return 0;
    }
}

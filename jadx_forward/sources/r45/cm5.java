package r45;

/* loaded from: classes9.dex */
public class cm5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.vn f453200d;

    /* renamed from: e, reason: collision with root package name */
    public r45.c14 f453201e;

    /* renamed from: f, reason: collision with root package name */
    public int f453202f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cm5)) {
            return false;
        }
        r45.cm5 cm5Var = (r45.cm5) fVar;
        return n51.f.a(this.f453200d, cm5Var.f453200d) && n51.f.a(this.f453201e, cm5Var.f453201e) && n51.f.a(java.lang.Integer.valueOf(this.f453202f), java.lang.Integer.valueOf(cm5Var.f453202f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.vn vnVar = this.f453200d;
            if (vnVar != null) {
                fVar.i(1, vnVar.mo75928xcd1e8d8());
                this.f453200d.mo75956x3d5d1f78(fVar);
            }
            r45.c14 c14Var = this.f453201e;
            if (c14Var != null) {
                fVar.i(2, c14Var.mo75928xcd1e8d8());
                this.f453201e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f453202f);
            return 0;
        }
        if (i17 == 1) {
            r45.vn vnVar2 = this.f453200d;
            int i18 = vnVar2 != null ? 0 + b36.f.i(1, vnVar2.mo75928xcd1e8d8()) : 0;
            r45.c14 c14Var2 = this.f453201e;
            if (c14Var2 != null) {
                i18 += b36.f.i(2, c14Var2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.e(3, this.f453202f);
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
        r45.cm5 cm5Var = (r45.cm5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.vn vnVar3 = new r45.vn();
                if (bArr != null && bArr.length > 0) {
                    vnVar3.mo11468x92b714fd(bArr);
                }
                cm5Var.f453200d = vnVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            cm5Var.f453202f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.c14 c14Var3 = new r45.c14();
            if (bArr2 != null && bArr2.length > 0) {
                c14Var3.mo11468x92b714fd(bArr2);
            }
            cm5Var.f453201e = c14Var3;
        }
        return 0;
    }
}

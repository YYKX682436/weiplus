package r45;

/* loaded from: classes7.dex */
public class ce7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.be7 f453045d;

    /* renamed from: e, reason: collision with root package name */
    public r45.b10 f453046e;

    /* renamed from: f, reason: collision with root package name */
    public int f453047f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ce7)) {
            return false;
        }
        r45.ce7 ce7Var = (r45.ce7) fVar;
        return n51.f.a(this.f453045d, ce7Var.f453045d) && n51.f.a(this.f453046e, ce7Var.f453046e) && n51.f.a(java.lang.Integer.valueOf(this.f453047f), java.lang.Integer.valueOf(ce7Var.f453047f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.be7 be7Var = this.f453045d;
            if (be7Var != null) {
                fVar.i(1, be7Var.mo75928xcd1e8d8());
                this.f453045d.mo75956x3d5d1f78(fVar);
            }
            r45.b10 b10Var = this.f453046e;
            if (b10Var != null) {
                fVar.i(2, b10Var.mo75928xcd1e8d8());
                this.f453046e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f453047f);
            return 0;
        }
        if (i17 == 1) {
            r45.be7 be7Var2 = this.f453045d;
            int i18 = be7Var2 != null ? 0 + b36.f.i(1, be7Var2.mo75928xcd1e8d8()) : 0;
            r45.b10 b10Var2 = this.f453046e;
            if (b10Var2 != null) {
                i18 += b36.f.i(2, b10Var2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.e(3, this.f453047f);
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
        r45.ce7 ce7Var = (r45.ce7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.be7 be7Var3 = new r45.be7();
                if (bArr != null && bArr.length > 0) {
                    be7Var3.mo11468x92b714fd(bArr);
                }
                ce7Var.f453045d = be7Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            ce7Var.f453047f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.b10 b10Var3 = new r45.b10();
            if (bArr2 != null && bArr2.length > 0) {
                b10Var3.mo11468x92b714fd(bArr2);
            }
            ce7Var.f453046e = b10Var3;
        }
        return 0;
    }
}

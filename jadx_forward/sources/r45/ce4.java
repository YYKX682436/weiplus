package r45;

/* loaded from: classes9.dex */
public class ce4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453033d;

    /* renamed from: e, reason: collision with root package name */
    public int f453034e;

    /* renamed from: f, reason: collision with root package name */
    public r45.de4 f453035f;

    /* renamed from: g, reason: collision with root package name */
    public r45.de4 f453036g;

    /* renamed from: h, reason: collision with root package name */
    public r45.de4 f453037h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ce4)) {
            return false;
        }
        r45.ce4 ce4Var = (r45.ce4) fVar;
        return n51.f.a(this.f453033d, ce4Var.f453033d) && n51.f.a(java.lang.Integer.valueOf(this.f453034e), java.lang.Integer.valueOf(ce4Var.f453034e)) && n51.f.a(this.f453035f, ce4Var.f453035f) && n51.f.a(this.f453036g, ce4Var.f453036g) && n51.f.a(this.f453037h, ce4Var.f453037h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f453033d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f453034e);
            r45.de4 de4Var = this.f453035f;
            if (de4Var != null) {
                fVar.i(3, de4Var.mo75928xcd1e8d8());
                this.f453035f.mo75956x3d5d1f78(fVar);
            }
            r45.de4 de4Var2 = this.f453036g;
            if (de4Var2 != null) {
                fVar.i(4, de4Var2.mo75928xcd1e8d8());
                this.f453036g.mo75956x3d5d1f78(fVar);
            }
            r45.de4 de4Var3 = this.f453037h;
            if (de4Var3 != null) {
                fVar.i(5, de4Var3.mo75928xcd1e8d8());
                this.f453037h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f453033d;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f453034e);
            r45.de4 de4Var4 = this.f453035f;
            if (de4Var4 != null) {
                j17 += b36.f.i(3, de4Var4.mo75928xcd1e8d8());
            }
            r45.de4 de4Var5 = this.f453036g;
            if (de4Var5 != null) {
                j17 += b36.f.i(4, de4Var5.mo75928xcd1e8d8());
            }
            r45.de4 de4Var6 = this.f453037h;
            return de4Var6 != null ? j17 + b36.f.i(5, de4Var6.mo75928xcd1e8d8()) : j17;
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
        r45.ce4 ce4Var = (r45.ce4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ce4Var.f453033d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ce4Var.f453034e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                r45.de4 de4Var7 = new r45.de4();
                if (bArr != null && bArr.length > 0) {
                    de4Var7.mo11468x92b714fd(bArr);
                }
                ce4Var.f453035f = de4Var7;
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size2 = j19.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j19.get(i19);
                r45.de4 de4Var8 = new r45.de4();
                if (bArr2 != null && bArr2.length > 0) {
                    de4Var8.mo11468x92b714fd(bArr2);
                }
                ce4Var.f453036g = de4Var8;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size3 = j27.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j27.get(i27);
            r45.de4 de4Var9 = new r45.de4();
            if (bArr3 != null && bArr3.length > 0) {
                de4Var9.mo11468x92b714fd(bArr3);
            }
            ce4Var.f453037h = de4Var9;
        }
        return 0;
    }
}

package r45;

/* loaded from: classes9.dex */
public class de3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453879d;

    /* renamed from: e, reason: collision with root package name */
    public int f453880e;

    /* renamed from: f, reason: collision with root package name */
    public r45.zq6 f453881f;

    static {
        new r45.de3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.de3)) {
            return false;
        }
        r45.de3 de3Var = (r45.de3) fVar;
        return n51.f.a(this.f453879d, de3Var.f453879d) && n51.f.a(java.lang.Integer.valueOf(this.f453880e), java.lang.Integer.valueOf(de3Var.f453880e)) && n51.f.a(this.f453881f, de3Var.f453881f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.de3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f453879d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f453880e);
            r45.zq6 zq6Var = this.f453881f;
            if (zq6Var != null) {
                fVar.i(3, zq6Var.mo75928xcd1e8d8());
                this.f453881f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f453879d;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f453880e);
            r45.zq6 zq6Var2 = this.f453881f;
            return zq6Var2 != null ? j17 + b36.f.i(3, zq6Var2.mo75928xcd1e8d8()) : j17;
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f453879d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f453880e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.zq6 zq6Var3 = new r45.zq6();
            if (bArr != null && bArr.length > 0) {
                zq6Var3.mo11468x92b714fd(bArr);
            }
            this.f453881f = zq6Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (r45.de3) super.mo11468x92b714fd(bArr);
    }
}

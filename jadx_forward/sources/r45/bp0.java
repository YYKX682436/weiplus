package r45;

/* loaded from: classes9.dex */
public class bp0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.du4 f452474d;

    /* renamed from: e, reason: collision with root package name */
    public int f452475e;

    /* renamed from: f, reason: collision with root package name */
    public int f452476f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bp0)) {
            return false;
        }
        r45.bp0 bp0Var = (r45.bp0) fVar;
        return n51.f.a(this.f452474d, bp0Var.f452474d) && n51.f.a(java.lang.Integer.valueOf(this.f452475e), java.lang.Integer.valueOf(bp0Var.f452475e)) && n51.f.a(java.lang.Integer.valueOf(this.f452476f), java.lang.Integer.valueOf(bp0Var.f452476f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.du4 du4Var = this.f452474d;
            if (du4Var != null) {
                fVar.i(1, du4Var.mo75928xcd1e8d8());
                this.f452474d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f452475e);
            fVar.e(3, this.f452476f);
            return 0;
        }
        if (i17 == 1) {
            r45.du4 du4Var2 = this.f452474d;
            return (du4Var2 != null ? 0 + b36.f.i(1, du4Var2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f452475e) + b36.f.e(3, this.f452476f);
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
        r45.bp0 bp0Var = (r45.bp0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                bp0Var.f452475e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            bp0Var.f452476f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.du4 du4Var3 = new r45.du4();
            if (bArr != null && bArr.length > 0) {
                du4Var3.mo11468x92b714fd(bArr);
            }
            bp0Var.f452474d = du4Var3;
        }
        return 0;
    }
}

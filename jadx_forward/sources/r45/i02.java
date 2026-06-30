package r45;

/* loaded from: classes9.dex */
public class i02 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f458145d;

    /* renamed from: e, reason: collision with root package name */
    public r45.zd4 f458146e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i02)) {
            return false;
        }
        r45.i02 i02Var = (r45.i02) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f458145d), java.lang.Integer.valueOf(i02Var.f458145d)) && n51.f.a(this.f458146e, i02Var.f458146e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f458145d);
            r45.zd4 zd4Var = this.f458146e;
            if (zd4Var != null) {
                fVar.i(2, zd4Var.mo75928xcd1e8d8());
                this.f458146e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f458145d) + 0;
            r45.zd4 zd4Var2 = this.f458146e;
            return zd4Var2 != null ? e17 + b36.f.i(2, zd4Var2.mo75928xcd1e8d8()) : e17;
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
        r45.i02 i02Var = (r45.i02) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            i02Var.f458145d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.zd4 zd4Var3 = new r45.zd4();
            if (bArr != null && bArr.length > 0) {
                zd4Var3.mo11468x92b714fd(bArr);
            }
            i02Var.f458146e = zd4Var3;
        }
        return 0;
    }
}

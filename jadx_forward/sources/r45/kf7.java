package r45;

/* loaded from: classes4.dex */
public class kf7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.cf7 f460200d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460201e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kf7)) {
            return false;
        }
        r45.kf7 kf7Var = (r45.kf7) fVar;
        return n51.f.a(this.f460200d, kf7Var.f460200d) && n51.f.a(this.f460201e, kf7Var.f460201e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.cf7 cf7Var = this.f460200d;
            if (cf7Var != null) {
                fVar.i(1, cf7Var.mo75928xcd1e8d8());
                this.f460200d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f460201e;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.cf7 cf7Var2 = this.f460200d;
            int i18 = cf7Var2 != null ? 0 + b36.f.i(1, cf7Var2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f460201e;
            return str2 != null ? i18 + b36.f.j(2, str2) : i18;
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
        r45.kf7 kf7Var = (r45.kf7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            kf7Var.f460201e = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.cf7 cf7Var3 = new r45.cf7();
            if (bArr != null && bArr.length > 0) {
                cf7Var3.mo11468x92b714fd(bArr);
            }
            kf7Var.f460200d = cf7Var3;
        }
        return 0;
    }
}

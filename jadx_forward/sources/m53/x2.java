package m53;

/* loaded from: classes4.dex */
public class x2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f405702d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405703e;

    /* renamed from: f, reason: collision with root package name */
    public m53.r3 f405704f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.x2)) {
            return false;
        }
        m53.x2 x2Var = (m53.x2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f405702d), java.lang.Integer.valueOf(x2Var.f405702d)) && n51.f.a(this.f405703e, x2Var.f405703e) && n51.f.a(this.f405704f, x2Var.f405704f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f405702d);
            java.lang.String str = this.f405703e;
            if (str != null) {
                fVar.j(2, str);
            }
            m53.r3 r3Var = this.f405704f;
            if (r3Var != null) {
                fVar.i(3, r3Var.mo75928xcd1e8d8());
                this.f405704f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f405702d) + 0;
            java.lang.String str2 = this.f405703e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            m53.r3 r3Var2 = this.f405704f;
            return r3Var2 != null ? e17 + b36.f.i(3, r3Var2.mo75928xcd1e8d8()) : e17;
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
        m53.x2 x2Var = (m53.x2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            x2Var.f405702d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            x2Var.f405703e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            m53.r3 r3Var3 = new m53.r3();
            if (bArr != null && bArr.length > 0) {
                r3Var3.mo11468x92b714fd(bArr);
            }
            x2Var.f405704f = r3Var3;
        }
        return 0;
    }
}

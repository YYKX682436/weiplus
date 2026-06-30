package r45;

/* loaded from: classes4.dex */
public class m86 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461780d;

    /* renamed from: e, reason: collision with root package name */
    public r45.l86 f461781e;

    /* renamed from: f, reason: collision with root package name */
    public int f461782f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m86)) {
            return false;
        }
        r45.m86 m86Var = (r45.m86) fVar;
        return n51.f.a(this.f461780d, m86Var.f461780d) && n51.f.a(this.f461781e, m86Var.f461781e) && n51.f.a(java.lang.Integer.valueOf(this.f461782f), java.lang.Integer.valueOf(m86Var.f461782f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f461780d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.l86 l86Var = this.f461781e;
            if (l86Var != null) {
                fVar.i(2, l86Var.mo75928xcd1e8d8());
                this.f461781e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f461782f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f461780d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.l86 l86Var2 = this.f461781e;
            if (l86Var2 != null) {
                j17 += b36.f.i(2, l86Var2.mo75928xcd1e8d8());
            }
            return j17 + b36.f.e(3, this.f461782f);
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
        r45.m86 m86Var = (r45.m86) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            m86Var.f461780d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            m86Var.f461782f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.l86 l86Var3 = new r45.l86();
            if (bArr != null && bArr.length > 0) {
                l86Var3.mo11468x92b714fd(bArr);
            }
            m86Var.f461781e = l86Var3;
        }
        return 0;
    }
}

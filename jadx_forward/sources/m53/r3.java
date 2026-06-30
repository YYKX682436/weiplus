package m53;

/* loaded from: classes4.dex */
public class r3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f405538d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405539e;

    /* renamed from: f, reason: collision with root package name */
    public int f405540f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.r3)) {
            return false;
        }
        m53.r3 r3Var = (m53.r3) fVar;
        return n51.f.a(this.f405538d, r3Var.f405538d) && n51.f.a(this.f405539e, r3Var.f405539e) && n51.f.a(java.lang.Integer.valueOf(this.f405540f), java.lang.Integer.valueOf(r3Var.f405540f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f405538d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f405539e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f405540f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f405538d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f405539e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f405540f);
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
        m53.r3 r3Var = (m53.r3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            r3Var.f405538d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            r3Var.f405539e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        r3Var.f405540f = aVar2.g(intValue);
        return 0;
    }
}

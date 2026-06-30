package m53;

/* loaded from: classes7.dex */
public class u extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f405612d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405613e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f405614f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f405615g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.u)) {
            return false;
        }
        m53.u uVar = (m53.u) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f405612d), java.lang.Integer.valueOf(uVar.f405612d)) && n51.f.a(this.f405613e, uVar.f405613e) && n51.f.a(this.f405614f, uVar.f405614f) && n51.f.a(this.f405615g, uVar.f405615g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f405612d);
            java.lang.String str = this.f405613e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f405614f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f405615g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f405612d) + 0;
            java.lang.String str4 = this.f405613e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f405614f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f405615g;
            return str6 != null ? e17 + b36.f.j(4, str6) : e17;
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
        m53.u uVar = (m53.u) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            uVar.f405612d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            uVar.f405613e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            uVar.f405614f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        uVar.f405615g = aVar2.k(intValue);
        return 0;
    }
}

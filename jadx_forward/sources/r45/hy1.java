package r45;

/* loaded from: classes7.dex */
public class hy1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f458084d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f458085e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f458086f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f458087g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hy1)) {
            return false;
        }
        r45.hy1 hy1Var = (r45.hy1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f458084d), java.lang.Integer.valueOf(hy1Var.f458084d)) && n51.f.a(this.f458085e, hy1Var.f458085e) && n51.f.a(this.f458086f, hy1Var.f458086f) && n51.f.a(this.f458087g, hy1Var.f458087g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f458084d);
            java.lang.String str = this.f458085e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f458086f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f458087g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f458084d) + 0;
            java.lang.String str4 = this.f458085e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f458086f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f458087g;
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
        r45.hy1 hy1Var = (r45.hy1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hy1Var.f458084d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            hy1Var.f458085e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            hy1Var.f458086f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        hy1Var.f458087g = aVar2.k(intValue);
        return 0;
    }
}

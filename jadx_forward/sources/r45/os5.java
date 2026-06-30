package r45;

/* loaded from: classes2.dex */
public class os5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464030d;

    /* renamed from: e, reason: collision with root package name */
    public int f464031e;

    /* renamed from: f, reason: collision with root package name */
    public int f464032f;

    /* renamed from: g, reason: collision with root package name */
    public int f464033g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.os5)) {
            return false;
        }
        r45.os5 os5Var = (r45.os5) fVar;
        return n51.f.a(this.f464030d, os5Var.f464030d) && n51.f.a(java.lang.Integer.valueOf(this.f464031e), java.lang.Integer.valueOf(os5Var.f464031e)) && n51.f.a(java.lang.Integer.valueOf(this.f464032f), java.lang.Integer.valueOf(os5Var.f464032f)) && n51.f.a(java.lang.Integer.valueOf(this.f464033g), java.lang.Integer.valueOf(os5Var.f464033g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f464030d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f464031e);
            fVar.e(3, this.f464032f);
            fVar.e(4, this.f464033g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f464030d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f464031e) + b36.f.e(3, this.f464032f) + b36.f.e(4, this.f464033g);
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
        r45.os5 os5Var = (r45.os5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            os5Var.f464030d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            os5Var.f464031e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            os5Var.f464032f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        os5Var.f464033g = aVar2.g(intValue);
        return 0;
    }
}

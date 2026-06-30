package r45;

/* loaded from: classes8.dex */
public class lo6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f461213d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461214e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f461215f;

    /* renamed from: g, reason: collision with root package name */
    public int f461216g;

    /* renamed from: h, reason: collision with root package name */
    public long f461217h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lo6)) {
            return false;
        }
        r45.lo6 lo6Var = (r45.lo6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f461213d), java.lang.Integer.valueOf(lo6Var.f461213d)) && n51.f.a(this.f461214e, lo6Var.f461214e) && n51.f.a(this.f461215f, lo6Var.f461215f) && n51.f.a(java.lang.Integer.valueOf(this.f461216g), java.lang.Integer.valueOf(lo6Var.f461216g)) && n51.f.a(java.lang.Long.valueOf(this.f461217h), java.lang.Long.valueOf(lo6Var.f461217h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f461213d);
            java.lang.String str = this.f461214e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f461215f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f461216g);
            fVar.h(5, this.f461217h);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f461213d) + 0;
            java.lang.String str3 = this.f461214e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f461215f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            return e17 + b36.f.e(4, this.f461216g) + b36.f.h(5, this.f461217h);
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
        r45.lo6 lo6Var = (r45.lo6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            lo6Var.f461213d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            lo6Var.f461214e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            lo6Var.f461215f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            lo6Var.f461216g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        lo6Var.f461217h = aVar2.i(intValue);
        return 0;
    }
}

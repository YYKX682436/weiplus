package r45;

/* loaded from: classes9.dex */
public class nq4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f463130d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f463131e;

    /* renamed from: f, reason: collision with root package name */
    public long f463132f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f463133g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f463134h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nq4)) {
            return false;
        }
        r45.nq4 nq4Var = (r45.nq4) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f463130d), java.lang.Long.valueOf(nq4Var.f463130d)) && n51.f.a(this.f463131e, nq4Var.f463131e) && n51.f.a(java.lang.Long.valueOf(this.f463132f), java.lang.Long.valueOf(nq4Var.f463132f)) && n51.f.a(this.f463133g, nq4Var.f463133g) && n51.f.a(this.f463134h, nq4Var.f463134h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f463130d);
            java.lang.String str = this.f463131e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f463132f);
            java.lang.String str2 = this.f463133g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f463134h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f463130d) + 0;
            java.lang.String str4 = this.f463131e;
            if (str4 != null) {
                h17 += b36.f.j(2, str4);
            }
            int h18 = h17 + b36.f.h(3, this.f463132f);
            java.lang.String str5 = this.f463133g;
            if (str5 != null) {
                h18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f463134h;
            return str6 != null ? h18 + b36.f.j(5, str6) : h18;
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
        r45.nq4 nq4Var = (r45.nq4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            nq4Var.f463130d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            nq4Var.f463131e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            nq4Var.f463132f = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            nq4Var.f463133g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        nq4Var.f463134h = aVar2.k(intValue);
        return 0;
    }
}

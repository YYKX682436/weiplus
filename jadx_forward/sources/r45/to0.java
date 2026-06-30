package r45;

/* loaded from: classes2.dex */
public class to0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f468156d;

    /* renamed from: e, reason: collision with root package name */
    public int f468157e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f468158f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f468159g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.to0)) {
            return false;
        }
        r45.to0 to0Var = (r45.to0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f468156d), java.lang.Integer.valueOf(to0Var.f468156d)) && n51.f.a(java.lang.Integer.valueOf(this.f468157e), java.lang.Integer.valueOf(to0Var.f468157e)) && n51.f.a(this.f468158f, to0Var.f468158f) && n51.f.a(this.f468159g, to0Var.f468159g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f468156d);
            fVar.e(2, this.f468157e);
            java.lang.String str = this.f468158f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f468159g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f468156d) + 0 + b36.f.e(2, this.f468157e);
            java.lang.String str3 = this.f468158f;
            if (str3 != null) {
                e17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f468159g;
            return str4 != null ? e17 + b36.f.j(4, str4) : e17;
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
        r45.to0 to0Var = (r45.to0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            to0Var.f468156d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            to0Var.f468157e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            to0Var.f468158f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        to0Var.f468159g = aVar2.k(intValue);
        return 0;
    }
}

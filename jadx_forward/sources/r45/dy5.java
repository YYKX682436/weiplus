package r45;

/* loaded from: classes10.dex */
public class dy5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f454388d;

    /* renamed from: e, reason: collision with root package name */
    public int f454389e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f454390f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f454391g;

    /* renamed from: h, reason: collision with root package name */
    public int f454392h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dy5)) {
            return false;
        }
        r45.dy5 dy5Var = (r45.dy5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f454388d), java.lang.Integer.valueOf(dy5Var.f454388d)) && n51.f.a(java.lang.Integer.valueOf(this.f454389e), java.lang.Integer.valueOf(dy5Var.f454389e)) && n51.f.a(this.f454390f, dy5Var.f454390f) && n51.f.a(this.f454391g, dy5Var.f454391g) && n51.f.a(java.lang.Integer.valueOf(this.f454392h), java.lang.Integer.valueOf(dy5Var.f454392h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f454388d);
            fVar.e(2, this.f454389e);
            java.lang.String str = this.f454390f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f454391g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f454392h);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f454388d) + 0 + b36.f.e(2, this.f454389e);
            java.lang.String str3 = this.f454390f;
            if (str3 != null) {
                e17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f454391g;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            return e17 + b36.f.e(5, this.f454392h);
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
        r45.dy5 dy5Var = (r45.dy5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            dy5Var.f454388d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            dy5Var.f454389e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            dy5Var.f454390f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            dy5Var.f454391g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        dy5Var.f454392h = aVar2.g(intValue);
        return 0;
    }
}

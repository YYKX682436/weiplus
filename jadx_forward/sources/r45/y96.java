package r45;

/* loaded from: classes4.dex */
public class y96 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472426d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472427e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f472428f;

    /* renamed from: g, reason: collision with root package name */
    public int f472429g;

    /* renamed from: h, reason: collision with root package name */
    public int f472430h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y96)) {
            return false;
        }
        r45.y96 y96Var = (r45.y96) fVar;
        return n51.f.a(this.f472426d, y96Var.f472426d) && n51.f.a(this.f472427e, y96Var.f472427e) && n51.f.a(this.f472428f, y96Var.f472428f) && n51.f.a(java.lang.Integer.valueOf(this.f472429g), java.lang.Integer.valueOf(y96Var.f472429g)) && n51.f.a(java.lang.Integer.valueOf(this.f472430h), java.lang.Integer.valueOf(y96Var.f472430h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f472426d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f472427e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f472428f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f472429g);
            fVar.e(5, this.f472430h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f472426d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f472427e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f472428f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.e(4, this.f472429g) + b36.f.e(5, this.f472430h);
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
        r45.y96 y96Var = (r45.y96) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            y96Var.f472426d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            y96Var.f472427e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            y96Var.f472428f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            y96Var.f472429g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        y96Var.f472430h = aVar2.g(intValue);
        return 0;
    }
}

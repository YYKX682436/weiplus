package r45;

/* loaded from: classes2.dex */
public class oj extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f463826d;

    /* renamed from: e, reason: collision with root package name */
    public int f463827e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f463828f;

    /* renamed from: g, reason: collision with root package name */
    public int f463829g;

    /* renamed from: h, reason: collision with root package name */
    public int f463830h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oj)) {
            return false;
        }
        r45.oj ojVar = (r45.oj) fVar;
        return n51.f.a(this.f463826d, ojVar.f463826d) && n51.f.a(java.lang.Integer.valueOf(this.f463827e), java.lang.Integer.valueOf(ojVar.f463827e)) && n51.f.a(this.f463828f, ojVar.f463828f) && n51.f.a(java.lang.Integer.valueOf(this.f463829g), java.lang.Integer.valueOf(ojVar.f463829g)) && n51.f.a(java.lang.Integer.valueOf(this.f463830h), java.lang.Integer.valueOf(ojVar.f463830h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f463826d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f463827e);
            java.lang.String str2 = this.f463828f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f463829g);
            fVar.e(5, this.f463830h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f463826d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f463827e);
            java.lang.String str4 = this.f463828f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            return j17 + b36.f.e(4, this.f463829g) + b36.f.e(5, this.f463830h);
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
        r45.oj ojVar = (r45.oj) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ojVar.f463826d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ojVar.f463827e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            ojVar.f463828f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            ojVar.f463829g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ojVar.f463830h = aVar2.g(intValue);
        return 0;
    }
}

package r45;

/* loaded from: classes2.dex */
public class v95 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f469538d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469539e;

    /* renamed from: f, reason: collision with root package name */
    public int f469540f;

    /* renamed from: g, reason: collision with root package name */
    public float f469541g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v95)) {
            return false;
        }
        r45.v95 v95Var = (r45.v95) fVar;
        return n51.f.a(this.f469538d, v95Var.f469538d) && n51.f.a(this.f469539e, v95Var.f469539e) && n51.f.a(java.lang.Integer.valueOf(this.f469540f), java.lang.Integer.valueOf(v95Var.f469540f)) && n51.f.a(java.lang.Float.valueOf(this.f469541g), java.lang.Float.valueOf(v95Var.f469541g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f469538d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f469539e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f469540f);
            fVar.d(4, this.f469541g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f469538d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f469539e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f469540f) + b36.f.d(4, this.f469541g);
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
        r45.v95 v95Var = (r45.v95) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            v95Var.f469538d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            v95Var.f469539e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            v95Var.f469540f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        v95Var.f469541g = aVar2.f(intValue);
        return 0;
    }
}

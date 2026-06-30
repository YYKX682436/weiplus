package r45;

/* loaded from: classes4.dex */
public class p9 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464394d;

    /* renamed from: e, reason: collision with root package name */
    public long f464395e;

    /* renamed from: f, reason: collision with root package name */
    public int f464396f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464397g;

    /* renamed from: h, reason: collision with root package name */
    public int f464398h;

    /* renamed from: i, reason: collision with root package name */
    public int f464399i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p9)) {
            return false;
        }
        r45.p9 p9Var = (r45.p9) fVar;
        return n51.f.a(this.f464394d, p9Var.f464394d) && n51.f.a(java.lang.Long.valueOf(this.f464395e), java.lang.Long.valueOf(p9Var.f464395e)) && n51.f.a(java.lang.Integer.valueOf(this.f464396f), java.lang.Integer.valueOf(p9Var.f464396f)) && n51.f.a(this.f464397g, p9Var.f464397g) && n51.f.a(java.lang.Integer.valueOf(this.f464398h), java.lang.Integer.valueOf(p9Var.f464398h)) && n51.f.a(java.lang.Integer.valueOf(this.f464399i), java.lang.Integer.valueOf(p9Var.f464399i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f464394d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f464395e);
            fVar.e(3, this.f464396f);
            java.lang.String str2 = this.f464397g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f464398h);
            fVar.e(6, this.f464399i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f464394d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.h(2, this.f464395e) + b36.f.e(3, this.f464396f);
            java.lang.String str4 = this.f464397g;
            if (str4 != null) {
                j17 += b36.f.j(4, str4);
            }
            return j17 + b36.f.e(5, this.f464398h) + b36.f.e(6, this.f464399i);
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
        r45.p9 p9Var = (r45.p9) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                p9Var.f464394d = aVar2.k(intValue);
                return 0;
            case 2:
                p9Var.f464395e = aVar2.i(intValue);
                return 0;
            case 3:
                p9Var.f464396f = aVar2.g(intValue);
                return 0;
            case 4:
                p9Var.f464397g = aVar2.k(intValue);
                return 0;
            case 5:
                p9Var.f464398h = aVar2.g(intValue);
                return 0;
            case 6:
                p9Var.f464399i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

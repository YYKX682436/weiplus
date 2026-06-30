package r45;

/* loaded from: classes9.dex */
public class io0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f458739d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f458740e;

    /* renamed from: f, reason: collision with root package name */
    public long f458741f;

    /* renamed from: g, reason: collision with root package name */
    public long f458742g;

    /* renamed from: h, reason: collision with root package name */
    public long f458743h;

    /* renamed from: i, reason: collision with root package name */
    public int f458744i;

    /* renamed from: m, reason: collision with root package name */
    public long f458745m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.io0)) {
            return false;
        }
        r45.io0 io0Var = (r45.io0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f458739d), java.lang.Integer.valueOf(io0Var.f458739d)) && n51.f.a(this.f458740e, io0Var.f458740e) && n51.f.a(java.lang.Long.valueOf(this.f458741f), java.lang.Long.valueOf(io0Var.f458741f)) && n51.f.a(java.lang.Long.valueOf(this.f458742g), java.lang.Long.valueOf(io0Var.f458742g)) && n51.f.a(java.lang.Long.valueOf(this.f458743h), java.lang.Long.valueOf(io0Var.f458743h)) && n51.f.a(java.lang.Integer.valueOf(this.f458744i), java.lang.Integer.valueOf(io0Var.f458744i)) && n51.f.a(java.lang.Long.valueOf(this.f458745m), java.lang.Long.valueOf(io0Var.f458745m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f458739d);
            java.lang.String str = this.f458740e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f458741f);
            fVar.h(4, this.f458742g);
            fVar.h(5, this.f458743h);
            fVar.e(6, this.f458744i);
            fVar.h(7, this.f458745m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f458739d) + 0;
            java.lang.String str2 = this.f458740e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.h(3, this.f458741f) + b36.f.h(4, this.f458742g) + b36.f.h(5, this.f458743h) + b36.f.e(6, this.f458744i) + b36.f.h(7, this.f458745m);
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
        r45.io0 io0Var = (r45.io0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                io0Var.f458739d = aVar2.g(intValue);
                return 0;
            case 2:
                io0Var.f458740e = aVar2.k(intValue);
                return 0;
            case 3:
                io0Var.f458741f = aVar2.i(intValue);
                return 0;
            case 4:
                io0Var.f458742g = aVar2.i(intValue);
                return 0;
            case 5:
                io0Var.f458743h = aVar2.i(intValue);
                return 0;
            case 6:
                io0Var.f458744i = aVar2.g(intValue);
                return 0;
            case 7:
                io0Var.f458745m = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

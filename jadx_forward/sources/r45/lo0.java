package r45;

/* loaded from: classes9.dex */
public class lo0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f461202d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461203e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f461204f;

    /* renamed from: g, reason: collision with root package name */
    public long f461205g;

    /* renamed from: h, reason: collision with root package name */
    public int f461206h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lo0)) {
            return false;
        }
        r45.lo0 lo0Var = (r45.lo0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f461202d), java.lang.Long.valueOf(lo0Var.f461202d)) && n51.f.a(this.f461203e, lo0Var.f461203e) && n51.f.a(this.f461204f, lo0Var.f461204f) && n51.f.a(java.lang.Long.valueOf(this.f461205g), java.lang.Long.valueOf(lo0Var.f461205g)) && n51.f.a(java.lang.Integer.valueOf(this.f461206h), java.lang.Integer.valueOf(lo0Var.f461206h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f461202d);
            java.lang.String str = this.f461203e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f461204f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.h(4, this.f461205g);
            fVar.e(5, this.f461206h);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f461202d) + 0;
            java.lang.String str3 = this.f461203e;
            if (str3 != null) {
                h17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f461204f;
            if (str4 != null) {
                h17 += b36.f.j(3, str4);
            }
            return h17 + b36.f.h(4, this.f461205g) + b36.f.e(5, this.f461206h);
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
        r45.lo0 lo0Var = (r45.lo0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            lo0Var.f461202d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            lo0Var.f461203e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            lo0Var.f461204f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            lo0Var.f461205g = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        lo0Var.f461206h = aVar2.g(intValue);
        return 0;
    }
}

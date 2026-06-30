package r45;

/* loaded from: classes9.dex */
public class gf5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f456731d;

    /* renamed from: e, reason: collision with root package name */
    public long f456732e;

    /* renamed from: f, reason: collision with root package name */
    public r45.na5 f456733f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f456734g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gf5)) {
            return false;
        }
        r45.gf5 gf5Var = (r45.gf5) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f456731d), java.lang.Long.valueOf(gf5Var.f456731d)) && n51.f.a(java.lang.Long.valueOf(this.f456732e), java.lang.Long.valueOf(gf5Var.f456732e)) && n51.f.a(this.f456733f, gf5Var.f456733f) && n51.f.a(this.f456734g, gf5Var.f456734g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f456734g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f456731d);
            fVar.h(2, this.f456732e);
            r45.na5 na5Var = this.f456733f;
            if (na5Var != null) {
                fVar.i(3, na5Var.mo75928xcd1e8d8());
                this.f456733f.mo75956x3d5d1f78(fVar);
            }
            fVar.g(4, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f456731d) + 0 + b36.f.h(2, this.f456732e);
            r45.na5 na5Var2 = this.f456733f;
            if (na5Var2 != null) {
                h17 += b36.f.i(3, na5Var2.mo75928xcd1e8d8());
            }
            return h17 + b36.f.g(4, 1, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.gf5 gf5Var = (r45.gf5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gf5Var.f456731d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            gf5Var.f456732e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            gf5Var.f456734g.add(aVar2.k(intValue));
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.na5 na5Var3 = new r45.na5();
            if (bArr2 != null && bArr2.length > 0) {
                na5Var3.mo11468x92b714fd(bArr2);
            }
            gf5Var.f456733f = na5Var3;
        }
        return 0;
    }
}

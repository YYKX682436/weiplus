package r45;

/* loaded from: classes8.dex */
public class oe5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f463733d;

    /* renamed from: e, reason: collision with root package name */
    public long f463734e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f463735f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f463736g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oe5)) {
            return false;
        }
        r45.oe5 oe5Var = (r45.oe5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f463733d), java.lang.Integer.valueOf(oe5Var.f463733d)) && n51.f.a(java.lang.Long.valueOf(this.f463734e), java.lang.Long.valueOf(oe5Var.f463734e)) && n51.f.a(this.f463735f, oe5Var.f463735f) && n51.f.a(java.lang.Integer.valueOf(this.f463736g), java.lang.Integer.valueOf(oe5Var.f463736g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f463735f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f463733d);
            fVar.h(2, this.f463734e);
            fVar.g(3, 8, linkedList);
            fVar.e(4, this.f463736g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f463733d) + 0 + b36.f.h(2, this.f463734e) + b36.f.g(3, 8, linkedList) + b36.f.e(4, this.f463736g);
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
        r45.oe5 oe5Var = (r45.oe5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            oe5Var.f463733d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            oe5Var.f463734e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            oe5Var.f463736g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.xe5 xe5Var = new r45.xe5();
            if (bArr2 != null && bArr2.length > 0) {
                xe5Var.mo11468x92b714fd(bArr2);
            }
            oe5Var.f463735f.add(xe5Var);
        }
        return 0;
    }
}

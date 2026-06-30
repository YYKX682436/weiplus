package r45;

/* loaded from: classes9.dex */
public class o46 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f463439d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f463440e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f463441f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f463442g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o46)) {
            return false;
        }
        r45.o46 o46Var = (r45.o46) fVar;
        return n51.f.a(this.f463439d, o46Var.f463439d) && n51.f.a(this.f463440e, o46Var.f463440e) && n51.f.a(this.f463441f, o46Var.f463441f) && n51.f.a(this.f463442g, o46Var.f463442g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f463442g;
        java.util.LinkedList linkedList2 = this.f463441f;
        java.util.LinkedList linkedList3 = this.f463440e;
        java.util.LinkedList linkedList4 = this.f463439d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, linkedList4);
            fVar.g(2, 1, linkedList3);
            fVar.g(3, 2, linkedList2);
            fVar.g(4, 2, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 1, linkedList4) + 0 + b36.f.g(2, 1, linkedList3) + b36.f.g(3, 2, linkedList2) + b36.f.g(4, 2, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList4.clear();
            linkedList3.clear();
            linkedList2.clear();
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
        r45.o46 o46Var = (r45.o46) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            o46Var.f463439d.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 2) {
            o46Var.f463440e.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 3) {
            o46Var.f463441f.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        o46Var.f463442g.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
        return 0;
    }
}

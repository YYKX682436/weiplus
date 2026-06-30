package r45;

/* loaded from: classes4.dex */
public class rq0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f466628d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f466629e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f466630f = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rq0)) {
            return false;
        }
        r45.rq0 rq0Var = (r45.rq0) fVar;
        return n51.f.a(this.f466628d, rq0Var.f466628d) && n51.f.a(this.f466629e, rq0Var.f466629e) && n51.f.a(this.f466630f, rq0Var.f466630f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f466630f;
        java.util.LinkedList linkedList2 = this.f466629e;
        java.util.LinkedList linkedList3 = this.f466628d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, linkedList3);
            fVar.g(2, 1, linkedList2);
            fVar.g(3, 2, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 1, linkedList3) + 0 + b36.f.g(2, 1, linkedList2) + b36.f.g(3, 2, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.rq0 rq0Var = (r45.rq0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            rq0Var.f466628d.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 2) {
            rq0Var.f466629e.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        rq0Var.f466630f.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
        return 0;
    }
}

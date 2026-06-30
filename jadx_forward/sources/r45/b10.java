package r45;

/* loaded from: classes4.dex */
public class b10 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f451958d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f451959e = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b10)) {
            return false;
        }
        r45.b10 b10Var = (r45.b10) fVar;
        return n51.f.a(this.f451958d, b10Var.f451958d) && n51.f.a(this.f451959e, b10Var.f451959e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f451959e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f451958d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            fVar.g(2, 6, linkedList);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f451958d;
            return (gVar2 != null ? 0 + b36.f.b(1, gVar2) : 0) + b36.f.g(2, 6, linkedList);
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
        r45.b10 b10Var = (r45.b10) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            b10Var.f451958d = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        b10Var.f451959e.add(aVar2.d(intValue));
        return 0;
    }
}

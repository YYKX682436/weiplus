package r45;

/* loaded from: classes7.dex */
public class p20 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f464209d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f464210e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464211f;

    /* renamed from: g, reason: collision with root package name */
    public long f464212g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p20)) {
            return false;
        }
        r45.p20 p20Var = (r45.p20) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f464209d), java.lang.Integer.valueOf(p20Var.f464209d)) && n51.f.a(this.f464210e, p20Var.f464210e) && n51.f.a(this.f464211f, p20Var.f464211f) && n51.f.a(java.lang.Long.valueOf(this.f464212g), java.lang.Long.valueOf(p20Var.f464212g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f464210e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f464209d);
            fVar.g(2, 1, linkedList);
            java.lang.String str = this.f464211f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f464212g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f464209d) + 0 + b36.f.g(2, 1, linkedList);
            java.lang.String str2 = this.f464211f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            return e17 + b36.f.h(4, this.f464212g);
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
        r45.p20 p20Var = (r45.p20) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            p20Var.f464209d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            p20Var.f464210e.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 3) {
            p20Var.f464211f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        p20Var.f464212g = aVar2.i(intValue);
        return 0;
    }
}

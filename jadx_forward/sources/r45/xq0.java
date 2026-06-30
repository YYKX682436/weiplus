package r45;

/* loaded from: classes2.dex */
public class xq0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f471863e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f471862d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f471864f = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xq0)) {
            return false;
        }
        r45.xq0 xq0Var = (r45.xq0) fVar;
        return n51.f.a(this.f471862d, xq0Var.f471862d) && n51.f.a(this.f471863e, xq0Var.f471863e) && n51.f.a(this.f471864f, xq0Var.f471864f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f471864f;
        java.util.LinkedList linkedList2 = this.f471862d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 2, linkedList2);
            java.lang.String str = this.f471863e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 5, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 2, linkedList2) + 0;
            java.lang.String str2 = this.f471863e;
            if (str2 != null) {
                g17 += b36.f.j(2, str2);
            }
            return g17 + b36.f.g(3, 5, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.xq0 xq0Var = (r45.xq0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            xq0Var.f471862d.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue == 2) {
            xq0Var.f471863e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        xq0Var.f471864f.add(java.lang.Float.valueOf(aVar2.f(intValue)));
        return 0;
    }
}

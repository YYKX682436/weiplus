package m53;

/* loaded from: classes8.dex */
public class m3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f405435d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405436e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f405437f = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.m3)) {
            return false;
        }
        m53.m3 m3Var = (m53.m3) fVar;
        return n51.f.a(this.f405435d, m3Var.f405435d) && n51.f.a(this.f405436e, m3Var.f405436e) && n51.f.a(this.f405437f, m3Var.f405437f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f405437f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f405435d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f405436e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f405435d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f405436e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.g(3, 1, linkedList);
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
        m53.m3 m3Var = (m53.m3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            m3Var.f405435d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            m3Var.f405436e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        m3Var.f405437f.add(aVar2.k(intValue));
        return 0;
    }
}

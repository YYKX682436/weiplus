package m53;

/* loaded from: classes4.dex */
public class e6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f405194d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f405195e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f405196f = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.e6)) {
            return false;
        }
        m53.e6 e6Var = (m53.e6) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f405194d), java.lang.Boolean.valueOf(e6Var.f405194d)) && n51.f.a(this.f405195e, e6Var.f405195e) && n51.f.a(this.f405196f, e6Var.f405196f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f405196f;
        java.util.LinkedList linkedList2 = this.f405195e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f405194d);
            fVar.g(3, 8, linkedList2);
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f405194d) + 0 + b36.f.g(3, 8, linkedList2) + b36.f.g(4, 8, linkedList);
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
        m53.e6 e6Var = (m53.e6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            e6Var.f405194d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                m53.m4 m4Var = new m53.m4();
                if (bArr2 != null && bArr2.length > 0) {
                    m4Var.mo11468x92b714fd(bArr2);
                }
                e6Var.f405195e.add(m4Var);
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            m53.m4 m4Var2 = new m53.m4();
            if (bArr3 != null && bArr3.length > 0) {
                m4Var2.mo11468x92b714fd(bArr3);
            }
            e6Var.f405196f.add(m4Var2);
        }
        return 0;
    }
}

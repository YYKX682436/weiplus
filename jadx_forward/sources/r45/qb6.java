package r45;

/* loaded from: classes4.dex */
public class qb6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f465343d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465344e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qb6)) {
            return false;
        }
        r45.qb6 qb6Var = (r45.qb6) fVar;
        return n51.f.a(this.f465343d, qb6Var.f465343d) && n51.f.a(this.f465344e, qb6Var.f465344e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f465343d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 3, linkedList);
            java.lang.String str = this.f465344e;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 3, linkedList) + 0;
            java.lang.String str2 = this.f465344e;
            return str2 != null ? g17 + b36.f.j(2, str2) : g17;
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
        r45.qb6 qb6Var = (r45.qb6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qb6Var.f465343d.add(java.lang.Long.valueOf(aVar2.i(intValue)));
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        qb6Var.f465344e = aVar2.k(intValue);
        return 0;
    }
}

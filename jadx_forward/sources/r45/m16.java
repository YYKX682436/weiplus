package r45;

/* loaded from: classes9.dex */
public class m16 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461606d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f461607e = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m16)) {
            return false;
        }
        r45.m16 m16Var = (r45.m16) fVar;
        return n51.f.a(this.f461606d, m16Var.f461606d) && n51.f.a(this.f461607e, m16Var.f461607e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f461607e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f461606d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f461606d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 8, linkedList);
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
        r45.m16 m16Var = (r45.m16) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            m16Var.f461606d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.b45 b45Var = new r45.b45();
            if (bArr2 != null && bArr2.length > 0) {
                b45Var.mo11468x92b714fd(bArr2);
            }
            m16Var.f461607e.add(b45Var);
        }
        return 0;
    }
}

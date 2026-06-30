package r45;

/* loaded from: classes9.dex */
public class rl6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f466520d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466521e;

    /* renamed from: f, reason: collision with root package name */
    public int f466522f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rl6)) {
            return false;
        }
        r45.rl6 rl6Var = (r45.rl6) fVar;
        return n51.f.a(this.f466520d, rl6Var.f466520d) && n51.f.a(this.f466521e, rl6Var.f466521e) && n51.f.a(java.lang.Integer.valueOf(this.f466522f), java.lang.Integer.valueOf(rl6Var.f466522f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f466520d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            java.lang.String str = this.f466521e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f466522f);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            java.lang.String str2 = this.f466521e;
            if (str2 != null) {
                g17 += b36.f.j(2, str2);
            }
            return g17 + b36.f.e(3, this.f466522f);
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
        r45.rl6 rl6Var = (r45.rl6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                rl6Var.f466521e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            rl6Var.f466522f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.hl6 hl6Var = new r45.hl6();
            if (bArr2 != null && bArr2.length > 0) {
                hl6Var.mo11468x92b714fd(bArr2);
            }
            rl6Var.f466520d.add(hl6Var);
        }
        return 0;
    }
}

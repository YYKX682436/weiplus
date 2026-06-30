package r45;

/* loaded from: classes9.dex */
public class m64 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.du4 f461693d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f461694e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public r45.j64 f461695f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m64)) {
            return false;
        }
        r45.m64 m64Var = (r45.m64) fVar;
        return n51.f.a(this.f461693d, m64Var.f461693d) && n51.f.a(this.f461694e, m64Var.f461694e) && n51.f.a(this.f461695f, m64Var.f461695f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f461694e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.du4 du4Var = this.f461693d;
            if (du4Var != null) {
                fVar.i(1, du4Var.mo75928xcd1e8d8());
                this.f461693d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            r45.j64 j64Var = this.f461695f;
            if (j64Var != null) {
                fVar.i(3, j64Var.mo75928xcd1e8d8());
                this.f461695f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.du4 du4Var2 = this.f461693d;
            int i18 = (du4Var2 != null ? 0 + b36.f.i(1, du4Var2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList);
            r45.j64 j64Var2 = this.f461695f;
            return j64Var2 != null ? i18 + b36.f.i(3, j64Var2.mo75928xcd1e8d8()) : i18;
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
        r45.m64 m64Var = (r45.m64) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.du4 du4Var3 = new r45.du4();
                if (bArr2 != null && bArr2.length > 0) {
                    du4Var3.mo11468x92b714fd(bArr2);
                }
                m64Var.f461693d = du4Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.l64 l64Var = new r45.l64();
                if (bArr3 != null && bArr3.length > 0) {
                    l64Var.mo11468x92b714fd(bArr3);
                }
                m64Var.f461694e.add(l64Var);
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.j64 j64Var3 = new r45.j64();
            if (bArr4 != null && bArr4.length > 0) {
                j64Var3.mo11468x92b714fd(bArr4);
            }
            m64Var.f461695f = j64Var3;
        }
        return 0;
    }
}

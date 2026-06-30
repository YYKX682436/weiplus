package r45;

/* loaded from: classes4.dex */
public class k73 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f459984d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f459985e;

    /* renamed from: f, reason: collision with root package name */
    public r45.m73 f459986f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k73)) {
            return false;
        }
        r45.k73 k73Var = (r45.k73) fVar;
        return n51.f.a(this.f459984d, k73Var.f459984d) && n51.f.a(java.lang.Boolean.valueOf(this.f459985e), java.lang.Boolean.valueOf(k73Var.f459985e)) && n51.f.a(this.f459986f, k73Var.f459986f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f459984d);
            fVar.a(2, this.f459985e);
            r45.m73 m73Var = this.f459986f;
            if (m73Var != null) {
                fVar.i(3, m73Var.mo75928xcd1e8d8());
                this.f459986f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.f459984d) + 0 + b36.f.a(2, this.f459985e);
            r45.m73 m73Var2 = this.f459986f;
            return m73Var2 != null ? g17 + b36.f.i(3, m73Var2.mo75928xcd1e8d8()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f459984d.clear();
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
        r45.k73 k73Var = (r45.k73) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.m73 m73Var3 = new r45.m73();
                if (bArr2 != null && bArr2.length > 0) {
                    m73Var3.mo11468x92b714fd(bArr2);
                }
                k73Var.f459984d.add(m73Var3);
            }
            return 0;
        }
        if (intValue == 2) {
            k73Var.f459985e = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.m73 m73Var4 = new r45.m73();
            if (bArr3 != null && bArr3.length > 0) {
                m73Var4.mo11468x92b714fd(bArr3);
            }
            k73Var.f459986f = m73Var4;
        }
        return 0;
    }
}

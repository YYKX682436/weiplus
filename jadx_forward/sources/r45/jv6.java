package r45;

/* loaded from: classes9.dex */
public class jv6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f459671d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f459672e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f459673f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f459674g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jv6)) {
            return false;
        }
        r45.jv6 jv6Var = (r45.jv6) fVar;
        return n51.f.a(this.f459671d, jv6Var.f459671d) && n51.f.a(this.f459672e, jv6Var.f459672e) && n51.f.a(this.f459673f, jv6Var.f459673f) && n51.f.a(this.f459674g, jv6Var.f459674g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f459671d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, this.f459672e);
            fVar.g(3, 8, this.f459673f);
            fVar.g(4, 8, this.f459674g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f459671d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 8, this.f459672e) + b36.f.g(3, 8, this.f459673f) + b36.f.g(4, 8, this.f459674g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f459672e.clear();
            this.f459673f.clear();
            this.f459674g.clear();
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
        r45.jv6 jv6Var = (r45.jv6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            jv6Var.f459671d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.bk6 bk6Var = new r45.bk6();
                if (bArr2 != null && bArr2.length > 0) {
                    bk6Var.mo11468x92b714fd(bArr2);
                }
                jv6Var.f459672e.add(bk6Var);
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                r45.bk6 bk6Var2 = new r45.bk6();
                if (bArr3 != null && bArr3.length > 0) {
                    bk6Var2.mo11468x92b714fd(bArr3);
                }
                jv6Var.f459673f.add(bk6Var2);
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr4 = (byte[]) j19.get(i27);
            r45.w50 w50Var = new r45.w50();
            if (bArr4 != null && bArr4.length > 0) {
                w50Var.mo11468x92b714fd(bArr4);
            }
            jv6Var.f459674g.add(w50Var);
        }
        return 0;
    }
}

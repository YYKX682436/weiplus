package r45;

/* loaded from: classes4.dex */
public class m33 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.jj4 f461642d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461643e;

    /* renamed from: f, reason: collision with root package name */
    public int f461644f;

    /* renamed from: g, reason: collision with root package name */
    public int f461645g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f461646h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f461647i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m33)) {
            return false;
        }
        r45.m33 m33Var = (r45.m33) fVar;
        return n51.f.a(this.f461642d, m33Var.f461642d) && n51.f.a(this.f461643e, m33Var.f461643e) && n51.f.a(java.lang.Integer.valueOf(this.f461644f), java.lang.Integer.valueOf(m33Var.f461644f)) && n51.f.a(java.lang.Integer.valueOf(this.f461645g), java.lang.Integer.valueOf(m33Var.f461645g)) && n51.f.a(java.lang.Boolean.valueOf(this.f461646h), java.lang.Boolean.valueOf(m33Var.f461646h)) && n51.f.a(this.f461647i, m33Var.f461647i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.jj4 jj4Var = this.f461642d;
            if (jj4Var != null) {
                fVar.i(1, jj4Var.mo75928xcd1e8d8());
                this.f461642d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f461643e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f461644f);
            fVar.e(4, this.f461645g);
            fVar.a(5, this.f461646h);
            java.lang.String str2 = this.f461647i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.jj4 jj4Var2 = this.f461642d;
            int i18 = jj4Var2 != null ? 0 + b36.f.i(1, jj4Var2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f461643e;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f461644f) + b36.f.e(4, this.f461645g) + b36.f.a(5, this.f461646h);
            java.lang.String str4 = this.f461647i;
            return str4 != null ? e17 + b36.f.j(6, str4) : e17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.m33 m33Var = (r45.m33) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.jj4 jj4Var3 = new r45.jj4();
                    if (bArr != null && bArr.length > 0) {
                        jj4Var3.mo11468x92b714fd(bArr);
                    }
                    m33Var.f461642d = jj4Var3;
                }
                return 0;
            case 2:
                m33Var.f461643e = aVar2.k(intValue);
                return 0;
            case 3:
                m33Var.f461644f = aVar2.g(intValue);
                return 0;
            case 4:
                m33Var.f461645g = aVar2.g(intValue);
                return 0;
            case 5:
                m33Var.f461646h = aVar2.c(intValue);
                return 0;
            case 6:
                m33Var.f461647i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

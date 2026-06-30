package r45;

/* loaded from: classes9.dex */
public class c70 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f452876d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452877e;

    /* renamed from: f, reason: collision with root package name */
    public int f452878f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f452879g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f452880h;

    /* renamed from: i, reason: collision with root package name */
    public int f452881i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c70)) {
            return false;
        }
        r45.c70 c70Var = (r45.c70) fVar;
        return n51.f.a(this.f452876d, c70Var.f452876d) && n51.f.a(this.f452877e, c70Var.f452877e) && n51.f.a(java.lang.Integer.valueOf(this.f452878f), java.lang.Integer.valueOf(c70Var.f452878f)) && n51.f.a(this.f452879g, c70Var.f452879g) && n51.f.a(this.f452880h, c70Var.f452880h) && n51.f.a(java.lang.Integer.valueOf(this.f452881i), java.lang.Integer.valueOf(c70Var.f452881i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f452876d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f452877e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f452878f);
            java.lang.String str3 = this.f452879g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f452880h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f452881i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f452876d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f452877e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f452878f);
            java.lang.String str7 = this.f452879g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f452880h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            return e17 + b36.f.e(6, this.f452881i);
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
        r45.c70 c70Var = (r45.c70) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                c70Var.f452876d = aVar2.k(intValue);
                return 0;
            case 2:
                c70Var.f452877e = aVar2.k(intValue);
                return 0;
            case 3:
                c70Var.f452878f = aVar2.g(intValue);
                return 0;
            case 4:
                c70Var.f452879g = aVar2.k(intValue);
                return 0;
            case 5:
                c70Var.f452880h = aVar2.k(intValue);
                return 0;
            case 6:
                c70Var.f452881i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

package pj4;

/* loaded from: classes8.dex */
public class q0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f436790d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f436791e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f436792f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f436793g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f436794h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f436795i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f436796m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f436797n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.q0)) {
            return false;
        }
        pj4.q0 q0Var = (pj4.q0) fVar;
        return n51.f.a(this.f436790d, q0Var.f436790d) && n51.f.a(this.f436791e, q0Var.f436791e) && n51.f.a(this.f436792f, q0Var.f436792f) && n51.f.a(this.f436793g, q0Var.f436793g) && n51.f.a(this.f436794h, q0Var.f436794h) && n51.f.a(java.lang.Boolean.valueOf(this.f436795i), java.lang.Boolean.valueOf(q0Var.f436795i)) && n51.f.a(this.f436796m, q0Var.f436796m) && n51.f.a(this.f436797n, q0Var.f436797n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f436796m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f436790d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f436791e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f436792f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f436793g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f436794h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.a(6, this.f436795i);
            fVar.g(7, 8, linkedList);
            java.lang.String str6 = this.f436797n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f436790d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f436791e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f436792f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f436793g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f436794h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            int a17 = j17 + b36.f.a(6, this.f436795i) + b36.f.g(7, 8, linkedList);
            java.lang.String str12 = this.f436797n;
            return str12 != null ? a17 + b36.f.j(8, str12) : a17;
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
        pj4.q0 q0Var = (pj4.q0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                q0Var.f436790d = aVar2.k(intValue);
                return 0;
            case 2:
                q0Var.f436791e = aVar2.k(intValue);
                return 0;
            case 3:
                q0Var.f436792f = aVar2.k(intValue);
                return 0;
            case 4:
                q0Var.f436793g = aVar2.k(intValue);
                return 0;
            case 5:
                q0Var.f436794h = aVar2.k(intValue);
                return 0;
            case 6:
                q0Var.f436795i = aVar2.c(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    pj4.j0 j0Var = new pj4.j0();
                    if (bArr2 != null && bArr2.length > 0) {
                        j0Var.mo11468x92b714fd(bArr2);
                    }
                    q0Var.f436796m.add(j0Var);
                }
                return 0;
            case 8:
                q0Var.f436797n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

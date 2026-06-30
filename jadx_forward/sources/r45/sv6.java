package r45;

/* loaded from: classes7.dex */
public class sv6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f467517d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f467518e;

    /* renamed from: f, reason: collision with root package name */
    public int f467519f;

    /* renamed from: g, reason: collision with root package name */
    public int f467520g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f467521h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f467522i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f467523m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f467524n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sv6)) {
            return false;
        }
        r45.sv6 sv6Var = (r45.sv6) fVar;
        return n51.f.a(this.f467517d, sv6Var.f467517d) && n51.f.a(java.lang.Boolean.valueOf(this.f467518e), java.lang.Boolean.valueOf(sv6Var.f467518e)) && n51.f.a(java.lang.Integer.valueOf(this.f467519f), java.lang.Integer.valueOf(sv6Var.f467519f)) && n51.f.a(java.lang.Integer.valueOf(this.f467520g), java.lang.Integer.valueOf(sv6Var.f467520g)) && n51.f.a(this.f467521h, sv6Var.f467521h) && n51.f.a(this.f467522i, sv6Var.f467522i) && n51.f.a(this.f467523m, sv6Var.f467523m) && n51.f.a(this.f467524n, sv6Var.f467524n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f467517d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            fVar.a(2, this.f467518e);
            fVar.e(3, this.f467519f);
            fVar.e(4, this.f467520g);
            java.lang.String str = this.f467521h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f467522i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f467523m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f467524n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0 + b36.f.a(2, this.f467518e) + b36.f.e(3, this.f467519f) + b36.f.e(4, this.f467520g);
            java.lang.String str5 = this.f467521h;
            if (str5 != null) {
                g17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f467522i;
            if (str6 != null) {
                g17 += b36.f.j(6, str6);
            }
            java.lang.String str7 = this.f467523m;
            if (str7 != null) {
                g17 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f467524n;
            return str8 != null ? g17 + b36.f.j(8, str8) : g17;
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
        r45.sv6 sv6Var = (r45.sv6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.tv6 tv6Var = new r45.tv6();
                    if (bArr2 != null && bArr2.length > 0) {
                        tv6Var.mo11468x92b714fd(bArr2);
                    }
                    sv6Var.f467517d.add(tv6Var);
                }
                return 0;
            case 2:
                sv6Var.f467518e = aVar2.c(intValue);
                return 0;
            case 3:
                sv6Var.f467519f = aVar2.g(intValue);
                return 0;
            case 4:
                sv6Var.f467520g = aVar2.g(intValue);
                return 0;
            case 5:
                sv6Var.f467521h = aVar2.k(intValue);
                return 0;
            case 6:
                sv6Var.f467522i = aVar2.k(intValue);
                return 0;
            case 7:
                sv6Var.f467523m = aVar2.k(intValue);
                return 0;
            case 8:
                sv6Var.f467524n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

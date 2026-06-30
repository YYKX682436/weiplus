package r45;

/* loaded from: classes15.dex */
public class t30 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f467615d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467616e;

    /* renamed from: f, reason: collision with root package name */
    public int f467617f;

    /* renamed from: g, reason: collision with root package name */
    public int f467618g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f467619h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f467620i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f467621m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f467622n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f467623o;

    /* renamed from: p, reason: collision with root package name */
    public int f467624p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.t30)) {
            return false;
        }
        r45.t30 t30Var = (r45.t30) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f467615d), java.lang.Integer.valueOf(t30Var.f467615d)) && n51.f.a(this.f467616e, t30Var.f467616e) && n51.f.a(java.lang.Integer.valueOf(this.f467617f), java.lang.Integer.valueOf(t30Var.f467617f)) && n51.f.a(java.lang.Integer.valueOf(this.f467618g), java.lang.Integer.valueOf(t30Var.f467618g)) && n51.f.a(this.f467619h, t30Var.f467619h) && n51.f.a(this.f467620i, t30Var.f467620i) && n51.f.a(this.f467621m, t30Var.f467621m) && n51.f.a(this.f467622n, t30Var.f467622n) && n51.f.a(this.f467623o, t30Var.f467623o) && n51.f.a(java.lang.Integer.valueOf(this.f467624p), java.lang.Integer.valueOf(t30Var.f467624p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f467619h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f467615d);
            java.lang.String str = this.f467616e;
            if (str != null) {
                fVar.j(7, str);
            }
            fVar.e(2, this.f467617f);
            fVar.e(3, this.f467618g);
            fVar.g(4, 8, linkedList);
            java.lang.String str2 = this.f467620i;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f467621m;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f467622n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f467623o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.e(10, this.f467624p);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f467615d) + 0;
            java.lang.String str6 = this.f467616e;
            if (str6 != null) {
                e17 += b36.f.j(7, str6);
            }
            int e18 = e17 + b36.f.e(2, this.f467617f) + b36.f.e(3, this.f467618g) + b36.f.g(4, 8, linkedList);
            java.lang.String str7 = this.f467620i;
            if (str7 != null) {
                e18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f467621m;
            if (str8 != null) {
                e18 += b36.f.j(6, str8);
            }
            java.lang.String str9 = this.f467622n;
            if (str9 != null) {
                e18 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f467623o;
            if (str10 != null) {
                e18 += b36.f.j(9, str10);
            }
            return e18 + b36.f.e(10, this.f467624p);
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
        r45.t30 t30Var = (r45.t30) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                t30Var.f467615d = aVar2.g(intValue);
                return 0;
            case 2:
                t30Var.f467617f = aVar2.g(intValue);
                return 0;
            case 3:
                t30Var.f467618g = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.b44 b44Var = new r45.b44();
                    if (bArr2 != null && bArr2.length > 0) {
                        b44Var.mo11468x92b714fd(bArr2);
                    }
                    t30Var.f467619h.add(b44Var);
                }
                return 0;
            case 5:
                t30Var.f467620i = aVar2.k(intValue);
                return 0;
            case 6:
                t30Var.f467621m = aVar2.k(intValue);
                return 0;
            case 7:
                t30Var.f467616e = aVar2.k(intValue);
                return 0;
            case 8:
                t30Var.f467622n = aVar2.k(intValue);
                return 0;
            case 9:
                t30Var.f467623o = aVar2.k(intValue);
                return 0;
            case 10:
                t30Var.f467624p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

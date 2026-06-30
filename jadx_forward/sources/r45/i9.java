package r45;

/* loaded from: classes7.dex */
public class i9 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f458355d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f458356e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f458358g;

    /* renamed from: h, reason: collision with root package name */
    public int f458359h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f458360i;

    /* renamed from: m, reason: collision with root package name */
    public int f458361m;

    /* renamed from: n, reason: collision with root package name */
    public int f458362n;

    /* renamed from: o, reason: collision with root package name */
    public int f458363o;

    /* renamed from: p, reason: collision with root package name */
    public int f458364p;

    /* renamed from: q, reason: collision with root package name */
    public int f458365q;

    /* renamed from: f, reason: collision with root package name */
    public int f458357f = 600;

    /* renamed from: r, reason: collision with root package name */
    public int f458366r = -1;

    /* renamed from: s, reason: collision with root package name */
    public boolean f458367s = false;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f458368t = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f458369u = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i9)) {
            return false;
        }
        r45.i9 i9Var = (r45.i9) fVar;
        return n51.f.a(this.f458355d, i9Var.f458355d) && n51.f.a(this.f458356e, i9Var.f458356e) && n51.f.a(java.lang.Integer.valueOf(this.f458357f), java.lang.Integer.valueOf(i9Var.f458357f)) && n51.f.a(this.f458358g, i9Var.f458358g) && n51.f.a(java.lang.Integer.valueOf(this.f458359h), java.lang.Integer.valueOf(i9Var.f458359h)) && n51.f.a(java.lang.Boolean.valueOf(this.f458360i), java.lang.Boolean.valueOf(i9Var.f458360i)) && n51.f.a(java.lang.Integer.valueOf(this.f458361m), java.lang.Integer.valueOf(i9Var.f458361m)) && n51.f.a(java.lang.Integer.valueOf(this.f458362n), java.lang.Integer.valueOf(i9Var.f458362n)) && n51.f.a(java.lang.Integer.valueOf(this.f458363o), java.lang.Integer.valueOf(i9Var.f458363o)) && n51.f.a(java.lang.Integer.valueOf(this.f458364p), java.lang.Integer.valueOf(i9Var.f458364p)) && n51.f.a(java.lang.Integer.valueOf(this.f458365q), java.lang.Integer.valueOf(i9Var.f458365q)) && n51.f.a(java.lang.Integer.valueOf(this.f458366r), java.lang.Integer.valueOf(i9Var.f458366r)) && n51.f.a(java.lang.Boolean.valueOf(this.f458367s), java.lang.Boolean.valueOf(i9Var.f458367s)) && n51.f.a(this.f458368t, i9Var.f458368t) && n51.f.a(this.f458369u, i9Var.f458369u);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f458369u;
        java.util.LinkedList linkedList2 = this.f458368t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f458355d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f458356e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f458357f);
            java.lang.String str3 = this.f458358g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f458359h);
            fVar.a(6, this.f458360i);
            fVar.e(7, this.f458361m);
            fVar.e(8, this.f458362n);
            fVar.e(9, this.f458363o);
            fVar.e(10, this.f458364p);
            fVar.e(11, this.f458365q);
            fVar.e(12, this.f458366r);
            fVar.a(13, this.f458367s);
            fVar.g(14, 8, linkedList2);
            fVar.g(16, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f458355d;
            int j17 = str4 != null ? b36.f.j(1, str4) + 0 : 0;
            java.lang.String str5 = this.f458356e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int e17 = j17 + b36.f.e(3, this.f458357f);
            java.lang.String str6 = this.f458358g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            return e17 + b36.f.e(5, this.f458359h) + b36.f.a(6, this.f458360i) + b36.f.e(7, this.f458361m) + b36.f.e(8, this.f458362n) + b36.f.e(9, this.f458363o) + b36.f.e(10, this.f458364p) + b36.f.e(11, this.f458365q) + b36.f.e(12, this.f458366r) + b36.f.a(13, this.f458367s) + b36.f.g(14, 8, linkedList2) + b36.f.g(16, 1, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.i9 i9Var = (r45.i9) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                i9Var.f458355d = aVar2.k(intValue);
                return 0;
            case 2:
                i9Var.f458356e = aVar2.k(intValue);
                return 0;
            case 3:
                i9Var.f458357f = aVar2.g(intValue);
                return 0;
            case 4:
                i9Var.f458358g = aVar2.k(intValue);
                return 0;
            case 5:
                i9Var.f458359h = aVar2.g(intValue);
                return 0;
            case 6:
                i9Var.f458360i = aVar2.c(intValue);
                return 0;
            case 7:
                i9Var.f458361m = aVar2.g(intValue);
                return 0;
            case 8:
                i9Var.f458362n = aVar2.g(intValue);
                return 0;
            case 9:
                i9Var.f458363o = aVar2.g(intValue);
                return 0;
            case 10:
                i9Var.f458364p = aVar2.g(intValue);
                return 0;
            case 11:
                i9Var.f458365q = aVar2.g(intValue);
                return 0;
            case 12:
                i9Var.f458366r = aVar2.g(intValue);
                return 0;
            case 13:
                i9Var.f458367s = aVar2.c(intValue);
                return 0;
            case 14:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.vm6 vm6Var = new r45.vm6();
                    if (bArr2 != null && bArr2.length > 0) {
                        vm6Var.mo11468x92b714fd(bArr2);
                    }
                    i9Var.f458368t.add(vm6Var);
                }
                return 0;
            case 15:
            default:
                return -1;
            case 16:
                i9Var.f458369u.add(aVar2.k(intValue));
                return 0;
        }
    }
}

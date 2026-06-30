package r45;

/* loaded from: classes9.dex */
public class vh6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f469789d;

    /* renamed from: e, reason: collision with root package name */
    public int f469790e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469792g;

    /* renamed from: h, reason: collision with root package name */
    public int f469793h;

    /* renamed from: i, reason: collision with root package name */
    public int f469794i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f469795m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f469796n;

    /* renamed from: o, reason: collision with root package name */
    public r45.ta5 f469797o;

    /* renamed from: p, reason: collision with root package name */
    public int f469798p;

    /* renamed from: q, reason: collision with root package name */
    public int f469799q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f469800r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f469801s;

    /* renamed from: u, reason: collision with root package name */
    public int f469803u;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f469791f = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f469802t = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vh6)) {
            return false;
        }
        r45.vh6 vh6Var = (r45.vh6) fVar;
        return n51.f.a(this.f76494x2de60e5e, vh6Var.f76494x2de60e5e) && n51.f.a(this.f469789d, vh6Var.f469789d) && n51.f.a(java.lang.Integer.valueOf(this.f469790e), java.lang.Integer.valueOf(vh6Var.f469790e)) && n51.f.a(this.f469791f, vh6Var.f469791f) && n51.f.a(this.f469792g, vh6Var.f469792g) && n51.f.a(java.lang.Integer.valueOf(this.f469793h), java.lang.Integer.valueOf(vh6Var.f469793h)) && n51.f.a(java.lang.Integer.valueOf(this.f469794i), java.lang.Integer.valueOf(vh6Var.f469794i)) && n51.f.a(this.f469795m, vh6Var.f469795m) && n51.f.a(this.f469796n, vh6Var.f469796n) && n51.f.a(this.f469797o, vh6Var.f469797o) && n51.f.a(java.lang.Integer.valueOf(this.f469798p), java.lang.Integer.valueOf(vh6Var.f469798p)) && n51.f.a(java.lang.Integer.valueOf(this.f469799q), java.lang.Integer.valueOf(vh6Var.f469799q)) && n51.f.a(this.f469800r, vh6Var.f469800r) && n51.f.a(this.f469801s, vh6Var.f469801s) && n51.f.a(this.f469802t, vh6Var.f469802t) && n51.f.a(java.lang.Integer.valueOf(this.f469803u), java.lang.Integer.valueOf(vh6Var.f469803u));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f469802t;
        java.util.LinkedList linkedList2 = this.f469791f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f469789d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f469790e);
            fVar.g(4, 8, linkedList2);
            java.lang.String str2 = this.f469792g;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f469793h);
            fVar.e(8, this.f469794i);
            java.lang.String str3 = this.f469795m;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f469796n;
            if (gVar != null) {
                fVar.b(10, gVar);
            }
            r45.ta5 ta5Var = this.f469797o;
            if (ta5Var != null) {
                fVar.i(11, ta5Var.mo75928xcd1e8d8());
                this.f469797o.mo75956x3d5d1f78(fVar);
            }
            fVar.e(12, this.f469798p);
            fVar.e(13, this.f469799q);
            java.lang.String str4 = this.f469800r;
            if (str4 != null) {
                fVar.j(14, str4);
            }
            java.lang.String str5 = this.f469801s;
            if (str5 != null) {
                fVar.j(15, str5);
            }
            fVar.g(18, 1, linkedList);
            fVar.e(19, this.f469803u);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.mo75928xcd1e8d8()) + 0 : 0;
            java.lang.String str6 = this.f469789d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            int e17 = i18 + b36.f.e(3, this.f469790e) + b36.f.g(4, 8, linkedList2);
            java.lang.String str7 = this.f469792g;
            if (str7 != null) {
                e17 += b36.f.j(6, str7);
            }
            int e18 = e17 + b36.f.e(7, this.f469793h) + b36.f.e(8, this.f469794i);
            java.lang.String str8 = this.f469795m;
            if (str8 != null) {
                e18 += b36.f.j(9, str8);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f469796n;
            if (gVar2 != null) {
                e18 += b36.f.b(10, gVar2);
            }
            r45.ta5 ta5Var2 = this.f469797o;
            if (ta5Var2 != null) {
                e18 += b36.f.i(11, ta5Var2.mo75928xcd1e8d8());
            }
            int e19 = e18 + b36.f.e(12, this.f469798p) + b36.f.e(13, this.f469799q);
            java.lang.String str9 = this.f469800r;
            if (str9 != null) {
                e19 += b36.f.j(14, str9);
            }
            java.lang.String str10 = this.f469801s;
            if (str10 != null) {
                e19 += b36.f.j(15, str10);
            }
            return e19 + b36.f.g(18, 1, linkedList) + b36.f.e(19, this.f469803u);
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
        r45.vh6 vh6Var = (r45.vh6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    vh6Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                vh6Var.f469789d = aVar2.k(intValue);
                return 0;
            case 3:
                vh6Var.f469790e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.th6 th6Var = new r45.th6();
                    if (bArr3 != null && bArr3.length > 0) {
                        th6Var.mo11468x92b714fd(bArr3);
                    }
                    vh6Var.f469791f.add(th6Var);
                }
                return 0;
            case 5:
            case 16:
            case 17:
            default:
                return -1;
            case 6:
                vh6Var.f469792g = aVar2.k(intValue);
                return 0;
            case 7:
                vh6Var.f469793h = aVar2.g(intValue);
                return 0;
            case 8:
                vh6Var.f469794i = aVar2.g(intValue);
                return 0;
            case 9:
                vh6Var.f469795m = aVar2.k(intValue);
                return 0;
            case 10:
                vh6Var.f469796n = aVar2.d(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.ta5 ta5Var3 = new r45.ta5();
                    if (bArr4 != null && bArr4.length > 0) {
                        ta5Var3.mo11468x92b714fd(bArr4);
                    }
                    vh6Var.f469797o = ta5Var3;
                }
                return 0;
            case 12:
                vh6Var.f469798p = aVar2.g(intValue);
                return 0;
            case 13:
                vh6Var.f469799q = aVar2.g(intValue);
                return 0;
            case 14:
                vh6Var.f469800r = aVar2.k(intValue);
                return 0;
            case 15:
                vh6Var.f469801s = aVar2.k(intValue);
                return 0;
            case 18:
                vh6Var.f469802t.add(aVar2.k(intValue));
                return 0;
            case 19:
                vh6Var.f469803u = aVar2.g(intValue);
                return 0;
        }
    }
}

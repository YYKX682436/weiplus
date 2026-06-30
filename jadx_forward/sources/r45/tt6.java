package r45;

/* loaded from: classes2.dex */
public class tt6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f468324d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f468325e;

    /* renamed from: f, reason: collision with root package name */
    public int f468326f;

    /* renamed from: g, reason: collision with root package name */
    public int f468327g;

    /* renamed from: h, reason: collision with root package name */
    public int f468328h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f468329i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f468330m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f468331n;

    /* renamed from: o, reason: collision with root package name */
    public int f468332o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f468333p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f468334q = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public int f468335r;

    /* renamed from: s, reason: collision with root package name */
    public int f468336s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tt6)) {
            return false;
        }
        r45.tt6 tt6Var = (r45.tt6) fVar;
        return n51.f.a(this.f76494x2de60e5e, tt6Var.f76494x2de60e5e) && n51.f.a(this.f468324d, tt6Var.f468324d) && n51.f.a(this.f468325e, tt6Var.f468325e) && n51.f.a(java.lang.Integer.valueOf(this.f468326f), java.lang.Integer.valueOf(tt6Var.f468326f)) && n51.f.a(java.lang.Integer.valueOf(this.f468327g), java.lang.Integer.valueOf(tt6Var.f468327g)) && n51.f.a(java.lang.Integer.valueOf(this.f468328h), java.lang.Integer.valueOf(tt6Var.f468328h)) && n51.f.a(this.f468329i, tt6Var.f468329i) && n51.f.a(this.f468330m, tt6Var.f468330m) && n51.f.a(this.f468331n, tt6Var.f468331n) && n51.f.a(java.lang.Integer.valueOf(this.f468332o), java.lang.Integer.valueOf(tt6Var.f468332o)) && n51.f.a(this.f468333p, tt6Var.f468333p) && n51.f.a(this.f468334q, tt6Var.f468334q) && n51.f.a(java.lang.Integer.valueOf(this.f468335r), java.lang.Integer.valueOf(tt6Var.f468335r)) && n51.f.a(java.lang.Integer.valueOf(this.f468336s), java.lang.Integer.valueOf(tt6Var.f468336s));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f468334q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f468324d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f468325e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f468326f);
            fVar.e(5, this.f468327g);
            fVar.e(6, this.f468328h);
            java.lang.String str3 = this.f468329i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f468330m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f468331n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.e(10, this.f468332o);
            java.lang.String str6 = this.f468333p;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            fVar.g(12, 8, linkedList);
            fVar.e(13, this.f468335r);
            fVar.e(14, this.f468336s);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.mo75928xcd1e8d8()) + 0 : 0;
            java.lang.String str7 = this.f468324d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f468325e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            int e17 = i18 + b36.f.e(4, this.f468326f) + b36.f.e(5, this.f468327g) + b36.f.e(6, this.f468328h);
            java.lang.String str9 = this.f468329i;
            if (str9 != null) {
                e17 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f468330m;
            if (str10 != null) {
                e17 += b36.f.j(8, str10);
            }
            java.lang.String str11 = this.f468331n;
            if (str11 != null) {
                e17 += b36.f.j(9, str11);
            }
            int e18 = e17 + b36.f.e(10, this.f468332o);
            java.lang.String str12 = this.f468333p;
            if (str12 != null) {
                e18 += b36.f.j(11, str12);
            }
            return e18 + b36.f.g(12, 8, linkedList) + b36.f.e(13, this.f468335r) + b36.f.e(14, this.f468336s);
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
        r45.tt6 tt6Var = (r45.tt6) objArr[1];
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
                    tt6Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                tt6Var.f468324d = aVar2.k(intValue);
                return 0;
            case 3:
                tt6Var.f468325e = aVar2.k(intValue);
                return 0;
            case 4:
                tt6Var.f468326f = aVar2.g(intValue);
                return 0;
            case 5:
                tt6Var.f468327g = aVar2.g(intValue);
                return 0;
            case 6:
                tt6Var.f468328h = aVar2.g(intValue);
                return 0;
            case 7:
                tt6Var.f468329i = aVar2.k(intValue);
                return 0;
            case 8:
                tt6Var.f468330m = aVar2.k(intValue);
                return 0;
            case 9:
                tt6Var.f468331n = aVar2.k(intValue);
                return 0;
            case 10:
                tt6Var.f468332o = aVar2.g(intValue);
                return 0;
            case 11:
                tt6Var.f468333p = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.cd6 cd6Var = new r45.cd6();
                    if (bArr3 != null && bArr3.length > 0) {
                        cd6Var.mo11468x92b714fd(bArr3);
                    }
                    tt6Var.f468334q.add(cd6Var);
                }
                return 0;
            case 13:
                tt6Var.f468335r = aVar2.g(intValue);
                return 0;
            case 14:
                tt6Var.f468336s = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

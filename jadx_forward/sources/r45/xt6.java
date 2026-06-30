package r45;

/* loaded from: classes9.dex */
public class xt6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f471939d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f471940e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f471941f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f471943h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f471944i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f471945m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f471946n;

    /* renamed from: o, reason: collision with root package name */
    public int f471947o;

    /* renamed from: q, reason: collision with root package name */
    public int f471949q;

    /* renamed from: r, reason: collision with root package name */
    public r45.uu6 f471950r;

    /* renamed from: t, reason: collision with root package name */
    public r45.sj0 f471952t;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f471942g = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public java.util.LinkedList f471948p = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public java.util.LinkedList f471951s = new java.util.LinkedList();

    static {
        new r45.xt6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xt6)) {
            return false;
        }
        r45.xt6 xt6Var = (r45.xt6) fVar;
        return n51.f.a(this.f76494x2de60e5e, xt6Var.f76494x2de60e5e) && n51.f.a(this.f471939d, xt6Var.f471939d) && n51.f.a(java.lang.Boolean.valueOf(this.f471940e), java.lang.Boolean.valueOf(xt6Var.f471940e)) && n51.f.a(java.lang.Boolean.valueOf(this.f471941f), java.lang.Boolean.valueOf(xt6Var.f471941f)) && n51.f.a(this.f471942g, xt6Var.f471942g) && n51.f.a(this.f471943h, xt6Var.f471943h) && n51.f.a(this.f471944i, xt6Var.f471944i) && n51.f.a(this.f471945m, xt6Var.f471945m) && n51.f.a(this.f471946n, xt6Var.f471946n) && n51.f.a(java.lang.Integer.valueOf(this.f471947o), java.lang.Integer.valueOf(xt6Var.f471947o)) && n51.f.a(this.f471948p, xt6Var.f471948p) && n51.f.a(java.lang.Integer.valueOf(this.f471949q), java.lang.Integer.valueOf(xt6Var.f471949q)) && n51.f.a(this.f471950r, xt6Var.f471950r) && n51.f.a(this.f471951s, xt6Var.f471951s) && n51.f.a(this.f471952t, xt6Var.f471952t);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: getBaseRequest */
    public r45.he mo11508xa452ad48() {
        return this.f76494x2de60e5e;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.xt6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f471942g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f471939d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f471940e);
            fVar.a(4, this.f471941f);
            fVar.g(5, 1, linkedList);
            java.lang.String str2 = this.f471943h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f471944i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f471945m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f471946n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.e(10, this.f471947o);
            fVar.g(11, 1, this.f471948p);
            fVar.e(12, this.f471949q);
            r45.uu6 uu6Var = this.f471950r;
            if (uu6Var != null) {
                fVar.i(13, uu6Var.mo75928xcd1e8d8());
                this.f471950r.mo75956x3d5d1f78(fVar);
            }
            fVar.g(14, 1, this.f471951s);
            r45.sj0 sj0Var = this.f471952t;
            if (sj0Var != null) {
                fVar.i(15, sj0Var.mo75928xcd1e8d8());
                this.f471952t.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.mo75928xcd1e8d8()) + 0 : 0;
            java.lang.String str6 = this.f471939d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            int a17 = i18 + b36.f.a(3, this.f471940e) + b36.f.a(4, this.f471941f) + b36.f.g(5, 1, linkedList);
            java.lang.String str7 = this.f471943h;
            if (str7 != null) {
                a17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f471944i;
            if (str8 != null) {
                a17 += b36.f.j(7, str8);
            }
            java.lang.String str9 = this.f471945m;
            if (str9 != null) {
                a17 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f471946n;
            if (str10 != null) {
                a17 += b36.f.j(9, str10);
            }
            int e17 = a17 + b36.f.e(10, this.f471947o) + b36.f.g(11, 1, this.f471948p) + b36.f.e(12, this.f471949q);
            r45.uu6 uu6Var2 = this.f471950r;
            if (uu6Var2 != null) {
                e17 += b36.f.i(13, uu6Var2.mo75928xcd1e8d8());
            }
            int g17 = e17 + b36.f.g(14, 1, this.f471951s);
            r45.sj0 sj0Var2 = this.f471952t;
            return sj0Var2 != null ? g17 + b36.f.i(15, sj0Var2.mo75928xcd1e8d8()) : g17;
        }
        if (i17 == 2) {
            linkedList.clear();
            this.f471948p.clear();
            this.f471951s.clear();
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    this.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                this.f471939d = aVar2.k(intValue);
                return 0;
            case 3:
                this.f471940e = aVar2.c(intValue);
                return 0;
            case 4:
                this.f471941f = aVar2.c(intValue);
                return 0;
            case 5:
                linkedList.add(aVar2.k(intValue));
                return 0;
            case 6:
                this.f471943h = aVar2.k(intValue);
                return 0;
            case 7:
                this.f471944i = aVar2.k(intValue);
                return 0;
            case 8:
                this.f471945m = aVar2.k(intValue);
                return 0;
            case 9:
                this.f471946n = aVar2.k(intValue);
                return 0;
            case 10:
                this.f471947o = aVar2.g(intValue);
                return 0;
            case 11:
                this.f471948p.add(aVar2.k(intValue));
                return 0;
            case 12:
                this.f471949q = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.uu6 uu6Var3 = new r45.uu6();
                    if (bArr2 != null && bArr2.length > 0) {
                        uu6Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f471950r = uu6Var3;
                }
                return 0;
            case 14:
                this.f471951s.add(aVar2.k(intValue));
                return 0;
            case 15:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.sj0 sj0Var3 = new r45.sj0();
                    if (bArr3 != null && bArr3.length > 0) {
                        sj0Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f471952t = sj0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (r45.xt6) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: setBaseRequest */
    public r45.my3 mo11509x3ab820bc(r45.he heVar) {
        this.f76494x2de60e5e = heVar;
        return this;
    }
}

package r45;

/* loaded from: classes9.dex */
public class uv5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f469205d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f469206e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469207f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469208g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f469209h;

    /* renamed from: i, reason: collision with root package name */
    public int f469210i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f469211m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f469212n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f469213o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f469214p;

    /* renamed from: q, reason: collision with root package name */
    public int f469215q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f469216r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f469217s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f469218t;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uv5)) {
            return false;
        }
        r45.uv5 uv5Var = (r45.uv5) fVar;
        return n51.f.a(this.f76494x2de60e5e, uv5Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f469205d), java.lang.Integer.valueOf(uv5Var.f469205d)) && n51.f.a(this.f469206e, uv5Var.f469206e) && n51.f.a(this.f469207f, uv5Var.f469207f) && n51.f.a(this.f469208g, uv5Var.f469208g) && n51.f.a(this.f469209h, uv5Var.f469209h) && n51.f.a(java.lang.Integer.valueOf(this.f469210i), java.lang.Integer.valueOf(uv5Var.f469210i)) && n51.f.a(this.f469211m, uv5Var.f469211m) && n51.f.a(this.f469212n, uv5Var.f469212n) && n51.f.a(this.f469213o, uv5Var.f469213o) && n51.f.a(this.f469214p, uv5Var.f469214p) && n51.f.a(java.lang.Integer.valueOf(this.f469215q), java.lang.Integer.valueOf(uv5Var.f469215q)) && n51.f.a(this.f469216r, uv5Var.f469216r) && n51.f.a(java.lang.Boolean.valueOf(this.f469217s), java.lang.Boolean.valueOf(uv5Var.f469217s)) && n51.f.a(java.lang.Boolean.valueOf(this.f469218t), java.lang.Boolean.valueOf(uv5Var.f469218t));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f469205d);
            fVar.g(4, 1, this.f469206e);
            java.lang.String str = this.f469207f;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f469208g;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f469209h;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.e(8, this.f469210i);
            java.lang.String str4 = this.f469211m;
            if (str4 != null) {
                fVar.j(14, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f469212n;
            if (gVar != null) {
                fVar.b(15, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f469213o;
            if (gVar2 != null) {
                fVar.b(16, gVar2);
            }
            java.lang.String str5 = this.f469214p;
            if (str5 != null) {
                fVar.j(17, str5);
            }
            fVar.e(18, this.f469215q);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f469216r;
            if (gVar3 != null) {
                fVar.b(19, gVar3);
            }
            fVar.a(20, this.f469217s);
            fVar.a(21, this.f469218t);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? b36.f.i(1, heVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(3, this.f469205d) + b36.f.g(4, 1, this.f469206e);
            java.lang.String str6 = this.f469207f;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f469208g;
            if (str7 != null) {
                i18 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f469209h;
            if (str8 != null) {
                i18 += b36.f.j(7, str8);
            }
            int e17 = i18 + b36.f.e(8, this.f469210i);
            java.lang.String str9 = this.f469211m;
            if (str9 != null) {
                e17 += b36.f.j(14, str9);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f469212n;
            if (gVar4 != null) {
                e17 += b36.f.b(15, gVar4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f469213o;
            if (gVar5 != null) {
                e17 += b36.f.b(16, gVar5);
            }
            java.lang.String str10 = this.f469214p;
            if (str10 != null) {
                e17 += b36.f.j(17, str10);
            }
            int e18 = e17 + b36.f.e(18, this.f469215q);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f469216r;
            if (gVar6 != null) {
                e18 += b36.f.b(19, gVar6);
            }
            return e18 + b36.f.a(20, this.f469217s) + b36.f.a(21, this.f469218t);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f469206e.clear();
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
        r45.uv5 uv5Var = (r45.uv5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.mo11468x92b714fd(bArr2);
                }
                uv5Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        switch (intValue) {
            case 3:
                uv5Var.f469205d = aVar2.g(intValue);
                return 0;
            case 4:
                uv5Var.f469206e.add(aVar2.k(intValue));
                return 0;
            case 5:
                uv5Var.f469207f = aVar2.k(intValue);
                return 0;
            case 6:
                uv5Var.f469208g = aVar2.k(intValue);
                return 0;
            case 7:
                uv5Var.f469209h = aVar2.k(intValue);
                return 0;
            case 8:
                uv5Var.f469210i = aVar2.g(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 14:
                        uv5Var.f469211m = aVar2.k(intValue);
                        return 0;
                    case 15:
                        uv5Var.f469212n = aVar2.d(intValue);
                        return 0;
                    case 16:
                        uv5Var.f469213o = aVar2.d(intValue);
                        return 0;
                    case 17:
                        uv5Var.f469214p = aVar2.k(intValue);
                        return 0;
                    case 18:
                        uv5Var.f469215q = aVar2.g(intValue);
                        return 0;
                    case 19:
                        uv5Var.f469216r = aVar2.d(intValue);
                        return 0;
                    case 20:
                        uv5Var.f469217s = aVar2.c(intValue);
                        return 0;
                    case 21:
                        uv5Var.f469218t = aVar2.c(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}

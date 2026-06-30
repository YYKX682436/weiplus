package r45;

/* loaded from: classes9.dex */
public class ck extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f453133d;

    /* renamed from: e, reason: collision with root package name */
    public int f453134e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f453135f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f453136g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f453137h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f453138i;

    /* renamed from: m, reason: collision with root package name */
    public int f453139m;

    /* renamed from: n, reason: collision with root package name */
    public int f453140n;

    /* renamed from: o, reason: collision with root package name */
    public int f453141o;

    /* renamed from: p, reason: collision with root package name */
    public int f453142p;

    /* renamed from: q, reason: collision with root package name */
    public r45.r60 f453143q;

    /* renamed from: r, reason: collision with root package name */
    public int f453144r;

    /* renamed from: s, reason: collision with root package name */
    public int f453145s;

    /* renamed from: t, reason: collision with root package name */
    public int f453146t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f453147u;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ck)) {
            return false;
        }
        r45.ck ckVar = (r45.ck) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f453133d), java.lang.Integer.valueOf(ckVar.f453133d)) && n51.f.a(java.lang.Integer.valueOf(this.f453134e), java.lang.Integer.valueOf(ckVar.f453134e)) && n51.f.a(this.f453135f, ckVar.f453135f) && n51.f.a(this.f453136g, ckVar.f453136g) && n51.f.a(this.f453137h, ckVar.f453137h) && n51.f.a(this.f453138i, ckVar.f453138i) && n51.f.a(java.lang.Integer.valueOf(this.f453139m), java.lang.Integer.valueOf(ckVar.f453139m)) && n51.f.a(java.lang.Integer.valueOf(this.f453140n), java.lang.Integer.valueOf(ckVar.f453140n)) && n51.f.a(java.lang.Integer.valueOf(this.f453141o), java.lang.Integer.valueOf(ckVar.f453141o)) && n51.f.a(java.lang.Integer.valueOf(this.f453142p), java.lang.Integer.valueOf(ckVar.f453142p)) && n51.f.a(this.f453143q, ckVar.f453143q) && n51.f.a(java.lang.Integer.valueOf(this.f453144r), java.lang.Integer.valueOf(ckVar.f453144r)) && n51.f.a(java.lang.Integer.valueOf(this.f453145s), java.lang.Integer.valueOf(ckVar.f453145s)) && n51.f.a(java.lang.Integer.valueOf(this.f453146t), java.lang.Integer.valueOf(ckVar.f453146t)) && n51.f.a(java.lang.Integer.valueOf(this.f453147u), java.lang.Integer.valueOf(ckVar.f453147u));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f453133d);
            fVar.e(2, this.f453134e);
            java.lang.String str = this.f453135f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f453136g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f453137h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f453138i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f453139m);
            fVar.e(8, this.f453140n);
            fVar.e(9, this.f453141o);
            fVar.e(10, this.f453142p);
            r45.r60 r60Var = this.f453143q;
            if (r60Var != null) {
                fVar.i(11, r60Var.mo75928xcd1e8d8());
                this.f453143q.mo75956x3d5d1f78(fVar);
            }
            fVar.e(12, this.f453144r);
            fVar.e(13, this.f453145s);
            fVar.e(14, this.f453146t);
            fVar.e(15, this.f453147u);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f453133d) + 0 + b36.f.e(2, this.f453134e);
            java.lang.String str5 = this.f453135f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f453136g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f453137h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f453138i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            int e18 = e17 + b36.f.e(7, this.f453139m) + b36.f.e(8, this.f453140n) + b36.f.e(9, this.f453141o) + b36.f.e(10, this.f453142p);
            r45.r60 r60Var2 = this.f453143q;
            if (r60Var2 != null) {
                e18 += b36.f.i(11, r60Var2.mo75928xcd1e8d8());
            }
            return e18 + b36.f.e(12, this.f453144r) + b36.f.e(13, this.f453145s) + b36.f.e(14, this.f453146t) + b36.f.e(15, this.f453147u);
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
        r45.ck ckVar = (r45.ck) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ckVar.f453133d = aVar2.g(intValue);
                return 0;
            case 2:
                ckVar.f453134e = aVar2.g(intValue);
                return 0;
            case 3:
                ckVar.f453135f = aVar2.k(intValue);
                return 0;
            case 4:
                ckVar.f453136g = aVar2.k(intValue);
                return 0;
            case 5:
                ckVar.f453137h = aVar2.k(intValue);
                return 0;
            case 6:
                ckVar.f453138i = aVar2.k(intValue);
                return 0;
            case 7:
                ckVar.f453139m = aVar2.g(intValue);
                return 0;
            case 8:
                ckVar.f453140n = aVar2.g(intValue);
                return 0;
            case 9:
                ckVar.f453141o = aVar2.g(intValue);
                return 0;
            case 10:
                ckVar.f453142p = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.r60 r60Var3 = new r45.r60();
                    if (bArr != null && bArr.length > 0) {
                        r60Var3.mo11468x92b714fd(bArr);
                    }
                    ckVar.f453143q = r60Var3;
                }
                return 0;
            case 12:
                ckVar.f453144r = aVar2.g(intValue);
                return 0;
            case 13:
                ckVar.f453145s = aVar2.g(intValue);
                return 0;
            case 14:
                ckVar.f453146t = aVar2.g(intValue);
                return 0;
            case 15:
                ckVar.f453147u = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

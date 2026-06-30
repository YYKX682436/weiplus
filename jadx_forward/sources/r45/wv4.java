package r45;

/* loaded from: classes8.dex */
public class wv4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f471051d;

    /* renamed from: e, reason: collision with root package name */
    public int f471052e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f471053f;

    /* renamed from: g, reason: collision with root package name */
    public int f471054g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f471055h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f471056i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f471057m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f471058n;

    /* renamed from: o, reason: collision with root package name */
    public int f471059o;

    /* renamed from: p, reason: collision with root package name */
    public int f471060p;

    /* renamed from: q, reason: collision with root package name */
    public int f471061q = 2;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wv4)) {
            return false;
        }
        r45.wv4 wv4Var = (r45.wv4) fVar;
        return n51.f.a(this.f76494x2de60e5e, wv4Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f471051d), java.lang.Integer.valueOf(wv4Var.f471051d)) && n51.f.a(java.lang.Integer.valueOf(this.f471052e), java.lang.Integer.valueOf(wv4Var.f471052e)) && n51.f.a(this.f471053f, wv4Var.f471053f) && n51.f.a(java.lang.Integer.valueOf(this.f471054g), java.lang.Integer.valueOf(wv4Var.f471054g)) && n51.f.a(this.f471055h, wv4Var.f471055h) && n51.f.a(this.f471056i, wv4Var.f471056i) && n51.f.a(this.f471057m, wv4Var.f471057m) && n51.f.a(this.f471058n, wv4Var.f471058n) && n51.f.a(java.lang.Integer.valueOf(this.f471059o), java.lang.Integer.valueOf(wv4Var.f471059o)) && n51.f.a(java.lang.Integer.valueOf(this.f471060p), java.lang.Integer.valueOf(wv4Var.f471060p)) && n51.f.a(java.lang.Integer.valueOf(this.f471061q), java.lang.Integer.valueOf(wv4Var.f471061q));
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
            fVar.e(2, this.f471051d);
            fVar.e(3, this.f471052e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f471053f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.e(5, this.f471054g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f471055h;
            if (gVar2 != null) {
                fVar.b(6, gVar2);
            }
            java.lang.String str = this.f471056i;
            if (str != null) {
                fVar.j(7, str);
            }
            java.lang.String str2 = this.f471057m;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            java.lang.String str3 = this.f471058n;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.e(10, this.f471059o);
            fVar.e(11, this.f471060p);
            fVar.e(12, this.f471061q);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f471051d) + b36.f.e(3, this.f471052e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f471053f;
            if (gVar3 != null) {
                i18 += b36.f.b(4, gVar3);
            }
            int e17 = i18 + b36.f.e(5, this.f471054g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f471055h;
            if (gVar4 != null) {
                e17 += b36.f.b(6, gVar4);
            }
            java.lang.String str4 = this.f471056i;
            if (str4 != null) {
                e17 += b36.f.j(7, str4);
            }
            java.lang.String str5 = this.f471057m;
            if (str5 != null) {
                e17 += b36.f.j(8, str5);
            }
            java.lang.String str6 = this.f471058n;
            if (str6 != null) {
                e17 += b36.f.j(9, str6);
            }
            return e17 + b36.f.e(10, this.f471059o) + b36.f.e(11, this.f471060p) + b36.f.e(12, this.f471061q);
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
        r45.wv4 wv4Var = (r45.wv4) objArr[1];
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
                    wv4Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                wv4Var.f471051d = aVar2.g(intValue);
                return 0;
            case 3:
                wv4Var.f471052e = aVar2.g(intValue);
                return 0;
            case 4:
                wv4Var.f471053f = aVar2.d(intValue);
                return 0;
            case 5:
                wv4Var.f471054g = aVar2.g(intValue);
                return 0;
            case 6:
                wv4Var.f471055h = aVar2.d(intValue);
                return 0;
            case 7:
                wv4Var.f471056i = aVar2.k(intValue);
                return 0;
            case 8:
                wv4Var.f471057m = aVar2.k(intValue);
                return 0;
            case 9:
                wv4Var.f471058n = aVar2.k(intValue);
                return 0;
            case 10:
                wv4Var.f471059o = aVar2.g(intValue);
                return 0;
            case 11:
                wv4Var.f471060p = aVar2.g(intValue);
                return 0;
            case 12:
                wv4Var.f471061q = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

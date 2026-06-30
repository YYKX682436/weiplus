package r45;

/* loaded from: classes10.dex */
public class jx1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f459717d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f459718e;

    /* renamed from: f, reason: collision with root package name */
    public long f459719f;

    /* renamed from: g, reason: collision with root package name */
    public long f459720g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f459721h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f459722i;

    /* renamed from: m, reason: collision with root package name */
    public int f459723m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f459724n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f459725o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f459726p;

    /* renamed from: q, reason: collision with root package name */
    public long f459727q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f459728r;

    /* renamed from: s, reason: collision with root package name */
    public int f459729s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jx1)) {
            return false;
        }
        r45.jx1 jx1Var = (r45.jx1) fVar;
        return n51.f.a(this.f76494x2de60e5e, jx1Var.f76494x2de60e5e) && n51.f.a(this.f459717d, jx1Var.f459717d) && n51.f.a(this.f459718e, jx1Var.f459718e) && n51.f.a(java.lang.Long.valueOf(this.f459719f), java.lang.Long.valueOf(jx1Var.f459719f)) && n51.f.a(java.lang.Long.valueOf(this.f459720g), java.lang.Long.valueOf(jx1Var.f459720g)) && n51.f.a(this.f459721h, jx1Var.f459721h) && n51.f.a(this.f459722i, jx1Var.f459722i) && n51.f.a(java.lang.Integer.valueOf(this.f459723m), java.lang.Integer.valueOf(jx1Var.f459723m)) && n51.f.a(java.lang.Boolean.valueOf(this.f459724n), java.lang.Boolean.valueOf(jx1Var.f459724n)) && n51.f.a(this.f459725o, jx1Var.f459725o) && n51.f.a(java.lang.Boolean.valueOf(this.f459726p), java.lang.Boolean.valueOf(jx1Var.f459726p)) && n51.f.a(java.lang.Long.valueOf(this.f459727q), java.lang.Long.valueOf(jx1Var.f459727q)) && n51.f.a(this.f459728r, jx1Var.f459728r) && n51.f.a(java.lang.Integer.valueOf(this.f459729s), java.lang.Integer.valueOf(jx1Var.f459729s));
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
            r45.kv0 kv0Var = this.f459717d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.mo75928xcd1e8d8());
                this.f459717d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f459718e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f459719f);
            fVar.h(5, this.f459720g);
            java.lang.String str2 = this.f459721h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f459722i;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            fVar.e(8, this.f459723m);
            fVar.a(9, this.f459724n);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f459725o;
            if (gVar2 != null) {
                fVar.b(10, gVar2);
            }
            fVar.a(11, this.f459726p);
            fVar.h(12, this.f459727q);
            java.lang.String str3 = this.f459728r;
            if (str3 != null) {
                fVar.j(13, str3);
            }
            fVar.e(14, this.f459729s);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.mo75928xcd1e8d8()) + 0 : 0;
            r45.kv0 kv0Var2 = this.f459717d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f459718e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            int h17 = i18 + b36.f.h(4, this.f459719f) + b36.f.h(5, this.f459720g);
            java.lang.String str5 = this.f459721h;
            if (str5 != null) {
                h17 += b36.f.j(6, str5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f459722i;
            if (gVar3 != null) {
                h17 += b36.f.b(7, gVar3);
            }
            int e17 = h17 + b36.f.e(8, this.f459723m) + b36.f.a(9, this.f459724n);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f459725o;
            if (gVar4 != null) {
                e17 += b36.f.b(10, gVar4);
            }
            int a17 = e17 + b36.f.a(11, this.f459726p) + b36.f.h(12, this.f459727q);
            java.lang.String str6 = this.f459728r;
            if (str6 != null) {
                a17 += b36.f.j(13, str6);
            }
            return a17 + b36.f.e(14, this.f459729s);
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
        r45.jx1 jx1Var = (r45.jx1) objArr[1];
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
                    jx1Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kv0Var3.mo11468x92b714fd(bArr2);
                    }
                    jx1Var.f459717d = kv0Var3;
                }
                return 0;
            case 3:
                jx1Var.f459718e = aVar2.k(intValue);
                return 0;
            case 4:
                jx1Var.f459719f = aVar2.i(intValue);
                return 0;
            case 5:
                jx1Var.f459720g = aVar2.i(intValue);
                return 0;
            case 6:
                jx1Var.f459721h = aVar2.k(intValue);
                return 0;
            case 7:
                jx1Var.f459722i = aVar2.d(intValue);
                return 0;
            case 8:
                jx1Var.f459723m = aVar2.g(intValue);
                return 0;
            case 9:
                jx1Var.f459724n = aVar2.c(intValue);
                return 0;
            case 10:
                jx1Var.f459725o = aVar2.d(intValue);
                return 0;
            case 11:
                jx1Var.f459726p = aVar2.c(intValue);
                return 0;
            case 12:
                jx1Var.f459727q = aVar2.i(intValue);
                return 0;
            case 13:
                jx1Var.f459728r = aVar2.k(intValue);
                return 0;
            case 14:
                jx1Var.f459729s = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

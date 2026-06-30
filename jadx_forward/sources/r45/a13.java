package r45;

/* loaded from: classes10.dex */
public class a13 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f451163d;

    /* renamed from: e, reason: collision with root package name */
    public long f451164e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f451165f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f451166g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f451167h;

    /* renamed from: i, reason: collision with root package name */
    public long f451168i;

    /* renamed from: m, reason: collision with root package name */
    public int f451169m;

    /* renamed from: n, reason: collision with root package name */
    public int f451170n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f451171o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f451172p;

    /* renamed from: q, reason: collision with root package name */
    public int f451173q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a13)) {
            return false;
        }
        r45.a13 a13Var = (r45.a13) fVar;
        return n51.f.a(this.f76494x2de60e5e, a13Var.f76494x2de60e5e) && n51.f.a(this.f451163d, a13Var.f451163d) && n51.f.a(java.lang.Long.valueOf(this.f451164e), java.lang.Long.valueOf(a13Var.f451164e)) && n51.f.a(this.f451165f, a13Var.f451165f) && n51.f.a(this.f451166g, a13Var.f451166g) && n51.f.a(this.f451167h, a13Var.f451167h) && n51.f.a(java.lang.Long.valueOf(this.f451168i), java.lang.Long.valueOf(a13Var.f451168i)) && n51.f.a(java.lang.Integer.valueOf(this.f451169m), java.lang.Integer.valueOf(a13Var.f451169m)) && n51.f.a(java.lang.Integer.valueOf(this.f451170n), java.lang.Integer.valueOf(a13Var.f451170n)) && n51.f.a(this.f451171o, a13Var.f451171o) && n51.f.a(this.f451172p, a13Var.f451172p) && n51.f.a(java.lang.Integer.valueOf(this.f451173q), java.lang.Integer.valueOf(a13Var.f451173q));
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
            r45.kv0 kv0Var = this.f451163d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.mo75928xcd1e8d8());
                this.f451163d.mo75956x3d5d1f78(fVar);
            }
            fVar.h(3, this.f451164e);
            java.lang.String str = this.f451165f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f451166g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f451167h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.h(7, this.f451168i);
            fVar.e(8, this.f451169m);
            fVar.e(9, this.f451170n);
            java.lang.String str4 = this.f451171o;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f451172p;
            if (gVar != null) {
                fVar.b(100, gVar);
            }
            fVar.e(101, this.f451173q);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.kv0 kv0Var2 = this.f451163d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.mo75928xcd1e8d8());
            }
            int h17 = i18 + b36.f.h(3, this.f451164e);
            java.lang.String str5 = this.f451165f;
            if (str5 != null) {
                h17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f451166g;
            if (str6 != null) {
                h17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f451167h;
            if (str7 != null) {
                h17 += b36.f.j(6, str7);
            }
            int h18 = h17 + b36.f.h(7, this.f451168i) + b36.f.e(8, this.f451169m) + b36.f.e(9, this.f451170n);
            java.lang.String str8 = this.f451171o;
            if (str8 != null) {
                h18 += b36.f.j(10, str8);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f451172p;
            if (gVar2 != null) {
                h18 += b36.f.b(100, gVar2);
            }
            return h18 + b36.f.e(101, this.f451173q);
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
        r45.a13 a13Var = (r45.a13) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 100) {
            a13Var.f451172p = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 101) {
            a13Var.f451173q = aVar2.g(intValue);
            return 0;
        }
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
                    a13Var.f76494x2de60e5e = heVar3;
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
                    a13Var.f451163d = kv0Var3;
                }
                return 0;
            case 3:
                a13Var.f451164e = aVar2.i(intValue);
                return 0;
            case 4:
                a13Var.f451165f = aVar2.k(intValue);
                return 0;
            case 5:
                a13Var.f451166g = aVar2.k(intValue);
                return 0;
            case 6:
                a13Var.f451167h = aVar2.k(intValue);
                return 0;
            case 7:
                a13Var.f451168i = aVar2.i(intValue);
                return 0;
            case 8:
                a13Var.f451169m = aVar2.g(intValue);
                return 0;
            case 9:
                a13Var.f451170n = aVar2.g(intValue);
                return 0;
            case 10:
                a13Var.f451171o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

package r45;

/* loaded from: classes8.dex */
public class gc5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456617d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456618e;

    /* renamed from: f, reason: collision with root package name */
    public int f456619f;

    /* renamed from: g, reason: collision with root package name */
    public long f456620g;

    /* renamed from: h, reason: collision with root package name */
    public int f456621h;

    /* renamed from: i, reason: collision with root package name */
    public long f456622i;

    /* renamed from: m, reason: collision with root package name */
    public r45.js3 f456623m;

    /* renamed from: n, reason: collision with root package name */
    public int f456624n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f456625o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f456626p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f456627q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gc5)) {
            return false;
        }
        r45.gc5 gc5Var = (r45.gc5) fVar;
        return n51.f.a(this.f76494x2de60e5e, gc5Var.f76494x2de60e5e) && n51.f.a(this.f456617d, gc5Var.f456617d) && n51.f.a(this.f456618e, gc5Var.f456618e) && n51.f.a(java.lang.Integer.valueOf(this.f456619f), java.lang.Integer.valueOf(gc5Var.f456619f)) && n51.f.a(java.lang.Long.valueOf(this.f456620g), java.lang.Long.valueOf(gc5Var.f456620g)) && n51.f.a(java.lang.Integer.valueOf(this.f456621h), java.lang.Integer.valueOf(gc5Var.f456621h)) && n51.f.a(java.lang.Long.valueOf(this.f456622i), java.lang.Long.valueOf(gc5Var.f456622i)) && n51.f.a(this.f456623m, gc5Var.f456623m) && n51.f.a(java.lang.Integer.valueOf(this.f456624n), java.lang.Integer.valueOf(gc5Var.f456624n)) && n51.f.a(this.f456625o, gc5Var.f456625o) && n51.f.a(this.f456626p, gc5Var.f456626p) && n51.f.a(this.f456627q, gc5Var.f456627q);
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
            java.lang.String str = this.f456617d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f456618e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f456619f);
            fVar.h(5, this.f456620g);
            fVar.e(10, this.f456621h);
            fVar.h(11, this.f456622i);
            r45.js3 js3Var = this.f456623m;
            if (js3Var != null) {
                fVar.i(12, js3Var.mo75928xcd1e8d8());
                this.f456623m.mo75956x3d5d1f78(fVar);
            }
            fVar.e(100, this.f456624n);
            java.lang.String str3 = this.f456625o;
            if (str3 != null) {
                fVar.j(101, str3);
            }
            java.lang.String str4 = this.f456626p;
            if (str4 != null) {
                fVar.j(102, str4);
            }
            java.lang.String str5 = this.f456627q;
            if (str5 != null) {
                fVar.j(103, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str6 = this.f456617d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f456618e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            int e17 = i18 + b36.f.e(4, this.f456619f) + b36.f.h(5, this.f456620g) + b36.f.e(10, this.f456621h) + b36.f.h(11, this.f456622i);
            r45.js3 js3Var2 = this.f456623m;
            if (js3Var2 != null) {
                e17 += b36.f.i(12, js3Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(100, this.f456624n);
            java.lang.String str8 = this.f456625o;
            if (str8 != null) {
                e18 += b36.f.j(101, str8);
            }
            java.lang.String str9 = this.f456626p;
            if (str9 != null) {
                e18 += b36.f.j(102, str9);
            }
            java.lang.String str10 = this.f456627q;
            return str10 != null ? e18 + b36.f.j(103, str10) : e18;
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
        r45.gc5 gc5Var = (r45.gc5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.mo11468x92b714fd(bArr);
                }
                gc5Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            gc5Var.f456617d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            gc5Var.f456618e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            gc5Var.f456619f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 5) {
            gc5Var.f456620g = aVar2.i(intValue);
            return 0;
        }
        switch (intValue) {
            case 10:
                gc5Var.f456621h = aVar2.g(intValue);
                return 0;
            case 11:
                gc5Var.f456622i = aVar2.i(intValue);
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.js3 js3Var3 = new r45.js3();
                    if (bArr2 != null && bArr2.length > 0) {
                        js3Var3.mo11468x92b714fd(bArr2);
                    }
                    gc5Var.f456623m = js3Var3;
                }
                return 0;
            default:
                switch (intValue) {
                    case 100:
                        gc5Var.f456624n = aVar2.g(intValue);
                        return 0;
                    case 101:
                        gc5Var.f456625o = aVar2.k(intValue);
                        return 0;
                    case 102:
                        gc5Var.f456626p = aVar2.k(intValue);
                        return 0;
                    case 103:
                        gc5Var.f456627q = aVar2.k(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}

package r45;

/* loaded from: classes8.dex */
public class gf3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456718d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456719e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f456720f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f456721g;

    /* renamed from: h, reason: collision with root package name */
    public long f456722h;

    /* renamed from: i, reason: collision with root package name */
    public int f456723i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f456724m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f456725n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f456726o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gf3)) {
            return false;
        }
        r45.gf3 gf3Var = (r45.gf3) fVar;
        return n51.f.a(this.f76492x92037252, gf3Var.f76492x92037252) && n51.f.a(this.f456718d, gf3Var.f456718d) && n51.f.a(this.f456719e, gf3Var.f456719e) && n51.f.a(java.lang.Boolean.valueOf(this.f456720f), java.lang.Boolean.valueOf(gf3Var.f456720f)) && n51.f.a(java.lang.Boolean.valueOf(this.f456721g), java.lang.Boolean.valueOf(gf3Var.f456721g)) && n51.f.a(java.lang.Long.valueOf(this.f456722h), java.lang.Long.valueOf(gf3Var.f456722h)) && n51.f.a(java.lang.Integer.valueOf(this.f456723i), java.lang.Integer.valueOf(gf3Var.f456723i)) && n51.f.a(java.lang.Boolean.valueOf(this.f456724m), java.lang.Boolean.valueOf(gf3Var.f456724m)) && n51.f.a(this.f456725n, gf3Var.f456725n) && n51.f.a(this.f456726o, gf3Var.f456726o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f456718d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f456719e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.a(4, this.f456720f);
            fVar.a(5, this.f456721g);
            fVar.h(6, this.f456722h);
            fVar.e(7, this.f456723i);
            fVar.a(8, this.f456724m);
            java.lang.String str3 = this.f456725n;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            java.lang.String str4 = this.f456726o;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str5 = this.f456718d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f456719e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            int a17 = i18 + b36.f.a(4, this.f456720f) + b36.f.a(5, this.f456721g) + b36.f.h(6, this.f456722h) + b36.f.e(7, this.f456723i) + b36.f.a(8, this.f456724m);
            java.lang.String str7 = this.f456725n;
            if (str7 != null) {
                a17 += b36.f.j(9, str7);
            }
            java.lang.String str8 = this.f456726o;
            return str8 != null ? a17 + b36.f.j(10, str8) : a17;
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
        r45.gf3 gf3Var = (r45.gf3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    gf3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                gf3Var.f456718d = aVar2.k(intValue);
                return 0;
            case 3:
                gf3Var.f456719e = aVar2.k(intValue);
                return 0;
            case 4:
                gf3Var.f456720f = aVar2.c(intValue);
                return 0;
            case 5:
                gf3Var.f456721g = aVar2.c(intValue);
                return 0;
            case 6:
                gf3Var.f456722h = aVar2.i(intValue);
                return 0;
            case 7:
                gf3Var.f456723i = aVar2.g(intValue);
                return 0;
            case 8:
                gf3Var.f456724m = aVar2.c(intValue);
                return 0;
            case 9:
                gf3Var.f456725n = aVar2.k(intValue);
                return 0;
            case 10:
                gf3Var.f456726o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

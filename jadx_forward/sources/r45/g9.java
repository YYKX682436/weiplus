package r45;

/* loaded from: classes9.dex */
public class g9 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456530d;

    /* renamed from: e, reason: collision with root package name */
    public int f456531e;

    /* renamed from: f, reason: collision with root package name */
    public int f456532f;

    /* renamed from: g, reason: collision with root package name */
    public int f456533g;

    /* renamed from: h, reason: collision with root package name */
    public int f456534h;

    /* renamed from: i, reason: collision with root package name */
    public int f456535i;

    /* renamed from: m, reason: collision with root package name */
    public int f456536m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f456537n;

    /* renamed from: o, reason: collision with root package name */
    public long f456538o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g9)) {
            return false;
        }
        r45.g9 g9Var = (r45.g9) fVar;
        return n51.f.a(this.f76494x2de60e5e, g9Var.f76494x2de60e5e) && n51.f.a(this.f456530d, g9Var.f456530d) && n51.f.a(java.lang.Integer.valueOf(this.f456531e), java.lang.Integer.valueOf(g9Var.f456531e)) && n51.f.a(java.lang.Integer.valueOf(this.f456532f), java.lang.Integer.valueOf(g9Var.f456532f)) && n51.f.a(java.lang.Integer.valueOf(this.f456533g), java.lang.Integer.valueOf(g9Var.f456533g)) && n51.f.a(java.lang.Integer.valueOf(this.f456534h), java.lang.Integer.valueOf(g9Var.f456534h)) && n51.f.a(java.lang.Integer.valueOf(this.f456535i), java.lang.Integer.valueOf(g9Var.f456535i)) && n51.f.a(java.lang.Integer.valueOf(this.f456536m), java.lang.Integer.valueOf(g9Var.f456536m)) && n51.f.a(this.f456537n, g9Var.f456537n) && n51.f.a(java.lang.Long.valueOf(this.f456538o), java.lang.Long.valueOf(g9Var.f456538o));
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
            java.lang.String str = this.f456530d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(4, this.f456531e);
            fVar.e(6, this.f456532f);
            fVar.e(7, this.f456533g);
            fVar.e(8, this.f456534h);
            fVar.e(9, this.f456535i);
            fVar.e(10, this.f456536m);
            java.lang.String str2 = this.f456537n;
            if (str2 != null) {
                fVar.j(11, str2);
            }
            fVar.h(12, this.f456538o);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f456530d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(4, this.f456531e) + b36.f.e(6, this.f456532f) + b36.f.e(7, this.f456533g) + b36.f.e(8, this.f456534h) + b36.f.e(9, this.f456535i) + b36.f.e(10, this.f456536m);
            java.lang.String str4 = this.f456537n;
            if (str4 != null) {
                e17 += b36.f.j(11, str4);
            }
            return e17 + b36.f.h(12, this.f456538o);
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
        r45.g9 g9Var = (r45.g9) objArr[1];
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
                    g9Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                g9Var.f456530d = aVar2.k(intValue);
                return 0;
            case 3:
            case 5:
            default:
                return -1;
            case 4:
                g9Var.f456531e = aVar2.g(intValue);
                return 0;
            case 6:
                g9Var.f456532f = aVar2.g(intValue);
                return 0;
            case 7:
                g9Var.f456533g = aVar2.g(intValue);
                return 0;
            case 8:
                g9Var.f456534h = aVar2.g(intValue);
                return 0;
            case 9:
                g9Var.f456535i = aVar2.g(intValue);
                return 0;
            case 10:
                g9Var.f456536m = aVar2.g(intValue);
                return 0;
            case 11:
                g9Var.f456537n = aVar2.k(intValue);
                return 0;
            case 12:
                g9Var.f456538o = aVar2.i(intValue);
                return 0;
        }
    }
}

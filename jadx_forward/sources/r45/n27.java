package r45;

/* loaded from: classes9.dex */
public class n27 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f462566d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f462567e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f462568f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f462569g;

    /* renamed from: h, reason: collision with root package name */
    public int f462570h;

    /* renamed from: i, reason: collision with root package name */
    public int f462571i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f462572m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public long f462573n;

    /* renamed from: o, reason: collision with root package name */
    public long f462574o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n27)) {
            return false;
        }
        r45.n27 n27Var = (r45.n27) fVar;
        return n51.f.a(this.f462566d, n27Var.f462566d) && n51.f.a(this.f462567e, n27Var.f462567e) && n51.f.a(this.f462568f, n27Var.f462568f) && n51.f.a(this.f462569g, n27Var.f462569g) && n51.f.a(java.lang.Integer.valueOf(this.f462570h), java.lang.Integer.valueOf(n27Var.f462570h)) && n51.f.a(java.lang.Integer.valueOf(this.f462571i), java.lang.Integer.valueOf(n27Var.f462571i)) && n51.f.a(this.f462572m, n27Var.f462572m) && n51.f.a(java.lang.Long.valueOf(this.f462573n), java.lang.Long.valueOf(n27Var.f462573n)) && n51.f.a(java.lang.Long.valueOf(this.f462574o), java.lang.Long.valueOf(n27Var.f462574o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f462566d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f462567e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f462568f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f462569g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f462570h);
            fVar.e(7, this.f462571i);
            fVar.g(8, 8, this.f462572m);
            fVar.h(9, this.f462573n);
            fVar.h(10, this.f462574o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f462566d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f462567e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f462568f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f462569g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            return j17 + b36.f.e(5, this.f462570h) + b36.f.e(7, this.f462571i) + b36.f.g(8, 8, this.f462572m) + b36.f.h(9, this.f462573n) + b36.f.h(10, this.f462574o);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f462572m.clear();
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
        r45.n27 n27Var = (r45.n27) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                n27Var.f462566d = aVar2.k(intValue);
                return 0;
            case 2:
                n27Var.f462567e = aVar2.k(intValue);
                return 0;
            case 3:
                n27Var.f462568f = aVar2.k(intValue);
                return 0;
            case 4:
                n27Var.f462569g = aVar2.k(intValue);
                return 0;
            case 5:
                n27Var.f462570h = aVar2.g(intValue);
                return 0;
            case 6:
            default:
                return -1;
            case 7:
                n27Var.f462571i = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.ev3 ev3Var = new r45.ev3();
                    if (bArr2 != null && bArr2.length > 0) {
                        ev3Var.mo11468x92b714fd(bArr2);
                    }
                    n27Var.f462572m.add(ev3Var);
                }
                return 0;
            case 9:
                n27Var.f462573n = aVar2.i(intValue);
                return 0;
            case 10:
                n27Var.f462574o = aVar2.i(intValue);
                return 0;
        }
    }
}

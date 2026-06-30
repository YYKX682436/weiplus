package r45;

/* loaded from: classes8.dex */
public class og7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f463778d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f463779e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f463780f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f463781g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f463782h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f463783i;

    /* renamed from: m, reason: collision with root package name */
    public int f463784m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.og7)) {
            return false;
        }
        r45.og7 og7Var = (r45.og7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f463778d), java.lang.Integer.valueOf(og7Var.f463778d)) && n51.f.a(this.f463779e, og7Var.f463779e) && n51.f.a(this.f463780f, og7Var.f463780f) && n51.f.a(this.f463781g, og7Var.f463781g) && n51.f.a(this.f463782h, og7Var.f463782h) && n51.f.a(this.f463783i, og7Var.f463783i) && n51.f.a(java.lang.Integer.valueOf(this.f463784m), java.lang.Integer.valueOf(og7Var.f463784m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f463778d);
            java.lang.String str = this.f463779e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f463780f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f463781g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f463782h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f463783i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f463784m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f463778d) + 0;
            java.lang.String str6 = this.f463779e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f463780f;
            if (str7 != null) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f463781g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f463782h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f463783i;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            return e17 + b36.f.e(7, this.f463784m);
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
        r45.og7 og7Var = (r45.og7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                og7Var.f463778d = aVar2.g(intValue);
                return 0;
            case 2:
                og7Var.f463779e = aVar2.k(intValue);
                return 0;
            case 3:
                og7Var.f463780f = aVar2.k(intValue);
                return 0;
            case 4:
                og7Var.f463781g = aVar2.k(intValue);
                return 0;
            case 5:
                og7Var.f463782h = aVar2.k(intValue);
                return 0;
            case 6:
                og7Var.f463783i = aVar2.k(intValue);
                return 0;
            case 7:
                og7Var.f463784m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

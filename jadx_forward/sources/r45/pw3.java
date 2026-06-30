package r45;

/* loaded from: classes11.dex */
public class pw3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f464958d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464959e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f464960f;

    /* renamed from: g, reason: collision with root package name */
    public long f464961g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f464962h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f464963i;

    /* renamed from: m, reason: collision with root package name */
    public int f464964m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pw3)) {
            return false;
        }
        r45.pw3 pw3Var = (r45.pw3) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f464958d), java.lang.Long.valueOf(pw3Var.f464958d)) && n51.f.a(this.f464959e, pw3Var.f464959e) && n51.f.a(java.lang.Boolean.valueOf(this.f464960f), java.lang.Boolean.valueOf(pw3Var.f464960f)) && n51.f.a(java.lang.Long.valueOf(this.f464961g), java.lang.Long.valueOf(pw3Var.f464961g)) && n51.f.a(this.f464962h, pw3Var.f464962h) && n51.f.a(this.f464963i, pw3Var.f464963i) && n51.f.a(java.lang.Integer.valueOf(this.f464964m), java.lang.Integer.valueOf(pw3Var.f464964m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f464958d);
            java.lang.String str = this.f464959e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f464960f);
            fVar.h(4, this.f464961g);
            java.lang.String str2 = this.f464962h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f464963i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.e(7, this.f464964m);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f464958d) + 0;
            java.lang.String str4 = this.f464959e;
            if (str4 != null) {
                h17 += b36.f.j(2, str4);
            }
            int a17 = h17 + b36.f.a(3, this.f464960f) + b36.f.h(4, this.f464961g);
            java.lang.String str5 = this.f464962h;
            if (str5 != null) {
                a17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f464963i;
            if (str6 != null) {
                a17 += b36.f.j(6, str6);
            }
            return a17 + b36.f.e(7, this.f464964m);
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
        r45.pw3 pw3Var = (r45.pw3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pw3Var.f464958d = aVar2.i(intValue);
                return 0;
            case 2:
                pw3Var.f464959e = aVar2.k(intValue);
                return 0;
            case 3:
                pw3Var.f464960f = aVar2.c(intValue);
                return 0;
            case 4:
                pw3Var.f464961g = aVar2.i(intValue);
                return 0;
            case 5:
                pw3Var.f464962h = aVar2.k(intValue);
                return 0;
            case 6:
                pw3Var.f464963i = aVar2.k(intValue);
                return 0;
            case 7:
                pw3Var.f464964m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

package r45;

/* loaded from: classes9.dex */
public class km5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f460364d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460365e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460366f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460367g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f460368h;

    /* renamed from: i, reason: collision with root package name */
    public int f460369i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f460370m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.km5)) {
            return false;
        }
        r45.km5 km5Var = (r45.km5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f460364d), java.lang.Integer.valueOf(km5Var.f460364d)) && n51.f.a(this.f460365e, km5Var.f460365e) && n51.f.a(this.f460366f, km5Var.f460366f) && n51.f.a(this.f460367g, km5Var.f460367g) && n51.f.a(this.f460368h, km5Var.f460368h) && n51.f.a(java.lang.Integer.valueOf(this.f460369i), java.lang.Integer.valueOf(km5Var.f460369i)) && n51.f.a(java.lang.Boolean.valueOf(this.f460370m), java.lang.Boolean.valueOf(km5Var.f460370m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f460364d);
            java.lang.String str = this.f460365e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f460366f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f460367g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f460368h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f460369i);
            fVar.a(7, this.f460370m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f460364d) + 0;
            java.lang.String str5 = this.f460365e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f460366f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f460367g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f460368h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            return e17 + b36.f.e(6, this.f460369i) + b36.f.a(7, this.f460370m);
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
        r45.km5 km5Var = (r45.km5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                km5Var.f460364d = aVar2.g(intValue);
                return 0;
            case 2:
                km5Var.f460365e = aVar2.k(intValue);
                return 0;
            case 3:
                km5Var.f460366f = aVar2.k(intValue);
                return 0;
            case 4:
                km5Var.f460367g = aVar2.k(intValue);
                return 0;
            case 5:
                km5Var.f460368h = aVar2.k(intValue);
                return 0;
            case 6:
                km5Var.f460369i = aVar2.g(intValue);
                return 0;
            case 7:
                km5Var.f460370m = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

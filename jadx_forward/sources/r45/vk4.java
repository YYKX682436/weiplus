package r45;

/* loaded from: classes8.dex */
public class vk4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f469850d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469851e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469852f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469853g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f469854h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f469855i;

    /* renamed from: m, reason: collision with root package name */
    public int f469856m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vk4)) {
            return false;
        }
        r45.vk4 vk4Var = (r45.vk4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f469850d), java.lang.Integer.valueOf(vk4Var.f469850d)) && n51.f.a(this.f469851e, vk4Var.f469851e) && n51.f.a(this.f469852f, vk4Var.f469852f) && n51.f.a(this.f469853g, vk4Var.f469853g) && n51.f.a(this.f469854h, vk4Var.f469854h) && n51.f.a(this.f469855i, vk4Var.f469855i) && n51.f.a(java.lang.Integer.valueOf(this.f469856m), java.lang.Integer.valueOf(vk4Var.f469856m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f469850d);
            java.lang.String str = this.f469851e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f469852f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f469853g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f469854h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f469855i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f469856m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f469850d) + 0;
            java.lang.String str6 = this.f469851e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f469852f;
            if (str7 != null) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f469853g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f469854h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f469855i;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            return e17 + b36.f.e(7, this.f469856m);
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
        r45.vk4 vk4Var = (r45.vk4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vk4Var.f469850d = aVar2.g(intValue);
                return 0;
            case 2:
                vk4Var.f469851e = aVar2.k(intValue);
                return 0;
            case 3:
                vk4Var.f469852f = aVar2.k(intValue);
                return 0;
            case 4:
                vk4Var.f469853g = aVar2.k(intValue);
                return 0;
            case 5:
                vk4Var.f469854h = aVar2.k(intValue);
                return 0;
            case 6:
                vk4Var.f469855i = aVar2.k(intValue);
                return 0;
            case 7:
                vk4Var.f469856m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

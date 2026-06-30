package r45;

/* loaded from: classes8.dex */
public class zp3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473800d;

    /* renamed from: e, reason: collision with root package name */
    public int f473801e;

    /* renamed from: f, reason: collision with root package name */
    public int f473802f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f473803g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f473804h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f473805i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zp3)) {
            return false;
        }
        r45.zp3 zp3Var = (r45.zp3) fVar;
        return n51.f.a(this.f473800d, zp3Var.f473800d) && n51.f.a(java.lang.Integer.valueOf(this.f473801e), java.lang.Integer.valueOf(zp3Var.f473801e)) && n51.f.a(java.lang.Integer.valueOf(this.f473802f), java.lang.Integer.valueOf(zp3Var.f473802f)) && n51.f.a(this.f473803g, zp3Var.f473803g) && n51.f.a(this.f473804h, zp3Var.f473804h) && n51.f.a(this.f473805i, zp3Var.f473805i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f473800d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f473801e);
            fVar.e(3, this.f473802f);
            java.lang.String str2 = this.f473803g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f473804h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f473805i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f473800d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.e(2, this.f473801e) + b36.f.e(3, this.f473802f);
            java.lang.String str6 = this.f473803g;
            if (str6 != null) {
                j17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f473804h;
            if (str7 != null) {
                j17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f473805i;
            return str8 != null ? j17 + b36.f.j(6, str8) : j17;
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
        r45.zp3 zp3Var = (r45.zp3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                zp3Var.f473800d = aVar2.k(intValue);
                return 0;
            case 2:
                zp3Var.f473801e = aVar2.g(intValue);
                return 0;
            case 3:
                zp3Var.f473802f = aVar2.g(intValue);
                return 0;
            case 4:
                zp3Var.f473803g = aVar2.k(intValue);
                return 0;
            case 5:
                zp3Var.f473804h = aVar2.k(intValue);
                return 0;
            case 6:
                zp3Var.f473805i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

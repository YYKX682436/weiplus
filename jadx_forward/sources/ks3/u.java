package ks3;

/* loaded from: classes8.dex */
public class u extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f393282d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f393283e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f393284f;

    /* renamed from: g, reason: collision with root package name */
    public int f393285g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f393286h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof ks3.u)) {
            return false;
        }
        ks3.u uVar = (ks3.u) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f393282d), java.lang.Integer.valueOf(uVar.f393282d)) && n51.f.a(this.f393283e, uVar.f393283e) && n51.f.a(this.f393284f, uVar.f393284f) && n51.f.a(java.lang.Integer.valueOf(this.f393285g), java.lang.Integer.valueOf(uVar.f393285g)) && n51.f.a(this.f393286h, uVar.f393286h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f393282d);
            java.lang.String str = this.f393283e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f393284f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f393285g);
            java.lang.String str3 = this.f393286h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f393282d) + 0;
            java.lang.String str4 = this.f393283e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f393284f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            int e18 = e17 + b36.f.e(4, this.f393285g);
            java.lang.String str6 = this.f393286h;
            return str6 != null ? e18 + b36.f.j(5, str6) : e18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        ks3.u uVar = (ks3.u) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            uVar.f393282d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            uVar.f393283e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            uVar.f393284f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            uVar.f393285g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        uVar.f393286h = aVar2.k(intValue);
        return 0;
    }
}

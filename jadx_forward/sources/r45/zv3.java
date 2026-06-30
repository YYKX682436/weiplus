package r45;

/* loaded from: classes9.dex */
public class zv3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473918d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f473919e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f473920f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f473921g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zv3)) {
            return false;
        }
        r45.zv3 zv3Var = (r45.zv3) fVar;
        return n51.f.a(this.f473918d, zv3Var.f473918d) && n51.f.a(this.f473919e, zv3Var.f473919e) && n51.f.a(this.f473920f, zv3Var.f473920f) && n51.f.a(this.f473921g, zv3Var.f473921g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f473918d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f473919e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f473920f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f473921g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f473918d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f473919e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f473920f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f473921g;
            return str8 != null ? j17 + b36.f.j(4, str8) : j17;
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
        r45.zv3 zv3Var = (r45.zv3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            zv3Var.f473918d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            zv3Var.f473919e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            zv3Var.f473920f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        zv3Var.f473921g = aVar2.k(intValue);
        return 0;
    }
}

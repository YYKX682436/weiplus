package r45;

/* loaded from: classes4.dex */
public class my4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f462457d;

    /* renamed from: e, reason: collision with root package name */
    public int f462458e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f462459f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f462460g;

    /* renamed from: h, reason: collision with root package name */
    public long f462461h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f462462i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.my4)) {
            return false;
        }
        r45.my4 my4Var = (r45.my4) fVar;
        return n51.f.a(this.f76494x2de60e5e, my4Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f462457d), java.lang.Integer.valueOf(my4Var.f462457d)) && n51.f.a(java.lang.Integer.valueOf(this.f462458e), java.lang.Integer.valueOf(my4Var.f462458e)) && n51.f.a(this.f462459f, my4Var.f462459f) && n51.f.a(this.f462460g, my4Var.f462460g) && n51.f.a(java.lang.Long.valueOf(this.f462461h), java.lang.Long.valueOf(my4Var.f462461h)) && n51.f.a(this.f462462i, my4Var.f462462i);
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
            fVar.e(2, this.f462457d);
            fVar.e(3, this.f462458e);
            java.lang.String str = this.f462459f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f462460g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.h(6, this.f462461h);
            java.lang.String str3 = this.f462462i;
            if (str3 != null) {
                fVar.j(100, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f462457d) + b36.f.e(3, this.f462458e);
            java.lang.String str4 = this.f462459f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f462460g;
            if (str5 != null) {
                i18 += b36.f.j(5, str5);
            }
            int h17 = i18 + b36.f.h(6, this.f462461h);
            java.lang.String str6 = this.f462462i;
            return str6 != null ? h17 + b36.f.j(100, str6) : h17;
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
        r45.my4 my4Var = (r45.my4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 100) {
            my4Var.f462462i = aVar2.k(intValue);
            return 0;
        }
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
                    my4Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                my4Var.f462457d = aVar2.g(intValue);
                return 0;
            case 3:
                my4Var.f462458e = aVar2.g(intValue);
                return 0;
            case 4:
                my4Var.f462459f = aVar2.k(intValue);
                return 0;
            case 5:
                my4Var.f462460g = aVar2.k(intValue);
                return 0;
            case 6:
                my4Var.f462461h = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

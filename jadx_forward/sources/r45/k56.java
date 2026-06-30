package r45;

/* loaded from: classes7.dex */
public class k56 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f459920d;

    /* renamed from: e, reason: collision with root package name */
    public long f459921e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f459922f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f459923g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f459924h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f459925i;

    /* renamed from: m, reason: collision with root package name */
    public r45.xy6 f459926m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k56)) {
            return false;
        }
        r45.k56 k56Var = (r45.k56) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f459920d), java.lang.Integer.valueOf(k56Var.f459920d)) && n51.f.a(java.lang.Long.valueOf(this.f459921e), java.lang.Long.valueOf(k56Var.f459921e)) && n51.f.a(this.f459922f, k56Var.f459922f) && n51.f.a(this.f459923g, k56Var.f459923g) && n51.f.a(this.f459924h, k56Var.f459924h) && n51.f.a(this.f459925i, k56Var.f459925i) && n51.f.a(this.f459926m, k56Var.f459926m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f459920d);
            fVar.h(2, this.f459921e);
            java.lang.String str = this.f459922f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f459923g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f459924h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f459925i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            r45.xy6 xy6Var = this.f459926m;
            if (xy6Var != null) {
                fVar.i(7, xy6Var.mo75928xcd1e8d8());
                this.f459926m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f459920d) + 0 + b36.f.h(2, this.f459921e);
            java.lang.String str5 = this.f459922f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f459923g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f459924h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f459925i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            r45.xy6 xy6Var2 = this.f459926m;
            return xy6Var2 != null ? e17 + b36.f.i(7, xy6Var2.mo75928xcd1e8d8()) : e17;
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
        r45.k56 k56Var = (r45.k56) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                k56Var.f459920d = aVar2.g(intValue);
                return 0;
            case 2:
                k56Var.f459921e = aVar2.i(intValue);
                return 0;
            case 3:
                k56Var.f459922f = aVar2.k(intValue);
                return 0;
            case 4:
                k56Var.f459923g = aVar2.k(intValue);
                return 0;
            case 5:
                k56Var.f459924h = aVar2.k(intValue);
                return 0;
            case 6:
                k56Var.f459925i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.xy6 xy6Var3 = new r45.xy6();
                    if (bArr != null && bArr.length > 0) {
                        xy6Var3.mo11468x92b714fd(bArr);
                    }
                    k56Var.f459926m = xy6Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

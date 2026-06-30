package r45;

/* loaded from: classes8.dex */
public class s4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467019d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467020e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f467021f;

    /* renamed from: g, reason: collision with root package name */
    public r45.l05 f467022g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f467023h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s4)) {
            return false;
        }
        r45.s4 s4Var = (r45.s4) fVar;
        return n51.f.a(this.f467019d, s4Var.f467019d) && n51.f.a(this.f467020e, s4Var.f467020e) && n51.f.a(this.f467021f, s4Var.f467021f) && n51.f.a(this.f467022g, s4Var.f467022g) && n51.f.a(this.f467023h, s4Var.f467023h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f467019d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f467020e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f467021f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            r45.l05 l05Var = this.f467022g;
            if (l05Var != null) {
                fVar.i(4, l05Var.mo75928xcd1e8d8());
                this.f467022g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f467023h;
            if (str4 != null) {
                fVar.j(100, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f467019d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f467020e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f467021f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            r45.l05 l05Var2 = this.f467022g;
            if (l05Var2 != null) {
                j17 += b36.f.i(4, l05Var2.mo75928xcd1e8d8());
            }
            java.lang.String str8 = this.f467023h;
            return str8 != null ? j17 + b36.f.j(100, str8) : j17;
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
        r45.s4 s4Var = (r45.s4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            s4Var.f467019d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            s4Var.f467020e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            s4Var.f467021f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 100) {
                return -1;
            }
            s4Var.f467023h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.l05 l05Var3 = new r45.l05();
            if (bArr != null && bArr.length > 0) {
                l05Var3.mo11468x92b714fd(bArr);
            }
            s4Var.f467022g = l05Var3;
        }
        return 0;
    }
}

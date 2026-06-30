package r45;

/* loaded from: classes8.dex */
public class we5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f470638d;

    /* renamed from: e, reason: collision with root package name */
    public long f470639e;

    /* renamed from: f, reason: collision with root package name */
    public int f470640f;

    /* renamed from: g, reason: collision with root package name */
    public int f470641g;

    /* renamed from: h, reason: collision with root package name */
    public int f470642h;

    /* renamed from: i, reason: collision with root package name */
    public int f470643i;

    /* renamed from: m, reason: collision with root package name */
    public int f470644m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f470645n;

    /* renamed from: o, reason: collision with root package name */
    public int f470646o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f470647p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.we5)) {
            return false;
        }
        r45.we5 we5Var = (r45.we5) fVar;
        return n51.f.a(this.f76492x92037252, we5Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f470638d), java.lang.Integer.valueOf(we5Var.f470638d)) && n51.f.a(java.lang.Long.valueOf(this.f470639e), java.lang.Long.valueOf(we5Var.f470639e)) && n51.f.a(java.lang.Integer.valueOf(this.f470640f), java.lang.Integer.valueOf(we5Var.f470640f)) && n51.f.a(java.lang.Integer.valueOf(this.f470641g), java.lang.Integer.valueOf(we5Var.f470641g)) && n51.f.a(java.lang.Integer.valueOf(this.f470642h), java.lang.Integer.valueOf(we5Var.f470642h)) && n51.f.a(java.lang.Integer.valueOf(this.f470643i), java.lang.Integer.valueOf(we5Var.f470643i)) && n51.f.a(java.lang.Integer.valueOf(this.f470644m), java.lang.Integer.valueOf(we5Var.f470644m)) && n51.f.a(this.f470645n, we5Var.f470645n) && n51.f.a(java.lang.Integer.valueOf(this.f470646o), java.lang.Integer.valueOf(we5Var.f470646o)) && n51.f.a(this.f470647p, we5Var.f470647p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f470638d);
            fVar.h(4, this.f470639e);
            fVar.e(5, this.f470640f);
            fVar.e(6, this.f470641g);
            fVar.e(7, this.f470642h);
            fVar.e(8, this.f470643i);
            fVar.e(9, this.f470644m);
            java.lang.String str = this.f470645n;
            if (str != null) {
                fVar.j(10, str);
            }
            fVar.e(11, this.f470646o);
            java.lang.String str2 = this.f470647p;
            if (str2 != null) {
                fVar.j(12, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(3, this.f470638d) + b36.f.h(4, this.f470639e) + b36.f.e(5, this.f470640f) + b36.f.e(6, this.f470641g) + b36.f.e(7, this.f470642h) + b36.f.e(8, this.f470643i) + b36.f.e(9, this.f470644m);
            java.lang.String str3 = this.f470645n;
            if (str3 != null) {
                i18 += b36.f.j(10, str3);
            }
            int e17 = i18 + b36.f.e(11, this.f470646o);
            java.lang.String str4 = this.f470647p;
            return str4 != null ? e17 + b36.f.j(12, str4) : e17;
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
        r45.we5 we5Var = (r45.we5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    we5Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
            default:
                return -1;
            case 3:
                we5Var.f470638d = aVar2.g(intValue);
                return 0;
            case 4:
                we5Var.f470639e = aVar2.i(intValue);
                return 0;
            case 5:
                we5Var.f470640f = aVar2.g(intValue);
                return 0;
            case 6:
                we5Var.f470641g = aVar2.g(intValue);
                return 0;
            case 7:
                we5Var.f470642h = aVar2.g(intValue);
                return 0;
            case 8:
                we5Var.f470643i = aVar2.g(intValue);
                return 0;
            case 9:
                we5Var.f470644m = aVar2.g(intValue);
                return 0;
            case 10:
                we5Var.f470645n = aVar2.k(intValue);
                return 0;
            case 11:
                we5Var.f470646o = aVar2.g(intValue);
                return 0;
            case 12:
                we5Var.f470647p = aVar2.k(intValue);
                return 0;
        }
    }
}

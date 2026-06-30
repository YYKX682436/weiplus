package r45;

/* loaded from: classes4.dex */
public class w76 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f470481d;

    /* renamed from: e, reason: collision with root package name */
    public int f470482e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f470483f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f470484g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f470485h;

    /* renamed from: i, reason: collision with root package name */
    public int f470486i;

    /* renamed from: m, reason: collision with root package name */
    public r45.ga6 f470487m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w76)) {
            return false;
        }
        r45.w76 w76Var = (r45.w76) fVar;
        return n51.f.a(this.f76492x92037252, w76Var.f76492x92037252) && n51.f.a(this.f470481d, w76Var.f470481d) && n51.f.a(java.lang.Integer.valueOf(this.f470482e), java.lang.Integer.valueOf(w76Var.f470482e)) && n51.f.a(this.f470483f, w76Var.f470483f) && n51.f.a(java.lang.Integer.valueOf(this.f470484g), java.lang.Integer.valueOf(w76Var.f470484g)) && n51.f.a(this.f470485h, w76Var.f470485h) && n51.f.a(java.lang.Integer.valueOf(this.f470486i), java.lang.Integer.valueOf(w76Var.f470486i)) && n51.f.a(this.f470487m, w76Var.f470487m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f470483f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f470481d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f470482e);
            fVar.g(4, 8, linkedList);
            fVar.e(5, this.f470484g);
            java.lang.String str2 = this.f470485h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f470486i);
            r45.ga6 ga6Var = this.f470487m;
            if (ga6Var != null) {
                fVar.i(8, ga6Var.mo75928xcd1e8d8());
                this.f470487m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f470481d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f470482e) + b36.f.g(4, 8, linkedList) + b36.f.e(5, this.f470484g);
            java.lang.String str4 = this.f470485h;
            if (str4 != null) {
                e17 += b36.f.j(6, str4);
            }
            int e18 = e17 + b36.f.e(7, this.f470486i);
            r45.ga6 ga6Var2 = this.f470487m;
            return ga6Var2 != null ? e18 + b36.f.i(8, ga6Var2.mo75928xcd1e8d8()) : e18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.w76 w76Var = (r45.w76) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    w76Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                w76Var.f470481d = aVar2.k(intValue);
                return 0;
            case 3:
                w76Var.f470482e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7();
                    if (bArr3 != null && bArr3.length > 0) {
                        c19806x4c372b7.mo11468x92b714fd(bArr3);
                    }
                    w76Var.f470483f.add(c19806x4c372b7);
                }
                return 0;
            case 5:
                w76Var.f470484g = aVar2.g(intValue);
                return 0;
            case 6:
                w76Var.f470485h = aVar2.k(intValue);
                return 0;
            case 7:
                w76Var.f470486i = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.ga6 ga6Var3 = new r45.ga6();
                    if (bArr4 != null && bArr4.length > 0) {
                        ga6Var3.mo11468x92b714fd(bArr4);
                    }
                    w76Var.f470487m = ga6Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

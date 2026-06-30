package r45;

/* loaded from: classes9.dex */
public class li3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public long f461031d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461032e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f461033f;

    /* renamed from: g, reason: collision with root package name */
    public long f461034g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f461035h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f461036i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f461037m = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.li3)) {
            return false;
        }
        r45.li3 li3Var = (r45.li3) fVar;
        return n51.f.a(this.f76492x92037252, li3Var.f76492x92037252) && n51.f.a(java.lang.Long.valueOf(this.f461031d), java.lang.Long.valueOf(li3Var.f461031d)) && n51.f.a(this.f461032e, li3Var.f461032e) && n51.f.a(java.lang.Boolean.valueOf(this.f461033f), java.lang.Boolean.valueOf(li3Var.f461033f)) && n51.f.a(java.lang.Long.valueOf(this.f461034g), java.lang.Long.valueOf(li3Var.f461034g)) && n51.f.a(this.f461035h, li3Var.f461035h) && n51.f.a(this.f461036i, li3Var.f461036i) && n51.f.a(this.f461037m, li3Var.f461037m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f461036i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.h(2, this.f461031d);
            java.lang.String str = this.f461032e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.a(4, this.f461033f);
            fVar.h(5, this.f461034g);
            java.lang.String str2 = this.f461035h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.g(7, 8, linkedList);
            fVar.g(8, 8, this.f461037m);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.h(2, this.f461031d);
            java.lang.String str3 = this.f461032e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int a17 = i18 + b36.f.a(4, this.f461033f) + b36.f.h(5, this.f461034g);
            java.lang.String str4 = this.f461035h;
            if (str4 != null) {
                a17 += b36.f.j(6, str4);
            }
            return a17 + b36.f.g(7, 8, linkedList) + b36.f.g(8, 8, this.f461037m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            this.f461037m.clear();
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
        r45.li3 li3Var = (r45.li3) objArr[1];
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
                    li3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                li3Var.f461031d = aVar2.i(intValue);
                return 0;
            case 3:
                li3Var.f461032e = aVar2.k(intValue);
                return 0;
            case 4:
                li3Var.f461033f = aVar2.c(intValue);
                return 0;
            case 5:
                li3Var.f461034g = aVar2.i(intValue);
                return 0;
            case 6:
                li3Var.f461035h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.xt xtVar = new r45.xt();
                    if (bArr3 != null && bArr3.length > 0) {
                        xtVar.mo11468x92b714fd(bArr3);
                    }
                    li3Var.f461036i.add(xtVar);
                }
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.tt ttVar = new r45.tt();
                    if (bArr4 != null && bArr4.length > 0) {
                        ttVar.mo11468x92b714fd(bArr4);
                    }
                    li3Var.f461037m.add(ttVar);
                }
                return 0;
            default:
                return -1;
        }
    }
}

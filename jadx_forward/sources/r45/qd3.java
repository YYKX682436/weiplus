package r45;

/* loaded from: classes9.dex */
public class qd3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public long f465383d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465384e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f465385f;

    /* renamed from: g, reason: collision with root package name */
    public long f465386g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f465387h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f465388i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public r45.k90 f465389m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qd3)) {
            return false;
        }
        r45.qd3 qd3Var = (r45.qd3) fVar;
        return n51.f.a(this.f76492x92037252, qd3Var.f76492x92037252) && n51.f.a(java.lang.Long.valueOf(this.f465383d), java.lang.Long.valueOf(qd3Var.f465383d)) && n51.f.a(this.f465384e, qd3Var.f465384e) && n51.f.a(java.lang.Boolean.valueOf(this.f465385f), java.lang.Boolean.valueOf(qd3Var.f465385f)) && n51.f.a(java.lang.Long.valueOf(this.f465386g), java.lang.Long.valueOf(qd3Var.f465386g)) && n51.f.a(this.f465387h, qd3Var.f465387h) && n51.f.a(this.f465388i, qd3Var.f465388i) && n51.f.a(this.f465389m, qd3Var.f465389m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f465388i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.h(2, this.f465383d);
            java.lang.String str = this.f465384e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.a(4, this.f465385f);
            fVar.h(5, this.f465386g);
            java.lang.String str2 = this.f465387h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.g(7, 8, linkedList);
            r45.k90 k90Var = this.f465389m;
            if (k90Var != null) {
                fVar.i(8, k90Var.mo75928xcd1e8d8());
                this.f465389m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.h(2, this.f465383d);
            java.lang.String str3 = this.f465384e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int a17 = i18 + b36.f.a(4, this.f465385f) + b36.f.h(5, this.f465386g);
            java.lang.String str4 = this.f465387h;
            if (str4 != null) {
                a17 += b36.f.j(6, str4);
            }
            int g17 = a17 + b36.f.g(7, 8, linkedList);
            r45.k90 k90Var2 = this.f465389m;
            return k90Var2 != null ? g17 + b36.f.i(8, k90Var2.mo75928xcd1e8d8()) : g17;
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
        r45.qd3 qd3Var = (r45.qd3) objArr[1];
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
                    qd3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                qd3Var.f465383d = aVar2.i(intValue);
                return 0;
            case 3:
                qd3Var.f465384e = aVar2.k(intValue);
                return 0;
            case 4:
                qd3Var.f465385f = aVar2.c(intValue);
                return 0;
            case 5:
                qd3Var.f465386g = aVar2.i(intValue);
                return 0;
            case 6:
                qd3Var.f465387h = aVar2.k(intValue);
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
                    qd3Var.f465388i.add(xtVar);
                }
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.k90 k90Var3 = new r45.k90();
                    if (bArr4 != null && bArr4.length > 0) {
                        k90Var3.mo11468x92b714fd(bArr4);
                    }
                    qd3Var.f465389m = k90Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

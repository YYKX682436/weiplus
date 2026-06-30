package r45;

/* loaded from: classes4.dex */
public class bz extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f452692d;

    /* renamed from: e, reason: collision with root package name */
    public int f452693e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f452695g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f452696h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f452697i;

    /* renamed from: m, reason: collision with root package name */
    public int f452698m;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f452694f = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f452699n = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bz)) {
            return false;
        }
        r45.bz bzVar = (r45.bz) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f452692d), java.lang.Integer.valueOf(bzVar.f452692d)) && n51.f.a(java.lang.Integer.valueOf(this.f452693e), java.lang.Integer.valueOf(bzVar.f452693e)) && n51.f.a(this.f452694f, bzVar.f452694f) && n51.f.a(this.f452695g, bzVar.f452695g) && n51.f.a(this.f452696h, bzVar.f452696h) && n51.f.a(this.f452697i, bzVar.f452697i) && n51.f.a(java.lang.Integer.valueOf(this.f452698m), java.lang.Integer.valueOf(bzVar.f452698m)) && n51.f.a(this.f452699n, bzVar.f452699n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f452699n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f452692d);
            fVar.e(2, this.f452693e);
            fVar.g(3, 8, this.f452694f);
            java.lang.String str = this.f452695g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f452696h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f452697i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.e(7, this.f452698m);
            fVar.g(8, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f452692d) + 0 + b36.f.e(2, this.f452693e) + b36.f.g(3, 8, this.f452694f);
            java.lang.String str4 = this.f452695g;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f452696h;
            if (str5 != null) {
                e17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f452697i;
            if (str6 != null) {
                e17 += b36.f.j(6, str6);
            }
            return e17 + b36.f.e(7, this.f452698m) + b36.f.g(8, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f452694f.clear();
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
        r45.bz bzVar = (r45.bz) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bzVar.f452692d = aVar2.g(intValue);
                return 0;
            case 2:
                bzVar.f452693e = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.hk4 hk4Var = new r45.hk4();
                    if (bArr2 != null && bArr2.length > 0) {
                        hk4Var.mo11468x92b714fd(bArr2);
                    }
                    bzVar.f452694f.add(hk4Var);
                }
                return 0;
            case 4:
                bzVar.f452695g = aVar2.k(intValue);
                return 0;
            case 5:
                bzVar.f452696h = aVar2.k(intValue);
                return 0;
            case 6:
                bzVar.f452697i = aVar2.k(intValue);
                return 0;
            case 7:
                bzVar.f452698m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.nt5 nt5Var = new r45.nt5();
                    if (bArr3 != null && bArr3.length > 0) {
                        nt5Var.mo11468x92b714fd(bArr3);
                    }
                    bzVar.f452699n.add(nt5Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}

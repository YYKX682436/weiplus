package r45;

/* loaded from: classes9.dex */
public class g45 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456404d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456405e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456406f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f456407g;

    /* renamed from: h, reason: collision with root package name */
    public int f456408h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f456409i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f456410m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f456411n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g45)) {
            return false;
        }
        r45.g45 g45Var = (r45.g45) fVar;
        return n51.f.a(this.f456404d, g45Var.f456404d) && n51.f.a(this.f456405e, g45Var.f456405e) && n51.f.a(this.f456406f, g45Var.f456406f) && n51.f.a(this.f456407g, g45Var.f456407g) && n51.f.a(java.lang.Integer.valueOf(this.f456408h), java.lang.Integer.valueOf(g45Var.f456408h)) && n51.f.a(this.f456409i, g45Var.f456409i) && n51.f.a(this.f456410m, g45Var.f456410m) && n51.f.a(this.f456411n, g45Var.f456411n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f456409i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f456404d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f456405e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f456406f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f456407g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f456408h);
            fVar.g(6, 8, linkedList);
            java.lang.String str5 = this.f456410m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f456411n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f456404d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f456405e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f456406f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f456407g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            int e17 = j17 + b36.f.e(5, this.f456408h) + b36.f.g(6, 8, linkedList);
            java.lang.String str11 = this.f456410m;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f456411n;
            return str12 != null ? e17 + b36.f.j(8, str12) : e17;
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
        r45.g45 g45Var = (r45.g45) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                g45Var.f456404d = aVar2.k(intValue);
                return 0;
            case 2:
                g45Var.f456405e = aVar2.k(intValue);
                return 0;
            case 3:
                g45Var.f456406f = aVar2.k(intValue);
                return 0;
            case 4:
                g45Var.f456407g = aVar2.k(intValue);
                return 0;
            case 5:
                g45Var.f456408h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.st stVar = new r45.st();
                    if (bArr2 != null && bArr2.length > 0) {
                        stVar.mo11468x92b714fd(bArr2);
                    }
                    g45Var.f456409i.add(stVar);
                }
                return 0;
            case 7:
                g45Var.f456410m = aVar2.k(intValue);
                return 0;
            case 8:
                g45Var.f456411n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

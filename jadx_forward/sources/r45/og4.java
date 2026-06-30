package r45;

/* loaded from: classes2.dex */
public class og4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f463768d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f463769e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f463770f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f463771g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f463772h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f463773i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f463774m;

    /* renamed from: n, reason: collision with root package name */
    public int f463775n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f463776o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.og4)) {
            return false;
        }
        r45.og4 og4Var = (r45.og4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f463768d), java.lang.Integer.valueOf(og4Var.f463768d)) && n51.f.a(this.f463769e, og4Var.f463769e) && n51.f.a(this.f463770f, og4Var.f463770f) && n51.f.a(this.f463771g, og4Var.f463771g) && n51.f.a(this.f463772h, og4Var.f463772h) && n51.f.a(this.f463773i, og4Var.f463773i) && n51.f.a(this.f463774m, og4Var.f463774m) && n51.f.a(java.lang.Integer.valueOf(this.f463775n), java.lang.Integer.valueOf(og4Var.f463775n)) && n51.f.a(java.lang.Boolean.valueOf(this.f463776o), java.lang.Boolean.valueOf(og4Var.f463776o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f463770f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f463768d);
            java.lang.String str = this.f463769e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, linkedList);
            java.lang.String str2 = this.f463771g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f463772h;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            java.lang.String str3 = this.f463773i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f463774m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f463775n);
            fVar.a(9, this.f463776o);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f463768d) + 0;
            java.lang.String str5 = this.f463769e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            int g17 = e17 + b36.f.g(3, 8, linkedList);
            java.lang.String str6 = this.f463771g;
            if (str6 != null) {
                g17 += b36.f.j(4, str6);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f463772h;
            if (gVar2 != null) {
                g17 += b36.f.b(5, gVar2);
            }
            java.lang.String str7 = this.f463773i;
            if (str7 != null) {
                g17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f463774m;
            if (str8 != null) {
                g17 += b36.f.j(7, str8);
            }
            return g17 + b36.f.e(8, this.f463775n) + b36.f.a(9, this.f463776o);
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
        r45.og4 og4Var = (r45.og4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                og4Var.f463768d = aVar2.g(intValue);
                return 0;
            case 2:
                og4Var.f463769e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.kv6 kv6Var = new r45.kv6();
                    if (bArr2 != null && bArr2.length > 0) {
                        kv6Var.mo11468x92b714fd(bArr2);
                    }
                    og4Var.f463770f.add(kv6Var);
                }
                return 0;
            case 4:
                og4Var.f463771g = aVar2.k(intValue);
                return 0;
            case 5:
                og4Var.f463772h = aVar2.d(intValue);
                return 0;
            case 6:
                og4Var.f463773i = aVar2.k(intValue);
                return 0;
            case 7:
                og4Var.f463774m = aVar2.k(intValue);
                return 0;
            case 8:
                og4Var.f463775n = aVar2.g(intValue);
                return 0;
            case 9:
                og4Var.f463776o = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

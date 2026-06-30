package r45;

/* loaded from: classes4.dex */
public class y60 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472351d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472352e;

    /* renamed from: f, reason: collision with root package name */
    public long f472353f;

    /* renamed from: g, reason: collision with root package name */
    public int f472354g;

    /* renamed from: h, reason: collision with root package name */
    public int f472355h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f472356i = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y60)) {
            return false;
        }
        r45.y60 y60Var = (r45.y60) fVar;
        return n51.f.a(this.f472351d, y60Var.f472351d) && n51.f.a(this.f472352e, y60Var.f472352e) && n51.f.a(java.lang.Long.valueOf(this.f472353f), java.lang.Long.valueOf(y60Var.f472353f)) && n51.f.a(java.lang.Integer.valueOf(this.f472354g), java.lang.Integer.valueOf(y60Var.f472354g)) && n51.f.a(java.lang.Integer.valueOf(this.f472355h), java.lang.Integer.valueOf(y60Var.f472355h)) && n51.f.a(this.f472356i, y60Var.f472356i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f472356i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f472351d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f472352e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f472353f);
            fVar.e(4, this.f472354g);
            fVar.e(5, this.f472355h);
            fVar.g(6, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f472351d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f472352e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.h(3, this.f472353f) + b36.f.e(4, this.f472354g) + b36.f.e(5, this.f472355h) + b36.f.g(6, 8, linkedList);
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
        r45.y60 y60Var = (r45.y60) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                y60Var.f472351d = aVar2.k(intValue);
                return 0;
            case 2:
                y60Var.f472352e = aVar2.k(intValue);
                return 0;
            case 3:
                y60Var.f472353f = aVar2.i(intValue);
                return 0;
            case 4:
                y60Var.f472354g = aVar2.g(intValue);
                return 0;
            case 5:
                y60Var.f472355h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.a70 a70Var = new r45.a70();
                    if (bArr2 != null && bArr2.length > 0) {
                        a70Var.mo11468x92b714fd(bArr2);
                    }
                    y60Var.f472356i.add(a70Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}

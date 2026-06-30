package r45;

/* loaded from: classes4.dex */
public class ab6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f451430d;

    /* renamed from: e, reason: collision with root package name */
    public int f451431e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f451432f;

    /* renamed from: g, reason: collision with root package name */
    public r45.s76 f451433g;

    /* renamed from: h, reason: collision with root package name */
    public int f451434h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f451435i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public long f451436m;

    /* renamed from: n, reason: collision with root package name */
    public int f451437n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ab6)) {
            return false;
        }
        r45.ab6 ab6Var = (r45.ab6) fVar;
        return n51.f.a(this.f76492x92037252, ab6Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f451430d), java.lang.Integer.valueOf(ab6Var.f451430d)) && n51.f.a(java.lang.Integer.valueOf(this.f451431e), java.lang.Integer.valueOf(ab6Var.f451431e)) && n51.f.a(this.f451432f, ab6Var.f451432f) && n51.f.a(this.f451433g, ab6Var.f451433g) && n51.f.a(java.lang.Integer.valueOf(this.f451434h), java.lang.Integer.valueOf(ab6Var.f451434h)) && n51.f.a(this.f451435i, ab6Var.f451435i) && n51.f.a(java.lang.Long.valueOf(this.f451436m), java.lang.Long.valueOf(ab6Var.f451436m)) && n51.f.a(java.lang.Integer.valueOf(this.f451437n), java.lang.Integer.valueOf(ab6Var.f451437n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f451435i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f451430d);
            fVar.e(3, this.f451431e);
            java.lang.String str = this.f451432f;
            if (str != null) {
                fVar.j(4, str);
            }
            r45.s76 s76Var = this.f451433g;
            if (s76Var != null) {
                fVar.i(5, s76Var.mo75928xcd1e8d8());
                this.f451433g.mo75956x3d5d1f78(fVar);
            }
            fVar.e(6, this.f451434h);
            fVar.g(7, 8, linkedList);
            fVar.h(8, this.f451436m);
            fVar.e(9, this.f451437n);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f451430d) + b36.f.e(3, this.f451431e);
            java.lang.String str2 = this.f451432f;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            r45.s76 s76Var2 = this.f451433g;
            if (s76Var2 != null) {
                i18 += b36.f.i(5, s76Var2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.e(6, this.f451434h) + b36.f.g(7, 8, linkedList) + b36.f.h(8, this.f451436m) + b36.f.e(9, this.f451437n);
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
        r45.ab6 ab6Var = (r45.ab6) objArr[1];
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
                    ab6Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                ab6Var.f451430d = aVar2.g(intValue);
                return 0;
            case 3:
                ab6Var.f451431e = aVar2.g(intValue);
                return 0;
            case 4:
                ab6Var.f451432f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.s76 s76Var3 = new r45.s76();
                    if (bArr3 != null && bArr3.length > 0) {
                        s76Var3.mo11468x92b714fd(bArr3);
                    }
                    ab6Var.f451433g = s76Var3;
                }
                return 0;
            case 6:
                ab6Var.f451434h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.s76 s76Var4 = new r45.s76();
                    if (bArr4 != null && bArr4.length > 0) {
                        s76Var4.mo11468x92b714fd(bArr4);
                    }
                    ab6Var.f451435i.add(s76Var4);
                }
                return 0;
            case 8:
                ab6Var.f451436m = aVar2.i(intValue);
                return 0;
            case 9:
                ab6Var.f451437n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

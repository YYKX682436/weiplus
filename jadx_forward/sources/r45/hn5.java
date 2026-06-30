package r45;

/* loaded from: classes9.dex */
public class hn5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f457849d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f457850e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f457851f;

    /* renamed from: g, reason: collision with root package name */
    public int f457852g;

    /* renamed from: h, reason: collision with root package name */
    public r45.io6 f457853h;

    /* renamed from: i, reason: collision with root package name */
    public int f457854i;

    /* renamed from: m, reason: collision with root package name */
    public int f457855m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hn5)) {
            return false;
        }
        r45.hn5 hn5Var = (r45.hn5) fVar;
        return n51.f.a(this.f76492x92037252, hn5Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f457849d), java.lang.Integer.valueOf(hn5Var.f457849d)) && n51.f.a(this.f457850e, hn5Var.f457850e) && n51.f.a(this.f457851f, hn5Var.f457851f) && n51.f.a(java.lang.Integer.valueOf(this.f457852g), java.lang.Integer.valueOf(hn5Var.f457852g)) && n51.f.a(this.f457853h, hn5Var.f457853h) && n51.f.a(java.lang.Integer.valueOf(this.f457854i), java.lang.Integer.valueOf(hn5Var.f457854i)) && n51.f.a(java.lang.Integer.valueOf(this.f457855m), java.lang.Integer.valueOf(hn5Var.f457855m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f457850e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f457849d);
            fVar.g(3, 8, linkedList);
            java.lang.String str = this.f457851f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f457852g);
            r45.io6 io6Var = this.f457853h;
            if (io6Var != null) {
                fVar.i(6, io6Var.mo75928xcd1e8d8());
                this.f457853h.mo75956x3d5d1f78(fVar);
            }
            fVar.e(7, this.f457854i);
            fVar.e(8, this.f457855m);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f457849d) + b36.f.g(3, 8, linkedList);
            java.lang.String str2 = this.f457851f;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            int e17 = i18 + b36.f.e(5, this.f457852g);
            r45.io6 io6Var2 = this.f457853h;
            if (io6Var2 != null) {
                e17 += b36.f.i(6, io6Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(7, this.f457854i) + b36.f.e(8, this.f457855m);
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
        r45.hn5 hn5Var = (r45.hn5) objArr[1];
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
                    hn5Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                hn5Var.f457849d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.mw6 mw6Var = new r45.mw6();
                    if (bArr3 != null && bArr3.length > 0) {
                        mw6Var.mo11468x92b714fd(bArr3);
                    }
                    hn5Var.f457850e.add(mw6Var);
                }
                return 0;
            case 4:
                hn5Var.f457851f = aVar2.k(intValue);
                return 0;
            case 5:
                hn5Var.f457852g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.io6 io6Var3 = new r45.io6();
                    if (bArr4 != null && bArr4.length > 0) {
                        io6Var3.mo11468x92b714fd(bArr4);
                    }
                    hn5Var.f457853h = io6Var3;
                }
                return 0;
            case 7:
                hn5Var.f457854i = aVar2.g(intValue);
                return 0;
            case 8:
                hn5Var.f457855m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

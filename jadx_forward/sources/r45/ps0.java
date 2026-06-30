package r45;

/* loaded from: classes8.dex */
public class ps0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464900d;

    /* renamed from: e, reason: collision with root package name */
    public long f464901e;

    /* renamed from: f, reason: collision with root package name */
    public int f464902f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464903g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f464904h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public r45.p63 f464905i;

    /* renamed from: m, reason: collision with root package name */
    public int f464906m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ps0)) {
            return false;
        }
        r45.ps0 ps0Var = (r45.ps0) fVar;
        return n51.f.a(this.f464900d, ps0Var.f464900d) && n51.f.a(java.lang.Long.valueOf(this.f464901e), java.lang.Long.valueOf(ps0Var.f464901e)) && n51.f.a(java.lang.Integer.valueOf(this.f464902f), java.lang.Integer.valueOf(ps0Var.f464902f)) && n51.f.a(this.f464903g, ps0Var.f464903g) && n51.f.a(this.f464904h, ps0Var.f464904h) && n51.f.a(this.f464905i, ps0Var.f464905i) && n51.f.a(java.lang.Integer.valueOf(this.f464906m), java.lang.Integer.valueOf(ps0Var.f464906m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f464904h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f464900d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f464901e);
            fVar.e(3, this.f464902f);
            java.lang.String str2 = this.f464903g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.g(5, 8, linkedList);
            r45.p63 p63Var = this.f464905i;
            if (p63Var != null) {
                fVar.i(6, p63Var.mo75928xcd1e8d8());
                this.f464905i.mo75956x3d5d1f78(fVar);
            }
            fVar.e(7, this.f464906m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f464900d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.h(2, this.f464901e) + b36.f.e(3, this.f464902f);
            java.lang.String str4 = this.f464903g;
            if (str4 != null) {
                j17 += b36.f.j(4, str4);
            }
            int g17 = j17 + b36.f.g(5, 8, linkedList);
            r45.p63 p63Var2 = this.f464905i;
            if (p63Var2 != null) {
                g17 += b36.f.i(6, p63Var2.mo75928xcd1e8d8());
            }
            return g17 + b36.f.e(7, this.f464906m);
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
        r45.ps0 ps0Var = (r45.ps0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ps0Var.f464900d = aVar2.k(intValue);
                return 0;
            case 2:
                ps0Var.f464901e = aVar2.i(intValue);
                return 0;
            case 3:
                ps0Var.f464902f = aVar2.g(intValue);
                return 0;
            case 4:
                ps0Var.f464903g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.js0 js0Var = new r45.js0();
                    if (bArr2 != null && bArr2.length > 0) {
                        js0Var.mo11468x92b714fd(bArr2);
                    }
                    ps0Var.f464904h.add(js0Var);
                }
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.p63 p63Var3 = new r45.p63();
                    if (bArr3 != null && bArr3.length > 0) {
                        p63Var3.mo11468x92b714fd(bArr3);
                    }
                    ps0Var.f464905i = p63Var3;
                }
                return 0;
            case 7:
                ps0Var.f464906m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

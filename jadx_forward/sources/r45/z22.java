package r45;

/* loaded from: classes10.dex */
public class z22 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473160d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f473161e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f473162f;

    /* renamed from: g, reason: collision with root package name */
    public int f473163g;

    /* renamed from: h, reason: collision with root package name */
    public r45.by1 f473164h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f473165i;

    /* renamed from: m, reason: collision with root package name */
    public long f473166m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z22)) {
            return false;
        }
        r45.z22 z22Var = (r45.z22) fVar;
        return n51.f.a(this.f473160d, z22Var.f473160d) && n51.f.a(java.lang.Boolean.valueOf(this.f473161e), java.lang.Boolean.valueOf(z22Var.f473161e)) && n51.f.a(this.f473162f, z22Var.f473162f) && n51.f.a(java.lang.Integer.valueOf(this.f473163g), java.lang.Integer.valueOf(z22Var.f473163g)) && n51.f.a(this.f473164h, z22Var.f473164h) && n51.f.a(this.f473165i, z22Var.f473165i) && n51.f.a(java.lang.Long.valueOf(this.f473166m), java.lang.Long.valueOf(z22Var.f473166m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f473160d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.a(2, this.f473161e);
            java.lang.String str2 = this.f473162f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f473163g);
            r45.by1 by1Var = this.f473164h;
            if (by1Var != null) {
                fVar.i(5, by1Var.mo75928xcd1e8d8());
                this.f473164h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f473165i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.h(7, this.f473166m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f473160d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.a(2, this.f473161e);
            java.lang.String str5 = this.f473162f;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            int e17 = j17 + b36.f.e(4, this.f473163g);
            r45.by1 by1Var2 = this.f473164h;
            if (by1Var2 != null) {
                e17 += b36.f.i(5, by1Var2.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f473165i;
            if (str6 != null) {
                e17 += b36.f.j(6, str6);
            }
            return e17 + b36.f.h(7, this.f473166m);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.z22 z22Var = (r45.z22) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                z22Var.f473160d = aVar2.k(intValue);
                return 0;
            case 2:
                z22Var.f473161e = aVar2.c(intValue);
                return 0;
            case 3:
                z22Var.f473162f = aVar2.k(intValue);
                return 0;
            case 4:
                z22Var.f473163g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.by1 by1Var3 = new r45.by1();
                    if (bArr != null && bArr.length > 0) {
                        by1Var3.mo11468x92b714fd(bArr);
                    }
                    z22Var.f473164h = by1Var3;
                }
                return 0;
            case 6:
                z22Var.f473165i = aVar2.k(intValue);
                return 0;
            case 7:
                z22Var.f473166m = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

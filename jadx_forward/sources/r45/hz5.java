package r45;

/* loaded from: classes4.dex */
public class hz5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f458105d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f458106e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f458107f;

    /* renamed from: g, reason: collision with root package name */
    public long f458108g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f458109h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f458110i = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hz5)) {
            return false;
        }
        r45.hz5 hz5Var = (r45.hz5) fVar;
        return n51.f.a(this.f458105d, hz5Var.f458105d) && n51.f.a(this.f458106e, hz5Var.f458106e) && n51.f.a(this.f458107f, hz5Var.f458107f) && n51.f.a(java.lang.Long.valueOf(this.f458108g), java.lang.Long.valueOf(hz5Var.f458108g)) && n51.f.a(this.f458109h, hz5Var.f458109h) && n51.f.a(this.f458110i, hz5Var.f458110i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f458105d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f458106e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f458107f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.h(4, this.f458108g);
            java.lang.String str4 = this.f458109h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.g(7, 8, this.f458110i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f458105d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f458106e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f458107f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int h17 = j17 + b36.f.h(4, this.f458108g);
            java.lang.String str8 = this.f458109h;
            if (str8 != null) {
                h17 += b36.f.j(6, str8);
            }
            return h17 + b36.f.g(7, 8, this.f458110i);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f458110i.clear();
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
        r45.hz5 hz5Var = (r45.hz5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hz5Var.f458105d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            hz5Var.f458106e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            hz5Var.f458107f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            hz5Var.f458108g = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 6) {
            hz5Var.f458109h = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 7) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            r45.k15 k15Var = new r45.k15();
            if (bArr2 != null && bArr2.length > 0) {
                k15Var.mo11468x92b714fd(bArr2);
            }
            hz5Var.f458110i.add(k15Var);
        }
        return 0;
    }
}

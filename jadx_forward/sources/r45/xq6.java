package r45;

/* loaded from: classes11.dex */
public class xq6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f471875d;

    /* renamed from: e, reason: collision with root package name */
    public int f471876e;

    /* renamed from: f, reason: collision with root package name */
    public int f471877f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f471878g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f471879h;

    /* renamed from: i, reason: collision with root package name */
    public r45.qk0 f471880i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xq6)) {
            return false;
        }
        r45.xq6 xq6Var = (r45.xq6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f471875d), java.lang.Integer.valueOf(xq6Var.f471875d)) && n51.f.a(java.lang.Integer.valueOf(this.f471876e), java.lang.Integer.valueOf(xq6Var.f471876e)) && n51.f.a(java.lang.Integer.valueOf(this.f471877f), java.lang.Integer.valueOf(xq6Var.f471877f)) && n51.f.a(this.f471878g, xq6Var.f471878g) && n51.f.a(this.f471879h, xq6Var.f471879h) && n51.f.a(this.f471880i, xq6Var.f471880i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f471875d);
            fVar.e(2, this.f471876e);
            fVar.e(3, this.f471877f);
            java.lang.String str = this.f471878g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f471879h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            r45.qk0 qk0Var = this.f471880i;
            if (qk0Var != null) {
                fVar.i(6, qk0Var.mo75928xcd1e8d8());
                this.f471880i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f471875d) + 0 + b36.f.e(2, this.f471876e) + b36.f.e(3, this.f471877f);
            java.lang.String str3 = this.f471878g;
            if (str3 != null) {
                e17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f471879h;
            if (str4 != null) {
                e17 += b36.f.j(5, str4);
            }
            r45.qk0 qk0Var2 = this.f471880i;
            return qk0Var2 != null ? e17 + b36.f.i(6, qk0Var2.mo75928xcd1e8d8()) : e17;
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
        r45.xq6 xq6Var = (r45.xq6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xq6Var.f471875d = aVar2.g(intValue);
                return 0;
            case 2:
                xq6Var.f471876e = aVar2.g(intValue);
                return 0;
            case 3:
                xq6Var.f471877f = aVar2.g(intValue);
                return 0;
            case 4:
                xq6Var.f471878g = aVar2.k(intValue);
                return 0;
            case 5:
                xq6Var.f471879h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.qk0 qk0Var3 = new r45.qk0();
                    if (bArr != null && bArr.length > 0) {
                        qk0Var3.mo11468x92b714fd(bArr);
                    }
                    xq6Var.f471880i = qk0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

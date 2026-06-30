package r45;

/* loaded from: classes9.dex */
public class vn extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f469916d;

    /* renamed from: e, reason: collision with root package name */
    public int f469917e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f469918f;

    /* renamed from: g, reason: collision with root package name */
    public int f469919g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f469920h;

    /* renamed from: i, reason: collision with root package name */
    public int f469921i;

    /* renamed from: m, reason: collision with root package name */
    public int f469922m;

    /* renamed from: n, reason: collision with root package name */
    public r45.qm5 f469923n;

    /* renamed from: o, reason: collision with root package name */
    public long f469924o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vn)) {
            return false;
        }
        r45.vn vnVar = (r45.vn) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f469916d), java.lang.Long.valueOf(vnVar.f469916d)) && n51.f.a(java.lang.Integer.valueOf(this.f469917e), java.lang.Integer.valueOf(vnVar.f469917e)) && n51.f.a(java.lang.Boolean.valueOf(this.f469918f), java.lang.Boolean.valueOf(vnVar.f469918f)) && n51.f.a(java.lang.Integer.valueOf(this.f469919g), java.lang.Integer.valueOf(vnVar.f469919g)) && n51.f.a(this.f469920h, vnVar.f469920h) && n51.f.a(java.lang.Integer.valueOf(this.f469921i), java.lang.Integer.valueOf(vnVar.f469921i)) && n51.f.a(java.lang.Integer.valueOf(this.f469922m), java.lang.Integer.valueOf(vnVar.f469922m)) && n51.f.a(this.f469923n, vnVar.f469923n) && n51.f.a(java.lang.Long.valueOf(this.f469924o), java.lang.Long.valueOf(vnVar.f469924o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f469916d);
            fVar.e(2, this.f469917e);
            fVar.a(3, this.f469918f);
            fVar.e(4, this.f469919g);
            java.lang.String str = this.f469920h;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f469921i);
            fVar.e(7, this.f469922m);
            r45.qm5 qm5Var = this.f469923n;
            if (qm5Var != null) {
                fVar.i(8, qm5Var.mo75928xcd1e8d8());
                this.f469923n.mo75956x3d5d1f78(fVar);
            }
            fVar.h(9, this.f469924o);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f469916d) + 0 + b36.f.e(2, this.f469917e) + b36.f.a(3, this.f469918f) + b36.f.e(4, this.f469919g);
            java.lang.String str2 = this.f469920h;
            if (str2 != null) {
                h17 += b36.f.j(5, str2);
            }
            int e17 = h17 + b36.f.e(6, this.f469921i) + b36.f.e(7, this.f469922m);
            r45.qm5 qm5Var2 = this.f469923n;
            if (qm5Var2 != null) {
                e17 += b36.f.i(8, qm5Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.h(9, this.f469924o);
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
        r45.vn vnVar = (r45.vn) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vnVar.f469916d = aVar2.i(intValue);
                return 0;
            case 2:
                vnVar.f469917e = aVar2.g(intValue);
                return 0;
            case 3:
                vnVar.f469918f = aVar2.c(intValue);
                return 0;
            case 4:
                vnVar.f469919g = aVar2.g(intValue);
                return 0;
            case 5:
                vnVar.f469920h = aVar2.k(intValue);
                return 0;
            case 6:
                vnVar.f469921i = aVar2.g(intValue);
                return 0;
            case 7:
                vnVar.f469922m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.qm5 qm5Var3 = new r45.qm5();
                    if (bArr != null && bArr.length > 0) {
                        qm5Var3.mo11468x92b714fd(bArr);
                    }
                    vnVar.f469923n = qm5Var3;
                }
                return 0;
            case 9:
                vnVar.f469924o = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

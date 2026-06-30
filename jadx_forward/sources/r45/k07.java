package r45;

/* loaded from: classes14.dex */
public class k07 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f459809d;

    /* renamed from: e, reason: collision with root package name */
    public long f459810e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f459811f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f459812g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public long f459813h;

    /* renamed from: i, reason: collision with root package name */
    public int f459814i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f459815m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k07)) {
            return false;
        }
        r45.k07 k07Var = (r45.k07) fVar;
        return n51.f.a(this.f459809d, k07Var.f459809d) && n51.f.a(java.lang.Long.valueOf(this.f459810e), java.lang.Long.valueOf(k07Var.f459810e)) && n51.f.a(this.f459811f, k07Var.f459811f) && n51.f.a(this.f459812g, k07Var.f459812g) && n51.f.a(java.lang.Long.valueOf(this.f459813h), java.lang.Long.valueOf(k07Var.f459813h)) && n51.f.a(java.lang.Integer.valueOf(this.f459814i), java.lang.Integer.valueOf(k07Var.f459814i)) && n51.f.a(this.f459815m, k07Var.f459815m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f459809d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f459810e);
            java.lang.String str2 = this.f459811f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.g(4, 8, this.f459812g);
            fVar.h(5, this.f459813h);
            fVar.e(6, this.f459814i);
            java.lang.String str3 = this.f459815m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f459809d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.h(2, this.f459810e);
            java.lang.String str5 = this.f459811f;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            int g17 = j17 + b36.f.g(4, 8, this.f459812g) + b36.f.h(5, this.f459813h) + b36.f.e(6, this.f459814i);
            java.lang.String str6 = this.f459815m;
            return str6 != null ? g17 + b36.f.j(7, str6) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f459812g.clear();
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
        r45.k07 k07Var = (r45.k07) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                k07Var.f459809d = aVar2.k(intValue);
                return 0;
            case 2:
                k07Var.f459810e = aVar2.i(intValue);
                return 0;
            case 3:
                k07Var.f459811f = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.z07 z07Var = new r45.z07();
                    if (bArr2 != null && bArr2.length > 0) {
                        z07Var.mo11468x92b714fd(bArr2);
                    }
                    k07Var.f459812g.add(z07Var);
                }
                return 0;
            case 5:
                k07Var.f459813h = aVar2.i(intValue);
                return 0;
            case 6:
                k07Var.f459814i = aVar2.g(intValue);
                return 0;
            case 7:
                k07Var.f459815m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

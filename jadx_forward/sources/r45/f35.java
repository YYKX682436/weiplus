package r45;

/* loaded from: classes11.dex */
public class f35 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f455520d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455521e;

    /* renamed from: g, reason: collision with root package name */
    public int f455523g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f455524h;

    /* renamed from: m, reason: collision with root package name */
    public int f455526m;

    /* renamed from: n, reason: collision with root package name */
    public int f455527n;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f455522f = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f455525i = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f35)) {
            return false;
        }
        r45.f35 f35Var = (r45.f35) fVar;
        return n51.f.a(this.f455520d, f35Var.f455520d) && n51.f.a(this.f455521e, f35Var.f455521e) && n51.f.a(this.f455522f, f35Var.f455522f) && n51.f.a(java.lang.Integer.valueOf(this.f455523g), java.lang.Integer.valueOf(f35Var.f455523g)) && n51.f.a(this.f455524h, f35Var.f455524h) && n51.f.a(this.f455525i, f35Var.f455525i) && n51.f.a(java.lang.Integer.valueOf(this.f455526m), java.lang.Integer.valueOf(f35Var.f455526m)) && n51.f.a(java.lang.Integer.valueOf(this.f455527n), java.lang.Integer.valueOf(f35Var.f455527n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f455520d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f455521e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, this.f455522f);
            fVar.e(4, this.f455523g);
            java.lang.String str3 = this.f455524h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.g(6, 8, this.f455525i);
            fVar.e(7, this.f455526m);
            fVar.e(8, this.f455527n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f455520d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f455521e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int g17 = j17 + b36.f.g(3, 8, this.f455522f) + b36.f.e(4, this.f455523g);
            java.lang.String str6 = this.f455524h;
            if (str6 != null) {
                g17 += b36.f.j(5, str6);
            }
            return g17 + b36.f.g(6, 8, this.f455525i) + b36.f.e(7, this.f455526m) + b36.f.e(8, this.f455527n);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f455522f.clear();
            this.f455525i.clear();
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
        r45.f35 f35Var = (r45.f35) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                f35Var.f455520d = aVar2.k(intValue);
                return 0;
            case 2:
                f35Var.f455521e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.e35 e35Var = new r45.e35();
                    if (bArr2 != null && bArr2.length > 0) {
                        e35Var.mo11468x92b714fd(bArr2);
                    }
                    f35Var.f455522f.add(e35Var);
                }
                return 0;
            case 4:
                f35Var.f455523g = aVar2.g(intValue);
                return 0;
            case 5:
                f35Var.f455524h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.f35 f35Var2 = new r45.f35();
                    if (bArr3 != null && bArr3.length > 0) {
                        f35Var2.mo11468x92b714fd(bArr3);
                    }
                    f35Var.f455525i.add(f35Var2);
                }
                return 0;
            case 7:
                f35Var.f455526m = aVar2.g(intValue);
                return 0;
            case 8:
                f35Var.f455527n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

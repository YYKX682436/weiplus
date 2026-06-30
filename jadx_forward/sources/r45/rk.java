package r45;

/* loaded from: classes4.dex */
public class rk extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f466487d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f466488e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f466489f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f466490g;

    /* renamed from: h, reason: collision with root package name */
    public double f466491h;

    /* renamed from: i, reason: collision with root package name */
    public double f466492i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rk)) {
            return false;
        }
        r45.rk rkVar = (r45.rk) fVar;
        return n51.f.a(this.f76494x2de60e5e, rkVar.f76494x2de60e5e) && n51.f.a(this.f466487d, rkVar.f466487d) && n51.f.a(this.f466488e, rkVar.f466488e) && n51.f.a(java.lang.Integer.valueOf(this.f466489f), java.lang.Integer.valueOf(rkVar.f466489f)) && n51.f.a(this.f466490g, rkVar.f466490g) && n51.f.a(java.lang.Double.valueOf(this.f466491h), java.lang.Double.valueOf(rkVar.f466491h)) && n51.f.a(java.lang.Double.valueOf(this.f466492i), java.lang.Double.valueOf(rkVar.f466492i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f466487d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, this.f466488e);
            fVar.e(4, this.f466489f);
            java.lang.String str2 = this.f466490g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.c(6, this.f466491h);
            fVar.c(7, this.f466492i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f466487d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int g17 = i18 + b36.f.g(3, 1, this.f466488e) + b36.f.e(4, this.f466489f);
            java.lang.String str4 = this.f466490g;
            if (str4 != null) {
                g17 += b36.f.j(5, str4);
            }
            return g17 + b36.f.c(6, this.f466491h) + b36.f.c(7, this.f466492i);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f466488e.clear();
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
        r45.rk rkVar = (r45.rk) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    rkVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                rkVar.f466487d = aVar2.k(intValue);
                return 0;
            case 3:
                rkVar.f466488e.add(aVar2.k(intValue));
                return 0;
            case 4:
                rkVar.f466489f = aVar2.g(intValue);
                return 0;
            case 5:
                rkVar.f466490g = aVar2.k(intValue);
                return 0;
            case 6:
                rkVar.f466491h = aVar2.e(intValue);
                return 0;
            case 7:
                rkVar.f466492i = aVar2.e(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

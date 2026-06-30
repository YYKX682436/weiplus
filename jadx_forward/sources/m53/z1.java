package m53;

/* loaded from: classes8.dex */
public class z1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f405752d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f405753e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f405754f;

    /* renamed from: g, reason: collision with root package name */
    public m53.h0 f405755g;

    /* renamed from: h, reason: collision with root package name */
    public int f405756h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f405757i;

    /* renamed from: m, reason: collision with root package name */
    public int f405758m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.z1)) {
            return false;
        }
        m53.z1 z1Var = (m53.z1) fVar;
        return n51.f.a(this.f76494x2de60e5e, z1Var.f76494x2de60e5e) && n51.f.a(this.f405752d, z1Var.f405752d) && n51.f.a(this.f405753e, z1Var.f405753e) && n51.f.a(this.f405754f, z1Var.f405754f) && n51.f.a(this.f405755g, z1Var.f405755g) && n51.f.a(java.lang.Integer.valueOf(this.f405756h), java.lang.Integer.valueOf(z1Var.f405756h)) && n51.f.a(java.lang.Boolean.valueOf(this.f405757i), java.lang.Boolean.valueOf(z1Var.f405757i)) && n51.f.a(java.lang.Integer.valueOf(this.f405758m), java.lang.Integer.valueOf(z1Var.f405758m));
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
            java.lang.String str = this.f405752d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, this.f405753e);
            java.lang.String str2 = this.f405754f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            m53.h0 h0Var = this.f405755g;
            if (h0Var != null) {
                fVar.i(5, h0Var.mo75928xcd1e8d8());
                this.f405755g.mo75956x3d5d1f78(fVar);
            }
            fVar.e(6, this.f405756h);
            fVar.a(7, this.f405757i);
            fVar.e(8, this.f405758m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f405752d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int g17 = i18 + b36.f.g(3, 1, this.f405753e);
            java.lang.String str4 = this.f405754f;
            if (str4 != null) {
                g17 += b36.f.j(4, str4);
            }
            m53.h0 h0Var2 = this.f405755g;
            if (h0Var2 != null) {
                g17 += b36.f.i(5, h0Var2.mo75928xcd1e8d8());
            }
            return g17 + b36.f.e(6, this.f405756h) + b36.f.a(7, this.f405757i) + b36.f.e(8, this.f405758m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f405753e.clear();
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
        m53.z1 z1Var = (m53.z1) objArr[1];
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
                    z1Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                z1Var.f405752d = aVar2.k(intValue);
                return 0;
            case 3:
                z1Var.f405753e.add(aVar2.k(intValue));
                return 0;
            case 4:
                z1Var.f405754f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    m53.h0 h0Var3 = new m53.h0();
                    if (bArr3 != null && bArr3.length > 0) {
                        h0Var3.mo11468x92b714fd(bArr3);
                    }
                    z1Var.f405755g = h0Var3;
                }
                return 0;
            case 6:
                z1Var.f405756h = aVar2.g(intValue);
                return 0;
            case 7:
                z1Var.f405757i = aVar2.c(intValue);
                return 0;
            case 8:
                z1Var.f405758m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

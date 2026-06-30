package m53;

/* loaded from: classes8.dex */
public class i2 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public m53.t3 f405314d;

    /* renamed from: e, reason: collision with root package name */
    public int f405315e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f405316f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f405317g;

    /* renamed from: h, reason: collision with root package name */
    public m53.l2 f405318h;

    /* renamed from: i, reason: collision with root package name */
    public m53.u2 f405319i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.i2)) {
            return false;
        }
        m53.i2 i2Var = (m53.i2) fVar;
        return n51.f.a(this.f76492x92037252, i2Var.f76492x92037252) && n51.f.a(this.f405314d, i2Var.f405314d) && n51.f.a(java.lang.Integer.valueOf(this.f405315e), java.lang.Integer.valueOf(i2Var.f405315e)) && n51.f.a(this.f405316f, i2Var.f405316f) && n51.f.a(this.f405317g, i2Var.f405317g) && n51.f.a(this.f405318h, i2Var.f405318h) && n51.f.a(this.f405319i, i2Var.f405319i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            m53.t3 t3Var = this.f405314d;
            if (t3Var != null) {
                fVar.i(2, t3Var.mo75928xcd1e8d8());
                this.f405314d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f405315e);
            java.lang.String str = this.f405316f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f405317g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            m53.l2 l2Var = this.f405318h;
            if (l2Var != null) {
                fVar.i(6, l2Var.mo75928xcd1e8d8());
                this.f405318h.mo75956x3d5d1f78(fVar);
            }
            m53.u2 u2Var = this.f405319i;
            if (u2Var != null) {
                fVar.i(7, u2Var.mo75928xcd1e8d8());
                this.f405319i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            m53.t3 t3Var2 = this.f405314d;
            if (t3Var2 != null) {
                i18 += b36.f.i(2, t3Var2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(3, this.f405315e);
            java.lang.String str3 = this.f405316f;
            if (str3 != null) {
                e17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f405317g;
            if (str4 != null) {
                e17 += b36.f.j(5, str4);
            }
            m53.l2 l2Var2 = this.f405318h;
            if (l2Var2 != null) {
                e17 += b36.f.i(6, l2Var2.mo75928xcd1e8d8());
            }
            m53.u2 u2Var2 = this.f405319i;
            return u2Var2 != null ? e17 + b36.f.i(7, u2Var2.mo75928xcd1e8d8()) : e17;
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
        m53.i2 i2Var = (m53.i2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    i2Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    m53.t3 t3Var3 = new m53.t3();
                    if (bArr2 != null && bArr2.length > 0) {
                        t3Var3.mo11468x92b714fd(bArr2);
                    }
                    i2Var.f405314d = t3Var3;
                }
                return 0;
            case 3:
                i2Var.f405315e = aVar2.g(intValue);
                return 0;
            case 4:
                i2Var.f405316f = aVar2.k(intValue);
                return 0;
            case 5:
                i2Var.f405317g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    m53.l2 l2Var3 = new m53.l2();
                    if (bArr3 != null && bArr3.length > 0) {
                        l2Var3.mo11468x92b714fd(bArr3);
                    }
                    i2Var.f405318h = l2Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    m53.u2 u2Var3 = new m53.u2();
                    if (bArr4 != null && bArr4.length > 0) {
                        u2Var3.mo11468x92b714fd(bArr4);
                    }
                    i2Var.f405319i = u2Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

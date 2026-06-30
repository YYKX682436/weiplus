package r45;

/* loaded from: classes4.dex */
public class me6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461959d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ke6 f461960e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ke6 f461961f;

    /* renamed from: g, reason: collision with root package name */
    public int f461962g;

    /* renamed from: h, reason: collision with root package name */
    public int f461963h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f461964i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.me6)) {
            return false;
        }
        r45.me6 me6Var = (r45.me6) fVar;
        return n51.f.a(this.f76494x2de60e5e, me6Var.f76494x2de60e5e) && n51.f.a(this.f461959d, me6Var.f461959d) && n51.f.a(this.f461960e, me6Var.f461960e) && n51.f.a(this.f461961f, me6Var.f461961f) && n51.f.a(java.lang.Integer.valueOf(this.f461962g), java.lang.Integer.valueOf(me6Var.f461962g)) && n51.f.a(java.lang.Integer.valueOf(this.f461963h), java.lang.Integer.valueOf(me6Var.f461963h)) && n51.f.a(this.f461964i, me6Var.f461964i);
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
            java.lang.String str = this.f461959d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.ke6 ke6Var = this.f461960e;
            if (ke6Var != null) {
                fVar.i(3, ke6Var.mo75928xcd1e8d8());
                this.f461960e.mo75956x3d5d1f78(fVar);
            }
            r45.ke6 ke6Var2 = this.f461961f;
            if (ke6Var2 != null) {
                fVar.i(6, ke6Var2.mo75928xcd1e8d8());
                this.f461961f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f461962g);
            fVar.e(5, this.f461963h);
            java.lang.String str2 = this.f461964i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f461959d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            r45.ke6 ke6Var3 = this.f461960e;
            if (ke6Var3 != null) {
                i18 += b36.f.i(3, ke6Var3.mo75928xcd1e8d8());
            }
            r45.ke6 ke6Var4 = this.f461961f;
            if (ke6Var4 != null) {
                i18 += b36.f.i(6, ke6Var4.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(4, this.f461962g) + b36.f.e(5, this.f461963h);
            java.lang.String str4 = this.f461964i;
            return str4 != null ? e17 + b36.f.j(7, str4) : e17;
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
        r45.me6 me6Var = (r45.me6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    me6Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                me6Var.f461959d = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ke6 ke6Var5 = new r45.ke6();
                    if (bArr2 != null && bArr2.length > 0) {
                        ke6Var5.mo11468x92b714fd(bArr2);
                    }
                    me6Var.f461960e = ke6Var5;
                }
                return 0;
            case 4:
                me6Var.f461962g = aVar2.g(intValue);
                return 0;
            case 5:
                me6Var.f461963h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.ke6 ke6Var6 = new r45.ke6();
                    if (bArr3 != null && bArr3.length > 0) {
                        ke6Var6.mo11468x92b714fd(bArr3);
                    }
                    me6Var.f461961f = ke6Var6;
                }
                return 0;
            case 7:
                me6Var.f461964i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

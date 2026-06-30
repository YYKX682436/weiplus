package r45;

/* loaded from: classes9.dex */
public class rl5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.ae f466513d;

    /* renamed from: e, reason: collision with root package name */
    public int f466514e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f466515f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f466516g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f466517h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f466518i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f466519m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rl5)) {
            return false;
        }
        r45.rl5 rl5Var = (r45.rl5) fVar;
        return n51.f.a(this.f76494x2de60e5e, rl5Var.f76494x2de60e5e) && n51.f.a(this.f466513d, rl5Var.f466513d) && n51.f.a(java.lang.Integer.valueOf(this.f466514e), java.lang.Integer.valueOf(rl5Var.f466514e)) && n51.f.a(this.f466515f, rl5Var.f466515f) && n51.f.a(this.f466516g, rl5Var.f466516g) && n51.f.a(this.f466517h, rl5Var.f466517h) && n51.f.a(this.f466518i, rl5Var.f466518i) && n51.f.a(this.f466519m, rl5Var.f466519m);
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
            r45.ae aeVar = this.f466513d;
            if (aeVar != null) {
                fVar.i(2, aeVar.mo75928xcd1e8d8());
                this.f466513d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f466514e);
            java.lang.String str = this.f466515f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f466516g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f466517h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f466518i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f466519m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.ae aeVar2 = this.f466513d;
            if (aeVar2 != null) {
                i18 += b36.f.i(2, aeVar2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(3, this.f466514e);
            java.lang.String str6 = this.f466515f;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f466516g;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f466517h;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            java.lang.String str9 = this.f466518i;
            if (str9 != null) {
                e17 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f466519m;
            return str10 != null ? e17 + b36.f.j(8, str10) : e17;
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
        r45.rl5 rl5Var = (r45.rl5) objArr[1];
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
                    rl5Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ae aeVar3 = new r45.ae();
                    if (bArr2 != null && bArr2.length > 0) {
                        aeVar3.mo11468x92b714fd(bArr2);
                    }
                    rl5Var.f466513d = aeVar3;
                }
                return 0;
            case 3:
                rl5Var.f466514e = aVar2.g(intValue);
                return 0;
            case 4:
                rl5Var.f466515f = aVar2.k(intValue);
                return 0;
            case 5:
                rl5Var.f466516g = aVar2.k(intValue);
                return 0;
            case 6:
                rl5Var.f466517h = aVar2.k(intValue);
                return 0;
            case 7:
                rl5Var.f466518i = aVar2.k(intValue);
                return 0;
            case 8:
                rl5Var.f466519m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

package r45;

/* loaded from: classes8.dex */
public class jx6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f459733d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f459734e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f459735f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f459736g;

    /* renamed from: h, reason: collision with root package name */
    public int f459737h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jx6)) {
            return false;
        }
        r45.jx6 jx6Var = (r45.jx6) fVar;
        return n51.f.a(this.f76494x2de60e5e, jx6Var.f76494x2de60e5e) && n51.f.a(this.f459733d, jx6Var.f459733d) && n51.f.a(this.f459734e, jx6Var.f459734e) && n51.f.a(this.f459735f, jx6Var.f459735f) && n51.f.a(this.f459736g, jx6Var.f459736g) && n51.f.a(java.lang.Integer.valueOf(this.f459737h), java.lang.Integer.valueOf(jx6Var.f459737h));
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
            java.lang.String str = this.f459733d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f459734e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f459735f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f459736g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f459737h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str5 = this.f459733d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f459734e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f459735f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f459736g;
            if (str8 != null) {
                i18 += b36.f.j(5, str8);
            }
            return i18 + b36.f.e(6, this.f459737h);
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
        r45.jx6 jx6Var = (r45.jx6) objArr[1];
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
                    jx6Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                jx6Var.f459733d = aVar2.k(intValue);
                return 0;
            case 3:
                jx6Var.f459734e = aVar2.k(intValue);
                return 0;
            case 4:
                jx6Var.f459735f = aVar2.k(intValue);
                return 0;
            case 5:
                jx6Var.f459736g = aVar2.k(intValue);
                return 0;
            case 6:
                jx6Var.f459737h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

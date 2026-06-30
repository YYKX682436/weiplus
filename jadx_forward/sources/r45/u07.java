package r45;

/* loaded from: classes8.dex */
public class u07 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f468449d;

    /* renamed from: e, reason: collision with root package name */
    public r45.y07 f468450e;

    /* renamed from: f, reason: collision with root package name */
    public long f468451f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f468452g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f468453h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u07)) {
            return false;
        }
        r45.u07 u07Var = (r45.u07) fVar;
        return n51.f.a(this.f76494x2de60e5e, u07Var.f76494x2de60e5e) && n51.f.a(this.f468449d, u07Var.f468449d) && n51.f.a(this.f468450e, u07Var.f468450e) && n51.f.a(java.lang.Long.valueOf(this.f468451f), java.lang.Long.valueOf(u07Var.f468451f)) && n51.f.a(this.f468452g, u07Var.f468452g) && n51.f.a(this.f468453h, u07Var.f468453h);
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
            java.lang.String str = this.f468449d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.y07 y07Var = this.f468450e;
            if (y07Var != null) {
                fVar.i(3, y07Var.mo75928xcd1e8d8());
                this.f468450e.mo75956x3d5d1f78(fVar);
            }
            fVar.h(4, this.f468451f);
            java.lang.String str2 = this.f468452g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f468453h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f468449d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            r45.y07 y07Var2 = this.f468450e;
            if (y07Var2 != null) {
                i18 += b36.f.i(3, y07Var2.mo75928xcd1e8d8());
            }
            int h17 = i18 + b36.f.h(4, this.f468451f);
            java.lang.String str5 = this.f468452g;
            if (str5 != null) {
                h17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f468453h;
            return str6 != null ? h17 + b36.f.j(6, str6) : h17;
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
        r45.u07 u07Var = (r45.u07) objArr[1];
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
                    u07Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                u07Var.f468449d = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.y07 y07Var3 = new r45.y07();
                    if (bArr2 != null && bArr2.length > 0) {
                        y07Var3.mo11468x92b714fd(bArr2);
                    }
                    u07Var.f468450e = y07Var3;
                }
                return 0;
            case 4:
                u07Var.f468451f = aVar2.i(intValue);
                return 0;
            case 5:
                u07Var.f468452g = aVar2.k(intValue);
                return 0;
            case 6:
                u07Var.f468453h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

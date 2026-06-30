package r45;

/* loaded from: classes2.dex */
public class uk3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f468960d;

    /* renamed from: e, reason: collision with root package name */
    public int f468961e;

    /* renamed from: f, reason: collision with root package name */
    public int f468962f;

    /* renamed from: g, reason: collision with root package name */
    public int f468963g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uk3)) {
            return false;
        }
        r45.uk3 uk3Var = (r45.uk3) fVar;
        return n51.f.a(this.f76492x92037252, uk3Var.f76492x92037252) && n51.f.a(this.f468960d, uk3Var.f468960d) && n51.f.a(java.lang.Integer.valueOf(this.f468961e), java.lang.Integer.valueOf(uk3Var.f468961e)) && n51.f.a(java.lang.Integer.valueOf(this.f468962f), java.lang.Integer.valueOf(uk3Var.f468962f)) && n51.f.a(java.lang.Integer.valueOf(this.f468963g), java.lang.Integer.valueOf(uk3Var.f468963g));
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
            java.lang.String str = this.f468960d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f468961e);
            fVar.e(4, this.f468962f);
            fVar.e(5, this.f468963g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f468960d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.e(3, this.f468961e) + b36.f.e(4, this.f468962f) + b36.f.e(5, this.f468963g);
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
        r45.uk3 uk3Var = (r45.uk3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr);
                }
                uk3Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            uk3Var.f468960d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            uk3Var.f468961e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            uk3Var.f468962f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        uk3Var.f468963g = aVar2.g(intValue);
        return 0;
    }
}

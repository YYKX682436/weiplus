package r45;

/* loaded from: classes7.dex */
public class fc7 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f455743d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455744e;

    /* renamed from: f, reason: collision with root package name */
    public int f455745f;

    /* renamed from: g, reason: collision with root package name */
    public int f455746g;

    /* renamed from: h, reason: collision with root package name */
    public int f455747h;

    /* renamed from: i, reason: collision with root package name */
    public int f455748i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f455749m;

    /* renamed from: n, reason: collision with root package name */
    public r45.tt3 f455750n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fc7)) {
            return false;
        }
        r45.fc7 fc7Var = (r45.fc7) fVar;
        return n51.f.a(this.f76492x92037252, fc7Var.f76492x92037252) && n51.f.a(this.f455743d, fc7Var.f455743d) && n51.f.a(this.f455744e, fc7Var.f455744e) && n51.f.a(java.lang.Integer.valueOf(this.f455745f), java.lang.Integer.valueOf(fc7Var.f455745f)) && n51.f.a(java.lang.Integer.valueOf(this.f455746g), java.lang.Integer.valueOf(fc7Var.f455746g)) && n51.f.a(java.lang.Integer.valueOf(this.f455747h), java.lang.Integer.valueOf(fc7Var.f455747h)) && n51.f.a(java.lang.Integer.valueOf(this.f455748i), java.lang.Integer.valueOf(fc7Var.f455748i)) && n51.f.a(this.f455749m, fc7Var.f455749m) && n51.f.a(this.f455750n, fc7Var.f455750n);
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
            java.lang.String str = this.f455743d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f455744e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f455745f);
            fVar.e(5, this.f455746g);
            fVar.e(6, this.f455747h);
            fVar.e(7, this.f455748i);
            java.lang.String str3 = this.f455749m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            r45.tt3 tt3Var = this.f455750n;
            if (tt3Var != null) {
                fVar.i(9, tt3Var.mo75928xcd1e8d8());
                this.f455750n.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f455743d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f455744e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int e17 = i18 + b36.f.e(4, this.f455745f) + b36.f.e(5, this.f455746g) + b36.f.e(6, this.f455747h) + b36.f.e(7, this.f455748i);
            java.lang.String str6 = this.f455749m;
            if (str6 != null) {
                e17 += b36.f.j(8, str6);
            }
            r45.tt3 tt3Var2 = this.f455750n;
            return tt3Var2 != null ? e17 + b36.f.i(9, tt3Var2.mo75928xcd1e8d8()) : e17;
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
        r45.fc7 fc7Var = (r45.fc7) objArr[1];
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
                    fc7Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                fc7Var.f455743d = aVar2.k(intValue);
                return 0;
            case 3:
                fc7Var.f455744e = aVar2.k(intValue);
                return 0;
            case 4:
                fc7Var.f455745f = aVar2.g(intValue);
                return 0;
            case 5:
                fc7Var.f455746g = aVar2.g(intValue);
                return 0;
            case 6:
                fc7Var.f455747h = aVar2.g(intValue);
                return 0;
            case 7:
                fc7Var.f455748i = aVar2.g(intValue);
                return 0;
            case 8:
                fc7Var.f455749m = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.tt3 tt3Var3 = new r45.tt3();
                    if (bArr2 != null && bArr2.length > 0) {
                        tt3Var3.mo11468x92b714fd(bArr2);
                    }
                    fc7Var.f455750n = tt3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

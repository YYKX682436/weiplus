package r45;

/* loaded from: classes4.dex */
public class r66 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f466109d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466110e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f466111f;

    /* renamed from: g, reason: collision with root package name */
    public int f466112g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ap0 f466113h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r66)) {
            return false;
        }
        r45.r66 r66Var = (r45.r66) fVar;
        return n51.f.a(this.f466109d, r66Var.f466109d) && n51.f.a(this.f466110e, r66Var.f466110e) && n51.f.a(this.f466111f, r66Var.f466111f) && n51.f.a(java.lang.Integer.valueOf(this.f466112g), java.lang.Integer.valueOf(r66Var.f466112g)) && n51.f.a(this.f466113h, r66Var.f466113h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f466109d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f466110e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f466111f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f466112g);
            r45.ap0 ap0Var = this.f466113h;
            if (ap0Var != null) {
                fVar.i(5, ap0Var.mo75928xcd1e8d8());
                this.f466113h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f466109d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f466110e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f466111f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            int e17 = j17 + b36.f.e(4, this.f466112g);
            r45.ap0 ap0Var2 = this.f466113h;
            return ap0Var2 != null ? e17 + b36.f.i(5, ap0Var2.mo75928xcd1e8d8()) : e17;
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
        r45.r66 r66Var = (r45.r66) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            r66Var.f466109d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            r66Var.f466110e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            r66Var.f466111f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            r66Var.f466112g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.ap0 ap0Var3 = new r45.ap0();
            if (bArr != null && bArr.length > 0) {
                ap0Var3.mo11468x92b714fd(bArr);
            }
            r66Var.f466113h = ap0Var3;
        }
        return 0;
    }
}

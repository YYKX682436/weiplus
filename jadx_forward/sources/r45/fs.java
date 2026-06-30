package r45;

/* loaded from: classes9.dex */
public class fs extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f456110d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456111e;

    /* renamed from: f, reason: collision with root package name */
    public r45.q34 f456112f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f456113g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f456114h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f456115i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f456116m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f456117n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fs)) {
            return false;
        }
        r45.fs fsVar = (r45.fs) fVar;
        return n51.f.a(this.f76492x92037252, fsVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f456110d), java.lang.Integer.valueOf(fsVar.f456110d)) && n51.f.a(this.f456111e, fsVar.f456111e) && n51.f.a(this.f456112f, fsVar.f456112f) && n51.f.a(this.f456113g, fsVar.f456113g) && n51.f.a(this.f456114h, fsVar.f456114h) && n51.f.a(this.f456115i, fsVar.f456115i) && n51.f.a(this.f456116m, fsVar.f456116m) && n51.f.a(this.f456117n, fsVar.f456117n);
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
            fVar.e(2, this.f456110d);
            java.lang.String str = this.f456111e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.q34 q34Var = this.f456112f;
            if (q34Var != null) {
                fVar.i(4, q34Var.mo75928xcd1e8d8());
                this.f456112f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f456113g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f456114h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f456115i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f456116m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f456117n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f456110d);
            java.lang.String str7 = this.f456111e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            r45.q34 q34Var2 = this.f456112f;
            if (q34Var2 != null) {
                i18 += b36.f.i(4, q34Var2.mo75928xcd1e8d8());
            }
            java.lang.String str8 = this.f456113g;
            if (str8 != null) {
                i18 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f456114h;
            if (str9 != null) {
                i18 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f456115i;
            if (str10 != null) {
                i18 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f456116m;
            if (str11 != null) {
                i18 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f456117n;
            return str12 != null ? i18 + b36.f.j(9, str12) : i18;
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
        r45.fs fsVar = (r45.fs) objArr[1];
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
                    fsVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                fsVar.f456110d = aVar2.g(intValue);
                return 0;
            case 3:
                fsVar.f456111e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.q34 q34Var3 = new r45.q34();
                    if (bArr2 != null && bArr2.length > 0) {
                        q34Var3.mo11468x92b714fd(bArr2);
                    }
                    fsVar.f456112f = q34Var3;
                }
                return 0;
            case 5:
                fsVar.f456113g = aVar2.k(intValue);
                return 0;
            case 6:
                fsVar.f456114h = aVar2.k(intValue);
                return 0;
            case 7:
                fsVar.f456115i = aVar2.k(intValue);
                return 0;
            case 8:
                fsVar.f456116m = aVar2.k(intValue);
                return 0;
            case 9:
                fsVar.f456117n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

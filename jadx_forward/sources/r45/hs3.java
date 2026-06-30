package r45;

/* loaded from: classes8.dex */
public class hs3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public long f457949d;

    /* renamed from: e, reason: collision with root package name */
    public long f457950e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f457951f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f457952g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f457954i;

    /* renamed from: m, reason: collision with root package name */
    public r45.i50 f457955m;

    /* renamed from: n, reason: collision with root package name */
    public r45.ia7 f457956n;

    /* renamed from: p, reason: collision with root package name */
    public r45.la7 f457958p;

    /* renamed from: h, reason: collision with root package name */
    public boolean f457953h = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f457957o = false;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hs3)) {
            return false;
        }
        r45.hs3 hs3Var = (r45.hs3) fVar;
        return n51.f.a(this.f76492x92037252, hs3Var.f76492x92037252) && n51.f.a(java.lang.Long.valueOf(this.f457949d), java.lang.Long.valueOf(hs3Var.f457949d)) && n51.f.a(java.lang.Long.valueOf(this.f457950e), java.lang.Long.valueOf(hs3Var.f457950e)) && n51.f.a(this.f457951f, hs3Var.f457951f) && n51.f.a(this.f457952g, hs3Var.f457952g) && n51.f.a(java.lang.Boolean.valueOf(this.f457953h), java.lang.Boolean.valueOf(hs3Var.f457953h)) && n51.f.a(this.f457954i, hs3Var.f457954i) && n51.f.a(this.f457955m, hs3Var.f457955m) && n51.f.a(this.f457956n, hs3Var.f457956n) && n51.f.a(java.lang.Boolean.valueOf(this.f457957o), java.lang.Boolean.valueOf(hs3Var.f457957o)) && n51.f.a(this.f457958p, hs3Var.f457958p);
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
            fVar.h(2, this.f457949d);
            fVar.h(3, this.f457950e);
            java.lang.String str = this.f457951f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f457952g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.a(6, this.f457953h);
            java.lang.String str3 = this.f457954i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            r45.i50 i50Var = this.f457955m;
            if (i50Var != null) {
                fVar.i(8, i50Var.mo75928xcd1e8d8());
                this.f457955m.mo75956x3d5d1f78(fVar);
            }
            r45.ia7 ia7Var = this.f457956n;
            if (ia7Var != null) {
                fVar.i(9, ia7Var.mo75928xcd1e8d8());
                this.f457956n.mo75956x3d5d1f78(fVar);
            }
            fVar.a(10, this.f457957o);
            r45.la7 la7Var = this.f457958p;
            if (la7Var != null) {
                fVar.i(11, la7Var.mo75928xcd1e8d8());
                this.f457958p.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.h(2, this.f457949d) + b36.f.h(3, this.f457950e);
            java.lang.String str4 = this.f457951f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f457952g;
            if (str5 != null) {
                i18 += b36.f.j(5, str5);
            }
            int a17 = i18 + b36.f.a(6, this.f457953h);
            java.lang.String str6 = this.f457954i;
            if (str6 != null) {
                a17 += b36.f.j(7, str6);
            }
            r45.i50 i50Var2 = this.f457955m;
            if (i50Var2 != null) {
                a17 += b36.f.i(8, i50Var2.mo75928xcd1e8d8());
            }
            r45.ia7 ia7Var2 = this.f457956n;
            if (ia7Var2 != null) {
                a17 += b36.f.i(9, ia7Var2.mo75928xcd1e8d8());
            }
            int a18 = a17 + b36.f.a(10, this.f457957o);
            r45.la7 la7Var2 = this.f457958p;
            return la7Var2 != null ? a18 + b36.f.i(11, la7Var2.mo75928xcd1e8d8()) : a18;
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
        r45.hs3 hs3Var = (r45.hs3) objArr[1];
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
                    hs3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                hs3Var.f457949d = aVar2.i(intValue);
                return 0;
            case 3:
                hs3Var.f457950e = aVar2.i(intValue);
                return 0;
            case 4:
                hs3Var.f457951f = aVar2.k(intValue);
                return 0;
            case 5:
                hs3Var.f457952g = aVar2.k(intValue);
                return 0;
            case 6:
                hs3Var.f457953h = aVar2.c(intValue);
                return 0;
            case 7:
                hs3Var.f457954i = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.i50 i50Var3 = new r45.i50();
                    if (bArr2 != null && bArr2.length > 0) {
                        i50Var3.mo11468x92b714fd(bArr2);
                    }
                    hs3Var.f457955m = i50Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.ia7 ia7Var3 = new r45.ia7();
                    if (bArr3 != null && bArr3.length > 0) {
                        ia7Var3.mo11468x92b714fd(bArr3);
                    }
                    hs3Var.f457956n = ia7Var3;
                }
                return 0;
            case 10:
                hs3Var.f457957o = aVar2.c(intValue);
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.la7 la7Var3 = new r45.la7();
                    if (bArr4 != null && bArr4.length > 0) {
                        la7Var3.mo11468x92b714fd(bArr4);
                    }
                    hs3Var.f457958p = la7Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

package r45;

/* loaded from: classes9.dex */
public class sp6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467432d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467433e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f467434f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f467435g;

    /* renamed from: h, reason: collision with root package name */
    public int f467436h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f467437i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f467438m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sp6)) {
            return false;
        }
        r45.sp6 sp6Var = (r45.sp6) fVar;
        return n51.f.a(this.f76494x2de60e5e, sp6Var.f76494x2de60e5e) && n51.f.a(this.f467432d, sp6Var.f467432d) && n51.f.a(this.f467433e, sp6Var.f467433e) && n51.f.a(this.f467434f, sp6Var.f467434f) && n51.f.a(this.f467435g, sp6Var.f467435g) && n51.f.a(java.lang.Integer.valueOf(this.f467436h), java.lang.Integer.valueOf(sp6Var.f467436h)) && n51.f.a(this.f467437i, sp6Var.f467437i) && n51.f.a(this.f467438m, sp6Var.f467438m);
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
            java.lang.String str = this.f467432d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f467433e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f467434f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f467435g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f467436h);
            java.lang.String str5 = this.f467437i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f467438m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str7 = this.f467432d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f467433e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f467434f;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f467435g;
            if (str10 != null) {
                i18 += b36.f.j(5, str10);
            }
            int e17 = i18 + b36.f.e(6, this.f467436h);
            java.lang.String str11 = this.f467437i;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f467438m;
            return str12 != null ? e17 + b36.f.j(8, str12) : e17;
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
        r45.sp6 sp6Var = (r45.sp6) objArr[1];
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
                    sp6Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                sp6Var.f467432d = aVar2.k(intValue);
                return 0;
            case 3:
                sp6Var.f467433e = aVar2.k(intValue);
                return 0;
            case 4:
                sp6Var.f467434f = aVar2.k(intValue);
                return 0;
            case 5:
                sp6Var.f467435g = aVar2.k(intValue);
                return 0;
            case 6:
                sp6Var.f467436h = aVar2.g(intValue);
                return 0;
            case 7:
                sp6Var.f467437i = aVar2.k(intValue);
                return 0;
            case 8:
                sp6Var.f467438m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

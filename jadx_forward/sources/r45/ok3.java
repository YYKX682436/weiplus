package r45;

/* loaded from: classes9.dex */
public class ok3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f463852d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f463853e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f463854f;

    /* renamed from: g, reason: collision with root package name */
    public int f463855g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f463856h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f463857i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f463858m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f463859n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f463860o;

    /* renamed from: p, reason: collision with root package name */
    public int f463861p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f463862q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ok3)) {
            return false;
        }
        r45.ok3 ok3Var = (r45.ok3) fVar;
        return n51.f.a(this.f76492x92037252, ok3Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f463852d), java.lang.Integer.valueOf(ok3Var.f463852d)) && n51.f.a(this.f463853e, ok3Var.f463853e) && n51.f.a(java.lang.Integer.valueOf(this.f463854f), java.lang.Integer.valueOf(ok3Var.f463854f)) && n51.f.a(java.lang.Integer.valueOf(this.f463855g), java.lang.Integer.valueOf(ok3Var.f463855g)) && n51.f.a(this.f463856h, ok3Var.f463856h) && n51.f.a(this.f463857i, ok3Var.f463857i) && n51.f.a(this.f463858m, ok3Var.f463858m) && n51.f.a(this.f463859n, ok3Var.f463859n) && n51.f.a(this.f463860o, ok3Var.f463860o) && n51.f.a(java.lang.Integer.valueOf(this.f463861p), java.lang.Integer.valueOf(ok3Var.f463861p)) && n51.f.a(this.f463862q, ok3Var.f463862q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f463853e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f463852d);
            fVar.g(3, 8, linkedList);
            fVar.e(4, this.f463854f);
            fVar.e(5, this.f463855g);
            r45.cu5 cu5Var = this.f463856h;
            if (cu5Var != null) {
                fVar.i(6, cu5Var.mo75928xcd1e8d8());
                this.f463856h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f463857i;
            if (str != null) {
                fVar.j(7, str);
            }
            java.lang.String str2 = this.f463858m;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            java.lang.String str3 = this.f463859n;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            java.lang.String str4 = this.f463860o;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            fVar.e(11, this.f463861p);
            java.lang.String str5 = this.f463862q;
            if (str5 == null) {
                return 0;
            }
            fVar.j(12, str5);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f463852d) + b36.f.g(3, 8, linkedList) + b36.f.e(4, this.f463854f) + b36.f.e(5, this.f463855g);
            r45.cu5 cu5Var2 = this.f463856h;
            if (cu5Var2 != null) {
                i18 += b36.f.i(6, cu5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f463857i;
            if (str6 != null) {
                i18 += b36.f.j(7, str6);
            }
            java.lang.String str7 = this.f463858m;
            if (str7 != null) {
                i18 += b36.f.j(8, str7);
            }
            java.lang.String str8 = this.f463859n;
            if (str8 != null) {
                i18 += b36.f.j(9, str8);
            }
            java.lang.String str9 = this.f463860o;
            if (str9 != null) {
                i18 += b36.f.j(10, str9);
            }
            int e17 = i18 + b36.f.e(11, this.f463861p);
            java.lang.String str10 = this.f463862q;
            return str10 != null ? e17 + b36.f.j(12, str10) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.ok3 ok3Var = (r45.ok3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    ok3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                ok3Var.f463852d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.d35 d35Var = new r45.d35();
                    if (bArr3 != null && bArr3.length > 0) {
                        d35Var.mo11468x92b714fd(bArr3);
                    }
                    ok3Var.f463853e.add(d35Var);
                }
                return 0;
            case 4:
                ok3Var.f463854f = aVar2.g(intValue);
                return 0;
            case 5:
                ok3Var.f463855g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var3.b(bArr4);
                    }
                    ok3Var.f463856h = cu5Var3;
                }
                return 0;
            case 7:
                ok3Var.f463857i = aVar2.k(intValue);
                return 0;
            case 8:
                ok3Var.f463858m = aVar2.k(intValue);
                return 0;
            case 9:
                ok3Var.f463859n = aVar2.k(intValue);
                return 0;
            case 10:
                ok3Var.f463860o = aVar2.k(intValue);
                return 0;
            case 11:
                ok3Var.f463861p = aVar2.g(intValue);
                return 0;
            case 12:
                ok3Var.f463862q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

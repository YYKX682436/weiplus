package r45;

/* loaded from: classes9.dex */
public class f0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f455394d = 268513600;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455395e = "请求不成功，请稍候再试";

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f455396f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f455397g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f455398h;

    /* renamed from: i, reason: collision with root package name */
    public int f455399i;

    /* renamed from: m, reason: collision with root package name */
    public int f455400m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f455401n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f0)) {
            return false;
        }
        r45.f0 f0Var = (r45.f0) fVar;
        return n51.f.a(this.f76492x92037252, f0Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f455394d), java.lang.Integer.valueOf(f0Var.f455394d)) && n51.f.a(this.f455395e, f0Var.f455395e) && n51.f.a(this.f455396f, f0Var.f455396f) && n51.f.a(this.f455397g, f0Var.f455397g) && n51.f.a(this.f455398h, f0Var.f455398h) && n51.f.a(java.lang.Integer.valueOf(this.f455399i), java.lang.Integer.valueOf(f0Var.f455399i)) && n51.f.a(java.lang.Integer.valueOf(this.f455400m), java.lang.Integer.valueOf(f0Var.f455400m)) && n51.f.a(this.f455401n, f0Var.f455401n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f455396f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f455394d);
            java.lang.String str = this.f455395e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, linkedList);
            java.lang.String str2 = this.f455397g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f455398h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.e(7, this.f455399i);
            fVar.e(8, this.f455400m);
            java.lang.String str4 = this.f455401n;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f455394d);
            java.lang.String str5 = this.f455395e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int g17 = i18 + b36.f.g(4, 8, linkedList);
            java.lang.String str6 = this.f455397g;
            if (str6 != null) {
                g17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f455398h;
            if (str7 != null) {
                g17 += b36.f.j(6, str7);
            }
            int e17 = g17 + b36.f.e(7, this.f455399i) + b36.f.e(8, this.f455400m);
            java.lang.String str8 = this.f455401n;
            return str8 != null ? e17 + b36.f.j(9, str8) : e17;
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
        r45.f0 f0Var = (r45.f0) objArr[1];
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
                    f0Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                f0Var.f455394d = aVar2.g(intValue);
                return 0;
            case 3:
                f0Var.f455395e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.p pVar = new r45.p();
                    if (bArr3 != null && bArr3.length > 0) {
                        pVar.mo11468x92b714fd(bArr3);
                    }
                    f0Var.f455396f.add(pVar);
                }
                return 0;
            case 5:
                f0Var.f455397g = aVar2.k(intValue);
                return 0;
            case 6:
                f0Var.f455398h = aVar2.k(intValue);
                return 0;
            case 7:
                f0Var.f455399i = aVar2.g(intValue);
                return 0;
            case 8:
                f0Var.f455400m = aVar2.g(intValue);
                return 0;
            case 9:
                f0Var.f455401n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

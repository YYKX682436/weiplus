package r45;

/* loaded from: classes2.dex */
public class rr3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f466667d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f466668e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f466669f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f466670g;

    /* renamed from: h, reason: collision with root package name */
    public int f466671h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f466672i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f466673m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f466674n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rr3)) {
            return false;
        }
        r45.rr3 rr3Var = (r45.rr3) fVar;
        return n51.f.a(this.f76492x92037252, rr3Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f466667d), java.lang.Integer.valueOf(rr3Var.f466667d)) && n51.f.a(this.f466668e, rr3Var.f466668e) && n51.f.a(this.f466669f, rr3Var.f466669f) && n51.f.a(this.f466670g, rr3Var.f466670g) && n51.f.a(java.lang.Integer.valueOf(this.f466671h), java.lang.Integer.valueOf(rr3Var.f466671h)) && n51.f.a(this.f466672i, rr3Var.f466672i) && n51.f.a(this.f466673m, rr3Var.f466673m) && n51.f.a(this.f466674n, rr3Var.f466674n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f466668e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f466667d);
            fVar.g(3, 8, linkedList);
            java.lang.String str = this.f466669f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f466670g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f466671h);
            java.lang.String str3 = this.f466672i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f466673m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f466674n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f466667d) + b36.f.g(3, 8, linkedList);
            java.lang.String str6 = this.f466669f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f466670g;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            int e17 = i18 + b36.f.e(6, this.f466671h);
            java.lang.String str8 = this.f466672i;
            if (str8 != null) {
                e17 += b36.f.j(7, str8);
            }
            java.lang.String str9 = this.f466673m;
            if (str9 != null) {
                e17 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f466674n;
            return str10 != null ? e17 + b36.f.j(9, str10) : e17;
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
        r45.rr3 rr3Var = (r45.rr3) objArr[1];
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
                    rr3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                rr3Var.f466667d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.l57 l57Var = new r45.l57();
                    if (bArr3 != null && bArr3.length > 0) {
                        l57Var.mo11468x92b714fd(bArr3);
                    }
                    rr3Var.f466668e.add(l57Var);
                }
                return 0;
            case 4:
                rr3Var.f466669f = aVar2.k(intValue);
                return 0;
            case 5:
                rr3Var.f466670g = aVar2.k(intValue);
                return 0;
            case 6:
                rr3Var.f466671h = aVar2.g(intValue);
                return 0;
            case 7:
                rr3Var.f466672i = aVar2.k(intValue);
                return 0;
            case 8:
                rr3Var.f466673m = aVar2.k(intValue);
                return 0;
            case 9:
                rr3Var.f466674n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

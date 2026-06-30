package r45;

/* loaded from: classes2.dex */
public class sb5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f467143d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f467145f;

    /* renamed from: g, reason: collision with root package name */
    public int f467146g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f467147h;

    /* renamed from: m, reason: collision with root package name */
    public int f467149m;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f467144e = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f467148i = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sb5)) {
            return false;
        }
        r45.sb5 sb5Var = (r45.sb5) fVar;
        return n51.f.a(this.f76492x92037252, sb5Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f467143d), java.lang.Integer.valueOf(sb5Var.f467143d)) && n51.f.a(this.f467144e, sb5Var.f467144e) && n51.f.a(this.f467145f, sb5Var.f467145f) && n51.f.a(java.lang.Integer.valueOf(this.f467146g), java.lang.Integer.valueOf(sb5Var.f467146g)) && n51.f.a(this.f467147h, sb5Var.f467147h) && n51.f.a(this.f467148i, sb5Var.f467148i) && n51.f.a(java.lang.Integer.valueOf(this.f467149m), java.lang.Integer.valueOf(sb5Var.f467149m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f467148i;
        java.util.LinkedList linkedList2 = this.f467144e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f467143d);
            fVar.g(3, 8, linkedList2);
            java.lang.String str = this.f467145f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f467146g);
            java.lang.String str2 = this.f467147h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.g(7, 8, linkedList);
            fVar.e(8, this.f467149m);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f467143d) + b36.f.g(3, 8, linkedList2);
            java.lang.String str3 = this.f467145f;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            int e17 = i18 + b36.f.e(5, this.f467146g);
            java.lang.String str4 = this.f467147h;
            if (str4 != null) {
                e17 += b36.f.j(6, str4);
            }
            return e17 + b36.f.g(7, 8, linkedList) + b36.f.e(8, this.f467149m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.sb5 sb5Var = (r45.sb5) objArr[1];
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
                    sb5Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                sb5Var.f467143d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.gm0 gm0Var = new r45.gm0();
                    if (bArr3 != null && bArr3.length > 0) {
                        gm0Var.mo11468x92b714fd(bArr3);
                    }
                    sb5Var.f467144e.add(gm0Var);
                }
                return 0;
            case 4:
                sb5Var.f467145f = aVar2.k(intValue);
                return 0;
            case 5:
                sb5Var.f467146g = aVar2.g(intValue);
                return 0;
            case 6:
                sb5Var.f467147h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.n1 n1Var = new r45.n1();
                    if (bArr4 != null && bArr4.length > 0) {
                        n1Var.mo11468x92b714fd(bArr4);
                    }
                    sb5Var.f467148i.add(n1Var);
                }
                return 0;
            case 8:
                sb5Var.f467149m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

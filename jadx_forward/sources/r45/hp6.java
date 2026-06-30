package r45;

/* loaded from: classes9.dex */
public class hp6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f457911d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f457912e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f457913f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public boolean f457914g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f457915h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hp6)) {
            return false;
        }
        r45.hp6 hp6Var = (r45.hp6) fVar;
        return n51.f.a(this.f76492x92037252, hp6Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f457911d), java.lang.Integer.valueOf(hp6Var.f457911d)) && n51.f.a(this.f457912e, hp6Var.f457912e) && n51.f.a(this.f457913f, hp6Var.f457913f) && n51.f.a(java.lang.Boolean.valueOf(this.f457914g), java.lang.Boolean.valueOf(hp6Var.f457914g)) && n51.f.a(this.f457915h, hp6Var.f457915h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f457913f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f457911d);
            java.lang.String str = this.f457912e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, linkedList);
            fVar.a(5, this.f457914g);
            java.lang.String str2 = this.f457915h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f457911d);
            java.lang.String str3 = this.f457912e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int g17 = i18 + b36.f.g(4, 8, linkedList) + b36.f.a(5, this.f457914g);
            java.lang.String str4 = this.f457915h;
            return str4 != null ? g17 + b36.f.j(6, str4) : g17;
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
        r45.hp6 hp6Var = (r45.hp6) objArr[1];
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
                    hp6Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                hp6Var.f457911d = aVar2.g(intValue);
                return 0;
            case 3:
                hp6Var.f457912e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.ow3 ow3Var = new r45.ow3();
                    if (bArr3 != null && bArr3.length > 0) {
                        ow3Var.mo11468x92b714fd(bArr3);
                    }
                    hp6Var.f457913f.add(ow3Var);
                }
                return 0;
            case 5:
                hp6Var.f457914g = aVar2.c(intValue);
                return 0;
            case 6:
                hp6Var.f457915h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

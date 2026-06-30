package r45;

/* loaded from: classes4.dex */
public class d17 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f453527d;

    /* renamed from: e, reason: collision with root package name */
    public int f453528e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f453529f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f453530g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d17)) {
            return false;
        }
        r45.d17 d17Var = (r45.d17) fVar;
        return n51.f.a(this.f76492x92037252, d17Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f453527d), java.lang.Integer.valueOf(d17Var.f453527d)) && n51.f.a(java.lang.Integer.valueOf(this.f453528e), java.lang.Integer.valueOf(d17Var.f453528e)) && n51.f.a(this.f453529f, d17Var.f453529f) && n51.f.a(this.f453530g, d17Var.f453530g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f453529f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f453527d);
            fVar.e(3, this.f453528e);
            fVar.g(4, 8, linkedList);
            java.lang.String str = this.f453530g;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f453527d) + b36.f.e(3, this.f453528e) + b36.f.g(4, 8, linkedList);
            java.lang.String str2 = this.f453530g;
            return str2 != null ? i18 + b36.f.j(5, str2) : i18;
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
        r45.d17 d17Var = (r45.d17) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr2);
                }
                d17Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            d17Var.f453527d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            d17Var.f453528e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            d17Var.f453530g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.du5 du5Var = new r45.du5();
            if (bArr3 != null && bArr3.length > 0) {
                du5Var.b(bArr3);
            }
            d17Var.f453529f.add(du5Var);
        }
        return 0;
    }
}

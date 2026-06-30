package r45;

/* loaded from: classes9.dex */
public class cf3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f453050d;

    /* renamed from: e, reason: collision with root package name */
    public int f453051e;

    /* renamed from: f, reason: collision with root package name */
    public int f453052f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f453053g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f453054h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public int f453055i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f453056m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cf3)) {
            return false;
        }
        r45.cf3 cf3Var = (r45.cf3) fVar;
        return n51.f.a(this.f76492x92037252, cf3Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f453050d), java.lang.Integer.valueOf(cf3Var.f453050d)) && n51.f.a(java.lang.Integer.valueOf(this.f453051e), java.lang.Integer.valueOf(cf3Var.f453051e)) && n51.f.a(java.lang.Integer.valueOf(this.f453052f), java.lang.Integer.valueOf(cf3Var.f453052f)) && n51.f.a(this.f453053g, cf3Var.f453053g) && n51.f.a(this.f453054h, cf3Var.f453054h) && n51.f.a(java.lang.Integer.valueOf(this.f453055i), java.lang.Integer.valueOf(cf3Var.f453055i)) && n51.f.a(this.f453056m, cf3Var.f453056m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f453054h;
        java.util.LinkedList linkedList2 = this.f453053g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f453050d);
            fVar.e(3, this.f453051e);
            fVar.e(4, this.f453052f);
            fVar.g(5, 2, linkedList2);
            fVar.g(6, 8, linkedList);
            fVar.e(7, this.f453055i);
            java.lang.String str = this.f453056m;
            if (str != null) {
                fVar.j(8, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f453050d) + b36.f.e(3, this.f453051e) + b36.f.e(4, this.f453052f) + b36.f.g(5, 2, linkedList2) + b36.f.g(6, 8, linkedList) + b36.f.e(7, this.f453055i);
            java.lang.String str2 = this.f453056m;
            return str2 != null ? i18 + b36.f.j(8, str2) : i18;
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
        r45.cf3 cf3Var = (r45.cf3) objArr[1];
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
                    cf3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                cf3Var.f453050d = aVar2.g(intValue);
                return 0;
            case 3:
                cf3Var.f453051e = aVar2.g(intValue);
                return 0;
            case 4:
                cf3Var.f453052f = aVar2.g(intValue);
                return 0;
            case 5:
                cf3Var.f453053g.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.hm0 hm0Var = new r45.hm0();
                    if (bArr3 != null && bArr3.length > 0) {
                        hm0Var.mo11468x92b714fd(bArr3);
                    }
                    cf3Var.f453054h.add(hm0Var);
                }
                return 0;
            case 7:
                cf3Var.f453055i = aVar2.g(intValue);
                return 0;
            case 8:
                cf3Var.f453056m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

package r45;

/* loaded from: classes4.dex */
public class oa6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f463636d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f463637e;

    /* renamed from: f, reason: collision with root package name */
    public int f463638f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f463639g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public int f463640h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oa6)) {
            return false;
        }
        r45.oa6 oa6Var = (r45.oa6) fVar;
        return n51.f.a(this.f76492x92037252, oa6Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f463636d), java.lang.Integer.valueOf(oa6Var.f463636d)) && n51.f.a(this.f463637e, oa6Var.f463637e) && n51.f.a(java.lang.Integer.valueOf(this.f463638f), java.lang.Integer.valueOf(oa6Var.f463638f)) && n51.f.a(this.f463639g, oa6Var.f463639g) && n51.f.a(java.lang.Integer.valueOf(this.f463640h), java.lang.Integer.valueOf(oa6Var.f463640h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f463639g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f463636d);
            java.lang.String str = this.f463637e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f463638f);
            fVar.g(5, 8, linkedList);
            fVar.e(6, this.f463640h);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f463636d);
            java.lang.String str2 = this.f463637e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            return i18 + b36.f.e(4, this.f463638f) + b36.f.g(5, 8, linkedList) + b36.f.e(6, this.f463640h);
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
        r45.oa6 oa6Var = (r45.oa6) objArr[1];
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
                    oa6Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                oa6Var.f463636d = aVar2.g(intValue);
                return 0;
            case 3:
                oa6Var.f463637e = aVar2.k(intValue);
                return 0;
            case 4:
                oa6Var.f463638f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.ma6 ma6Var = new r45.ma6();
                    if (bArr3 != null && bArr3.length > 0) {
                        ma6Var.mo11468x92b714fd(bArr3);
                    }
                    oa6Var.f463639g.add(ma6Var);
                }
                return 0;
            case 6:
                oa6Var.f463640h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

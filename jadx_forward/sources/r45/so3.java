package r45;

/* loaded from: classes4.dex */
public class so3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f467415d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f467416e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f467417f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f467418g;

    /* renamed from: h, reason: collision with root package name */
    public int f467419h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.so3)) {
            return false;
        }
        r45.so3 so3Var = (r45.so3) fVar;
        return n51.f.a(this.f76492x92037252, so3Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f467415d), java.lang.Integer.valueOf(so3Var.f467415d)) && n51.f.a(this.f467416e, so3Var.f467416e) && n51.f.a(this.f467417f, so3Var.f467417f) && n51.f.a(this.f467418g, so3Var.f467418g) && n51.f.a(java.lang.Integer.valueOf(this.f467419h), java.lang.Integer.valueOf(so3Var.f467419h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f467416e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f467415d);
            fVar.g(3, 8, linkedList);
            java.lang.String str = this.f467417f;
            if (str != null) {
                fVar.j(4, str);
            }
            r45.cu5 cu5Var = this.f467418g;
            if (cu5Var != null) {
                fVar.i(5, cu5Var.mo75928xcd1e8d8());
                this.f467418g.mo75956x3d5d1f78(fVar);
            }
            fVar.e(6, this.f467419h);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f467415d) + b36.f.g(3, 8, linkedList);
            java.lang.String str2 = this.f467417f;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            r45.cu5 cu5Var2 = this.f467418g;
            if (cu5Var2 != null) {
                i18 += b36.f.i(5, cu5Var2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.e(6, this.f467419h);
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
        r45.so3 so3Var = (r45.so3) objArr[1];
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
                    so3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                so3Var.f467415d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var.b(bArr3);
                    }
                    so3Var.f467416e.add(du5Var);
                }
                return 0;
            case 4:
                so3Var.f467417f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var3.b(bArr4);
                    }
                    so3Var.f467418g = cu5Var3;
                }
                return 0;
            case 6:
                so3Var.f467419h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

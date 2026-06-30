package r45;

/* loaded from: classes9.dex */
public class v17 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f469346d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469347e;

    /* renamed from: f, reason: collision with root package name */
    public int f469348f;

    /* renamed from: g, reason: collision with root package name */
    public int f469349g;

    /* renamed from: h, reason: collision with root package name */
    public int f469350h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f469351i = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v17)) {
            return false;
        }
        r45.v17 v17Var = (r45.v17) fVar;
        return n51.f.a(this.f469346d, v17Var.f469346d) && n51.f.a(this.f469347e, v17Var.f469347e) && n51.f.a(java.lang.Integer.valueOf(this.f469348f), java.lang.Integer.valueOf(v17Var.f469348f)) && n51.f.a(java.lang.Integer.valueOf(this.f469349g), java.lang.Integer.valueOf(v17Var.f469349g)) && n51.f.a(java.lang.Integer.valueOf(this.f469350h), java.lang.Integer.valueOf(v17Var.f469350h)) && n51.f.a(this.f469351i, v17Var.f469351i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f469351i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.cu5 cu5Var = this.f469346d;
            if (cu5Var != null) {
                fVar.i(1, cu5Var.mo75928xcd1e8d8());
                this.f469346d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f469347e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f469348f);
            fVar.e(4, this.f469349g);
            fVar.e(5, this.f469350h);
            fVar.g(6, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.cu5 cu5Var2 = this.f469346d;
            int i18 = cu5Var2 != null ? 0 + b36.f.i(1, cu5Var2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f469347e;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.e(3, this.f469348f) + b36.f.e(4, this.f469349g) + b36.f.e(5, this.f469350h) + b36.f.g(6, 8, linkedList);
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
        r45.v17 v17Var = (r45.v17) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    v17Var.f469346d = cu5Var3;
                }
                return 0;
            case 2:
                v17Var.f469347e = aVar2.k(intValue);
                return 0;
            case 3:
                v17Var.f469348f = aVar2.g(intValue);
                return 0;
            case 4:
                v17Var.f469349g = aVar2.g(intValue);
                return 0;
            case 5:
                v17Var.f469350h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.t44 t44Var = new r45.t44();
                    if (bArr3 != null && bArr3.length > 0) {
                        t44Var.mo11468x92b714fd(bArr3);
                    }
                    v17Var.f469351i.add(t44Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}

package r45;

/* loaded from: classes2.dex */
public class va extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f469550d;

    /* renamed from: e, reason: collision with root package name */
    public r45.xz4 f469551e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f469552f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469553g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.va)) {
            return false;
        }
        r45.va vaVar = (r45.va) fVar;
        return n51.f.a(this.f469550d, vaVar.f469550d) && n51.f.a(this.f469551e, vaVar.f469551e) && n51.f.a(this.f469552f, vaVar.f469552f) && n51.f.a(this.f469553g, vaVar.f469553g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f469550d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.xz4 xz4Var = this.f469551e;
            if (xz4Var != null) {
                fVar.i(2, xz4Var.mo75928xcd1e8d8());
                this.f469551e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, this.f469552f);
            java.lang.String str2 = this.f469553g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f469550d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            r45.xz4 xz4Var2 = this.f469551e;
            if (xz4Var2 != null) {
                j17 += b36.f.i(2, xz4Var2.mo75928xcd1e8d8());
            }
            int g17 = j17 + b36.f.g(3, 8, this.f469552f);
            java.lang.String str4 = this.f469553g;
            return str4 != null ? g17 + b36.f.j(4, str4) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f469552f.clear();
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
        r45.va vaVar = (r45.va) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            vaVar.f469550d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j18.get(i18);
                r45.xz4 xz4Var3 = new r45.xz4();
                if (bArr2 != null && bArr2.length > 0) {
                    xz4Var3.mo11468x92b714fd(bArr2);
                }
                vaVar.f469551e = xz4Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            vaVar.f469553g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j19.get(i19);
            r45.xz4 xz4Var4 = new r45.xz4();
            if (bArr3 != null && bArr3.length > 0) {
                xz4Var4.mo11468x92b714fd(bArr3);
            }
            vaVar.f469552f.add(xz4Var4);
        }
        return 0;
    }
}

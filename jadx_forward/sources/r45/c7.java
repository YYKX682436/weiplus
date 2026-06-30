package r45;

/* loaded from: classes4.dex */
public class c7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.za f452873d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f452874e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452875f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c7)) {
            return false;
        }
        r45.c7 c7Var = (r45.c7) fVar;
        return n51.f.a(this.f452873d, c7Var.f452873d) && n51.f.a(this.f452874e, c7Var.f452874e) && n51.f.a(this.f452875f, c7Var.f452875f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f452874e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.za zaVar = this.f452873d;
            if (zaVar != null) {
                fVar.i(1, zaVar.mo75928xcd1e8d8());
                this.f452873d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f452875f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.za zaVar2 = this.f452873d;
            int i18 = (zaVar2 != null ? 0 + b36.f.i(1, zaVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList);
            java.lang.String str2 = this.f452875f;
            return str2 != null ? i18 + b36.f.j(3, str2) : i18;
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
        r45.c7 c7Var = (r45.c7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.za zaVar3 = new r45.za();
                if (bArr2 != null && bArr2.length > 0) {
                    zaVar3.mo11468x92b714fd(bArr2);
                }
                c7Var.f452873d = zaVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            c7Var.f452875f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.zt3 zt3Var = new r45.zt3();
            if (bArr3 != null && bArr3.length > 0) {
                zt3Var.mo11468x92b714fd(bArr3);
            }
            c7Var.f452874e.add(zt3Var);
        }
        return 0;
    }
}

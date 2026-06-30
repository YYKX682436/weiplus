package r45;

/* loaded from: classes7.dex */
public class z24 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f473167d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f473168e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f473169f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f473170g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z24)) {
            return false;
        }
        r45.z24 z24Var = (r45.z24) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f473167d), java.lang.Integer.valueOf(z24Var.f473167d)) && n51.f.a(this.f473168e, z24Var.f473168e) && n51.f.a(this.f473169f, z24Var.f473169f) && n51.f.a(this.f473170g, z24Var.f473170g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f473170g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f473167d);
            java.lang.String str = this.f473168e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f473169f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f473167d) + 0;
            java.lang.String str3 = this.f473168e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f473169f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            return e17 + b36.f.g(4, 8, linkedList);
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
        r45.z24 z24Var = (r45.z24) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            z24Var.f473167d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            z24Var.f473168e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            z24Var.f473169f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.cw3 cw3Var = new r45.cw3();
            if (bArr2 != null && bArr2.length > 0) {
                cw3Var.mo11468x92b714fd(bArr2);
            }
            z24Var.f473170g.add(cw3Var);
        }
        return 0;
    }
}

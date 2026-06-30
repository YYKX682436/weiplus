package r45;

/* loaded from: classes4.dex */
public class a86 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.z76 f451359d;

    /* renamed from: e, reason: collision with root package name */
    public int f451360e;

    /* renamed from: f, reason: collision with root package name */
    public int f451361f;

    /* renamed from: h, reason: collision with root package name */
    public int f451363h;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f451362g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f451364i = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a86)) {
            return false;
        }
        r45.a86 a86Var = (r45.a86) fVar;
        return n51.f.a(this.f451359d, a86Var.f451359d) && n51.f.a(java.lang.Integer.valueOf(this.f451360e), java.lang.Integer.valueOf(a86Var.f451360e)) && n51.f.a(java.lang.Integer.valueOf(this.f451361f), java.lang.Integer.valueOf(a86Var.f451361f)) && n51.f.a(this.f451362g, a86Var.f451362g) && n51.f.a(java.lang.Integer.valueOf(this.f451363h), java.lang.Integer.valueOf(a86Var.f451363h)) && n51.f.a(this.f451364i, a86Var.f451364i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f451364i;
        java.util.LinkedList linkedList2 = this.f451362g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.z76 z76Var = this.f451359d;
            if (z76Var != null) {
                fVar.i(1, z76Var.mo75928xcd1e8d8());
                this.f451359d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f451360e);
            fVar.e(3, this.f451361f);
            fVar.g(4, 8, linkedList2);
            fVar.e(5, this.f451363h);
            fVar.g(6, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.z76 z76Var2 = this.f451359d;
            return (z76Var2 != null ? 0 + b36.f.i(1, z76Var2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f451360e) + b36.f.e(3, this.f451361f) + b36.f.g(4, 8, linkedList2) + b36.f.e(5, this.f451363h) + b36.f.g(6, 8, linkedList);
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
        r45.a86 a86Var = (r45.a86) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.z76 z76Var3 = new r45.z76();
                    if (bArr2 != null && bArr2.length > 0) {
                        z76Var3.mo11468x92b714fd(bArr2);
                    }
                    a86Var.f451359d = z76Var3;
                }
                return 0;
            case 2:
                a86Var.f451360e = aVar2.g(intValue);
                return 0;
            case 3:
                a86Var.f451361f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.l86 l86Var = new r45.l86();
                    if (bArr3 != null && bArr3.length > 0) {
                        l86Var.mo11468x92b714fd(bArr3);
                    }
                    a86Var.f451362g.add(l86Var);
                }
                return 0;
            case 5:
                a86Var.f451363h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.d86 d86Var = new r45.d86();
                    if (bArr4 != null && bArr4.length > 0) {
                        d86Var.mo11468x92b714fd(bArr4);
                    }
                    a86Var.f451364i.add(d86Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}

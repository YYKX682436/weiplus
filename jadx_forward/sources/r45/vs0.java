package r45;

/* loaded from: classes2.dex */
public class vs0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f470015d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470016e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f470017f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f470018g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vs0)) {
            return false;
        }
        r45.vs0 vs0Var = (r45.vs0) fVar;
        return n51.f.a(this.f470015d, vs0Var.f470015d) && n51.f.a(this.f470016e, vs0Var.f470016e) && n51.f.a(this.f470017f, vs0Var.f470017f) && n51.f.a(java.lang.Integer.valueOf(this.f470018g), java.lang.Integer.valueOf(vs0Var.f470018g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f470017f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f470015d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f470016e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, linkedList);
            fVar.e(4, this.f470018g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f470015d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f470016e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.g(3, 8, linkedList) + b36.f.e(4, this.f470018g);
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
        r45.vs0 vs0Var = (r45.vs0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            vs0Var.f470015d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            vs0Var.f470016e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            vs0Var.f470018g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            r45.ws0 ws0Var = new r45.ws0();
            if (bArr2 != null && bArr2.length > 0) {
                ws0Var.mo11468x92b714fd(bArr2);
            }
            vs0Var.f470017f.add(ws0Var);
        }
        return 0;
    }
}

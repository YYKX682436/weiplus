package r45;

/* loaded from: classes11.dex */
public class z06 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473105d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f473106e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f473107f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f473108g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z06)) {
            return false;
        }
        r45.z06 z06Var = (r45.z06) fVar;
        return n51.f.a(this.f473105d, z06Var.f473105d) && n51.f.a(this.f473106e, z06Var.f473106e) && n51.f.a(this.f473107f, z06Var.f473107f) && n51.f.a(this.f473108g, z06Var.f473108g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f473108g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f473105d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f473106e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f473107f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f473105d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f473106e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f473107f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.g(4, 8, linkedList);
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
        r45.z06 z06Var = (r45.z06) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            z06Var.f473105d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            z06Var.f473106e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            z06Var.f473107f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            r45.y06 y06Var = new r45.y06();
            if (bArr2 != null && bArr2.length > 0) {
                y06Var.mo11468x92b714fd(bArr2);
            }
            z06Var.f473108g.add(y06Var);
        }
        return 0;
    }
}

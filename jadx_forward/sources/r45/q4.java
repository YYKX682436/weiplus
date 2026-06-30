package r45;

/* loaded from: classes4.dex */
public class q4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465183d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465184e;

    /* renamed from: f, reason: collision with root package name */
    public long f465185f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f465186g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f465187h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f465188i = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q4)) {
            return false;
        }
        r45.q4 q4Var = (r45.q4) fVar;
        return n51.f.a(this.f465183d, q4Var.f465183d) && n51.f.a(this.f465184e, q4Var.f465184e) && n51.f.a(java.lang.Long.valueOf(this.f465185f), java.lang.Long.valueOf(q4Var.f465185f)) && n51.f.a(this.f465186g, q4Var.f465186g) && n51.f.a(this.f465187h, q4Var.f465187h) && n51.f.a(this.f465188i, q4Var.f465188i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f465183d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f465184e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f465185f);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f465186g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            java.lang.String str3 = this.f465187h;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.g(8, 8, this.f465188i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f465183d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f465184e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int h17 = j17 + b36.f.h(3, this.f465185f);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f465186g;
            if (gVar2 != null) {
                h17 += b36.f.b(4, gVar2);
            }
            java.lang.String str6 = this.f465187h;
            if (str6 != null) {
                h17 += b36.f.j(7, str6);
            }
            return h17 + b36.f.g(8, 8, this.f465188i);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f465188i.clear();
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
        r45.q4 q4Var = (r45.q4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            q4Var.f465183d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            q4Var.f465184e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            q4Var.f465185f = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            q4Var.f465186g = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 7) {
            q4Var.f465187h = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 8) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            r45.k15 k15Var = new r45.k15();
            if (bArr2 != null && bArr2.length > 0) {
                k15Var.mo11468x92b714fd(bArr2);
            }
            q4Var.f465188i.add(k15Var);
        }
        return 0;
    }
}

package bh4;

/* loaded from: classes4.dex */
public class a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f102447d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f102448e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f102449f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bh4.a)) {
            return false;
        }
        bh4.a aVar = (bh4.a) fVar;
        return n51.f.a(this.f102447d, aVar.f102447d) && n51.f.a(this.f102448e, aVar.f102448e) && n51.f.a(java.lang.Integer.valueOf(this.f102449f), java.lang.Integer.valueOf(aVar.f102449f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f102447d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, this.f102448e);
            fVar.e(3, this.f102449f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f102447d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 8, this.f102448e) + b36.f.e(3, this.f102449f);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f102448e.clear();
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
        bh4.a aVar3 = (bh4.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            aVar3.f102447d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            aVar3.f102449f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.nk6 nk6Var = new r45.nk6();
            if (bArr2 != null && bArr2.length > 0) {
                nk6Var.mo11468x92b714fd(bArr2);
            }
            aVar3.f102448e.add(nk6Var);
        }
        return 0;
    }
}

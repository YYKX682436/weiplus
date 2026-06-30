package r45;

/* loaded from: classes2.dex */
public class mj extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f462085d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f462086e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f462087f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mj)) {
            return false;
        }
        r45.mj mjVar = (r45.mj) fVar;
        return n51.f.a(this.f462085d, mjVar.f462085d) && n51.f.a(this.f462086e, mjVar.f462086e) && n51.f.a(java.lang.Boolean.valueOf(this.f462087f), java.lang.Boolean.valueOf(mjVar.f462087f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f462086e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f462085d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            fVar.a(3, this.f462087f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f462085d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 8, linkedList) + b36.f.a(3, this.f462087f);
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
        r45.mj mjVar = (r45.mj) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            mjVar.f462085d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            mjVar.f462087f = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.oj ojVar = new r45.oj();
            if (bArr2 != null && bArr2.length > 0) {
                ojVar.mo11468x92b714fd(bArr2);
            }
            mjVar.f462086e.add(ojVar);
        }
        return 0;
    }
}

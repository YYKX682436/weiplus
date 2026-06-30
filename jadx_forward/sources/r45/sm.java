package r45;

/* loaded from: classes4.dex */
public class sm extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467373d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f467374e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f467375f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sm)) {
            return false;
        }
        r45.sm smVar = (r45.sm) fVar;
        return n51.f.a(this.f467373d, smVar.f467373d) && n51.f.a(this.f467374e, smVar.f467374e) && n51.f.a(java.lang.Boolean.valueOf(this.f467375f), java.lang.Boolean.valueOf(smVar.f467375f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f467374e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f467373d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 2, linkedList);
            fVar.a(3, this.f467375f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f467373d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 2, linkedList) + b36.f.a(3, this.f467375f);
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
        r45.sm smVar = (r45.sm) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            smVar.f467373d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            smVar.f467374e.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        smVar.f467375f = aVar2.c(intValue);
        return 0;
    }
}

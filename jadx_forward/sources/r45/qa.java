package r45;

/* loaded from: classes9.dex */
public class qa extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f465321d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f465322e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465323f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qa)) {
            return false;
        }
        r45.qa qaVar = (r45.qa) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f465321d), java.lang.Integer.valueOf(qaVar.f465321d)) && n51.f.a(this.f465322e, qaVar.f465322e) && n51.f.a(this.f465323f, qaVar.f465323f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f465321d);
            fVar.g(2, 8, this.f465322e);
            java.lang.String str = this.f465323f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f465321d) + 0 + b36.f.g(2, 8, this.f465322e);
            java.lang.String str2 = this.f465323f;
            return str2 != null ? e17 + b36.f.j(3, str2) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f465322e.clear();
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
        r45.qa qaVar = (r45.qa) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qaVar.f465321d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            qaVar.f465323f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.z56 z56Var = new r45.z56();
            if (bArr2 != null && bArr2.length > 0) {
                z56Var.mo11468x92b714fd(bArr2);
            }
            qaVar.f465322e.add(z56Var);
        }
        return 0;
    }
}

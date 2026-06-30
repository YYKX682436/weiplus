package r45;

/* loaded from: classes9.dex */
public class bs extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f452549d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452550e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452551f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bs)) {
            return false;
        }
        r45.bs bsVar = (r45.bs) fVar;
        return n51.f.a(this.f452549d, bsVar.f452549d) && n51.f.a(this.f452550e, bsVar.f452550e) && n51.f.a(this.f452551f, bsVar.f452551f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f452549d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f452550e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f452551f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f452549d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f452550e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f452551f;
            return str6 != null ? j17 + b36.f.j(3, str6) : j17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.bs bsVar = (r45.bs) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bsVar.f452549d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            bsVar.f452550e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        bsVar.f452551f = aVar2.k(intValue);
        return 0;
    }
}

package r45;

/* loaded from: classes14.dex */
public class ce extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453025d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f453026e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f453027f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f453028g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ce)) {
            return false;
        }
        r45.ce ceVar = (r45.ce) fVar;
        return n51.f.a(this.f453025d, ceVar.f453025d) && n51.f.a(this.f453026e, ceVar.f453026e) && n51.f.a(this.f453027f, ceVar.f453027f) && n51.f.a(this.f453028g, ceVar.f453028g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f453025d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f453026e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f453027f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f453028g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f453025d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f453026e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f453027f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f453028g;
            return str8 != null ? j17 + b36.f.j(4, str8) : j17;
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
        r45.ce ceVar = (r45.ce) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ceVar.f453025d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ceVar.f453026e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ceVar.f453027f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        ceVar.f453028g = aVar2.k(intValue);
        return 0;
    }
}

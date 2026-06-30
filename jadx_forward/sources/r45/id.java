package r45;

/* loaded from: classes8.dex */
public class id extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f458474d;

    /* renamed from: e, reason: collision with root package name */
    public int f458475e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f458476f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f458477g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f458478h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.id)) {
            return false;
        }
        r45.id idVar = (r45.id) fVar;
        return n51.f.a(this.f458474d, idVar.f458474d) && n51.f.a(java.lang.Integer.valueOf(this.f458475e), java.lang.Integer.valueOf(idVar.f458475e)) && n51.f.a(this.f458476f, idVar.f458476f) && n51.f.a(this.f458477g, idVar.f458477g) && n51.f.a(this.f458478h, idVar.f458478h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f458474d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f458475e);
            java.lang.String str2 = this.f458476f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f458477g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f458478h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f458474d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.e(2, this.f458475e);
            java.lang.String str6 = this.f458476f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f458477g;
            if (str7 != null) {
                j17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f458478h;
            return str8 != null ? j17 + b36.f.j(5, str8) : j17;
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
        r45.id idVar = (r45.id) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            idVar.f458474d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            idVar.f458475e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            idVar.f458476f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            idVar.f458477g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        idVar.f458478h = aVar2.k(intValue);
        return 0;
    }
}

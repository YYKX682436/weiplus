package r45;

/* loaded from: classes9.dex */
public class a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f451100d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f451101e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f451102f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f451103g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f451104h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a)) {
            return false;
        }
        r45.a aVar = (r45.a) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f451100d), java.lang.Integer.valueOf(aVar.f451100d)) && n51.f.a(this.f451101e, aVar.f451101e) && n51.f.a(this.f451102f, aVar.f451102f) && n51.f.a(this.f451103g, aVar.f451103g) && n51.f.a(this.f451104h, aVar.f451104h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f451100d);
            java.lang.String str = this.f451101e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f451102f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f451103g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f451104h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f451100d) + 0;
            java.lang.String str5 = this.f451101e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f451102f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f451103g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f451104h;
            return str8 != null ? e17 + b36.f.j(5, str8) : e17;
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
        r45.a aVar3 = (r45.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            aVar3.f451100d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            aVar3.f451101e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            aVar3.f451102f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            aVar3.f451103g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        aVar3.f451104h = aVar2.k(intValue);
        return 0;
    }
}

package r45;

/* loaded from: classes11.dex */
public class wu extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f470991d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470992e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f470993f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f470994g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f470995h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wu)) {
            return false;
        }
        r45.wu wuVar = (r45.wu) fVar;
        return n51.f.a(this.f470991d, wuVar.f470991d) && n51.f.a(this.f470992e, wuVar.f470992e) && n51.f.a(this.f470993f, wuVar.f470993f) && n51.f.a(this.f470994g, wuVar.f470994g) && n51.f.a(this.f470995h, wuVar.f470995h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f470991d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f470992e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f470993f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f470994g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f470995h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f470991d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f470992e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f470993f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f470994g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f470995h;
            return str10 != null ? j17 + b36.f.j(5, str10) : j17;
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
        r45.wu wuVar = (r45.wu) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            wuVar.f470991d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            wuVar.f470992e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            wuVar.f470993f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            wuVar.f470994g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        wuVar.f470995h = aVar2.k(intValue);
        return 0;
    }
}

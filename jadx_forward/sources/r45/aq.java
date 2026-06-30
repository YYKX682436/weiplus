package r45;

/* loaded from: classes2.dex */
public class aq extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f451714d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f451715e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f451716f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f451717g;

    /* renamed from: h, reason: collision with root package name */
    public int f451718h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f451719i;

    /* renamed from: m, reason: collision with root package name */
    public int f451720m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.aq)) {
            return false;
        }
        r45.aq aqVar = (r45.aq) fVar;
        return n51.f.a(this.f451714d, aqVar.f451714d) && n51.f.a(this.f451715e, aqVar.f451715e) && n51.f.a(this.f451716f, aqVar.f451716f) && n51.f.a(this.f451717g, aqVar.f451717g) && n51.f.a(java.lang.Integer.valueOf(this.f451718h), java.lang.Integer.valueOf(aqVar.f451718h)) && n51.f.a(this.f451719i, aqVar.f451719i) && n51.f.a(java.lang.Integer.valueOf(this.f451720m), java.lang.Integer.valueOf(aqVar.f451720m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f451714d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f451715e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f451716f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f451717g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f451718h);
            java.lang.String str5 = this.f451719i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f451720m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f451714d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f451715e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f451716f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f451717g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            int e17 = j17 + b36.f.e(5, this.f451718h);
            java.lang.String str10 = this.f451719i;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            return e17 + b36.f.e(7, this.f451720m);
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
        r45.aq aqVar = (r45.aq) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                aqVar.f451714d = aVar2.k(intValue);
                return 0;
            case 2:
                aqVar.f451715e = aVar2.k(intValue);
                return 0;
            case 3:
                aqVar.f451716f = aVar2.k(intValue);
                return 0;
            case 4:
                aqVar.f451717g = aVar2.k(intValue);
                return 0;
            case 5:
                aqVar.f451718h = aVar2.g(intValue);
                return 0;
            case 6:
                aqVar.f451719i = aVar2.k(intValue);
                return 0;
            case 7:
                aqVar.f451720m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

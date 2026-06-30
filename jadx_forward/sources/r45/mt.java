package r45;

/* loaded from: classes7.dex */
public class mt extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f462349d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f462350e;

    /* renamed from: f, reason: collision with root package name */
    public int f462351f;

    /* renamed from: g, reason: collision with root package name */
    public int f462352g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f462353h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f462354i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mt)) {
            return false;
        }
        r45.mt mtVar = (r45.mt) fVar;
        return n51.f.a(this.f462349d, mtVar.f462349d) && n51.f.a(this.f462350e, mtVar.f462350e) && n51.f.a(java.lang.Integer.valueOf(this.f462351f), java.lang.Integer.valueOf(mtVar.f462351f)) && n51.f.a(java.lang.Integer.valueOf(this.f462352g), java.lang.Integer.valueOf(mtVar.f462352g)) && n51.f.a(this.f462353h, mtVar.f462353h) && n51.f.a(this.f462354i, mtVar.f462354i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f462349d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f462350e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f462351f);
            fVar.e(4, this.f462352g);
            java.lang.String str3 = this.f462353h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f462354i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f462349d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f462350e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f462351f) + b36.f.e(4, this.f462352g);
            java.lang.String str7 = this.f462353h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f462354i;
            return str8 != null ? e17 + b36.f.j(6, str8) : e17;
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
        r45.mt mtVar = (r45.mt) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                mtVar.f462349d = aVar2.k(intValue);
                return 0;
            case 2:
                mtVar.f462350e = aVar2.k(intValue);
                return 0;
            case 3:
                mtVar.f462351f = aVar2.g(intValue);
                return 0;
            case 4:
                mtVar.f462352g = aVar2.g(intValue);
                return 0;
            case 5:
                mtVar.f462353h = aVar2.k(intValue);
                return 0;
            case 6:
                mtVar.f462354i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

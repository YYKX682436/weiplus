package wn1;

/* loaded from: classes12.dex */
public class p extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f528979d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f528980e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f528981f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f528982g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f528983h;

    /* renamed from: i, reason: collision with root package name */
    public int f528984i;

    /* renamed from: m, reason: collision with root package name */
    public long f528985m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.p)) {
            return false;
        }
        wn1.p pVar = (wn1.p) fVar;
        return n51.f.a(this.f528979d, pVar.f528979d) && n51.f.a(this.f528980e, pVar.f528980e) && n51.f.a(this.f528981f, pVar.f528981f) && n51.f.a(this.f528982g, pVar.f528982g) && n51.f.a(this.f528983h, pVar.f528983h) && n51.f.a(java.lang.Integer.valueOf(this.f528984i), java.lang.Integer.valueOf(pVar.f528984i)) && n51.f.a(java.lang.Long.valueOf(this.f528985m), java.lang.Long.valueOf(pVar.f528985m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f528979d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f528980e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f528981f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f528982g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f528983h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f528984i);
            fVar.h(7, this.f528985m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f528979d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f528980e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f528981f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f528982g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f528983h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            return j17 + b36.f.e(6, this.f528984i) + b36.f.h(7, this.f528985m);
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
        wn1.p pVar = (wn1.p) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pVar.f528979d = aVar2.k(intValue);
                return 0;
            case 2:
                pVar.f528980e = aVar2.k(intValue);
                return 0;
            case 3:
                pVar.f528981f = aVar2.k(intValue);
                return 0;
            case 4:
                pVar.f528982g = aVar2.k(intValue);
                return 0;
            case 5:
                pVar.f528983h = aVar2.k(intValue);
                return 0;
            case 6:
                pVar.f528984i = aVar2.g(intValue);
                return 0;
            case 7:
                pVar.f528985m = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

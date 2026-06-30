package r45;

/* loaded from: classes9.dex */
public class yr extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472843d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472844e;

    /* renamed from: f, reason: collision with root package name */
    public long f472845f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f472846g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yr)) {
            return false;
        }
        r45.yr yrVar = (r45.yr) fVar;
        return n51.f.a(this.f472843d, yrVar.f472843d) && n51.f.a(this.f472844e, yrVar.f472844e) && n51.f.a(java.lang.Long.valueOf(this.f472845f), java.lang.Long.valueOf(yrVar.f472845f)) && n51.f.a(this.f472846g, yrVar.f472846g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f472843d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f472844e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f472845f);
            java.lang.String str3 = this.f472846g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f472843d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f472844e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int h17 = j17 + b36.f.h(3, this.f472845f);
            java.lang.String str6 = this.f472846g;
            return str6 != null ? h17 + b36.f.j(4, str6) : h17;
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
        r45.yr yrVar = (r45.yr) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            yrVar.f472843d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            yrVar.f472844e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            yrVar.f472845f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        yrVar.f472846g = aVar2.k(intValue);
        return 0;
    }
}

package in;

/* loaded from: classes7.dex */
public class a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374247d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374248e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374249f;

    /* renamed from: g, reason: collision with root package name */
    public long f374250g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof in.a)) {
            return false;
        }
        in.a aVar = (in.a) fVar;
        return n51.f.a(this.f374247d, aVar.f374247d) && n51.f.a(this.f374248e, aVar.f374248e) && n51.f.a(this.f374249f, aVar.f374249f) && n51.f.a(java.lang.Long.valueOf(this.f374250g), java.lang.Long.valueOf(aVar.f374250g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f374247d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f374248e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f374249f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.h(4, this.f374250g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f374247d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f374248e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f374249f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.h(4, this.f374250g);
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
        in.a aVar3 = (in.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            aVar3.f374247d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            aVar3.f374248e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            aVar3.f374249f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        aVar3.f374250g = aVar2.i(intValue);
        return 0;
    }
}

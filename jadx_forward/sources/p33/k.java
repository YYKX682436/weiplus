package p33;

/* loaded from: classes8.dex */
public class k extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f433132d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f433133e;

    /* renamed from: f, reason: collision with root package name */
    public int f433134f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof p33.k)) {
            return false;
        }
        p33.k kVar = (p33.k) fVar;
        return n51.f.a(this.f433132d, kVar.f433132d) && n51.f.a(this.f433133e, kVar.f433133e) && n51.f.a(java.lang.Integer.valueOf(this.f433134f), java.lang.Integer.valueOf(kVar.f433134f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f433132d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f433133e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f433134f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f433132d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f433133e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f433134f);
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
        p33.k kVar = (p33.k) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            kVar.f433132d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            kVar.f433133e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        kVar.f433134f = aVar2.g(intValue);
        return 0;
    }
}

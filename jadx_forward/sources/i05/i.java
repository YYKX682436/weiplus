package i05;

/* loaded from: classes4.dex */
public class i extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f368109d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f368110e;

    /* renamed from: f, reason: collision with root package name */
    public long f368111f;

    /* renamed from: g, reason: collision with root package name */
    public long f368112g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof i05.i)) {
            return false;
        }
        i05.i iVar = (i05.i) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f368109d), java.lang.Integer.valueOf(iVar.f368109d)) && n51.f.a(this.f368110e, iVar.f368110e) && n51.f.a(java.lang.Long.valueOf(this.f368111f), java.lang.Long.valueOf(iVar.f368111f)) && n51.f.a(java.lang.Long.valueOf(this.f368112g), java.lang.Long.valueOf(iVar.f368112g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f368109d);
            java.lang.String str = this.f368110e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f368111f);
            fVar.h(4, this.f368112g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f368109d) + 0;
            java.lang.String str2 = this.f368110e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.h(3, this.f368111f) + b36.f.h(4, this.f368112g);
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
        i05.i iVar = (i05.i) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            iVar.f368109d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            iVar.f368110e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            iVar.f368111f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        iVar.f368112g = aVar2.i(intValue);
        return 0;
    }
}

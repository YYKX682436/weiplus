package r45;

/* loaded from: classes4.dex */
public class zk extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473687d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f473688e;

    /* renamed from: f, reason: collision with root package name */
    public int f473689f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zk)) {
            return false;
        }
        r45.zk zkVar = (r45.zk) fVar;
        return n51.f.a(this.f473687d, zkVar.f473687d) && n51.f.a(this.f473688e, zkVar.f473688e) && n51.f.a(java.lang.Integer.valueOf(this.f473689f), java.lang.Integer.valueOf(zkVar.f473689f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f473687d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f473688e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f473689f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f473687d;
            int j17 = str3 != null ? 0 + b36.f.j(2, str3) : 0;
            java.lang.String str4 = this.f473688e;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            return j17 + b36.f.e(4, this.f473689f);
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
        r45.zk zkVar = (r45.zk) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 2) {
            zkVar.f473687d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            zkVar.f473688e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        zkVar.f473689f = aVar2.g(intValue);
        return 0;
    }
}

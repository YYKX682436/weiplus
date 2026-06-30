package r45;

/* loaded from: classes7.dex */
public class lh extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f460999d;

    /* renamed from: e, reason: collision with root package name */
    public long f461000e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f461001f;

    /* renamed from: g, reason: collision with root package name */
    public int f461002g;

    /* renamed from: h, reason: collision with root package name */
    public int f461003h;

    /* renamed from: i, reason: collision with root package name */
    public long f461004i;

    /* renamed from: m, reason: collision with root package name */
    public long f461005m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lh)) {
            return false;
        }
        r45.lh lhVar = (r45.lh) fVar;
        return n51.f.a(this.f76494x2de60e5e, lhVar.f76494x2de60e5e) && n51.f.a(java.lang.Long.valueOf(this.f460999d), java.lang.Long.valueOf(lhVar.f460999d)) && n51.f.a(java.lang.Long.valueOf(this.f461000e), java.lang.Long.valueOf(lhVar.f461000e)) && n51.f.a(this.f461001f, lhVar.f461001f) && n51.f.a(java.lang.Integer.valueOf(this.f461002g), java.lang.Integer.valueOf(lhVar.f461002g)) && n51.f.a(java.lang.Integer.valueOf(this.f461003h), java.lang.Integer.valueOf(lhVar.f461003h)) && n51.f.a(java.lang.Long.valueOf(this.f461004i), java.lang.Long.valueOf(lhVar.f461004i)) && n51.f.a(java.lang.Long.valueOf(this.f461005m), java.lang.Long.valueOf(lhVar.f461005m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.h(2, this.f460999d);
            fVar.h(3, this.f461000e);
            java.lang.String str = this.f461001f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f461002g);
            fVar.e(6, this.f461003h);
            fVar.h(7, this.f461004i);
            fVar.h(8, this.f461005m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.h(2, this.f460999d) + b36.f.h(3, this.f461000e);
            java.lang.String str2 = this.f461001f;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            return i18 + b36.f.e(5, this.f461002g) + b36.f.e(6, this.f461003h) + b36.f.h(7, this.f461004i) + b36.f.h(8, this.f461005m);
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
        r45.lh lhVar = (r45.lh) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    lhVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                lhVar.f460999d = aVar2.i(intValue);
                return 0;
            case 3:
                lhVar.f461000e = aVar2.i(intValue);
                return 0;
            case 4:
                lhVar.f461001f = aVar2.k(intValue);
                return 0;
            case 5:
                lhVar.f461002g = aVar2.g(intValue);
                return 0;
            case 6:
                lhVar.f461003h = aVar2.g(intValue);
                return 0;
            case 7:
                lhVar.f461004i = aVar2.i(intValue);
                return 0;
            case 8:
                lhVar.f461005m = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

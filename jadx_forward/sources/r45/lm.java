package r45;

/* loaded from: classes8.dex */
public class lm extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f461119d;

    /* renamed from: e, reason: collision with root package name */
    public int f461120e;

    /* renamed from: f, reason: collision with root package name */
    public int f461121f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f461122g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public int f461123h;

    /* renamed from: i, reason: collision with root package name */
    public int f461124i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lm)) {
            return false;
        }
        r45.lm lmVar = (r45.lm) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f461119d), java.lang.Integer.valueOf(lmVar.f461119d)) && n51.f.a(java.lang.Integer.valueOf(this.f461120e), java.lang.Integer.valueOf(lmVar.f461120e)) && n51.f.a(java.lang.Integer.valueOf(this.f461121f), java.lang.Integer.valueOf(lmVar.f461121f)) && n51.f.a(this.f461122g, lmVar.f461122g) && n51.f.a(java.lang.Integer.valueOf(this.f461123h), java.lang.Integer.valueOf(lmVar.f461123h)) && n51.f.a(java.lang.Integer.valueOf(this.f461124i), java.lang.Integer.valueOf(lmVar.f461124i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f461122g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f461119d);
            fVar.e(2, this.f461120e);
            fVar.e(3, this.f461121f);
            fVar.g(4, 8, linkedList);
            fVar.e(5, this.f461123h);
            fVar.e(6, this.f461124i);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f461119d) + 0 + b36.f.e(2, this.f461120e) + b36.f.e(3, this.f461121f) + b36.f.g(4, 8, linkedList) + b36.f.e(5, this.f461123h) + b36.f.e(6, this.f461124i);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.lm lmVar = (r45.lm) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lmVar.f461119d = aVar2.g(intValue);
                return 0;
            case 2:
                lmVar.f461120e = aVar2.g(intValue);
                return 0;
            case 3:
                lmVar.f461121f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.mm mmVar = new r45.mm();
                    if (bArr2 != null && bArr2.length > 0) {
                        mmVar.mo11468x92b714fd(bArr2);
                    }
                    lmVar.f461122g.add(mmVar);
                }
                return 0;
            case 5:
                lmVar.f461123h = aVar2.g(intValue);
                return 0;
            case 6:
                lmVar.f461124i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

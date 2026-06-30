package xq3;

/* loaded from: classes2.dex */
public class j extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f537625d;

    /* renamed from: e, reason: collision with root package name */
    public xq3.g f537626e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f537627f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof xq3.j)) {
            return false;
        }
        xq3.j jVar = (xq3.j) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f537625d), java.lang.Integer.valueOf(jVar.f537625d)) && n51.f.a(this.f537626e, jVar.f537626e) && n51.f.a(this.f537627f, jVar.f537627f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f537625d);
            xq3.g gVar = this.f537626e;
            if (gVar != null) {
                fVar.i(2, gVar.mo75928xcd1e8d8());
                this.f537626e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f537627f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f537625d) + 0;
            xq3.g gVar2 = this.f537626e;
            if (gVar2 != null) {
                e17 += b36.f.i(2, gVar2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f537627f;
            return str2 != null ? e17 + b36.f.j(3, str2) : e17;
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
        xq3.j jVar = (xq3.j) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            jVar.f537625d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            jVar.f537627f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            xq3.g gVar3 = new xq3.g();
            if (bArr != null && bArr.length > 0) {
                gVar3.mo11468x92b714fd(bArr);
            }
            jVar.f537626e = gVar3;
        }
        return 0;
    }
}

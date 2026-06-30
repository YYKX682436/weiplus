package r45;

/* loaded from: classes8.dex */
public class km extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.lm f460348d;

    /* renamed from: e, reason: collision with root package name */
    public int f460349e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460350f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.km)) {
            return false;
        }
        r45.km kmVar = (r45.km) fVar;
        return n51.f.a(this.f460348d, kmVar.f460348d) && n51.f.a(java.lang.Integer.valueOf(this.f460349e), java.lang.Integer.valueOf(kmVar.f460349e)) && n51.f.a(this.f460350f, kmVar.f460350f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.lm lmVar = this.f460348d;
            if (lmVar != null) {
                fVar.i(1, lmVar.mo75928xcd1e8d8());
                this.f460348d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f460349e);
            java.lang.String str = this.f460350f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.lm lmVar2 = this.f460348d;
            int i18 = (lmVar2 != null ? 0 + b36.f.i(1, lmVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f460349e);
            java.lang.String str2 = this.f460350f;
            return str2 != null ? i18 + b36.f.j(3, str2) : i18;
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
        r45.km kmVar = (r45.km) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                kmVar.f460349e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            kmVar.f460350f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.lm lmVar3 = new r45.lm();
            if (bArr != null && bArr.length > 0) {
                lmVar3.mo11468x92b714fd(bArr);
            }
            kmVar.f460348d = lmVar3;
        }
        return 0;
    }
}

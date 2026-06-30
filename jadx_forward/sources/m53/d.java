package m53;

/* loaded from: classes7.dex */
public class d extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public m53.h f405142d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405143e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f405144f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.d)) {
            return false;
        }
        m53.d dVar = (m53.d) fVar;
        return n51.f.a(this.f405142d, dVar.f405142d) && n51.f.a(this.f405143e, dVar.f405143e) && n51.f.a(this.f405144f, dVar.f405144f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            m53.h hVar = this.f405142d;
            if (hVar != null) {
                fVar.i(1, hVar.mo75928xcd1e8d8());
                this.f405142d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f405143e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f405144f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            m53.h hVar2 = this.f405142d;
            int i18 = hVar2 != null ? 0 + b36.f.i(1, hVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f405143e;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f405144f;
            return str4 != null ? i18 + b36.f.j(3, str4) : i18;
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
        m53.d dVar = (m53.d) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                dVar.f405143e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            dVar.f405144f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            m53.h hVar3 = new m53.h();
            if (bArr != null && bArr.length > 0) {
                hVar3.mo11468x92b714fd(bArr);
            }
            dVar.f405142d = hVar3;
        }
        return 0;
    }
}

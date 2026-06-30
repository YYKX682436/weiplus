package m53;

/* loaded from: classes7.dex */
public class f extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f405197d;

    /* renamed from: e, reason: collision with root package name */
    public m53.h f405198e;

    /* renamed from: f, reason: collision with root package name */
    public m53.d f405199f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f405200g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.f)) {
            return false;
        }
        m53.f fVar2 = (m53.f) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f405197d), java.lang.Integer.valueOf(fVar2.f405197d)) && n51.f.a(this.f405198e, fVar2.f405198e) && n51.f.a(this.f405199f, fVar2.f405199f) && n51.f.a(this.f405200g, fVar2.f405200g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f405197d);
            m53.h hVar = this.f405198e;
            if (hVar != null) {
                fVar.i(2, hVar.mo75928xcd1e8d8());
                this.f405198e.mo75956x3d5d1f78(fVar);
            }
            m53.d dVar = this.f405199f;
            if (dVar != null) {
                fVar.i(3, dVar.mo75928xcd1e8d8());
                this.f405199f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f405200g;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f405197d) + 0;
            m53.h hVar2 = this.f405198e;
            if (hVar2 != null) {
                e17 += b36.f.i(2, hVar2.mo75928xcd1e8d8());
            }
            m53.d dVar2 = this.f405199f;
            if (dVar2 != null) {
                e17 += b36.f.i(3, dVar2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f405200g;
            return str2 != null ? e17 + b36.f.j(4, str2) : e17;
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
        m53.f fVar2 = (m53.f) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fVar2.f405197d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                m53.h hVar3 = new m53.h();
                if (bArr != null && bArr.length > 0) {
                    hVar3.mo11468x92b714fd(bArr);
                }
                fVar2.f405198e = hVar3;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            fVar2.f405200g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            m53.d dVar3 = new m53.d();
            if (bArr2 != null && bArr2.length > 0) {
                dVar3.mo11468x92b714fd(bArr2);
            }
            fVar2.f405199f = dVar3;
        }
        return 0;
    }
}

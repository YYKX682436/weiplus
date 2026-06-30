package d02;

/* loaded from: classes2.dex */
public class g extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public d02.c f306846d;

    /* renamed from: e, reason: collision with root package name */
    public d02.j f306847e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f306848f;

    /* renamed from: g, reason: collision with root package name */
    public int f306849g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f306850h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof d02.g)) {
            return false;
        }
        d02.g gVar = (d02.g) fVar;
        return n51.f.a(this.f306846d, gVar.f306846d) && n51.f.a(this.f306847e, gVar.f306847e) && n51.f.a(java.lang.Boolean.valueOf(this.f306848f), java.lang.Boolean.valueOf(gVar.f306848f)) && n51.f.a(java.lang.Integer.valueOf(this.f306849g), java.lang.Integer.valueOf(gVar.f306849g)) && n51.f.a(java.lang.Boolean.valueOf(this.f306850h), java.lang.Boolean.valueOf(gVar.f306850h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            d02.c cVar = this.f306846d;
            if (cVar != null) {
                fVar.i(1, cVar.mo75928xcd1e8d8());
                this.f306846d.mo75956x3d5d1f78(fVar);
            }
            d02.j jVar = this.f306847e;
            if (jVar != null) {
                fVar.i(2, jVar.mo75928xcd1e8d8());
                this.f306847e.mo75956x3d5d1f78(fVar);
            }
            fVar.a(3, this.f306848f);
            fVar.e(4, this.f306849g);
            fVar.a(5, this.f306850h);
            return 0;
        }
        if (i17 == 1) {
            d02.c cVar2 = this.f306846d;
            int i18 = cVar2 != null ? 0 + b36.f.i(1, cVar2.mo75928xcd1e8d8()) : 0;
            d02.j jVar2 = this.f306847e;
            if (jVar2 != null) {
                i18 += b36.f.i(2, jVar2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.a(3, this.f306848f) + b36.f.e(4, this.f306849g) + b36.f.a(5, this.f306850h);
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
        d02.g gVar = (d02.g) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                d02.c cVar3 = new d02.c();
                if (bArr != null && bArr.length > 0) {
                    cVar3.mo11468x92b714fd(bArr);
                }
                gVar.f306846d = cVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                gVar.f306848f = aVar2.c(intValue);
                return 0;
            }
            if (intValue == 4) {
                gVar.f306849g = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            gVar.f306850h = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            d02.j jVar3 = new d02.j();
            if (bArr2 != null && bArr2.length > 0) {
                jVar3.mo11468x92b714fd(bArr2);
            }
            gVar.f306847e = jVar3;
        }
        return 0;
    }
}

package p45;

/* loaded from: classes15.dex */
public class h extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f433451d;

    /* renamed from: e, reason: collision with root package name */
    public int f433452e;

    /* renamed from: f, reason: collision with root package name */
    public int f433453f;

    /* renamed from: g, reason: collision with root package name */
    public p45.o f433454g;

    /* renamed from: h, reason: collision with root package name */
    public p45.o f433455h;

    /* renamed from: i, reason: collision with root package name */
    public int f433456i;

    /* renamed from: m, reason: collision with root package name */
    public int f433457m;

    /* renamed from: n, reason: collision with root package name */
    public int f433458n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof p45.h)) {
            return false;
        }
        p45.h hVar = (p45.h) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f433451d), java.lang.Integer.valueOf(hVar.f433451d)) && n51.f.a(java.lang.Integer.valueOf(this.f433452e), java.lang.Integer.valueOf(hVar.f433452e)) && n51.f.a(java.lang.Integer.valueOf(this.f433453f), java.lang.Integer.valueOf(hVar.f433453f)) && n51.f.a(this.f433454g, hVar.f433454g) && n51.f.a(this.f433455h, hVar.f433455h) && n51.f.a(java.lang.Integer.valueOf(this.f433456i), java.lang.Integer.valueOf(hVar.f433456i)) && n51.f.a(java.lang.Integer.valueOf(this.f433457m), java.lang.Integer.valueOf(hVar.f433457m)) && n51.f.a(java.lang.Integer.valueOf(this.f433458n), java.lang.Integer.valueOf(hVar.f433458n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f433451d);
            fVar.e(2, this.f433452e);
            fVar.e(3, this.f433453f);
            p45.o oVar = this.f433454g;
            if (oVar != null) {
                fVar.i(4, oVar.mo75928xcd1e8d8());
                this.f433454g.mo75956x3d5d1f78(fVar);
            }
            p45.o oVar2 = this.f433455h;
            if (oVar2 != null) {
                fVar.i(5, oVar2.mo75928xcd1e8d8());
                this.f433455h.mo75956x3d5d1f78(fVar);
            }
            fVar.e(6, this.f433456i);
            fVar.e(7, this.f433457m);
            fVar.e(8, this.f433458n);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f433451d) + 0 + b36.f.e(2, this.f433452e) + b36.f.e(3, this.f433453f);
            p45.o oVar3 = this.f433454g;
            if (oVar3 != null) {
                e17 += b36.f.i(4, oVar3.mo75928xcd1e8d8());
            }
            p45.o oVar4 = this.f433455h;
            if (oVar4 != null) {
                e17 += b36.f.i(5, oVar4.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(6, this.f433456i) + b36.f.e(7, this.f433457m) + b36.f.e(8, this.f433458n);
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
        p45.h hVar = (p45.h) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                hVar.f433451d = aVar2.g(intValue);
                return 0;
            case 2:
                hVar.f433452e = aVar2.g(intValue);
                return 0;
            case 3:
                hVar.f433453f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    p45.o oVar5 = new p45.o();
                    if (bArr != null && bArr.length > 0) {
                        oVar5.mo11468x92b714fd(bArr);
                    }
                    hVar.f433454g = oVar5;
                }
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    p45.o oVar6 = new p45.o();
                    if (bArr2 != null && bArr2.length > 0) {
                        oVar6.mo11468x92b714fd(bArr2);
                    }
                    hVar.f433455h = oVar6;
                }
                return 0;
            case 6:
                hVar.f433456i = aVar2.g(intValue);
                return 0;
            case 7:
                hVar.f433457m = aVar2.g(intValue);
                return 0;
            case 8:
                hVar.f433458n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

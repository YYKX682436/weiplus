package p45;

/* loaded from: classes15.dex */
public class j extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f433464d;

    /* renamed from: e, reason: collision with root package name */
    public int f433465e;

    /* renamed from: f, reason: collision with root package name */
    public int f433466f;

    /* renamed from: g, reason: collision with root package name */
    public int f433467g;

    /* renamed from: h, reason: collision with root package name */
    public p45.o f433468h;

    /* renamed from: i, reason: collision with root package name */
    public p45.o f433469i;

    /* renamed from: m, reason: collision with root package name */
    public p45.o f433470m;

    /* renamed from: n, reason: collision with root package name */
    public int f433471n;

    /* renamed from: o, reason: collision with root package name */
    public int f433472o;

    /* renamed from: p, reason: collision with root package name */
    public int f433473p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof p45.j)) {
            return false;
        }
        p45.j jVar = (p45.j) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f433464d), java.lang.Integer.valueOf(jVar.f433464d)) && n51.f.a(java.lang.Integer.valueOf(this.f433465e), java.lang.Integer.valueOf(jVar.f433465e)) && n51.f.a(java.lang.Integer.valueOf(this.f433466f), java.lang.Integer.valueOf(jVar.f433466f)) && n51.f.a(java.lang.Integer.valueOf(this.f433467g), java.lang.Integer.valueOf(jVar.f433467g)) && n51.f.a(this.f433468h, jVar.f433468h) && n51.f.a(this.f433469i, jVar.f433469i) && n51.f.a(this.f433470m, jVar.f433470m) && n51.f.a(java.lang.Integer.valueOf(this.f433471n), java.lang.Integer.valueOf(jVar.f433471n)) && n51.f.a(java.lang.Integer.valueOf(this.f433472o), java.lang.Integer.valueOf(jVar.f433472o)) && n51.f.a(java.lang.Integer.valueOf(this.f433473p), java.lang.Integer.valueOf(jVar.f433473p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f433464d);
            fVar.e(2, this.f433465e);
            fVar.e(3, this.f433466f);
            fVar.e(4, this.f433467g);
            p45.o oVar = this.f433468h;
            if (oVar != null) {
                fVar.i(5, oVar.mo75928xcd1e8d8());
                this.f433468h.mo75956x3d5d1f78(fVar);
            }
            p45.o oVar2 = this.f433469i;
            if (oVar2 != null) {
                fVar.i(6, oVar2.mo75928xcd1e8d8());
                this.f433469i.mo75956x3d5d1f78(fVar);
            }
            p45.o oVar3 = this.f433470m;
            if (oVar3 != null) {
                fVar.i(7, oVar3.mo75928xcd1e8d8());
                this.f433470m.mo75956x3d5d1f78(fVar);
            }
            fVar.e(8, this.f433471n);
            fVar.e(9, this.f433472o);
            fVar.e(10, this.f433473p);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f433464d) + 0 + b36.f.e(2, this.f433465e) + b36.f.e(3, this.f433466f) + b36.f.e(4, this.f433467g);
            p45.o oVar4 = this.f433468h;
            if (oVar4 != null) {
                e17 += b36.f.i(5, oVar4.mo75928xcd1e8d8());
            }
            p45.o oVar5 = this.f433469i;
            if (oVar5 != null) {
                e17 += b36.f.i(6, oVar5.mo75928xcd1e8d8());
            }
            p45.o oVar6 = this.f433470m;
            if (oVar6 != null) {
                e17 += b36.f.i(7, oVar6.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(8, this.f433471n) + b36.f.e(9, this.f433472o) + b36.f.e(10, this.f433473p);
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
        p45.j jVar = (p45.j) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                jVar.f433464d = aVar2.g(intValue);
                return 0;
            case 2:
                jVar.f433465e = aVar2.g(intValue);
                return 0;
            case 3:
                jVar.f433466f = aVar2.g(intValue);
                return 0;
            case 4:
                jVar.f433467g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    p45.o oVar7 = new p45.o();
                    if (bArr != null && bArr.length > 0) {
                        oVar7.mo11468x92b714fd(bArr);
                    }
                    jVar.f433468h = oVar7;
                }
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    p45.o oVar8 = new p45.o();
                    if (bArr2 != null && bArr2.length > 0) {
                        oVar8.mo11468x92b714fd(bArr2);
                    }
                    jVar.f433469i = oVar8;
                }
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    p45.o oVar9 = new p45.o();
                    if (bArr3 != null && bArr3.length > 0) {
                        oVar9.mo11468x92b714fd(bArr3);
                    }
                    jVar.f433470m = oVar9;
                }
                return 0;
            case 8:
                jVar.f433471n = aVar2.g(intValue);
                return 0;
            case 9:
                jVar.f433472o = aVar2.g(intValue);
                return 0;
            case 10:
                jVar.f433473p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

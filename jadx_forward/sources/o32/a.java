package o32;

/* loaded from: classes14.dex */
public class a extends o32.i {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f424215e;

    /* renamed from: f, reason: collision with root package name */
    public int f424216f;

    /* renamed from: g, reason: collision with root package name */
    public int f424217g;

    /* renamed from: h, reason: collision with root package name */
    public int f424218h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f424219i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f424220m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f424221n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f424222o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f424223p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof o32.a)) {
            return false;
        }
        o32.a aVar = (o32.a) fVar;
        return n51.f.a(this.f424246d, aVar.f424246d) && n51.f.a(this.f424215e, aVar.f424215e) && n51.f.a(java.lang.Integer.valueOf(this.f424216f), java.lang.Integer.valueOf(aVar.f424216f)) && n51.f.a(java.lang.Integer.valueOf(this.f424217g), java.lang.Integer.valueOf(aVar.f424217g)) && n51.f.a(java.lang.Integer.valueOf(this.f424218h), java.lang.Integer.valueOf(aVar.f424218h)) && n51.f.a(this.f424219i, aVar.f424219i) && n51.f.a(this.f424220m, aVar.f424220m) && n51.f.a(this.f424221n, aVar.f424221n) && n51.f.a(this.f424222o, aVar.f424222o) && n51.f.a(this.f424223p, aVar.f424223p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            o32.d dVar = this.f424246d;
            if (dVar != null) {
                fVar.i(1, dVar.mo75928xcd1e8d8());
                this.f424246d.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f424215e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f424216f);
            fVar.e(4, this.f424217g);
            fVar.e(5, this.f424218h);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f424219i;
            if (gVar2 != null) {
                fVar.b(6, gVar2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f424220m;
            if (gVar3 != null) {
                fVar.b(7, gVar3);
            }
            java.lang.String str = this.f424221n;
            if (str != null) {
                fVar.j(10, str);
            }
            java.lang.String str2 = this.f424222o;
            if (str2 != null) {
                fVar.j(11, str2);
            }
            java.lang.String str3 = this.f424223p;
            if (str3 != null) {
                fVar.j(12, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            o32.d dVar2 = this.f424246d;
            int i18 = dVar2 != null ? 0 + b36.f.i(1, dVar2.mo75928xcd1e8d8()) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f424215e;
            if (gVar4 != null) {
                i18 += b36.f.b(2, gVar4);
            }
            int e17 = i18 + b36.f.e(3, this.f424216f) + b36.f.e(4, this.f424217g) + b36.f.e(5, this.f424218h);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f424219i;
            if (gVar5 != null) {
                e17 += b36.f.b(6, gVar5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f424220m;
            if (gVar6 != null) {
                e17 += b36.f.b(7, gVar6);
            }
            java.lang.String str4 = this.f424221n;
            if (str4 != null) {
                e17 += b36.f.j(10, str4);
            }
            java.lang.String str5 = this.f424222o;
            if (str5 != null) {
                e17 += b36.f.j(11, str5);
            }
            java.lang.String str6 = this.f424223p;
            return str6 != null ? e17 + b36.f.j(12, str6) : e17;
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
        o32.a aVar3 = (o32.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    o32.d dVar3 = new o32.d();
                    if (bArr != null && bArr.length > 0) {
                        dVar3.mo11468x92b714fd(bArr);
                    }
                    aVar3.f424246d = dVar3;
                }
                return 0;
            case 2:
                aVar3.f424215e = aVar2.d(intValue);
                return 0;
            case 3:
                aVar3.f424216f = aVar2.g(intValue);
                return 0;
            case 4:
                aVar3.f424217g = aVar2.g(intValue);
                return 0;
            case 5:
                aVar3.f424218h = aVar2.g(intValue);
                return 0;
            case 6:
                aVar3.f424219i = aVar2.d(intValue);
                return 0;
            case 7:
                aVar3.f424220m = aVar2.d(intValue);
                return 0;
            case 8:
            case 9:
            default:
                return -1;
            case 10:
                aVar3.f424221n = aVar2.k(intValue);
                return 0;
            case 11:
                aVar3.f424222o = aVar2.k(intValue);
                return 0;
            case 12:
                aVar3.f424223p = aVar2.k(intValue);
                return 0;
        }
    }
}

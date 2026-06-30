package a36;

/* loaded from: classes9.dex */
public class e extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f82660d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f82661e;

    /* renamed from: f, reason: collision with root package name */
    public int f82662f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f82663g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f82664h;

    /* renamed from: i, reason: collision with root package name */
    public a36.g f82665i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof a36.e)) {
            return false;
        }
        a36.e eVar = (a36.e) fVar;
        return n51.f.a(this.f82660d, eVar.f82660d) && n51.f.a(this.f82661e, eVar.f82661e) && n51.f.a(java.lang.Integer.valueOf(this.f82662f), java.lang.Integer.valueOf(eVar.f82662f)) && n51.f.a(this.f82663g, eVar.f82663g) && n51.f.a(this.f82664h, eVar.f82664h) && n51.f.a(this.f82665i, eVar.f82665i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f82660d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f82661e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f82662f);
            java.lang.String str3 = this.f82663g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f82664h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            a36.g gVar = this.f82665i;
            if (gVar != null) {
                fVar.i(6, gVar.mo75928xcd1e8d8());
                this.f82665i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f82660d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f82661e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f82662f);
            java.lang.String str7 = this.f82663g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f82664h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            a36.g gVar2 = this.f82665i;
            return gVar2 != null ? e17 + b36.f.i(6, gVar2.mo75928xcd1e8d8()) : e17;
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
        a36.e eVar = (a36.e) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                eVar.f82660d = aVar2.k(intValue);
                return 0;
            case 2:
                eVar.f82661e = aVar2.k(intValue);
                return 0;
            case 3:
                eVar.f82662f = aVar2.g(intValue);
                return 0;
            case 4:
                eVar.f82663g = aVar2.k(intValue);
                return 0;
            case 5:
                eVar.f82664h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    a36.g gVar3 = new a36.g();
                    if (bArr != null && bArr.length > 0) {
                        gVar3.mo11468x92b714fd(bArr);
                    }
                    eVar.f82665i = gVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

package a36;

/* loaded from: classes9.dex */
public class a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f82624d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f82625e;

    /* renamed from: f, reason: collision with root package name */
    public int f82626f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f82627g;

    /* renamed from: h, reason: collision with root package name */
    public a36.g f82628h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f82629i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof a36.a)) {
            return false;
        }
        a36.a aVar = (a36.a) fVar;
        return n51.f.a(this.f82624d, aVar.f82624d) && n51.f.a(this.f82625e, aVar.f82625e) && n51.f.a(java.lang.Integer.valueOf(this.f82626f), java.lang.Integer.valueOf(aVar.f82626f)) && n51.f.a(this.f82627g, aVar.f82627g) && n51.f.a(this.f82628h, aVar.f82628h) && n51.f.a(this.f82629i, aVar.f82629i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f82624d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f82625e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f82626f);
            java.lang.String str3 = this.f82627g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            a36.g gVar = this.f82628h;
            if (gVar != null) {
                fVar.i(5, gVar.mo75928xcd1e8d8());
                this.f82628h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f82629i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f82624d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f82625e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f82626f);
            java.lang.String str7 = this.f82627g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            a36.g gVar2 = this.f82628h;
            if (gVar2 != null) {
                e17 += b36.f.i(5, gVar2.mo75928xcd1e8d8());
            }
            java.lang.String str8 = this.f82629i;
            return str8 != null ? e17 + b36.f.j(6, str8) : e17;
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
        a36.a aVar3 = (a36.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                aVar3.f82624d = aVar2.k(intValue);
                return 0;
            case 2:
                aVar3.f82625e = aVar2.k(intValue);
                return 0;
            case 3:
                aVar3.f82626f = aVar2.g(intValue);
                return 0;
            case 4:
                aVar3.f82627g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    a36.g gVar3 = new a36.g();
                    if (bArr != null && bArr.length > 0) {
                        gVar3.mo11468x92b714fd(bArr);
                    }
                    aVar3.f82628h = gVar3;
                }
                return 0;
            case 6:
                aVar3.f82629i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

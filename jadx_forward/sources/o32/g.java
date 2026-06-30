package o32;

/* loaded from: classes9.dex */
public class g extends o32.j {

    /* renamed from: e, reason: collision with root package name */
    public int f424231e;

    /* renamed from: f, reason: collision with root package name */
    public int f424232f;

    /* renamed from: g, reason: collision with root package name */
    public int f424233g;

    /* renamed from: h, reason: collision with root package name */
    public int f424234h;

    /* renamed from: i, reason: collision with root package name */
    public int f424235i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f424236m;

    /* renamed from: n, reason: collision with root package name */
    public int f424237n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f424238o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f424239p;

    /* renamed from: q, reason: collision with root package name */
    public int f424240q;

    /* renamed from: r, reason: collision with root package name */
    public int f424241r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f424242s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof o32.g)) {
            return false;
        }
        o32.g gVar = (o32.g) fVar;
        return n51.f.a(this.f424247d, gVar.f424247d) && n51.f.a(java.lang.Integer.valueOf(this.f424231e), java.lang.Integer.valueOf(gVar.f424231e)) && n51.f.a(java.lang.Integer.valueOf(this.f424232f), java.lang.Integer.valueOf(gVar.f424232f)) && n51.f.a(java.lang.Integer.valueOf(this.f424233g), java.lang.Integer.valueOf(gVar.f424233g)) && n51.f.a(java.lang.Integer.valueOf(this.f424234h), java.lang.Integer.valueOf(gVar.f424234h)) && n51.f.a(java.lang.Integer.valueOf(this.f424235i), java.lang.Integer.valueOf(gVar.f424235i)) && n51.f.a(this.f424236m, gVar.f424236m) && n51.f.a(java.lang.Integer.valueOf(this.f424237n), java.lang.Integer.valueOf(gVar.f424237n)) && n51.f.a(this.f424238o, gVar.f424238o) && n51.f.a(this.f424239p, gVar.f424239p) && n51.f.a(java.lang.Integer.valueOf(this.f424240q), java.lang.Integer.valueOf(gVar.f424240q)) && n51.f.a(java.lang.Integer.valueOf(this.f424241r), java.lang.Integer.valueOf(gVar.f424241r)) && n51.f.a(this.f424242s, gVar.f424242s);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            o32.e eVar = this.f424247d;
            if (eVar != null) {
                fVar.i(1, eVar.mo75928xcd1e8d8());
                this.f424247d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f424231e);
            fVar.e(3, this.f424232f);
            fVar.e(4, this.f424233g);
            fVar.e(5, this.f424234h);
            fVar.e(6, this.f424235i);
            java.lang.String str = this.f424236m;
            if (str != null) {
                fVar.j(11, str);
            }
            fVar.e(12, this.f424237n);
            java.lang.String str2 = this.f424238o;
            if (str2 != null) {
                fVar.j(13, str2);
            }
            java.lang.String str3 = this.f424239p;
            if (str3 != null) {
                fVar.j(14, str3);
            }
            fVar.e(15, this.f424240q);
            fVar.e(16, this.f424241r);
            java.lang.String str4 = this.f424242s;
            if (str4 == null) {
                return 0;
            }
            fVar.j(17, str4);
            return 0;
        }
        if (i17 == 1) {
            o32.e eVar2 = this.f424247d;
            int i18 = (eVar2 != null ? 0 + b36.f.i(1, eVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f424231e) + b36.f.e(3, this.f424232f) + b36.f.e(4, this.f424233g) + b36.f.e(5, this.f424234h) + b36.f.e(6, this.f424235i);
            java.lang.String str5 = this.f424236m;
            if (str5 != null) {
                i18 += b36.f.j(11, str5);
            }
            int e17 = i18 + b36.f.e(12, this.f424237n);
            java.lang.String str6 = this.f424238o;
            if (str6 != null) {
                e17 += b36.f.j(13, str6);
            }
            java.lang.String str7 = this.f424239p;
            if (str7 != null) {
                e17 += b36.f.j(14, str7);
            }
            int e18 = e17 + b36.f.e(15, this.f424240q) + b36.f.e(16, this.f424241r);
            java.lang.String str8 = this.f424242s;
            return str8 != null ? e18 + b36.f.j(17, str8) : e18;
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
        o32.g gVar = (o32.g) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    o32.e eVar3 = new o32.e();
                    if (bArr != null && bArr.length > 0) {
                        eVar3.mo11468x92b714fd(bArr);
                    }
                    gVar.f424247d = eVar3;
                }
                return 0;
            case 2:
                gVar.f424231e = aVar2.g(intValue);
                return 0;
            case 3:
                gVar.f424232f = aVar2.g(intValue);
                return 0;
            case 4:
                gVar.f424233g = aVar2.g(intValue);
                return 0;
            case 5:
                gVar.f424234h = aVar2.g(intValue);
                return 0;
            case 6:
                gVar.f424235i = aVar2.g(intValue);
                return 0;
            case 7:
            case 8:
            case 9:
            case 10:
            default:
                return -1;
            case 11:
                gVar.f424236m = aVar2.k(intValue);
                return 0;
            case 12:
                gVar.f424237n = aVar2.g(intValue);
                return 0;
            case 13:
                gVar.f424238o = aVar2.k(intValue);
                return 0;
            case 14:
                gVar.f424239p = aVar2.k(intValue);
                return 0;
            case 15:
                gVar.f424240q = aVar2.g(intValue);
                return 0;
            case 16:
                gVar.f424241r = aVar2.g(intValue);
                return 0;
            case 17:
                gVar.f424242s = aVar2.k(intValue);
                return 0;
        }
    }
}

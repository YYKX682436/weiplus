package r45;

/* loaded from: classes9.dex */
public class ep extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f455162d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455163e;

    /* renamed from: f, reason: collision with root package name */
    public long f455164f;

    /* renamed from: g, reason: collision with root package name */
    public a36.c f455165g;

    /* renamed from: h, reason: collision with root package name */
    public long f455166h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f455167i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public int f455168m;

    /* renamed from: n, reason: collision with root package name */
    public int f455169n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f455170o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f455171p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f455172q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f455173r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ep)) {
            return false;
        }
        r45.ep epVar = (r45.ep) fVar;
        return n51.f.a(this.f76492x92037252, epVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f455162d), java.lang.Integer.valueOf(epVar.f455162d)) && n51.f.a(this.f455163e, epVar.f455163e) && n51.f.a(java.lang.Long.valueOf(this.f455164f), java.lang.Long.valueOf(epVar.f455164f)) && n51.f.a(this.f455165g, epVar.f455165g) && n51.f.a(java.lang.Long.valueOf(this.f455166h), java.lang.Long.valueOf(epVar.f455166h)) && n51.f.a(this.f455167i, epVar.f455167i) && n51.f.a(java.lang.Integer.valueOf(this.f455168m), java.lang.Integer.valueOf(epVar.f455168m)) && n51.f.a(java.lang.Integer.valueOf(this.f455169n), java.lang.Integer.valueOf(epVar.f455169n)) && n51.f.a(this.f455170o, epVar.f455170o) && n51.f.a(this.f455171p, epVar.f455171p) && n51.f.a(this.f455172q, epVar.f455172q) && n51.f.a(java.lang.Boolean.valueOf(this.f455173r), java.lang.Boolean.valueOf(epVar.f455173r));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f455162d);
            java.lang.String str = this.f455163e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f455164f);
            a36.c cVar = this.f455165g;
            if (cVar != null) {
                fVar.i(5, cVar.mo75928xcd1e8d8());
                this.f455165g.mo75956x3d5d1f78(fVar);
            }
            fVar.h(6, this.f455166h);
            fVar.g(7, 1, this.f455167i);
            fVar.e(8, this.f455168m);
            fVar.e(9, this.f455169n);
            java.lang.String str2 = this.f455170o;
            if (str2 != null) {
                fVar.j(10, str2);
            }
            java.lang.String str3 = this.f455171p;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            java.lang.String str4 = this.f455172q;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            fVar.a(13, this.f455173r);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f455162d);
            java.lang.String str5 = this.f455163e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int h17 = i18 + b36.f.h(4, this.f455164f);
            a36.c cVar2 = this.f455165g;
            if (cVar2 != null) {
                h17 += b36.f.i(5, cVar2.mo75928xcd1e8d8());
            }
            int h18 = h17 + b36.f.h(6, this.f455166h) + b36.f.g(7, 1, this.f455167i) + b36.f.e(8, this.f455168m) + b36.f.e(9, this.f455169n);
            java.lang.String str6 = this.f455170o;
            if (str6 != null) {
                h18 += b36.f.j(10, str6);
            }
            java.lang.String str7 = this.f455171p;
            if (str7 != null) {
                h18 += b36.f.j(11, str7);
            }
            java.lang.String str8 = this.f455172q;
            if (str8 != null) {
                h18 += b36.f.j(12, str8);
            }
            return h18 + b36.f.a(13, this.f455173r);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f455167i.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.ep epVar = (r45.ep) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    epVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                epVar.f455162d = aVar2.g(intValue);
                return 0;
            case 3:
                epVar.f455163e = aVar2.k(intValue);
                return 0;
            case 4:
                epVar.f455164f = aVar2.i(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    a36.c cVar3 = new a36.c();
                    if (bArr3 != null && bArr3.length > 0) {
                        cVar3.mo11468x92b714fd(bArr3);
                    }
                    epVar.f455165g = cVar3;
                }
                return 0;
            case 6:
                epVar.f455166h = aVar2.i(intValue);
                return 0;
            case 7:
                epVar.f455167i.add(aVar2.k(intValue));
                return 0;
            case 8:
                epVar.f455168m = aVar2.g(intValue);
                return 0;
            case 9:
                epVar.f455169n = aVar2.g(intValue);
                return 0;
            case 10:
                epVar.f455170o = aVar2.k(intValue);
                return 0;
            case 11:
                epVar.f455171p = aVar2.k(intValue);
                return 0;
            case 12:
                epVar.f455172q = aVar2.k(intValue);
                return 0;
            case 13:
                epVar.f455173r = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

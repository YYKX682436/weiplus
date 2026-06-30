package r45;

/* loaded from: classes9.dex */
public class hs extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f457936d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f457937e;

    /* renamed from: f, reason: collision with root package name */
    public a36.c f457938f;

    /* renamed from: g, reason: collision with root package name */
    public long f457939g;

    /* renamed from: h, reason: collision with root package name */
    public int f457940h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f457941i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public int f457942m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f457943n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f457944o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f457945p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f457946q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hs)) {
            return false;
        }
        r45.hs hsVar = (r45.hs) fVar;
        return n51.f.a(this.f76492x92037252, hsVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f457936d), java.lang.Integer.valueOf(hsVar.f457936d)) && n51.f.a(this.f457937e, hsVar.f457937e) && n51.f.a(this.f457938f, hsVar.f457938f) && n51.f.a(java.lang.Long.valueOf(this.f457939g), java.lang.Long.valueOf(hsVar.f457939g)) && n51.f.a(java.lang.Integer.valueOf(this.f457940h), java.lang.Integer.valueOf(hsVar.f457940h)) && n51.f.a(this.f457941i, hsVar.f457941i) && n51.f.a(java.lang.Integer.valueOf(this.f457942m), java.lang.Integer.valueOf(hsVar.f457942m)) && n51.f.a(this.f457943n, hsVar.f457943n) && n51.f.a(this.f457944o, hsVar.f457944o) && n51.f.a(this.f457945p, hsVar.f457945p) && n51.f.a(this.f457946q, hsVar.f457946q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f457941i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f457936d);
            java.lang.String str = this.f457937e;
            if (str != null) {
                fVar.j(3, str);
            }
            a36.c cVar = this.f457938f;
            if (cVar != null) {
                fVar.i(4, cVar.mo75928xcd1e8d8());
                this.f457938f.mo75956x3d5d1f78(fVar);
            }
            fVar.h(5, this.f457939g);
            fVar.e(6, this.f457940h);
            fVar.g(7, 1, linkedList);
            fVar.e(8, this.f457942m);
            java.lang.String str2 = this.f457943n;
            if (str2 != null) {
                fVar.j(9, str2);
            }
            java.lang.String str3 = this.f457944o;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            java.lang.String str4 = this.f457945p;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            java.lang.String str5 = this.f457946q;
            if (str5 == null) {
                return 0;
            }
            fVar.j(12, str5);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f457936d);
            java.lang.String str6 = this.f457937e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            a36.c cVar2 = this.f457938f;
            if (cVar2 != null) {
                i18 += b36.f.i(4, cVar2.mo75928xcd1e8d8());
            }
            int h17 = i18 + b36.f.h(5, this.f457939g) + b36.f.e(6, this.f457940h) + b36.f.g(7, 1, linkedList) + b36.f.e(8, this.f457942m);
            java.lang.String str7 = this.f457943n;
            if (str7 != null) {
                h17 += b36.f.j(9, str7);
            }
            java.lang.String str8 = this.f457944o;
            if (str8 != null) {
                h17 += b36.f.j(10, str8);
            }
            java.lang.String str9 = this.f457945p;
            if (str9 != null) {
                h17 += b36.f.j(11, str9);
            }
            java.lang.String str10 = this.f457946q;
            return str10 != null ? h17 + b36.f.j(12, str10) : h17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.hs hsVar = (r45.hs) objArr[1];
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
                    hsVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                hsVar.f457936d = aVar2.g(intValue);
                return 0;
            case 3:
                hsVar.f457937e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    a36.c cVar3 = new a36.c();
                    if (bArr3 != null && bArr3.length > 0) {
                        cVar3.mo11468x92b714fd(bArr3);
                    }
                    hsVar.f457938f = cVar3;
                }
                return 0;
            case 5:
                hsVar.f457939g = aVar2.i(intValue);
                return 0;
            case 6:
                hsVar.f457940h = aVar2.g(intValue);
                return 0;
            case 7:
                hsVar.f457941i.add(aVar2.k(intValue));
                return 0;
            case 8:
                hsVar.f457942m = aVar2.g(intValue);
                return 0;
            case 9:
                hsVar.f457943n = aVar2.k(intValue);
                return 0;
            case 10:
                hsVar.f457944o = aVar2.k(intValue);
                return 0;
            case 11:
                hsVar.f457945p = aVar2.k(intValue);
                return 0;
            case 12:
                hsVar.f457946q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

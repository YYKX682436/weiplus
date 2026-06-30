package bw5;

/* loaded from: classes2.dex */
public class si extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f114525d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f114526e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f114527f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f114528g;

    /* renamed from: h, reason: collision with root package name */
    public double f114529h;

    /* renamed from: n, reason: collision with root package name */
    public bw5.ri f114532n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f114533o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f114535q;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f114530i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f114531m = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f114534p = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f114536r = new boolean[12];

    static {
        new bw5.si();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.si mo11468x92b714fd(byte[] bArr) {
        return (bw5.si) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.si)) {
            return false;
        }
        bw5.si siVar = (bw5.si) fVar;
        return n51.f.a(this.f114525d, siVar.f114525d) && n51.f.a(this.f114526e, siVar.f114526e) && n51.f.a(this.f114527f, siVar.f114527f) && n51.f.a(this.f114528g, siVar.f114528g) && n51.f.a(java.lang.Double.valueOf(this.f114529h), java.lang.Double.valueOf(siVar.f114529h)) && n51.f.a(this.f114530i, siVar.f114530i) && n51.f.a(this.f114531m, siVar.f114531m) && n51.f.a(this.f114532n, siVar.f114532n) && n51.f.a(this.f114533o, siVar.f114533o) && n51.f.a(this.f114534p, siVar.f114534p) && n51.f.a(this.f114535q, siVar.f114535q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.si();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f114534p;
        java.util.LinkedList linkedList2 = this.f114531m;
        java.util.LinkedList linkedList3 = this.f114530i;
        boolean[] zArr = this.f114536r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f114525d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f114526e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f114527f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f114528g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            if (zArr[5]) {
                fVar.c(5, this.f114529h);
            }
            fVar.g(6, 1, linkedList3);
            fVar.g(7, 1, linkedList2);
            bw5.ri riVar = this.f114532n;
            if (riVar != null && zArr[8]) {
                fVar.i(8, riVar.mo75928xcd1e8d8());
                this.f114532n.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str5 = this.f114533o;
            if (str5 != null && zArr[9]) {
                fVar.j(9, str5);
            }
            fVar.g(10, 1, linkedList);
            java.lang.String str6 = this.f114535q;
            if (str6 == null || !zArr[11]) {
                return 0;
            }
            fVar.j(11, str6);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f114525d;
            int j17 = (str7 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str7);
            java.lang.String str8 = this.f114526e;
            if (str8 != null && zArr[2]) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f114527f;
            if (str9 != null && zArr[3]) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f114528g;
            if (str10 != null && zArr[4]) {
                j17 += b36.f.j(4, str10);
            }
            if (zArr[5]) {
                j17 += b36.f.c(5, this.f114529h);
            }
            int g17 = j17 + b36.f.g(6, 1, linkedList3) + b36.f.g(7, 1, linkedList2);
            bw5.ri riVar2 = this.f114532n;
            if (riVar2 != null && zArr[8]) {
                g17 += b36.f.i(8, riVar2.mo75928xcd1e8d8());
            }
            java.lang.String str11 = this.f114533o;
            if (str11 != null && zArr[9]) {
                g17 += b36.f.j(9, str11);
            }
            int g18 = g17 + b36.f.g(10, 1, linkedList);
            java.lang.String str12 = this.f114535q;
            return (str12 == null || !zArr[11]) ? g18 : g18 + b36.f.j(11, str12);
        }
        if (i17 == 2) {
            linkedList3.clear();
            linkedList2.clear();
            linkedList.clear();
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f114525d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f114526e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f114527f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f114528g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f114529h = aVar2.e(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                linkedList3.add(aVar2.k(intValue));
                zArr[6] = true;
                return 0;
            case 7:
                linkedList2.add(aVar2.k(intValue));
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.ri riVar3 = new bw5.ri();
                    if (bArr != null && bArr.length > 0) {
                        riVar3.mo11468x92b714fd(bArr);
                    }
                    this.f114532n = riVar3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f114533o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                linkedList.add(aVar2.k(intValue));
                zArr[10] = true;
                return 0;
            case 11:
                this.f114535q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}

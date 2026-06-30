package bw5;

/* loaded from: classes2.dex */
public class pl extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ol f113245d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f113246e;

    /* renamed from: f, reason: collision with root package name */
    public int f113247f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f113248g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f113249h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f113250i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f113251m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.fo f113252n;

    /* renamed from: p, reason: collision with root package name */
    public int f113254p;

    /* renamed from: q, reason: collision with root package name */
    public int f113255q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.ll f113256r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.zj f113257s;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f113253o = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f113258t = new boolean[14];

    static {
        new bw5.pl();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.pl mo11468x92b714fd(byte[] bArr) {
        return (bw5.pl) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pl)) {
            return false;
        }
        bw5.pl plVar = (bw5.pl) fVar;
        return n51.f.a(this.f113245d, plVar.f113245d) && n51.f.a(this.f113246e, plVar.f113246e) && n51.f.a(java.lang.Integer.valueOf(this.f113247f), java.lang.Integer.valueOf(plVar.f113247f)) && n51.f.a(this.f113248g, plVar.f113248g) && n51.f.a(this.f113249h, plVar.f113249h) && n51.f.a(this.f113250i, plVar.f113250i) && n51.f.a(this.f113251m, plVar.f113251m) && n51.f.a(this.f113252n, plVar.f113252n) && n51.f.a(this.f113253o, plVar.f113253o) && n51.f.a(java.lang.Integer.valueOf(this.f113254p), java.lang.Integer.valueOf(plVar.f113254p)) && n51.f.a(java.lang.Integer.valueOf(this.f113255q), java.lang.Integer.valueOf(plVar.f113255q)) && n51.f.a(this.f113256r, plVar.f113256r) && n51.f.a(this.f113257s, plVar.f113257s);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.pl();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f113253o;
        boolean[] zArr = this.f113258t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ol olVar = this.f113245d;
            if (olVar != null && zArr[1]) {
                fVar.e(1, olVar.f112681d);
            }
            java.lang.String str = this.f113246e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f113247f);
            }
            java.lang.String str2 = this.f113248g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f113249h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f113250i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f113251m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            bw5.fo foVar = this.f113252n;
            if (foVar != null && zArr[8]) {
                fVar.i(8, foVar.mo75928xcd1e8d8());
                this.f113252n.mo75956x3d5d1f78(fVar);
            }
            fVar.g(9, 8, linkedList);
            if (zArr[10]) {
                fVar.e(10, this.f113254p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f113255q);
            }
            bw5.ll llVar = this.f113256r;
            if (llVar != null && zArr[12]) {
                fVar.i(12, llVar.mo75928xcd1e8d8());
                this.f113256r.mo75956x3d5d1f78(fVar);
            }
            bw5.zj zjVar = this.f113257s;
            if (zjVar == null || !zArr[13]) {
                return 0;
            }
            fVar.i(13, zjVar.mo75928xcd1e8d8());
            this.f113257s.mo75956x3d5d1f78(fVar);
            return 0;
        }
        if (i17 == 1) {
            bw5.ol olVar2 = this.f113245d;
            int e17 = (olVar2 == null || !zArr[1]) ? 0 : 0 + b36.f.e(1, olVar2.f112681d);
            java.lang.String str6 = this.f113246e;
            if (str6 != null && zArr[2]) {
                e17 += b36.f.j(2, str6);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f113247f);
            }
            java.lang.String str7 = this.f113248g;
            if (str7 != null && zArr[4]) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f113249h;
            if (str8 != null && zArr[5]) {
                e17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f113250i;
            if (str9 != null && zArr[6]) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f113251m;
            if (str10 != null && zArr[7]) {
                e17 += b36.f.j(7, str10);
            }
            bw5.fo foVar2 = this.f113252n;
            if (foVar2 != null && zArr[8]) {
                e17 += b36.f.i(8, foVar2.mo75928xcd1e8d8());
            }
            int g17 = e17 + b36.f.g(9, 8, linkedList);
            if (zArr[10]) {
                g17 += b36.f.e(10, this.f113254p);
            }
            if (zArr[11]) {
                g17 += b36.f.e(11, this.f113255q);
            }
            bw5.ll llVar2 = this.f113256r;
            if (llVar2 != null && zArr[12]) {
                g17 += b36.f.i(12, llVar2.mo75928xcd1e8d8());
            }
            bw5.zj zjVar2 = this.f113257s;
            return (zjVar2 == null || !zArr[13]) ? g17 : g17 + b36.f.i(13, zjVar2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
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
                int g18 = aVar2.g(intValue);
                this.f113245d = g18 != 0 ? g18 != 1 ? g18 != 2 ? g18 != 3 ? g18 != 4 ? g18 != 5 ? null : bw5.ol.NET_5G : bw5.ol.NET_4G : bw5.ol.NET_3G : bw5.ol.NET_2G : bw5.ol.NET_WIFI : bw5.ol.NET_NULL;
                zArr[1] = true;
                return 0;
            case 2:
                this.f113246e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f113247f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f113248g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f113249h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f113250i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f113251m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.fo foVar3 = new bw5.fo();
                    if (bArr != null && bArr.length > 0) {
                        foVar3.mo11468x92b714fd(bArr);
                    }
                    this.f113252n = foVar3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.fo foVar4 = new bw5.fo();
                    if (bArr2 != null && bArr2.length > 0) {
                        foVar4.mo11468x92b714fd(bArr2);
                    }
                    linkedList.add(foVar4);
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f113254p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f113255q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.ll llVar3 = new bw5.ll();
                    if (bArr3 != null && bArr3.length > 0) {
                        llVar3.mo11468x92b714fd(bArr3);
                    }
                    this.f113256r = llVar3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.zj zjVar3 = new bw5.zj();
                    if (bArr4 != null && bArr4.length > 0) {
                        zjVar3.mo11468x92b714fd(bArr4);
                    }
                    this.f113257s = zjVar3;
                }
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }
}

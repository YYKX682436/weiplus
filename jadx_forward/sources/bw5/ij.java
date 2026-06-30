package bw5;

/* loaded from: classes2.dex */
public class ij extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f110135d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f110136e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f110138g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f110139h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f110140i;

    /* renamed from: m, reason: collision with root package name */
    public int f110141m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f110142n;

    /* renamed from: q, reason: collision with root package name */
    public int f110145q;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f110137f = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f110143o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f110144p = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f110146r = new boolean[12];

    static {
        new bw5.ij();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ij mo11468x92b714fd(byte[] bArr) {
        return (bw5.ij) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ij)) {
            return false;
        }
        bw5.ij ijVar = (bw5.ij) fVar;
        return n51.f.a(this.f110135d, ijVar.f110135d) && n51.f.a(this.f110136e, ijVar.f110136e) && n51.f.a(this.f110137f, ijVar.f110137f) && n51.f.a(this.f110138g, ijVar.f110138g) && n51.f.a(this.f110139h, ijVar.f110139h) && n51.f.a(this.f110140i, ijVar.f110140i) && n51.f.a(java.lang.Integer.valueOf(this.f110141m), java.lang.Integer.valueOf(ijVar.f110141m)) && n51.f.a(this.f110142n, ijVar.f110142n) && n51.f.a(this.f110143o, ijVar.f110143o) && n51.f.a(this.f110144p, ijVar.f110144p) && n51.f.a(java.lang.Integer.valueOf(this.f110145q), java.lang.Integer.valueOf(ijVar.f110145q));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ij();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f110144p;
        java.util.LinkedList linkedList2 = this.f110143o;
        java.util.LinkedList linkedList3 = this.f110137f;
        boolean[] zArr = this.f110146r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f110135d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f110136e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, linkedList3);
            java.lang.String str3 = this.f110138g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f110139h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f110140i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            if (zArr[7]) {
                fVar.e(7, this.f110141m);
            }
            java.lang.String str6 = this.f110142n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            fVar.g(9, 1, linkedList2);
            fVar.g(10, 8, linkedList);
            if (!zArr[11]) {
                return 0;
            }
            fVar.e(11, this.f110145q);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f110135d;
            int j17 = (str7 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str7);
            java.lang.String str8 = this.f110136e;
            if (str8 != null && zArr[2]) {
                j17 += b36.f.j(2, str8);
            }
            int g17 = j17 + b36.f.g(3, 8, linkedList3);
            java.lang.String str9 = this.f110138g;
            if (str9 != null && zArr[4]) {
                g17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f110139h;
            if (str10 != null && zArr[5]) {
                g17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f110140i;
            if (str11 != null && zArr[6]) {
                g17 += b36.f.j(6, str11);
            }
            if (zArr[7]) {
                g17 += b36.f.e(7, this.f110141m);
            }
            java.lang.String str12 = this.f110142n;
            if (str12 != null && zArr[8]) {
                g17 += b36.f.j(8, str12);
            }
            int g18 = g17 + b36.f.g(9, 1, linkedList2) + b36.f.g(10, 8, linkedList);
            return zArr[11] ? g18 + b36.f.e(11, this.f110145q) : g18;
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
                this.f110135d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f110136e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.gj gjVar = new bw5.gj();
                    if (bArr != null && bArr.length > 0) {
                        gjVar.mo11468x92b714fd(bArr);
                    }
                    linkedList3.add(gjVar);
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f110138g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f110139h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f110140i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f110141m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f110142n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                linkedList2.add(aVar2.k(intValue));
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    bw5.fj fjVar = new bw5.fj();
                    if (bArr2 != null && bArr2.length > 0) {
                        fjVar.mo11468x92b714fd(bArr2);
                    }
                    linkedList.add(fjVar);
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f110145q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}

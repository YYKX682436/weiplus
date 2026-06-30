package bw5;

/* loaded from: classes2.dex */
public class cc extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f107559d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f107560e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f107561f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f107563h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f107564i;

    /* renamed from: n, reason: collision with root package name */
    public int f107566n;

    /* renamed from: o, reason: collision with root package name */
    public int f107567o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f107568p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f107569q;

    /* renamed from: s, reason: collision with root package name */
    public long f107571s;

    /* renamed from: t, reason: collision with root package name */
    public int f107572t;

    /* renamed from: u, reason: collision with root package name */
    public int f107573u;

    /* renamed from: v, reason: collision with root package name */
    public int f107574v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f107575w;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f107562g = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f107565m = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f107570r = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final boolean[] f107576x = new boolean[19];

    static {
        new bw5.cc();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.cc mo11468x92b714fd(byte[] bArr) {
        return (bw5.cc) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.cc)) {
            return false;
        }
        bw5.cc ccVar = (bw5.cc) fVar;
        return n51.f.a(this.f107559d, ccVar.f107559d) && n51.f.a(this.f107560e, ccVar.f107560e) && n51.f.a(this.f107561f, ccVar.f107561f) && n51.f.a(this.f107562g, ccVar.f107562g) && n51.f.a(this.f107563h, ccVar.f107563h) && n51.f.a(this.f107564i, ccVar.f107564i) && n51.f.a(this.f107565m, ccVar.f107565m) && n51.f.a(java.lang.Integer.valueOf(this.f107566n), java.lang.Integer.valueOf(ccVar.f107566n)) && n51.f.a(java.lang.Integer.valueOf(this.f107567o), java.lang.Integer.valueOf(ccVar.f107567o)) && n51.f.a(this.f107568p, ccVar.f107568p) && n51.f.a(this.f107569q, ccVar.f107569q) && n51.f.a(this.f107570r, ccVar.f107570r) && n51.f.a(java.lang.Long.valueOf(this.f107571s), java.lang.Long.valueOf(ccVar.f107571s)) && n51.f.a(java.lang.Integer.valueOf(this.f107572t), java.lang.Integer.valueOf(ccVar.f107572t)) && n51.f.a(java.lang.Integer.valueOf(this.f107573u), java.lang.Integer.valueOf(ccVar.f107573u)) && n51.f.a(java.lang.Integer.valueOf(this.f107574v), java.lang.Integer.valueOf(ccVar.f107574v)) && n51.f.a(this.f107575w, ccVar.f107575w);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.cc();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f107570r;
        java.util.LinkedList linkedList2 = this.f107565m;
        java.util.LinkedList linkedList3 = this.f107562g;
        int i18 = 0;
        boolean[] zArr = this.f107576x;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f107559d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f107560e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f107561f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            fVar.g(4, 1, linkedList3);
            java.lang.String str4 = this.f107563h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f107564i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            fVar.g(7, 8, linkedList2);
            if (zArr[8]) {
                fVar.e(8, this.f107566n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f107567o);
            }
            java.lang.String str6 = this.f107568p;
            if (str6 != null && zArr[10]) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f107569q;
            if (str7 != null && zArr[11]) {
                fVar.j(11, str7);
            }
            fVar.g(12, 1, linkedList);
            if (zArr[13]) {
                fVar.h(13, this.f107571s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f107572t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f107573u);
            }
            if (zArr[16]) {
                fVar.e(16, this.f107574v);
            }
            java.lang.String str8 = this.f107575w;
            if (str8 != null && zArr[18]) {
                fVar.j(18, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f107559d;
            if (str9 != null && zArr[1]) {
                i18 = b36.f.j(1, str9) + 0;
            }
            java.lang.String str10 = this.f107560e;
            if (str10 != null && zArr[2]) {
                i18 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f107561f;
            if (str11 != null && zArr[3]) {
                i18 += b36.f.j(3, str11);
            }
            int g17 = i18 + b36.f.g(4, 1, linkedList3);
            java.lang.String str12 = this.f107563h;
            if (str12 != null && zArr[5]) {
                g17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f107564i;
            if (str13 != null && zArr[6]) {
                g17 += b36.f.j(6, str13);
            }
            int g18 = g17 + b36.f.g(7, 8, linkedList2);
            if (zArr[8]) {
                g18 += b36.f.e(8, this.f107566n);
            }
            if (zArr[9]) {
                g18 += b36.f.e(9, this.f107567o);
            }
            java.lang.String str14 = this.f107568p;
            if (str14 != null && zArr[10]) {
                g18 += b36.f.j(10, str14);
            }
            java.lang.String str15 = this.f107569q;
            if (str15 != null && zArr[11]) {
                g18 += b36.f.j(11, str15);
            }
            int g19 = g18 + b36.f.g(12, 1, linkedList);
            if (zArr[13]) {
                g19 += b36.f.h(13, this.f107571s);
            }
            if (zArr[14]) {
                g19 += b36.f.e(14, this.f107572t);
            }
            if (zArr[15]) {
                g19 += b36.f.e(15, this.f107573u);
            }
            if (zArr[16]) {
                g19 += b36.f.e(16, this.f107574v);
            }
            java.lang.String str16 = this.f107575w;
            return (str16 == null || !zArr[18]) ? g19 : g19 + b36.f.j(18, str16);
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
                this.f107559d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f107560e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f107561f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                linkedList3.add(aVar2.k(intValue));
                zArr[4] = true;
                return 0;
            case 5:
                this.f107563h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f107564i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.aw awVar = new bw5.aw();
                    if (bArr != null && bArr.length > 0) {
                        awVar.mo11468x92b714fd(bArr);
                    }
                    linkedList2.add(awVar);
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f107566n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f107567o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f107568p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f107569q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                linkedList.add(aVar2.k(intValue));
                zArr[12] = true;
                return 0;
            case 13:
                this.f107571s = aVar2.i(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f107572t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f107573u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f107574v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
            default:
                return -1;
            case 18:
                this.f107575w = aVar2.k(intValue);
                zArr[18] = true;
                return 0;
        }
    }
}

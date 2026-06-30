package bw5;

/* loaded from: classes2.dex */
public class cc extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f26026d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f26027e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f26028f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f26030h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f26031i;

    /* renamed from: n, reason: collision with root package name */
    public int f26033n;

    /* renamed from: o, reason: collision with root package name */
    public int f26034o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f26035p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f26036q;

    /* renamed from: s, reason: collision with root package name */
    public long f26038s;

    /* renamed from: t, reason: collision with root package name */
    public int f26039t;

    /* renamed from: u, reason: collision with root package name */
    public int f26040u;

    /* renamed from: v, reason: collision with root package name */
    public int f26041v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f26042w;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f26029g = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f26032m = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f26037r = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final boolean[] f26043x = new boolean[19];

    static {
        new bw5.cc();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.cc parseFrom(byte[] bArr) {
        return (bw5.cc) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.cc)) {
            return false;
        }
        bw5.cc ccVar = (bw5.cc) fVar;
        return n51.f.a(this.f26026d, ccVar.f26026d) && n51.f.a(this.f26027e, ccVar.f26027e) && n51.f.a(this.f26028f, ccVar.f26028f) && n51.f.a(this.f26029g, ccVar.f26029g) && n51.f.a(this.f26030h, ccVar.f26030h) && n51.f.a(this.f26031i, ccVar.f26031i) && n51.f.a(this.f26032m, ccVar.f26032m) && n51.f.a(java.lang.Integer.valueOf(this.f26033n), java.lang.Integer.valueOf(ccVar.f26033n)) && n51.f.a(java.lang.Integer.valueOf(this.f26034o), java.lang.Integer.valueOf(ccVar.f26034o)) && n51.f.a(this.f26035p, ccVar.f26035p) && n51.f.a(this.f26036q, ccVar.f26036q) && n51.f.a(this.f26037r, ccVar.f26037r) && n51.f.a(java.lang.Long.valueOf(this.f26038s), java.lang.Long.valueOf(ccVar.f26038s)) && n51.f.a(java.lang.Integer.valueOf(this.f26039t), java.lang.Integer.valueOf(ccVar.f26039t)) && n51.f.a(java.lang.Integer.valueOf(this.f26040u), java.lang.Integer.valueOf(ccVar.f26040u)) && n51.f.a(java.lang.Integer.valueOf(this.f26041v), java.lang.Integer.valueOf(ccVar.f26041v)) && n51.f.a(this.f26042w, ccVar.f26042w);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.cc();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f26037r;
        java.util.LinkedList linkedList2 = this.f26032m;
        java.util.LinkedList linkedList3 = this.f26029g;
        int i18 = 0;
        boolean[] zArr = this.f26043x;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f26026d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f26027e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f26028f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            fVar.g(4, 1, linkedList3);
            java.lang.String str4 = this.f26030h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f26031i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            fVar.g(7, 8, linkedList2);
            if (zArr[8]) {
                fVar.e(8, this.f26033n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f26034o);
            }
            java.lang.String str6 = this.f26035p;
            if (str6 != null && zArr[10]) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f26036q;
            if (str7 != null && zArr[11]) {
                fVar.j(11, str7);
            }
            fVar.g(12, 1, linkedList);
            if (zArr[13]) {
                fVar.h(13, this.f26038s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f26039t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f26040u);
            }
            if (zArr[16]) {
                fVar.e(16, this.f26041v);
            }
            java.lang.String str8 = this.f26042w;
            if (str8 != null && zArr[18]) {
                fVar.j(18, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f26026d;
            if (str9 != null && zArr[1]) {
                i18 = b36.f.j(1, str9) + 0;
            }
            java.lang.String str10 = this.f26027e;
            if (str10 != null && zArr[2]) {
                i18 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f26028f;
            if (str11 != null && zArr[3]) {
                i18 += b36.f.j(3, str11);
            }
            int g17 = i18 + b36.f.g(4, 1, linkedList3);
            java.lang.String str12 = this.f26030h;
            if (str12 != null && zArr[5]) {
                g17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f26031i;
            if (str13 != null && zArr[6]) {
                g17 += b36.f.j(6, str13);
            }
            int g18 = g17 + b36.f.g(7, 8, linkedList2);
            if (zArr[8]) {
                g18 += b36.f.e(8, this.f26033n);
            }
            if (zArr[9]) {
                g18 += b36.f.e(9, this.f26034o);
            }
            java.lang.String str14 = this.f26035p;
            if (str14 != null && zArr[10]) {
                g18 += b36.f.j(10, str14);
            }
            java.lang.String str15 = this.f26036q;
            if (str15 != null && zArr[11]) {
                g18 += b36.f.j(11, str15);
            }
            int g19 = g18 + b36.f.g(12, 1, linkedList);
            if (zArr[13]) {
                g19 += b36.f.h(13, this.f26038s);
            }
            if (zArr[14]) {
                g19 += b36.f.e(14, this.f26039t);
            }
            if (zArr[15]) {
                g19 += b36.f.e(15, this.f26040u);
            }
            if (zArr[16]) {
                g19 += b36.f.e(16, this.f26041v);
            }
            java.lang.String str16 = this.f26042w;
            return (str16 == null || !zArr[18]) ? g19 : g19 + b36.f.j(18, str16);
        }
        if (i17 == 2) {
            linkedList3.clear();
            linkedList2.clear();
            linkedList.clear();
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
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
                this.f26026d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f26027e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f26028f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                linkedList3.add(aVar2.k(intValue));
                zArr[4] = true;
                return 0;
            case 5:
                this.f26030h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f26031i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.aw awVar = new bw5.aw();
                    if (bArr != null && bArr.length > 0) {
                        awVar.parseFrom(bArr);
                    }
                    linkedList2.add(awVar);
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f26033n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f26034o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f26035p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f26036q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                linkedList.add(aVar2.k(intValue));
                zArr[12] = true;
                return 0;
            case 13:
                this.f26038s = aVar2.i(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f26039t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f26040u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f26041v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
            default:
                return -1;
            case 18:
                this.f26042w = aVar2.k(intValue);
                zArr[18] = true;
                return 0;
        }
    }
}

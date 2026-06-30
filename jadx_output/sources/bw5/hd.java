package bw5;

/* loaded from: classes4.dex */
public class hd extends com.tencent.mm.protobuf.f {
    public int A;
    public bw5.cd B;
    public bw5.bd F;
    public int G;
    public int H;

    /* renamed from: d, reason: collision with root package name */
    public bw5.gd f28152d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f28153e;

    /* renamed from: f, reason: collision with root package name */
    public int f28154f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f28156h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f28157i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f28158m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f28159n;

    /* renamed from: q, reason: collision with root package name */
    public int f28162q;

    /* renamed from: r, reason: collision with root package name */
    public int f28163r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f28164s;

    /* renamed from: z, reason: collision with root package name */
    public bw5.fd f28171z;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f28155g = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f28160o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f28161p = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f28165t = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f28166u = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.LinkedList f28167v = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f28168w = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f28169x = new java.util.LinkedList();

    /* renamed from: y, reason: collision with root package name */
    public final java.util.LinkedList f28170y = new java.util.LinkedList();
    public final java.util.LinkedList C = new java.util.LinkedList();
    public final java.util.LinkedList D = new java.util.LinkedList();
    public final java.util.LinkedList E = new java.util.LinkedList();
    public final boolean[] I = new boolean[30];

    static {
        new bw5.hd();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.hd parseFrom(byte[] bArr) {
        return (bw5.hd) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hd)) {
            return false;
        }
        bw5.hd hdVar = (bw5.hd) fVar;
        return n51.f.a(this.f28152d, hdVar.f28152d) && n51.f.a(this.f28153e, hdVar.f28153e) && n51.f.a(java.lang.Integer.valueOf(this.f28154f), java.lang.Integer.valueOf(hdVar.f28154f)) && n51.f.a(this.f28155g, hdVar.f28155g) && n51.f.a(this.f28156h, hdVar.f28156h) && n51.f.a(this.f28157i, hdVar.f28157i) && n51.f.a(this.f28158m, hdVar.f28158m) && n51.f.a(this.f28159n, hdVar.f28159n) && n51.f.a(this.f28160o, hdVar.f28160o) && n51.f.a(this.f28161p, hdVar.f28161p) && n51.f.a(java.lang.Integer.valueOf(this.f28162q), java.lang.Integer.valueOf(hdVar.f28162q)) && n51.f.a(java.lang.Integer.valueOf(this.f28163r), java.lang.Integer.valueOf(hdVar.f28163r)) && n51.f.a(this.f28164s, hdVar.f28164s) && n51.f.a(this.f28165t, hdVar.f28165t) && n51.f.a(this.f28166u, hdVar.f28166u) && n51.f.a(this.f28167v, hdVar.f28167v) && n51.f.a(this.f28168w, hdVar.f28168w) && n51.f.a(this.f28169x, hdVar.f28169x) && n51.f.a(this.f28170y, hdVar.f28170y) && n51.f.a(this.f28171z, hdVar.f28171z) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(hdVar.A)) && n51.f.a(this.B, hdVar.B) && n51.f.a(this.C, hdVar.C) && n51.f.a(this.D, hdVar.D) && n51.f.a(this.E, hdVar.E) && n51.f.a(this.F, hdVar.F) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(hdVar.G)) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(hdVar.H));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.hd();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f28165t;
        java.util.LinkedList linkedList2 = this.f28161p;
        java.util.LinkedList linkedList3 = this.f28160o;
        java.util.LinkedList linkedList4 = this.f28155g;
        int i18 = 0;
        boolean[] zArr = this.I;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.gd gdVar = this.f28152d;
            if (gdVar != null && zArr[1]) {
                fVar.e(1, gdVar.f27815d);
            }
            java.lang.String str = this.f28153e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f28154f);
            }
            fVar.g(4, 8, linkedList4);
            java.lang.String str2 = this.f28156h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f28157i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f28158m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f28159n;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            fVar.g(9, 1, linkedList3);
            fVar.g(10, 8, linkedList2);
            if (zArr[11]) {
                fVar.e(11, this.f28162q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f28163r);
            }
            java.lang.String str6 = this.f28164s;
            if (str6 != null && zArr[13]) {
                fVar.j(13, str6);
            }
            fVar.g(14, 8, linkedList);
            fVar.g(15, 8, this.f28166u);
            fVar.g(16, 8, this.f28167v);
            fVar.g(17, 8, this.f28168w);
            fVar.g(18, 8, this.f28169x);
            fVar.g(19, 8, this.f28170y);
            bw5.fd fdVar = this.f28171z;
            if (fdVar != null && zArr[20]) {
                fVar.i(20, fdVar.computeSize());
                this.f28171z.writeFields(fVar);
            }
            if (zArr[21]) {
                fVar.e(21, this.A);
            }
            bw5.cd cdVar = this.B;
            if (cdVar != null && zArr[22]) {
                fVar.i(22, cdVar.computeSize());
                this.B.writeFields(fVar);
            }
            fVar.g(23, 2, this.C);
            fVar.g(24, 8, this.D);
            fVar.g(25, 8, this.E);
            bw5.bd bdVar = this.F;
            if (bdVar != null && zArr[27]) {
                fVar.i(27, bdVar.computeSize());
                this.F.writeFields(fVar);
            }
            if (zArr[28]) {
                fVar.e(28, this.G);
            }
            if (zArr[29]) {
                fVar.e(29, this.H);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.gd gdVar2 = this.f28152d;
            if (gdVar2 != null && zArr[1]) {
                i18 = b36.f.e(1, gdVar2.f27815d) + 0;
            }
            java.lang.String str7 = this.f28153e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f28154f);
            }
            int g17 = i18 + b36.f.g(4, 8, linkedList4);
            java.lang.String str8 = this.f28156h;
            if (str8 != null && zArr[5]) {
                g17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f28157i;
            if (str9 != null && zArr[6]) {
                g17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f28158m;
            if (str10 != null && zArr[7]) {
                g17 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f28159n;
            if (str11 != null && zArr[8]) {
                g17 += b36.f.j(8, str11);
            }
            int g18 = g17 + b36.f.g(9, 1, linkedList3) + b36.f.g(10, 8, linkedList2);
            if (zArr[11]) {
                g18 += b36.f.e(11, this.f28162q);
            }
            if (zArr[12]) {
                g18 += b36.f.e(12, this.f28163r);
            }
            java.lang.String str12 = this.f28164s;
            if (str12 != null && zArr[13]) {
                g18 += b36.f.j(13, str12);
            }
            int g19 = g18 + b36.f.g(14, 8, linkedList) + b36.f.g(15, 8, this.f28166u) + b36.f.g(16, 8, this.f28167v) + b36.f.g(17, 8, this.f28168w) + b36.f.g(18, 8, this.f28169x) + b36.f.g(19, 8, this.f28170y);
            bw5.fd fdVar2 = this.f28171z;
            if (fdVar2 != null && zArr[20]) {
                g19 += b36.f.i(20, fdVar2.computeSize());
            }
            if (zArr[21]) {
                g19 += b36.f.e(21, this.A);
            }
            bw5.cd cdVar2 = this.B;
            if (cdVar2 != null && zArr[22]) {
                g19 += b36.f.i(22, cdVar2.computeSize());
            }
            int g27 = g19 + b36.f.g(23, 2, this.C) + b36.f.g(24, 8, this.D) + b36.f.g(25, 8, this.E);
            bw5.bd bdVar2 = this.F;
            if (bdVar2 != null && zArr[27]) {
                g27 += b36.f.i(27, bdVar2.computeSize());
            }
            if (zArr[28]) {
                g27 += b36.f.e(28, this.G);
            }
            return zArr[29] ? g27 + b36.f.e(29, this.H) : g27;
        }
        if (i17 == 2) {
            linkedList4.clear();
            linkedList3.clear();
            linkedList2.clear();
            linkedList.clear();
            this.f28166u.clear();
            this.f28167v.clear();
            this.f28168w.clear();
            this.f28169x.clear();
            this.f28170y.clear();
            this.C.clear();
            this.D.clear();
            this.E.clear();
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
                int g28 = aVar2.g(intValue);
                this.f28152d = g28 != 0 ? g28 != 1 ? g28 != 2 ? g28 != 3 ? g28 != 4 ? g28 != 5 ? null : bw5.gd.NET_5G : bw5.gd.NET_4G : bw5.gd.NET_3G : bw5.gd.NET_2G : bw5.gd.NET_WIFI : bw5.gd.NET_NULL;
                zArr[1] = true;
                return 0;
            case 2:
                this.f28153e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f28154f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.se seVar = new bw5.se();
                    if (bArr != null && bArr.length > 0) {
                        seVar.parseFrom(bArr);
                    }
                    linkedList4.add(seVar);
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f28156h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f28157i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f28158m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f28159n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                linkedList3.add(aVar2.k(intValue));
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.zf zfVar = new bw5.zf();
                    if (bArr2 != null && bArr2.length > 0) {
                        zfVar.parseFrom(bArr2);
                    }
                    linkedList2.add(zfVar);
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f28162q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f28163r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f28164s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.a5 a5Var = new bw5.a5();
                    if (bArr3 != null && bArr3.length > 0) {
                        a5Var.parseFrom(bArr3);
                    }
                    linkedList.add(a5Var);
                }
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.a5 a5Var2 = new bw5.a5();
                    if (bArr4 != null && bArr4.length > 0) {
                        a5Var2.parseFrom(bArr4);
                    }
                    this.f28166u.add(a5Var2);
                }
                zArr[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.se seVar2 = new bw5.se();
                    if (bArr5 != null && bArr5.length > 0) {
                        seVar2.parseFrom(bArr5);
                    }
                    this.f28167v.add(seVar2);
                }
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.a5 a5Var3 = new bw5.a5();
                    if (bArr6 != null && bArr6.length > 0) {
                        a5Var3.parseFrom(bArr6);
                    }
                    this.f28168w.add(a5Var3);
                }
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.a5 a5Var4 = new bw5.a5();
                    if (bArr7 != null && bArr7.length > 0) {
                        a5Var4.parseFrom(bArr7);
                    }
                    this.f28169x.add(a5Var4);
                }
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    bw5.se seVar3 = new bw5.se();
                    if (bArr8 != null && bArr8.length > 0) {
                        seVar3.parseFrom(bArr8);
                    }
                    this.f28170y.add(seVar3);
                }
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    bw5.fd fdVar3 = new bw5.fd();
                    if (bArr9 != null && bArr9.length > 0) {
                        fdVar3.parseFrom(bArr9);
                    }
                    this.f28171z = fdVar3;
                }
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.g(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    bw5.cd cdVar3 = new bw5.cd();
                    if (bArr10 != null && bArr10.length > 0) {
                        cdVar3.parseFrom(bArr10);
                    }
                    this.B = cdVar3;
                }
                zArr[22] = true;
                return 0;
            case 23:
                this.C.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                zArr[23] = true;
                return 0;
            case 24:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    bw5.dd ddVar = new bw5.dd();
                    if (bArr11 != null && bArr11.length > 0) {
                        ddVar.parseFrom(bArr11);
                    }
                    this.D.add(ddVar);
                }
                zArr[24] = true;
                return 0;
            case 25:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr12 = (byte[]) j49.get(i58);
                    bw5.dd ddVar2 = new bw5.dd();
                    if (bArr12 != null && bArr12.length > 0) {
                        ddVar2.parseFrom(bArr12);
                    }
                    this.E.add(ddVar2);
                }
                zArr[25] = true;
                return 0;
            case 26:
            default:
                return -1;
            case 27:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr13 = (byte[]) j57.get(i59);
                    bw5.bd bdVar3 = new bw5.bd();
                    if (bArr13 != null && bArr13.length > 0) {
                        bdVar3.parseFrom(bArr13);
                    }
                    this.F = bdVar3;
                }
                zArr[27] = true;
                return 0;
            case 28:
                this.G = aVar2.g(intValue);
                zArr[28] = true;
                return 0;
            case 29:
                this.H = aVar2.g(intValue);
                zArr[29] = true;
                return 0;
        }
    }
}

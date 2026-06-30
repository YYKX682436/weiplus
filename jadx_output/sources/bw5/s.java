package bw5;

/* loaded from: classes11.dex */
public class s extends com.tencent.mm.protobuf.f {
    public int A;

    /* renamed from: d, reason: collision with root package name */
    public long f32718d;

    /* renamed from: e, reason: collision with root package name */
    public long f32719e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.dj0 f32720f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f32721g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f32722h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f32723i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f32724m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f32725n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f32726o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f32727p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f32728q;

    /* renamed from: r, reason: collision with root package name */
    public int f32729r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f32730s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f32731t;

    /* renamed from: u, reason: collision with root package name */
    public int f32732u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f32733v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f32734w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f32735x;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f32737z;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.LinkedList f32736y = new java.util.LinkedList();
    public final java.util.LinkedList B = new java.util.LinkedList();
    public final boolean[] C = new boolean[24];

    static {
        new bw5.s();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.s parseFrom(byte[] bArr) {
        return (bw5.s) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.s)) {
            return false;
        }
        bw5.s sVar = (bw5.s) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f32718d), java.lang.Long.valueOf(sVar.f32718d)) && n51.f.a(java.lang.Long.valueOf(this.f32719e), java.lang.Long.valueOf(sVar.f32719e)) && n51.f.a(this.f32720f, sVar.f32720f) && n51.f.a(this.f32721g, sVar.f32721g) && n51.f.a(this.f32722h, sVar.f32722h) && n51.f.a(this.f32723i, sVar.f32723i) && n51.f.a(this.f32724m, sVar.f32724m) && n51.f.a(this.f32725n, sVar.f32725n) && n51.f.a(this.f32726o, sVar.f32726o) && n51.f.a(this.f32727p, sVar.f32727p) && n51.f.a(this.f32728q, sVar.f32728q) && n51.f.a(java.lang.Integer.valueOf(this.f32729r), java.lang.Integer.valueOf(sVar.f32729r)) && n51.f.a(this.f32730s, sVar.f32730s) && n51.f.a(this.f32731t, sVar.f32731t) && n51.f.a(java.lang.Integer.valueOf(this.f32732u), java.lang.Integer.valueOf(sVar.f32732u)) && n51.f.a(this.f32733v, sVar.f32733v) && n51.f.a(this.f32734w, sVar.f32734w) && n51.f.a(this.f32735x, sVar.f32735x) && n51.f.a(this.f32736y, sVar.f32736y) && n51.f.a(this.f32737z, sVar.f32737z) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(sVar.A)) && n51.f.a(this.B, sVar.B);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.s();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.C;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f32718d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f32719e);
            }
            bw5.dj0 dj0Var = this.f32720f;
            if (dj0Var != null && zArr[3]) {
                fVar.i(3, dj0Var.computeSize());
                this.f32720f.writeFields(fVar);
            }
            java.lang.String str = this.f32721g;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f32722h;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f32723i;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f32724m;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f32725n;
            if (str5 != null && zArr[9]) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f32726o;
            if (str6 != null && zArr[10]) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f32727p;
            if (str7 != null && zArr[11]) {
                fVar.j(11, str7);
            }
            java.lang.String str8 = this.f32728q;
            if (str8 != null && zArr[12]) {
                fVar.j(12, str8);
            }
            if (zArr[13]) {
                fVar.e(13, this.f32729r);
            }
            java.lang.String str9 = this.f32730s;
            if (str9 != null && zArr[14]) {
                fVar.j(14, str9);
            }
            java.lang.String str10 = this.f32731t;
            if (str10 != null && zArr[15]) {
                fVar.j(15, str10);
            }
            if (zArr[16]) {
                fVar.e(16, this.f32732u);
            }
            java.lang.String str11 = this.f32733v;
            if (str11 != null && zArr[17]) {
                fVar.j(17, str11);
            }
            java.lang.String str12 = this.f32734w;
            if (str12 != null && zArr[18]) {
                fVar.j(18, str12);
            }
            java.lang.String str13 = this.f32735x;
            if (str13 != null && zArr[19]) {
                fVar.j(19, str13);
            }
            fVar.g(20, 8, this.f32736y);
            java.lang.String str14 = this.f32737z;
            if (str14 != null && zArr[21]) {
                fVar.j(21, str14);
            }
            if (zArr[22]) {
                fVar.e(22, this.A);
            }
            fVar.g(23, 8, this.B);
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f32718d) + 0 : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f32719e);
            }
            bw5.dj0 dj0Var2 = this.f32720f;
            if (dj0Var2 != null && zArr[3]) {
                h17 += b36.f.i(3, dj0Var2.computeSize());
            }
            java.lang.String str15 = this.f32721g;
            if (str15 != null && zArr[5]) {
                h17 += b36.f.j(5, str15);
            }
            java.lang.String str16 = this.f32722h;
            if (str16 != null && zArr[6]) {
                h17 += b36.f.j(6, str16);
            }
            java.lang.String str17 = this.f32723i;
            if (str17 != null && zArr[7]) {
                h17 += b36.f.j(7, str17);
            }
            java.lang.String str18 = this.f32724m;
            if (str18 != null && zArr[8]) {
                h17 += b36.f.j(8, str18);
            }
            java.lang.String str19 = this.f32725n;
            if (str19 != null && zArr[9]) {
                h17 += b36.f.j(9, str19);
            }
            java.lang.String str20 = this.f32726o;
            if (str20 != null && zArr[10]) {
                h17 += b36.f.j(10, str20);
            }
            java.lang.String str21 = this.f32727p;
            if (str21 != null && zArr[11]) {
                h17 += b36.f.j(11, str21);
            }
            java.lang.String str22 = this.f32728q;
            if (str22 != null && zArr[12]) {
                h17 += b36.f.j(12, str22);
            }
            if (zArr[13]) {
                h17 += b36.f.e(13, this.f32729r);
            }
            java.lang.String str23 = this.f32730s;
            if (str23 != null && zArr[14]) {
                h17 += b36.f.j(14, str23);
            }
            java.lang.String str24 = this.f32731t;
            if (str24 != null && zArr[15]) {
                h17 += b36.f.j(15, str24);
            }
            if (zArr[16]) {
                h17 += b36.f.e(16, this.f32732u);
            }
            java.lang.String str25 = this.f32733v;
            if (str25 != null && zArr[17]) {
                h17 += b36.f.j(17, str25);
            }
            java.lang.String str26 = this.f32734w;
            if (str26 != null && zArr[18]) {
                h17 += b36.f.j(18, str26);
            }
            java.lang.String str27 = this.f32735x;
            if (str27 != null && zArr[19]) {
                h17 += b36.f.j(19, str27);
            }
            int g17 = h17 + b36.f.g(20, 8, this.f32736y);
            java.lang.String str28 = this.f32737z;
            if (str28 != null && zArr[21]) {
                g17 += b36.f.j(21, str28);
            }
            if (zArr[22]) {
                g17 += b36.f.e(22, this.A);
            }
            return g17 + b36.f.g(23, 8, this.B);
        }
        if (i17 == 2) {
            this.f32736y.clear();
            this.B.clear();
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
                this.f32718d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f32719e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.dj0 dj0Var3 = new bw5.dj0();
                    if (bArr != null && bArr.length > 0) {
                        dj0Var3.parseFrom(bArr);
                    }
                    this.f32720f = dj0Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
            default:
                return -1;
            case 5:
                this.f32721g = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f32722h = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f32723i = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f32724m = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f32725n = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f32726o = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f32727p = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f32728q = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f32729r = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f32730s = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f32731t = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f32732u = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f32733v = aVar2.k(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f32734w = aVar2.k(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f32735x = aVar2.k(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.gj0 gj0Var = new bw5.gj0();
                    if (bArr2 != null && bArr2.length > 0) {
                        gj0Var.parseFrom(bArr2);
                    }
                    this.f32736y.add(gj0Var);
                }
                zArr[20] = true;
                return 0;
            case 21:
                this.f32737z = aVar2.k(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.A = aVar2.g(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.gj0 gj0Var2 = new bw5.gj0();
                    if (bArr3 != null && bArr3.length > 0) {
                        gj0Var2.parseFrom(bArr3);
                    }
                    this.B.add(gj0Var2);
                }
                zArr[23] = true;
                return 0;
        }
    }
}

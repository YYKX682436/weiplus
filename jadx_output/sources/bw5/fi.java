package bw5;

/* loaded from: classes2.dex */
public class fi extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f27278d;

    /* renamed from: e, reason: collision with root package name */
    public int f27279e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f27280f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f27281g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f27282h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f27283i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f27284m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f27285n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.kh f27286o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.ei f27287p;

    /* renamed from: q, reason: collision with root package name */
    public int f27288q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f27289r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f27290s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f27291t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f27292u;

    /* renamed from: v, reason: collision with root package name */
    public int f27293v;

    /* renamed from: w, reason: collision with root package name */
    public int f27294w;

    /* renamed from: x, reason: collision with root package name */
    public int f27295x;

    /* renamed from: y, reason: collision with root package name */
    public int f27296y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean[] f27297z = new boolean[20];

    static {
        new bw5.fi();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fi parseFrom(byte[] bArr) {
        return (bw5.fi) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fi)) {
            return false;
        }
        bw5.fi fiVar = (bw5.fi) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f27278d), java.lang.Integer.valueOf(fiVar.f27278d)) && n51.f.a(java.lang.Integer.valueOf(this.f27279e), java.lang.Integer.valueOf(fiVar.f27279e)) && n51.f.a(this.f27280f, fiVar.f27280f) && n51.f.a(this.f27281g, fiVar.f27281g) && n51.f.a(this.f27282h, fiVar.f27282h) && n51.f.a(this.f27283i, fiVar.f27283i) && n51.f.a(this.f27284m, fiVar.f27284m) && n51.f.a(this.f27285n, fiVar.f27285n) && n51.f.a(this.f27286o, fiVar.f27286o) && n51.f.a(this.f27287p, fiVar.f27287p) && n51.f.a(java.lang.Integer.valueOf(this.f27288q), java.lang.Integer.valueOf(fiVar.f27288q)) && n51.f.a(this.f27289r, fiVar.f27289r) && n51.f.a(this.f27290s, fiVar.f27290s) && n51.f.a(this.f27291t, fiVar.f27291t) && n51.f.a(this.f27292u, fiVar.f27292u) && n51.f.a(java.lang.Integer.valueOf(this.f27293v), java.lang.Integer.valueOf(fiVar.f27293v)) && n51.f.a(java.lang.Integer.valueOf(this.f27294w), java.lang.Integer.valueOf(fiVar.f27294w)) && n51.f.a(java.lang.Integer.valueOf(this.f27295x), java.lang.Integer.valueOf(fiVar.f27295x)) && n51.f.a(java.lang.Integer.valueOf(this.f27296y), java.lang.Integer.valueOf(fiVar.f27296y));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.fi();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f27297z;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f27278d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f27279e);
            }
            java.lang.String str = this.f27280f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f27281g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f27282h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f27283i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f27284m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f27285n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            bw5.kh khVar = this.f27286o;
            if (khVar != null && zArr[9]) {
                fVar.i(9, khVar.computeSize());
                this.f27286o.writeFields(fVar);
            }
            bw5.ei eiVar = this.f27287p;
            if (eiVar != null && zArr[10]) {
                fVar.i(10, eiVar.computeSize());
                this.f27287p.writeFields(fVar);
            }
            if (zArr[11]) {
                fVar.e(11, this.f27288q);
            }
            com.tencent.mm.protobuf.g gVar = this.f27289r;
            if (gVar != null && zArr[12]) {
                fVar.b(12, gVar);
            }
            java.lang.String str7 = this.f27290s;
            if (str7 != null && zArr[13]) {
                fVar.j(13, str7);
            }
            java.lang.String str8 = this.f27291t;
            if (str8 != null && zArr[14]) {
                fVar.j(14, str8);
            }
            java.lang.String str9 = this.f27292u;
            if (str9 != null && zArr[15]) {
                fVar.j(15, str9);
            }
            if (zArr[16]) {
                fVar.e(16, this.f27293v);
            }
            if (zArr[17]) {
                fVar.e(17, this.f27294w);
            }
            if (zArr[18]) {
                fVar.e(18, this.f27295x);
            }
            if (zArr[19]) {
                fVar.e(19, this.f27296y);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f27278d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f27279e);
            }
            java.lang.String str10 = this.f27280f;
            if (str10 != null && zArr[3]) {
                e17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f27281g;
            if (str11 != null && zArr[4]) {
                e17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f27282h;
            if (str12 != null && zArr[5]) {
                e17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f27283i;
            if (str13 != null && zArr[6]) {
                e17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f27284m;
            if (str14 != null && zArr[7]) {
                e17 += b36.f.j(7, str14);
            }
            java.lang.String str15 = this.f27285n;
            if (str15 != null && zArr[8]) {
                e17 += b36.f.j(8, str15);
            }
            bw5.kh khVar2 = this.f27286o;
            if (khVar2 != null && zArr[9]) {
                e17 += b36.f.i(9, khVar2.computeSize());
            }
            bw5.ei eiVar2 = this.f27287p;
            if (eiVar2 != null && zArr[10]) {
                e17 += b36.f.i(10, eiVar2.computeSize());
            }
            if (zArr[11]) {
                e17 += b36.f.e(11, this.f27288q);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f27289r;
            if (gVar2 != null && zArr[12]) {
                e17 += b36.f.b(12, gVar2);
            }
            java.lang.String str16 = this.f27290s;
            if (str16 != null && zArr[13]) {
                e17 += b36.f.j(13, str16);
            }
            java.lang.String str17 = this.f27291t;
            if (str17 != null && zArr[14]) {
                e17 += b36.f.j(14, str17);
            }
            java.lang.String str18 = this.f27292u;
            if (str18 != null && zArr[15]) {
                e17 += b36.f.j(15, str18);
            }
            if (zArr[16]) {
                e17 += b36.f.e(16, this.f27293v);
            }
            if (zArr[17]) {
                e17 += b36.f.e(17, this.f27294w);
            }
            if (zArr[18]) {
                e17 += b36.f.e(18, this.f27295x);
            }
            return zArr[19] ? e17 + b36.f.e(19, this.f27296y) : e17;
        }
        if (i17 == 2) {
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
                this.f27278d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f27279e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f27280f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f27281g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f27282h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f27283i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f27284m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f27285n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.kh khVar3 = new bw5.kh();
                    if (bArr != null && bArr.length > 0) {
                        khVar3.parseFrom(bArr);
                    }
                    this.f27286o = khVar3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.ei eiVar3 = new bw5.ei();
                    if (bArr2 != null && bArr2.length > 0) {
                        eiVar3.parseFrom(bArr2);
                    }
                    this.f27287p = eiVar3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f27288q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f27289r = aVar2.d(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f27290s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f27291t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f27292u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f27293v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f27294w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f27295x = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f27296y = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
            default:
                return -1;
        }
    }
}

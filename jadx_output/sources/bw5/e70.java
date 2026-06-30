package bw5;

/* loaded from: classes2.dex */
public class e70 extends com.tencent.mm.protobuf.f {
    public int A;
    public java.lang.String B;
    public int C;
    public bw5.f70 D;
    public final boolean[] E = new boolean[26];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f26758d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f26759e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f26760f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f26761g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f26762h;

    /* renamed from: i, reason: collision with root package name */
    public int f26763i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f26764m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f26765n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f26766o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.k40 f26767p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f26768q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f26769r;

    /* renamed from: s, reason: collision with root package name */
    public float f26770s;

    /* renamed from: t, reason: collision with root package name */
    public float f26771t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f26772u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f26773v;

    /* renamed from: w, reason: collision with root package name */
    public int f26774w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f26775x;

    /* renamed from: y, reason: collision with root package name */
    public long f26776y;

    /* renamed from: z, reason: collision with root package name */
    public long f26777z;

    static {
        new bw5.e70();
    }

    public java.lang.String b() {
        return this.E[2] ? this.f26759e : "";
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.e70 parseFrom(byte[] bArr) {
        return (bw5.e70) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.e70)) {
            return false;
        }
        bw5.e70 e70Var = (bw5.e70) fVar;
        return n51.f.a(this.f26758d, e70Var.f26758d) && n51.f.a(this.f26759e, e70Var.f26759e) && n51.f.a(this.f26760f, e70Var.f26760f) && n51.f.a(this.f26761g, e70Var.f26761g) && n51.f.a(this.f26762h, e70Var.f26762h) && n51.f.a(java.lang.Integer.valueOf(this.f26763i), java.lang.Integer.valueOf(e70Var.f26763i)) && n51.f.a(this.f26764m, e70Var.f26764m) && n51.f.a(this.f26765n, e70Var.f26765n) && n51.f.a(java.lang.Boolean.valueOf(this.f26766o), java.lang.Boolean.valueOf(e70Var.f26766o)) && n51.f.a(this.f26767p, e70Var.f26767p) && n51.f.a(this.f26768q, e70Var.f26768q) && n51.f.a(this.f26769r, e70Var.f26769r) && n51.f.a(java.lang.Float.valueOf(this.f26770s), java.lang.Float.valueOf(e70Var.f26770s)) && n51.f.a(java.lang.Float.valueOf(this.f26771t), java.lang.Float.valueOf(e70Var.f26771t)) && n51.f.a(this.f26772u, e70Var.f26772u) && n51.f.a(this.f26773v, e70Var.f26773v) && n51.f.a(java.lang.Integer.valueOf(this.f26774w), java.lang.Integer.valueOf(e70Var.f26774w)) && n51.f.a(this.f26775x, e70Var.f26775x) && n51.f.a(java.lang.Long.valueOf(this.f26776y), java.lang.Long.valueOf(e70Var.f26776y)) && n51.f.a(java.lang.Long.valueOf(this.f26777z), java.lang.Long.valueOf(e70Var.f26777z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(e70Var.A)) && n51.f.a(this.B, e70Var.B) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(e70Var.C)) && n51.f.a(this.D, e70Var.D);
    }

    public bw5.e70 d(java.lang.String str) {
        this.f26759e = str;
        this.E[2] = true;
        return this;
    }

    public bw5.e70 e(java.lang.String str) {
        this.f26758d = str;
        this.E[1] = true;
        return this;
    }

    public java.lang.String getTid() {
        return this.E[1] ? this.f26758d : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.e70();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.E;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f26758d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f26759e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f26760f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f26761g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f26762h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.e(6, this.f26763i);
            }
            java.lang.String str6 = this.f26764m;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f26765n;
            if (str7 != null && zArr[8]) {
                fVar.j(8, str7);
            }
            if (zArr[9]) {
                fVar.a(9, this.f26766o);
            }
            bw5.k40 k40Var = this.f26767p;
            if (k40Var != null && zArr[10]) {
                fVar.i(10, k40Var.computeSize());
                this.f26767p.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f26768q;
            if (gVar != null && zArr[11]) {
                fVar.b(11, gVar);
            }
            java.lang.String str8 = this.f26769r;
            if (str8 != null && zArr[12]) {
                fVar.j(12, str8);
            }
            if (zArr[13]) {
                fVar.d(13, this.f26770s);
            }
            if (zArr[14]) {
                fVar.d(14, this.f26771t);
            }
            java.lang.String str9 = this.f26772u;
            if (str9 != null && zArr[15]) {
                fVar.j(15, str9);
            }
            java.lang.String str10 = this.f26773v;
            if (str10 != null && zArr[16]) {
                fVar.j(16, str10);
            }
            if (zArr[17]) {
                fVar.e(17, this.f26774w);
            }
            java.lang.String str11 = this.f26775x;
            if (str11 != null && zArr[18]) {
                fVar.j(18, str11);
            }
            if (zArr[20]) {
                fVar.h(20, this.f26776y);
            }
            if (zArr[21]) {
                fVar.h(21, this.f26777z);
            }
            if (zArr[22]) {
                fVar.e(22, this.A);
            }
            java.lang.String str12 = this.B;
            if (str12 != null && zArr[23]) {
                fVar.j(23, str12);
            }
            if (zArr[24]) {
                fVar.e(24, this.C);
            }
            bw5.f70 f70Var = this.D;
            if (f70Var != null && zArr[25]) {
                fVar.i(25, f70Var.computeSize());
                this.D.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str13 = this.f26758d;
            if (str13 != null && zArr[1]) {
                i18 = b36.f.j(1, str13) + 0;
            }
            java.lang.String str14 = this.f26759e;
            if (str14 != null && zArr[2]) {
                i18 += b36.f.j(2, str14);
            }
            java.lang.String str15 = this.f26760f;
            if (str15 != null && zArr[3]) {
                i18 += b36.f.j(3, str15);
            }
            java.lang.String str16 = this.f26761g;
            if (str16 != null && zArr[4]) {
                i18 += b36.f.j(4, str16);
            }
            java.lang.String str17 = this.f26762h;
            if (str17 != null && zArr[5]) {
                i18 += b36.f.j(5, str17);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f26763i);
            }
            java.lang.String str18 = this.f26764m;
            if (str18 != null && zArr[7]) {
                i18 += b36.f.j(7, str18);
            }
            java.lang.String str19 = this.f26765n;
            if (str19 != null && zArr[8]) {
                i18 += b36.f.j(8, str19);
            }
            if (zArr[9]) {
                i18 += b36.f.a(9, this.f26766o);
            }
            bw5.k40 k40Var2 = this.f26767p;
            if (k40Var2 != null && zArr[10]) {
                i18 += b36.f.i(10, k40Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f26768q;
            if (gVar2 != null && zArr[11]) {
                i18 += b36.f.b(11, gVar2);
            }
            java.lang.String str20 = this.f26769r;
            if (str20 != null && zArr[12]) {
                i18 += b36.f.j(12, str20);
            }
            if (zArr[13]) {
                i18 += b36.f.d(13, this.f26770s);
            }
            if (zArr[14]) {
                i18 += b36.f.d(14, this.f26771t);
            }
            java.lang.String str21 = this.f26772u;
            if (str21 != null && zArr[15]) {
                i18 += b36.f.j(15, str21);
            }
            java.lang.String str22 = this.f26773v;
            if (str22 != null && zArr[16]) {
                i18 += b36.f.j(16, str22);
            }
            if (zArr[17]) {
                i18 += b36.f.e(17, this.f26774w);
            }
            java.lang.String str23 = this.f26775x;
            if (str23 != null && zArr[18]) {
                i18 += b36.f.j(18, str23);
            }
            if (zArr[20]) {
                i18 += b36.f.h(20, this.f26776y);
            }
            if (zArr[21]) {
                i18 += b36.f.h(21, this.f26777z);
            }
            if (zArr[22]) {
                i18 += b36.f.e(22, this.A);
            }
            java.lang.String str24 = this.B;
            if (str24 != null && zArr[23]) {
                i18 += b36.f.j(23, str24);
            }
            if (zArr[24]) {
                i18 += b36.f.e(24, this.C);
            }
            bw5.f70 f70Var2 = this.D;
            return (f70Var2 == null || !zArr[25]) ? i18 : i18 + b36.f.i(25, f70Var2.computeSize());
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
                this.f26758d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f26759e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f26760f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f26761g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f26762h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f26763i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f26764m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f26765n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f26766o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.k40 k40Var3 = new bw5.k40();
                    if (bArr != null && bArr.length > 0) {
                        k40Var3.parseFrom(bArr);
                    }
                    this.f26767p = k40Var3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f26768q = aVar2.d(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f26769r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f26770s = aVar2.f(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f26771t = aVar2.f(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f26772u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f26773v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f26774w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f26775x = aVar2.k(intValue);
                zArr[18] = true;
                return 0;
            case 19:
            default:
                return -1;
            case 20:
                this.f26776y = aVar2.i(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.f26777z = aVar2.i(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.A = aVar2.g(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.B = aVar2.k(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                this.C = aVar2.g(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.f70 f70Var3 = new bw5.f70();
                    if (bArr2 != null && bArr2.length > 0) {
                        f70Var3.parseFrom(bArr2);
                    }
                    this.D = f70Var3;
                }
                zArr[25] = true;
                return 0;
        }
    }
}

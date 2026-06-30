package bw5;

/* loaded from: classes2.dex */
public class nd extends com.tencent.mm.protobuf.f {
    public int A;
    public com.tencent.mm.protobuf.g B;
    public bw5.jd C;
    public final boolean[] D = new boolean[25];

    /* renamed from: d, reason: collision with root package name */
    public long f30622d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30623e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f30624f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f30625g;

    /* renamed from: h, reason: collision with root package name */
    public int f30626h;

    /* renamed from: i, reason: collision with root package name */
    public int f30627i;

    /* renamed from: m, reason: collision with root package name */
    public int f30628m;

    /* renamed from: n, reason: collision with root package name */
    public int f30629n;

    /* renamed from: o, reason: collision with root package name */
    public long f30630o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.md f30631p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.ld f30632q;

    /* renamed from: r, reason: collision with root package name */
    public int f30633r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f30634s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f30635t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f30636u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f30637v;

    /* renamed from: w, reason: collision with root package name */
    public int f30638w;

    /* renamed from: x, reason: collision with root package name */
    public int f30639x;

    /* renamed from: y, reason: collision with root package name */
    public bw5.ur f30640y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f30641z;

    static {
        new bw5.nd();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.nd parseFrom(byte[] bArr) {
        return (bw5.nd) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.nd)) {
            return false;
        }
        bw5.nd ndVar = (bw5.nd) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f30622d), java.lang.Long.valueOf(ndVar.f30622d)) && n51.f.a(this.f30623e, ndVar.f30623e) && n51.f.a(this.f30624f, ndVar.f30624f) && n51.f.a(this.f30625g, ndVar.f30625g) && n51.f.a(java.lang.Integer.valueOf(this.f30626h), java.lang.Integer.valueOf(ndVar.f30626h)) && n51.f.a(java.lang.Integer.valueOf(this.f30627i), java.lang.Integer.valueOf(ndVar.f30627i)) && n51.f.a(java.lang.Integer.valueOf(this.f30628m), java.lang.Integer.valueOf(ndVar.f30628m)) && n51.f.a(java.lang.Integer.valueOf(this.f30629n), java.lang.Integer.valueOf(ndVar.f30629n)) && n51.f.a(java.lang.Long.valueOf(this.f30630o), java.lang.Long.valueOf(ndVar.f30630o)) && n51.f.a(this.f30631p, ndVar.f30631p) && n51.f.a(this.f30632q, ndVar.f30632q) && n51.f.a(java.lang.Integer.valueOf(this.f30633r), java.lang.Integer.valueOf(ndVar.f30633r)) && n51.f.a(this.f30634s, ndVar.f30634s) && n51.f.a(java.lang.Boolean.valueOf(this.f30635t), java.lang.Boolean.valueOf(ndVar.f30635t)) && n51.f.a(this.f30636u, ndVar.f30636u) && n51.f.a(this.f30637v, ndVar.f30637v) && n51.f.a(java.lang.Integer.valueOf(this.f30638w), java.lang.Integer.valueOf(ndVar.f30638w)) && n51.f.a(java.lang.Integer.valueOf(this.f30639x), java.lang.Integer.valueOf(ndVar.f30639x)) && n51.f.a(this.f30640y, ndVar.f30640y) && n51.f.a(this.f30641z, ndVar.f30641z) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(ndVar.A)) && n51.f.a(this.B, ndVar.B) && n51.f.a(this.C, ndVar.C);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.nd();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        bw5.md mdVar;
        boolean[] zArr = this.D;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f30622d);
            }
            java.lang.String str = this.f30623e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f30624f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f30625g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.e(5, this.f30626h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f30627i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f30628m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f30629n);
            }
            if (zArr[9]) {
                fVar.h(9, this.f30630o);
            }
            bw5.md mdVar2 = this.f30631p;
            if (mdVar2 != null && zArr[10]) {
                fVar.e(10, mdVar2.f30189d);
            }
            bw5.ld ldVar = this.f30632q;
            if (ldVar != null && zArr[11]) {
                fVar.e(11, ldVar.f29754d);
            }
            if (zArr[12]) {
                fVar.e(12, this.f30633r);
            }
            com.tencent.mm.protobuf.g gVar = this.f30634s;
            if (gVar != null && zArr[13]) {
                fVar.b(13, gVar);
            }
            if (zArr[14]) {
                fVar.a(14, this.f30635t);
            }
            java.lang.String str4 = this.f30636u;
            if (str4 != null && zArr[15]) {
                fVar.j(15, str4);
            }
            java.lang.String str5 = this.f30637v;
            if (str5 != null && zArr[16]) {
                fVar.j(16, str5);
            }
            if (zArr[17]) {
                fVar.e(17, this.f30638w);
            }
            if (zArr[18]) {
                fVar.e(18, this.f30639x);
            }
            bw5.ur urVar = this.f30640y;
            if (urVar != null && zArr[20]) {
                fVar.i(20, urVar.computeSize());
                this.f30640y.writeFields(fVar);
            }
            java.lang.String str6 = this.f30641z;
            if (str6 != null && zArr[21]) {
                fVar.j(21, str6);
            }
            if (zArr[22]) {
                fVar.e(22, this.A);
            }
            com.tencent.mm.protobuf.g gVar2 = this.B;
            if (gVar2 != null && zArr[23]) {
                fVar.b(23, gVar2);
            }
            bw5.jd jdVar = this.C;
            if (jdVar != null && zArr[24]) {
                fVar.i(24, jdVar.computeSize());
                this.C.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f30622d) + 0 : 0;
            java.lang.String str7 = this.f30623e;
            if (str7 != null && zArr[2]) {
                h17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f30624f;
            if (str8 != null && zArr[3]) {
                h17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f30625g;
            if (str9 != null && zArr[4]) {
                h17 += b36.f.j(4, str9);
            }
            if (zArr[5]) {
                h17 += b36.f.e(5, this.f30626h);
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f30627i);
            }
            if (zArr[7]) {
                h17 += b36.f.e(7, this.f30628m);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f30629n);
            }
            if (zArr[9]) {
                h17 += b36.f.h(9, this.f30630o);
            }
            bw5.md mdVar3 = this.f30631p;
            if (mdVar3 != null && zArr[10]) {
                h17 += b36.f.e(10, mdVar3.f30189d);
            }
            bw5.ld ldVar2 = this.f30632q;
            if (ldVar2 != null && zArr[11]) {
                h17 += b36.f.e(11, ldVar2.f29754d);
            }
            if (zArr[12]) {
                h17 += b36.f.e(12, this.f30633r);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f30634s;
            if (gVar3 != null && zArr[13]) {
                h17 += b36.f.b(13, gVar3);
            }
            if (zArr[14]) {
                h17 += b36.f.a(14, this.f30635t);
            }
            java.lang.String str10 = this.f30636u;
            if (str10 != null && zArr[15]) {
                h17 += b36.f.j(15, str10);
            }
            java.lang.String str11 = this.f30637v;
            if (str11 != null && zArr[16]) {
                h17 += b36.f.j(16, str11);
            }
            if (zArr[17]) {
                h17 += b36.f.e(17, this.f30638w);
            }
            if (zArr[18]) {
                h17 += b36.f.e(18, this.f30639x);
            }
            bw5.ur urVar2 = this.f30640y;
            if (urVar2 != null && zArr[20]) {
                h17 += b36.f.i(20, urVar2.computeSize());
            }
            java.lang.String str12 = this.f30641z;
            if (str12 != null && zArr[21]) {
                h17 += b36.f.j(21, str12);
            }
            if (zArr[22]) {
                h17 += b36.f.e(22, this.A);
            }
            com.tencent.mm.protobuf.g gVar4 = this.B;
            if (gVar4 != null && zArr[23]) {
                h17 += b36.f.b(23, gVar4);
            }
            bw5.jd jdVar2 = this.C;
            return (jdVar2 == null || !zArr[24]) ? h17 : h17 + b36.f.i(24, jdVar2.computeSize());
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
                this.f30622d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30623e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30624f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f30625g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f30626h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f30627i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f30628m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f30629n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f30630o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                switch (aVar2.g(intValue)) {
                    case 0:
                        mdVar = bw5.md.CollectionType_Unknow;
                        break;
                    case 1:
                        mdVar = bw5.md.CollectionType_Author;
                        break;
                    case 2:
                        mdVar = bw5.md.CollectionType_Smart;
                        break;
                    case 3:
                        mdVar = bw5.md.CollectionType_AuthorAudio;
                        break;
                    case 4:
                        mdVar = bw5.md.CollectionType_Course;
                        break;
                    case 5:
                        mdVar = bw5.md.CollectionType_Drama;
                        break;
                    case 6:
                        mdVar = bw5.md.CollectionType_AudioRss;
                        break;
                    case 7:
                        mdVar = bw5.md.CollectionType_FinderSmart;
                        break;
                    default:
                        mdVar = null;
                        break;
                }
                this.f30631p = mdVar;
                zArr[10] = true;
                return 0;
            case 11:
                int g17 = aVar2.g(intValue);
                this.f30632q = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : bw5.ld.CollectionEnterType_Passive : bw5.ld.CollectionEnterType_Active : bw5.ld.CollectionEnterType_Unknow;
                zArr[11] = true;
                return 0;
            case 12:
                this.f30633r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f30634s = aVar2.d(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f30635t = aVar2.c(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f30636u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f30637v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f30638w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f30639x = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
            case 19:
            default:
                return -1;
            case 20:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.ur urVar3 = new bw5.ur();
                    if (bArr != null && bArr.length > 0) {
                        urVar3.parseFrom(bArr);
                    }
                    this.f30640y = urVar3;
                }
                zArr[20] = true;
                return 0;
            case 21:
                this.f30641z = aVar2.k(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.A = aVar2.g(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.B = aVar2.d(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.jd jdVar3 = new bw5.jd();
                    if (bArr2 != null && bArr2.length > 0) {
                        jdVar3.parseFrom(bArr2);
                    }
                    this.C = jdVar3;
                }
                zArr[24] = true;
                return 0;
        }
    }
}

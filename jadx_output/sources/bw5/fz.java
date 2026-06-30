package bw5;

/* loaded from: classes7.dex */
public class fz extends com.tencent.mm.protobuf.f {
    public int A;
    public java.lang.String B;
    public long C;
    public boolean D;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f27564d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f27565e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f27566f;

    /* renamed from: g, reason: collision with root package name */
    public int f27567g;

    /* renamed from: h, reason: collision with root package name */
    public long f27568h;

    /* renamed from: i, reason: collision with root package name */
    public long f27569i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f27570m;

    /* renamed from: n, reason: collision with root package name */
    public int f27571n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f27572o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f27573p;

    /* renamed from: q, reason: collision with root package name */
    public int f27574q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f27575r;

    /* renamed from: s, reason: collision with root package name */
    public int f27576s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f27577t;

    /* renamed from: u, reason: collision with root package name */
    public int f27578u;

    /* renamed from: v, reason: collision with root package name */
    public int f27579v;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f27581x;

    /* renamed from: y, reason: collision with root package name */
    public float f27582y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f27583z;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f27580w = new java.util.LinkedList();
    public final boolean[] E = new boolean[26];

    static {
        new bw5.fz();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fz parseFrom(byte[] bArr) {
        return (bw5.fz) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fz)) {
            return false;
        }
        bw5.fz fzVar = (bw5.fz) fVar;
        return n51.f.a(this.f27564d, fzVar.f27564d) && n51.f.a(this.f27565e, fzVar.f27565e) && n51.f.a(this.f27566f, fzVar.f27566f) && n51.f.a(java.lang.Integer.valueOf(this.f27567g), java.lang.Integer.valueOf(fzVar.f27567g)) && n51.f.a(java.lang.Long.valueOf(this.f27568h), java.lang.Long.valueOf(fzVar.f27568h)) && n51.f.a(java.lang.Long.valueOf(this.f27569i), java.lang.Long.valueOf(fzVar.f27569i)) && n51.f.a(java.lang.Boolean.valueOf(this.f27570m), java.lang.Boolean.valueOf(fzVar.f27570m)) && n51.f.a(java.lang.Integer.valueOf(this.f27571n), java.lang.Integer.valueOf(fzVar.f27571n)) && n51.f.a(java.lang.Boolean.valueOf(this.f27572o), java.lang.Boolean.valueOf(fzVar.f27572o)) && n51.f.a(java.lang.Boolean.valueOf(this.f27573p), java.lang.Boolean.valueOf(fzVar.f27573p)) && n51.f.a(java.lang.Integer.valueOf(this.f27574q), java.lang.Integer.valueOf(fzVar.f27574q)) && n51.f.a(java.lang.Boolean.valueOf(this.f27575r), java.lang.Boolean.valueOf(fzVar.f27575r)) && n51.f.a(java.lang.Integer.valueOf(this.f27576s), java.lang.Integer.valueOf(fzVar.f27576s)) && n51.f.a(java.lang.Boolean.valueOf(this.f27577t), java.lang.Boolean.valueOf(fzVar.f27577t)) && n51.f.a(java.lang.Integer.valueOf(this.f27578u), java.lang.Integer.valueOf(fzVar.f27578u)) && n51.f.a(java.lang.Integer.valueOf(this.f27579v), java.lang.Integer.valueOf(fzVar.f27579v)) && n51.f.a(this.f27580w, fzVar.f27580w) && n51.f.a(this.f27581x, fzVar.f27581x) && n51.f.a(java.lang.Float.valueOf(this.f27582y), java.lang.Float.valueOf(fzVar.f27582y)) && n51.f.a(this.f27583z, fzVar.f27583z) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(fzVar.A)) && n51.f.a(this.B, fzVar.B) && n51.f.a(java.lang.Long.valueOf(this.C), java.lang.Long.valueOf(fzVar.C)) && n51.f.a(java.lang.Boolean.valueOf(this.D), java.lang.Boolean.valueOf(fzVar.D));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.fz();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.E;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f27564d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f27565e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f27566f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f27567g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f27568h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f27569i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f27570m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f27571n);
            }
            if (zArr[9]) {
                fVar.a(9, this.f27572o);
            }
            if (zArr[10]) {
                fVar.a(10, this.f27573p);
            }
            if (zArr[12]) {
                fVar.e(12, this.f27574q);
            }
            if (zArr[13]) {
                fVar.a(13, this.f27575r);
            }
            if (zArr[14]) {
                fVar.e(14, this.f27576s);
            }
            if (zArr[15]) {
                fVar.a(15, this.f27577t);
            }
            if (zArr[16]) {
                fVar.e(16, this.f27578u);
            }
            if (zArr[17]) {
                fVar.e(17, this.f27579v);
            }
            fVar.g(18, 1, this.f27580w);
            java.lang.String str3 = this.f27581x;
            if (str3 != null && zArr[19]) {
                fVar.j(19, str3);
            }
            if (zArr[20]) {
                fVar.d(20, this.f27582y);
            }
            java.lang.String str4 = this.f27583z;
            if (str4 != null && zArr[21]) {
                fVar.j(21, str4);
            }
            if (zArr[22]) {
                fVar.e(22, this.A);
            }
            java.lang.String str5 = this.B;
            if (str5 != null && zArr[23]) {
                fVar.j(23, str5);
            }
            if (zArr[24]) {
                fVar.h(24, this.C);
            }
            if (zArr[25]) {
                fVar.a(25, this.D);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f27564d;
            if (str6 != null && zArr[1]) {
                i18 = b36.f.j(1, str6) + 0;
            }
            java.lang.String str7 = this.f27565e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f27566f;
            if (gVar2 != null && zArr[3]) {
                i18 += b36.f.b(3, gVar2);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f27567g);
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f27568h);
            }
            if (zArr[6]) {
                i18 += b36.f.h(6, this.f27569i);
            }
            if (zArr[7]) {
                i18 += b36.f.a(7, this.f27570m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f27571n);
            }
            if (zArr[9]) {
                i18 += b36.f.a(9, this.f27572o);
            }
            if (zArr[10]) {
                i18 += b36.f.a(10, this.f27573p);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f27574q);
            }
            if (zArr[13]) {
                i18 += b36.f.a(13, this.f27575r);
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f27576s);
            }
            if (zArr[15]) {
                i18 += b36.f.a(15, this.f27577t);
            }
            if (zArr[16]) {
                i18 += b36.f.e(16, this.f27578u);
            }
            if (zArr[17]) {
                i18 += b36.f.e(17, this.f27579v);
            }
            int g17 = i18 + b36.f.g(18, 1, this.f27580w);
            java.lang.String str8 = this.f27581x;
            if (str8 != null && zArr[19]) {
                g17 += b36.f.j(19, str8);
            }
            if (zArr[20]) {
                g17 += b36.f.d(20, this.f27582y);
            }
            java.lang.String str9 = this.f27583z;
            if (str9 != null && zArr[21]) {
                g17 += b36.f.j(21, str9);
            }
            if (zArr[22]) {
                g17 += b36.f.e(22, this.A);
            }
            java.lang.String str10 = this.B;
            if (str10 != null && zArr[23]) {
                g17 += b36.f.j(23, str10);
            }
            if (zArr[24]) {
                g17 += b36.f.h(24, this.C);
            }
            return zArr[25] ? g17 + b36.f.a(25, this.D) : g17;
        }
        if (i17 == 2) {
            this.f27580w.clear();
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
                this.f27564d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f27565e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f27566f = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f27567g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f27568h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f27569i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f27570m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f27571n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f27572o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f27573p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
            default:
                return -1;
            case 12:
                this.f27574q = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f27575r = aVar2.c(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f27576s = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f27577t = aVar2.c(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f27578u = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f27579v = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f27580w.add(aVar2.k(intValue));
                zArr[18] = true;
                return 0;
            case 19:
                this.f27581x = aVar2.k(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f27582y = aVar2.f(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.f27583z = aVar2.k(intValue);
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
                this.C = aVar2.i(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                this.D = aVar2.c(intValue);
                zArr[25] = true;
                return 0;
        }
    }
}

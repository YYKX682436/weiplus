package bw5;

/* loaded from: classes4.dex */
public class tj0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f33471d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33472e;

    /* renamed from: f, reason: collision with root package name */
    public int f33473f;

    /* renamed from: g, reason: collision with root package name */
    public int f33474g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f33475h;

    /* renamed from: i, reason: collision with root package name */
    public int f33476i;

    /* renamed from: m, reason: collision with root package name */
    public int f33477m;

    /* renamed from: n, reason: collision with root package name */
    public int f33478n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f33479o;

    /* renamed from: p, reason: collision with root package name */
    public int f33480p;

    /* renamed from: q, reason: collision with root package name */
    public long f33481q;

    /* renamed from: r, reason: collision with root package name */
    public long f33482r;

    /* renamed from: s, reason: collision with root package name */
    public int f33483s;

    /* renamed from: t, reason: collision with root package name */
    public int f33484t;

    /* renamed from: v, reason: collision with root package name */
    public int f33486v;

    /* renamed from: w, reason: collision with root package name */
    public r45.cu5 f33487w;

    /* renamed from: x, reason: collision with root package name */
    public r45.cu5 f33488x;

    /* renamed from: y, reason: collision with root package name */
    public int f33489y;

    /* renamed from: z, reason: collision with root package name */
    public int f33490z;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f33485u = new java.util.LinkedList();
    public final java.util.LinkedList A = new java.util.LinkedList();
    public final boolean[] B = new boolean[22];

    static {
        new bw5.tj0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.tj0 parseFrom(byte[] bArr) {
        return (bw5.tj0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tj0)) {
            return false;
        }
        bw5.tj0 tj0Var = (bw5.tj0) fVar;
        return n51.f.a(this.f33471d, tj0Var.f33471d) && n51.f.a(this.f33472e, tj0Var.f33472e) && n51.f.a(java.lang.Integer.valueOf(this.f33473f), java.lang.Integer.valueOf(tj0Var.f33473f)) && n51.f.a(java.lang.Integer.valueOf(this.f33474g), java.lang.Integer.valueOf(tj0Var.f33474g)) && n51.f.a(this.f33475h, tj0Var.f33475h) && n51.f.a(java.lang.Integer.valueOf(this.f33476i), java.lang.Integer.valueOf(tj0Var.f33476i)) && n51.f.a(java.lang.Integer.valueOf(this.f33477m), java.lang.Integer.valueOf(tj0Var.f33477m)) && n51.f.a(java.lang.Integer.valueOf(this.f33478n), java.lang.Integer.valueOf(tj0Var.f33478n)) && n51.f.a(this.f33479o, tj0Var.f33479o) && n51.f.a(java.lang.Integer.valueOf(this.f33480p), java.lang.Integer.valueOf(tj0Var.f33480p)) && n51.f.a(java.lang.Long.valueOf(this.f33481q), java.lang.Long.valueOf(tj0Var.f33481q)) && n51.f.a(java.lang.Long.valueOf(this.f33482r), java.lang.Long.valueOf(tj0Var.f33482r)) && n51.f.a(java.lang.Integer.valueOf(this.f33483s), java.lang.Integer.valueOf(tj0Var.f33483s)) && n51.f.a(java.lang.Integer.valueOf(this.f33484t), java.lang.Integer.valueOf(tj0Var.f33484t)) && n51.f.a(this.f33485u, tj0Var.f33485u) && n51.f.a(java.lang.Integer.valueOf(this.f33486v), java.lang.Integer.valueOf(tj0Var.f33486v)) && n51.f.a(this.f33487w, tj0Var.f33487w) && n51.f.a(this.f33488x, tj0Var.f33488x) && n51.f.a(java.lang.Integer.valueOf(this.f33489y), java.lang.Integer.valueOf(tj0Var.f33489y)) && n51.f.a(java.lang.Integer.valueOf(this.f33490z), java.lang.Integer.valueOf(tj0Var.f33490z)) && n51.f.a(this.A, tj0Var.A);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.tj0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f33485u;
        int i18 = 0;
        boolean[] zArr = this.B;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f33471d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f33472e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f33473f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f33474g);
            }
            java.lang.String str3 = this.f33475h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            if (zArr[6]) {
                fVar.e(6, this.f33476i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f33477m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f33478n);
            }
            java.lang.String str4 = this.f33479o;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            if (zArr[10]) {
                fVar.e(10, this.f33480p);
            }
            if (zArr[11]) {
                fVar.h(11, this.f33481q);
            }
            if (zArr[12]) {
                fVar.h(12, this.f33482r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f33483s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f33484t);
            }
            fVar.g(15, 8, linkedList);
            if (zArr[16]) {
                fVar.e(16, this.f33486v);
            }
            r45.cu5 cu5Var = this.f33487w;
            if (cu5Var != null && zArr[17]) {
                fVar.i(17, cu5Var.computeSize());
                this.f33487w.writeFields(fVar);
            }
            r45.cu5 cu5Var2 = this.f33488x;
            if (cu5Var2 != null && zArr[18]) {
                fVar.i(18, cu5Var2.computeSize());
                this.f33488x.writeFields(fVar);
            }
            if (zArr[19]) {
                fVar.e(19, this.f33489y);
            }
            if (zArr[20]) {
                fVar.e(20, this.f33490z);
            }
            fVar.g(21, 8, this.A);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f33471d;
            if (str5 != null && zArr[1]) {
                i18 = b36.f.j(1, str5) + 0;
            }
            java.lang.String str6 = this.f33472e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f33473f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f33474g);
            }
            java.lang.String str7 = this.f33475h;
            if (str7 != null && zArr[5]) {
                i18 += b36.f.j(5, str7);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f33476i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f33477m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f33478n);
            }
            java.lang.String str8 = this.f33479o;
            if (str8 != null && zArr[9]) {
                i18 += b36.f.j(9, str8);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f33480p);
            }
            if (zArr[11]) {
                i18 += b36.f.h(11, this.f33481q);
            }
            if (zArr[12]) {
                i18 += b36.f.h(12, this.f33482r);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f33483s);
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f33484t);
            }
            int g17 = i18 + b36.f.g(15, 8, linkedList);
            if (zArr[16]) {
                g17 += b36.f.e(16, this.f33486v);
            }
            r45.cu5 cu5Var3 = this.f33487w;
            if (cu5Var3 != null && zArr[17]) {
                g17 += b36.f.i(17, cu5Var3.computeSize());
            }
            r45.cu5 cu5Var4 = this.f33488x;
            if (cu5Var4 != null && zArr[18]) {
                g17 += b36.f.i(18, cu5Var4.computeSize());
            }
            if (zArr[19]) {
                g17 += b36.f.e(19, this.f33489y);
            }
            if (zArr[20]) {
                g17 += b36.f.e(20, this.f33490z);
            }
            return g17 + b36.f.g(21, 8, this.A);
        }
        if (i17 == 2) {
            linkedList.clear();
            this.A.clear();
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
                this.f33471d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f33472e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f33473f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f33474g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f33475h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f33476i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f33477m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f33478n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f33479o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f33480p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f33481q = aVar2.i(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f33482r = aVar2.i(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f33483s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f33484t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.xj0 xj0Var = new bw5.xj0();
                    if (bArr != null && bArr.length > 0) {
                        xj0Var.parseFrom(bArr);
                    }
                    linkedList.add(xj0Var);
                }
                zArr[15] = true;
                return 0;
            case 16:
                this.f33486v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var5.b(bArr2);
                    }
                    this.f33487w = cu5Var5;
                }
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var6.b(bArr3);
                    }
                    this.f33488x = cu5Var6;
                }
                zArr[18] = true;
                return 0;
            case 19:
                this.f33489y = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f33490z = aVar2.g(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.sj0 sj0Var = new bw5.sj0();
                    if (bArr4 != null && bArr4.length > 0) {
                        sj0Var.parseFrom(bArr4);
                    }
                    this.A.add(sj0Var);
                }
                zArr[21] = true;
                return 0;
            default:
                return -1;
        }
    }
}

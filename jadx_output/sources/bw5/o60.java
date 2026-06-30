package bw5;

/* loaded from: classes2.dex */
public class o60 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f30989d;

    /* renamed from: e, reason: collision with root package name */
    public int f30990e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f30991f;

    /* renamed from: h, reason: collision with root package name */
    public bw5.l60 f30993h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f30994i;

    /* renamed from: m, reason: collision with root package name */
    public int f30995m;

    /* renamed from: n, reason: collision with root package name */
    public int f30996n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f30997o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f30998p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.p60 f30999q;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f30992g = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f31000r = new boolean[12];

    static {
        new bw5.o60();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.o60 parseFrom(byte[] bArr) {
        return (bw5.o60) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.o60)) {
            return false;
        }
        bw5.o60 o60Var = (bw5.o60) fVar;
        return n51.f.a(this.f30989d, o60Var.f30989d) && n51.f.a(java.lang.Integer.valueOf(this.f30990e), java.lang.Integer.valueOf(o60Var.f30990e)) && n51.f.a(this.f30991f, o60Var.f30991f) && n51.f.a(this.f30992g, o60Var.f30992g) && n51.f.a(this.f30993h, o60Var.f30993h) && n51.f.a(java.lang.Boolean.valueOf(this.f30994i), java.lang.Boolean.valueOf(o60Var.f30994i)) && n51.f.a(java.lang.Integer.valueOf(this.f30995m), java.lang.Integer.valueOf(o60Var.f30995m)) && n51.f.a(java.lang.Integer.valueOf(this.f30996n), java.lang.Integer.valueOf(o60Var.f30996n)) && n51.f.a(this.f30997o, o60Var.f30997o) && n51.f.a(java.lang.Boolean.valueOf(this.f30998p), java.lang.Boolean.valueOf(o60Var.f30998p)) && n51.f.a(this.f30999q, o60Var.f30999q);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.o60();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f30992g;
        boolean[] zArr = this.f31000r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f30989d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f30990e);
            }
            java.lang.String str2 = this.f30991f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            fVar.g(4, 8, linkedList);
            bw5.l60 l60Var = this.f30993h;
            if (l60Var != null && zArr[5]) {
                fVar.i(5, l60Var.computeSize());
                this.f30993h.writeFields(fVar);
            }
            if (zArr[6]) {
                fVar.a(6, this.f30994i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f30995m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f30996n);
            }
            java.lang.String str3 = this.f30997o;
            if (str3 != null && zArr[9]) {
                fVar.j(9, str3);
            }
            if (zArr[10]) {
                fVar.a(10, this.f30998p);
            }
            bw5.p60 p60Var = this.f30999q;
            if (p60Var == null || !zArr[11]) {
                return 0;
            }
            fVar.i(11, p60Var.computeSize());
            this.f30999q.writeFields(fVar);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f30989d;
            int j17 = (str4 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str4);
            if (zArr[2]) {
                j17 += b36.f.e(2, this.f30990e);
            }
            java.lang.String str5 = this.f30991f;
            if (str5 != null && zArr[3]) {
                j17 += b36.f.j(3, str5);
            }
            int g17 = j17 + b36.f.g(4, 8, linkedList);
            bw5.l60 l60Var2 = this.f30993h;
            if (l60Var2 != null && zArr[5]) {
                g17 += b36.f.i(5, l60Var2.computeSize());
            }
            if (zArr[6]) {
                g17 += b36.f.a(6, this.f30994i);
            }
            if (zArr[7]) {
                g17 += b36.f.e(7, this.f30995m);
            }
            if (zArr[8]) {
                g17 += b36.f.e(8, this.f30996n);
            }
            java.lang.String str6 = this.f30997o;
            if (str6 != null && zArr[9]) {
                g17 += b36.f.j(9, str6);
            }
            if (zArr[10]) {
                g17 += b36.f.a(10, this.f30998p);
            }
            bw5.p60 p60Var2 = this.f30999q;
            return (p60Var2 == null || !zArr[11]) ? g17 : g17 + b36.f.i(11, p60Var2.computeSize());
        }
        if (i17 == 2) {
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
                this.f30989d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30990e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30991f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.l60 l60Var3 = new bw5.l60();
                    if (bArr != null && bArr.length > 0) {
                        l60Var3.parseFrom(bArr);
                    }
                    linkedList.add(l60Var3);
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    bw5.l60 l60Var4 = new bw5.l60();
                    if (bArr2 != null && bArr2.length > 0) {
                        l60Var4.parseFrom(bArr2);
                    }
                    this.f30993h = l60Var4;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f30994i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f30995m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f30996n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f30997o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f30998p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    bw5.p60 p60Var3 = new bw5.p60();
                    if (bArr3 != null && bArr3.length > 0) {
                        p60Var3.parseFrom(bArr3);
                    }
                    this.f30999q = p60Var3;
                }
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}

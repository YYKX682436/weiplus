package bw5;

/* loaded from: classes2.dex */
public class xb0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f35044d;

    /* renamed from: e, reason: collision with root package name */
    public int f35045e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f35046f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f35047g;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f35050m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.yb0 f35051n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f35052o;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f35048h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f35049i = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f35053p = new boolean[10];

    static {
        new bw5.xb0();
    }

    public java.lang.String b() {
        return this.f35053p[1] ? this.f35044d : "";
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.xb0 parseFrom(byte[] bArr) {
        return (bw5.xb0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.xb0)) {
            return false;
        }
        bw5.xb0 xb0Var = (bw5.xb0) fVar;
        return n51.f.a(this.f35044d, xb0Var.f35044d) && n51.f.a(java.lang.Integer.valueOf(this.f35045e), java.lang.Integer.valueOf(xb0Var.f35045e)) && n51.f.a(this.f35046f, xb0Var.f35046f) && n51.f.a(this.f35047g, xb0Var.f35047g) && n51.f.a(this.f35048h, xb0Var.f35048h) && n51.f.a(this.f35049i, xb0Var.f35049i) && n51.f.a(this.f35050m, xb0Var.f35050m) && n51.f.a(this.f35051n, xb0Var.f35051n) && n51.f.a(this.f35052o, xb0Var.f35052o);
    }

    public java.lang.String getTitle() {
        return this.f35053p[3] ? this.f35046f : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.xb0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f35049i;
        java.util.LinkedList linkedList2 = this.f35048h;
        int i18 = 0;
        boolean[] zArr = this.f35053p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f35044d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f35045e);
            }
            java.lang.String str2 = this.f35046f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f35047g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            fVar.g(5, 8, linkedList2);
            fVar.g(6, 8, linkedList);
            java.lang.String str4 = this.f35050m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            bw5.yb0 yb0Var = this.f35051n;
            if (yb0Var != null && zArr[8]) {
                fVar.i(8, yb0Var.computeSize());
                this.f35051n.writeFields(fVar);
            }
            java.lang.String str5 = this.f35052o;
            if (str5 != null && zArr[9]) {
                fVar.j(9, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f35044d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f35045e);
            }
            java.lang.String str7 = this.f35046f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f35047g;
            if (str8 != null && zArr[4]) {
                i18 += b36.f.j(4, str8);
            }
            int g17 = i18 + b36.f.g(5, 8, linkedList2) + b36.f.g(6, 8, linkedList);
            java.lang.String str9 = this.f35050m;
            if (str9 != null && zArr[7]) {
                g17 += b36.f.j(7, str9);
            }
            bw5.yb0 yb0Var2 = this.f35051n;
            if (yb0Var2 != null && zArr[8]) {
                g17 += b36.f.i(8, yb0Var2.computeSize());
            }
            java.lang.String str10 = this.f35052o;
            return (str10 == null || !zArr[9]) ? g17 : g17 + b36.f.j(9, str10);
        }
        if (i17 == 2) {
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
                this.f35044d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f35045e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f35046f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f35047g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.mc0 mc0Var = new bw5.mc0();
                    if (bArr != null && bArr.length > 0) {
                        mc0Var.parseFrom(bArr);
                    }
                    linkedList2.add(mc0Var);
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.g60 g60Var = new bw5.g60();
                    if (bArr2 != null && bArr2.length > 0) {
                        g60Var.parseFrom(bArr2);
                    }
                    linkedList.add(g60Var);
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f35050m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.yb0 yb0Var3 = new bw5.yb0();
                    if (bArr3 != null && bArr3.length > 0) {
                        yb0Var3.parseFrom(bArr3);
                    }
                    this.f35051n = yb0Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f35052o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}

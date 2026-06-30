package bw5;

/* loaded from: classes2.dex */
public class xc0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f35058d;

    /* renamed from: f, reason: collision with root package name */
    public int f35060f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f35061g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.dd0 f35062h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.yc0 f35063i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.dd0 f35064m;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f35059e = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f35065n = new boolean[8];

    static {
        new bw5.xc0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.xc0 parseFrom(byte[] bArr) {
        return (bw5.xc0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.xc0)) {
            return false;
        }
        bw5.xc0 xc0Var = (bw5.xc0) fVar;
        return n51.f.a(this.f35058d, xc0Var.f35058d) && n51.f.a(this.f35059e, xc0Var.f35059e) && n51.f.a(java.lang.Integer.valueOf(this.f35060f), java.lang.Integer.valueOf(xc0Var.f35060f)) && n51.f.a(this.f35061g, xc0Var.f35061g) && n51.f.a(this.f35062h, xc0Var.f35062h) && n51.f.a(this.f35063i, xc0Var.f35063i) && n51.f.a(this.f35064m, xc0Var.f35064m);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.xc0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f35059e;
        int i18 = 0;
        boolean[] zArr = this.f35065n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f35058d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            if (zArr[3]) {
                fVar.e(3, this.f35060f);
            }
            java.lang.String str2 = this.f35061g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            bw5.dd0 dd0Var = this.f35062h;
            if (dd0Var != null && zArr[5]) {
                fVar.i(5, dd0Var.computeSize());
                this.f35062h.writeFields(fVar);
            }
            bw5.yc0 yc0Var = this.f35063i;
            if (yc0Var != null && zArr[6]) {
                fVar.i(6, yc0Var.computeSize());
                this.f35063i.writeFields(fVar);
            }
            bw5.dd0 dd0Var2 = this.f35064m;
            if (dd0Var2 != null && zArr[7]) {
                fVar.i(7, dd0Var2.computeSize());
                this.f35064m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f35058d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            if (zArr[3]) {
                g17 += b36.f.e(3, this.f35060f);
            }
            java.lang.String str4 = this.f35061g;
            if (str4 != null && zArr[4]) {
                g17 += b36.f.j(4, str4);
            }
            bw5.dd0 dd0Var3 = this.f35062h;
            if (dd0Var3 != null && zArr[5]) {
                g17 += b36.f.i(5, dd0Var3.computeSize());
            }
            bw5.yc0 yc0Var2 = this.f35063i;
            if (yc0Var2 != null && zArr[6]) {
                g17 += b36.f.i(6, yc0Var2.computeSize());
            }
            bw5.dd0 dd0Var4 = this.f35064m;
            return (dd0Var4 == null || !zArr[7]) ? g17 : g17 + b36.f.i(7, dd0Var4.computeSize());
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
                this.f35058d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.ed0 ed0Var = new bw5.ed0();
                    if (bArr != null && bArr.length > 0) {
                        ed0Var.parseFrom(bArr);
                    }
                    linkedList.add(ed0Var);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f35060f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f35061g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.dd0 dd0Var5 = new bw5.dd0();
                    if (bArr2 != null && bArr2.length > 0) {
                        dd0Var5.parseFrom(bArr2);
                    }
                    this.f35062h = dd0Var5;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.yc0 yc0Var3 = new bw5.yc0();
                    if (bArr3 != null && bArr3.length > 0) {
                        yc0Var3.parseFrom(bArr3);
                    }
                    this.f35063i = yc0Var3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.dd0 dd0Var6 = new bw5.dd0();
                    if (bArr4 != null && bArr4.length > 0) {
                        dd0Var6.parseFrom(bArr4);
                    }
                    this.f35064m = dd0Var6;
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}

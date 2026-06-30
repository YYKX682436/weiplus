package bw5;

/* loaded from: classes2.dex */
public class f50 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f27157d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27159f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f27160g;

    /* renamed from: h, reason: collision with root package name */
    public int f27161h;

    /* renamed from: i, reason: collision with root package name */
    public int f27162i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f27163m;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f27158e = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f27164n = new boolean[8];

    static {
        new bw5.f50();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.f50 parseFrom(byte[] bArr) {
        return (bw5.f50) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.f50)) {
            return false;
        }
        bw5.f50 f50Var = (bw5.f50) fVar;
        return n51.f.a(this.f27157d, f50Var.f27157d) && n51.f.a(this.f27158e, f50Var.f27158e) && n51.f.a(java.lang.Boolean.valueOf(this.f27159f), java.lang.Boolean.valueOf(f50Var.f27159f)) && n51.f.a(this.f27160g, f50Var.f27160g) && n51.f.a(java.lang.Integer.valueOf(this.f27161h), java.lang.Integer.valueOf(f50Var.f27161h)) && n51.f.a(java.lang.Integer.valueOf(this.f27162i), java.lang.Integer.valueOf(f50Var.f27162i)) && n51.f.a(java.lang.Boolean.valueOf(this.f27163m), java.lang.Boolean.valueOf(f50Var.f27163m));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.f50();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f27158e;
        int i18 = 0;
        boolean[] zArr = this.f27164n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f27157d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            if (zArr[3]) {
                fVar.a(3, this.f27159f);
            }
            com.tencent.mm.protobuf.g gVar = this.f27160g;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f27161h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f27162i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f27163m);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f27157d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            if (zArr[3]) {
                g17 += b36.f.a(3, this.f27159f);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f27160g;
            if (gVar2 != null && zArr[4]) {
                g17 += b36.f.b(4, gVar2);
            }
            if (zArr[5]) {
                g17 += b36.f.e(5, this.f27161h);
            }
            if (zArr[6]) {
                g17 += b36.f.e(6, this.f27162i);
            }
            return zArr[7] ? g17 + b36.f.a(7, this.f27163m) : g17;
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
                this.f27157d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.o50 o50Var = new bw5.o50();
                    if (bArr != null && bArr.length > 0) {
                        o50Var.parseFrom(bArr);
                    }
                    linkedList.add(o50Var);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f27159f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f27160g = aVar2.d(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f27161h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f27162i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f27163m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
